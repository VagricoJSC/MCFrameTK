package mcframe.serverPFBA.PFBAL5810;

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
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.commonPFBA.PFBAR5810.*;
import mcframe.commonPFBA.PFBAR5820.PFBAR_SapJournalUploadPrnt;
import mcframe.serverPFBA.PFBAL5820.service.PFBAL_JournalEntryPostBase;
import mcframe.serverCore.resource.MCConst;
import java.nio.charset.Charset;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_SapJournalSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_SapJournalSendConvService_MC extends PFBAL_SapJournalSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SapJournalSendConvService_Conv01オペレーション.<p>
	 *
	 */
	public class SapJournalSendConvService_Conv01 extends PFBAL_SapJournalSendConvService_MC_A.SapJournalSendConvService_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MBT_JOURNAL_SND_IF_R.class);
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("project_cd", MAC_IF_COL_TYP.PROJ);
			_ifDBC.addCnvCol("summary_cd0", MAC_IF_COL_TYP.SUM0);
			_ifDBC.addCnvCol("summary_cd1", MAC_IF_COL_TYP.SUM1);
			_ifDBC.addCnvCol("summary_cd2", MAC_IF_COL_TYP.SUM2);
			_ifDBC.addCnvCol("summary_cd3", MAC_IF_COL_TYP.SUM3);
			_ifDBC.addCnvCol("summary_cd4", MAC_IF_COL_TYP.SUM4);
			_ifDBC.addCnvCol("summary_cd5", MAC_IF_COL_TYP.SUM5);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("base_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("ptax_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("sttl_cd", MAC_IF_COL_TYP.STTL_MTD);
			_ifDBC.addCnvCol("bank_ac_cd", MAC_IF_COL_TYP.BANK_AC);
			_ifDBC.addCnvCol("bank_cd", MAC_IF_COL_TYP.BANK);
			_ifDBC.addCnvCol("other_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}
	}
	/**
	 * SapJournalSendConvService_Conv02オペレーション.<p>
	 *
	 */
	public class SapJournalSendConvService_Conv02 extends PFBAL_SapJournalSendConvService_MC_A.SapJournalSendConvService_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(
					DtlR.class, MBT_JOURNAL_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBAR_SapJournalPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_JOURNAL_SND_IF_R());
		}

		public class DtlR_MBT_JOURNAL_SND_IF_R<D extends DtlR, S extends MBT_JOURNAL_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$co_cd, MBT_JOURNAL_SND_IF_R.$if_co_cd);
				addColumnPathMap(DtlR.$jnl_grp_no, MBT_JOURNAL_SND_IF_R.$jnl_grp_no);
				addColumnPathMap(DtlR.$ac_ym, MBT_JOURNAL_SND_IF_R.$ac_ym);
				addColumnPathMap(DtlR.$ac_if_typ, MBT_JOURNAL_SND_IF_R.$ac_if_typ);
				addColumnPathMap(DtlR.$slip_cnt_id, MBT_JOURNAL_SND_IF_R.$slip_cnt_id);
				addColumnPathMap(DtlR.$jnl_no, MBT_JOURNAL_SND_IF_R.$jnl_no);
				addColumnPathMap(DtlR.$jnl_no_seq, MBT_JOURNAL_SND_IF_R.$jnl_no_seq);
				addColumnPathMap(DtlR.$dc_typ, MBT_JOURNAL_SND_IF_R.$dc_typ);
				addColumnPathMap(DtlR.$ac_slip_dt, MBT_JOURNAL_SND_IF_R.$ac_slip_dt);
				addColumnPathMap(DtlR.$ac_dt, MBT_JOURNAL_SND_IF_R.$ac_dt);
				addColumnPathMap(DtlR.$slip_no, MBT_JOURNAL_SND_IF_R.$slip_no);
				addColumnPathMap(DtlR.$slip_seq_no, MBT_JOURNAL_SND_IF_R.$slip_seq_no);
				addColumnPathMap(DtlR.$dpt_cd, MBT_JOURNAL_SND_IF_R.$if_dpt_cd);
				addColumnPathMap(DtlR.$ac_cd, MBT_JOURNAL_SND_IF_R.$ac_cd);
				addColumnPathMap(DtlR.$sub_ac_cd, MBT_JOURNAL_SND_IF_R.$sub_ac_cd);
				addColumnPathMap(DtlR.$project_cd, MBT_JOURNAL_SND_IF_R.$if_project_cd);
				addColumnPathMap(DtlR.$summary_cd0, MBT_JOURNAL_SND_IF_R.$if_summary_cd0);
				addColumnPathMap(DtlR.$summary_cd1, MBT_JOURNAL_SND_IF_R.$if_summary_cd1);
				addColumnPathMap(DtlR.$summary_cd2, MBT_JOURNAL_SND_IF_R.$if_summary_cd2);
				addColumnPathMap(DtlR.$summary_cd3, MBT_JOURNAL_SND_IF_R.$if_summary_cd3);
				addColumnPathMap(DtlR.$summary_cd4, MBT_JOURNAL_SND_IF_R.$if_summary_cd4);
				addColumnPathMap(DtlR.$summary_cd5, MBT_JOURNAL_SND_IF_R.$if_summary_cd5);
				addColumnPathMap(DtlR.$itm_cd, MBT_JOURNAL_SND_IF_R.$if_itm_cd);
				addColumnPathMap(DtlR.$itm_sub1, MBT_JOURNAL_SND_IF_R.$if_itm_sub1);
				addColumnPathMap(DtlR.$itm_sub2, MBT_JOURNAL_SND_IF_R.$if_itm_sub2);
				addColumnPathMap(DtlR.$itm_sub3, MBT_JOURNAL_SND_IF_R.$if_itm_sub3);
				addColumnPathMap(DtlR.$itm_nm, MBT_JOURNAL_SND_IF_R.$itm_nm);
				addColumnPathMap(DtlR.$bp_typ, MBT_JOURNAL_SND_IF_R.$bp_typ);
				addColumnPathMap(DtlR.$bp_cd, MBT_JOURNAL_SND_IF_R.$if_bp_cd);
				addColumnPathMap(DtlR.$base_unit_qty, MBT_JOURNAL_SND_IF_R.$base_unit_qty);
				addColumnPathMap(DtlR.$base_unit_cd, MBT_JOURNAL_SND_IF_R.$if_base_unit_cd);
				addColumnPathMap(DtlR.$base_cur_upri, MBT_JOURNAL_SND_IF_R.$base_cur_upri);
				addColumnPathMap(DtlR.$base_cur_sum_amt, MBT_JOURNAL_SND_IF_R.$base_cur_sum_amt);
				addColumnPathMap(DtlR.$base_cur_amt, MBT_JOURNAL_SND_IF_R.$base_cur_amt);
				addColumnPathMap(DtlR.$base_cur_tax_amt, MBT_JOURNAL_SND_IF_R.$base_cur_tax_amt);
				addColumnPathMap(DtlR.$base_cur_tax_base_amt, MBT_JOURNAL_SND_IF_R.$base_cur_tax_base_amt);
				addColumnPathMap(DtlR.$base_cur_cd, MBT_JOURNAL_SND_IF_R.$if_base_cur_cd);
				addColumnPathMap(DtlR.$trd_cur_upri, MBT_JOURNAL_SND_IF_R.$trd_cur_upri);
				addColumnPathMap(DtlR.$trd_cur_sum_amt, MBT_JOURNAL_SND_IF_R.$trd_cur_sum_amt);
				addColumnPathMap(DtlR.$trd_cur_amt, MBT_JOURNAL_SND_IF_R.$trd_cur_amt);
				addColumnPathMap(DtlR.$trd_cur_tax_amt, MBT_JOURNAL_SND_IF_R.$trd_cur_tax_amt);
				addColumnPathMap(DtlR.$trd_cur_tax_base_amt, MBT_JOURNAL_SND_IF_R.$trd_cur_tax_base_amt);
				addColumnPathMap(DtlR.$trd_cur_cd, MBT_JOURNAL_SND_IF_R.$if_trd_cur_cd);
				addColumnPathMap(DtlR.$ptax_cur_upri, MBT_JOURNAL_SND_IF_R.$ptax_cur_upri);
				addColumnPathMap(DtlR.$ptax_cur_sum_amt, MBT_JOURNAL_SND_IF_R.$ptax_cur_sum_amt);
				addColumnPathMap(DtlR.$ptax_cur_amt, MBT_JOURNAL_SND_IF_R.$ptax_cur_amt);
				addColumnPathMap(DtlR.$ptax_cur_tax_amt, MBT_JOURNAL_SND_IF_R.$ptax_cur_tax_amt);
				addColumnPathMap(DtlR.$ptax_cur_tax_base_amt, MBT_JOURNAL_SND_IF_R.$ptax_cur_tax_base_amt);
				addColumnPathMap(DtlR.$ptax_cur_cd, MBT_JOURNAL_SND_IF_R.$if_ptax_cur_cd);
				addColumnPathMap(DtlR.$tax_typ, MBT_JOURNAL_SND_IF_R.$tax_typ);
				addColumnPathMap(DtlR.$tax_cd, MBT_JOURNAL_SND_IF_R.$tax_cd);
				addColumnPathMap(DtlR.$foreign_flg, MBT_JOURNAL_SND_IF_R.$foreign_flg);
				addColumnPathMap(DtlR.$xrate, MBT_JOURNAL_SND_IF_R.$xrate);
				addColumnPathMap(DtlR.$xrate_cd, MBT_JOURNAL_SND_IF_R.$xrate_cd);
				addColumnPathMap(DtlR.$ptax_xrate, MBT_JOURNAL_SND_IF_R.$ptax_xrate);
				addColumnPathMap(DtlR.$ptax_xrate_cd, MBT_JOURNAL_SND_IF_R.$ptax_xrate_cd);
				addColumnPathMap(DtlR.$iv_no, MBT_JOURNAL_SND_IF_R.$iv_no);
				addColumnPathMap(DtlR.$bill_no, MBT_JOURNAL_SND_IF_R.$bill_no);
				addColumnPathMap(DtlR.$slo_no, MBT_JOURNAL_SND_IF_R.$slo_no);
				addColumnPathMap(DtlR.$po_no, MBT_JOURNAL_SND_IF_R.$po_no);
				addColumnPathMap(DtlR.$usr_cd, MBT_JOURNAL_SND_IF_R.$if_usr_cd);
				addColumnPathMap(DtlR.$cls_jnl_typ, MBT_JOURNAL_SND_IF_R.$cls_jnl_typ);
				addColumnPathMap(DtlR.$alloc_jnl_flg, MBT_JOURNAL_SND_IF_R.$alloc_jnl_flg);
				addColumnPathMap(DtlR.$spot_flg, MBT_JOURNAL_SND_IF_R.$spot_flg);
				addColumnPathMap(DtlR.$sttl_schd_dt, MBT_JOURNAL_SND_IF_R.$sttl_schd_dt);
				addColumnPathMap(DtlR.$sttl_cd, MBT_JOURNAL_SND_IF_R.$if_sttl_cd);
				addColumnPathMap(DtlR.$bank_ac_cd, MBT_JOURNAL_SND_IF_R.$if_bank_ac_cd);
				addColumnPathMap(DtlR.$bank_cd, MBT_JOURNAL_SND_IF_R.$if_bank_cd);
				addColumnPathMap(DtlR.$other_ac_cd, MBT_JOURNAL_SND_IF_R.$other_ac_cd);
				addColumnPathMap(DtlR.$other_sub_ac_cd, MBT_JOURNAL_SND_IF_R.$other_sub_ac_cd);
				addColumnPathMap(DtlR.$other_dpt_cd, MBT_JOURNAL_SND_IF_R.$if_other_dpt_cd);
				addColumnPathMap(DtlR.$abstract1, MBT_JOURNAL_SND_IF_R.$abstract1);
				addColumnPathMap(DtlR.$abstract2, MBT_JOURNAL_SND_IF_R.$abstract2);
				addColumnPathMap(DtlR.$sub_char1, MBT_JOURNAL_SND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MBT_JOURNAL_SND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MBT_JOURNAL_SND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MBT_JOURNAL_SND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MBT_JOURNAL_SND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MBT_JOURNAL_SND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MBT_JOURNAL_SND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MBT_JOURNAL_SND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MBT_JOURNAL_SND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MBT_JOURNAL_SND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_num1, MBT_JOURNAL_SND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MBT_JOURNAL_SND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MBT_JOURNAL_SND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_dt1, MBT_JOURNAL_SND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MBT_JOURNAL_SND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MBT_JOURNAL_SND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$if_sub_char1, MBT_JOURNAL_SND_IF_R.$if_sub_char1);
				addColumnPathMap(DtlR.$if_sub_char2, MBT_JOURNAL_SND_IF_R.$if_sub_char2);
				addColumnPathMap(DtlR.$if_sub_char3, MBT_JOURNAL_SND_IF_R.$if_sub_char3);
				addColumnPathMap(DtlR.$if_sub_char4, MBT_JOURNAL_SND_IF_R.$if_sub_char4);
				addColumnPathMap(DtlR.$if_sub_char5, MBT_JOURNAL_SND_IF_R.$if_sub_char5);
				addColumnPathMap(DtlR.$if_sub_char6, MBT_JOURNAL_SND_IF_R.$if_sub_char6);
				addColumnPathMap(DtlR.$if_sub_char7, MBT_JOURNAL_SND_IF_R.$if_sub_char7);
				addColumnPathMap(DtlR.$if_sub_char8, MBT_JOURNAL_SND_IF_R.$if_sub_char8);
				addColumnPathMap(DtlR.$if_sub_char9, MBT_JOURNAL_SND_IF_R.$if_sub_char9);
				addColumnPathMap(DtlR.$if_sub_char10, MBT_JOURNAL_SND_IF_R.$if_sub_char10);
				addColumnPathMap(DtlR.$if_sub_char11, MBT_JOURNAL_SND_IF_R.$if_sub_char11);
				addColumnPathMap(DtlR.$if_sub_char12, MBT_JOURNAL_SND_IF_R.$if_sub_char12);
				addColumnPathMap(DtlR.$if_sub_char13, MBT_JOURNAL_SND_IF_R.$if_sub_char13);
				addColumnPathMap(DtlR.$if_sub_char14, MBT_JOURNAL_SND_IF_R.$if_sub_char14);
				addColumnPathMap(DtlR.$if_sub_char15, MBT_JOURNAL_SND_IF_R.$if_sub_char15);
				addColumnPathMap(DtlR.$if_sub_char16, MBT_JOURNAL_SND_IF_R.$if_sub_char16);
				addColumnPathMap(DtlR.$if_sub_char17, MBT_JOURNAL_SND_IF_R.$if_sub_char17);
				addColumnPathMap(DtlR.$if_sub_char18, MBT_JOURNAL_SND_IF_R.$if_sub_char18);
				addColumnPathMap(DtlR.$if_sub_char19, MBT_JOURNAL_SND_IF_R.$if_sub_char19);
				addColumnPathMap(DtlR.$if_sub_char20, MBT_JOURNAL_SND_IF_R.$if_sub_char20);
				addColumnPathMap(DtlR.$if_sub_char21, MBT_JOURNAL_SND_IF_R.$if_sub_char21);
				addColumnPathMap(DtlR.$if_sub_char22, MBT_JOURNAL_SND_IF_R.$if_sub_char22);
				addColumnPathMap(DtlR.$if_sub_char23, MBT_JOURNAL_SND_IF_R.$if_sub_char23);
				addColumnPathMap(DtlR.$if_sub_char24, MBT_JOURNAL_SND_IF_R.$if_sub_char24);
				addColumnPathMap(DtlR.$if_sub_char25, MBT_JOURNAL_SND_IF_R.$if_sub_char25);
				addColumnPathMap(DtlR.$if_sub_char26, MBT_JOURNAL_SND_IF_R.$if_sub_char26);
				addColumnPathMap(DtlR.$if_sub_char27, MBT_JOURNAL_SND_IF_R.$if_sub_char27);
				addColumnPathMap(DtlR.$if_sub_char28, MBT_JOURNAL_SND_IF_R.$if_sub_char28);
				addColumnPathMap(DtlR.$if_sub_char29, MBT_JOURNAL_SND_IF_R.$if_sub_char29);
				addColumnPathMap(DtlR.$if_sub_char30, MBT_JOURNAL_SND_IF_R.$if_sub_char30);
				addColumnPathMap(DtlR.$if_sub_num1, MBT_JOURNAL_SND_IF_R.$if_sub_num1);
				addColumnPathMap(DtlR.$if_sub_num2, MBT_JOURNAL_SND_IF_R.$if_sub_num2);
				addColumnPathMap(DtlR.$if_sub_num3, MBT_JOURNAL_SND_IF_R.$if_sub_num3);
				addColumnPathMap(DtlR.$if_sub_num4, MBT_JOURNAL_SND_IF_R.$if_sub_num4);
				addColumnPathMap(DtlR.$if_sub_num5, MBT_JOURNAL_SND_IF_R.$if_sub_num5);
				addColumnPathMap(DtlR.$if_sub_dt1, MBT_JOURNAL_SND_IF_R.$if_sub_dt1);
				addColumnPathMap(DtlR.$if_sub_dt2, MBT_JOURNAL_SND_IF_R.$if_sub_dt2);
				addColumnPathMap(DtlR.$if_sub_dt3, MBT_JOURNAL_SND_IF_R.$if_sub_dt3);
				addColumnPathMap(DtlR.$if_sub_dt4, MBT_JOURNAL_SND_IF_R.$if_sub_dt4);
				addColumnPathMap(DtlR.$if_sub_dt5, MBT_JOURNAL_SND_IF_R.$if_sub_dt5);
			}
		}
	}
	/**
	 * SapJournalSendConvService_Conv03オペレーション.<p>
	 *
	 */
	public class SapJournalSendConvService_Conv03 extends PFBAL_SapJournalSendConvService_MC_A.SapJournalSendConvService_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(
					mcframe.commonPFBA.PFBAR5820.DtlR.class, MBT_JOURNAL_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBAR_SapJournalUploadPrnt.create());
			_IfRptSet.setRowMapper(new MapJournalSendIfToSAPGLUpload());
		}
		
		
	

		public class MapJournalSendIfToSAPGLUpload<D extends mcframe.commonPFBA.PFBAR5820.DtlR, S extends MBT_JOURNAL_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				setupColumnPathMapHdr();
				setupColumnPathMapDtl();
			}

			protected void setupColumnPathMapHdr() {
				// ヘッダ項目は、データNOごとの先頭行以外の値を空白にする必要がある。
				// このメソッドで指定した項目は全行に値がセットされるため、clearHeaderValueメソッドで値のクリアが必要。
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$co_cd, MBT_JOURNAL_SND_IF_R.$if_co_cd);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$doc_dt, MBT_JOURNAL_SND_IF_R.$ac_dt);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$posting_dt, MBT_JOURNAL_SND_IF_R.$ac_dt);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$xrate, MBT_JOURNAL_SND_IF_R.$xrate);
			}

			protected void setupColumnPathMapDtl() {
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$dtl_co_cd, MBT_JOURNAL_SND_IF_R.$if_co_cd);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$ac_cd, MBT_JOURNAL_SND_IF_R.$ac_cd);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$bank_cd, MBT_JOURNAL_SND_IF_R.$if_bank_cd);
				addColumnPathMap(mcframe.commonPFBA.PFBAR5820.DtlR.$bank_ac_cd, MBT_JOURNAL_SND_IF_R.$if_bank_ac_cd);
			}

			protected int _seq = 1;

			protected MCNumber _dataNo = null;

			protected boolean isHeaderRow(S src) {
				return (_dataNo == null || !isSame(_dataNo, src.data_no()));
			}

			protected String _charset = MCConst.app.getString("PF.PFBAL5810.file_upload.charset");

			protected int _docHeaderTextMaxBytes = MCConst.app.getInteger("PF.PFBAL5810.file_upload.doc_header_text", 0);

			protected int _docItmTextMaxBytes = MCConst.app.getInteger("PF.PFBAL5810.file_upload.doc_itm_text", 0);

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				valueCopyHdr(dest, src);
				valueCopyDtl(dest, src);
			}
			
			protected void valueCopyHdr(D dest, S src) {
				if (isHeaderRow(src)) {
					dest.seq(String.valueOf(_seq++));
					dest.ac_doc_typ(PFBAL_JournalEntryPostBase.toAcDocTyp(src.ac_if_typ()));
					dest.doc_header_text(truncateString(PFBAL_JournalEntryPostBase.createDocumentHeaderText(src), _docHeaderTextMaxBytes));
					dest.trd_cur_cd(nvl(src.if_trd_cur_cd(), src.if_base_cur_cd()));
					dest.doc_ref_id(PFBAL_JournalEntryPostBase.createDocumentReferenceID(src));
				}
				else {
					clearHeaderValue(dest);
				}

			}

			protected void valueCopyDtl(D dest, S src) {
				dest.doc_itm_text(truncateString(PFBAL_JournalEntryPostBase.createDocumentItemText(src), _docItmTextMaxBytes));
				dest.base_cur_amt(PFBAL_JournalEntryPostBase.createAmountInCompanyCodeCurrency(src, false));
				MCNumber amt = PFBAL_JournalEntryPostBase.createAmountInTransactionCurrency(src, false);
				if (MAC_DC_TYP.isDR(src.dc_typ())) {
					dest.debtor_amt(amt);
				}
				else {
					dest.creditor_amt(amt);
				}

				if (PFBAL_JournalEntryPostBase.isProductTaxItem(src.ac_cd())) {
					dest.tax_cd(src.tax_cd());
				}

				dest.cost_center(PFBAL_JournalEntryPostBase.createCostCenter(src));
				dest.profit_center(PFBAL_JournalEntryPostBase.createProfitCenter(src));
				dest.cst_cd(PFBAL_JournalEntryPostBase.getBpCd(src));
				dest.itm_cd(PFBAL_JournalEntryPostBase.getItmCd(src));
				dest.tax_base_trd_cur_amt(PFBAL_JournalEntryPostBase.createTaxBaseAmountInTransCrcy(src, false));
				dest.itm_grp_cd(PFBAL_JournalEntryPostBase.getItmGrpCd(src));
				_dataNo = src.data_no();

			}

			protected void clearHeaderValue(D dest) {
				dest.co_cd(null);
				dest.doc_dt(null);
				dest.posting_dt(null);
				dest.xrate(null);
			}
			
			protected String truncateString(String input, int maxBytes) {
				if (input == null) {
					return "";
				}

				if (maxBytes <= 0) {
					return input;
				}

				Charset charset = createCharset();
				int currentBytes = 0;
				int lastValidIndex = 0;

				for (int i = 0; i < input.length(); i++) {
					int codePoint = input.codePointAt(i);
					String charStr = new String(Character.toChars(codePoint));
					int charBytes = charStr.getBytes(charset).length;

					if (currentBytes + charBytes <= maxBytes) {
						currentBytes += charBytes;
						lastValidIndex = i + Character.charCount(codePoint);
					}
					else {
						break;
					}

					if (Character.isSupplementaryCodePoint(codePoint)) {
						i++;
					}
				}

				return input.substring(0, lastValidIndex);
			}

			protected Charset createCharset() {
				Charset charset;
				if (_charset == null || _charset.isEmpty()) {
					charset = Charset.defaultCharset();
				}
				else {
					charset = Charset.forName(_charset);
				}
				return charset;
			}

		}
	}

	//FMCB CUSTOM END
}