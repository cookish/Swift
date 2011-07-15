package org.griphyn.vdl.karajan.lib.swiftscript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.globus.cog.karajan.arguments.Arg;
import org.globus.cog.karajan.stack.VariableStack;
import org.globus.cog.karajan.workflow.ExecutionException;
import org.globus.cog.karajan.workflow.futures.FutureNotYetAvailable;
import org.griphyn.vdl.karajan.lib.VDLFunction;
import org.griphyn.vdl.mapping.DSHandle;
import org.griphyn.vdl.mapping.HandleOpenException;
import org.griphyn.vdl.mapping.RootDataNode;
import org.griphyn.vdl.type.Types;


public class ExtractInt extends VDLFunction {
	static {
		setArguments(ExtractInt.class, new Arg[] { PA_VAR });
	}

	public Object function(VariableStack stack) throws ExecutionException, HandleOpenException {
		DSHandle handle = null;
		try {
			handle = (DSHandle) PA_VAR.getValue(stack);
			synchronized(handle.getRoot()) {
				if (!handle.isClosed()) {
					throw new FutureNotYetAvailable(addFutureListener(stack, handle));
				}
				String fn = argList(filename(handle), true);
				Reader freader = new FileReader(fn);
				BufferedReader breader = new BufferedReader(freader);
				String str = breader.readLine();
				freader.close();
				Double i = new Double(str);
				DSHandle result = RootDataNode.newNode(Types.FLOAT, i);
				int provid = VDLFunction.nextProvenanceID();
				VDLFunction.logProvenanceResult(provid, result, "extractint");
				VDLFunction.logProvenanceParameter(provid, handle, "filename");
				return result;
			}
		}
		catch (IOException ioe) {
			throw new ExecutionException("Reading integer content of file", ioe);
		}
	}
}
