package mcframe.serverMABS.MABSL0330;

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
import mcframe.serverMABS.MABSL0330.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_LossRsnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_LossRsnReg_MC extends MABSL_LossRsnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * LossRsn_UpdChk01オペレーション.<p>
	 *
	 * ロス理由マスタの登録前のチェックを行います。<br>
	 */
	public class LossRsn_UpdChk01 extends MABSL_LossRsnReg_MC_A.LossRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);

			for (MCConstRow row : up) {
				if (!(row instanceof LossRsn_UpdChk01_DtlR)) {
					break;
				}
				LossRsn_UpdChk01_DtlR r = (LossRsn_UpdChk01_DtlR) row;
				if (r.del_flg()) {
					continue ;
				}

				if (r.fxd_loss_flg() && r.def_disp_flg()) {
					msgList.add(new MCMessage(r, LossRsn_UpdChk01_DtlR.$def_disp_flg, MABSL0122, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * LossRsn_Upd01オペレーション.<p>
	 *
	 * ロス理由マスタの登録を行います。<br>
	 */
	public class LossRsn_Upd01 extends MABSL_LossRsnReg_MC_A.LossRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_LOSS_RSN_R) {
					checkDefDispFlg((MAM_LOSS_RSN_R) r);
				}
			}
		}

		/**
		 * 同一品目区分・品目区分詳細で初期表示ＦＬＧ＝ＯＮは1件のみチェック
		 */
		protected void checkDefDispFlg(MAM_LOSS_RSN_R r) {
			if (!r.def_disp_flg() || r.del_flg()) {
				return;
			}
			MAM_LOSS_RSN_R t = MAM_LOSS_RSN_R.create("T");
			int i = execDbCount("MABSL0330_MAM_LOSS_RSN_S01", t,
					t.itm_typ.eq(bind("itm_typ"))
							.and(t.itm_typ_d_cd.eq(bind("itm_typ_d_cd")))
							.and(t.loss_rsn_cd.neq(bind("loss_rsn_cd")))
							.and(t.def_disp_flg.eq(value(true)))
							.and(t.del_flg.eq(value(false))),
					r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_LOSS_RSN_R.$def_disp_flg, MABSL0123,
						r.itm_typ(), r.itm_typ_d_cd(), toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * LossRsn_DelChk01オペレーション.<p>
	 *
	 * ロス理由マスタの削除前のチェックを行います。<br>
	 */
	public class LossRsn_DelChk01 extends MABSL_LossRsnReg_MC_A.LossRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LossRsn_Del01オペレーション.<p>
	 *
	 * ロス理由マスタの削除を行います。<br>
	 */
	public class LossRsn_Del01 extends MABSL_LossRsnReg_MC_A.LossRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ロス理由マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_LossRsnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_LOSS_RSN_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_BIZ_RSN_R biz_rsn1 = MAM_BIZ_RSN_R.create(MAM_LOSS_RSN_R.$BIZ_RSN1);

			rslt.addBooleanColumn("fxd_loss_flg");
			builder.addSelect(biz_rsn1.fxd_loss_flg);
		}

		/**基準単位情報を下り電文にコピーする処理を追加しています。*/
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_LOSS_RSN_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.fxd_loss_flg(r_src.getBooleanNE("fxd_loss_flg"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ロス理由マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_LossRsnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ロス理由マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_LossRsnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}