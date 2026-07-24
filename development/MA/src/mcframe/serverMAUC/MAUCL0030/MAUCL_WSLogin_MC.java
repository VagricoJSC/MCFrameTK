package mcframe.serverMAUC.MAUCL0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.event.MCWSLoginListener;
import mcframe.serverCore.event.MCWSLogoutListener;
import mcframe.serverCore.login.ExtAttrR;
import mcframe.serverCore.login.AppDataR;
import mcframe.serverCore.sys.MCSys;

import mcframe.serverMAUC.MAUCL0030.MAUCL_Dac;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

public class MAUCL_WSLogin_MC implements MCWSLoginListener, MCWSLogoutListener {

	@Override
	public String getModuleID() {
		return "MA";
	}

	@Override
	public void doNLIEvent(ExtAttrR extAttrR, MCList<AppDataR> appDataL) {
		try {
			setDelFlgCtl(false);
			
			MAUCL_Dac.Srch01 srch01 = MAUCL_Dac.crtSrch01();
			srch01.up0().usr_cd(MCSys.user.ID());
			srch01.exec();

			MAUCL_Dac.Srch02 srch02 = MAUCL_Dac.crtSrch02();
			srch02.up0().usr_cd(MCSys.user.ID());
			srch02.exec();

			MAUCL_Dac.Srch03 srch03 = MAUCL_Dac.crtSrch03();
			srch03.up0().usr_cd(MCSys.user.ID());
			srch03.exec();

			MAUCL_Dac.Srch04 srch04 = MAUCL_Dac.crtSrch04();
			srch04.up0().usr_cd(MCSys.user.ID());
			srch04.exec();

			MAUCL_Dac.Srch05 srch05 = MAUCL_Dac.crtSrch05();
			srch05.up0().usr_cd(MCSys.user.ID());
			srch05.exec();
		}
		finally {
			setDelFlgCtl(true);
		}
	}

	protected void setDelFlgCtl(boolean isDelFlgCtl) {
		MCRow r = MCRow.create();
		r.addStringColumn("del_flg_ctl", toFalseStr(isDelFlgCtl));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId("MAUCL0030", procid, "MAUCL_WSLogin_setDelFlgCtl")
				, procid, r, ":del_flg_ctl");
	}

	@Override
	public void doNLOEvent() {
		MAUCL_Dac.Del01 del01 = MAUCL_Dac.crtDel01();
		del01.exec();

		MAUCL_Dac.Del02 del02 = MAUCL_Dac.crtDel02();
		del02.exec();

		MAUCL_Dac.Del03 del03 = MAUCL_Dac.crtDel03();
		del03.exec();

		MAUCL_Dac.Del04 del04 = MAUCL_Dac.crtDel04();
		del04.exec();

		MAUCL_Dac.Del05 del05 = MAUCL_Dac.crtDel05();
		del05.exec();
	}

}