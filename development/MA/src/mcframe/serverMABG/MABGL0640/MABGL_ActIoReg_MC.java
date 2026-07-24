package mcframe.serverMABG.MABGL0640;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABG.MABGL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_ActIoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_ActIoReg_MC extends MABGL_ActIoReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_ActIoReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ACT_IO_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_ACT_IO_R t = MAM_ACT_IO_R.create(builder.getBaseDbcAlias());
			
			/*場所無・取引先無の検索条件を追加*/
			if(up0().no_itm_jnl_flg()) {
				builder.addWhereWithAnd(t.itm_jnl_cd.isNull());
			}
			if(up0().no_ac_rsn_flg()) {
				builder.addWhereWithAnd(t.ac_rsn_cd.isNull());
			}
			if(up0().no_tgt_dpt_flg()) {
				builder.addWhereWithAnd(t.tgt_dpt_cd.isNull());
			}
			if(up0().no_tgt_loc_flg()) {
				builder.addWhereWithAnd(t.tgt_loc_cd.isNull());
			}
			
			
			MAM_TERM_R term = MAM_TERM_R.create("TERM");
			MAM_COST_DPT_R dpt = MAM_COST_DPT_R.create("DPT");
			MAM_COST_DPT_R dpt2 = MAM_COST_DPT_R.create("DPT2");
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create(MAM_ACT_IO_R.$WG2);
			builder.addSelect(dpt.dpt_nm.as("dpt_nm"));
			builder.addSelect(dpt2.dpt_nm.as("tgt_dpt_nm"));
			builder.addLeftOuterJoin(term, t.st_dt.gte(term.term)
					.and(t.st_dt.lt(term.term_end_ym)));
			builder.addLeftOuterJoin(dpt, term.term.eq(dpt.term)
					.and(t.dpt_cd.eq(dpt.dpt_cd)));
			builder.addLeftOuterJoin(dpt2, term.term.eq(dpt2.term)
					.and(t.tgt_dpt_cd.eq(dpt2.dpt_cd)));
			builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));


		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_ActIoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_ActIoReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActIoReg_UpdChk01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの登録前のチェックを行います。<br>
	 */
	public class ActIoReg_UpdChk01 extends MABGL_ActIoReg_MC_A.ActIoReg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (ActIoReg_UpdChk01_DtlR row :up0()){
				if (!(MAC_IO_TRANS_TYP.isALC(row.io_trans_typ()) || MAC_IO_TRANS_TYP.isINPT(row.io_trans_typ()))) {
					if (!isNull(row.alc_ac_cd())) {
						msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$alc_ac_cd, MABGL0058));
					}
				}
				if (isNull(row.alc_ac_cd()) && row.alc_amt_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$alc_amt_flg, MABGL0059));
				}
				if (isNull(row.alc_ac_cd()) && row.dpt_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$dpt_flg, MABGL0061));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.dpt_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$dpt_cd, MABGL0062));
				}
				if (row.dpt_flg() && !isNull(row.dpt_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$dpt_cd, MABGL0063));
				}
				if (isNull(row.alc_ac_cd()) && row.loc_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$loc_flg, MABGL0064));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.loc_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$loc_cd, MABGL0065));
				}
				if (row.loc_flg() && !isNull(row.loc_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$loc_cd, MABGL0066));
				}
				if (isNull(row.alc_ac_cd()) && row.oper_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$oper_flg, MABGL0067));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.oper_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$oper_cd, MABGL0068));
				}
				if (row.oper_flg() && !isNull(row.oper_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$oper_cd, MABGL0069));
				}
				if (isNull(row.alc_ac_cd()) && row.bp_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$bp_flg, MABGL0070));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.bp_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$bp_cd, MABGL0071));
				}
				if (row.bp_flg() && !isNull(row.bp_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$bp_cd, MABGL0072));
				}
				if (isNull(row.alc_ac_cd()) && row.ctg_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$ctg_flg, MABGL0073));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.ctg_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$ctg_cd, MABGL0074));
				}
				if (row.ctg_flg() && !isNull(row.ctg_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$ctg_cd, MABGL0075));
				}
				if (isNull(row.alc_ac_cd()) && row.itm_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$itm_flg, MABGL0076));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.itm_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$itm_cd, MABGL0077));
				}
				if (row.itm_flg() && !isNull(row.itm_cd())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$itm_cd, MABGL0078));
				}
				if (isNull(row.alc_ac_cd()) && row.lot_no_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$lot_no_flg, MABGL0079));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.lot_no())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$lot_no, MABGL0080));
				}
				if (row.lot_no_flg() && !isNull(row.lot_no())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$lot_no, MABGL0081));
				}
				if (isNull(row.alc_ac_cd()) && row.sublot_no_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sublot_no_flg, MABGL0082));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.sublot_no())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sublot_no, MABGL0083));
				}
				if (row.sublot_no_flg() && !isNull(row.sublot_no())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sublot_no, MABGL0084));
				}
				if (isNull(row.alc_ac_cd()) && row.sno1_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno1_flg, MABGL0085));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.sno1())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno1, MABGL0086));
				}
				if (row.sno1_flg() && !isNull(row.sno1())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno1, MABGL0087));
				}
				if (isNull(row.alc_ac_cd()) && row.sno2_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno2_flg, MABGL0088));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.sno2())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno2, MABGL0089));
				}
				if (row.sno2_flg() && !isNull(row.sno2())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno2, MABGL0090));
				}
				if (isNull(row.alc_ac_cd()) && row.sno3_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno3_flg, MABGL0091));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.sno3())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno3, MABGL0092));
				}
				if (row.sno3_flg() && !isNull(row.sno3())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno3, MABGL0093));
				}
				if (isNull(row.alc_ac_cd()) && row.sno4_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno4_flg, MABGL0104));
				}
				if (isNull(row.alc_ac_cd()) && !isNull(row.sno4())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno4, MABGL0105));
				}
				if (row.sno4_flg() && !isNull(row.sno4())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$sno4, MABGL0106));
				}
				if (isNull(row.alc_ac_cd()) && row.itm_mfg_inst_no_flg()) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$itm_mfg_inst_no_flg, MABGL0094));
				}
				if (!MAC_IO_TRANS_TYP.isINPT(row.io_trans_typ()) && !isNull(row.inpt_loc_typ1())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$inpt_loc_typ1, MABGL0095));
				}
				if (isNull(row.inpt_loc_typ1()) && !isNull(row.inpt_loc_typ2())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$inpt_loc_typ2, MABGL0096));
				}
				if (isNull(row.inpt_loc_typ2()) && !isNull(row.inpt_loc_typ3())) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$inpt_loc_typ3, MABGL0097));
				}
				if (!(MAC_AC_SLIP_TYP.is_acxfer_typ(row.ac_slip_typ()))) {
					msgList.add(getMsg(row, ActIoReg_UpdChk01_DtlR.$ac_slip_typ, MABGL0112));
				}
			}
			return msgList;
		}
		
		/** 行番号を引数に持つメッセージ */
		protected MCMessage getMsg(ActIoReg_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, toDispGUIIndex(r));
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),ActIoReg_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * ActIoReg_Upd01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの登録を行います。<br>
	 */
	public class ActIoReg_Upd01 extends MABGL_ActIoReg_MC_A.ActIoReg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActIoReg_DelChk01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの削除前のチェックを行います。<br>
	 */
	public class ActIoReg_DelChk01 extends MABGL_ActIoReg_MC_A.ActIoReg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),ActIoReg_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * ActIoReg_Del01オペレーション.<p>
	 *
	 * 入出庫実績振替マスタの削除を行います。<br>
	 */
	public class ActIoReg_Del01 extends MABGL_ActIoReg_MC_A.ActIoReg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABGL_ActIoReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}