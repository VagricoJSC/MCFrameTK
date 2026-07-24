package mcframe.serverMSLA.MSLAB2440;

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
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverMSLA.MSLAL9310.MSLAL_OrdSendIfService;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SendSchdOrdLnk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SendSchdOrdLnk_MC extends MSLAB_SendSchdOrdLnk_MC_A{
	//FMCB CUSTOM START
	@Override
	protected MCList<? extends MCRow> getSrchDowListClass() {
		return MCList.create(OrdSendIf_Ord_Lnk_Srch01_RsltR.class);
	}

	@Override
	protected MCDBContainer getIFDbc() {
		return MST_ORDSND_ORD_LNK_IF_R.create("ORDSND_ORD_LNK");
	}
	@Override
	protected String getIfProcTyp() {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ORD_LNK.value();
	}

	@Override
	protected String getLogicIdSub() {
		return getLogicID();
	}

	@Override
	protected MSC_NUM_SYS_TYP getIfNumSysTyp() {
		return MSC_NUM_SYS_TYP.ORDERSENDORDLNKIF;
	}

	/**
	 * SendSchdOrdLnk_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用のオーダ引当情報をＩＦテーブルに登録する。<br>
	 */
	public class SendSchdOrdLnk_Upd01 extends MSLAB_SendSchdOrdLnk_MC_A.SendSchdOrdLnk_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected String[] getRequiredColsSub() {
			return getRequiredColsTerm();
		}

		@Override
		protected void writeStartLogSub() {
			FXBAL_BatchLogManager.logger().writeStartLog(MSLAL0923, up0().ext_sys_cd(), up0().wg_cd(), up0().mfg_loc_grp_cd(), 
					up0().site_cd(), up0().mfg_loc_cd(), toYMDString(up0().term_from()), toYMDString(up0().term_to()), up0().if_scheduler_typ());
			super.writeStartLogSub();
		}

		@Override
		protected MCOperation getSrchOpe() {
			return MSLAL_OrdSendIfService.crtOrdSendIf_Ord_Lnk_Srch01();
		}

		@Override
		protected String getRsltLogMsgId() {
			return MSLAL0924;
		}

		@SuppressWarnings("unchecked")
		@Override
		protected MapOrdLnkIf<MST_ORDSND_ORD_LNK_IF_R, OrdSendIf_Ord_Lnk_Srch01_RsltR> getMprSrcToSendIf() {
			return new MapOrdLnkIf<MST_ORDSND_ORD_LNK_IF_R, OrdSendIf_Ord_Lnk_Srch01_RsltR>();
		}

		public class MapOrdLnkIf<D extends MST_ORDSND_ORD_LNK_IF_R, S extends OrdSendIf_Ord_Lnk_Srch01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MCRow.copyall(dest, src.ord_lnk());
				MCNumber dataLno = getSequence(getIfNumSysTyp().value());
				dest.data_lno(dataLno);
				dest.data_no(_dataNo);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(up0().ext_sys_cd());
			}
		}

	}

	//FMCB CUSTOM END
}