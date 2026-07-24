package mcframe.serverMSBG.MSBGL5110;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_NoteIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_NoteIfService_MC extends MSBGL_NoteIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * NoteIf_Ins01オペレーション.<p>
	 *
	 * 手形管理ＮＯをもとに手形情報ＩＦを作成する<br>
	 */
	public class NoteIf_Ins01 extends MSBGL_NoteIfService_MC_A.NoteIf_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_NOTE_IF_R> noteIfL = MCList.create(MST_NOTE_IF_R.class);
			
			for (NoteIf_Ins01_CndR row : up0()) {
				
				// 手形情報取得
				MST_NOTE_R noteR = MST_NOTE_R.create();
				srchNote(row, noteR);
				
				// 入金・入金実績情報取得
				MST_RCV_R rcvR = MST_RCV_R.create();
				MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
				srchRcv(row, rcvR, rcvActR);
				
				// 取消用の編集
				setDel(row, rcvR, rcvActR);
				
				// 手形情報IFマッピング
				MST_NOTE_IF_R noteIfR = setNoteIf(noteR, rcvR, rcvActR);
				noteIfL.add(noteIfR);
			}
			
			// 手形情報IF・登録
			if (!noteIfL.isEmpty()) {
				MCQueryApiBuilder noteIfL_bldr = MCQueryApiBuilder.create(MST_NOTE_IF_R.create("T"));
				dbInsert("MSBGL5110_MST_NOTE_IF_I01", noteIfL, noteIfL_bldr);
			}
		}
		
		
		/**
		 * 手形情報取得
		 * @param row
		 * @return
		 */
		protected void srchNote(NoteIf_Ins01_CndR row, MST_NOTE_R noteR) {
			MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
			dbSelectKey("MSBGL5110_MST_NOTE_S01", noteR, noteR_bldr, row);
		}
		
		/**
		 * 入金・入金実績情報取得
		 * @param row
		 * @param rcvR
		 * @param rcvActR
		 */
		protected void srchRcv(NoteIf_Ins01_CndR row, MST_RCV_R rcvR, MST_RCV_ACT_R rcvActR) {
			
			// 入金情報
			if (!row.rcv_act_flg()) {
				MAM_BP_R bp1 = MAM_BP_R.create("BP1");
				MST_RCV_R t = MST_RCV_R.create("T");
				MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(t);
				
				rcvR_bldr.addSelect(bp1.cntry_cd.as("cntry_cd"));
				rcvR_bldr.addWhereWithAnd(t.note_mng_no.eq(bind("1")), row.note_mng_no());
				rcvR_bldr.addWhereWithAnd(t.dat_typ.eq(bind("1")),
						MSC_RCV_DAT_TYP.RCV.value());
				rcvR_bldr.addLeftOuterJoin(bp1, bracket(t.rcst_cd.eq(bp1.bp_cd)));
				dbSelect("MSBGL5110_MST_RCV_S01", rcvR, rcvR_bldr);
			}
			// 入金実績情報
			else {
				MAM_BP_R bp1 = MAM_BP_R.create("BP1");
				MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
				MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(t);
				
				rcvActR_bldr.addSelect(bp1.cntry_cd.as("cntry_cd"));
				rcvActR_bldr.addWhereWithAnd(t.note_mng_no.eq(bind("1")), row.note_mng_no());
				if (row.del_flg()) {
					rcvActR_bldr.addWhereWithAnd(t.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.DIS.value());
				}
				else {
					rcvActR_bldr.addWhereWithAnd(t.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.CRT.value());
				}
				rcvActR_bldr.addLeftOuterJoin(bp1, bracket( t.rcst_cd.eq(bp1.bp_cd)));
				dbSelect("MSBGL5110_MST_RCV_ACT_S01", rcvActR, rcvActR_bldr);
			}
		}
		
		/**
		 * 削除用の編集
		 * 削除データは金額の符号を反転する。
		 * 
		 * @param row
		 * @param rcvR
		 * @param rcvActR
		 */
		
		protected void setDel(NoteIf_Ins01_CndR row, MST_RCV_R rcvR, MST_RCV_ACT_R rcvActR) {
			if (row.del_flg()) {
				if (!rcvR.isEmpty()) {
						rcvR.rcv_amt(rcvR.rcv_amt().negate());	
				}
				if (!rcvActR.isEmpty()) {
					rcvActR.subttl1(rcvActR.subttl1().negate());
					rcvActR.base_cur_subttl1(rcvActR.base_cur_subttl1().negate());
				}
			}
		}
		
		protected MST_NOTE_IF_R setNoteIf(MST_NOTE_R noteR, MST_RCV_R rcvR, MST_RCV_ACT_R rcvActR) {
			MST_NOTE_IF_R noteIfR = MST_NOTE_IF_R.create();
			
			if (!rcvR.isEmpty()) {
				copy(noteIfR, noteR, createMap_MST_NOTE_IF_R_MST_NOTE_R(rcvR));
			}
			if (!rcvActR.isEmpty()) {
				copy(noteIfR, noteR, createMap_MST_NOTE_IF_R_MST_NOTE_R2(rcvActR));
			}
			return noteIfR;
		}
		
		// Mapeer
		protected Map_MST_NOTE_IF_R_MST_NOTE_R<MST_NOTE_IF_R,MST_NOTE_R> createMap_MST_NOTE_IF_R_MST_NOTE_R(MST_RCV_R rcvR) {
			return new Map_MST_NOTE_IF_R_MST_NOTE_R<MST_NOTE_IF_R, MST_NOTE_R>(rcvR);
		}

		public class Map_MST_NOTE_IF_R_MST_NOTE_R<D extends MST_NOTE_IF_R, S extends MST_NOTE_R> extends MCRowMapper<D,S>{
			
			MST_RCV_R _rcvR;
			
			public Map_MST_NOTE_IF_R_MST_NOTE_R(MST_RCV_R rcvR) {
				_rcvR = rcvR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_NOTE_IF_R.$note_rsn_cd, MST_NOTE_R.$note_rsn_cd);
				addColumnPathMap(MST_NOTE_IF_R.$note_no, MST_NOTE_R.$note_no);
				addColumnPathMap(MST_NOTE_IF_R.$note_typ, MST_NOTE_R.$note_typ);
				addColumnPathMap(MST_NOTE_IF_R.$draw_dt, MST_NOTE_R.$draw_dt);
				addColumnPathMap(MST_NOTE_IF_R.$due_dt, MST_NOTE_R.$due_dt);
				addColumnPathMap(MST_NOTE_IF_R.$drawer_nm, MST_NOTE_R.$drawer_nm);
				addColumnPathMap(MST_NOTE_IF_R.$accptr, MST_NOTE_R.$accptr);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.note_if_no(getNoteIfNo());
				dest.ac_ym(getAcYm(_rcvR.rcv_dt()));
				dest.ac_dt(_rcvR.rcv_dt());
				dest.dpt_cd(_rcvR.rcv_dpt_cd());
				dest.rcst_cd(_rcvR.rcst_cd());
				dest.foreign_flg(getForeignFlg(_rcvR.getStringNE("cntry_cd")));				
				dest.base_cur_cd(_rcvR.base_cur_cd());
				dest.base_cur_amt(convToBaseCur(_rcvR.rcv_amt(), _rcvR.xrate(),  getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				dest.base_cur_tax_amt(MCNumber.ZERO);
				dest.trd_cur_cd(_rcvR.trd_cur_cd());
				dest.trd_cur_amt(_rcvR.rcv_amt());
				dest.trd_cur_tax_amt(MCNumber.ZERO);
				dest.xrate_cd(_rcvR.xrate_cd());
				dest.xrate(_rcvR.xrate());
				dest.bank_cd(src.draw_bank_cd());
				dest.branch_cd(src.draw_branch_cd());
				dest.endrsr1(src.endrsr());
				dest.a_imp_flg(false);
			}
		}
		
		protected Map_MST_NOTE_IF_R_MST_NOTE_R2<MST_NOTE_IF_R, MST_NOTE_R> createMap_MST_NOTE_IF_R_MST_NOTE_R2(MST_RCV_ACT_R rcvActR) {
			return new Map_MST_NOTE_IF_R_MST_NOTE_R2<MST_NOTE_IF_R, MST_NOTE_R>(rcvActR);
		}

		public class Map_MST_NOTE_IF_R_MST_NOTE_R2<D extends MST_NOTE_IF_R, S extends MST_NOTE_R> extends MCRowMapper<D,S>{
			
			MST_RCV_ACT_R _rcvActR;
			
			public Map_MST_NOTE_IF_R_MST_NOTE_R2(MST_RCV_ACT_R rcvActR) {
				_rcvActR = rcvActR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_NOTE_IF_R.$note_rsn_cd, MST_NOTE_R.$note_rsn_cd);
				addColumnPathMap(MST_NOTE_IF_R.$note_no, MST_NOTE_R.$note_no);
				addColumnPathMap(MST_NOTE_IF_R.$note_typ, MST_NOTE_R.$note_typ);
				addColumnPathMap(MST_NOTE_IF_R.$draw_dt, MST_NOTE_R.$draw_dt);
				addColumnPathMap(MST_NOTE_IF_R.$due_dt, MST_NOTE_R.$due_dt);
				addColumnPathMap(MST_NOTE_IF_R.$drawer_nm, MST_NOTE_R.$drawer_nm);
				addColumnPathMap(MST_NOTE_IF_R.$accptr, MST_NOTE_R.$accptr);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.note_if_no(getNoteIfNo());
				dest.ac_ym(getAcYm(_rcvActR.rcv_dt()));
				dest.ac_dt(_rcvActR.rcv_dt());
				dest.dpt_cd(_rcvActR.dpt_cd());
				dest.rcst_cd(_rcvActR.rcst_cd());
				dest.foreign_flg(getForeignFlg(_rcvActR.getStringNE("cntry_cd")));
				dest.base_cur_cd(_rcvActR.base_cur_cd());
				dest.base_cur_amt(_rcvActR.base_cur_subttl1());
				dest.base_cur_tax_amt(MCNumber.ZERO);
				dest.trd_cur_cd(_rcvActR.trd_cur_cd());
				dest.trd_cur_amt(_rcvActR.subttl1());
				dest.trd_cur_tax_amt(MCNumber.ZERO);
				dest.xrate_cd(_rcvActR.xrate_cd());
				dest.xrate(_rcvActR.xrate());
				dest.bank_cd(src.draw_bank_cd());
				dest.branch_cd(src.draw_branch_cd());
				dest.endrsr1(src.endrsr());
				dest.a_imp_flg(false);
			}
		}
	}
	
	/**
	 * 手形情報ＩＦＮＯ発番
	 */
	protected String getNoteIfNo() {
		return getStrSeq(MSC_NUM_SYS_TYP.NOTEIF);
	}
	
	/**
	 * 国内外判定
	 */
	protected boolean getForeignFlg(String cntryCd) {
		return !isSame(getCo().cntry_cd(), cntryCd);
	}

	//FMCB CUSTOM END
}