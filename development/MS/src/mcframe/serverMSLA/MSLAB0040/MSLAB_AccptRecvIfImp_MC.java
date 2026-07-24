package mcframe.serverMSLA.MSLAB0040;

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
import mcframe.serverMSLA.MSLAL5160.*;
import mcframe.serverMBBE.MBBEL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_AccptRecvIfImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_AccptRecvIfImp_MC extends MSLAB_AccptRecvIfImp_MC_A{
	//FMCB CUSTOM START

	/**
	 * AccptRecvIfImp_Upd01オペレーション.<p>
	 *
	 * 検収受信ＩＦの取込処理を実行する。<br>
	 */
	public class AccptRecvIfImp_Upd01 extends MSLAB_AccptRecvIfImp_MC_A.AccptRecvIfImp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callAccptRecvIf();
		}
		/**
		 * 検収受信ＩＦサービスを呼び出す
		 */
		protected void callAccptRecvIf() {
			MSLAL_AccptRecvIfService.AccptRecvIf_Upd02 o = MSLAL_AccptRecvIfService.crtAccptRecvIf_Upd02();
			o.up0().setAll(getExtSysCdL());
			o.up0().setStringNE(IfDataImp_Upd01_DtlR.$bp_cd, up0().cst_cd());	
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
			if (lst.isEmpty()) {
				lst.add();
			}
			return lst.groupBy(IfDataImp_Upd01_DtlR.$ext_sys_cd);
		}
		protected String[] getExtSysCdArr() {
			return new String[] {
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd1,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd2,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd3,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd4,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd5,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd6,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd7,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd8,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd9,
				AccptRecvIfImp_Upd01_CndR.$ext_sys_cd10
			};
		}
	}

	//FMCB CUSTOM END
}