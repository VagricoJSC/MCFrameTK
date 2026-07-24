package mcframe.serverMABC.MABCL0280;

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
import mcframe.serverMABC.MABCL0280.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DptReg_MC extends MABCL_DptReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門変更履歴マスタ、部門マスタ、部門変更対応マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_DptReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean checkDtlNoSelect() {
			// 操作種別が登録の時は常にtrueを返して以降の検索を行わない。
			if (isSame(up0().ope(),"0")) {
				return true;
			}
			return super.checkDtlNoSelect();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			
			MAM_DPT_R t = MAM_DPT_R.create(builder.getBaseDbcAlias());
			MAM_TERM_R term = MAM_TERM_R.create("TERM");
			MAM_COST_DPT_R cost_dpt1 = MAM_COST_DPT_R.create("COST_DPT1");
			MAM_AC_DPT_R ac_dpt1 = MAM_AC_DPT_R.create("AC_DPT1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			
			builder.addWhereWithCutOffAnd(t.st_dt.eq(bind("st_dt")), up0());

			if (builder.getBaseDbc() instanceof MAM_DPT_R) {
				up0().setStringNE("del_flg_false", toFalseStr(up0().del_flg()));

				builder.addSelect(cost_dpt1.dpt_nm.as("cost_dpt_nm"));
				builder.addSelect(ac_dpt1.ac_dpt_nm);
				builder.addSelect(wg1.sls_flg);
				builder.addSelect(wg1.lg_flg);
				builder.addSelect(wg1.mfg_flg);
				builder.addSelect(wg1.purc_flg);
				builder.addSelect(wg1.ar_flg);
				builder.addSelect(wg1.ap_flg);
				builder.addSelect(wg1.sd_flg);
				builder.addLeftOuterJoin(term, t.st_dt.gte(term.term)
						.and(t.st_dt.lt(term.term_end_ym)));
				builder.addLeftOuterJoin(cost_dpt1, term.term.eq(cost_dpt1.term)
						.and(t.cost_dpt_cd.eq(cost_dpt1.dpt_cd)));
				builder.addLeftOuterJoin(ac_dpt1, ac_dpt1.ac_dpt_cd.eq(t.ac_dpt_cd)
						.and(ac_dpt1.st_dt.lte(t.st_dt))
						.and(ac_dpt1.end_dt.gte(t.st_dt)));
				builder.addWhereWithCutOffAnd(t.del_flg.eq(bind("del_flg_false")), up0());

				rslt.addBooleanColumn(MAM_WG_R.$sls_flg);
				rslt.addBooleanColumn(MAM_WG_R.$lg_flg);
				rslt.addBooleanColumn(MAM_WG_R.$mfg_flg);
				rslt.addBooleanColumn(MAM_WG_R.$purc_flg);
				rslt.addBooleanColumn(MAM_WG_R.$ar_flg);
				rslt.addBooleanColumn(MAM_WG_R.$ap_flg);
				rslt.addBooleanColumn(MAM_WG_R.$sd_flg);
			}
		}
		@Override
		protected void down() {
			super.down();
			
			MCList<Srch01_Rslt2R> down1 = down1().createInstance();
			setDownLvDpt(down1, null);
			down1().setAll(down1);
		}
		protected void setDownLvDpt(MCList<Srch01_Rslt2R> down1, String dptCd) {
			MCList<Srch01_Rslt2R> tmp = down1().subList(Srch01_Rslt2R.$up_lv_dpt_cd, dptCd);
			tmp.sort(Srch01_Rslt2R.$dpt_cd);
			for (Srch01_Rslt2R r : tmp) {
				down1.add(r);
				setDownLvDpt(down1, r.dpt_cd());
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 部門変更履歴マスタ、部門マスタ、部門変更対応マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_DptReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 更新前に組織変更履歴マスタを検索する
			MCList<MAM_DPT_HIS_R> dbc = MCList.create(MAM_DPT_HIS_R.class);
			MAM_DPT_HIS_R t = MAM_DPT_HIS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.end_dt);
			dbc_bldr.setWhere(value(0).eq(value(0)));
			dbc_bldr.addWhereWithAnd(t.st_dt.eq(bind("1")), up0().get(0).st_dt_key());
			dbSelect("MABCL0280_MAM_DPT_HIS_S01", dbc, dbc_bldr);

			super.doIt();

			// 操作種別が組織変更する以外かつ組織変更履歴マスタが登録済みの場合、
			// 組織変更履歴マスタの適用終了日が変更されていたら、部門マスタ、部門変更対応マスタの適用終了日を一括更新する
			if (up0().size() == 1 && dbc.size() > 0) {
				if (!isSame(dbc.get(0).end_dt(), up0().get(0).end_dt())) {
					doUpdateDtp();
					doUpdateDtpMap();
				}
			}

			if (dbc.size() > 0 && !isSame(dbc.get(0).end_dt(), up0().get(0).end_dt())) {
				doUpdateDtpMapLcl();
			}
		}

		protected void beforeDefChk(MCMessageList msgList) {
			// 組織変更以外は以降のチェックを行わない
			if (up0().size() == 1) {
				return ;
			}
			if (!up0().isEmpty() && up0().get(0).end_dt().ltDate(FXUCL_DateUtil.getToday())) {
				msgList.add(new MCMessage(up0().get(0), DptHis_UpdChk01_DtlR.$end_dt, MABCL0084, toDispGUIIndex(up0().get(0))));
			}

			MCIndexKey idxkey = up1().createIndex(Upd01_Dtl2R.$new_flg, Upd01_Dtl2R.$dpt_cd);
			for(Upd01_Dtl2R r : up1()) {
				if (!r.new_flg()) {
					if (!isNull(r.new_dpt_cd())) {
						if (isNull(up1().getFirst(idxkey, true, r.new_dpt_cd()))) {
							msgList.add(new MCMessage(r, Upd01_Dtl2R.$new_dpt_cd, MABCL0082, r.new_dpt_cd(), toDispGUIIndex(r)));
						}
						if (!isNull(up1().getFirst(idxkey, true, r.dpt_cd()))) {
							msgList.add(new MCMessage(r, Upd01_Dtl2R.$dpt_cd, MABCL0083, r.dpt_cd(), toDispGUIIndex(r)));
						}
					}
				}
			}
			
		}

		@Override
		protected void callUpdOpe(mcframe.serverMAUD.MAUDL5030.MAUDL_RLUpdater ope) {
			
			if (ope instanceof DptHis_Upd01) {
				// 組織変更履歴の更新時のみ排他チェックを行う
				ope.setChkUpdCntr(true);
			}
			else if (ope instanceof Dpt_Upd01) {
				// 部門マスタのステータスを設定
				for (Dpt_UpdChk01_DtlR r : ((Dpt_Upd01) ope).up0()) {
					if (r.isStatusNone()) {
						r.setStatus(MCRow.MODIFY);
					}
				}
			}
			ope.exec();

		}

		/**
		 * 部門マスタの適用終了日を一括更新します。
		 */
		
		protected void doUpdateDtp() { 

			MAM_DPT_R d = MAM_DPT_R.create();
			selectUpdInfo(d);
			d.setDateNE(MAM_DPT_R.$st_dt, up0().get(0).st_dt_key());
			d.setDateNE(MAM_DPT_R.$end_dt, up0().get(0).end_dt());
			
			MAM_DPT_R t = MAM_DPT_R.create("T");
			execDbUpdate("MABCL0280_MAM_DPT_U01",
					t, d, t.st_dt.eq(bindEx(MAM_DPT_R.$st_dt)),
					t.end_dt, t.upd_usr_id, t.upd_usr_nm, t.upd_func_id, t.upd_srv_req_no);
		}
		

		/**
		 * 部門変更対応マスタの適用終了日を一括更新します。
		 */
		
		protected void doUpdateDtpMap() {

			MAM_DPT_MAP_R d = MAM_DPT_MAP_R.create();
			selectUpdInfo(d);
			d.setDateNE(MAM_DPT_MAP_R.$st_dt, up0().get(0).st_dt_key());
			d.setDateNE(MAM_DPT_MAP_R.$end_dt, up0().get(0).end_dt());
			
			MAM_DPT_MAP_R t = MAM_DPT_MAP_R.create("T");
			execDbUpdate("MABCL0280_MAM_DPT_MAP_U01",
					t, d, t.st_dt.eq(bindEx(MAM_DPT_R.$st_dt)),
					t.end_dt, t.upd_usr_id, t.upd_usr_nm, t.upd_func_id, t.upd_srv_req_no);
		}

		/**
		 * 標準ロケール以外の部門マスタ（ロケール別情報）の適用終了日を一括更新します。
		 */
		protected void doUpdateDtpMapLcl() {

			MAM_DPT_LCL_R d = MAM_DPT_LCL_R.create();
			selectUpdInfo(d);
			d.setDateNE(MAM_DPT_LCL_R.$st_dt, up0().get(0).st_dt_key());
			d.setDateNE(MAM_DPT_LCL_R.$end_dt, up0().get(0).end_dt());

			MAM_DPT_LCL_R t = MAM_DPT_LCL_R.create("T");
			execDbUpdate("MABCL0280_MAM_DPT_LCL_U01",
					t, d, t.st_dt.eq(bindEx(MAM_DPT_R.$st_dt))
						.and(t.lcl_cd.neq(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())),
					t.end_dt, t.upd_usr_id, t.upd_usr_nm, t.upd_func_id, t.upd_srv_req_no);
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 部門変更履歴マスタ、部門マスタ、部門変更対応マスタの削除を行います。（マスタ画面用）<br>
	 */
	public class Del01 extends MABCL_DptReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptHis_UpdChk01オペレーション.<p>
	 *
	 * 部門マスタの登録前のチェックを行います。<br>
	 */
	public class DptHis_UpdChk01 extends MABCL_DptReg_MC_A.DptHis_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptHis_Upd01オペレーション.<p>
	 *
	 * 部門マスタの登録を行います。<br>
	 */
	public class DptHis_Upd01 extends MABCL_DptReg_MC_A.DptHis_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			updateDpt();
		}

		/**
		 * 組織変更時、旧組織の部門マスタレコードの適用終了日を一括更新します。
		 */
		protected void updateDpt() {
			// 組織変更以外はリターン
			if (up0().size() == 1) {
				return ;
			}

			MAM_DPT_R updInfo = MAM_DPT_R.create();
			selectUpdInfo(updInfo);

			for(DptHis_UpdChk01_DtlR r : up0()) {
				if (r.isStatusModify()) {
					r.setStringNE(MAM_DPT_R.$upd_usr_id, updInfo.upd_usr_id());
					r.setStringNE(MAM_DPT_R.$upd_usr_nm, updInfo.upd_usr_nm());
					r.setStringNE(MAM_DPT_R.$upd_func_id, updInfo.upd_func_id());
					r.setStringNE(MAM_DPT_R.$upd_srv_req_no, updInfo.upd_srv_req_no());
					
					MAM_DPT_R t = MAM_DPT_R.create("T");
					execDbUpdate("MABCL0280_MAM_DPT_U02",
							t, r, t.st_dt.eq(bindEx("st_dt_key")),
							t.end_dt, t.upd_usr_id, t.upd_usr_nm, t.upd_func_id, t.upd_srv_req_no);

				}
			}
		}
	}
	/**
	 * Dpt_UpdChk01オペレーション.<p>
	 *
	 * 部門マスタの登録前のチェックを行います。<br>
	 */
	public class Dpt_UpdChk01 extends MABCL_DptReg_MC_A.Dpt_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();

			// 原価部門の存在チェック用に計上月度を取得
			if (!up0().isEmpty()) {
				MCDate acYm = getAcYm(up0().get(0).st_dt());
				up0().setDate(Dpt_UpdChk01_DtlR.$ac_ym, acYm);
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (Dpt_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 個別チェック
				if (!r.ar_flg()) {
					if (r.ar_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$ar_dpt_flg, MABCL0036, toDispGUIIndex(r)));
					}
				}
				if (!r.ap_flg()) {
					if (r.ap_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$ap_dpt_flg, MABCL0037, toDispGUIIndex(r)));
					}
				}
				if (!r.sls_flg()) {
					if (r.sls_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$sls_dpt_flg, MABCL0038, toDispGUIIndex(r)));
					}
				}
				if (!r.purc_flg()) {
					if (r.purc_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$purc_dpt_flg, MABCL0039, toDispGUIIndex(r)));
					}
				}
				if (!r.lg_flg() && !r.mfg_flg()) {
					if (r.ship_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$ship_dpt_flg, MABCL0040, getLabel(r, Dpt_UpdChk01_DtlR.$ship_dpt_flg), toDispGUIIndex(r)));
					}
					if (r.arr_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$arr_dpt_flg, MABCL0040, getLabel(r, Dpt_UpdChk01_DtlR.$arr_dpt_flg), toDispGUIIndex(r)));
					}
				}
				if (!r.mfg_flg()) {
					if (r.mfg_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$mfg_dpt_flg, MABCL0041, toDispGUIIndex(r)));
					}
				}
				if (!r.sd_flg()) {
					if (r.sd_dpt_flg()) {
						msgList.add(new MCMessage(r, Dpt_UpdChk01_DtlR.$sd_dpt_flg, MABCL0042, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
		@Override
		protected IfValidater getDuplicateValidater(java.lang.String[] cols) {
			return new FXUCL_DuplicateValidater(r -> r.isStatusCreate());
		}
	}
	/**
	 * Dpt_Upd01オペレーション.<p>
	 *
	 * 部門マスタの登録を行います。<br>
	 */
	public class Dpt_Upd01 extends MABCL_DptReg_MC_A.Dpt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Dpt_DelChk01オペレーション.<p>
	 *
	 * 部門マスタ、組織変更履歴マスタ、部門変更対応マスタ、部門マスタ（ロケール別情報）を削除する前のチェックを行う<br>
	 */
	public class Dpt_DelChk01 extends MABCL_DptReg_MC_A.Dpt_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Dpt_Del01オペレーション.<p>
	 *
	 * 部門マスタ、組織変更履歴マスタ、部門変更対応マスタ、部門マスタ（ロケール別情報）を削除する<br>
	 */
	public class Dpt_Del01 extends MABCL_DptReg_MC_A.Dpt_Del01 {
		@Override
		protected void call() {
			super.call();

			if (checkDpt()) {
				delDptMap(false);
				delDptLcl(false);
			}
			else {
				updDpt();
				delDptHis();
				delDptMap(true);
				delDptLcl(true);
			}
		}
		
		protected boolean checkDpt() {
			// 削除対象の適用開始日と等しいMAM_DPT_が存在するかどうか
			MAM_DPT_R t = MAM_DPT_R.create("T");

			return execDbCount("MABCL0280_MAM_DPT_S01",
					t, t.st_dt.eq(bind("1")), up0().get(0).st_dt()) > 0;
		}
		
		protected void updDpt() {
			// 前の組織変更で指定した新部門をクリア
			MCRow bind = MCRow.create();
			bind.setStringNE(MAM_DPT_R.$new_dpt_cd, null);
			bind.setDateNE(MAM_DPT_R.$st_dt, up0().get(0).st_dt());
			
			MAM_DPT_HIS_R S1 = MAM_DPT_HIS_R.create();
			MAM_DPT_R t = MAM_DPT_R.create("T");
			execDbUpdate("MABCL0280_MAM_DPT_HIS_U01",
					t, bind, t.st_dt.eq(subQuery().select(max(S1.st_dt) ) .from(S1)
							.where( S1.st_dt.lt(bindEx("st_dt")) )), t.new_dpt_cd);
			
		}
		protected void delDptHis() {
			
			MAM_DPT_HIS_R S0T = MAM_DPT_HIS_R.create("T");

			MCDelete q = sql("MABCL0280_MAM_DPT_HIS_D01")
				.delete(S0T)
				.where(
					S0T.st_dt.eq(bind("st_dt"))
				);
			q.executeBatchUpdate(up0());
			
		}
		protected void delDptMap(boolean isAll) {
			
			MAM_DPT_MAP_R S0T = MAM_DPT_MAP_R.create("T");

			if(!isAll) {
				MCDelete q = sql("MABCL0280_MAM_DPT_MAP_D01")
					.delete(S0T)
					.where(
						S0T.st_dt.eq(bind("st_dt"))
						.and(S0T.new_dpt_cd.eq(bind("dpt_cd")))
					);
				q.executeBatchUpdate(up0());
			}else {
				MCDelete q = sql("MABCL0280_MAM_DPT_MAP_D02")
					.delete(S0T)
					.where(
						S0T.st_dt.eq(bind("st_dt"))
					);
			q.executeBatchUpdate(up0());
			}
		}
		protected void delDptLcl(boolean isAll) {
			
			MAM_DPT_LCL_R S0T = MAM_DPT_LCL_R.create("T");
			
			if (!isAll) {
				MCDelete q = sql("MABCL0280_MAM_DPT_LCL_D01")
					.delete(S0T)
					.where(
						S0T.st_dt.eq(bind("st_dt"))
						.and(S0T.dpt_cd.eq(bind("dpt_cd")))
					);
				q.executeBatchUpdate(up0());
			}
				else {
					MCDelete q = sql("MABCL0280_MAM_DPT_LCL_D02")
				.delete(S0T)
				.where(
					S0T.st_dt.eq(bind("st_dt"))
				);
					q.executeBatchUpdate(up0());
				}
		}
	}
	/**
	 * DptMap_UpdChk01オペレーション.<p>
	 *
	 * 部門マスタの登録前のチェックを行います。<br>
	 */
	public class DptMap_UpdChk01 extends MABCL_DptReg_MC_A.DptMap_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptMap_Upd01オペレーション.<p>
	 *
	 * 部門マスタの登録を行います。<br>
	 */
	public class DptMap_Upd01 extends MABCL_DptReg_MC_A.DptMap_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}