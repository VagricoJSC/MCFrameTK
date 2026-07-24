package mcframe.serverMABC.MABCL0880;

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
import mcframe.serverMABC.MABCL0880.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SundryItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SundryItmReg_MC extends MABCL_SundryItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SundryItm_UpdChk01オペレーション.<p>
	 *
	 * 諸口品マスタの登録前のチェックを行います。<br>
	 */
	public class SundryItm_UpdChk01 extends MABCL_SundryItmReg_MC_A.SundryItm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}		
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			for(SundryItm_UpdChk01_DtlR row : up0()){
				if (MAC_SNO_MNG_TYP.isNOT_MNG(row.sno1_mng_typ())) {
					if (!isNullOrNullVal(row.sno1())) {
						msgL.add(new MCMessage(row, SundryItm_UpdChk01_DtlR.$sno1, MABCL0253, toDispGUIIndex(row)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(row.sno2_mng_typ())) {
					if (!isNullOrNullVal(row.sno2())) {
						msgL.add(new MCMessage(row, SundryItm_UpdChk01_DtlR.$sno2, MABCL0254, toDispGUIIndex(row)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(row.sno3_mng_typ())) {
					if (!isNullOrNullVal(row.sno3())) {
						msgL.add(new MCMessage(row, SundryItm_UpdChk01_DtlR.$sno3, MABCL0255, toDispGUIIndex(row)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(row.sno4_mng_typ())) {
					if (!isNullOrNullVal(row.sno4())) {
						msgL.add(new MCMessage(row, SundryItm_UpdChk01_DtlR.$sno4, MABCL0256, toDispGUIIndex(row)));
					}
				}
			}
			return msgL;
		}
	}
	/**
	 * SundryItm_Upd01オペレーション.<p>
	 *
	 * 諸口品マスタの登録を行います。<br>
	 */
	public class SundryItm_Upd01 extends MABCL_SundryItmReg_MC_A.SundryItm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SundryItm_DelChk01オペレーション.<p>
	 *
	 * 諸口品マスタの削除前のチェックを行います。<br>
	 */
	public class SundryItm_DelChk01 extends MABCL_SundryItmReg_MC_A.SundryItm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SundryItm_Del01オペレーション.<p>
	 *
	 * 諸口品マスタの削除を行います。<br>
	 */
	public class SundryItm_Del01 extends MABCL_SundryItmReg_MC_A.SundryItm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 諸口品マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_SundryItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 諸口品マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_SundryItmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 諸口品マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SundryItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SUNDRY_ITM_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_SUNDRY_ITM_R.$ITM1);

			// 品目区分、品目区分詳細
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);
			
			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));			
			builder.addWhereWithCutOffAnd(itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
			
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
			
			builder.addSelect(itm1.sno1_mng_typ.as("sno1_mng_typ"));
			builder.addSelect(itm1.sno2_mng_typ.as("sno2_mng_typ"));
			builder.addSelect(itm1.sno3_mng_typ.as("sno3_mng_typ"));
			builder.addSelect(itm1.sno4_mng_typ.as("sno4_mng_typ"));
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_SUNDRY_ITM_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.itm_typ(r_src.getStringNE("itm_typ"));
			r_dest.itm_typ_d_cd(r_src.getStringNE("itm_typ_d_cd"));
			r_dest.itm_typ_d_nm(r_src.getStringNE("itm_typ_d_nm"));
			r_dest.sno1_mng_typ(r_src.getStringNE("sno1_mng_typ"));
			r_dest.sno2_mng_typ(r_src.getStringNE("sno2_mng_typ"));
			r_dest.sno3_mng_typ(r_src.getStringNE("sno3_mng_typ"));
			r_dest.sno4_mng_typ(r_src.getStringNE("sno4_mng_typ"));
		}
	}

	//FMCB CUSTOM END
}