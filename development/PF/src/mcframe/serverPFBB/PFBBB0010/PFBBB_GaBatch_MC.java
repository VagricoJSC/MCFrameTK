package mcframe.serverPFBB.PFBBB0010;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBB.PFBBL6000.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBB_GaBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBB_GaBatch_MC extends PFBBB_GaBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * ＧＡのAPIを呼び出し、受信変換処理を実行する。<br>
	 */
	public class Recv_Upd01 extends PFBBB_GaBatch_MC_A.Recv_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callGaRecvServ();
		}

		/** ＧＡ受信連携サービスを呼び出す */
		protected void callGaRecvServ() {
			PFBBL_GaService.Recv_Upd01 ope = PFBBL_GaService.crtRecv_Upd01();
			copy(ope.up0(), up0(), createMap_Recv_DtlR_GaBatch_DtlR());
			ope.exec();
		}

		protected Map_Recv_DtlR_GaBatch_DtlR<Recv_DtlR, GaBatch_DtlR> createMap_Recv_DtlR_GaBatch_DtlR() {
			return new Map_Recv_DtlR_GaBatch_DtlR<Recv_DtlR, GaBatch_DtlR>();
		}

		public class Map_Recv_DtlR_GaBatch_DtlR<D extends Recv_DtlR, S extends GaBatch_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Recv_DtlR.$if_proc_typ, GaBatch_DtlR.$if_proc_typ);
				addColumnPathMap(Recv_DtlR.$ext_sys_cd, GaBatch_DtlR.$ext_sys_cd);
				addColumnPathMap(Recv_DtlR.$tgt_dt_fr, GaBatch_DtlR.$tgt_dt_fr);
				addColumnPathMap(Recv_DtlR.$tgt_dt_to, GaBatch_DtlR.$tgt_dt_to);
				addColumnPathMap(Recv_DtlR.$calc_ctg_cd, GaBatch_DtlR.$calc_ctg_cd);
				addColumnPathMap(Recv_DtlR.$budgetcode, GaBatch_DtlR.$budgetcode);
			}
		}

	}

	//FMCB CUSTOM END
}