package mcframe.serverMABG.MABGL0630;

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
import mcframe.serverMABG.MABGL0630.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_XpnsPurcAlcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_XpnsPurcAlcReg_MC extends MABGL_XpnsPurcAlcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * XpnsPurcAlc_UpdChk01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの登録前のチェックを行います。<br>
	 */
	public class XpnsPurcAlc_UpdChk01 extends MABGL_XpnsPurcAlcReg_MC_A.XpnsPurcAlc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up) {
				if (!(row instanceof XpnsPurcAlc_UpdChk01_DtlR)) {
					break;
				}
				XpnsPurcAlc_UpdChk01_DtlR r = (XpnsPurcAlc_UpdChk01_DtlR) row;
				MAM_XPNS_PURC_ALC_R carcRptPtnR = MAM_XPNS_PURC_ALC_R.create();
				MCQueryApiBuilder carcRptPtnR_bldr = MCQueryApiBuilder.create(MAM_XPNS_PURC_ALC_R.create("T"));
				dbSelectKey("MABGL0630_MAM_XPNS_PURC_ALC_S01", carcRptPtnR, carcRptPtnR_bldr, r);
				
				if (r.dpt_flg() && !isNull(r.dpt_cd())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$dpt_cd, MABGL0005, r.dpt_cd()));
				}
				if (r.bp_flg() && !isNull(r.bp_cd())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$bp_cd, MABGL0006 , r.bp_cd()));
				}
				if (r.lot_no_flg() && !isNull(r.lot_no())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$lot_no, MABGL0007 ,r.lot_no()));
				}
				if (r.sublot_no_flg() && !isNull(r.sublot_no())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$sublot_no, MABGL0008, r.sublot_no()));
				}
				if (r.sno1_flg() && !isNull(r.sno1())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$sno1, MABGL0009, r.sno1()));
				}
				if (r.sno2_flg() && !isNull(r.sno2())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$sno2, MABGL0010, r.sno2()));
				}
				if (r.sno3_flg() && !isNull(r.sno3())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$sno3, MABGL0011 ,r.sno3()));
				}
				if (r.sno4_flg() && !isNull(r.sno4())) {
					msgList.add(getMsg(row, XpnsPurcAlc_UpdChk01_DtlR.$sno4, MABGL0103 ,r.sno4()));
				}
				
			}
			return msgList;
		}
		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(MCConstRow r, String col, String id, String name) {
			return new MCMessage(r, col, id, name, toDispGUIIndex(r));
		}
		
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),XpnsPurcAlc_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * XpnsPurcAlc_Upd01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの登録を行います。<br>
	 */
	public class XpnsPurcAlc_Upd01 extends MABGL_XpnsPurcAlcReg_MC_A.XpnsPurcAlc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * XpnsPurcAlc_DelChk01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの削除前のチェックを行います。<br>
	 */
	public class XpnsPurcAlc_DelChk01 extends MABGL_XpnsPurcAlcReg_MC_A.XpnsPurcAlc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),XpnsPurcAlc_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * XpnsPurcAlc_Del01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの削除を行います。<br>
	 */
	public class XpnsPurcAlc_Del01 extends MABGL_XpnsPurcAlcReg_MC_A.XpnsPurcAlc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_XpnsPurcAlcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
					MCList<R> rslt) {
				super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_XPNS_PURC_ALC_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			// Srch01、Sprt01共通
			dbcCustomizeCommon(builder);
			
			MAM_TERM_R term = MAM_TERM_R.create("TERM");
			MAM_COST_DPT_R dpt = MAM_COST_DPT_R.create("DPT");
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_XPNS_PURC_ALC_R t = MAM_XPNS_PURC_ALC_R.create(builder.getBaseDbcAlias());
			builder.addSelect(dpt.dpt_nm);
			builder.addLeftOuterJoin(term, t.st_dt.gte(term.term)
					.and(t.st_dt.lt(term.term_end_ym)));
			builder.addLeftOuterJoin(dpt, term.term.eq(dpt.term)
					.and(t.dpt_cd.eq(dpt.dpt_cd)));
			builder.addWhereWithAnd(exists( subQuery()
					.select(S1WG2.prAll()) .from(S1WG2) 
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
						
			// 品目区分と品目区分詳細
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_XPNS_PURC_ALC_R.$ITM1);
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

		}
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_XPNS_PURC_ALC_R.$ITM1);
		
		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itm_typ_d1.itm_typ_d_nm);
		builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_XpnsPurcAlcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 経費配賦振替マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_XpnsPurcAlcReg_MC_A.Del01 {
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
	public class Sprt01 extends MABGL_XpnsPurcAlcReg_MC_A.Sprt01 {
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