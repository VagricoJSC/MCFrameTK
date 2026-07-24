package mcframe.serverMABS.MABSL0190;

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
import mcframe.serverMABS.MABSL0190.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmInspReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmInspReg_MC extends MABSL_ItmInspReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmInsp_DelChk01オペレーション.<p>
	 *
	 * 品目品管マスタの削除前のチェックを行います。<br>
	 */
	public class ItmInsp_DelChk01 extends MABSL_ItmInspReg_MC_A.ItmInsp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * ItmInsp_Del01オペレーション.<p>
	 *
	 * 品目品管マスタの削除を行います。<br>
	 */
	public class ItmInsp_Del01 extends MABSL_ItmInspReg_MC_A.ItmInsp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目品管マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmInspReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * ItmInsp_UpdChk01オペレーション.<p>
	 *
	 * 品目品管マスタの登録前のチェックを行います。<br>
	 */
	public class ItmInsp_UpdChk01 extends MABSL_ItmInspReg_MC_A.ItmInsp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();
			editUp();
		}

		protected void editUp() {
			for (ItmInsp_UpdChk01_DtlR r : up0()) {
				setDefault(r);
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (ItmInsp_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.lmt_ctl_flg()) {
					msgList.addAll(check(r, ItmInsp_UpdChk01_DtlR.$lmt_dt_frm_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmInsp_UpdChk01_DtlR.$vld_pd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmInsp_UpdChk01_DtlR.$lmt_pd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmInsp_UpdChk01_DtlR.$calc_pd_typ,
							new FXUCL_RequiredValidater()));
				}
				if (!r.no_insp_flg()) {
					msgList.addAll(check(r, ItmInsp_UpdChk01_DtlR.$insp_ptn_cd,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!isNullOrNullVal(r.mfg_loc_cd())) {
					if (!isNullOrNullVal(r.to_site_cd())) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$to_site_cd,
								MABSL0018, toDispGUIIndex(r)));
					}
				}
				if (isNullOrNullVal(r.sppl_cd())) {
					if (!isNullOrNullVal(r.maker_cd())) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$maker_cd,
								MABSL0017, toDispGUIIndex(r)));
					}
				}
				else {
					if (!isNullOrNullVal(r.to_site_cd())) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$to_site_cd,
								MABSL0018, toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.lmt_dt_frm_typ())
						&& MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
					msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$lmt_dt_frm_typ,
							MABSL0026, toDispGUIIndex(r)));
				}
				if (r.no_insp_flg()) {
					if (!isNull(r.insp_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$insp_ptn_cd,
								MABSL0019, toDispGUIIndex(r)));
					}
					if (r.pre_insp_valid_flg()) {
						msgList.add(new MCMessage(r,
								ItmInsp_UpdChk01_DtlR.$pre_insp_valid_flg, MABSL0027,
								toDispGUIIndex(r)));
					}
					if (!isNull(r.lmt_dt_frm_typ()) && r.lmt_ctl_flg()) { //期限管理対象ＦＬＧがオフの場合はMABSL0020でチェックする
						if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP.isMANUAL(r.lmt_dt_frm_typ())) {
							msgList.add(new MCMessage(r,
									ItmInsp_UpdChk01_DtlR.$lmt_dt_frm_typ, MABSL0137,
									toDispGUIIndex(r)));
						}
					}
				}
				if (!isNullOrNullVal(r.from_site_cd())) {
					if (isSame(r.from_site_cd(), r.to_site_cd())) {
						msgList.add(
								new MCMessage(r, ItmInsp_UpdChk01_DtlR.$lmt_dt_frm_typ,
										MABSL0100, toDispGUIIndex(r)));
					}
				}
				if (!r.lmt_ctl_flg()) {
					if (!isNull(r.lmt_dt_frm_typ())) {
						if (!(MAC_LMT_DT_FRM_TYP.isMFG_ST(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP.isARR_DT(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP
										.isDPND_CHLD_FR_DT(r.lmt_dt_frm_typ()))) {
							msgList.add(new MCMessage(r,
									ItmInsp_UpdChk01_DtlR.$lmt_dt_frm_typ, MABSL0020,
									toDispGUIIndex(r)));
						}
					}

					if (!r.vld_pd().isZero()) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$vld_pd,
								MABSL0021, toDispGUIIndex(r)));
					}
					if (!r.lmt_pd().isZero()) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$lmt_pd,
								MABSL0022, toDispGUIIndex(r)));
					}
					if (!isNull(r.lot_insp_vld_pd())) {
						msgList.add(new MCMessage(r,
								ItmInsp_UpdChk01_DtlR.$lot_insp_vld_pd, MABSL0023,
								getLabel(r, ItmInsp_UpdChk01_DtlR.$lot_insp_vld_pd),
								toDispGUIIndex(r)));
					}
					if (!isNull(r.calc_pd_typ())) {
						msgList.add(new MCMessage(r, ItmInsp_UpdChk01_DtlR.$calc_pd_typ,
								MABSL0023,
								getLabel(r, ItmInsp_UpdChk01_DtlR.$calc_pd_typ),
								toDispGUIIndex(r)));
					}
					if (!isNull(r.lot_insp_lmt_dt_frm_typ())) {
						msgList.add(new MCMessage(r,
								ItmInsp_UpdChk01_DtlR.$lot_insp_lmt_dt_frm_typ, MABSL0023,
								getLabel(r,
										ItmInsp_UpdChk01_DtlR.$lot_insp_lmt_dt_frm_typ),
								toDispGUIIndex(r)));
					}
				}
				else {
					if (!isNull(r.lot_insp_lmt_dt_frm_typ()) && !(MAC_LMT_DT_FRM_TYP
							.isINSP_JUDG(r.lot_insp_lmt_dt_frm_typ())
							|| MAC_LMT_DT_FRM_TYP
									.isVALID_DT(r.lot_insp_lmt_dt_frm_typ()))) {
						msgList.add(new MCMessage(r,
								ItmInsp_UpdChk01_DtlR.$lot_insp_lmt_dt_frm_typ, MABSL0025,
								toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}

	/**
	 * ItmInsp_Upd01オペレーション.<p>
	 *
	 * 品目品管マスタの登録を行います。<br>
	 */
	public class ItmInsp_Upd01 extends MABSL_ItmInspReg_MC_A.ItmInsp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			editUp();
			super.up();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			for (ItmInsp_UpdChk01_DtlR r : up0()) {
				setDefault(r);
			}
		}
	}

	/**
	 * チェック前・更新前にデフォルト値を設定します。<p>
	 */
	protected void setDefault(ItmInsp_UpdChk01_DtlR r) {
		// デフォルト値設定
		if (isNull(r.vld_pd())) {
			r.vld_pd(MCNumber.ZERO);
		}
		if (isNull(r.lmt_pd())) {
			r.lmt_pd(MCNumber.ZERO);
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目品管マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmInspReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_INSP_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_INSP_R.$ITM1);

			if (!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if (!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if (!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if (!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if (!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if (!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if (!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if (!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if (!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if (!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));

			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			builder.addWhereWithCutOffAnd(
					itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目品管マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ItmInspReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_INSP_R.$ITM1);

		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);

		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));

	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_ItmInspReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder);
		}
	}

	//FMCB CUSTOM END
}