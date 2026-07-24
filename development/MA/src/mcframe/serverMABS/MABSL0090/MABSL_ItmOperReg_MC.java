package mcframe.serverMABS.MABSL0090;

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
import mcframe.serverMABS.MABSL0090.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmOperReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmOperReg_MC extends MABSL_ItmOperReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmOper_UpdChk01オペレーション.<p>
	 *
	 * 品目工程マスタの登録前のチェックを行います。<br>
	 */
	public class ItmOper_UpdChk01 extends MABSL_ItmOperReg_MC_A.ItmOper_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.loc_cd())),
					ItmOper_UpdChk01_DtlR.$loc_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (ItmOper_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 収率機能が無効の場合、各収率を強制クリアする
				if (isSame(getSysParm("YIELD_ENABLE_FLG"), "0")) {
					r.oper_lower_yield(null);
					r.oper_std_yield(null);
					r.oper_upper_yield(null);
				}

				// 条件付必須チェック
				if (isSame(r.oper_ptn(), MAC_STR.NULL_VAL.value())) {
					r.oper_ptn(null);
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$oper_ptn, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.oper_unit_cd())) {
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$oper_std_qty, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$oper_conv_qty, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$dec_place, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$unit_conv_rnd_typ, new FXUCL_RequiredValidater()));
				}
				if (r.yield_oper_flg()) {
					msgList.addAll(check(r, ItmOper_UpdChk01_DtlR.$yield_oper_ratio, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (isNull(r.oper_unit_cd())) {
					if (!isNull(r.oper_std_qty())) {
						msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$oper_std_qty, MABSL0030, toDispGUIIndex(r)));
					}
					if (!isNull(r.oper_conv_qty())) {
						msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$oper_conv_qty, MABSL0031, toDispGUIIndex(r)));
					}
					if (!isNull(r.dec_place())) {
						msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$dec_place, MABSL0032, toDispGUIIndex(r)));
					}
				}
				
				if (!r.yield_oper_flg() && !isNull(r.yield_oper_ratio())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$yield_oper_ratio, MABSL0033, toDispGUIIndex(r)));
				}

				if (isSame(r.itm_unit_cd(), r.oper_unit_cd())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$oper_unit_cd, MABSL0029, toDispGUIIndex(r)));
				}
				
				if (!isNull(r.itm_dec_place())){
					if (!isNull(r.oper_lt_add_qty())){
						msgList.addAll(checkDecPlace(r, ItmOper_UpdChk01_DtlR.$itm_dec_place, ItmOper_UpdChk01_DtlR.$oper_lt_add_qty));
					}
					if (!isNull(r.oper_offst_add_qty())){
						msgList.addAll(checkDecPlace(r, ItmOper_UpdChk01_DtlR.$itm_dec_place, ItmOper_UpdChk01_DtlR.$oper_offst_add_qty));
					}
					if (!isNull(r.oper_std_qty())){
						msgList.addAll(checkDecPlace(r, ItmOper_UpdChk01_DtlR.$itm_dec_place, ItmOper_UpdChk01_DtlR.$oper_std_qty));
					}
				}
				if (!isNull(r.oper_conv_qty()) && !isNull(r.dec_place())){
					msgList.addAll(checkDecPlace(r, ItmOper_UpdChk01_DtlR.$dec_place, ItmOper_UpdChk01_DtlR.$oper_conv_qty));
				}
				if (!isNullOrNullVal(r.oper_loc_wg_cd())){
					if (!isSame(r.wg_cd(), r.oper_loc_wg_cd())){
						msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$oper_loc_cd, MABSL0034, r.wg_cd(), r.oper_loc_wg_cd(), toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ()) && !isNull(r.sno1())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$sno1, MABSL0066,
							getLabel(r, ItmOper_UpdChk01_DtlR.$sno1), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ()) && !isNull(r.sno2())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$sno2, MABSL0066,
							getLabel(r, ItmOper_UpdChk01_DtlR.$sno2), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ()) && !isNull(r.sno3())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$sno3, MABSL0066,
							getLabel(r, ItmOper_UpdChk01_DtlR.$sno3), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ()) && !isNull(r.sno4())) {
					msgList.add(new MCMessage(r, ItmOper_UpdChk01_DtlR.$sno4, MABSL0066,
							getLabel(r, ItmOper_UpdChk01_DtlR.$sno4), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * ItmOper_Upd01オペレーション.<p>
	 *
	 * 品目工程マスタの登録を行います。<br>
	 */
	public class ItmOper_Upd01 extends MABSL_ItmOperReg_MC_A.ItmOper_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			setDefValue();
			super.up();
		}

		/**
		 * 製造承認機能が無効の場合、各収率を強制クリアする
		 */
		protected void setDefValue() {
			if (isSame(getSysParm("YIELD_ENABLE_FLG"),"0")) {
				for (ItmOper_UpdChk01_DtlR r : up0()) {
					r.oper_lower_yield(null);
					r.oper_std_yield(null);
					r.oper_upper_yield(null);
				}
			}
		}
	}
	/**
	 * ItmOper_DelChk01オペレーション.<p>
	 *
	 * 品目工程マスタの削除前のチェックを行います。<br>
	 */
	public class ItmOper_DelChk01 extends MABSL_ItmOperReg_MC_A.ItmOper_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.loc_cd())),
					ItmOper_DelChk01_DtlR.$loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * ItmOper_Del01オペレーション.<p>
	 *
	 * 品目工程マスタの削除を行います。<br>
	 */
	public class ItmOper_Del01 extends MABSL_ItmOperReg_MC_A.ItmOper_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目工程マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmOperReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_OPER_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
			addJoinTable(builder);
			addWhereTable(builder);
		}
		
		protected void addJoinTable(MCQueryApiBuilder builder) {
			
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_OPER_R.$ITM1);
			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addInnerJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
		}
		
		protected void addWhereTable(MCQueryApiBuilder builder) {

			MAM_ITM_OPER_R t = MAM_ITM_OPER_R.create(builder.getBaseDbcAlias());
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_OPER_R.$LOC1);
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or( exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
								.where( t.loc_cd.eq(S1RD_LOC1.loc_cd) ) )));
			}
			else if (up0().cmn_flg()) {
				String DefWgCd = getSysParm("DEF_WG_CD");
				if (!isNullOrNullVal(DefWgCd)) {
					builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(loc1.wg_cd.eq(bind("1"))), DefWgCd);
				}
				else {
					builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
				}
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
						.where( t.loc_cd.eq(S1RD_LOC1.loc_cd) )));
			}

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_OPER_R.$ITM1);
			builder.addWhereWithCutOffAnd(loc1.wg_cd.like(bind("wg_cd")));
			builder.addWhereWithCutOffAnd(loc1.wg_cd.eq(bind("nullval_wg_cd"))
					.or(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))));

			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
			
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
		}
	}
	
	protected void addSelectCmn(MCQueryApiBuilder builder) {
		
		MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_OPER_R.$LOC1);
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_OPER_R.$ITM1);
		
		MAM_WG_R wg1 = MAM_WG_R.create("WG1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_UNIT_R itmunit1 = MAM_UNIT_R.create("ITMUNIT1");
		
		builder.addSelect(loc1.wg_cd);
		builder.addSelect(wg1.wg_nm);
		builder.addSelect(itm1.unit_cd.as("itm_unit_cd"));
		builder.addSelect(itm1.dec_place.as("itm_dec_place"));
		builder.addSelect(itm1.sno1_mng_typ.as("sno1_mng_typ"));
		builder.addSelect(itm1.sno2_mng_typ.as("sno2_mng_typ"));
		builder.addSelect(itm1.sno3_mng_typ.as("sno3_mng_typ"));
		builder.addSelect(itm1.sno4_mng_typ.as("sno4_mng_typ"));
		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);
		builder.addSelect(itmunit1.unit_nm.as("itm_unit_nm"));
	}
	
	protected void addJoinTableCmn(MCQueryApiBuilder builder) {
		MAM_WG_R wg1 = MAM_WG_R.create("WG1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_UNIT_R itmunit1 = MAM_UNIT_R.create("ITMUNIT1");

		MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_OPER_R.$LOC1);
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_OPER_R.$ITM1);
		
		builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
		builder.addLeftOuterJoin(itmunit1, itm1.unit_cd.eq(itmunit1.unit_cd));
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		addSelectCmn(builder);
		addJoinTableCmn(builder);
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 品目工程マスタの検索を行います。<br>
	 */
	public class Sprt01 extends MABSL_ItmOperReg_MC_A.Sprt01 {
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
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目工程マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_ItmOperReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目工程マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmOperReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}