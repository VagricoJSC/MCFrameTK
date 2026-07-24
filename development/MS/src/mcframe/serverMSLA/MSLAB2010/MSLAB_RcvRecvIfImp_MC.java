package mcframe.serverMSLA.MSLAB2010;

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
import mcframe.serverMSLA.MSLAL9010.*;
import mcframe.serverMBBE.MBBEL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_RcvRecvIfImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_RcvRecvIfImp_MC extends MSLAB_RcvRecvIfImp_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * RcvRecvIfImp_Upd01オペレーション.<p>
	 *
	 * 入金受信ＩＦの取込処理を実行する。<br>
	 */
	public class RcvRecvIfImp_Upd01 extends MSLAB_RcvRecvIfImp_MC_A.RcvRecvIfImp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callRcvRecvIf();
		}
		/**
		 * 入金受信ＩＦサービスを呼び出す
		 */
		protected void callRcvRecvIf() {
			MSLAL_RcvRecvIfService.RcvRecvIf_Upd02 o = MSLAL_RcvRecvIfService.crtRcvRecvIf_Upd02();
			o.up0().setAll(getExtSysCdL());
			o.exec();
		}
		
		protected MCList<IfDataImp_Upd01_DtlR> getExtSysCdL() {
			MCList<IfDataImp_Upd01_DtlR> lst = MCList.create(IfDataImp_Upd01_DtlR.class);
			
			for (String col : getExtSysCdRcv()) {
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
		
		protected String[] getExtSysCdRcv() {
			return new String[] {
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd1,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd2,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd3,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd4,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd5,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd6,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd7,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd8,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd9,
				RcvRecvIfImp_Upd01_CndR.$ext_sys_cd10
			};
		}
	}

	//FMCB CUSTOM END
}