package mcframe.serverMABS.MABSL0180;

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
import mcframe.serverMABS.MABSL0180.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_InspSpecReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_InspSpecReg_MC extends MABSL_InspSpecReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspSpec_UpdChk01オペレーション.<p>
	 *
	 * 品目検査規格マスタの登録前のチェックを行います。<br>
	 */
	public class InspSpec_UpdChk01 extends MABSL_InspSpecReg_MC_A.InspSpec_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (InspSpec_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$ql_std_val,
							new FXUCL_RequiredValidater()));
				}
				else if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$unit_cd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$qn_int_digit,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
							new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.qn_out_min())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$sign_out_min_typ,
							new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sign_out_max_typ())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$qn_out_max,
							new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.qn_in_min())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$sign_in_min_typ,
							new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sign_in_max_typ())) {
					msgList.addAll(check(r, InspSpec_UpdChk01_DtlR.$qn_in_max,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					if (!isNull(r.ql_std_val())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$ql_std_val,
								MABSL0006, toDispGUIIndex(r)));
					}
					if (isNull(r.qn_out_min()) && isNull(r.qn_out_max())
							&& isNull(r.qn_in_min()) && isNull(r.qn_in_max())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_min,
								MABSL0009, toDispGUIIndex(r)));
					}
				}
				if (MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
					if (!isNull(r.unit_cd())) {
						msgList.add(
								getMsg(r, InspSpec_UpdChk01_DtlR.$unit_cd, MABSL0007));
					}
					if (!isNull(r.qn_int_digit())) {
						msgList.add(getMsg(r, InspSpec_UpdChk01_DtlR.$qn_int_digit,
								MABSL0007));
					}
					if (!isNull(r.qn_int_frac())) {
						msgList.add(getMsg(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
								MABSL0007));
					}
					if (!isNull(r.qn_out_min())) {
						msgList.add(
								getMsg(r, InspSpec_UpdChk01_DtlR.$qn_out_min, MABSL0007));
					}
					if (!isNull(r.sign_out_max_typ())) {
						msgList.add(getMsg(r, InspSpec_UpdChk01_DtlR.$sign_out_max_typ,
								MABSL0007));
					}
					if (!isNull(r.qn_in_min())) {
						msgList.add(
								getMsg(r, InspSpec_UpdChk01_DtlR.$qn_in_min, MABSL0007));
					}
					if (!isNull(r.sign_in_max_typ())) {
						msgList.add(getMsg(r, InspSpec_UpdChk01_DtlR.$sign_in_max_typ,
								MABSL0007));
					}
				}
				if (isNull(r.qn_out_min())) {
					if (!isNull(r.sign_out_min_typ())) {
						msgList.add(
								new MCMessage(r, InspSpec_UpdChk01_DtlR.$sign_out_min_typ,
										MABSL0055, toDispGUIIndex(r)));
					}
				}
				if (isEqOrNe(r.sign_out_min_typ())) {
					if (!isNull(r.sign_out_max_typ())) {
						msgList.add(
								new MCMessage(r, InspSpec_UpdChk01_DtlR.$sign_out_max_typ,
										MABSL0014, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.sign_out_max_typ())) {
					if (!isNull(r.qn_out_max())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_max,
								MABSL0056, toDispGUIIndex(r)));
					}
				}
				if (isEqOrNe(r.sign_out_max_typ())) {
					if (!isNull(r.qn_out_min())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_min,
								MABSL0013, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.qn_in_min())) {
					if (!isNull(r.sign_in_min_typ())) {
						msgList.add(
								new MCMessage(r, InspSpec_UpdChk01_DtlR.$sign_in_min_typ,
										MABSL0057, toDispGUIIndex(r)));
					}
				}
				if (isEqOrNe(r.sign_in_min_typ())) {
					if (!isNull(r.sign_in_max_typ())) {
						msgList.add(
								new MCMessage(r, InspSpec_UpdChk01_DtlR.$sign_in_max_typ,
										MABSL0016, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.sign_in_max_typ())) {
					if (!isNull(r.qn_in_max())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_in_max,
								MABSL0058, toDispGUIIndex(r)));
					}
				}
				if (isEqOrNe(r.sign_in_max_typ())) {
					if (!isNull(r.qn_in_min())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_in_min,
								MABSL0015, toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.qn_out_min()) && !isNull(r.qn_int_digit())) {
					if (isOverIntDigit(r.qn_out_min(), r.qn_int_digit())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_min,
								MABSL0114, r.qn_out_min(), r.qn_int_digit(),
								toDispGUIIndex(r)));
					}

					msgList.addAll(checkDecPlace(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
							InspSpec_UpdChk01_DtlR.$qn_out_min));
				}
				if (!isNull(r.qn_out_max()) && !isNull(r.qn_int_digit())) {
					if (isOverIntDigit(r.qn_out_max(), r.qn_int_digit())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_max,
								MABSL0116, r.qn_out_max(), r.qn_int_digit(),
								toDispGUIIndex(r)));
					}

					msgList.addAll(checkDecPlace(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
							InspSpec_UpdChk01_DtlR.$qn_out_max));
				}
				if (!isNull(r.qn_in_min()) && !isNull(r.qn_int_digit())) {
					if (isOverIntDigit(r.qn_in_min(), r.qn_int_digit())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_in_min,
								MABSL0118, r.qn_in_min(), r.qn_int_digit(),
								toDispGUIIndex(r)));
					}

					msgList.addAll(checkDecPlace(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
							InspSpec_UpdChk01_DtlR.$qn_in_min));
				}
				if (!isNull(r.qn_in_max()) && !isNull(r.qn_int_digit())) {
					if (isOverIntDigit(r.qn_in_max(), r.qn_int_digit())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_in_max,
								MABSL0120, r.qn_in_max(), r.qn_int_digit(),
								toDispGUIIndex(r)));
					}

					msgList.addAll(checkDecPlace(r, InspSpec_UpdChk01_DtlR.$qn_int_frac,
							InspSpec_UpdChk01_DtlR.$qn_in_max));
				}
				if (!isNull(r.qn_out_min()) && !isNull(r.qn_out_max())) {
					if (r.qn_out_min().gte(r.qn_out_max())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_out_max,
								MABSL0115, toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.qn_in_min()) && !isNull(r.qn_in_max())) {
					if (r.qn_in_min().gte(r.qn_in_max())) {
						msgList.add(new MCMessage(r, InspSpec_UpdChk01_DtlR.$qn_in_max,
								MABSL0117, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}

		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(InspSpec_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}

		protected boolean isOverIntDigit(MCNumber qn, MCNumber digit) {
			return qn.precision() - qn.scale() > digit.intValue();
		}
	}

	/**
	 * InspSpec_Upd01オペレーション.<p>
	 *
	 * 品目検査規格マスタの登録を行います。<br>
	 */
	public class InspSpec_Upd01 extends MABSL_InspSpecReg_MC_A.InspSpec_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * InspSpec_DelChk01オペレーション.<p>
	 *
	 * 品目検査規格マスタの削除前のチェックを行います。<br>
	 */
	public class InspSpec_DelChk01 extends MABSL_InspSpecReg_MC_A.InspSpec_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * InspSpec_Del01オペレーション.<p>
	 *
	 * 品目検査規格マスタの削除を行います。<br>
	 */
	public class InspSpec_Del01 extends MABSL_InspSpecReg_MC_A.InspSpec_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目検査規格マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_InspSpecReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_INSP_SPEC_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_INSP_SPEC_R.$ITM1);

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
	 * 品目検査規格マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_InspSpecReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目検査規格マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_InspSpecReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected boolean isEqOrNe(String typ) {
		return (MAC_SIGN_TYP.isEQ(typ) || MAC_SIGN_TYP.isNE(typ));
	}

	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {

		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_INSP_SPEC_R.$ITM1);

		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);

		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 品目検査規格マスタの検索を行います。<br>
	 */
	public class Sprt01 extends MABSL_InspSpecReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
						MCQueryApiBuilder builder, MCList<R> rslt) {
				super.dbcCustomize(builder, rslt);
				dbcCustomizeCommon(builder);
		}
	}

	//FMCB CUSTOM END
}