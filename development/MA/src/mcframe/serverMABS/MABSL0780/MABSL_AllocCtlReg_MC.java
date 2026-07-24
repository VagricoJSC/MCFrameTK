package mcframe.serverMABS.MABSL0780;

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
import mcframe.serverMABS.MABSL0780.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_AllocCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_AllocCtlReg_MC extends MABSL_AllocCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AllocCtl_UpdChk01オペレーション.<p>
	 *
	 * 製造引当制御マスタの登録前のチェックを行います。<br>
	 */
	public class AllocCtl_UpdChk01 extends MABSL_AllocCtlReg_MC_A.AllocCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.to_loc_cd())),
					AllocCtl_UpdChk01_DtlR.$to_loc_cd));
			
			return msgLst;
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			
			for (MCConstRow row : up){
				if (!(row instanceof AllocCtl_UpdChk01_DtlR)) {
					continue;
				}
				
				AllocCtl_UpdChk01_DtlR r = (AllocCtl_UpdChk01_DtlR)row;
				
				if (r.del_flg()) {
					continue ;
				}
				
				if (!isNull(r.itm_cd()) || !isNull(r.itm_sub1()) 
						|| !isNull(r.itm_sub2()) || !isNull(r.itm_sub3())) {
					if (isNull(r.itm_cd()) || isNull(r.itm_sub1()) 
							|| isNull(r.itm_sub2())|| isNull(r.itm_sub3())) {
						msgList.add(new MCMessage(r, AllocCtl_UpdChk01_DtlR.$itm_cd, MABCL0322, 
								getLabel(r, AllocCtl_UpdChk01_DtlR.$itm_cd), toDispGUIIndex(r)));
					}
				}
				if (isSame(r.to_loc_cd(), r.fr_loc_cd())) {
					msgList.add(new MCMessage(r, AllocCtl_UpdChk01_DtlR.$fr_loc_cd, MABSL0097, toDispGUIIndex(r)));
				}
				else if (!isSame(r.to_wg_cd(), r.fr_wg_cd())) {
					msgList.add(new MCMessage(r, AllocCtl_UpdChk01_DtlR.$fr_loc_cd, MABSL0098, toDispGUIIndex(r)));
				}
				if (isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd()) && !isNull(r.xfr_lot_unit_qty())) {
					msgList.add(new MCMessage(r, AllocCtl_UpdChk01_DtlR.$xfr_lot_unit_qty, MABSL0096, toDispGUIIndex(r)));
				}
				if (!isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd()) && r.in_loc_flg()) {
					msgList.add(new MCMessage(r, AllocCtl_UpdChk01_DtlR.$in_loc_flg, MABSL0099, toDispGUIIndex(r)));
				}
				
				// 小数部有効桁数チェック
				if (!isNull(r.dec_place()) && !isNull(r.xfr_lot_unit_qty())) {
					msgList.addAll(checkDecPlace(r, AllocCtl_UpdChk01_DtlR.$dec_place, AllocCtl_UpdChk01_DtlR.$xfr_lot_unit_qty));
				}
			}
			
			return msgList;
		}
	}
	/**
	 * AllocCtl_Upd01オペレーション.<p>
	 *
	 * 製造引当制御マスタの登録を行います。<br>
	 */
	public class AllocCtl_Upd01 extends MABSL_AllocCtlReg_MC_A.AllocCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocCtl_DelChk01オペレーション.<p>
	 *
	 * 製造引当制御マスタの削除前のチェックを行います。<br>
	 */
	public class AllocCtl_DelChk01 extends MABSL_AllocCtlReg_MC_A.AllocCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.to_loc_cd())),
					AllocCtl_DelChk01_DtlR.$to_loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * AllocCtl_Del01オペレーション.<p>
	 *
	 * 製造引当制御マスタの削除を行います。<br>
	 */
	public class AllocCtl_Del01 extends MABSL_AllocCtlReg_MC_A.AllocCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造引当制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_AllocCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALLOC_CTL_R) {
				dbcCustomizeSub(builder);
			}
		}
						
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALLOC_CTL_R.$ITM1);
			/* DAC対応 */
			MAM_ALLOC_CTL_R t =MAM_ALLOC_CTL_R.create(builder.getBaseDbcAlias());
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");

			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
					.where( t.to_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
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
			
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC2);
			builder.addSelect(loc1.lg_grp_cd.as("to_lg_grp_cd"));
			builder.addSelect(loc2.lg_grp_cd.as("fr_lg_grp_cd"));
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addSelect(itm1.unit_cd);
			builder.addSelect(itm1.dec_place);
			
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_WG_R wg2 = MAM_WG_R.create("WG2");
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addLeftOuterJoin(wg2, loc2.wg_cd.eq(wg2.wg_cd));
			builder.addSelect(wg1.wg_cd.as("to_wg_cd"));
			builder.addSelect(wg1.wg_nm.as("to_wg_nm"));
			builder.addSelect(wg2.wg_cd.as("fr_wg_cd"));
			builder.addWhereWithCutOffAnd(wg1.wg_cd.like(bind(Srch01_CndR.$wg_cd)));
			builder.addWhereWithCutOffAnd(wg1.wg_nm.like(bind(Srch01_CndR.$wg_nm)));
			
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造引当制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_AllocCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造引当制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_AllocCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}