package mcframe.serverMSLA.MSLAB1320;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBE.MBBEL5010.*;
import mcframe.serverMSLA.MSLAL6320.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SCMActRecvIfLumpImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SCMActRecvIfLumpImp_MC extends MSLAB_SCMActRecvIfLumpImp_MC_A{
	//FMCB CUSTOM START

	/**
	 * SCMActRecvIfLumpImp_Upd01オペレーション.<p>
	 *
	 * ＳＣＭ実績受信ＩＦ一括取込処理を実行する。<br>
	 */
	public class SCMActRecvIfLumpImp_Upd01 extends MSLAB_SCMActRecvIfLumpImp_MC_A.SCMActRecvIfLumpImp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callScmActRecvIf();
		}
		/**
		 * ＳＣＭ実績受信ＩＦサービスを呼び出す
		 */
		protected void callScmActRecvIf() {
			MSLAL_SCMActRecvIfService.SCMActRecvIf_Upd01 o = MSLAL_SCMActRecvIfService.crtSCMActRecvIf_Upd01();
			o.up0().setAll(getExtSysCdL());
			o.up1().exe_unit_lump_flg(up0().exe_unit_lump_flg());
			o.up1().if_upd_typ(up0().if_upd_typ());
			o.exec();
		}
		protected MCList<IfDataImp_Upd01_DtlR> getExtSysCdL() {
			MCList<IfDataImp_Upd01_DtlR> lst = MCList.create(IfDataImp_Upd01_DtlR.class);
			for (String col : getExtSysCdArr()) {
				String val = up0().getString(col);
				if (!isNull(val)) {
					lst.add().ext_sys_cd(val);
				}
			}
			return lst.groupBy(IfDataImp_Upd01_DtlR.$ext_sys_cd);
		}
		protected String[] getExtSysCdArr() {
			return new String[] {
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd1,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd2,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd3,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd4,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd5,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd6,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd7,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd8,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd9,
				SCMActRecvIfLumpImp_Upd01_CndR.$ext_sys_cd10
			};
		}
	}

	//FMCB CUSTOM END
}