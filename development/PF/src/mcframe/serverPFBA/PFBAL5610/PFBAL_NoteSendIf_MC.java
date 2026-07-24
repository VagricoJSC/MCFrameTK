package mcframe.serverPFBA.PFBAL5610;

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
import mcframe.serverPFBZ.PFBZL9020.*;
import mcframe.commonPFBA.PFBAR5610.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_NoteSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_NoteSendIf_MC extends PFBAL_NoteSendIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * NoteIf_Conv01オペレーション.<p>
	 *
	 */
	public class NoteIf_Conv01 extends PFBAL_NoteSendIf_MC_A.NoteIf_Conv01 {
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
					DtlR.class, MBT_NOTE_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBAR_NotePrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_NOTE_SND_IF_R());
		}

		public class DtlR_MBT_NOTE_SND_IF_R<D extends DtlR, S extends MBT_NOTE_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(DtlR.$proc_no, MBT_NOTE_SND_IF_R.$proc_no);
				addColumnPathMap(DtlR.$slip_cnt_id, MBT_NOTE_SND_IF_R.$slip_cnt_id);
				addColumnPathMap(DtlR.$ac_ym, MBT_NOTE_SND_IF_R.$ac_ym);
				addColumnPathMap(DtlR.$ac_dt, MBT_NOTE_SND_IF_R.$ac_dt);
				addColumnPathMap(DtlR.$ac_cd, MBT_NOTE_SND_IF_R.$ac_cd);
				addColumnPathMap(DtlR.$sub_ac_cd, MBT_NOTE_SND_IF_R.$sub_ac_cd);
				addColumnPathMap(DtlR.$note_rsn_cd, MBT_NOTE_SND_IF_R.$note_rsn_cd);
				addColumnPathMap(DtlR.$dpt_cd, MBT_NOTE_SND_IF_R.$dpt_cd);
				addColumnPathMap(DtlR.$rcst_cd, MBT_NOTE_SND_IF_R.$rcst_cd);
				addColumnPathMap(DtlR.$foreign_flg, MBT_NOTE_SND_IF_R.$foreign_flg);
				addColumnPathMap(DtlR.$base_cur_cd, MBT_NOTE_SND_IF_R.$base_cur_cd);
				addColumnPathMap(DtlR.$base_cur_amt, MBT_NOTE_SND_IF_R.$base_cur_amt);
				addColumnPathMap(DtlR.$base_cur_tax_amt, MBT_NOTE_SND_IF_R.$base_cur_tax_amt);
				addColumnPathMap(DtlR.$trd_cur_cd, MBT_NOTE_SND_IF_R.$trd_cur_cd);
				addColumnPathMap(DtlR.$trd_cur_amt, MBT_NOTE_SND_IF_R.$trd_cur_amt);
				addColumnPathMap(DtlR.$trd_cur_tax_amt, MBT_NOTE_SND_IF_R.$trd_cur_tax_amt);
				addColumnPathMap(DtlR.$xrate_cd, MBT_NOTE_SND_IF_R.$xrate_cd);
				addColumnPathMap(DtlR.$xrate, MBT_NOTE_SND_IF_R.$xrate);
				addColumnPathMap(DtlR.$note_no, MBT_NOTE_SND_IF_R.$note_no);
				addColumnPathMap(DtlR.$note_typ, MBT_NOTE_SND_IF_R.$note_typ);
				addColumnPathMap(DtlR.$draw_dt, MBT_NOTE_SND_IF_R.$draw_dt);
				addColumnPathMap(DtlR.$due_dt, MBT_NOTE_SND_IF_R.$due_dt);
				addColumnPathMap(DtlR.$bank_cd, MBT_NOTE_SND_IF_R.$bank_cd);
				addColumnPathMap(DtlR.$branch_cd, MBT_NOTE_SND_IF_R.$branch_cd);
				addColumnPathMap(DtlR.$drawer_nm, MBT_NOTE_SND_IF_R.$drawer_nm);
				addColumnPathMap(DtlR.$endrsr1, MBT_NOTE_SND_IF_R.$endrsr1);
				addColumnPathMap(DtlR.$endrsr2, MBT_NOTE_SND_IF_R.$endrsr2);
				addColumnPathMap(DtlR.$endrsr3, MBT_NOTE_SND_IF_R.$endrsr3);
				addColumnPathMap(DtlR.$endrsr4, MBT_NOTE_SND_IF_R.$endrsr4);
				addColumnPathMap(DtlR.$endrsr5, MBT_NOTE_SND_IF_R.$endrsr5);
				addColumnPathMap(DtlR.$accptr, MBT_NOTE_SND_IF_R.$accptr);
				addColumnPathMap(DtlR.$abstract1, MBT_NOTE_SND_IF_R.$abstract1);
				addColumnPathMap(DtlR.$abstract2, MBT_NOTE_SND_IF_R.$abstract2);
				addColumnPathMap(DtlR.$sub_char1, MBT_NOTE_SND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MBT_NOTE_SND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MBT_NOTE_SND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MBT_NOTE_SND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MBT_NOTE_SND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MBT_NOTE_SND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MBT_NOTE_SND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MBT_NOTE_SND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MBT_NOTE_SND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MBT_NOTE_SND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_num1, MBT_NOTE_SND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MBT_NOTE_SND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MBT_NOTE_SND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_dt1, MBT_NOTE_SND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MBT_NOTE_SND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MBT_NOTE_SND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$if_sub_char1, MBT_NOTE_SND_IF_R.$if_sub_char1);
				addColumnPathMap(DtlR.$if_sub_char2, MBT_NOTE_SND_IF_R.$if_sub_char2);
				addColumnPathMap(DtlR.$if_sub_char3, MBT_NOTE_SND_IF_R.$if_sub_char3);
				addColumnPathMap(DtlR.$if_sub_char4, MBT_NOTE_SND_IF_R.$if_sub_char4);
				addColumnPathMap(DtlR.$if_sub_char5, MBT_NOTE_SND_IF_R.$if_sub_char5);
				addColumnPathMap(DtlR.$if_sub_char6, MBT_NOTE_SND_IF_R.$if_sub_char6);
				addColumnPathMap(DtlR.$if_sub_char7, MBT_NOTE_SND_IF_R.$if_sub_char7);
				addColumnPathMap(DtlR.$if_sub_char8, MBT_NOTE_SND_IF_R.$if_sub_char8);
				addColumnPathMap(DtlR.$if_sub_char9, MBT_NOTE_SND_IF_R.$if_sub_char9);
				addColumnPathMap(DtlR.$if_sub_char10, MBT_NOTE_SND_IF_R.$if_sub_char10);
				addColumnPathMap(DtlR.$if_sub_char11, MBT_NOTE_SND_IF_R.$if_sub_char11);
				addColumnPathMap(DtlR.$if_sub_char12, MBT_NOTE_SND_IF_R.$if_sub_char12);
				addColumnPathMap(DtlR.$if_sub_char13, MBT_NOTE_SND_IF_R.$if_sub_char13);
				addColumnPathMap(DtlR.$if_sub_char14, MBT_NOTE_SND_IF_R.$if_sub_char14);
				addColumnPathMap(DtlR.$if_sub_char15, MBT_NOTE_SND_IF_R.$if_sub_char15);
				addColumnPathMap(DtlR.$if_sub_char16, MBT_NOTE_SND_IF_R.$if_sub_char16);
				addColumnPathMap(DtlR.$if_sub_char17, MBT_NOTE_SND_IF_R.$if_sub_char17);
				addColumnPathMap(DtlR.$if_sub_char18, MBT_NOTE_SND_IF_R.$if_sub_char18);
				addColumnPathMap(DtlR.$if_sub_char19, MBT_NOTE_SND_IF_R.$if_sub_char19);
				addColumnPathMap(DtlR.$if_sub_char20, MBT_NOTE_SND_IF_R.$if_sub_char20);
				addColumnPathMap(DtlR.$if_sub_char21, MBT_NOTE_SND_IF_R.$if_sub_char21);
				addColumnPathMap(DtlR.$if_sub_char22, MBT_NOTE_SND_IF_R.$if_sub_char22);
				addColumnPathMap(DtlR.$if_sub_char23, MBT_NOTE_SND_IF_R.$if_sub_char23);
				addColumnPathMap(DtlR.$if_sub_char24, MBT_NOTE_SND_IF_R.$if_sub_char24);
				addColumnPathMap(DtlR.$if_sub_char25, MBT_NOTE_SND_IF_R.$if_sub_char25);
				addColumnPathMap(DtlR.$if_sub_char26, MBT_NOTE_SND_IF_R.$if_sub_char26);
				addColumnPathMap(DtlR.$if_sub_char27, MBT_NOTE_SND_IF_R.$if_sub_char27);
				addColumnPathMap(DtlR.$if_sub_char28, MBT_NOTE_SND_IF_R.$if_sub_char28);
				addColumnPathMap(DtlR.$if_sub_char29, MBT_NOTE_SND_IF_R.$if_sub_char29);
				addColumnPathMap(DtlR.$if_sub_char30, MBT_NOTE_SND_IF_R.$if_sub_char30);
				addColumnPathMap(DtlR.$if_sub_num1, MBT_NOTE_SND_IF_R.$if_sub_num1);
				addColumnPathMap(DtlR.$if_sub_num2, MBT_NOTE_SND_IF_R.$if_sub_num2);
				addColumnPathMap(DtlR.$if_sub_num3, MBT_NOTE_SND_IF_R.$if_sub_num3);
				addColumnPathMap(DtlR.$if_sub_num4, MBT_NOTE_SND_IF_R.$if_sub_num4);
				addColumnPathMap(DtlR.$if_sub_num5, MBT_NOTE_SND_IF_R.$if_sub_num5);
				addColumnPathMap(DtlR.$if_sub_dt1, MBT_NOTE_SND_IF_R.$if_sub_dt1);
				addColumnPathMap(DtlR.$if_sub_dt2, MBT_NOTE_SND_IF_R.$if_sub_dt2);
				addColumnPathMap(DtlR.$if_sub_dt3, MBT_NOTE_SND_IF_R.$if_sub_dt3);
				addColumnPathMap(DtlR.$if_sub_dt4, MBT_NOTE_SND_IF_R.$if_sub_dt4);
				addColumnPathMap(DtlR.$if_sub_dt5, MBT_NOTE_SND_IF_R.$if_sub_dt5);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.co_cd(getCo().co_cd());

			}
		}
	}

	//FMCB CUSTOM END
}