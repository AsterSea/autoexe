package neu.lab.autoexe.decca;

import neu.lab.autoexe.entrance.AutoExeEntrance;

public class AutoDebug2 extends AutoDecca{

	public String getBatPath() {
		return "D:\\ws\\debug2.bat";
	}

	public String getCommand() {
		return "mvn -Dmaven.test.skip=true package neu.lab:decca:1.0:debug2 -e";
	}

	@Override
	protected String getStateDir() {
		return "D:\\ws_testcase\\image\\state_debug2\\";
	}

	@Override
	protected String getProjectDir() {
		return AutoExeEntrance.debug2Dir;
	}

}