package mcframe.serverMSBC.MSBCL0140;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0140.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBF.MSBFL5010.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_PrcdOrdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_PrcdOrdReg_MC extends MSBCL_PrcdOrdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_PrcdOrdReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			if (srchHdr() > 0) {
				srchDtl();
			}
		}

		/** 先行手配オーダ検索(オーダ生成区分：「計画外」以外) */
		protected int srchHdr() {
			return executeQuery(down0(), MSBCL0140_MST_PRCD_ITM_ORDER_S01(), up0());
		}

		/** 先行手配工程オーダ検索(「製造」かつ「デフォルト工程以外」) */
		protected int srchDtl() {
			if(!MSC_ITM_ORD_TYP.isMFG(down0().itm_ord_typ())
					|| isNullOrNullVal(down0().oper_ptn())) {
				return 0;
			}
			return executeQuery(down1(), MSBCL0140_MST_PRCD_OPER_ORDER_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editDown(down0(), down1());
		}

		protected void editDown(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
			//有効成分計算
			calcContFctrQty(hdrR, dtlL);

			//検査対象取得
			callInspSchdSrch01Srv(hdrR, dtlL);

			//工程管理単位数
			calcOperUnitQty(hdrR, dtlL);
		}

		/** 標準有効成分数量を算出する */
		protected void calcContFctrQty(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
			if(hdrR.cont_fctr_flg()) {
				hdrR.cont_fctr_inst_qty(convToContFctrUnit(hdrR.inst_qty(), hdrR.std_cont_fctr(),
					hdrR.cont_fctr_dec_place(), hdrR.cont_fctr_rnd_typ()));
				hdrR.cont_fctr_schd_yield(convToContFctrUnit(hdrR.yield_schd_qty(),
						hdrR.std_cont_fctr(), hdrR.cont_fctr_dec_place(), hdrR.cont_fctr_rnd_typ()));
			}
		}

		/** 検査対象であるかを取得する */
		protected void callInspSchdSrch01Srv(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {

			if (!isInspChk(hdrR)){
				return;
			}

			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			InspSchd_Srch01_CndR up = InspSchd_Srch01_CndR.create();
			copy(up, hdrR, createMap_InspSchd_Srch01_CndR_Srch01_HdrR());
			ope.up0().add(up);
			ope.exec();

			//検査対象でなければ下り電文に含まれない
			if (ope.down0().size() > 0) {
				hdrR.insp_flg(true);
			}
		}

		/** 検査対象のオーダとなり得るかどうかを返す */
		protected boolean isInspChk(Srch01_HdrR r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
		}

		/** 工程管理単位換算数量を算出する */
		protected void calcOperUnitQty(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
			for(Srch01_DtlR dtlR: dtlL) {
				if(!isSame(dtlR.base_unit_cd(), dtlR.oper_unit_cd())) {
					dtlR.oper_conv_schd_qty(getOperUnitQty(dtlR));
				}
				else {
					dtlR.oper_conv_schd_qty(dtlR.oper_schd_qty());
				}
			}
		}

		protected MCNumber getOperUnitQty(Srch01_DtlR r) {
			return convQtyBaseToOper(r.oper_schd_qty(), r.oper_conv_qty(),
					r.oper_std_qty(), r.dec_place(), r.unit_conv_rnd_typ());
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Srch01_HdrR<InspSchd_Srch01_CndR, Srch01_HdrR> createMap_InspSchd_Srch01_CndR_Srch01_HdrR() {
			return new Map_InspSchd_Srch01_CndR_Srch01_HdrR<InspSchd_Srch01_CndR, Srch01_HdrR>();
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Srch01_HdrR<D extends InspSchd_Srch01_CndR, S extends Srch01_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Srch01_HdrR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Srch01_HdrR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Srch01_HdrR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Srch01_HdrR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Srch01_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Srch01_HdrR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Srch01_HdrR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Srch01_HdrR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Srch01_HdrR.$strg_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.peg_no(MCNumber.ZERO);
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBCL_PrcdOrdReg_MC_A.Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			// 予定日計算サービス呼び出し
			callOrdSprtSrv();

			// 下り電文設定
			setDown();
		}

		protected void editUp() {
			setUpDt();
			setNullVal();
		}

		/** 日付計算の基準日を設定 */
		protected void setUpDt() {
			Sprt01_CndR up = up0().clone();
			up0().po_schd_dt(null);
			up0().mfg_st_schd_dt(null);
			up0().mfg_end_schd_dt(null);
			up0().gi_schd_dt(null);
			up0().strg_schd_dt(null);
			up0().accpt_schd_dt(null);
			up0().insp_st_schd_dt(null);
			up0().insp_end_schd_dt(null);
			up0().avl_schd_dt(null);

			if(!isNull(up.po_schd_dt())) {
				up0().po_schd_dt(up.po_schd_dt());
			}
			else if(!isNull(up.mfg_st_schd_dt())) {
				up0().mfg_st_schd_dt(up.mfg_st_schd_dt());
			}
			else if(!isNull(up.mfg_end_schd_dt())) {
				up0().mfg_end_schd_dt(up.mfg_end_schd_dt());
			}
			else if(!isNull(up.gi_schd_dt())) {
				up0().gi_schd_dt(up.gi_schd_dt());
			}
			else if(!isNull(up.strg_schd_dt())) {
				up0().strg_schd_dt(up.strg_schd_dt());
			}
			else if(!isNull(up.accpt_schd_dt())) {
				up0().accpt_schd_dt(up.accpt_schd_dt());
			}
			else if(!isNull(up.insp_st_schd_dt())) {
				up0().insp_st_schd_dt(up.insp_st_schd_dt());
			}
			else if(!isNull(up.insp_end_schd_dt())) {
				up0().insp_end_schd_dt(up.insp_end_schd_dt());
			}
			else if(!isNull(up.avl_schd_dt())) {
				up0().avl_schd_dt(up.avl_schd_dt());
			}
		}

		/** NULL文字補完 */
		protected void setNullVal() {
			if (isNull(up0().mfg_loc_cd())) {
				up0().mfg_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(up0().sppl_cd())) {
				up0().sppl_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(up0().maker_cd())) {
				up0().maker_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(up0().rqst_loc_cd())) {
				up0().rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(up0().bom_ptn())) {
				up0().bom_ptn(MAC_STR.NULL_VAL.value());
			}
		}

		/** 予定日計算サービスを実行する */
		protected void callOrdSprtSrv() {

			MSBCL_OrdRegService.Ord_Sprt03 ope = MSBCL_OrdRegService.crtOrd_Sprt03();
			Ord_Sprt03_DtlR upR = Ord_Sprt03_DtlR.create();
			copy(upR, up0(), createMap_Ord_Sprt03_DtlR_Sprt01_CndR());
			ope.up0().add(upR);

			ope.exec();

			Ord_Sprt03_RsltR rslt = ope.down0().get(0);
			up0().accpt_insp_lt(rslt.accpt_insp_lt());
			up0().po_schd_dt(rslt.po_schd_dt());
			up0().purc_lt(rslt.purc_lt());
			up0().gi_schd_dt(rslt.gi_schd_dt());
			up0().mfg_st_schd_dt(rslt.mfg_st_schd_dt());
			up0().mfg_lt(rslt.mfg_lt());
			up0().mfg_end_schd_dt(rslt.mfg_end_schd_dt());
			up0().xfr_lt(rslt.xfr_lt());
			up0().strg_schd_dt(rslt.strg_schd_dt());
			up0().accpt_insp_lt(rslt.accpt_insp_lt());
			up0().accpt_schd_dt(rslt.accpt_schd_dt());
			if(!isNull(rslt.insp_lt())) {
				up0().insp_offst(rslt.insp_offst());
				up0().insp_flg(true);
			}
			else {
				up0().insp_flg(false);
			}
			up0().insp_st_schd_dt(rslt.insp_st_schd_dt());
			up0().insp_lt(rslt.insp_lt());
			up0().insp_end_schd_dt(rslt.insp_end_schd_dt());
			if (isNull(up0().avl_schd_dt())) {
				up0().avl_schd_dt(rslt.avl_schd_dt());
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/** Sprt01_CndR → Ord_Sprt03_DtlR (Sprt01 → Ord_Sprt03) */
		protected Map_Ord_Sprt03_DtlR_Sprt01_CndR<Ord_Sprt03_DtlR, Sprt01_CndR> createMap_Ord_Sprt03_DtlR_Sprt01_CndR() {
			return new Map_Ord_Sprt03_DtlR_Sprt01_CndR<Ord_Sprt03_DtlR, Sprt01_CndR>();
		}

		/** Sprt01_CndR → Ord_Sprt03_DtlR (Sprt01 → Ord_Sprt03) */
		public class Map_Ord_Sprt03_DtlR_Sprt01_CndR<D extends Ord_Sprt03_DtlR, S extends Sprt01_CndR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_ord_typ, Sprt01_CndR.$itm_ord_typ);
				addColumnPathMap(Ord_Sprt03_DtlR.$po_schd_dt, Sprt01_CndR.$po_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$gi_schd_dt, Sprt01_CndR.$gi_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_st_schd_dt, Sprt01_CndR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_end_schd_dt, Sprt01_CndR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, Sprt01_CndR.$strg_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$accpt_schd_dt, Sprt01_CndR.$accpt_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_st_schd_dt, Sprt01_CndR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_end_schd_dt, Sprt01_CndR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, Sprt01_CndR.$avl_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Sprt01_CndR.$master_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Sprt01_CndR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Sprt01_CndR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Sprt01_CndR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Sprt01_CndR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Sprt01_CndR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, Sprt01_CndR.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, Sprt01_CndR.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd, Sprt01_CndR.$rqst_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Sprt01_CndR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Sprt01_CndR.$strg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Sprt01_CndR.$inst_qty);
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 */
	public class Sprt02 extends MSBCL_PrcdOrdReg_MC_A.Sprt02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			// 工程オーダ展開サービス呼び出し
			callOrdSprtSrv();

			// 下り電文編集
			editDown();
		}

		protected void editUp() {
			// N/A.
		}

		/** 工程オーダ展開サービスを実行する */
		protected void callOrdSprtSrv() {
			MSBCL_OrdRegService.Ord_Sprt01 ope = MSBCL_OrdRegService.crtOrd_Sprt01();
			Ord_Sprt01_DtlR upR = Ord_Sprt01_DtlR.create();
			copy(upR, up0(), createMap_Ord_Sprt01_DtlR_Sprt02_CndR());
			ope.up0().add(upR);
			ope.exec();

			//デフォルト工程は除外
			for(Ord_Sprt01_RsltR r: ope.down0()) {
				if(MAC_STR.isNULL_VAL(r.oper_cd())) {
					return;
				}
			}

			addAll(down0(), ope.down0(), createMap_Sprt02_RsltR_Ord_Sprt01_RsltR());
		}

		protected void editDown() {
			doCompTime(down0(), false);
		}

		/** Sprt02_CndR → Ord_Sprt01_DtlR (Sprt02 → Ord_Sprt01) */
		protected Map_Ord_Sprt01_DtlR_Sprt02_CndR<Ord_Sprt01_DtlR, Sprt02_CndR> createMap_Ord_Sprt01_DtlR_Sprt02_CndR() {
			return new Map_Ord_Sprt01_DtlR_Sprt02_CndR<Ord_Sprt01_DtlR, Sprt02_CndR>();
		}

		/** Sprt02_CndR → Ord_Sprt01_DtlR (Sprt02 → Ord_Sprt01) */
		public class Map_Ord_Sprt01_DtlR_Sprt02_CndR<D extends Ord_Sprt01_DtlR, S extends Sprt02_CndR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_ord_typ, Sprt02_CndR.$itm_ord_typ);
				addColumnPathMap(Ord_Sprt01_DtlR.$bom_ptn, Sprt02_CndR.$bom_ptn);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_cd, Sprt02_CndR.$itm_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub1, Sprt02_CndR.$itm_sub1);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub2, Sprt02_CndR.$itm_sub2);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub3, Sprt02_CndR.$itm_sub3);
				addColumnPathMap(Ord_Sprt01_DtlR.$inst_qty, Sprt02_CndR.$inst_qty);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_loc_cd, Sprt02_CndR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$oper_ptn, Sprt02_CndR.$oper_ptn);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno1, Sprt02_CndR.$sno1);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno2, Sprt02_CndR.$sno2);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno3, Sprt02_CndR.$sno3);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno4, Sprt02_CndR.$sno4);
				addColumnPathMap(Ord_Sprt01_DtlR.$master_dt, Sprt02_CndR.$master_dt);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_st_schd_dt, Sprt02_CndR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_end_schd_dt, Sprt02_CndR.$mfg_end_schd_dt);
			}
		}

		/** Ord_Sprt01_RsltR → Sprt02_RsltR (Ord_Sprt01 → Sprt02) */
		protected Map_Sprt02_RsltR_Ord_Sprt01_RsltR<Sprt02_RsltR, Ord_Sprt01_RsltR> createMap_Sprt02_RsltR_Ord_Sprt01_RsltR() {
			return new Map_Sprt02_RsltR_Ord_Sprt01_RsltR<Sprt02_RsltR, Ord_Sprt01_RsltR>();
		}

		/** Ord_Sprt01_RsltR → Sprt02_RsltR (Ord_Sprt01 → Sprt02) */
		public class Map_Sprt02_RsltR_Ord_Sprt01_RsltR<D extends Sprt02_RsltR, S extends Ord_Sprt01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sprt02_RsltR.$oper_ord_sts_typ, Ord_Sprt01_RsltR.$oper_ord_sts_typ);
				addColumnPathMap(Sprt02_RsltR.$oper_cd, Ord_Sprt01_RsltR.$oper_cd);
				addColumnPathMap(Sprt02_RsltR.$oper_nm, Ord_Sprt01_RsltR.$oper_nm);
				addColumnPathMap(Sprt02_RsltR.$oper_seq, Ord_Sprt01_RsltR.$oper_seq);
				addColumnPathMap(Sprt02_RsltR.$mst_mfg_loc_cd, Ord_Sprt01_RsltR.$mst_mfg_loc_cd);
				addColumnPathMap(Sprt02_RsltR.$loc_cd, Ord_Sprt01_RsltR.$oper_loc_cd);
				addColumnPathMap(Sprt02_RsltR.$loc_nm, Ord_Sprt01_RsltR.$oper_loc_nm);
				addColumnPathMap(Sprt02_RsltR.$disp_seq, Ord_Sprt01_RsltR.$disp_seq);
				addColumnPathMap(Sprt02_RsltR.$oper_schd_qty, Ord_Sprt01_RsltR.$oper_schd_qty);
				addColumnPathMap(Sprt02_RsltR.$base_unit_cd, Ord_Sprt01_RsltR.$base_unit_cd);
				addColumnPathMap(Sprt02_RsltR.$base_unit_nm, Ord_Sprt01_RsltR.$base_unit_nm);
				addColumnPathMap(Sprt02_RsltR.$base_dec_place, Ord_Sprt01_RsltR.$base_dec_place);
				addColumnPathMap(Sprt02_RsltR.$oper_conv_qty, Ord_Sprt01_RsltR.$oper_conv_qty);
				addColumnPathMap(Sprt02_RsltR.$oper_unit_cd, Ord_Sprt01_RsltR.$oper_unit_cd);
				addColumnPathMap(Sprt02_RsltR.$oper_unit_nm, Ord_Sprt01_RsltR.$oper_unit_nm);
				addColumnPathMap(Sprt02_RsltR.$oper_conv_schd_qty, Ord_Sprt01_RsltR.$oper_conv_schd_qty);
				addColumnPathMap(Sprt02_RsltR.$yield_oper_flg, Ord_Sprt01_RsltR.$yield_oper_flg);
				addColumnPathMap(Sprt02_RsltR.$st_schd_dt, Ord_Sprt01_RsltR.$st_schd_tm);
				addColumnPathMap(Sprt02_RsltR.$st_schd_hm, Ord_Sprt01_RsltR.$st_schd_tm);
				addColumnPathMap(Sprt02_RsltR.$end_schd_dt, Ord_Sprt01_RsltR.$end_schd_tm);
				addColumnPathMap(Sprt02_RsltR.$end_schd_hm, Ord_Sprt01_RsltR.$end_schd_tm);
				addColumnPathMap(Sprt02_RsltR.$oper_lt, Ord_Sprt01_RsltR.$oper_lt);
				addColumnPathMap(Sprt02_RsltR.$oper_offst, Ord_Sprt01_RsltR.$oper_offst);
				addColumnPathMap(Sprt02_RsltR.$oper_offst_typ, Ord_Sprt01_RsltR.$oper_offst_typ);
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 */
	public class Sprt03 extends MSBCL_PrcdOrdReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callInspSchdSrch01Serv();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
			if(isNull(up0().mfg_loc_cd())) {
				up0().mfg_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if(isNull(up0().sppl_cd())) {
				up0().sppl_cd(MAC_STR.NULL_VAL.value());
			}
			if(isNull(up0().maker_cd())) {
				up0().maker_cd(MAC_STR.NULL_VAL.value());
			}			
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 検査対象,検査LT,検査オフセットを取得する
		 */
		protected void callInspSchdSrch01Serv() {
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			InspSchd_Srch01_CndR upR = InspSchd_Srch01_CndR.create();
			copy(upR, up0(), createMap_InspSchd_Srch01_CndR_Sprt03_CndR());
			ope.up0().add(upR);
			ope.exec();

			if(!ope.down0().isEmpty()) {
				InspSchd_Srch01_CndR rslt = ope.down0().get(0);
				up0().insp_flg(true);
				up0().insp_offst(rslt.insp_offst());
				up0().insp_lt(rslt.insp_lt());
			}
		}

		/** Sprt03_CndR → InspSchd_Srch01_CndR (Sprt03 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Sprt03_CndR<InspSchd_Srch01_CndR, Sprt03_CndR> createMap_InspSchd_Srch01_CndR_Sprt03_CndR() {
			return new Map_InspSchd_Srch01_CndR_Sprt03_CndR<InspSchd_Srch01_CndR, Sprt03_CndR>();
		}

		/** Sprt03_CndR → InspSchd_Srch01_CndR (Sprt03 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Sprt03_CndR<D extends InspSchd_Srch01_CndR, S extends Sprt03_CndR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Sprt03_CndR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Sprt03_CndR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Sprt03_CndR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Sprt03_CndR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Sprt03_CndR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Sprt03_CndR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Sprt03_CndR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Sprt03_CndR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Sprt03_CndR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Sprt03_CndR.$strg_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				//オーダ区分によって検査種類区分を指定
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_PrcdOrdReg_MC_A.Chk01 {
		
		protected MST_PRCD_ITM_ORDER_R _itmOrdR = MST_PRCD_ITM_ORDER_R.create();
		protected MCList<MST_PRCD_OPER_ORDER_R> _operOrdL = MCList.create(MST_PRCD_OPER_ORDER_R.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErrFlgOn(up0())) {
				//オーダ更新チェックサービス呼び出し
				callOrdChkSrv();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(lockAndCheckBase());
				msgL.addAll(compBase());
			}
			
			
			return msgL;
		}

		/** ロックの取得および更新カウンタチェック */
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().itm_ord_no())) {
				// ロック取得
				MST_PRCD_ITM_ORDER_R itmOrdR_t = MST_PRCD_ITM_ORDER_R.create("T");
				MCQueryApiBuilder itmOrdR_bldr = MCQueryApiBuilder.create(itmOrdR_t);
				itmOrdR_bldr.setSelect(itmOrdR_t.itm_ord_no, itmOrdR_t.strg_loc_cd,
						itmOrdR_t.itm_cd, itmOrdR_t.itm_sub1, itmOrdR_t.itm_sub2,
						itmOrdR_t.itm_sub3, itmOrdR_t.ver_no, itmOrdR_t.sno_typ1,
						itmOrdR_t.sno_typ2, itmOrdR_t.sno_typ3, itmOrdR_t.sno_typ4,
						itmOrdR_t.ord_fix_pd, itmOrdR_t.nmr_qty, itmOrdR_t.dnm_qty,
						itmOrdR_t.fxd_yield_qty, itmOrdR_t.upd_cntr);
				dbSelectKeyForUpdateNoWait("MSBCL0140_MST_PRCD_ITM_ORDER_S01", _itmOrdR, itmOrdR_bldr, up0());

				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$itm_order_upd_cntr, _itmOrdR));

				// 更新前データDACチェック
				if(!isNull(_itmOrdR.itm_ord_no())) {
					msgL.addAll(checkWritableLocCdDac(_itmOrdR, MST_PRCD_ITM_ORDER_R.$strg_loc_cd));
				}

				// 工程オーダの検索
				MST_PRCD_OPER_ORDER_R operOrdL_t = MST_PRCD_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrdL_bldr = MCQueryApiBuilder.create(operOrdL_t);
				operOrdL_bldr.setWhere(operOrdL_t.itm_ord_no.eq(bind("itm_ord_no")), up0());
				dbSelectForUpdate("MSBCL0140_MST_PRCD_OPER_ORDER_S01", _operOrdL, operOrdL_bldr);
			}

			return msgL;
		}
		
		protected MCMessageList compBase() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().itm_ord_no())) {
				up0().itm_cd(_itmOrdR.itm_cd());
				up0().itm_sub1(_itmOrdR.itm_sub1());
				up0().itm_sub2(_itmOrdR.itm_sub2());
				up0().itm_sub3(_itmOrdR.itm_sub3());
				up0().ver_no(_itmOrdR.ver_no());
				up0().sno_typ1(_itmOrdR.sno_typ1());
				up0().sno_typ2(_itmOrdR.sno_typ2());
				up0().sno_typ3(_itmOrdR.sno_typ3());
				up0().sno_typ4(_itmOrdR.sno_typ4());
				up0().ord_fix_pd(_itmOrdR.ord_fix_pd());
				up0().nmr_qty(_itmOrdR.nmr_qty());
				up0().dnm_qty(_itmOrdR.dnm_qty());
				up0().fxd_yield_qty(_itmOrdR.fxd_yield_qty());
			}
			
			MCIndexKey idxkeyPrcdOper = _operOrdL.createIndex(MST_PRCD_OPER_ORDER_R.$oper_ord_no);
			for (Chk01_DtlR row : up1()){
				MST_PRCD_OPER_ORDER_R operOrdR = _operOrdL.getFirst(idxkeyPrcdOper, row.oper_ord_no());
				if (!isNull(operOrdR)) {
					row.oper_ord_sts_typ(operOrdR.oper_ord_sts_typ());
					row.oper_lt(operOrdR.oper_lt());
					row.oper_offst(operOrdR.oper_offst());
					row.oper_offst_typ(operOrdR.oper_offst_typ());
				}
			}
			
			for (Chk01_DtlR r : up1()) {
				r.itm_cd(up0().itm_cd());
				r.itm_sub1(up0().itm_sub1());
				r.itm_sub2(up0().itm_sub2());
				r.itm_sub3(up0().itm_sub3());
				r.oper_ptn(up0().oper_ptn());
				r.master_dt(up0().master_dt());
			}
			
			// 品目工程マスタ情報の補完
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MCList<MAM_ITM_OPER_R> itmOper = MCList.create(MAM_ITM_OPER_R.class);
			MAM_ITM_OPER_R t1 = MAM_ITM_OPER_R.create("T");
			MCQueryApiBuilder itmOper_bldr = MCQueryApiBuilder.create(t1);
			
			itmOper.addStringColumn("wg_cd");
			itmOper_bldr.addSelect(loc.wg_cd);
			itmOper_bldr.addLeftOuterJoin(loc, bracket( t1.loc_cd.eq(loc.loc_cd)));
			itmOper_bldr.addWhereWithAnd(t1.itm_cd.eq(bind("itm_cd")));
			itmOper_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			itmOper_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			itmOper_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			itmOper_bldr.addWhereWithAnd(t1.oper_ptn.eq(bind("oper_ptn")));
			itmOper_bldr.addWhereWithAnd(t1.oper_cd.eq(bind("oper_cd")));
			itmOper_bldr.addWhereWithAnd(t1.oper_seq.eq(bind("oper_seq")));
			itmOper_bldr.addWhereWithAnd(bind("master_dt").between(t1.st_dt, t1.end_dt));
			dbSelect("MSBCL0140_MAM_ITM_OPER_S01", itmOper, itmOper_bldr, up1());
			
			MCIndexKey itmOperIdx = itmOper.createIndex(MAM_ITM_OPER_R.$itm_cd, MAM_ITM_OPER_R.$itm_sub1, MAM_ITM_OPER_R.$itm_sub2, MAM_ITM_OPER_R.$itm_sub3, MAM_ITM_OPER_R.$oper_ptn, MAM_ITM_OPER_R.$oper_cd, MAM_ITM_OPER_R.$oper_seq);
			for (Chk01_DtlR r : up1()) {
				// デフォルト工程でない場合は、マスタ値を補完
				if(isNullOrNullVal(r.oper_ptn())) {
					continue;
				}
				MCList<MAM_ITM_OPER_R> subItmOper = itmOper.subList(itmOperIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.oper_ptn(), r.oper_cd(), r.oper_seq());
				subItmOper = subItmOper.subList(t -> t.st_dt().lteDate(r.master_dt()) && t.end_dt().gteDate(r.master_dt()));
				
				// ヘッダの製造場所と一致するレコードを抽出
				// 一致するレコードが存在しない場合、場所がNULL文字のレコードを抽出
				MCList<MAM_ITM_OPER_R> subItmOperTmp = subItmOper.subList(t -> isSame(up0().mfg_loc_cd(), t.loc_cd()));
				if (isNull(subItmOperTmp)) {
					subItmOper = subItmOper.subList(t -> MAC_STR.isNULL_VAL(t.loc_cd()));
				}
				else {
					subItmOper = subItmOperTmp;
				}
				
				if (isNull(subItmOper)) {
					String[] keyCols = {
							MAM_ITM_OPER_R.$itm_cd,
							MAM_ITM_OPER_R.$itm_sub1,
							MAM_ITM_OPER_R.$itm_sub2,
							MAM_ITM_OPER_R.$itm_sub3,
							MAM_ITM_OPER_R.$loc_cd,
							MAM_ITM_OPER_R.$oper_ptn,
							MAM_ITM_OPER_R.$oper_cd,
							MAM_ITM_OPER_R.$oper_seq
					};
					Comparable<?>[] keyVals = {
							r.itm_cd(),
							r.itm_sub1(),
							r.itm_sub2(),
							r.itm_sub3(),
							r.loc_cd(),
							r.oper_ptn(),
							r.oper_cd(),
							r.oper_seq()
					};
					msgL.addAll(getRecordNotFoundMsg("MA", "MAM_ITM_OPER", keyCols, keyVals, r));
				}
				else {
					r.disp_seq(subItmOper.get(0).disp_seq());
				}
			}
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			compAfterListLogic();
			return msgL;
		}

		protected void compAfterListLogic() {
			for (Chk01_DtlR r : up1()) {
				// 工程のＷＧＣＤにヘッダの値を設定
				r.wg_cd(up0().wg_cd());
			}
		}

		protected void callOrdChkSrv() {
			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			Ord_Upd01_Dtl1R upR = Ord_Upd01_Dtl1R.create();
			copy(upR, up0(), createMap_Ord_Upd01_Dtl1R_Chk01_HdrR());
			ope.up0().add(upR);
			addAll(ope.up1(), up1(), createMap_Ord_Upd01_Dtl2R_Chk01_DtlR());

			ope.exec();

			Ord_Upd01_Dtl1R downR = ope.down0().get(0);
			copyErrFlg(up0(), downR);
			up0().unit_cd(downR.unit_cd());
			up0().rqst_wg_cd(downR.rqst_wg_cd());
			up0().mfg_sppl_cd(downR.mfg_sppl_cd());
			up0().mfg_maker_cd(downR.mfg_maker_cd());
			up0().purc_lt(downR.purc_lt());
			up0().mfg_lt(downR.mfg_lt());
			up0().xfr_lt(downR.xfr_lt());
			up0().accpt_insp_lt(downR.accpt_insp_lt());
			up0().insp_lt(downR.insp_lt());
			up0().insp_offst(downR.insp_offst());
			up0().lot_mng_typ(downR.lot_mng_typ());
			up0().sublot_mng_typ(downR.sublot_mng_typ());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBCL_PrcdOrdReg_MC_A.Chk02 {

		protected MST_PRCD_ITM_ORDER_R _itmOrdR = MST_PRCD_ITM_ORDER_R.create();
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErrFlgOn(up0())) {
				//オーダ更新チェックサービス呼び出し
				callOrdChkSrv();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(lockAndCheckBase());
			}
			return msgL;
		}

		/** ロックの取得および更新カウンタチェック */
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			
			//ロックを取得する
			MST_PRCD_ITM_ORDER_R itmOrdR_t = MST_PRCD_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdR_bldr = MCQueryApiBuilder.create(itmOrdR_t);
			itmOrdR_bldr.setSelect(itmOrdR_t.itm_ord_no, itmOrdR_t.strg_loc_cd, itmOrdR_t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBL0140_MST_PRCD_ITM_ORDER_S02", _itmOrdR, itmOrdR_bldr, up0());

			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$itm_order_upd_cntr, _itmOrdR));
			if(!isNull(_itmOrdR.itm_ord_no())) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(_itmOrdR, MST_PRCD_ITM_ORDER_R.$strg_loc_cd));
			}
			
			return msgL;
		}

		protected void callOrdChkSrv() {
			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			Ord_Upd01_Dtl1R upR = Ord_Upd01_Dtl1R.create();
			copy(upR, up0(), createMap_Ord_Upd01_Dtl1R_Chk02_HdrR());
			ope.up0().add(upR);

			ope.exec();

			Ord_Upd01_Dtl1R downR = ope.down0().get(0);
			copyErrFlg(up0(), downR);
			//copyErrFlg(up1(), ope.down1());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			//down1().setAll(up1());
		}

		/** Chk02_HdrR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01) */
		protected Map_Ord_Upd01_Dtl1R_Chk02_HdrR<Ord_Upd01_Dtl1R, Chk02_HdrR> createMap_Ord_Upd01_Dtl1R_Chk02_HdrR() {
			return new Map_Ord_Upd01_Dtl1R_Chk02_HdrR<Ord_Upd01_Dtl1R, Chk02_HdrR>();
		}

		/** Chk02_HdrR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01) */
		public class Map_Ord_Upd01_Dtl1R_Chk02_HdrR<D extends Ord_Upd01_Dtl1R, S extends Chk02_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk02_HdrR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk02_HdrR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk02_HdrR.$rqmt_no);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_PrcdOrdReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			//オーダ更新サービスを更新で呼び出し

			doPrcdOrdUpdMain();

			setDown();
		}

		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			//デフォルト工程は対象外
			if(MSC_ITM_ORD_TYP.isMFG(down0().itm_ord_typ())
					&& !isNullOrNullVal(down0().oper_ptn())) {
				down1().setAll(up1());
				if (MSC_ITM_ORD_STS_TYP.isSAV(up0().itm_ord_sts_typ())){
					//品目オーダが保存へ、先行手配オーダが確定へ更新
					down1().setStringNE(Chk01_DtlR.$oper_ord_sts_typ, MSC_OPER_ORD_STS_TYP.FIX.value());
				}
			}
		}
		
		/** オーダ更新(新規・更新用)共通処理 */
		protected void doPrcdOrdUpdMain() {

			// 上り電文編集
			editPrcdOrdUpdUp();

			// オーダ更新前チェック処理
			callThisChk01();
			throwUpdErr();

			// オーダ更新サービス実行(先行手配更新)
			callOrdUpdSrv();
			
			if (MSC_ITM_ORD_STS_TYP.isFIX(up0().itm_ord_sts_typ())){

				editItmOrdInsUp();
				
				// オーダ更新サービス実行(品目オーダの新規登録)
				callOrdUpdSrv();

				updPrcdOrd();
			}
		}
		
		/**
		 * 上り電文の編集(更新用)
		 */
		protected void editPrcdOrdUpdUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());

			//オーダー登録サービス呼出時の固定値
			up0().mrp_typ(MSC_MRP_TYP.PRCD.value());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			up0().ord_gnrt_typ(MSC_ORD_GNRT_TYP.PRCD.value());
			up0().io_schd_pr_flg(true);

			//デフォルト工程の生成
			setDefOper(up0(), up1());

			//工程オーダと品目オーダ紐付け
			up1().setNumber(Chk01_DtlR.$peg_no, up0().peg_no());
			up1().setString(Chk01_DtlR.$itm_ord_no, up0().itm_ord_no());
			up1().setString(Chk01_DtlR.$oper_ptn, up0().oper_ptn());
			//工程行毎の紐付けＮＯ
			setPegNo(Chk01_DtlR.$peg_no_d, up1());
		}
		
		/**
		 * 上り電文の再編集(手配オーダより保存品目オーダを作成ため)
		 */
		protected void editItmOrdInsUp() {
			up0().mrp_typ(MSC_MRP_TYP.MRP.value());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
			up1().setStringNE(Chk01_DtlR.$oper_ord_sts_typ, MSC_OPER_ORD_STS_TYP.SAV.value());
		}
		
		/** オーダ更新前チェック処理 (更新用)*/
		protected void callThisChk01() {
			MSBCL_PrcdOrdReg.Chk01 ope = MSBCL_PrcdOrdReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());

			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * オーダ更新サービス呼び出し(先行手配オーダ更新・オーダ新規登録用)
		 */
		protected void callOrdUpdSrv() {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			Ord_Upd01_Dtl1R upR = Ord_Upd01_Dtl1R.create();
			copy(upR, up0(), createMap_Ord_Upd01_Dtl1R_Chk01_HdrR());
			ope.up0().add(upR);
			addAll(ope.up1(), up1(), createMap_Ord_Upd01_Dtl2R_Chk01_DtlR());

			ope.exec();

			up0().itm_ord_no(ope.down0().get(0).itm_ord_no());
			copyByPegNo(up1(), ope.down1(),
				Chk01_DtlR.$peg_no_d,
				new String[] {Chk01_DtlR.$oper_ord_no, Chk01_DtlR.$oper_ord_sts_typ},
				Ord_Upd01_Rslt2R.$peg_no_d,
				new String[] {Ord_Upd01_Rslt2R.$oper_ord_no, Ord_Upd01_Rslt2R.$oper_ord_sts_typ});
		}
		
		/** 確定済み先行手配オーダ・受払予定の更新・取消し
		 * @param l
		 */
		protected void updPrcdOrd(){	
			executeUpdate(MSBCL0140_MST_PRCD_IO_SCHD_D01(), up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBCL_PrcdOrdReg_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//オーダ更新サービスを削除で呼び出し
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			up0().setStatus(MCRow.DELETE);
			doPrcdOrdDelMain();
		}
		
		/** 先行手配オーダ削除処理 */
		protected void doPrcdOrdDelMain() {

			// 上り電文編集
			editPrcdOrdDelUp();

			// オーダ更新前チェック処理
			callThisChk02();
			throwUpdErr();

			// オーダ更新サービス実行
			callOrdUpdSrvForDel();
		}
		
		/**
		 * 上り電文の編集(削除用)
		 */
		protected void editPrcdOrdDelUp() {
			setPegNo(Chk02_HdrR.$peg_no, up0());

			//オーダー登録サービス呼出時の固定値
			up0().mrp_typ(MSC_MRP_TYP.PRCD.value());
		}
		
		/** オーダ更新前チェック処理(削除用) */
		protected void callThisChk02() {
			MSBCL_PrcdOrdReg.Chk02 ope = MSBCL_PrcdOrdReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}
		
		/**
		 * オーダ更新サービス呼び出し(削除用)
		 */
		protected void callOrdUpdSrvForDel() {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			Ord_Upd01_Dtl1R upR = Ord_Upd01_Dtl1R.create();
			copy(upR, up0(), createMap_Ord_Upd01_Dtl1R_Chk02_HdrR());
			ope.up0().add(upR);

			ope.exec();

			up0().itm_ord_no(ope.down0().get(0).itm_ord_no());
		}
	}

	/**
	 * 
	 */
	protected void setDefOper(Chk01_HdrR up0, MCList<Chk01_DtlR> up1) {
		if (isDefOper(up0)){
			//先行手配オーダ更新の場合
			MCList<Chk01_DtlR> defOprL = MCList.create(Chk01_DtlR.class);
			executeQuery(defOprL, MSBCL0140_MST_PRCD_OPER_ORDER_S02(), up0);

			if (defOprL.size() > 0){
				for(Chk01_DtlR r: defOprL) {
					r.oper_schd_qty(up0.inst_qty());
					r.oord().not_oper_schd_qty(up0.inst_qty());
					r.st_schd_tm(up0.mfg_st_schd_dt());
					r.end_schd_tm(up0.mfg_end_schd_dt());
					r.loc_cd(up0.mfg_loc_cd());
				}
				up1.setAll(defOprL);
			}
			else{
				//先行手配オーダ更新の場合
				up0.oper_ord_pr_flg(true);
			}
		}
	}

	protected boolean isDefOper(Chk01_HdrR up0) {
		return MSC_ITM_ORD_TYP.isMFG(up0.itm_ord_typ())
					&& isNullOrNullVal(up0.oper_ptn())
				|| MSC_ITM_ORD_TYP.isOUTSRC(up0.itm_ord_typ());
	}

	/** Chk01_HdrR → Ord_Upd01_Dtl1R (Ins01,Upd01 → Ord_Upd01) */
	protected Map_Ord_Upd01_Dtl1R_Chk01_HdrR<Ord_Upd01_Dtl1R, Chk01_HdrR> createMap_Ord_Upd01_Dtl1R_Chk01_HdrR() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_HdrR<Ord_Upd01_Dtl1R, Chk01_HdrR>();
	}

	/** Chk01_HdrR → Ord_Upd01_Dtl1R (Ins01,Upd01 → Ord_Upd01) */
	public class Map_Ord_Upd01_Dtl1R_Chk01_HdrR<D extends Ord_Upd01_Dtl1R, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk01_HdrR.$mrp_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_HdrR.$data_crud_typ);

			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk01_HdrR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Chk01_HdrR.$itm_ord_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Chk01_HdrR.$ord_gnrt_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk01_HdrR.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk01_HdrR.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk01_HdrR.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk01_HdrR.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk01_HdrR.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk01_HdrR.$strg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk01_HdrR.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk01_HdrR.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk01_HdrR.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Chk01_HdrR.$rqst_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Chk01_HdrR.$rqst_wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk01_HdrR.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Chk01_HdrR.$oper_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk01_HdrR.$inst_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Chk01_HdrR.$yield_schd_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$nmr_qty, Chk01_HdrR.$nmr_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$dnm_qty, Chk01_HdrR.$dnm_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$fxd_yield_qty, Chk01_HdrR.$fxd_yield_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, Chk01_HdrR.$itm_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Chk01_HdrR.$po_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, Chk01_HdrR.$purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Chk01_HdrR.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Chk01_HdrR.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, Chk01_HdrR.$mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, Chk01_HdrR.$gi_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, Chk01_HdrR.$strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$xfr_lt, Chk01_HdrR.$xfr_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, Chk01_HdrR.$accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_insp_lt, Chk01_HdrR.$accpt_insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, Chk01_HdrR.$insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, Chk01_HdrR.$insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_lt, Chk01_HdrR.$insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_offst, Chk01_HdrR.$insp_offst);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Chk01_HdrR.$avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk01_HdrR.$master_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk01_HdrR.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ1, Chk01_HdrR.$sno_typ1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk01_HdrR.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ2, Chk01_HdrR.$sno_typ2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk01_HdrR.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ3, Chk01_HdrR.$sno_typ3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk01_HdrR.$sno4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ4, Chk01_HdrR.$sno_typ4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lmt_dt, Chk01_HdrR.$lmt_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_fix_pd, Chk01_HdrR.$ord_fix_pd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk01_HdrR.$rqmt_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, Chk01_HdrR.$inst_po_cnt_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_no, Chk01_HdrR.$io_schd_pr_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char3, Chk01_HdrR.$sub_char3);
			
			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk01_HdrR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, Chk01_HdrR.$mfg_sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, Chk01_HdrR.$mfg_maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$not_fix_flg, Chk01_HdrR.$not_fix_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, Chk01_HdrR.$oper_ord_pr_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_flg, Chk01_HdrR.$io_schd_pr_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk01_HdrR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk01_HdrR.$sublot_mng_typ);
		}
	}

	/** Chk01_DtlR → Ord_Upd01_Dtl2R (Ins01,Upd01 → Ord_Upd01) */
	protected Map_Ord_Upd01_Dtl2R_Chk01_DtlR<Ord_Upd01_Dtl2R, Chk01_DtlR> createMap_Ord_Upd01_Dtl2R_Chk01_DtlR() {
		return new Map_Ord_Upd01_Dtl2R_Chk01_DtlR<Ord_Upd01_Dtl2R, Chk01_DtlR>();
	}

	/** Chk01_DtlR → Ord_Upd01_Dtl2R (Ins01,Upd01 → Ord_Upd01) */
	public class Map_Ord_Upd01_Dtl2R_Chk01_DtlR<D extends Ord_Upd01_Dtl2R, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no_d, Chk01_DtlR.$peg_no_d);
			
			//addColumnPathMap(Ord_Upd01_Dtl2R.$oord, Chk01_DtlR.$oord);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_no, Chk01_DtlR.$oper_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_no, Chk01_DtlR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_sts_typ, Chk01_DtlR.$oper_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_cd, Chk01_DtlR.$oper_cd);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_seq, Chk01_DtlR.$oper_seq);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ptn, Chk01_DtlR.$oper_ptn);
			addColumnPathMap(Ord_Upd01_Dtl2R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl2R.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_schd_qty, Chk01_DtlR.$oper_schd_qty);
			addColumnPathMap(Ord_Upd01_Dtl2R.$yield_oper_flg, Chk01_DtlR.$yield_oper_flg);
			addColumnPathMap(Ord_Upd01_Dtl2R.$st_schd_tm, Chk01_DtlR.$st_schd_tm);
			addColumnPathMap(Ord_Upd01_Dtl2R.$end_schd_tm, Chk01_DtlR.$end_schd_tm);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_lt, Chk01_DtlR.$oper_lt);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst, Chk01_DtlR.$oper_offst);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst_typ, Chk01_DtlR.$oper_offst_typ);
			addColumnPathMap(Ord_Upd01_Dtl2R.$wg_cd, Chk01_DtlR.$wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl2R.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char3, Chk01_DtlR.$sub_char3);
		}
	}

	/** Chk02_HdrR → Ord_Upd01_Dtl1R (Del01 → Ord_Upd01) */
	protected Map_Ord_Upd01_Dtl1R_Chk02_HdrR<Ord_Upd01_Dtl1R, Chk02_HdrR> createMap_Ord_Upd01_Dtl1R_Chk02_HdrR() {
		return new Map_Ord_Upd01_Dtl1R_Chk02_HdrR<Ord_Upd01_Dtl1R, Chk02_HdrR>();
	}

	/** Chk02_HdrR → Ord_Upd01_Dtl1R (Del01 → Ord_Upd01) */
	public class Map_Ord_Upd01_Dtl1R_Chk02_HdrR<D extends Ord_Upd01_Dtl1R, S extends Chk02_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk02_HdrR.$mrp_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
			
			//addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk02_HdrR.$ord);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk02_HdrR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk02_HdrR.$rqmt_no);
		}
	}

	//FMCB CUSTOM END
}