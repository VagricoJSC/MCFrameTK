package mcframe.serverMABC.MABCL0940;

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
import mcframe.serverMABC.MABCL0940.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BizRsnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BizRsnReg_MC extends MABCL_BizRsnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BizRsn_UpdChk01オペレーション.<p>
	 *
	 * 業務理由マスタを登録する前のチェック処理を行います。<br>
	 */
	public class BizRsn_UpdChk01 extends MABCL_BizRsnReg_MC_A.BizRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (BizRsn_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.biz_rsn_cd())) {
					msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$biz_rsn_cd,
							MABCL0306, getLabel(r, BizRsn_UpdChk01_DtlR.$biz_rsn_cd),
							r.biz_rsn_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				// 仕入ソート順
				if (r.purc_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$purc_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 仕入返品ソート順
				if (r.purc_rtn_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$purc_rtn_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 仕入調整管轄区分、仕入調整ソート順
				if (r.purc_dscnt_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$purc_dscnt_loc_mng_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$purc_dscnt_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 売上ソート順
				if (r.sls_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$sls_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 売上返品ソート順
				if (r.sls_rtn_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$sls_rtn_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 売上調整ソート順
				if (r.sls_dscnt_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$sls_dscnt_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 他勘定入庫ソート順
				if (r.acxfr_gr_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$acxfr_gr_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 他勘定出庫ソート順
				if (r.acxfr_gi_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$acxfr_gi_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 廃棄ソート順
				if (r.disp_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$disp_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 在庫振替ソート順
				if (r.stk_xfr_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$stk_xfr_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 移送ソート順
				if (r.xfr_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$xfr_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 出来高区分、出来高ソート順
				if (r.yield_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$yield_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$yield_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 投入ソート順
				if (r.inpt_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$inpt_sort_seq,
							new FXUCL_RequiredValidater()));
				}
				// 検査不良ソート順
				if (r.dfct_flg()) {
					msgList.addAll(check(r, BizRsn_UpdChk01_DtlR.$dfct_sort_seq,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!r.purc_flg()) {
					if (!isNull(r.purc_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$purc_sort_seq,
								MABCL0014, toDispGUIIndex(r)));
					}
				}
				if (!r.purc_rtn_flg()) {
					if (!isNull(r.purc_rtn_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$purc_rtn_sort_seq,
										MABCL0015, toDispGUIIndex(r)));
					}
				}
				if (!r.purc_flg() && !r.purc_rtn_flg()) {
					if (r.xpns_purc_flg()) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$xpns_purc_flg,
								MABCL0016, toDispGUIIndex(r)));
					}
				}
				if (!r.xpns_purc_flg()) {
					if (r.slo_xpns_purc_flg()) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$slo_xpns_purc_flg,
										MABCL0023, toDispGUIIndex(r)));
					}
				}
				if (!r.purc_dscnt_flg()) {
					if (!isNull(r.purc_dscnt_loc_mng_typ())) {
						msgList.add(new MCMessage(r,
								BizRsn_UpdChk01_DtlR.$purc_dscnt_loc_mng_typ, MABCL0017,
								toDispGUIIndex(r)));
					}
					if (!isNull(r.purc_dscnt_sort_seq())) {
						msgList.add(new MCMessage(r,
								BizRsn_UpdChk01_DtlR.$purc_dscnt_sort_seq, MABCL0018,
								toDispGUIIndex(r)));
					}
				}
				if (!r.sls_flg()) {
					if (!isNull(r.sls_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$sls_sort_seq,
								MABCL0019, toDispGUIIndex(r)));
					}
				}
				if (!r.sls_rtn_flg()) {
					if (!isNull(r.sls_rtn_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$sls_rtn_sort_seq,
										MABCL0020, toDispGUIIndex(r)));
					}
				}
				if (!r.sls_flg() && !r.sls_rtn_flg()) {
					if (r.sls_acxfr_flg()) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$sls_acxfr_flg,
								MABCL0021, toDispGUIIndex(r)));
					}
				}
				if (!r.sls_dscnt_flg()) {
					if (!isNull(r.sls_dscnt_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$sls_dscnt_sort_seq,
										MABCL0022, toDispGUIIndex(r)));
					}
				}
				if (!r.acxfr_gr_flg()) {
					if (!isNull(r.acxfr_gr_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$acxfr_gr_sort_seq,
										MABCL0028, toDispGUIIndex(r)));
					}
				}
				if (!r.acxfr_gi_flg()) {
					if (!isNull(r.acxfr_gi_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$acxfr_gi_sort_seq,
										MABCL0031, toDispGUIIndex(r)));
					}
				}
				if (!r.acxfr_gr_flg() && !r.acxfr_gi_flg()) {
					if (!isNull(r.inpt_acxfr_sort_seq())) {
						msgList.add(new MCMessage(r,
								BizRsn_UpdChk01_DtlR.$inpt_acxfr_sort_seq, MABCL0033,
								toDispGUIIndex(r)));
					}
				}
				if (!r.disp_flg()) {
					if (!isNull(r.disp_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$disp_sort_seq,
								MABCL0024, toDispGUIIndex(r)));
					}
				}
				if (!r.stk_xfr_flg()) {
					if (!isNull(r.stk_xfr_sort_seq())) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$stk_xfr_sort_seq,
										MABCL0025, toDispGUIIndex(r)));
					}
				}
				if (!r.xfr_flg()) {
					if (!isNull(r.xfr_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$xfr_sort_seq,
								MABCL0026, toDispGUIIndex(r)));
					}
				}
				if (!r.yield_flg()) {
					if (!isNull(r.yield_typ())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$yield_typ,
								MABCL0154, toDispGUIIndex(r)));
					}
					if (!isNull(r.yield_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$yield_sort_seq,
								MABCL0027, toDispGUIIndex(r)));
					}
				}
				if (!MAC_YIELD_TYP.isDFCT(r.yield_typ())) {
					if (r.not_stk_flg()) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$not_stk_flg,
								MABCL0155, toDispGUIIndex(r)));
					}
				}
				if (!r.loss_flg()) {
					if (r.fxd_loss_flg()) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$fxd_loss_flg,
								MABCL0012, toDispGUIIndex(r)));
					}
					if (r.not_lot_trace_flg()) {
						msgList.add(
								new MCMessage(r, BizRsn_UpdChk01_DtlR.$not_lot_trace_flg,
										MABCL0029, toDispGUIIndex(r)));
					}
				}
				if (!r.inpt_flg()) {
					if (!isNull(r.inpt_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$inpt_sort_seq,
								MABCL0314, toDispGUIIndex(r)));
					}
				}
				if (!r.dfct_flg()) {
					if (!isNull(r.dfct_sort_seq())) {
						msgList.add(new MCMessage(r, BizRsn_UpdChk01_DtlR.$dfct_sort_seq,
								MABCL0030, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}

	/**
	 * BizRsn_Upd01オペレーション.<p>
	 *
	 * 業務理由マスタの登録処理を行います。<br>
	 */
	public class BizRsn_Upd01 extends MABCL_BizRsnReg_MC_A.BizRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (dbc.createRow() instanceof MAM_BIZ_RSN_R) {
					MAM_BIZ_RSN_R row = (MAM_BIZ_RSN_R) r;

					// 一件チェック（受注紐付経費購買ＦＬＧ）
					if (row.slo_xpns_purc_flg()) {
						checkFlg(row, MABCL0156);
					}
					// 一件チェック（固定ロスＦＬＧ）
					if (row.fxd_loss_flg()) {
						checkFlg(row, MABCL0013);
					}
				}
			}
		}

		/**
		 * 受注紐付経費購買ＦＬＧ＝オン、固定ロスＦＬＧ＝オンはそれぞれ1件のみチェック
		 */
		protected void checkFlg(MAM_BIZ_RSN_R r, String id) {

			if (r.del_flg()) {
				return;
			}
			int i = 0;

			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			if (isSame(id, MABCL0156)) {
				i = execDbCount("MABCL0940_MAM_BIZ_RSN_S01", t,
						t.biz_rsn_cd.neq(bind("biz_rsn_cd"))
								.and(t.del_flg.eq(value(false)))
								.and(t.slo_xpns_purc_flg.eq(value(true))),
						r);
			}
			else {
				i = execDbCount("MABCL0940_MAM_BIZ_RSN_S02", t,
						t.biz_rsn_cd.neq(bind("biz_rsn_cd"))
								.and(t.del_flg.eq(value(false)))
								.and(t.fxd_loss_flg.eq(value(true))),
						r);
			}

			if (i > 0) {
				getMsgList()
						.add(new MCMessage(r,
								isSame(id, MABCL0156) ? MAM_BIZ_RSN_R.$slo_xpns_purc_flg
										: MAM_BIZ_RSN_R.$fxd_loss_flg,
								id, toDispGUIIndex(r)));
			}

		}
	}

	/**
	 * BizRsnLcl_UpdChk01オペレーション.<p>
	 *
	 * 業務理由マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class BizRsnLcl_UpdChk01 extends MABCL_BizRsnReg_MC_A.BizRsnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * BizRsnLcl_Upd01オペレーション.<p>
	 *
	 * 業務理由マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class BizRsnLcl_Upd01 extends MABCL_BizRsnReg_MC_A.BizRsnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * BizRsn_DelChk01オペレーション.<p>
	 *
	 * 業務理由マスタ、業務理由マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class BizRsn_DelChk01 extends MABCL_BizRsnReg_MC_A.BizRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * BizRsn_Del01オペレーション.<p>
	 *
	 * 業務理由マスタ、業務理由マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class BizRsn_Del01 extends MABCL_BizRsnReg_MC_A.BizRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 業務理由マスタ、業務理由マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_BizRsnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 業務理由マスタ、業務理由マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_BizRsnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務理由マスタ、業務理由マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BizRsnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}