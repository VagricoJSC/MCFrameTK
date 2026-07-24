package mcframe.serverMSBC.MSBCL5010;

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
import mcframe.serverMSBC.MSBCL5010.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBA.MSBAL5130.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBF.MSBFL5010.*;
import static mcframe.serverMSBC.MSBCL5010.Query.*;

import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.execCalDaysBatch;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.getCalDateLoc;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OrdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OrdRegService_MC extends MSBCL_OrdRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBCL_OrdRegService> CLAZZ = MSBCL_OrdRegService.class;

	protected FXUCL_MCDbcCache<MAM_BP_R> _bpR;
	
	protected static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}
	
	protected MAM_BP_R _getBp(String bpCd) {
		if (_bpR == null) {
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			_bpR = new FXUCL_MCDbcCache<MAM_BP_R>(bpR_bldr);
		}
		return _bpR.get(bpCd);
	}

	/**
	 * Ord_Sprt01オペレーション.<p>
	 * 
	 * 工程オーダ展開サービス</br>
	 * 品目オーダ情報から展開した工程オーダを返す
	 */
	public class Ord_Sprt01 extends MSBCL_OrdRegService_MC_A.Ord_Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 展開元ワーク作成
			setWk();

			// 工程オーダ作成、下り電文設定
			setDown();
		}

		/**
		 * ワークテーブルに展開元データを作成する
		 */
		protected void setWk() {
			MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D01", S0);
			insWk(up0());
			// マスタ取得用製造場所設定
			setMstMfgLoc();
		}

		/**
		 * 工程オーダを作成し下り電文に設定する
		 */
		protected void setDown() {
			// 工程オーダ作成
			MCList<Ord_Sprt01_RsltR> rslt = createOperOrder();

			// 工程オーダ加工
			editOperOrder(rslt);

			// 下り電文設定
			down0().addAll(rslt);
			
			// 紐付けＮＯ、工順でソート
			down0().sort(Ord_Sprt01_RsltR.$peg_no, Ord_Sprt01_RsltR.$disp_seq);
		}

		/**
		 * ワークテーブルを作成する
		 */
		protected void insWk(MCList<Ord_Sprt01_DtlR> up) {
			MCList<MSW_ITM_ORDER_R> itmOrdL = MCList.create(MSW_ITM_ORDER_R.class);
			for (Ord_Sprt01_DtlR row : up) {
				MSW_ITM_ORDER_R itmOrdR = MSW_ITM_ORDER_R.create();
				itmOrdR.peg_no(row.peg_no());
				itmOrdR.itm_ord_no(row.itm_ord_no());
				itmOrdR.itm_ord_typ(row.itm_ord_typ());
				itmOrdR.wg_cd(row.wg_cd());
				itmOrdR.bom_ptn(row.bom_ptn());
				itmOrdR.itm_cd(row.itm_cd());
				itmOrdR.itm_sub1(row.itm_sub1());
				itmOrdR.itm_sub2(row.itm_sub2());
				itmOrdR.itm_sub3(row.itm_sub3());
				itmOrdR.inst_qty(row.inst_qty());
				itmOrdR.mfg_loc_cd(row.mfg_loc_cd());
				itmOrdR.mst_mfg_loc_cd(MAC_STR.NULL_VAL.value());
				itmOrdR.oper_ptn(row.oper_ptn());
				if (!isNull(row.sno1())) {
					itmOrdR.sno1(row.sno1());
				}
				else {
					itmOrdR.sno1(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(row.sno2())) {
					itmOrdR.sno2(row.sno2());
				}
				else {
					itmOrdR.sno2(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(row.sno3())) {
					itmOrdR.sno3(row.sno3());
				}
				else {
					itmOrdR.sno3(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(row.sno4())) {
					itmOrdR.sno4(row.sno4());
				}
				else {
					itmOrdR.sno4(MAC_STR.NULL_VAL.value());
				}
				itmOrdR.master_dt(row.master_dt());
				itmOrdR.mfg_st_schd_dt(row.mfg_st_schd_dt());
				itmOrdR.mfg_end_schd_dt(row.mfg_end_schd_dt());
				itmOrdL.add(itmOrdR);
			}
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I01", itmOrdL, itmOrdL_bldr);
		}

		/** 工程マスタの場所(製造場所か共通(NULL文字)か)を決定 */
		protected void setMstMfgLoc() {
			executeUpdate(MSBCL5010_MSW_ITM_ORDER_U05());
		}

		/**
		 * 工程オーダを作成する
		 */
		protected MCList<Ord_Sprt01_RsltR> createOperOrder() {
			MCList<Ord_Sprt01_RsltR> operOrderL = MCList.create(Ord_Sprt01_RsltR.class);
			// 工程オーダ作成
			operOrderL.addAll(getOper());
			// デフォルト工程オーダ作成
			operOrderL.addAll(getDefOper());

			return operOrderL;
		}

		/**
		 * 通常工程オーダ取得
		 */
		protected MCList<Ord_Sprt01_RsltR> getOper() {
			MCList<Ord_Sprt01_RsltR> operL = MCList.create(Ord_Sprt01_RsltR.class);
			executeQuery(operL, MSBCL5010_MSW_ITM_ORDER_S02());

			for(Ord_Sprt01_RsltR row: operL) {
				if(!isSame(row.base_unit_cd(), row.oper_unit_cd())) {
					row.oper_conv_schd_qty(getOperUnitQty(row));
				}
				else {
					row.oper_conv_schd_qty(row.oper_schd_qty());
				}
			}
			return operL;
		}
		
		/**
		 * 基準数量より工程管理単位数量取得
		 */
		protected MCNumber getOperUnitQty(Ord_Sprt01_RsltR r) {
			return convQtyBaseToOper(r.oper_schd_qty(), r.oper_conv_qty(),
					r.oper_std_qty(), r.dec_place(), r.unit_conv_rnd_typ());
		}

		/**
		 * デフォルト工程オーダ取得
		 */
		protected MCList<Ord_Sprt01_RsltR> getDefOper() {
			// 展開元品目オーダ情報取得
			MCList<Ord_Sprt01_DtlR> defOperBase = MCList.create(Ord_Sprt01_DtlR.class);
			executeQuery(defOperBase, MSBCL5010_MSW_ITM_ORDER_S01());

			MCList<Ord_Sprt01_RsltR> defOperL = MCList.create(Ord_Sprt01_RsltR.class);
			for (Ord_Sprt01_DtlR row : defOperBase) {
				if (isDefOper(row)) {
					defOperL.add(setDefOper(row));
				}
			}
			return defOperL;
		}

		/** 
		 * デフォルト工程対象であるかどうかを返す
		 * <li>外注(製造場所の発注先ＣＤがＮＵＬＬでない)の場合
		 * <li>製造(製造場所の発注先ＣＤがＮＵＬＬ)で工程パタンがNULL文字の場合
		 */
		protected boolean isDefOper(Ord_Sprt01_DtlR r) {
			return (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()) || !isNull(r.sppl_cd()))
					||(MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) || isNull(r.sppl_cd()))
						&& isNullOrNullVal(r.oper_ptn());
		}

		protected void editOperOrder(MCList<Ord_Sprt01_RsltR> rslt) {
			// 出来高工程フラグの補完
			setYieldOper(rslt);
		}

		/**
		 * デフォルト工程レコードを設定する
		 */
		protected Ord_Sprt01_RsltR setDefOper(Ord_Sprt01_DtlR row) {
			Ord_Sprt01_RsltR retR = Ord_Sprt01_RsltR.create();
			retR.peg_no(row.peg_no());
			retR.st_schd_tm(row.mfg_st_schd_dt());
			retR.end_schd_tm(row.mfg_end_schd_dt());
			retR.oper_lt(MCNumber.ZERO);
			retR.oper_offst_typ(MAC_OFFST_TYP.BY_ST.value());
			retR.oper_offst(MCNumber.ZERO);
			retR.oper_schd_qty(row.inst_qty());
			retR.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
			retR.itm_ord_no(row.itm_ord_no());
			retR.mst_mfg_loc_cd(null);
			retR.oper_ptn(MAC_STR.NULL_VAL.value());
			retR.oper_cd(MAC_STR.NULL_VAL.value());
			retR.oper_nm(null);
			retR.oper_seq(MCNumber.ONE);
			retR.disp_seq(MCNumber.ONE);
			retR.wg_cd(row.wg_cd());
			retR.wg_nm(row.wg_nm());
			retR.yield_oper_flg(true);
			retR.oper_unit_cd(null);
			retR.oper_unit_nm(null);
			retR.oper_std_qty(MCNumber.ONE);
			retR.oper_conv_qty(MCNumber.ONE);
			retR.dec_place(null);
			retR.unit_conv_rnd_typ(MAC_RND_TYP.RNDUP.value());
			retR.yield_oper_ratio(MCNumber.ONE);
			retR.oper_inst_grp(null);
			retR.oper_loc_cd(row.mfg_loc_cd());
			retR.oper_loc_nm(row.mfg_loc_nm());
			retR.oper_str_ln_tgt_flg(row.oper_str_ln_tgt_flg());
			retR.lmt_fr_dt_flg(false);
			retR.oper_lower_yield(null);
			retR.oper_std_yield(null);
			retR.oper_upper_yield(null);
			retR.wip_rate(null);
			retR.bkf_flg(row.bkf_flg());

			return retR;
		}

		/**
		 * 品目オーダに対応する工程オーダの出来高工程が１件も存在しない場合
		 * 表示順、工程コード、工程連番のソート順で最後の工程オーダを出来高工程とする
		 */
		protected void setYieldOper(MCList<Ord_Sprt01_RsltR> downL) {
			MCList<Ord_Sprt01_RsltR> operItmOrdNull = MCList.create(Ord_Sprt01_RsltR.class);
			MCList<Ord_Sprt01_RsltR> operItmOrdNotNull = MCList.create(Ord_Sprt01_RsltR.class);

			for (Ord_Sprt01_RsltR r : downL) {
				if (isNull(r.itm_ord_no())) {
					operItmOrdNull.add(r);
				}
				else {
					operItmOrdNotNull.add(r);
				}
			}

			MCSortPolicy sortOper = new MCSortPolicy();
			sortOper.add(SortType.DESC, Ord_Sprt01_RsltR.$disp_seq);
			sortOper.add(SortType.DESC, Ord_Sprt01_RsltR.$oper_cd);
			sortOper.add(SortType.DESC, Ord_Sprt01_RsltR.$oper_seq);

			for (MCList<Ord_Sprt01_RsltR> operL : operItmOrdNull.groupList(Ord_Sprt01_RsltR.$peg_no)) {
				if (isNull(operL.getFirst(Ord_Sprt01_RsltR.$yield_oper_flg, true))) {
					operL.sort(sortOper);
					operL.get(0).yield_oper_flg(true);
					operL.get(0).yield_oper_ratio(MCNumber.ONE);
				}
			}

			for (MCList<Ord_Sprt01_RsltR> operL : operItmOrdNotNull.groupList(Ord_Sprt01_RsltR.$itm_ord_no)) {
				if (isNull(operL.getFirst(Ord_Sprt01_RsltR.$yield_oper_flg, true))) {
					operL.sort(sortOper);
					operL.get(0).yield_oper_flg(true);
					operL.get(0).yield_oper_ratio(MCNumber.ONE);
				}
			}
		}
	}

	/**
	 * Ord_Sprt02オペレーション.<p>
	 * 
	 * 構成展開サービス<br>
	 * 品目オーダ・工程オーダの情報から構成展開を行い、投入予定情報を返す
	 *
	 */
	public class Ord_Sprt02 extends MSBCL_OrdRegService_MC_A.Ord_Sprt02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 展開元ワーク作成
			setWk();

			// 展開プロシージャ実行
			execBomExpProc();

			// 展開結果加工,下り電文設定
			setDown();
		}

		/**
		 * ワークテーブルに展開元データを作成する
		 */
		protected void setWk() {
			MSW_BOM_EXP_R S0 = MSW_BOM_EXP_R.create();
			execDbWkDelete("MSBCL5010_MSW_BOM_EXP_D01", S0);
			insWk(up1());
			setMstWgCd();
		}

		/**
		 * ＢＯＭ展開プロシージャを実行する
		 */
		protected void execBomExpProc() {
			if (!isNull(getSysParmNE("BOM_EXP_NO_RECURSIVE_FLG"))
					&& isSame(getSysParmNE("BOM_EXP_NO_RECURSIVE_FLG"), "1")) {
				execProc(createSqlId(LOGIC_ID, "MSPA_BOM$P_BOM_EXP_NO_RECURSIVE", "01"), "MSPA_BOM$P_BOM_EXP_NO_RECURSIVE"); // 新BOM展開
			}
			else {
				execProc(createSqlId(LOGIC_ID, "MSPA_BOM$P_BOM_EXP", "01"), "MSPA_BOM$P_BOM_EXP"); // 旧BOM展開
			}
		}

		/**
		 * 展開結果を加工し下り電文に設定する
		 */
		protected void setDown() {
			// 展開結果取得
			MCList<Ord_Sprt02_RsltR> rslt = srchRslt(up0());

			// 展開結果加工
			editRslt(rslt);

			// 下り電文設定
			down0().addAll(rslt);
		}

		/** 上り電文をワークテーブルに挿入する */
		protected void insWk(MCList<Ord_Sprt02_DtlR> up) {
			MCList<MSW_BOM_EXP_R> bomExL = MCList.create(MSW_BOM_EXP_R.class);
			for (Ord_Sprt02_DtlR r : up) {
				MSW_BOM_EXP_R row = MSW_BOM_EXP_R.create();
				row.peg_no(r.peg_no());
				row.itm_ord_no(r.itm_ord_no());
				row.oper_ord_no(r.oper_ord_no());
				row.itm_cd(r.itm_cd());
				row.itm_sub1(r.itm_sub1());
				row.itm_sub2(r.itm_sub2());
				row.itm_sub3(r.itm_sub3());
				row.oper_loc_cd(r.mfg_loc_cd());
				row.bom_ptn(r.bom_ptn());
				row.mst_wg_cd(MAC_STR.NULL_VAL.value());
				row.oper_cd(r.oper_cd());
				row.oper_seq(r.oper_seq());
				row.oper_schd_qty(r.inst_qty());
				row.mfg_st_schd_dt(r.mfg_st_schd_dt());
				row.st_schd_dt(r.st_schd_tm());
				row.end_schd_dt(r.end_schd_tm());
				row.sno1(r.sno1());
				row.sno2(r.sno2());
				row.sno3(r.sno3());
				row.sno4(r.sno4());
				row.cur_cd(r.cur_cd());
				bomExL.add(row);
			}
			MCQueryApiBuilder bomExL_bldr = MCQueryApiBuilder.create(MSW_BOM_EXP_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_BOM_EXP_I01", bomExL, bomExL_bldr);
		}

		/** ＢＯＭマスタのＷＧ(自ＷＧか共通(NULL文字)か)を決定 */
		protected void setMstWgCd() {
			executeUpdate(MSBCL5010_MSW_BOM_EXP_U01());
		}

		/**
		 * 展開結果を取得する
		 */
		protected MCList<Ord_Sprt02_RsltR> srchRslt(Ord_Sprt02_CndR up0) {
			
			MCList<Ord_Sprt02_RsltR> rslt = MCList.create(Ord_Sprt02_RsltR.class);
			executeQuery(rslt, MSBCL5010_MSW_BOM_EXP_RSLT_S01(), up0);
			return rslt;
		}

		/** 
		 * 展開結果を加工する
		 */
		protected void editRslt(MCList<Ord_Sprt02_RsltR> rslt) {
			extractRslt(rslt);
			chkQty(rslt);
			setMinusQty(rslt);
			setItemSeq(rslt);
			setBomId(rslt);
			setAltItmQty(rslt);
			setDefGd(rslt);
			setFxdRqmtQty(rslt);
		}
		protected FXUCL_MCDbcCache<MAM_ITM_R> _fixedLossItmCache;
		protected void createFixedLossItmCache(MCList<Ord_Sprt02_RsltR> rslt) {
			// 子品目に紐づく固定ロス理由が存在する品目リストをキャッシュ
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_LOSS_RSN_R m2 = MAM_LOSS_RSN_R.create("M2");
			MAM_BIZ_RSN_R m3 = MAM_BIZ_RSN_R.create("M3");
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addInnerJoin(m2, bracket(t.itm_typ.eq(m2.itm_typ)
					.and(t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
			dbc_bldr.addInnerJoin(m3, bracket(m2.loss_rsn_cd.eq(m3.biz_rsn_cd)
					.and(m3.fxd_loss_flg.eq(value(true)))));
			_fixedLossItmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, rslt,
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		protected void setFxdRqmtQty(MCList<Ord_Sprt02_RsltR> rslt) {
			createFixedLossItmCache(rslt);
			
			for (Ord_Sprt02_RsltR r : rslt) {
				MAM_ITM_R itmR = _fixedLossItmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				// 固定ロス理由へ紐づかない場合
				if (isNull(itmR.itm_cd())) {
					r.inpt_qty(r.inpt_qty().add(r.fxd_rqmt_qty()));
					r.loss_rqmt_qty(r.loss_rqmt_qty().add(r.fxd_rqmt_qty()));
					r.fxd_rqmt_qty(MCNumber.ZERO);
				}
			}
		}

		/** 指図時展開フラグがオフの場合は自給品や副産物、指図書のみの品目を除外する */
		protected void extractRslt(MCList<Ord_Sprt02_RsltR> rslt) {
			if(up0().inst_exp_flg()) {
				return;
			}
			MCList<Ord_Sprt02_RsltR> rmv = rslt.createInstance();
			for (Ord_Sprt02_RsltR r: rslt) {
				if(MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
						|| MAC_PROV_TYP.isSS(r.prov_typ())
						|| r.byprod_flg()) {
					rmv.add(r);
				}
			}
			if(!rmv.isEmpty()) {
				rslt.removeAll(rmv);
			}
		}

		/** 数量項目の有効桁チェック */
		protected void chkQty(MCList<Ord_Sprt02_RsltR> rslt) {
			for (Ord_Sprt02_RsltR row : rslt) {
				if (!isNull(row.dec_place())) {
					if (!isNull(row.rqmt_qty())) {
						row.rqmt_qty(row.rqmt_qty().multiply(MCNumber.ONE,
								row.dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
					if (!isNull(row.loss_rqmt_qty())) {
						row.loss_rqmt_qty(row.loss_rqmt_qty().multiply(MCNumber.ONE,
								row.dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
					if (!isNull(row.inpt_qty())) {
						row.inpt_qty(row.inpt_qty().multiply(MCNumber.ONE,
								row.dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
					if (!isNull(row.fxd_rqmt_qty())) {
						row.fxd_rqmt_qty(row.fxd_rqmt_qty().multiply(MCNumber.ONE,
								row.dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
				}
				else {
					// 項目型チェック（桁あふれの可能性がある）
					MCMessageList mL = row.validate(Ord_Sprt02_RsltR.$rqmt_qty,
						Ord_Sprt02_RsltR.$loss_rqmt_qty, Ord_Sprt02_RsltR.$inpt_qty);
					if (!mL.isEmpty()) {
						throw new MCAppException(mL.get(0));
					}
				}
			}
		}

		/** マイナス数量の減算 */
		protected void setMinusQty(MCList<Ord_Sprt02_RsltR> rslt) {
			MCList<Ord_Sprt02_RsltR> removeL = MCList.create(Ord_Sprt02_RsltR.class);
			String[] keys = new String[]{Ord_Sprt02_RsltR.$peg_no,
				Ord_Sprt02_RsltR.$oper_cd, Ord_Sprt02_RsltR.$oper_seq,
				Ord_Sprt02_RsltR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_seq,
				Ord_Sprt02_RsltR.$itm_cd,
				Ord_Sprt02_RsltR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub3,
				Ord_Sprt02_RsltR.$ver_no,
				Ord_Sprt02_RsltR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_alloc_prio,
				Ord_Sprt02_RsltR.$in_offst_typ, Ord_Sprt02_RsltR.$in_offst, Ord_Sprt02_RsltR.$inpt_ctl_typ};

			for (MCList<Ord_Sprt02_RsltR> l : rslt.groupList(keys)) {
				if (l.sum(Ord_Sprt02_RsltR.$rqmt_qty).isPositive()) {
					// 必要数量（固定込み）の合計が０より大きい場合はマイナス数量の減算
					if (l.size() > 1) {
						minusCalc(l, removeL);
					}
				}
				else {
					// 必要数量（固定込み）の合計が０以下の場合はすべて削除
					removeL.addAll(l);
				}
			}
			if (removeL.size() > 0) {
				rslt.removeAll(removeL);
			}
		}

		/** 同一子品目連番の設定 */
		protected void setItemSeq(MCList<Ord_Sprt02_RsltR> rslt) {
			String[] sameChdItmKey = new String[]{Ord_Sprt02_RsltR.$peg_no,
				Ord_Sprt02_RsltR.$oper_cd, Ord_Sprt02_RsltR.$oper_seq,
				Ord_Sprt02_RsltR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_seq,
				Ord_Sprt02_RsltR.$itm_cd,
				Ord_Sprt02_RsltR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub3,
				Ord_Sprt02_RsltR.$ver_no};

			for (MCList<Ord_Sprt02_RsltR> sameChdItmL: rslt.groupList(sameChdItmKey)) {
				sameChdItmL.sort(MCList.SortType.ASC,
					Ord_Sprt02_RsltR.$schd_in_dt, Ord_Sprt02_RsltR.$rqmt_qty);
				int i = 0;
				for (Ord_Sprt02_RsltR r: sameChdItmL) {
					r.itm_seq(i++);
				}
			}
		}

		/** ＢＯＭ識別番号の設定 */
		protected void setBomId(MCList<Ord_Sprt02_RsltR> rslt) {
			for (MCList<Ord_Sprt02_RsltR> pegNoL: rslt.groupList(Ord_Sprt02_RsltR.$peg_no)) {
				int i = 0;
				for (Ord_Sprt02_RsltR r: pegNoL) {
					r.bom_id(i++);
				}
			}
		}

		/** 代替グループ間案分数量の設定 */
		protected void setAltItmQty(MCList<Ord_Sprt02_RsltR> rslt) {
			String[] groupKey = new String[]{Ord_Sprt02_RsltR.$peg_no,
				Ord_Sprt02_RsltR.$oper_cd, Ord_Sprt02_RsltR.$oper_seq,
				Ord_Sprt02_RsltR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_seq};

			for (MCList<Ord_Sprt02_RsltR> altGrpL : rslt.groupList(groupKey)) {
				if(isNull(altGrpL.get(0).alt_grp_cd())) {
					continue;
				}

				// ユーティリティを使用し、数量を案分する
				MSUCL_ProdUtil.setAltQty(altGrpL, Ord_Sprt02_RsltR.$alt_itm_typ,
							Ord_Sprt02_RsltR.$alt_itm_ratio, Ord_Sprt02_RsltR.$itm_cd,
							Ord_Sprt02_RsltR.$alt_qty, Ord_Sprt02_RsltR.$dec_place,
							Ord_Sprt02_RsltR.$rqmt_qty);

				MSUCL_ProdUtil.setAltQty(altGrpL, Ord_Sprt02_RsltR.$alt_itm_typ,
						Ord_Sprt02_RsltR.$alt_itm_ratio, Ord_Sprt02_RsltR.$itm_cd,
						Ord_Sprt02_RsltR.$inpt_qty, Ord_Sprt02_RsltR.$dec_place,
						Ord_Sprt02_RsltR.$calc_inpt_qty);
			}
		}

		/** デフォルト格付の設定 */
		protected void setDefGd(MCList<Ord_Sprt02_RsltR> retL) {
			retL.setValue(Ord_Sprt02_RsltR.$gd_cd, getDefaultFeedStkGd().gd_cd());
			retL.setValue(Ord_Sprt02_RsltR.$gd_nm, getDefaultFeedStkGd().gd_nm());
		}

		/** マイナス数量の減算処理 */
		protected void minusCalc(MCList<Ord_Sprt02_RsltR> l, MCList<Ord_Sprt02_RsltR> removeL) {
			l.sort(MCList.SortType.ASC, Ord_Sprt02_RsltR.$rqmt_qty);
			for (int i = 0; i < l.size(); i++) {
				Ord_Sprt02_RsltR ri = l.get(i);
				if (ri.rqmt_qty().gte(MCNumber.ZERO)) {
					return;
				}
				// 数値が大きい方から減算
				for (int j = l.size()-1; j > i; j--) {
					Ord_Sprt02_RsltR rj = l.get(j);
					if (ri.rqmt_qty().abs().eq(rj.rqmt_qty())) {
						rj.rqmt_qty(MCNumber.ZERO);
		
						removeL.add(rj);
						removeL.add(ri);
						break;
					}
					else if (ri.rqmt_qty().abs().lt(rj.rqmt_qty())) {
						rj.rqmt_qty(rj.rqmt_qty().subtract(ri.rqmt_qty().abs()));
						rj.loss_rqmt_qty(rj.loss_rqmt_qty().subtract(ri.loss_rqmt_qty().abs()));
						rj.inpt_qty(rj.inpt_qty().subtract(ri.inpt_qty().abs()));
						rj.fxd_rqmt_qty(rj.fxd_rqmt_qty().subtract(ri.fxd_rqmt_qty().abs()));
						rj.chd_rqmt_qty(rj.chd_rqmt_qty().subtract(ri.chd_rqmt_qty().abs()));
						rj.chd_inpt_qty(rj.chd_inpt_qty().subtract(ri.chd_inpt_qty().abs()));
						rj.fxd_chd_rqmt_qty(rj.fxd_chd_rqmt_qty().subtract(ri.fxd_chd_rqmt_qty().abs()));
		
						removeL.add(ri);
						break;
					}
					ri.rqmt_qty(ri.rqmt_qty().add(rj.rqmt_qty()));
					ri.loss_rqmt_qty(ri.loss_rqmt_qty().add(rj.loss_rqmt_qty()));
					ri.inpt_qty(ri.inpt_qty().add(rj.inpt_qty()));
					ri.fxd_rqmt_qty(ri.fxd_rqmt_qty().add(rj.fxd_rqmt_qty()));
					ri.chd_rqmt_qty(ri.chd_rqmt_qty().add(rj.chd_rqmt_qty()));
					ri.chd_inpt_qty(ri.chd_inpt_qty().add(rj.chd_inpt_qty()));
					ri.fxd_chd_rqmt_qty(ri.fxd_chd_rqmt_qty().add(rj.fxd_chd_rqmt_qty()));
		
					removeL.add(rj);
				}
			}
		}
	}

	/**
	 * Ord_Sprt03オペレーション.<p>
	 * 
	 * 予定日計算サービス<br>
	 */
	public class Ord_Sprt03 extends MSBCL_OrdRegService_MC_A.Ord_Sprt03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// 検収ＬＴ取得
			getAccptInspLt();

			// 検査ＬＴ取得
			callInspSchdSrch01();

			// 計算元ワーク作成
			setWk();

			// 日付計算プロシージャ実行
			execSetDateProc();

			//1回目計算結果を取得(格納完了日を決める)
			MCList<Ord_Sprt03_RsltR> wkretL = MCList.create(Ord_Sprt03_RsltR.class);

			executeQuery(wkretL, MSBCL5010_MSW_ITM_ORDER_S03());

			// 決まった格納完了日で検査LT再取得
			String[] destCols = new String[] {Ord_Sprt03_DtlR.$strg_schd_dt};
			String[] srcCols = new String[] {Ord_Sprt03_RsltR.$strg_schd_dt};
			copyByPegNo(up0(), destCols, wkretL, srcCols);
			callInspSchdSrch01_2();

			// 計算元ワーク再作成
			setWk();

			// 日付計算プロシージャ再実行
			execSetDateProc();

			// 下り電文設定
			setDown();
		}

		protected void editUp() {
			// NULL_VAL補完
			setNulVal();
			// 製造場所発注先取得
			getMfgLocSppl();
		}
		protected void setNulVal() {
			for(Ord_Sprt03_DtlR r: up0()) {
				if(isNull(r.mfg_loc_cd())) {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sppl_cd())
						|| !isNullOrNullVal(r.mfg_loc_cd())) {
						// 製造場所と発注先が両方設定されていたら製造場所を優先させる
					r.sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.rqst_loc_cd())) {
					r.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if(!(MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) || MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()))) {
					r.bom_ptn(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 検収ＬＴ取得
		 */
		protected void getAccptInspLt() {
			//日付計算プロシージャを使用するが、結果で必要なのは検収ＬＴのみ
			// 計算元ワーク作成
			setWk();
			// 日付計算プロシージャ実行
			execSetDateProc();
			//計算結果を取得(検収ＬＴを求める)
			MCList<Ord_Sprt03_RsltR> wkretL = MCList.create(Ord_Sprt03_RsltR.class);
			executeQuery(wkretL, MSBCL5010_MSW_ITM_ORDER_S03());

			// 検収ＬＴを取得
			String[] destCols = new String[] {Ord_Sprt03_DtlR.$accpt_insp_lt};
			String[] srcCols = new String[] {Ord_Sprt03_RsltR.$accpt_insp_lt};
			copyByPegNo(up0(), destCols, wkretL, srcCols);
		}

		/**
		 * ワークテーブルに計算元データを作成する
		 */
		protected void setWk() {
			MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D02", S0);
			insWk(up0());
		}

		/**
		 * 日付計算用元データをワークテーブルに保存する
		 */
		protected void insWk(MCList<Ord_Sprt03_DtlR> up) {
			MCList<MSW_ITM_ORDER_R> itmOrdL = MCList.create(MSW_ITM_ORDER_R.class);
			for (Ord_Sprt03_DtlR row : up) {
				MSW_ITM_ORDER_R itmOrdR = MSW_ITM_ORDER_R.create();
				itmOrdR.peg_no(row.peg_no());
				itmOrdR.itm_ord_typ(row.itm_ord_typ());
				itmOrdR.itm_cd(row.itm_cd());
				itmOrdR.itm_sub1(row.itm_sub1());
				itmOrdR.itm_sub2(row.itm_sub2());
				itmOrdR.itm_sub3(row.itm_sub3());
				itmOrdR.po_schd_dt(row.po_schd_dt());
				itmOrdR.gi_schd_dt(row.gi_schd_dt());
				itmOrdR.mfg_st_schd_dt(row.mfg_st_schd_dt());
				itmOrdR.mfg_end_schd_dt(row.mfg_end_schd_dt());
				itmOrdR.strg_schd_dt(row.strg_schd_dt());
				itmOrdR.accpt_schd_dt(row.accpt_schd_dt());
				itmOrdR.insp_st_schd_dt(row.insp_st_schd_dt());
				itmOrdR.insp_end_schd_dt(row.insp_end_schd_dt());
				itmOrdR.avl_schd_dt(row.avl_schd_dt());
				itmOrdR.master_dt(row.master_dt());
				itmOrdR.mfg_loc_cd(row.mfg_loc_cd());
				itmOrdR.sppl_cd(row.sppl_cd());
				itmOrdR.maker_cd(row.maker_cd());
				itmOrdR.rqst_loc_cd(row.rqst_loc_cd());
				itmOrdR.bom_ptn(row.bom_ptn());
				itmOrdR.strg_loc_cd(row.strg_loc_cd());
				itmOrdR.inst_qty(row.inst_qty());
				itmOrdR.insp_lt(row.insp_lt());
				itmOrdR.insp_offst(row.insp_offst());
				//上り電文の納品先ＣＤに値が入っていたら仕入直送レコード
				if (!isNull(row.dlv_cd())) {
					itmOrdR.dlv_cd(row.dlv_cd());
					itmOrdR.lg_grp_cd(getBp(row.dlv_cd()).lg_grp_cd());
				}

				itmOrdL.add(itmOrdR);
			}
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I02", itmOrdL, itmOrdL_bldr);
		}

		/**
		 * 日付計算結果を下り電文に設定する
		 */
		protected void setDown() {
			// 下り電文設定
			down0().addAll(srchRslt());
		}

		/**
		 * 予定日付を計算するプロシージャを実行する
		 */
		protected void execSetDateProc() {
			// プロシージャ実行
			execProc(createSqlId(LOGIC_ID, "MSPA_ORD$P_SET_DATE", "01"), "MSPA_ORD$P_SET_DATE");
		}

		/**
		 * 日付計算結果を取得する
		 */
		protected MCList<Ord_Sprt03_RsltR> srchRslt() {
			MCList<Ord_Sprt03_RsltR> retL = MCList.create(Ord_Sprt03_RsltR.class);
			// 日付計算結果取得
			executeQuery(retL, MSBCL5010_MSW_ITM_ORDER_S03());
			return retL;
		}

		/** 外注場所の発注先を取得する。 */
		protected void getMfgLocSppl() {
			MCList<Ord_Sprt03_DtlR> outSrcL = up0().subList(
				Ord_Sprt03_DtlR.$itm_ord_typ, MSC_ITM_ORD_TYP.OUTSRC.value());
			if(outSrcL.isEmpty()) {
				return;
			}

			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			for (Ord_Sprt03_DtlR r : outSrcL.groupBy(Ord_Sprt03_DtlR.$mfg_loc_cd)) {
				MAM_LOC_R locR = MAM_LOC_R.create();
				locR.loc_cd(r.mfg_loc_cd());
				locL.add(locR);
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.sppl_cd);
			dbSelectKey("MSBCL5010_MAM_LOC_S01", locL, locL_bldr, locL);
			MCIndexKey idx = locL.createIndex(MAM_LOC_R.$loc_cd);

			for (Ord_Sprt03_DtlR r : outSrcL) {
				MAM_LOC_R loc = locL.getFirst(idx, r.mfg_loc_cd());
				if (!isNull(loc)) {
					r.mfg_sppl_cd(loc.sppl_cd());
				}
			}
		}

		/**
		 * 検査ＬＴ、検査オフセットを設定する
		 */
		protected void callInspSchdSrch01() {
			MCList<Ord_Sprt03_DtlR> inspL = up0().subList(r->isInspChk(r));
			if(inspL.isEmpty()){
				return;
			}

			// 検査LT、検査オフセットを取得する
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR());

			ope.exec();
			String[] destCols = new String[] {Ord_Sprt03_DtlR.$insp_lt,
				Ord_Sprt03_DtlR.$insp_offst, Ord_Sprt03_DtlR.$in_prmt_insp_flg};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$insp_lt,
				InspSchd_Srch01_CndR.$insp_offst, InspSchd_Srch01_CndR.$in_prmt_insp_flg};
			copyByPegNo(inspL, destCols, ope.down0(), srcCols);

		}

		/**
		 * 検査ＬＴ、検査オフセットを設定する(再取得)
		 */
		protected void callInspSchdSrch01_2() {
			MCList<Ord_Sprt03_DtlR> inspL = up0().subList(r->isInspChk(r));
			//格納完了日、検収予定日、検査着手予定日、検査終了予定日、使用可能予定日から1度検査ＬＴ、検査オフセットを取得したものは再取得する必要はない
			inspL = inspL.subList(r->!isNull(r.po_schd_dt()) || !isNull(r.mfg_st_schd_dt()) || !isNull(r.mfg_end_schd_dt()) || 
									!isNull(r.gi_schd_dt()));
			if(inspL.isEmpty()){
				return;
			}

			// 検査LT、検査オフセットを取得する
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR());

			ope.exec();
			String[] destCols = new String[] {Ord_Sprt03_DtlR.$insp_lt,
				Ord_Sprt03_DtlR.$insp_offst, Ord_Sprt03_DtlR.$in_prmt_insp_flg};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$insp_lt,
				InspSchd_Srch01_CndR.$insp_offst, InspSchd_Srch01_CndR.$in_prmt_insp_flg};
			copyByPegNo(inspL, destCols, ope.down0(), srcCols);

		}

		/**
		 * 検査対象となり得るかどうかを返す</br>
		 * 製造オーダ、外注オーダ、購買オーダの場合に対象
		 */
		protected boolean isInspChk(Ord_Sprt03_DtlR r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) && isNull(r.dlv_cd()); //仕入直送の場合は、検査対象ではない
		}

		/** Ord_Sprt03_DtlR → InspSchd_Srch01_CndR (Ord_Sprt03 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR<InspSchd_Srch01_CndR, Ord_Sprt03_DtlR> createMap_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR() {
			return new Map_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR<InspSchd_Srch01_CndR, Ord_Sprt03_DtlR>();
		}

		/** Ord_Sprt03_DtlR → InspSchd_Srch01_CndR (Ord_Sprt03 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Ord_Sprt03_DtlR<D extends InspSchd_Srch01_CndR, S extends Ord_Sprt03_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Ord_Sprt03_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Ord_Sprt03_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1,Ord_Sprt03_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Ord_Sprt03_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Ord_Sprt03_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Ord_Sprt03_DtlR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Ord_Sprt03_DtlR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Ord_Sprt03_DtlR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Ord_Sprt03_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$accpt_schd_dt, Ord_Sprt03_DtlR.$accpt_schd_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_st_schd_dt, Ord_Sprt03_DtlR.$insp_st_schd_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_end_schd_dt, Ord_Sprt03_DtlR.$insp_end_schd_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$avl_schd_dt, Ord_Sprt03_DtlR.$avl_schd_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$accpt_insp_lt, Ord_Sprt03_DtlR.$accpt_insp_lt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
					if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())){
						dest.sppl_cd(src.mfg_sppl_cd());
					}
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				if (!isNull(src.strg_schd_dt())) {
					dest.base_dt(src.strg_schd_dt());
				}
				else {
					dest.base_dt(null);
				}
			}
		}
	}

	/**
	 * Ord_Sprt04オペレーション.<p>
	 * 
	 *　品目オーダ補完サービス<br>
	 */
	public class Ord_Sprt04 extends MSBCL_OrdRegService_MC_A.Ord_Sprt04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// 補完元データ設定
			setWk();

			// ワークテーブル補完
			updWk();

			// 補完結果取得
			cmplUp();

			// 下り電文設定
			setDown();
		}

		protected void editUp() {
			// NULL_VAL補完
			setNulVal();
			// 製造場所発注先取得
			getMfgLocSppl();
			// 検査ＬＴ取得
			callInspSchdSrch01();
		}

		protected void setNulVal() {
			for(Ord_Upd01_Dtl1R r: up0()) {
				if(isNull(r.mfg_loc_cd())) {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sppl_cd())
						|| !isNullOrNullVal(r.mfg_loc_cd())) {
						// 製造場所と発注先が両方設定されていたら製造場所を優先させる
					r.sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.rqst_loc_cd())) {
					r.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if(!(MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) || MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()))) {
					r.bom_ptn(MAC_STR.NULL_VAL.value());
					r.oper_ptn(MAC_STR.NULL_VAL.value());
					// 指図予定数量と出来高予定数量は同じ数量とする
					if (isNull(r.inst_qty())) {
						r.inst_qty(r.yield_schd_qty());
					}
					else {
						r.yield_schd_qty(r.inst_qty());
					}
				}
			}
		}

		/**
		 * ワークテーブルに展開元データを作成する
		 */
		protected void setWk() {
			MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D03", S0);
			insWk(up0());
		}

		protected void updWk() {
			setWkItmDtl();
			setWkQty();
			execSetDateProc();
			setVer();
		}

		/**
		 * 補完結果を反映する
		 */
		protected void cmplUp() {
			MCList<Ord_Upd01_Dtl1R> wkL = MCList.create(Ord_Upd01_Dtl1R.class);
			executeQuery(wkL, MSBCL5010_MSW_ITM_ORDER_S07());
			MCIndexKey idx = wkL.createIndex(Ord_Upd01_Dtl1R.$peg_no);

			for (Ord_Upd01_Dtl1R r : up0()) {
				Ord_Upd01_Dtl1R wkR = wkL.getFirst(idx, r.peg_no());
				if (!isNull(wkR)) {
					// 値を指定している場合は補完しない
					wkR.oper_ptn(nvl(r.oper_ptn(), wkR.oper_ptn()));
					MCRow.copyvalue(r.ord(), wkR.ord());
					r.unit_cd(wkR.unit_cd());
					r.lot_mng_typ(wkR.lot_mng_typ());
					r.sublot_mng_typ(wkR.sublot_mng_typ());
					
					// 各種名称と属性
					r.itm_nm(wkR.itm_nm());
					r.unit_nm(wkR.unit_nm());
					r.cont_fctr_flg(wkR.cont_fctr_flg());
					r.cont_fctr_unit_cd(wkR.cont_fctr_unit_cd());
					r.cont_fctr_unit_nm(wkR.cont_fctr_unit_nm());
					r.std_cont_fctr(wkR.std_cont_fctr());
					r.cont_fctr_rnd_typ(wkR.cont_fctr_rnd_typ());
					r.cont_fctr_dec_place(wkR.cont_fctr_dec_place());
					r.strg_site_cd(wkR.strg_site_cd());
					r.strg_site_nm(wkR.strg_site_nm());
					r.strg_loc_grp_cd(wkR.strg_loc_grp_cd());
					r.strg_loc_grp_nm(wkR.strg_loc_grp_nm());
					r.strg_lg_grp_cd(wkR.strg_lg_grp_cd());
					r.strg_lg_grp_nm(wkR.strg_lg_grp_nm());
					r.strg_alloc_grp_cd(wkR.strg_alloc_grp_cd());
					r.strg_alloc_grp_nm(wkR.strg_alloc_grp_nm());
					r.strg_loc_nm(wkR.strg_loc_nm());
					r.mfg_site_cd(wkR.mfg_site_cd());
					r.mfg_site_nm(wkR.mfg_site_nm());
					r.mfg_loc_grp_cd(wkR.mfg_loc_grp_cd());
					r.mfg_loc_grp_nm(wkR.mfg_loc_grp_nm());
					r.mfg_loc_nm(wkR.mfg_loc_nm());
					r.sppl_nm(wkR.sppl_nm());
					r.maker_nm(wkR.maker_nm());
					r.rqst_site_cd(wkR.rqst_site_cd());
					r.rqst_site_nm(wkR.rqst_site_nm());
					r.rqst_loc_grp_cd(wkR.rqst_loc_grp_cd());
					r.rqst_loc_grp_nm(wkR.rqst_loc_grp_nm());
					r.rqst_loc_nm(wkR.rqst_loc_nm());
					r.rqst_wg_nm(wkR.rqst_wg_nm());
					r.wg_nm(wkR.wg_nm());
					r.wrk_no(wkR.wrk_no());
					r.wrk_nm(wkR.wrk_nm());
					r.itm_typ(wkR.itm_typ());
					r.itm_typ_d_cd(wkR.itm_typ_d_cd());
					r.itm_typ_d_nm(wkR.itm_typ_d_nm());
				}

				r.sno_typ1(MAC_SNO_TYP.EXTND.value());
				r.sno_typ2(MAC_SNO_TYP.EXTND.value());
				r.sno_typ3(MAC_SNO_TYP.EXTND.value());
				r.sno_typ4(MAC_SNO_TYP.EXTND.value());

				calcContFctrQty(r);
				if (MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())
						&& isSame(r.wg_cd(), r.rqst_wg_cd())
						&& !isSame(r.rqst_lg_grp_cd(), r.strg_lg_grp_cd())) {
					r.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
					MCMessagePool.add(new MCMessage(r, null, MSBCL0087,
						r.strg_loc_cd(), r.wg_cd(), r.rqst_loc_cd(), r.rqst_wg_cd(),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
				}
				else if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())
						&& !isSame(r.wg_cd(), r.rqst_wg_cd())) {
					r.itm_ord_typ(MSC_ITM_ORD_TYP.WG_XFR.value());
					MCMessagePool.add(new MCMessage(r, null, MSBCL0088,
						r.strg_loc_cd(), r.wg_cd(), r.rqst_loc_cd(), r.rqst_wg_cd(),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
				}
			}
		}

		/** 標準有効成分数量を算出する */
		protected void calcContFctrQty(Ord_Upd01_Dtl1R r) {
			if (r.cont_fctr_flg()) {
				r.cont_fctr_inst_qty(convToContFctrUnit(r.inst_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				r.cont_fctr_schd_yield(
						convToContFctrUnit(r.yield_schd_qty(), r.std_cont_fctr(),
								r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
		}
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 外注場所の発注先を取得する。 */
		protected void getMfgLocSppl() {
			MCList<Ord_Upd01_Dtl1R> outSrcL = up0().subList(
					Ord_Upd01_Dtl1R.$itm_ord_typ, MSC_ITM_ORD_TYP.OUTSRC.value());
			if(outSrcL.isEmpty()) {
				return;
			}

			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			for (Ord_Upd01_Dtl1R r : outSrcL.groupBy(Ord_Upd01_Dtl1R.$mfg_loc_cd)) {
				MAM_LOC_R locR = MAM_LOC_R.create();
				locR.loc_cd(r.mfg_loc_cd());
				locL.add(locR);
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.sppl_cd);
			dbSelectKey("MSBCL5010_MAM_LOC_S02", locL, locL_bldr, locL);
			MCIndexKey idx = locL.createIndex(MAM_LOC_R.$loc_cd);

			for (Ord_Upd01_Dtl1R r : outSrcL) {
				MAM_LOC_R loc = locL.getFirst(idx, r.mfg_loc_cd());
				if (!isNull(loc)) {
					r.mfg_sppl_cd(loc.sppl_cd());
				}
			}
		}

		/**
		 * 検査ＬＴ、検査オフセットを設定する
		 */
		protected void callInspSchdSrch01() {

			MCList<Ord_Upd01_Dtl1R> inspL = up0().subList(r -> isInspChk(r));
			if(inspL.isEmpty()){
				return;
			}
			
			MCList<Ord_Upd01_Dtl1R> tgtL = MCList.create(Ord_Upd01_Dtl1R.class);
			for (Ord_Upd01_Dtl1R r : inspL) {
				//格納完了予定日が未設定の行のみをOrd_Sprt03に渡す対象とする
				if (isNull(r.strg_schd_dt())) {
					tgtL.add(r);
				}
			}
			if (!tgtL.isEmpty()) {
				MSBCL_OrdRegService.Ord_Sprt03 sprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();
				addAll(sprt03.up0(), tgtL, createMap_Ord_Sprt03_DtlR_Ord_Upd01_Dtl1R());
				sprt03.exec();
				
				copyByPegNo(inspL, new String[] {Ord_Upd01_Dtl1R.$strg_schd_dt},
						sprt03.down0(), new String[] {Ord_Sprt03_RsltR.$strg_schd_dt});
			}
			
			// 検査LT,検査オフセットを取得する（検査中使用許可の場合は両方0とすること）
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R());

			ope.exec();
			String[] destCols = new String[] {Ord_Upd01_Dtl1R.$insp_lt,
				Ord_Upd01_Dtl1R.$insp_offst, Ord_Upd01_Dtl1R.$in_prmt_insp_flg};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$insp_lt,
				InspSchd_Srch01_CndR.$insp_offst, InspSchd_Srch01_CndR.$in_prmt_insp_flg};
			copyByPegNo(inspL, destCols, ope.down0(), srcCols);

		}

		/**
		 * 検査対象となり得るかどうかを返す</br>
		 * 製造オーダ、外注オーダ、購買オーダの場合に対象
		 */
		protected boolean isInspChk(Ord_Upd01_Dtl1R r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
		}

		/**
		 * 上り電文をワークテーブルへ挿入
		 * @param up
		 */
		protected void insWk(MCList<Ord_Upd01_Dtl1R> up) {
			MCList<MSW_ITM_ORDER_R> itmOrdL = MCList.create(MSW_ITM_ORDER_R.class);
			for (Ord_Upd01_Dtl1R row : up) {
				MSW_ITM_ORDER_R itmOrdR = MSW_ITM_ORDER_R.create();
				itmOrdR.peg_no(row.peg_no());
				itmOrdR.itm_ord_typ(row.itm_ord_typ());
				itmOrdR.itm_cd(row.itm_cd());
				itmOrdR.itm_sub1(row.itm_sub1());
				itmOrdR.itm_sub2(row.itm_sub2());
				itmOrdR.itm_sub3(row.itm_sub3());
				itmOrdR.ver_no(row.ver_no());
				itmOrdR.strg_loc_cd(row.strg_loc_cd());
				itmOrdR.mfg_loc_cd(row.mfg_loc_cd());
				itmOrdR.sppl_cd(row.sppl_cd());
				itmOrdR.maker_cd(row.maker_cd());
				itmOrdR.rqst_loc_cd(row.rqst_loc_cd());
				itmOrdR.rqst_wg_cd(row.rqst_wg_cd());
				itmOrdR.bom_ptn(row.bom_ptn());
				itmOrdR.inst_qty(row.inst_qty());
				itmOrdR.yield_schd_qty(row.yield_schd_qty());
				itmOrdR.po_schd_dt(row.po_schd_dt());
				itmOrdR.mfg_st_schd_dt(row.mfg_st_schd_dt());
				itmOrdR.mfg_end_schd_dt(row.mfg_end_schd_dt());
				itmOrdR.gi_schd_dt(row.gi_schd_dt());
				itmOrdR.strg_schd_dt(row.strg_schd_dt());
				itmOrdR.accpt_schd_dt(row.accpt_schd_dt());
				itmOrdR.insp_st_schd_dt(row.insp_st_schd_dt());
				itmOrdR.insp_end_schd_dt(row.insp_end_schd_dt());
				itmOrdR.avl_schd_dt(row.avl_schd_dt());
				itmOrdR.master_dt(row.master_dt());
				itmOrdR.insp_lt(row.insp_lt());
				itmOrdR.insp_offst(row.insp_offst());
				itmOrdR.sno1(row.sno1());
				itmOrdR.sno2(row.sno2());
				itmOrdR.sno3(row.sno3());
				itmOrdR.sno4(row.sno4());
				itmOrdR.rqmt_no(row.rqmt_no());
				itmOrdR.itm_ord_no(row.itm_ord_no());

				itmOrdL.add(itmOrdR);
			}
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I03", itmOrdL, itmOrdL_bldr);
		}

		/**
		 * ワーク項目の更新
		 */
		protected void setWkItmDtl() {
			if (mcframe.serverCore.mcjdbc.MCDatabaseManager.isPostgreSql()) {
				// postgreSqlの場合、更新処理を高速化するために、一時表$tempを更新する
				MCQueryPlan queryPlan = MSBCL5010_MSW_ITM_ORDER_U01();
				MCUpdate upate= queryPlan.getQuery();
				
				String sql = upate.toString().replace("UPDATE MSW_ITM_ORDER", "UPDATE MSW_ITM_ORDER$temp");
				
				dbTran().statement().executeUpdate(queryPlan.getSQLID(), sql, null, null);
			}
			else {
				executeUpdate(MSBCL5010_MSW_ITM_ORDER_U01());
			}
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			itmDtlL.addDateColumn("master_dt");
			executeQuery(itmDtlL, MSBCL5010_MSW_ITM_ORDER_S08());
			MCList<MAM_ITM_DTL_R>[] grpL = itmDtlL.groupList(
					 MAM_ITM_DTL_R.$itm_cd
					,MAM_ITM_DTL_R.$itm_sub1
					,MAM_ITM_DTL_R.$itm_sub2
					,MAM_ITM_DTL_R.$itm_sub3
					,MAM_ITM_DTL_R.$mfg_loc_cd
					,MAM_ITM_DTL_R.$sppl_cd
					,MAM_ITM_DTL_R.$maker_cd
					,MAM_ITM_DTL_R.$rqst_loc_cd
					,MAM_ITM_DTL_R.$wg_cd
					,"master_dt");
			MCList<MAM_ITM_DTL_R> updL = itmDtlL.createInstance();
			for (MCList<MAM_ITM_DTL_R> tmpL : grpL) {
				tmpL.sort(SortType.ASC, MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$bom_ptn);
				updL.add(tmpL.get(0));
			}
			if (!updL.isEmpty()) {
				MSW_ITM_ORDER_R t1 = MSW_ITM_ORDER_R.create("T");
				execDbUpdate(
						"MSBCL5010_MSW_ITM_ORDER_U01"
						, t1
						, updL
						, t1.itm_cd.eq(bindEx("itm_cd"))
						.and(t1.itm_sub1.eq(bindEx("itm_sub1")))
						.and(t1.itm_sub2.eq(bindEx("itm_sub2")))
						.and(t1.itm_sub3.eq(bindEx("itm_sub3")))
						.and(t1.mfg_loc_cd.eq(bindEx("mfg_loc_cd")))
						.and(t1.sppl_cd.eq(bindEx("sppl_cd")))
						.and(t1.maker_cd.eq(bindEx("maker_cd")))
						.and(t1.rqst_loc_cd.eq(bindEx("rqst_loc_cd")))
						.and(t1.wg_cd.eq(bindEx("wg_cd")))
						.and(t1.master_dt.eq(bindEx("master_dt")))
						.and(t1.itm_ord_typ.in(value(MSC_ITM_ORD_TYP.OUTSRC.value()), value(MSC_ITM_ORD_TYP.MFG.value()) ))
						.and(t1.bom_ptn.isNull().or(t1.bom_ptn.eq(value(MAC_STR.NULL_VAL.value()))))
						,t1.bom_ptn);
			}
			if (mcframe.serverCore.mcjdbc.MCDatabaseManager.isPostgreSql()) {
				// postgreSqlの場合、更新処理を高速化するために、一時表$tempを更新する
				MCQueryPlan queryPlan = MSBCL5010_MSW_ITM_ORDER_U02();
				MCUpdate upate= queryPlan.getQuery();
				
				String sql = upate.toString().replace("UPDATE MSW_ITM_ORDER", "UPDATE MSW_ITM_ORDER$temp");
				
				dbTran().statement().executeUpdate(queryPlan.getSQLID(), sql, null, null);
			}
			else {
				executeUpdate(MSBCL5010_MSW_ITM_ORDER_U02());
			}
		}

		/**
		 * 数量の再計算
		 */
		protected void setWkQty() {
			
			if (mcframe.serverCore.mcjdbc.MCDatabaseManager.isPostgreSql()) {
				// postgreSqlの場合、更新処理を高速化するために、一時表$tempを更新する
				MCQueryPlan queryPlan = MSBCL5010_MSW_ITM_ORDER_U03();
				MCUpdate upate= queryPlan.getQuery();
				
				String sql = upate.toString().replace("UPDATE MSW_ITM_ORDER", "UPDATE MSW_ITM_ORDER$temp");
				
				dbTran().statement().executeUpdate(queryPlan.getSQLID(), sql, null, null);
			}
			else {
				executeUpdate(MSBCL5010_MSW_ITM_ORDER_U03());
			}
		}

		/**
		 * 予定日計算プロシージャ実行
		 */
		protected void execSetDateProc() {
			execProc(createSqlId(LOGIC_ID, "MSPA_ORD$P_SET_DATE", "02"), "MSPA_ORD$P_SET_DATE");
		}

		/**
		 * 版ＮＯを取得
		 */
		protected void setVer() {
			executeUpdate(MSBCL5010_MSW_ITM_ORDER_U04());
		}

		/** Ord_Upd01_Dtl1R → InspSchd_Srch01_CndR (Ord_Sprt04 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<InspSchd_Srch01_CndR, Ord_Upd01_Dtl1R> createMap_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R() {
			return new Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<InspSchd_Srch01_CndR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → InspSchd_Srch01_CndR (Ord_Sprt04 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<D extends InspSchd_Srch01_CndR, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
					if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())){
						dest.sppl_cd(src.mfg_sppl_cd());
					}
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}
	}
	
	protected Map_Ord_Sprt03_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt03_DtlR, Ord_Upd01_Dtl1R> createMap_Ord_Sprt03_DtlR_Ord_Upd01_Dtl1R() {
		return new Map_Ord_Sprt03_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt03_DtlR, Ord_Upd01_Dtl1R>();
	}
	
	public class Map_Ord_Sprt03_DtlR_Ord_Upd01_Dtl1R<D extends Ord_Sprt03_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
			addColumnPathMap(Ord_Sprt03_DtlR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
		}
	}
	
	/**
	 * Ord_Chk01オペレーション.<p>
	 *
	 * オーダ更新チェックサービス</br>
	 */
	public class Ord_Chk01 extends MSBCL_OrdRegService_MC_A.Ord_Chk01 {
		protected MCList<Ord_Upd01_Dtl2R> _chkOperL = MCList.create(Ord_Upd01_Dtl2R.class);
		protected MCIndexKey _chkOperIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Ord_Upd01_Dtl1R> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callShipDmndRqstUpdChkSrv(notErrL);
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			if(!up0().isEmpty()) {
				getCheckList();
				chkMain(msgL);
			}

			return msgL;
		}

		protected void chkMain(MCMessageList msgL) {
			for (Ord_Upd01_Dtl1R r : up0()) {
				MCMessageList msg = new MCMessageList();
				chkOrd(r, msg);
				if (msg.isEmpty() && isMfgOrOutSrc(r)) {
					chkOper(r, msg);
				}
				msgL.addAll(msg);
			}
		}

		/**
		 * 品目オーダ情報のチェック
		 */
		protected void chkOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {

			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) 
					|| (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.uplnd_outsrc_flg())) {
				// 確定チェック
				if (!MSC_ITM_ORD_STS_TYP.isOPN(r.b_itm_ord_sts_typ())
						&& !MSC_ITM_ORD_STS_TYP.isSAV(r.b_itm_ord_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBCL0052, r.itm_ord_no()));
					return;
				}
			}

			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				// ＷＧ変更チェック
				if (!isSame(r.wg_cd(), r.chk_b_wg_cd())) {
					msgL.add(new MCMessage(r, null, MSBCL0051,
							r.itm_ord_no(), r.chk_b_wg_cd(), r.wg_cd()));
					return;
				}
			}

			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {

				if(isNull(r.getStringNE("M_ITM_CD"))) {
					// 品目存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0189,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispGUIIndex(r)));
				}
				if(isNull(r.getStringNE("M_STRG_LOC_CD"))) {
					// 格納場所存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0057, getKeyInfoMsgLabel(r, Ord_Upd01_Dtl1R.$strg_loc_cd)));
				}
				if(!isNullOrNullVal(r.mfg_loc_cd()) && isNull(r.getStringNE("M_MFG_LOC_CD"))) {
					// 製造場所存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0057, getKeyInfoMsgLabel(r, Ord_Upd01_Dtl1R.$mfg_loc_cd)));
				}
				if(!isNullOrNullVal(r.sppl_cd()) && isNull(r.getStringNE("M_SPPL_CD"))) {
					// 発注先存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0117, getKeyInfoMsgLabel(r, Ord_Upd01_Dtl1R.$sppl_cd)));
				}
				if(!isNullOrNullVal(r.maker_cd()) && isNull(r.getStringNE("M_MAKER_CD"))) {
					// メーカ存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0117, getKeyInfoMsgLabel(r, Ord_Upd01_Dtl1R.$maker_cd)));
				}
				if(!isNullOrNullVal(r.rqst_loc_cd()) && isNull(r.getStringNE("M_RQST_LOC_CD"))) {
					// 依頼先場所存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0057, getKeyInfoMsgLabel(r, Ord_Upd01_Dtl1R.$rqst_loc_cd)));
				}
				if (!MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ()) && isNull(r.chk_itm_cd())) {
					// 品目詳細マスタ存在チェック
					msgL.add(new MCMessage(r, null, MSBCL0030,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							r.bom_ptn(), r.mfg_loc_cd(), r.sppl_cd(), r.maker_cd(),
							r.rqst_loc_cd(), r.wg_cd(), toYMDString(r.master_dt()),
							toDispGUIIndex(r)));
				}
				if (!r.chk_wg_lg_flg() && !r.chk_wg_mfg_flg()) {
					// 有効ＷＧのチェック
					msgL.add(new MCMessage(r, null, MSBCL0031, r.wg_cd()));
				}
				if (!isSame(r.chk_strg_loc_wg_cd(), r.wg_cd())) {
					// 格納場所とＷＧの整合性チェック
					msgL.add(new MCMessage(r, null, MSBCL0032, r.wg_cd(),
							r.strg_loc_cd(), r.chk_strg_loc_wg_cd()));
				}
				if (!r.chk_itm_ver_flg()) {
					r.ver_no(null);
				}
				// オーダ区分別チェック
				if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())) {
					chkMfgOrd(r, msgL);
				}
				else if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())) {
					chkPurcOrd(r, msgL);
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
					chkOutsrcOrd(r, msgL);
				}
				else if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())) {
					chkXfrOrd(r, msgL);
				}
				else if (MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())) {
					chkWgXfrOrd(r, msgL);
				}

				// 品管関連
				if (r.chk_itm_insp_flg()) {
					chkInsp(r, msgL);
				}

				// 手配NO関連
				chkSNo(r, msgL);

				// その他
				chkOther(r, msgL);
				//小数部有効桁数チェック
				if(!isNull(r.dec_place())) {
					msgL.addAll(checkDecPlace(r, r.dec_place().intValue(), Ord_Upd01_Dtl1R.$inst_qty));
					msgL.addAll(checkDecPlace(r, r.dec_place().intValue(), Ord_Upd01_Dtl1R.$yield_schd_qty));
				}
			}
			if (isSame(MCSys.request.reqSrcId(), "MSBCP0040") || isSame(MCSys.request.reqSrcId(), "MSBCP0050")) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (isNull(r.getStringNE("M_ITM_CD"))) {
						// 品目存在チェック
						msgL.add(new MCMessage(r, null, MAUAL0189,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(r)));
					}
				}
			}
		}

		/** 製造オーダの整合性チェック */
		protected void chkMfgOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (!isSame(r.chk_mfg_loc_wg_cd(), r.chk_strg_loc_wg_cd())) {
				// 製造場所と格納場所のＷＧが異なる
				msgL.add(new MCMessage(r, null, MSBCL0033,
					r.strg_loc_cd(), r.chk_strg_loc_wg_cd(),
					r.mfg_loc_cd(), r.chk_mfg_loc_wg_cd()));
			}
			if (isNullOr(r.mfg_st_schd_dt(), r.mfg_end_schd_dt(),r.strg_schd_dt(),r.avl_schd_dt())) {
				// 日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0037));
			}
			else if (r.mfg_st_schd_dt().gtDate(r.mfg_end_schd_dt())
					|| r.mfg_end_schd_dt().gtDate(r.strg_schd_dt())
					|| r.strg_schd_dt().gtDate(r.avl_schd_dt())) {
				// 日付前後チェック
				// 製造着手予定日-製造終了予定日-格納完了予定日-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0043,
					toYMDString(r.mfg_st_schd_dt()), toYMDString(r.mfg_end_schd_dt()),
					toYMDString(r.strg_schd_dt()), toYMDString(r.avl_schd_dt())));
			}
		}

		/** 外注オーダの整合性チェック */
		protected void chkOutsrcOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (isNullOr(r.mfg_st_schd_dt(), r.mfg_end_schd_dt(), r.po_schd_dt(),
					r.strg_schd_dt(), r.accpt_schd_dt(), r.avl_schd_dt())) {
				//日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0039));

			}
			else if (r.po_schd_dt().gtDate(r.strg_schd_dt())
					|| r.po_schd_dt().gtDate(r.accpt_schd_dt())
					|| r.strg_schd_dt().gtDate(r.avl_schd_dt())
					|| r.accpt_schd_dt().gtDate(r.avl_schd_dt())
					|| r.mfg_st_schd_dt().gtDate(r.mfg_end_schd_dt())
					|| r.mfg_end_schd_dt().gtDate(r.strg_schd_dt())) {
				// 日付前後チェック
				// 発注予定日-(格納完了予定日,検収予定日)-使用可能予定日
				// 製造着手予定日-製造終了予定日-格納完了予定日-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0045, toYMDString(r.po_schd_dt()),
					toYMDString(r.mfg_st_schd_dt()), toYMDString(r.mfg_end_schd_dt()),
					toYMDString(r.accpt_schd_dt()), toYMDString(r.strg_schd_dt()),
					toYMDString(r.avl_schd_dt())));
			}

			// 版ＮＯチェック 
			chkVerNo(r, msgL);
		}

		/** 購買オーダの整合性チェック */
		protected void chkPurcOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (isNullOr(r.po_schd_dt(), r.strg_schd_dt(), r.accpt_schd_dt(), r.avl_schd_dt())) {
				// 日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0038));
			}
			else if (r.po_schd_dt().gtDate(r.strg_schd_dt())
					|| r.po_schd_dt().gtDate(r.accpt_schd_dt())
					|| r.strg_schd_dt().gtDate(r.avl_schd_dt())
					|| r.accpt_schd_dt().gtDate(r.avl_schd_dt())) {
				// 日付前後チェック
				// 発注予定日-(格納完了予定日,検収予定日)-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0044, toYMDString(r.po_schd_dt()),
					toYMDString(r.strg_schd_dt()), toYMDString(r.accpt_schd_dt()),
					toYMDString(r.avl_schd_dt())));

			}

			// 版ＮＯチェック 
			chkVerNo(r, msgL);
		}

		/** 移送オーダの整合性チェック */
		protected void chkXfrOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (!isSame(r.chk_rqst_loc_wg_cd(), r.chk_strg_loc_wg_cd())) {
				// 依頼先場所と格納場所のＷＧが異なる
				msgL.add(new MCMessage(r, null, MSBCL0034,
					r.strg_loc_cd(), r.chk_strg_loc_wg_cd(),
					r.rqst_loc_cd(), r.chk_rqst_loc_wg_cd()));
			}
			if (isSame(r.chk_rqst_loc_lg_grp_cd(), r.chk_strg_loc_lg_grp_cd())) {
				// 依頼先場所と格納場所の物流Ｇが同じ
				msgL.add(new MCMessage(r, null, MSBCL0035,
					r.strg_loc_cd(), r.chk_strg_loc_lg_grp_cd(),
					r.rqst_loc_cd(), r.chk_rqst_loc_lg_grp_cd()));

			}
			if (isNullOr(r.gi_schd_dt(), r.strg_schd_dt(), r.avl_schd_dt())) {
				// 日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0040));
			}
			else if (r.gi_schd_dt().gtDate(r.strg_schd_dt())
					|| r.strg_schd_dt().gtDate(r.avl_schd_dt())) {
				// 日付前後チェック
				// 出庫予定日-格納完了予定日-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0046, toYMDString(r.gi_schd_dt()),
					toYMDString(r.strg_schd_dt()), toYMDString(r.avl_schd_dt())));
			}

			// 版ＮＯチェック 
			chkVerNo(r, msgL);
		}

		/** ＷＧ間移送オーダの整合性チェック */
		protected void chkWgXfrOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (isNullOrNullVal(r.chk_rqst_loc_wg_cd())
					|| isNullOrNullVal(r.chk_strg_loc_wg_cd())
					|| isSame(r.chk_rqst_loc_wg_cd(), r.chk_strg_loc_wg_cd())) {
				// 依頼先場所と格納場所のＷＧが異なる
				msgL.add(new MCMessage(r, null, MSBCL0036,
					r.strg_loc_cd(), r.rqst_loc_cd(), r.chk_strg_loc_wg_cd()));
			}
			if (isNullOr(r.gi_schd_dt(), r.strg_schd_dt(), r.avl_schd_dt())) {
				// 日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0041));
			}
			else if (r.gi_schd_dt().gtDate(r.strg_schd_dt())
					|| r.strg_schd_dt().gtDate(r.avl_schd_dt())) {
				// 日付前後チェック
				// 出庫予定日-格納完了予定日-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0046, toYMDString(r.gi_schd_dt()),
					toYMDString(r.strg_schd_dt()), toYMDString(r.avl_schd_dt())));
			}

			// 版ＮＯチェック 
			chkVerNo(r, msgL);
		}

		/** 版ＮＯチェック */
		protected void chkVerNo(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (!r.chk_itm_ver_flg()) {
				return ;
			}
			if (isNullOrNullVal(r.ver_no())) {
				// 必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0049,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
			}
			else if (r.chk_valid_ver_no_flg()) {
				// 版マスタ存在チェック
				msgL.add(new MCMessage(r, null, MSBCL0050,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
					r.chk_strg_loc_site_cd(), r.ver_no()));
			}
		}

		/** 検査対象オーダのチェック */
		protected void chkInsp(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (isNullOr(r.insp_st_schd_dt(), r.insp_end_schd_dt())) {
				// 日付必須チェック
				msgL.add(new MCMessage(r, null, MSBCL0042));
			}
			else if (r.insp_st_schd_dt().gtDate(r.insp_end_schd_dt())
					|| !r.in_prmt_insp_flg() && r.insp_end_schd_dt().gtDate(r.avl_schd_dt())) {
				// 日付前後チェック
				// 検査着手予定日-検査終了予定日-使用可能予定日
				msgL.add(new MCMessage(r, null, MSBCL0047,
					toYMDString(r.insp_st_schd_dt()), toYMDString(r.insp_end_schd_dt()),
					toYMDString(r.avl_schd_dt())));
			}
			else if ((MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()))
					&& r.insp_st_schd_dt().ltDate(r.strg_schd_dt())) {
				// 日付前後チェック
				// 格納完了予定日-検査着手予定日
				msgL.add(new MCMessage(r, null, MSBCL0048,
					toYMDString(r.strg_schd_dt()), toYMDString(r.insp_st_schd_dt())));
			}
		}

		/** 手配ＮＯチェック */
		protected void chkSNo(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			chkSNoSub(r, msgL, r.chk_itm_sno1_mng_typ(), r.sno1(), MSBCL0055, MSBCL0059);
			chkSNoSub(r, msgL, r.chk_itm_sno2_mng_typ(), r.sno2(), MSBCL0056, MSBCL0060);
			chkSNoSub(r, msgL, r.chk_itm_sno3_mng_typ(), r.sno3(), MSBCL0057, MSBCL0061);
			chkSNoSub(r, msgL, r.chk_itm_sno4_mng_typ(), r.sno4(), MSBCL0058, MSBCL0062);
		}

		/** 手配ＮＯの必須チェック・指定不可チェック */
		protected void chkSNoSub(Ord_Upd01_Dtl1R r, MCMessageList msgL, String snoMngTyp,
				String sno, String mId1, String mId2) {
			if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp) && isNullOrNullVal(sno)) {
				msgL.add(new MCMessage(r, null, mId1,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));

			}
			else if (MAC_SNO_MNG_TYP.isNOT_MNG(snoMngTyp) && !isNullOrNullVal(sno)) {
				msgL.add(new MCMessage(r, null, mId2,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), sno));
			}
		}

		/** その他チェック */
		protected void chkOther(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (r.chk_itm_stop_flg()) {
				// 品目禁止
				msgL.add(new MCMessage(r, null, MSBCL0054,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
					toYMDString(r.chk_order_stop_dt()), toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ()) && r.chk_sppl_stop_flg()){
				// 発注先禁止
				msgL.add(new MCMessage(r, null, MSBCL0103,
					r.sppl_cd(),
					toYMDString(r.chk_sppl_stop_dt()),
					toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()) && r.chk_mfg_sppl_stop_flg()){
				// 外注先禁止
				msgL.add(new MCMessage(r, null, MSBCL0103,
					r.mfg_sppl_cd(),
					toYMDString(r.chk_mfg_sppl_stop_dt()),
					toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ()) && !r.uplnd_outsrc_flg()) {
				if (r.not_fix_flg() || r.chk_not_fix_flg()) {
					// 手配不許可
					msgL.add(new MCMessage(r, null, MSBCL0053,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())));
				}
			}
			if (r.chk_sche_ord_flg()) {
				// スケジューラ排他チェック
				msgL.add(new MCMessage(r, null, MSBCL0064, r.itm_ord_no()));
			}
		}

		/** 工程オーダの整合性チェック */
		protected void chkOper(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			MCList<Ord_Upd01_Dtl2R> operL = _chkOperL.subList(_chkOperIdx, r.peg_no());

			if(operL.isEmpty()) {
				// デフォルト工程のチェック
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						&& isNullOrNullVal(r.oper_ptn())
						&& r.chk_dft_oper_flg()
						&& !r.oper_ord_pr_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL0063));
				}
				return;
			}

			for (Ord_Upd01_Dtl2R operR : operL) {
				if (operR.isStatusDelete()) {
					continue;
				}
				
				MCMessageList tmpL = new MCMessageList();
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$st_schd_tm, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$end_schd_tm, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$oper_schd_qty, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$disp_seq, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$oper_cd, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$oper_seq, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$loc_cd, r);
				chkReq(tmpL, operR, Ord_Upd01_Dtl2R.$wg_cd, r);
				if (!tmpL.isEmpty()) {
					msgL.addAll(tmpL);
					continue;
				}
				// 工程指図数 > 0
				if (operR.oper_schd_qty().lte(MCNumber.ZERO)) {
					msgL.add(new MCMessage(r, null, MSBCL0092, operR.oper_cd(), operR.oper_seq()));
				}

				// 日付前後チェック
				// 工程着手予定日時-工程終了予定日時
				if (operR.st_schd_tm().gt(operR.end_schd_tm())) {
					msgL.add(new MCMessage(r, null, MSBCL0093,
						toY2MDHMString(operR.st_schd_tm()),
						toY2MDHMString(operR.end_schd_tm()),
						operR.oper_cd(), operR.oper_seq()));
				}
			}

			for (MCList<Ord_Upd01_Dtl2R> subL
					:operL.groupList(Ord_Upd01_Dtl2R.$oper_cd, Ord_Upd01_Dtl2R.$oper_seq)) {
				MCNumber sumQty = subL.sum(Ord_Upd01_Dtl2R.$oper_schd_qty);
				if (!isSame(sumQty, r.inst_qty())) {
					msgL.add(new MCMessage(r, null, MSBCL0091,
						subL.get(0).oper_cd(), subL.get(0).oper_seq(), sumQty, r.inst_qty()));
				}
			}
		}

		protected void getCheckList() {
			// マスタデータ・トランザクション取得
			setWk();
			MCList<Ord_Upd01_Dtl1R> chkOrdL = MCList.create(Ord_Upd01_Dtl1R.class);
			executeQuery(chkOrdL, MSBCL5010_MSW_ITM_ORDER_S05(), up0().get(0));
			executeQuery(_chkOperL, MSBCL5010_MSW_OPER_ORDER_S01());
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk = up0().join(Ord_Upd01_Dtl1R.$peg_no , chkOrdL , Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk, createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R());
			for (Ord_Upd01_Dtl1R r : up0()) {
				if (r.uplnd_outsrc_flg()) {
					r.rqst_wg_cd(r.wg_cd());
				}
				if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())) {
					r.rqst_wg_cd(null);
				}
				if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())) {
					r.xfr_lt(null);
				}
			}
			_chkOperIdx = _chkOperL.createIndex(Ord_Upd01_Dtl1R.$peg_no);
			// 検査対象取得
			callInspSchdSrch01Serv();
		}

		/**
		 * 品目オーダワーク、工程オーダワークを登録
		 */
		protected void setWk() {
			MSW_ITM_ORDER_R S1 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D04", S1);
			insOrdWk(up0());
			MSW_OPER_ORDER_R S2 = MSW_OPER_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_OPER_ORDER_D01", S2);
			insOperWk(up1());
		}

		protected void insOrdWk(MCList<Ord_Upd01_Dtl1R> up) {
			MCList<MSW_ITM_ORDER_R> itmOrdL = MCList.create(MSW_ITM_ORDER_R.class);
			for (Ord_Upd01_Dtl1R row : up) {
				MSW_ITM_ORDER_R itmOrdR = MSW_ITM_ORDER_R.create();
				itmOrdR.peg_no(row.peg_no());
				itmOrdR.itm_ord_no(row.itm_ord_no());
				itmOrdR.itm_ord_typ(row.itm_ord_typ());
				itmOrdR.ord_gnrt_typ(row.ord_gnrt_typ());
				itmOrdR.itm_cd(row.itm_cd());
				itmOrdR.itm_sub1(row.itm_sub1());
				itmOrdR.itm_sub2(row.itm_sub2());
				itmOrdR.itm_sub3(row.itm_sub3());
				itmOrdR.ver_no(row.ver_no());
				itmOrdR.strg_loc_cd(row.strg_loc_cd());
				itmOrdR.mfg_loc_cd(row.mfg_loc_cd());
				itmOrdR.sppl_cd(row.sppl_cd());
				itmOrdR.maker_cd(row.maker_cd());
				itmOrdR.rqst_loc_cd(row.rqst_loc_cd());
				itmOrdR.rqst_wg_cd(row.rqst_wg_cd());
				itmOrdR.bom_ptn(row.bom_ptn());
				itmOrdR.oper_ptn(row.oper_ptn());
				itmOrdR.inst_qty(row.inst_qty());
				itmOrdR.yield_schd_qty(row.yield_schd_qty());
				itmOrdR.itm_ord_sts_typ(row.itm_ord_sts_typ());
				itmOrdR.po_schd_dt(row.po_schd_dt());
				itmOrdR.mfg_st_schd_dt(row.mfg_st_schd_dt());
				itmOrdR.mfg_end_schd_dt(row.mfg_end_schd_dt());
				itmOrdR.gi_schd_dt(row.gi_schd_dt());
				itmOrdR.strg_schd_dt(row.strg_schd_dt());
				itmOrdR.xfr_lt(row.xfr_lt());
				itmOrdR.accpt_schd_dt(row.accpt_schd_dt());
				itmOrdR.insp_st_schd_dt(row.insp_st_schd_dt());
				itmOrdR.insp_end_schd_dt(row.insp_end_schd_dt());
				itmOrdR.insp_lt(row.insp_lt());
				itmOrdR.insp_offst(row.insp_offst());
				itmOrdR.avl_schd_dt(row.avl_schd_dt());
				itmOrdR.master_dt(row.master_dt());
				itmOrdR.sno1(row.sno1());
				itmOrdR.sno_typ1(row.sno_typ1());
				itmOrdR.sno2(row.sno2());
				itmOrdR.sno_typ2(row.sno_typ2());
				itmOrdR.sno3(row.sno3());
				itmOrdR.sno_typ3(row.sno_typ3());
				itmOrdR.sno4(row.sno4());
				itmOrdR.sno_typ4(row.sno_typ4());
				itmOrdR.lmt_dt(row.lmt_dt());
				itmOrdR.wg_cd(row.wg_cd());
				itmOrdR.rqmt_no(row.rqmt_no());
				itmOrdR.inst_po_cnt_rmrks(row.inst_po_cnt_rmrks());
				itmOrdR.not_fix_flg(row.not_fix_flg());
		
				itmOrdL.add(itmOrdR);
			}
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I04", itmOrdL, itmOrdL_bldr);
		}

		/**
		 * 工程オーダワークを登録
		 */
		protected void insOperWk(MCList<Ord_Upd01_Dtl2R> up1) {
			MCList<MSW_OPER_ORDER_R> operOrdL = MCList.create(MSW_OPER_ORDER_R.class);
			for (Ord_Upd01_Dtl2R row : up1) {
				// 削除する工程オーダはチェック事項がないので省く
				if (row.isStatusDelete()) {
					continue;
				}
				
				MSW_OPER_ORDER_R operOrdR = MSW_OPER_ORDER_R.create();
				operOrdR.peg_no(row.peg_no());
				operOrdR.itm_ord_no(row.itm_ord_no());
				operOrdR.oper_ord_no(row.oper_ord_no());
				operOrdR.st_schd_tm(row.st_schd_tm());
				operOrdR.end_schd_tm(row.end_schd_tm());
				operOrdR.oper_lt(row.oper_lt());
				operOrdR.oper_offst_typ(row.oper_offst_typ());
				operOrdR.oper_offst(row.oper_offst());
				operOrdR.oper_schd_qty(row.oper_schd_qty());
				operOrdR.disp_seq(row.disp_seq());
				operOrdR.oper_ptn(row.oper_ptn());
				operOrdR.oper_cd(row.oper_cd());
				operOrdR.oper_seq(row.oper_seq());
				operOrdR.loc_cd(row.loc_cd());
				operOrdR.oper_ord_sts_typ(row.oper_ord_sts_typ());
				operOrdR.itm_ord_sts_typ(row.itm_ord_sts_typ());
				operOrdR.wg_cd(row.wg_cd());
				operOrdR.yield_oper_flg(row.yield_oper_flg());
				operOrdL.add(operOrdR);
			}
			if(!operOrdL.isEmpty()){
				MCQueryApiBuilder operOrdL_bldr = MCQueryApiBuilder.create(MSW_OPER_ORDER_R.create("T"));
				dbInsertEx("MSBCL5010_MSW_OPER_ORDER_I01", operOrdL, operOrdL_bldr);
			}
		}

		/**
		 * 検査対象,検査LT,検査オフセットを取得する
		 */
		protected void callInspSchdSrch01Serv(){
			MCList<Ord_Upd01_Dtl1R> inspL = up0().subList(r->isInspChk(r));
			if(inspL.isEmpty()){
				return;
			}

			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R());
			ope.exec();

			// 検査対象でなければope.down0()に含まれない
			for (InspSchd_Srch01_CndR r : ope.down0()){
				Ord_Upd01_Dtl1R upR = inspL.getFirst(Ord_Upd01_Dtl1R.$peg_no, r.peg_no());
				if(upR != null) {
					upR.chk_itm_insp_flg(true);
					upR.insp_lt(r.insp_lt());
					upR.insp_offst(nvl(r.insp_offst(), MCNumber.ZERO));
					upR.in_prmt_insp_flg(r.in_prmt_insp_flg());
				}
			}
		}

		/** 検査対象となり得るかどうかを返す */
		protected boolean isInspChk(Ord_Upd01_Dtl1R r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
		}

		/** 出荷・供給依頼サービス登録前チェック処理を呼び出す */
		protected void callShipDmndRqstUpdChkSrv(MCList<Ord_Upd01_Dtl1R> notErrL) {
			MCList<Ord_Upd01_Dtl1R> rqstL = notErrL.subList(r -> isCallShipDmndRqstChkSrv(r));
			if (rqstL.isEmpty()) {
				return;
			}

			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 ope = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Chk01();
			addAll(ope.up0(), rqstL, createMap_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();
			copyErrFlg(rqstL, ope.down0());
		}

		/**
		 * 出荷・供給依頼サービスの呼び出し対象であるかどうかを返す</br>
		 * 製造以外の通常オーダ(MRP区分：MRP、オーダ生成区分：計画外以外)で確定する場合
		 * Ord_Chk01では確定解除や確定のままの更新は来ない
		 */
		protected boolean isCallShipDmndRqstChkSrv(Ord_Upd01_Dtl1R r) {
			return MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ())
					&& !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& !(MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ()) && !r.uplnd_outsrc_flg());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Ord_Upd01_Dtl1R → InspSchd_Srch01_CndR (Ord_Chk01 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<InspSchd_Srch01_CndR, Ord_Upd01_Dtl1R> createMap_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R() {
			return new Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<InspSchd_Srch01_CndR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → InspSchd_Srch01_CndR (Ord_Chk01 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Ord_Upd01_Dtl1R<D extends InspSchd_Srch01_CndR, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
					if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())){
						dest.sppl_cd(src.mfg_sppl_cd());
					}
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())){
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}

		/** Ord_Upd01_Dtl1R → Ord_Upd01_Dtl1R (Ord_Chk01 → Ord_Chk01) */
		protected Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R,Ord_Upd01_Dtl1R> createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → Ord_Upd01_Dtl1R (Ord_Chk01 → Ord_Chk01) */
		public class Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<D extends Ord_Upd01_Dtl1R, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Ord_Upd01_Dtl1R.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_lg_grp_cd, Ord_Upd01_Dtl1R.$rqst_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$dec_place, Ord_Upd01_Dtl1R.$dec_place);

				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_cd, Ord_Upd01_Dtl1R.$chk_itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_wg_mfg_flg, Ord_Upd01_Dtl1R.$chk_wg_mfg_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_wg_lg_flg, Ord_Upd01_Dtl1R.$chk_wg_lg_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_strg_loc_wg_cd, Ord_Upd01_Dtl1R.$chk_strg_loc_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_strg_loc_lg_grp_cd, Ord_Upd01_Dtl1R.$chk_strg_loc_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_strg_loc_site_cd, Ord_Upd01_Dtl1R.$chk_strg_loc_site_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_mfg_loc_wg_cd, Ord_Upd01_Dtl1R.$chk_mfg_loc_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_rqst_loc_wg_cd, Ord_Upd01_Dtl1R.$chk_rqst_loc_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_rqst_loc_lg_grp_cd, Ord_Upd01_Dtl1R.$chk_rqst_loc_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_ver_flg, Ord_Upd01_Dtl1R.$chk_itm_ver_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_insp_flg, Ord_Upd01_Dtl1R.$chk_itm_insp_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_valid_ver_no_flg, Ord_Upd01_Dtl1R.$chk_valid_ver_no_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_b_wg_cd, Ord_Upd01_Dtl1R.$chk_b_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_b_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$chk_b_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_not_fix_flg, Ord_Upd01_Dtl1R.$chk_not_fix_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_stop_flg, Ord_Upd01_Dtl1R.$chk_itm_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_order_stop_dt, Ord_Upd01_Dtl1R.$chk_order_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sppl_stop_flg, Ord_Upd01_Dtl1R.$chk_sppl_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sppl_stop_dt, Ord_Upd01_Dtl1R.$chk_sppl_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_flg, Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_dt, Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_sno1_mng_typ, Ord_Upd01_Dtl1R.$chk_itm_sno1_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_sno2_mng_typ, Ord_Upd01_Dtl1R.$chk_itm_sno2_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_sno3_mng_typ, Ord_Upd01_Dtl1R.$chk_itm_sno3_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_sno4_mng_typ, Ord_Upd01_Dtl1R.$chk_itm_sno4_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sche_ord_flg, Ord_Upd01_Dtl1R.$chk_sche_ord_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_dft_oper_flg, Ord_Upd01_Dtl1R.$chk_dft_oper_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$lot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap("m_itm_cd", "m_itm_cd");
				addColumnPathMap("m_strg_loc_cd", "m_strg_loc_cd");
				addColumnPathMap("m_mfg_loc_cd", "m_mfg_loc_cd");
				addColumnPathMap("m_rqst_loc_cd", "m_rqst_loc_cd");
				addColumnPathMap("m_sppl_cd", "m_sppl_cd");
				addColumnPathMap("m_maker_cd", "m_maker_cd");
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_nm, Ord_Upd01_Dtl1R.$rqst_wg_nm);
			}
		}
	}

	/**
	 * Ord_Chk02オペレーション.<p>
	 *
	 * オーダ状況更新チェックサービス</br>
	 */
	public class Ord_Chk02 extends MSBCL_OrdRegService_MC_A.Ord_Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Ord_Upd01_Dtl1R> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callShipDmndRqstUpdChkSrv(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			getCheckList();
			chkMain(msgL);

			return msgL;
		}

		/**
		 * オーダ状況更新チェック
		 */
		protected void chkMain(MCMessageList msgL) {
			for (Ord_Upd01_Dtl1R r : up0()) {
				chkOrd(r, msgL);
			}
		}

		protected void chkOrd(Ord_Upd01_Dtl1R r, MCMessageList msgL) {
			if (isSame(MCSys.request.reqSrcId(), "MSBCP0040") || isSame(MCSys.request.reqSrcId(), "MSBCP0050")) {
				if (isNull(r.getStringNE("M_ITM_CD"))) {
					// 品目存在チェック
					msgL.add(new MCMessage(r, null, MAUAL0189,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispGUIIndex(r)));
				}
			}
			if (r.chk_itm_stop_flg()) {
				// 品目禁止
				msgL.add(new MCMessage(r, null, MSBCL0054,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
					toYMDString(r.chk_order_stop_dt()),
					toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ()) && r.chk_sppl_stop_flg()){
				// 発注先禁止
				msgL.add(new MCMessage(r, null, MSBCL0103,
					r.sppl_cd(),
					toYMDString(r.chk_sppl_stop_dt()),
					toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()) && r.chk_mfg_sppl_stop_flg()){
				// 外注先禁止
				msgL.add(new MCMessage(r, null, MSBCL0103,
					r.mfg_sppl_cd(),
					toYMDString(r.chk_mfg_sppl_stop_dt()),
					toYMDString(r.master_dt())));
			}
			if (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())) {
				if (r.not_fix_flg() || r.chk_not_fix_flg()) {
					// 手配不許可
					msgL.add(new MCMessage(r, null, MSBCL0053,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())));
				}
			}
			if (r.chk_sche_ord_flg()) {
				// スケジューラ排他チェック
				msgL.add(new MCMessage(r, null, MSBCL0064, r.itm_ord_no()));
			}
			if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())){
				// 未確定・保存⇒確定
				if (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())) {
					if (MSC_ITM_ORD_STS_TYP.isOPN(r.b_itm_ord_sts_typ())
							|| MSC_ITM_ORD_STS_TYP.isSAV(r.b_itm_ord_sts_typ())) {
						if (isSame(r.rqst_lg_grp_cd(), r.strg_lg_grp_cd())) {
							// 依頼先場所と格納場所の物流Ｇが同じ
							msgL.add(new MCMessage(r, null, MSBCL0035,
								r.strg_loc_cd(), r.strg_lg_grp_cd(),
								r.rqst_loc_cd(), r.rqst_lg_grp_cd()));
						}
					}
				}
			}
		}

		protected void getCheckList() {
			setWk();
			//マスタデータ・トランザクション取得
			MCList<Ord_Upd01_Dtl1R> chkOrdL = MCList.create(Ord_Upd01_Dtl1R.class);
			executeQuery(chkOrdL, MSBCL5010_MSW_ITM_ORDER_S06());
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk = up0().join(Ord_Upd01_Dtl1R.$peg_no , chkOrdL , Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk, createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R());
		}

		/**
		 * 品目オーダワークへ登録
		 */
		protected void setWk() {
			MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D05", S0);
			insWk(up0());
		}

		/**
		 * 品目オーダワークへ登録
		 */
		protected void insWk(MCList<Ord_Upd01_Dtl1R> up) {
			MCList<MSW_ITM_ORDER_R> itmOrdStsL = MCList.create(MSW_ITM_ORDER_R.class);
			for (Ord_Upd01_Dtl1R row : up) {
				MSW_ITM_ORDER_R itmOrdStsR = MSW_ITM_ORDER_R.create();
				itmOrdStsR.peg_no(row.peg_no());
				itmOrdStsR.itm_ord_no(row.itm_ord_no());
				itmOrdStsR.itm_ord_sts_typ(row.itm_ord_sts_typ());
				itmOrdStsL.add(itmOrdStsR);
			}
			MCQueryApiBuilder itmOrdStsL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I05", itmOrdStsL, itmOrdStsL_bldr);
		}

		/** 出荷・供給依頼サービス登録前チェック処理を呼び出す */
		protected void callShipDmndRqstUpdChkSrv(MCList<Ord_Upd01_Dtl1R> notErrL) {
			MCList<Ord_Upd01_Dtl1R> rqstL = notErrL.subList(r -> isCallShipDmndRqstChkSrv(r));
			if (rqstL.isEmpty()) {
				return;
			}

			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 ope = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Chk01();
			addAll(ope.up0(), rqstL, createMap_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();
			copyErrFlg(rqstL, ope.down0());
		}

		/**
		 * 出荷・供給依頼サービスの呼び出し対象であるかどうかを返す</br>
		 * 製造以外の通常オーダ(MRP区分：MRP、オーダ生成区分：計画外以外)で確定又は確定解除する場合
		 */
		protected boolean isCallShipDmndRqstChkSrv(Ord_Upd01_Dtl1R r) {
			return MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ())
					&& (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())
						|| MSC_ITM_ORD_STS_TYP.isFIX(r.b_itm_ord_sts_typ()));
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Ord_Upd01_Dtl1R → Ord_Upd01_Dtl1R (Ord_Chk02 → Ord_Chk02) */
		protected Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R,Ord_Upd01_Dtl1R> createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → Ord_Upd01_Dtl1R (Ord_Chk02 → Ord_Chk02) */
		public class Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<D extends Ord_Upd01_Dtl1R, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Ord_Upd01_Dtl1R.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_lg_grp_cd, Ord_Upd01_Dtl1R.$rqst_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_not_fix_flg, Ord_Upd01_Dtl1R.$chk_not_fix_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_itm_stop_flg, Ord_Upd01_Dtl1R.$chk_itm_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_order_stop_dt, Ord_Upd01_Dtl1R.$chk_order_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sppl_stop_flg, Ord_Upd01_Dtl1R.$chk_sppl_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sppl_stop_dt, Ord_Upd01_Dtl1R.$chk_sppl_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_flg, Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_dt, Ord_Upd01_Dtl1R.$chk_mfg_sppl_stop_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$chk_sche_ord_flg, Ord_Upd01_Dtl1R.$chk_sche_ord_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$lot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ);
				addColumnPathMap("m_itm_cd", "m_itm_cd");
			}
		}
	}

	/**
	 * Ord_Upd01オペレーション.<p>
	 * 
	 * オーダ更新サービス</br>
	 */
	public class Ord_Upd01 extends MSBCL_OrdRegService_MC_A.Ord_Upd01 {
		/** 製造、外注オーダに対する子品目展開リスト */
		protected MCList<Ord_Sprt02_RsltR> _bomExpL = MCList.create(Ord_Sprt02_RsltR.class);
		/** 子品目展開リストアクセス用インデックス（品目オーダＮＯ） */
		protected MCIndexKey _bomIdx;
		/** 工程オーダアクセス用インデックス（品目オーダＮＯ） */
		protected MCIndexKey _operIdx;
		/** 品目マスタ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		/** 場所マスタ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 工程オーダ展開サービス
			callOrdRegSprt01Srv();

			// 品目・工程オーダＮＯ発番
			issueOrdNo();

			// 構成展開サービス
			callOrdRegSprt02Srv();

			// 品目オーダ状況区分調整
			adjItmOrdSts();

			// オーダの登録、受払予定登録サービス
			updOrd();

			// 日次生産依頼の更新
			updRqmtFixFlg();

			// 出荷・供給依頼サービス
			callShipDmndRqstSrv();

			// 受注状況更新サービス
			callSloStsInsSrv();

			// 下り電文設定
			setDown();

		}

		protected void updOrd() {
			// 新規登録用コンテナ
			MCList<MST_ITM_ORDER_R> dbcIOrdI = MCList.create(MST_ITM_ORDER_R.class);
			MCList<MST_PRCD_ITM_ORDER_R> dbcIOrdPI = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			MCList<MST_SIM_ITM_ORDER_R> dbcIOrdSI = MCList.create(MST_SIM_ITM_ORDER_R.class);

			// 訂正用コンテナ
			MCList<MST_ITM_ORDER_R> dbcIOrdU = MCList.create(MST_ITM_ORDER_R.class);
			MCList<MST_PRCD_ITM_ORDER_R> dbcIOrdPU = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			MCList<MST_SIM_ITM_ORDER_R> dbcIOrdSU = MCList.create(MST_SIM_ITM_ORDER_R.class);

			// 取消用コンテナ
			MCList<MST_ITM_ORDER_R> dbcIOrdD = MCList.create(MST_ITM_ORDER_R.class);
			MCList<MST_PRCD_ITM_ORDER_R> dbcIOrdPD = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			MCList<MST_SIM_ITM_ORDER_R> dbcIOrdSD = MCList.create(MST_SIM_ITM_ORDER_R.class);

			// 新規登録用コンテナ（工程オーダ情報）
			MCList<MST_OPER_ORDER_R> dbcOperI = MCList.create(MST_OPER_ORDER_R.class);
			MCList<MST_PRCD_OPER_ORDER_R> dbcOperPI = MCList.create(MST_PRCD_OPER_ORDER_R.class);
			MCList<MST_SIM_OPER_ORDER_R> dbcOperSI = MCList.create(MST_SIM_OPER_ORDER_R.class);

			// 受払情報用コンテナ
			MCList<MST_ORD_IO_SCHD_R> dbcOrdIoSchdI = MCList.create(MST_ORD_IO_SCHD_R.class);
			MCList<MST_SAVORD_IO_SCHD_R> dbcSavOrdIoSchdI = MCList.create(MST_SAVORD_IO_SCHD_R.class);
			MCList<MST_PRCD_IO_SCHD_R> dbcPrcdIoSchdI = MCList.create(MST_PRCD_IO_SCHD_R.class);
			MCList<MST_SIM_IO_SCHD_R> dbcSimIoSchdI = MCList.create(MST_SIM_IO_SCHD_R.class);
			//受払予定登録サービス
			MSBEL_IoSchdService.IoSchd_Ins01 oSchdI = MSBEL_IoSchdService.crtIoSchd_Ins01();

			// 更新、削除対象
			MCList<Ord_Upd01_Dtl1R> delList = MCList.create(Ord_Upd01_Dtl1R.class);
			MCList<Ord_Upd01_Dtl1R> delPList = MCList.create(Ord_Upd01_Dtl1R.class);
			MCList<Ord_Upd01_Dtl1R> delSList = MCList.create(Ord_Upd01_Dtl1R.class);

			// 場所マスタをキャッシュする
			setCacheLocList();

			// 品目マスタの値を補完
			setItmInfo();
			
			for (Ord_Upd01_Dtl1R row : up0()) {
				
				if (MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
					if (MSC_MRP_TYP.isPRCD(row.mrp_typ())) {
						updPrcd(row, dbcIOrdPI, dbcOperPI, dbcPrcdIoSchdI, null);
					}
					else if (MSC_MRP_TYP.isSIM(row.mrp_typ())) {
						updSim(row, dbcIOrdSI, dbcOperSI, dbcSimIoSchdI, null);
					}
					else {
						updMrp(row, dbcIOrdI, dbcOperI, dbcOrdIoSchdI, dbcSavOrdIoSchdI, oSchdI.up0(), null);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
					if (MSC_MRP_TYP.isPRCD(row.mrp_typ())) {
						updPrcd(row, dbcIOrdPU, dbcOperPI, dbcPrcdIoSchdI, delPList);
					}
					else if (MSC_MRP_TYP.isSIM(row.mrp_typ())) {
						updSim(row, dbcIOrdSU, dbcOperSI, dbcSimIoSchdI, delSList);
					}
					else {
						updMrp(row, dbcIOrdU, dbcOperI, dbcOrdIoSchdI, dbcSavOrdIoSchdI, oSchdI.up0(), delList);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
					if (MSC_MRP_TYP.isPRCD(row.mrp_typ())) {
						MST_PRCD_ITM_ORDER_R prcdr = MST_PRCD_ITM_ORDER_R.create();
						copy(prcdr, row, createMap_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R());
						dbcIOrdPD.add(prcdr);
						delPList.add(row);
					}
					else if (MSC_MRP_TYP.isSIM(row.mrp_typ())) {
						MST_SIM_ITM_ORDER_R simr = MST_SIM_ITM_ORDER_R.create();
						copy(simr, row, createMap_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R());
						dbcIOrdSD.add(simr);
						delSList.add(row);
					}
					else {
						dbcIOrdD.add(row.ord());
						delList.add(row);
					}
				}
			}

			//削除、新規に対応するため、先に削除を実施する
			// 品目オーダ削除
			if (!dbcIOrdPD.isEmpty()) {
				MCQueryApiBuilder dbcIOrdPD_bldr = MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T"));
				dbDeleteKey("MSBCL5010_MST_PRCD_ITM_ORDER_D01", dbcIOrdPD, dbcIOrdPD_bldr);
			}
			if (!dbcIOrdSD.isEmpty()) {
				MCQueryApiBuilder dbcIOrdSD_bldr = MCQueryApiBuilder.create(MST_SIM_ITM_ORDER_R.create("T"));
				dbDeleteKey("MSBCL5010_MST_SIM_ITM_ORDER_D01", dbcIOrdSD, dbcIOrdSD_bldr);
			}
			if (!dbcIOrdD.isEmpty()) {
				MCQueryApiBuilder dbcIOrdD_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
				dbDeleteKey("MSBCL5010_MST_ITM_ORDER_D01", dbcIOrdD, dbcIOrdD_bldr);
			}

			// 品目オーダ新規登録
			if (!dbcIOrdPI.isEmpty()) {
				MCQueryApiBuilder dbcIOrdPI_bldr = MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_PRCD_ITM_ORDER_I01", dbcIOrdPI, dbcIOrdPI_bldr);
			}
			if (!dbcIOrdSI.isEmpty()) {
				MCQueryApiBuilder dbcIOrdSI_bldr = MCQueryApiBuilder.create(MST_SIM_ITM_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_SIM_ITM_ORDER_I01", dbcIOrdSI, dbcIOrdSI_bldr);
			}
			if (!dbcIOrdI.isEmpty()) {
				MCQueryApiBuilder dbcIOrdI_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_ITM_ORDER_I01", dbcIOrdI, dbcIOrdI_bldr);
			}

			// 品目オーダ更新
			if (!dbcIOrdPU.isEmpty()) {
				MCQueryApiBuilder dbcIOrdPU_bldr = MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T"));
				dbcIOrdPU_bldr.removeSet(getPrcdItmOrdRemoveSet());
				dbUpdateKey("MSBCL5010_MST_PRCD_ITM_ORDER_U01", dbcIOrdPU, dbcIOrdPU_bldr);
			}
			if (!dbcIOrdSU.isEmpty()) {
				MCQueryApiBuilder dbcIOrdSU_bldr = MCQueryApiBuilder.create(MST_SIM_ITM_ORDER_R.create("T"));
				dbUpdateKey("MSBCL5010_MST_SIM_ITM_ORDER_U01", dbcIOrdSU, dbcIOrdSU_bldr);
			}
			if (!dbcIOrdU.isEmpty()) {
				MCQueryApiBuilder dbcIOrdU_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
				dbcIOrdU_bldr.removeSet(getItmOrdRemoveSet());
				dbUpdateKey("MSBCL5010_MST_ITM_ORDER_U01", dbcIOrdU, dbcIOrdU_bldr);
			}

			// 更新・削除対象の品目オーダＮＯに関連する工程オーダを削除
			if (!delList.isEmpty()) {
				executeBatchUpdate(MSBCL5010_MST_OPER_ORDER_D01(), null, delList);
				executeBatchUpdate(MSBCL5010_MST_SAVORD_IO_SCHD_D02(), null, delList);
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_D02(), null, delList);
			}
			if (!delPList.isEmpty()) {
				executeBatchUpdate(MSBCL5010_MST_PRCD_OPER_ORDER_D01(), null, delPList);
				executeBatchUpdate(MSBCL5010_MST_PRCD_IO_SCHD_D01(), null, delPList);
			}
			if (!delSList.isEmpty()) {
				MST_SIM_OPER_ORDER_R dbc = MST_SIM_OPER_ORDER_R.create("T");
				execDbDelete("MSBCL5010_MST_SIM_OPER_ORDER_D01", dbc, dbc.itm_ord_no.eq(bind("itm_ord_no"))
						.and(dbc.sim_mrp_no.eq(bind("sim_mrp_no"))), delSList);
				executeBatchUpdate(MSBCL5010_MST_SIM_IO_SCHD_D01(), null, delSList);
			}

			// 工程オーダを登録
			if (!dbcOperPI.isEmpty()) {
				MCQueryApiBuilder dbcOperPI_bldr = MCQueryApiBuilder.create(MST_PRCD_OPER_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_PRCD_OPER_ORDER_I01", dbcOperPI, dbcOperPI_bldr);
			}
			if (!dbcOperSI.isEmpty()) {
				MCQueryApiBuilder dbcOperSI_bldr = MCQueryApiBuilder.create(MST_SIM_OPER_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_SIM_OPER_ORDER_I01", dbcOperSI, dbcOperSI_bldr);
			}
			if (!dbcOperI.isEmpty()) {
				MCQueryApiBuilder dbcOperI_bldr = MCQueryApiBuilder.create(MST_OPER_ORDER_R.create("T"));
				dbInsert("MSBCL5010_MST_OPER_ORDER_I01", dbcOperI, dbcOperI_bldr);
			}

			// 受払情報を登録
			if (!dbcPrcdIoSchdI.isEmpty()) {
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, dbcPrcdIoSchdI.size());
				dbcPrcdIoSchdI.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder dbcPrcdIoSchdI_bldr = MCQueryApiBuilder.create(MST_PRCD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_PRCD_IO_SCHD_I01", dbcPrcdIoSchdI, dbcPrcdIoSchdI_bldr);
			}
			if (!dbcSimIoSchdI.isEmpty()) {
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, dbcSimIoSchdI.size());
				dbcSimIoSchdI.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder dbcSimIoSchdI_bldr = MCQueryApiBuilder.create(MST_SIM_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_SIM_IO_SCHD_I01", dbcSimIoSchdI, dbcSimIoSchdI_bldr);
			}
			if (!dbcOrdIoSchdI.isEmpty()) {
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, dbcOrdIoSchdI.size());
				dbcOrdIoSchdI.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder dbcOrdIoSchdI_bldr = MCQueryApiBuilder.create(MST_ORD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_ORD_IO_SCHD_I01", dbcOrdIoSchdI, dbcOrdIoSchdI_bldr);
			}
			if (!dbcSavOrdIoSchdI.isEmpty()) {
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, dbcSavOrdIoSchdI.size());
				dbcSavOrdIoSchdI.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder dbcSavOrdIoSchdI_bldr = MCQueryApiBuilder.create(MST_SAVORD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_SAVORD_IO_SCHD_I01", dbcSavOrdIoSchdI, dbcSavOrdIoSchdI_bldr);
			}
			if (!oSchdI.up0().isEmpty()) {
				// 受払予定作成サービス実行
				oSchdI.exec();
			}
		}

		protected void updPrcd(Ord_Upd01_Dtl1R row,
				MCList<MST_PRCD_ITM_ORDER_R> dbcIOrdP,
				MCList<MST_PRCD_OPER_ORDER_R> dbcOperPI,
				MCList<MST_PRCD_IO_SCHD_R> dbcPrcdIoSchdI,
				MCList<Ord_Upd01_Dtl1R> delPList) {

			setDbcDefValue(row.ord());

			if(MSC_ITM_ORD_TYP.isMFG(row.itm_ord_typ())){
				if (row.oper_ord_pr_flg()) {
					Ord_Upd01_Dtl2R operR = up1().getFirst(_operIdx, row.itm_ord_no());
					if(!isNull(operR) && !isNull(operR.mst_mfg_loc_cd())) {
						row.mst_mfg_loc_cd(operR.mst_mfg_loc_cd());
					}
					else {
						row.mst_mfg_loc_cd(row.mfg_loc_cd());
					}
				}
				else if(isNull(row.mst_mfg_loc_cd())){
					row.mst_mfg_loc_cd(row.mfg_loc_cd());
				}
			}
			else {
				row.mst_mfg_loc_cd(MAC_STR.NULL_VAL.value());	
			}

			// 外注の場合は発注先、メーカ、工程パタンを上書き、
			if(MSC_ITM_ORD_TYP.isOUTSRC(row.itm_ord_typ())) {
				row.oper_ptn(MAC_STR.NULL_VAL.value());
				row.sppl_cd(MAC_STR.NULL_VAL.value());
				row.maker_cd(MAC_STR.NULL_VAL.value());
			}

			MST_PRCD_ITM_ORDER_R prcdr = MST_PRCD_ITM_ORDER_R.create();
			copy(prcdr, row, createMap_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R());
			dbcIOrdP.add(prcdr);
			// 工程オーダ
			for (Ord_Upd01_Dtl2R prcOperow : up1().subList(_operIdx, row.itm_ord_no())) {
				//　工程オーダはDEL-ADDしているので、削除行は省く
				if (prcOperow.isStatusDelete()) {
					continue;
				}
				MST_PRCD_OPER_ORDER_R dbcPrcOper = MST_PRCD_OPER_ORDER_R.create();
				prcOperow.itm_ord_sts_typ(row.itm_ord_sts_typ());
				if(isNull(prcOperow.oper_ptn())){
					prcOperow.oper_ptn(row.oper_ptn());
				}
				if (MSC_ITM_ORD_STS_TYP.isFIX(row.itm_ord_sts_typ())) {
					prcOperow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
				}
				else if (isNull(prcOperow.oper_ord_sts_typ())){
					prcOperow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
				}
				copy(dbcPrcOper, prcOperow,
						createMap_MST_PRCD_OPER_ORDER_R_Ord_Upd01_Dtl2R());
				dbcOperPI.add(dbcPrcOper);
			}
			if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
				delPList.add(row);
			}
			if (row.io_schd_pr_flg() && MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
				// 受払情報（入庫）
				dbcPrcdIoSchdI.add(getPrcdIoSchdGr(row));
				// 受払情報（出庫）
				dbcPrcdIoSchdI.addAll(getPrcdIoSchdGi(row));
			}

		}

		protected void updSim(Ord_Upd01_Dtl1R row,
				MCList<MST_SIM_ITM_ORDER_R> dbcIOrdS,
				MCList<MST_SIM_OPER_ORDER_R> dbcOperSI,
				MCList<MST_SIM_IO_SCHD_R> dbcSimIoSchdI,
				MCList<Ord_Upd01_Dtl1R> delSList) {

			MST_SIM_ITM_ORDER_R simr = MST_SIM_ITM_ORDER_R.create();
			copy(simr, row, createMap_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R());
			dbcIOrdS.add(simr);
			for (Ord_Upd01_Dtl2R simOperow : up1().subList(_operIdx, row.itm_ord_no())) {
				//　工程オーダはDEL-ADDしているので、削除行は省く
				if (simOperow.isStatusDelete()) {
					continue;
				}
				MST_SIM_OPER_ORDER_R dbcSimOper = MST_SIM_OPER_ORDER_R.create();
				simOperow.itm_ord_sts_typ(row.itm_ord_sts_typ());
				if(isNull(simOperow.oper_ptn())){
					simOperow.oper_ptn(row.oper_ptn());
				}
				if (MSC_ITM_ORD_STS_TYP.isFIX(simOperow.itm_ord_sts_typ())) {
					simOperow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
				}
				else if (isNull(simOperow.oper_ord_sts_typ())){
					simOperow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
				}
				copy(dbcSimOper, simOperow,
						createMap_MST_SIM_OPER_ORDER_R_Ord_Upd01_Dtl2R());
				dbcSimOper.sim_mrp_no(row.sim_mrp_no());
				dbcOperSI.add(dbcSimOper);
			}
			if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
				delSList.add(row);
			}
			if (row.io_schd_pr_flg() && MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
				// 受払情報（入庫）
				dbcSimIoSchdI.add(getSimIoSchdGr(row));
				// 受払情報（出庫）
				dbcSimIoSchdI.addAll(getSimIoSchdGi(row));
			}

		}

		protected void updMrp(Ord_Upd01_Dtl1R row,
				MCList<MST_ITM_ORDER_R> dbcIOrd,
				MCList<MST_OPER_ORDER_R> dbcOperI,
				MCList<MST_ORD_IO_SCHD_R> dbcOrdIoSchdI,
				MCList<MST_SAVORD_IO_SCHD_R> dbcSavOrdIoSchdI,
				MCList<IoSchd_Ins01_DtlR> oSchdI_up0, MCList<Ord_Upd01_Dtl1R> delList) {

			setDbcDefValue(row.ord());

			if(MSC_ITM_ORD_TYP.isMFG(row.itm_ord_typ())){
				if (row.oper_ord_pr_flg()) {
					Ord_Upd01_Dtl2R operR = up1().getFirst(_operIdx, row.itm_ord_no());
					if(!isNull(operR) && !isNull(operR.mst_mfg_loc_cd())) {
						row.mst_mfg_loc_cd(operR.mst_mfg_loc_cd());
					}
					else {
						row.mst_mfg_loc_cd(row.mfg_loc_cd());
					}
				}
				else if(isNull(row.mst_mfg_loc_cd())){
					row.mst_mfg_loc_cd(row.mfg_loc_cd());
				}
			}
			else {
				row.mst_mfg_loc_cd(MAC_STR.NULL_VAL.value());	
			}

			// 外注の場合は発注先、メーカ、工程パタンを上書き、
			if(MSC_ITM_ORD_TYP.isOUTSRC(row.itm_ord_typ())) {
				row.oper_ptn(MAC_STR.NULL_VAL.value());
				row.sppl_cd(MAC_STR.NULL_VAL.value());
				row.maker_cd(MAC_STR.NULL_VAL.value());
			}

			if (MSC_ITM_ORD_STS_TYP.isFIX(row.itm_ord_sts_typ())){
				if(isNull(row.fix_dt())) {
					row.fix_dt(getToday());
				}
			}
			else if (MSC_ITM_ORD_STS_TYP.isOPN(row.itm_ord_sts_typ())
					|| MSC_ITM_ORD_STS_TYP.isSAV(row.itm_ord_sts_typ())){
				row.fix_dt(null);
			}

			dbcIOrd.add(row.ord());
			for (Ord_Upd01_Dtl2R operow : up1().subList(_operIdx, row.itm_ord_no())) {
				//　工程オーダはDEL-ADDしているので、削除行は省く
				if (operow.isStatusDelete()) {
					continue;
				}
				operow.itm_ord_sts_typ(row.itm_ord_sts_typ());
				if(isNull(operow.oper_ptn())){
					operow.oper_ptn(row.oper_ptn());
				}
				if (MSC_ITM_ORD_STS_TYP.isFIX(row.itm_ord_sts_typ())) {
					operow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
					if (row.for_scheduler_frozen_flg()) {
						operow.scheduler_frozen_flg(true);
					}
				}
				else if (isNull(operow.oper_ord_sts_typ())){
					operow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
				}
				if (isNull(operow.oper_lt())) {
					operow.oper_lt(MCNumber.ZERO);
				}
				if (isNull(operow.oper_offst_typ())) {
					operow.oper_offst_typ(MAC_OFFST_TYP.BY_ST.value());
				}
				if (isNull(operow.oper_offst())) {
					operow.oper_offst(MCNumber.ZERO);
				}
				operow.oord().not_oper_schd_qty(operow.oper_schd_qty());
				dbcOperI.add(operow.oord());
			}
			if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
				delList.add(row);
			}
			if (row.io_schd_pr_flg() && MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
				// 受払情報
				if (MSC_ITM_ORD_STS_TYP.isOPN(row.itm_ord_sts_typ())) {
					dbcOrdIoSchdI.add(getOrdIoSchdGr(row, _cacheLoc));
					dbcOrdIoSchdI.addAll(getOrdIoSchdGi(row));
				}
				else if (MSC_ITM_ORD_STS_TYP.isSAV(row.itm_ord_sts_typ())) {
					dbcSavOrdIoSchdI.add(getSavOrdIoSchdGr(row, _cacheLoc));
					dbcOrdIoSchdI.addAll(getOrdIoSchdGi(row));
				}
				else if (MSC_ITM_ORD_STS_TYP.isFIX(row.itm_ord_sts_typ())
						&& MSC_ITM_ORD_TYP.isMFG(row.itm_ord_typ())) {
					oSchdI_up0.add(getIoSchdGr(row));
					oSchdI_up0.addAll(getIoSchdGi(row));
				}
			}
		}

		/** 品目オーダＮＯと工程オーダＮＯを発番する */
		protected void issueOrdNo() {
			setItmOrdNo();
			setOperOrdNo();
			_operIdx = up1().createIndex(Ord_Upd01_Dtl2R.$itm_ord_no);
		}

		/** 品目オーダＮＯを発番する */
		protected void setItmOrdNo() {
			MCList<Ord_Upd01_Dtl1R> insL = up0().subList(r -> isNull(r.itm_ord_no()));
			if (insL.size() > 0) {
				// 一括発番
				doSeqCache(MSC_NUM_SYS_TYP.IORD, insL.size());
				insL.forEach(r -> r.itm_ord_no(getStrSeq(MSC_NUM_SYS_TYP.IORD)));
			}
		}

		/** 工程行に品目オーダＮＯを設定し、工程オーダＮＯを発番する */
		protected void setOperOrdNo() {
			// 工程行は毎回洗替なので削除行以外は発番する
			MCIndexKey idx = up1().createIndex(Ord_Upd01_Dtl2R.$peg_no);
			MCList<Ord_Upd01_Dtl2R> operL = MCList.create(Ord_Upd01_Dtl2R.class);
			for (Ord_Upd01_Dtl1R h : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(h.data_crud_typ()) && isMfgOrOutSrc(h)) {
					for (Ord_Upd01_Dtl2R d: up1().subList(idx, h.peg_no())) {
						d.itm_ord_no(h.itm_ord_no());
						operL.add(d);
					}
				}
			}
			if (operL.size() > 0) {
				// シーケンス用キャッシュ
				doSeqCache(MSC_NUM_SYS_TYP.PORD, operL.size());
				operL.sort(Ord_Upd01_Dtl2R.$itm_ord_no, Ord_Upd01_Dtl2R.$disp_seq);
				operL.forEach(r -> r.oper_ord_no(getStrSeq(MSC_NUM_SYS_TYP.PORD)));
			}
		}

		/** 工程オーダ状況が保存の場合、品目オーダの品目オーダ状況も保存にする */
		protected void adjItmOrdSts() {
			MCIndexKey idx = up1().createIndex(Ord_Upd01_Dtl2R.$itm_ord_no);
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			for(Ord_Upd01_Dtl1R r : up0()){
				if(MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ())) {
					MST_ITM_ORDER_R itmOrdR = itmOrdL.add();
					itmOrdR.itm_ord_no(r.itm_ord_no());
				}
			}
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
			itmOrdL_bldr.setSelect(t.itm_ord_no, t.itm_ord_sts_typ);
			dbSelectKey("MSBCL5010_MST_ITM_ORDER_S01", itmOrdL, itmOrdL_bldr, itmOrdL);
			MCIndexKey itmOrdIdx = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no); 
			for (Ord_Upd01_Dtl1R r : up0()) {
				if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ()) && isMfgOrOutSrc(r)) {
					MCList<Ord_Upd01_Dtl2R> operL = up1().subList(idx, r.itm_ord_no());
					
					if (!isNull(operL.getFirst(Ord_Upd01_Dtl2R.$oper_ord_sts_typ,MSC_OPER_ORD_STS_TYP.SAV.value()))) {
						MST_ITM_ORDER_R itmOrd = itmOrdL.getFirst(itmOrdIdx, r.itm_ord_no());
						if (isNullOrNullVal(r.oper_ptn()) || MSC_ITM_ORD_STS_TYP.isSAV(itmOrd.itm_ord_sts_typ())){
							for(Ord_Upd01_Dtl2R operRow : operL) {
								operRow.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
							}
						}
						else {
							r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
							MCMessagePool.add(new MCMessage(r, null, MSBCL0089, r.itm_ord_no(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
						}
					}
				}
			}
		}

		/** 日次生産依頼の確定フラグを更新する */
		protected void updRqmtFixFlg() {
			MCList<MST_RQMT_R> rqmtL = MCList.create(MST_RQMT_R.class);
			for (Ord_Upd01_Dtl1R r: up0()) {
				// Ord_Upd01では確定解除はない
				if(!isNull(r.rqmt_no()) 
						&& MSC_MRP_TYP.isMRP(r.mrp_typ())
						&& (MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ())	
								 || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()))) {
					MST_RQMT_R rqmtR = MST_RQMT_R.create();
					rqmtR.rqmt_no(r.rqmt_no());
					rqmtL.add(rqmtR);
				}
			}
			if (!rqmtL.isEmpty()) {
				updRqmt(rqmtL.groupBy(MST_RQMT_R.$rqmt_no));
			}
		}

		/**　下り電文設定 */
		protected void setDown() {

			for (Ord_Upd01_Dtl1R row : up0()) {
				Ord_Upd01_Rslt1R ordR = Ord_Upd01_Rslt1R.create();
				ordR.peg_no(row.peg_no());
				ordR.itm_ord_no(row.itm_ord_no());
				down0().add(ordR);
			}

			for (Ord_Upd01_Dtl2R row : up1()) {
				Ord_Upd01_Rslt2R operR = Ord_Upd01_Rslt2R.create();
				operR.peg_no(row.peg_no());
				operR.peg_no_d(row.peg_no_d());
				operR.itm_ord_no(row.itm_ord_no());
				operR.oper_ord_no(row.oper_ord_no());
				operR.st_schd_tm(row.st_schd_tm());
				operR.end_schd_tm(row.end_schd_tm());
				operR.oper_lt(row.oper_lt());
				operR.oper_offst_typ(row.oper_offst_typ());
				operR.oper_offst(row.oper_offst());
				operR.oper_schd_qty(row.oper_schd_qty());
				operR.disp_seq(row.disp_seq());
				operR.oper_ptn(row.oper_ptn());
				operR.oper_cd(row.oper_cd());
				operR.oper_seq(row.oper_seq());
				operR.loc_cd(row.loc_cd());
				operR.oper_ord_sts_typ(row.oper_ord_sts_typ());
				operR.itm_ord_sts_typ(row.itm_ord_sts_typ());
				operR.wg_cd(row.wg_cd());
				operR.yield_oper_flg(row.yield_oper_flg());
				down1().add(operR);
			}
		}

		/** 工程展開サービス呼び出し */
		protected void callOrdRegSprt01Srv() {
			MCList<Ord_Upd01_Dtl1R> operExpL = up0().subList(r -> isOperExp(r));
			if (operExpL.isEmpty()) {
				return;
			}

			MSBCL_OrdRegService.Ord_Sprt01 ope = MSBCL_OrdRegService.crtOrd_Sprt01();
			addAll(ope.up0(), operExpL, createMap_Ord_Sprt01_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();

			// 上り電文に工程展開結果を追加
			addAll(up1(), ope.down0(), createMap_Ord_Upd01_Dtl2R_Ord_Sprt01_RsltR());
		}

		/** 構成展開サービス呼び出し */
		protected void callOrdRegSprt02Srv() {
			MCList<Ord_Upd01_Dtl1R> bomExpL = up0().subList(r -> isBomExp(r));
			if (bomExpL.isEmpty()) {
				return ;
			}

			int i = 0;
			MSBCL_OrdRegService.Ord_Sprt02 ope = MSBCL_OrdRegService.crtOrd_Sprt02();
			ope.up0().inst_exp_flg(false);
			ope.up0().get_prov_upri_flg(false);
			for (Ord_Upd01_Dtl1R row : bomExpL) {
				for (Ord_Upd01_Dtl2R opR : up1().subList(_operIdx, row.itm_ord_no())) {
					Ord_Sprt02_DtlR r = Ord_Sprt02_DtlR.create();
					copy(r, row, createMap_Ord_Sprt02_DtlR_Ord_Upd01_Dtl1R());
					r.peg_no(i++);
					r.oper_ord_no(opR.oper_ord_no());
					r.oper_cd(opR.oper_cd());
					r.oper_seq(opR.oper_seq());
					r.st_schd_tm(opR.st_schd_tm());
					r.end_schd_tm(opR.end_schd_tm());
					r.cur_cd(null);
					r.mfg_loc_cd(opR.loc_cd());
					r.inst_qty(opR.oper_schd_qty());
					ope.up1().add(r);
				}
			}
			ope.exec();

			_bomExpL.setAll(ope.down0());
			_bomIdx = _bomExpL.createIndex(Ord_Sprt02_RsltR.$itm_ord_no);
		}

		/** 出荷・供給依頼サービス呼び出し */
		protected void callShipDmndRqstSrv() {
			MCList<Ord_Upd01_Dtl1R> rqstL = up0().subList(r -> isCallShipDmndRqst(r));
			if (rqstL.isEmpty()) {
				return;
			}

			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 ope =
				MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			addAll(ope.up0(), rqstL, createMap_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();
		}

		/** 受注状況登録サービス呼び出し */
		protected void callSloStsInsSrv() {
			MCList<Ord_Upd01_Dtl1R> sloStsInsL = up0().subList(r->isCallSloStsInsSrv(r));
			if(sloStsInsL.isEmpty()){
				return;
			}

			MSBBL_SloStsRegService.SloSts_Ins02 ope = MSBBL_SloStsRegService.crtSloSts_Ins02();
			addAll(ope.up0(), sloStsInsL, createMap_SloSts_DtlR_Ord_Upd01_Dtl1R());
			// Ord_Upd01では確定のみ
			ope.up0().setStringNE(SloSts_DtlR.$slo_sts_typ, MSC_SLO_STS_TYP.MFG_FIX.value());
			ope.exec();
		}

		/** 
		 * 工程展開対象であるかどうかを返す</br>
		 * 上り電文の工程オーダ作成フラグがオンかつ
		 * 製造もしくは外注の場合に対象
		 */
		protected boolean isOperExp(Ord_Upd01_Dtl1R r) {
			return r.oper_ord_pr_flg() && isMfgOrOutSrc(r);
		}

		/** 
		 * 構成展開対象であるかどうかを返す</br>
		 * 上り電文の受払予定生成フラグがオンかつ
		 * 製造もしくは外注の場合に対象
		 */
		protected boolean isBomExp(Ord_Upd01_Dtl1R r) {
			return r.io_schd_pr_flg() && isMfgOrOutSrc(r);
		}

		/** 出荷・供給依頼サービスの呼び出し対象であるかどうかを返す */
		protected boolean isCallShipDmndRqst(Ord_Upd01_Dtl1R r) {
			// 計画外で作られた品目オーダは対象外
			return MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ())
					&& !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& !(MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ()) && !r.uplnd_outsrc_flg());
		}

		/** 受注状況更新サービスの呼び出し対象であるかどうかを返す */
		protected boolean isCallSloStsInsSrv(Ord_Upd01_Dtl1R r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ())
					&& MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ());
		}

		//-----Mapper------------------------

		/** Ord_Upd01_Dtl1R → Ord_Sprt01_DtlR (Ord_Upd01 → Ord_Sprt01) */
		protected Map_Ord_Sprt01_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt01_DtlR, Ord_Upd01_Dtl1R> createMap_Ord_Sprt01_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_Ord_Sprt01_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt01_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → Ord_Sprt01_DtlR (Ord_Upd01 → Ord_Sprt01) */
		public class Map_Ord_Sprt01_DtlR_Ord_Upd01_Dtl1R<D extends Ord_Sprt01_DtlR, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt01_DtlR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(Ord_Sprt01_DtlR.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(Ord_Sprt01_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(Ord_Sprt01_DtlR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(Ord_Sprt01_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(Ord_Sprt01_DtlR.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt01_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt01_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Sprt01_DtlR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
			}
		}

		/** Ord_Sprt02_DtlR → Ord_Upd01_Dtl1R (Ord_Upd01 → Ord_Sprt02) */
		protected Map_Ord_Sprt02_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt02_DtlR, Ord_Upd01_Dtl1R> createMap_Ord_Sprt02_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_Ord_Sprt02_DtlR_Ord_Upd01_Dtl1R<Ord_Sprt02_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Sprt02_DtlR → Ord_Upd01_Dtl1R (Ord_Upd01 → Ord_Sprt02) */
		public class Map_Ord_Sprt02_DtlR_Ord_Upd01_Dtl1R<D extends Ord_Sprt02_DtlR, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
			}
		}

		/** Ord_Sprt01_RsltR → Ord_Upd01_Dtl2R (Ord_Sprt01 → Ord_Upd01) */
		protected Map_Ord_Upd01_Dtl2R_Ord_Sprt01_RsltR<Ord_Upd01_Dtl2R, Ord_Sprt01_RsltR> createMap_Ord_Upd01_Dtl2R_Ord_Sprt01_RsltR() {
			return new Map_Ord_Upd01_Dtl2R_Ord_Sprt01_RsltR<Ord_Upd01_Dtl2R, Ord_Sprt01_RsltR>();
		}

		/** Ord_Sprt01_RsltR → Ord_Upd01_Dtl2R (Ord_Sprt01 → Ord_Upd01) */
		public class Map_Ord_Upd01_Dtl2R_Ord_Sprt01_RsltR<D extends Ord_Upd01_Dtl2R, S extends Ord_Sprt01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no, Ord_Sprt01_RsltR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_no, Ord_Sprt01_RsltR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_sts_typ, Ord_Sprt01_RsltR.$oper_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$st_schd_tm, Ord_Sprt01_RsltR.$st_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$end_schd_tm, Ord_Sprt01_RsltR.$end_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_lt, Ord_Sprt01_RsltR.$oper_lt);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst_typ, Ord_Sprt01_RsltR.$oper_offst_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst, Ord_Sprt01_RsltR.$oper_offst);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_schd_qty, Ord_Sprt01_RsltR.$oper_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl2R.$disp_seq, Ord_Sprt01_RsltR.$disp_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ptn, Ord_Sprt01_RsltR.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_cd, Ord_Sprt01_RsltR.$oper_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_seq, Ord_Sprt01_RsltR.$oper_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$loc_cd, Ord_Sprt01_RsltR.$oper_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$mst_mfg_loc_cd, Ord_Sprt01_RsltR.$mst_mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$wg_cd, Ord_Sprt01_RsltR.$wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$yield_oper_flg, Ord_Sprt01_RsltR.$yield_oper_flg);
			}
		}

		protected Map_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R<MST_PRCD_ITM_ORDER_R, Ord_Upd01_Dtl1R> createMap_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R() {
			return new Map_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R<MST_PRCD_ITM_ORDER_R, Ord_Upd01_Dtl1R>();
		}

		public class Map_MST_PRCD_ITM_ORDER_R_Ord_Upd01_Dtl1R<D extends MST_PRCD_ITM_ORDER_R, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$ord_gnrt_typ, Ord_Upd01_Dtl1R.$ord_gnrt_typ);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$strg_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mfg_loc_cd,Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mst_mfg_loc_cd, Ord_Upd01_Dtl1R.$mst_mfg_loc_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$rqst_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$not_inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$itm_ord_sts_typ, Ord_Upd01_Dtl1R.$itm_ord_sts_typ);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$po_schd_dt,Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_po_schd_dt, Ord_Upd01_Dtl1R.$mrp_po_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_purc_lt, Ord_Upd01_Dtl1R.$mrp_purc_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mrp_mfg_st_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mrp_mfg_end_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_mfg_lt, Ord_Upd01_Dtl1R.$mrp_mfg_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_gi_schd_dt, Ord_Upd01_Dtl1R.$mrp_gi_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_strg_schd_dt, Ord_Upd01_Dtl1R.$mrp_strg_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_accpt_schd_dt, Ord_Upd01_Dtl1R.$mrp_accpt_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_insp_st_schd_dt, Ord_Upd01_Dtl1R.$mrp_insp_st_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$mrp_insp_end_schd_dt, Ord_Upd01_Dtl1R.$mrp_insp_end_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno_typ1, Ord_Upd01_Dtl1R.$sno_typ1);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno_typ2, Ord_Upd01_Dtl1R.$sno_typ2);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno_typ3, Ord_Upd01_Dtl1R.$sno_typ3);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sno_typ4, Ord_Upd01_Dtl1R.$sno_typ4);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$lmt_dt, Ord_Upd01_Dtl1R.$lmt_dt);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$ord_fix_pd, Ord_Upd01_Dtl1R.$ord_fix_pd);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$rqmt_no, Ord_Upd01_Dtl1R.$rqmt_no);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$inst_po_cnt_rmrks, Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sim_mrp_no, Ord_Upd01_Dtl1R.$sim_mrp_no);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$io_schd_pr_no, Ord_Upd01_Dtl1R.$io_schd_pr_no);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$intr_rmrks, Ord_Upd01_Dtl1R.$intr_rmrks);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sub_char1, Ord_Upd01_Dtl1R.$sub_char1);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sub_char2, Ord_Upd01_Dtl1R.$sub_char2);
				addColumnPathMap(MST_PRCD_ITM_ORDER_R.$sub_char3, Ord_Upd01_Dtl1R.$sub_char3);
			}
		}

		protected Map_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R<MST_SIM_ITM_ORDER_R, Ord_Upd01_Dtl1R> createMap_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R() {
			return new Map_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R<MST_SIM_ITM_ORDER_R, Ord_Upd01_Dtl1R>();
		}

		public class Map_MST_SIM_ITM_ORDER_R_Ord_Upd01_Dtl1R<D extends MST_SIM_ITM_ORDER_R, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$ord_gnrt_typ, Ord_Upd01_Dtl1R.$ord_gnrt_typ);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$strg_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$rqst_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$not_inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$itm_ord_sts_typ, Ord_Upd01_Dtl1R.$itm_ord_sts_typ);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_po_schd_dt, Ord_Upd01_Dtl1R.$mrp_po_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_purc_lt, Ord_Upd01_Dtl1R.$mrp_purc_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mrp_mfg_st_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mrp_mfg_end_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_mfg_lt, Ord_Upd01_Dtl1R.$mrp_mfg_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_gi_schd_dt, Ord_Upd01_Dtl1R.$mrp_gi_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_strg_schd_dt, Ord_Upd01_Dtl1R.$mrp_strg_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_accpt_schd_dt, Ord_Upd01_Dtl1R.$mrp_accpt_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_insp_st_schd_dt, Ord_Upd01_Dtl1R.$mrp_insp_st_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$mrp_insp_end_schd_dt, Ord_Upd01_Dtl1R.$mrp_insp_end_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno_typ1, Ord_Upd01_Dtl1R.$sno_typ1);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno_typ2, Ord_Upd01_Dtl1R.$sno_typ2);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno_typ3, Ord_Upd01_Dtl1R.$sno_typ3);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sno_typ4, Ord_Upd01_Dtl1R.$sno_typ4);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$lmt_dt, Ord_Upd01_Dtl1R.$lmt_dt);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$ord_fix_pd, Ord_Upd01_Dtl1R.$ord_fix_pd);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$rqmt_no, Ord_Upd01_Dtl1R.$rqmt_no);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$inst_po_cnt_rmrks, Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sim_mrp_no, Ord_Upd01_Dtl1R.$sim_mrp_no);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$io_schd_pr_no, Ord_Upd01_Dtl1R.$io_schd_pr_no);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$intr_rmrks, Ord_Upd01_Dtl1R.$intr_rmrks);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sub_char1, Ord_Upd01_Dtl1R.$sub_char1);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sub_char2, Ord_Upd01_Dtl1R.$sub_char2);
				addColumnPathMap(MST_SIM_ITM_ORDER_R.$sub_char3, Ord_Upd01_Dtl1R.$sub_char3);
			}
		}

		protected Map_MST_PRCD_OPER_ORDER_R_Ord_Upd01_Dtl2R<MST_PRCD_OPER_ORDER_R, Ord_Upd01_Dtl2R> createMap_MST_PRCD_OPER_ORDER_R_Ord_Upd01_Dtl2R() {
			return new Map_MST_PRCD_OPER_ORDER_R_Ord_Upd01_Dtl2R<MST_PRCD_OPER_ORDER_R, Ord_Upd01_Dtl2R>();
		}

		public class Map_MST_PRCD_OPER_ORDER_R_Ord_Upd01_Dtl2R<D extends MST_PRCD_OPER_ORDER_R, S extends Ord_Upd01_Dtl2R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_ord_no, Ord_Upd01_Dtl2R.$oper_ord_no);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$st_schd_tm, Ord_Upd01_Dtl2R.$st_schd_tm);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$end_schd_tm, Ord_Upd01_Dtl2R.$end_schd_tm);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_lt, Ord_Upd01_Dtl2R.$oper_lt);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_offst_typ, Ord_Upd01_Dtl2R.$oper_offst_typ);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_offst, Ord_Upd01_Dtl2R.$oper_offst);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_schd_qty, Ord_Upd01_Dtl2R.$oper_schd_qty);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$not_oper_schd_qty, Ord_Upd01_Dtl2R.$oper_schd_qty);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$itm_ord_no, Ord_Upd01_Dtl2R.$itm_ord_no);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$disp_seq, Ord_Upd01_Dtl2R.$disp_seq);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_ptn, Ord_Upd01_Dtl2R.$oper_ptn);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_cd, Ord_Upd01_Dtl2R.$oper_cd);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_seq, Ord_Upd01_Dtl2R.$oper_seq);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$loc_cd, Ord_Upd01_Dtl2R.$loc_cd);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$oper_ord_sts_typ, Ord_Upd01_Dtl2R.$oper_ord_sts_typ);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$itm_ord_sts_typ, Ord_Upd01_Dtl2R.$itm_ord_sts_typ);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$wg_cd, Ord_Upd01_Dtl2R.$wg_cd);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$yield_oper_flg, Ord_Upd01_Dtl2R.$yield_oper_flg);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$intr_rmrks, Ord_Upd01_Dtl2R.$intr_rmrks);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$sub_char1, Ord_Upd01_Dtl2R.$sub_char1);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$sub_char2, Ord_Upd01_Dtl2R.$sub_char2);
				addColumnPathMap(MST_PRCD_OPER_ORDER_R.$sub_char3, Ord_Upd01_Dtl2R.$sub_char3);
			}

			protected void valueCopy(D dest, S src) {
				if (isNull(src.oper_lt())) {
					dest.oper_lt(MCNumber.ZERO);
				}
				if (isNull(src.oper_offst_typ())) {
					dest.oper_offst_typ(MAC_OFFST_TYP.BY_ST.value());
				}
				if (isNull(src.oper_offst())) {
					dest.oper_offst(MCNumber.ZERO);
				}
				dest.not_oper_schd_qty(src.oper_schd_qty());
			}
		}

		protected Map_MST_SIM_OPER_ORDER_R_Ord_Upd01_Dtl2R<MST_SIM_OPER_ORDER_R, Ord_Upd01_Dtl2R> createMap_MST_SIM_OPER_ORDER_R_Ord_Upd01_Dtl2R() {
			return new Map_MST_SIM_OPER_ORDER_R_Ord_Upd01_Dtl2R<MST_SIM_OPER_ORDER_R, Ord_Upd01_Dtl2R>();
		}

		public class Map_MST_SIM_OPER_ORDER_R_Ord_Upd01_Dtl2R<D extends MST_SIM_OPER_ORDER_R, S extends Ord_Upd01_Dtl2R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_ord_no, Ord_Upd01_Dtl2R.$oper_ord_no);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$st_schd_tm, Ord_Upd01_Dtl2R.$st_schd_tm);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$end_schd_tm, Ord_Upd01_Dtl2R.$end_schd_tm);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_lt, Ord_Upd01_Dtl2R.$oper_lt);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_offst_typ, Ord_Upd01_Dtl2R.$oper_offst_typ);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_offst, Ord_Upd01_Dtl2R.$oper_offst);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_schd_qty, Ord_Upd01_Dtl2R.$oper_schd_qty);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$not_oper_schd_qty, Ord_Upd01_Dtl2R.$oper_schd_qty);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$itm_ord_no, Ord_Upd01_Dtl2R.$itm_ord_no);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$disp_seq, Ord_Upd01_Dtl2R.$disp_seq);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_ptn, Ord_Upd01_Dtl2R.$oper_ptn);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_cd, Ord_Upd01_Dtl2R.$oper_cd);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_seq, Ord_Upd01_Dtl2R.$oper_seq);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$loc_cd, Ord_Upd01_Dtl2R.$loc_cd);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$oper_ord_sts_typ, Ord_Upd01_Dtl2R.$oper_ord_sts_typ);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$itm_ord_sts_typ, Ord_Upd01_Dtl2R.$itm_ord_sts_typ);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$wg_cd, Ord_Upd01_Dtl2R.$wg_cd);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$yield_oper_flg, Ord_Upd01_Dtl2R.$yield_oper_flg);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$sim_mrp_no, Ord_Upd01_Dtl1R.$sim_mrp_no);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$intr_rmrks, Ord_Upd01_Dtl2R.$intr_rmrks);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$sub_char1, Ord_Upd01_Dtl2R.$sub_char1);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$sub_char2, Ord_Upd01_Dtl2R.$sub_char2);
				addColumnPathMap(MST_SIM_OPER_ORDER_R.$sub_char3, Ord_Upd01_Dtl2R.$sub_char3);
			}
		}

		/** 
		 * Ord_Sprt02_RsltR → IoSchd_Ins01_DtlR (Ord_Upd01 → IoSchd_Ins01)
		 * 確定受払予定（製造出庫）
		 */
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
			return new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
		}

		/** 
		 * Ord_Sprt02_RsltR → IoSchd_Ins01_DtlR (Ord_Upd01 → IoSchd_Ins01)
		 * 確定受払予定（製造出庫）
		 */
		public class Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<D extends IoSchd_Ins01_DtlR, S extends Ord_Sprt02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, Ord_Sprt02_RsltR.$itm_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, Ord_Sprt02_RsltR.$itm_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no1, Ord_Sprt02_RsltR.$itm_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no2, Ord_Sprt02_RsltR.$oper_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Ord_Sprt02_RsltR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
				addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, Ord_Sprt02_RsltR.$oper_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, Ord_Sprt02_RsltR.$alt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_itm_ratio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Ord_Sprt02_RsltR.$loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Ord_Sprt02_RsltR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Ord_Sprt02_RsltR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Ord_Sprt02_RsltR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Ord_Sprt02_RsltR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value());
				dest.str_ln_cd(MAC_STR.NULL_VAL.value());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					dest.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
					dest.sno1_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
					dest.sno2_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
					dest.sno3_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
					dest.sno4_null_flg(true);
				}
				dest.gd_cd(getDefaultFeedStkGd().gd_cd());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
		}

		/** Ord_Upd01_Dtl1R → SloSts_DtlR (Ord_Upd01 → SloSts_Ins02) */
		protected Map_SloSts_DtlR_Ord_Upd01_Dtl1R<SloSts_DtlR,Ord_Upd01_Dtl1R> createMap_SloSts_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_SloSts_DtlR_Ord_Upd01_Dtl1R<SloSts_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → SloSts_DtlR (Ord_Upd01 → SloSts_Ins02) */
		public class Map_SloSts_DtlR_Ord_Upd01_Dtl1R<D extends SloSts_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(SloSts_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(SloSts_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(SloSts_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(SloSts_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(SloSts_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(SloSts_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(SloSts_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(SloSts_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(SloSts_DtlR.$qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(SloSts_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(SloSts_DtlR.$biz_tm, Ord_Upd01_Dtl1R.$fix_dt);
			}
		}

		/** 未確定・保存受払予定（出庫） */
		protected MCList<MST_ORD_IO_SCHD_R> getOrdIoSchdGi(Ord_Upd01_Dtl1R src) {
			MCList<MST_ORD_IO_SCHD_R> retL = MCList.create(MST_ORD_IO_SCHD_R.class);
			if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
				
				MST_ORD_IO_SCHD_R retR = MST_ORD_IO_SCHD_R.create();
				retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
				retR.io_typ(MSC_IO_TYP.GI.value());
				if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
				}
				else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
				}
				retR.io_schd_no(src.itm_ord_no());
				retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				retR.io_schd_sub_no1(src.itm_ord_no());
				retR.io_schd_pr_no(src.io_schd_pr_no());
				retR.schd_dt(src.gi_schd_dt());
				retR.accpt_schd_dt(null);
				retR.avl_schd_dt(null);
				retR.itm_cd(src.itm_cd());
				retR.itm_sub1(src.itm_sub1());
				retR.itm_sub2(src.itm_sub2());
				retR.itm_sub3(src.itm_sub3());
				retR.ver_no(src.ver_no());
				retR.loc_cd(src.rqst_loc_cd());
				retR.str_ln_cd(MAC_STR.NULL_VAL.value());
				retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					retR.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
					retR.sublot_no(MAC_STR.NULL_VAL.value());
				}

				// 手配ＮＯx
				// ＭＲＰ用
				retR.ex_sno1(src.sno1());
				retR.ex_sno2(src.sno2());
				retR.ex_sno3(src.sno3());
				retR.ex_sno4(src.sno4());

				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
					retR.sno1(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
					retR.sno2(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
					retR.sno3(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
					retR.sno4(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
				}
				
				// 手配ＮＯx無可ＦＬＧ
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
					retR.sno1_null_flg(true);
				}
				else {
					retR.sno1_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
					retR.sno2_null_flg(true);
				}
				else {
					retR.sno2_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
					retR.sno3_null_flg(true);
				}
				else {
					retR.sno3_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
					retR.sno4_null_flg(true);
				}
				else {
					retR.sno4_null_flg(false);
				}
				
				retR.pack_unit_cd(src.unit_cd());
				retR.pack_unit_qty(src.yield_schd_qty());
				retR.base_unit_cd(src.unit_cd());
				retR.base_unit_qty(src.yield_schd_qty());
				retR.gd_cd(getDefaultFeedStkGd().gd_cd());
				retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
				retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())) {
					retR.wg_cd(src.wg_cd());
				}
				else {
					retR.wg_cd(src.rqst_wg_cd());
				}
				retR.sppl_cd(src.sppl_cd());
				retR.gi_loc_cd(src.rqst_loc_cd());
				retR.gr_loc_cd(src.strg_loc_cd());
				retR.org_wg_cd(src.wg_cd());
				retR.sim_mrp_no(src.sim_mrp_no());
				retL.add(retR);
			}
			else if (isMfgOrOutSrc(src)) {
				for (Ord_Sprt02_RsltR r : _bomExpL.subList(_bomIdx, src.itm_ord_no())) {
					if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
						continue;
					}
					
					MST_ORD_IO_SCHD_R retR = MST_ORD_IO_SCHD_R.create();
					
					retR.io_schd_typ(MSC_IO_SCHD_TYP.INPT_PLN.value());
					retR.io_typ(MSC_IO_TYP.GI.value());
					if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
					}
					else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
					}
					retR.io_schd_no(src.itm_ord_no());
					retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
					retR.io_schd_sub_no1(src.itm_ord_no());
					retR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value());
					retR.io_schd_sub_no2(r.oper_ord_no());
					retR.io_schd_pr_no(src.itm_ord_no());
					retR.schd_dt(r.schd_in_dt().trunc(MCDateFieldType.DAY));
					retR.itm_cd(r.itm_cd());
					retR.itm_sub1(r.itm_sub1());
					retR.itm_sub2(r.itm_sub2());
					retR.itm_sub3(r.itm_sub3());
					retR.ver_no(r.ver_no());
					retR.alt_grp_cd(r.alt_grp_cd());
					retR.alt_grp_seq(r.alt_grp_seq());
					retR.oper_ord_no(r.oper_ord_no());
					retR.alt_qty(r.alt_qty());
					retR.alt_itm_typ(r.alt_itm_typ());
					retR.alt_itm_ratio(r.alt_itm_ratio());
					retR.alt_alloc_prio(r.alt_alloc_prio());
					retR.loc_cd(r.loc_cd());
					retR.str_ln_cd(MAC_STR.NULL_VAL.value());
					retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						retR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						retR.sublot_no(MAC_STR.NULL_VAL.value());
					}

					// 手配ＮＯx
					//ＭＲＰ用
					retR.ex_sno1(r.sno1());
					retR.ex_sno2(r.sno2());
					retR.ex_sno3(r.sno3());
					retR.ex_sno4(r.sno4());
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						retR.sno1(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						retR.sno2(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						retR.sno3(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						retR.sno4(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
					}
					
					// 手配ＮＯx無可ＦＬＧ
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ1())) {
						retR.sno1_null_flg(true);
					}
					else {
						retR.sno1_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ2())) {
						retR.sno2_null_flg(true);
					}
					else {
						retR.sno2_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ3())) {
						retR.sno3_null_flg(true);
					}
					else {
						retR.sno3_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ4())) {
						retR.sno4_null_flg(true);
					}
					else {
						retR.sno4_null_flg(false);
					}
					
					retR.pack_unit_cd(r.unit_cd());
					retR.pack_unit_qty(r.rqmt_qty());
					retR.base_unit_cd(r.unit_cd());
					retR.base_unit_qty(r.rqmt_qty());
					retR.gd_cd(getDefaultFeedStkGd().gd_cd());
					retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
					retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
					retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
					retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					retR.wg_cd(src.wg_cd());
					retR.inpt_ctl_typ(r.inpt_ctl_typ());
					retR.org_wg_cd(src.wg_cd());
					retR.sim_mrp_no(src.sim_mrp_no());
					retL.add(retR);
				}
			}
			return retL;
		}

		/** 確定受払予定（製造入庫） */
		protected IoSchd_Ins01_DtlR getIoSchdGr(Ord_Upd01_Dtl1R row) {
			IoSchd_Ins01_DtlR retR = IoSchd_Ins01_DtlR.create();
			copy(retR, row, createMap_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R());
			return retR;
		}

		/** 確定受払予定（製造出庫） */
		protected MCList<IoSchd_Ins01_DtlR> getIoSchdGi(Ord_Upd01_Dtl1R row) {
			MCList<IoSchd_Ins01_DtlR> retL = MCList.create(IoSchd_Ins01_DtlR.class);
			MCList<Ord_Sprt02_RsltR> inptL = _bomExpL.subList(_bomIdx, row.itm_ord_no());
			addAll(retL, inptL, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
			return retL;
		}

		/** 先行手配未確定受払予定（入庫） */
		protected MST_PRCD_IO_SCHD_R getPrcdIoSchdGr(Ord_Upd01_Dtl1R src) {
			MST_PRCD_IO_SCHD_R retR = MST_PRCD_IO_SCHD_R.create();
			if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.MFG_PLN.value());
			}
			else if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()))) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_PLN.value());
			}
			else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PLN.value());
			}
			retR.io_typ(MSC_IO_TYP.GR.value());
			if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
				retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
			}
			else if (MSC_ITM_ORD_STS_TYP.isFIX(src.itm_ord_sts_typ())) {
				retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
			}
			retR.io_schd_no(src.itm_ord_no());
			retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
			retR.io_schd_sub_no1(src.itm_ord_no());
			retR.io_schd_pr_no(src.io_schd_pr_no());
			retR.schd_dt(src.strg_schd_dt());
			retR.accpt_schd_dt(src.accpt_schd_dt());
			retR.avl_schd_dt(src.avl_schd_dt());
			retR.itm_cd(src.itm_cd());
			retR.itm_sub1(src.itm_sub1());
			retR.itm_sub2(src.itm_sub2());
			retR.itm_sub3(src.itm_sub3());
			retR.ver_no(src.ver_no());
			retR.loc_cd(src.strg_loc_cd());
			retR.str_ln_cd(MAC_STR.NULL_VAL.value());
			MAM_LOC_R locR = _cacheLoc.get(retR.loc_cd());
			retR.stk_arrv_bp_cd(nvl(locR.sppl_cd(), MAC_STR.NULL_VAL.value()));
			if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
				retR.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
				retR.sublot_no(MAC_STR.NULL_VAL.value());
			}
			
			// 手配ＮＯx
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
				retR.sno1(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
				retR.sno2(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
				retR.sno3(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
				retR.sno4(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			}
			
			retR.pack_unit_cd(src.unit_cd());
			retR.pack_unit_qty(src.yield_schd_qty());
			retR.base_unit_cd(src.unit_cd());
			retR.base_unit_qty(src.yield_schd_qty());
			retR.gd_cd(getDefaultFeedStkGd().gd_cd());
			retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
			retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
			retR.wg_cd(src.wg_cd());
			if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
				retR.sppl_cd(src.sppl_cd());
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
				retR.sppl_cd(src.mfg_sppl_cd());
			}
			else {
				retR.sppl_cd(null);
			}
			if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
				retR.gi_loc_cd(src.rqst_loc_cd());
				retR.gr_loc_cd(src.strg_loc_cd());
			}
			retR.org_wg_cd(src.wg_cd());
			return retR;
		}

		/** 先行手配未確定受払予定（出庫） */
		protected MCList<MST_PRCD_IO_SCHD_R> getPrcdIoSchdGi(Ord_Upd01_Dtl1R src) {
			MCList<MST_PRCD_IO_SCHD_R> retL = MCList.create(MST_PRCD_IO_SCHD_R.class);
			if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
				MST_PRCD_IO_SCHD_R retR = MST_PRCD_IO_SCHD_R.create();
				retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
				retR.io_typ(MSC_IO_TYP.GI.value());
				if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
				}
				else if (MSC_ITM_ORD_STS_TYP.isFIX(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
				}
				retR.io_schd_no(src.itm_ord_no());
				retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				retR.io_schd_sub_no1(src.itm_ord_no());
				retR.io_schd_pr_no(src.io_schd_pr_no());
				retR.schd_dt(src.gi_schd_dt());
				retR.accpt_schd_dt(null);
				retR.avl_schd_dt(null);
				retR.itm_cd(src.itm_cd());
				retR.itm_sub1(src.itm_sub1());
				retR.itm_sub2(src.itm_sub2());
				retR.itm_sub3(src.itm_sub3());
				retR.ver_no(src.ver_no());
				retR.loc_cd(src.rqst_loc_cd());
				retR.str_ln_cd(MAC_STR.NULL_VAL.value());
				retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					retR.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
					retR.sublot_no(MAC_STR.NULL_VAL.value());
				}

				// 手配ＮＯx
				//ＭＲＰ用
				retR.ex_sno1(src.sno1());
				retR.ex_sno2(src.sno2());
				retR.ex_sno3(src.sno3());
				retR.ex_sno4(src.sno4());

				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
					retR.sno1(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
					retR.sno2(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
					retR.sno3(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
					retR.sno4(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
				}
				
				// 手配ＮＯx無可ＦＬＧ
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
					retR.sno1_null_flg(true);
				}
				else {
					retR.sno1_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
					retR.sno2_null_flg(true);
				}
				else {
					retR.sno2_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
					retR.sno3_null_flg(true);
				}
				else {
					retR.sno3_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
					retR.sno4_null_flg(true);
				}
				else {
					retR.sno4_null_flg(false);
				}
				
				retR.pack_unit_cd(src.unit_cd());
				retR.pack_unit_qty(src.yield_schd_qty());
				retR.base_unit_cd(src.unit_cd());
				retR.base_unit_qty(src.yield_schd_qty());
				retR.gd_cd(getDefaultFeedStkGd().gd_cd());
				retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
				retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())) {
					retR.wg_cd(src.wg_cd());
				}
				else {
					retR.wg_cd(src.rqst_wg_cd());
				}
				retR.sppl_cd(src.sppl_cd());
				retR.gi_loc_cd(src.rqst_loc_cd());
				retR.gr_loc_cd(src.strg_loc_cd());
				retR.org_wg_cd(src.wg_cd());
				retL.add(retR);
			}
			else if (isMfgOrOutSrc(src)) {
				for (Ord_Sprt02_RsltR r : _bomExpL.subList(_bomIdx, src.itm_ord_no())) {
					if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
						continue;
					}
					MST_PRCD_IO_SCHD_R retR = MST_PRCD_IO_SCHD_R.create();
					retR.io_schd_typ(MSC_IO_SCHD_TYP.INPT_PLN.value());
					retR.io_typ(MSC_IO_TYP.GI.value());
					if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
					}
					else if (MSC_ITM_ORD_STS_TYP.isFIX(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
					}
					retR.io_schd_no(src.itm_ord_no());
					retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
					retR.io_schd_sub_no1(src.itm_ord_no());
					retR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value());
					retR.io_schd_sub_no2(r.oper_ord_no());
					retR.io_schd_pr_no(src.itm_ord_no());
					retR.schd_dt(r.schd_in_dt().trunc(MCDateFieldType.DAY));
					retR.itm_cd(r.itm_cd());
					retR.itm_sub1(r.itm_sub1());
					retR.itm_sub2(r.itm_sub2());
					retR.itm_sub3(r.itm_sub3());
					retR.ver_no(r.ver_no());
					retR.alt_grp_cd(r.alt_grp_cd());
					retR.alt_grp_seq(r.alt_grp_seq());
					retR.oper_ord_no(r.oper_ord_no());
					retR.alt_qty(r.alt_qty());
					retR.alt_itm_typ(r.alt_itm_typ());
					retR.alt_itm_ratio(r.alt_itm_ratio());
					retR.alt_alloc_prio(r.alt_alloc_prio());
					retR.loc_cd(r.loc_cd());
					retR.str_ln_cd(MAC_STR.NULL_VAL.value());
					retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						retR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						retR.sublot_no(MAC_STR.NULL_VAL.value());
					}

					// 手配ＮＯx
					//ＭＲＰ用
					retR.ex_sno1(r.sno1());
					retR.ex_sno2(r.sno2());
					retR.ex_sno3(r.sno3());
					retR.ex_sno4(r.sno4());
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						retR.sno1(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						retR.sno2(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						retR.sno3(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						retR.sno4(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
					}
					
					// 手配ＮＯx無可ＦＬＧ
					if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
						retR.sno1_null_flg(true);
					}
					else {
						retR.sno1_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ2())) {
						retR.sno2_null_flg(true);
					}
					else {
						retR.sno2_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ3())) {
						retR.sno3_null_flg(true);
					}
					else {
						retR.sno3_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ4())) {
						retR.sno4_null_flg(true);
					}
					else {
						retR.sno4_null_flg(false);
					}
					
					retR.pack_unit_cd(r.unit_cd());
					retR.pack_unit_qty(r.rqmt_qty());
					retR.base_unit_cd(r.unit_cd());
					retR.base_unit_qty(r.rqmt_qty());
					retR.gd_cd(getDefaultFeedStkGd().gd_cd());
					retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
					retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
					retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
					retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					retR.wg_cd(src.wg_cd());
					retR.inpt_ctl_typ(r.inpt_ctl_typ());
					retR.org_wg_cd(src.wg_cd());
					retL.add(retR);
				}
			}
			return retL;
		}

		protected MST_SIM_IO_SCHD_R getSimIoSchdGr(Ord_Upd01_Dtl1R src) {
			MST_SIM_IO_SCHD_R retR = MST_SIM_IO_SCHD_R.create();
			if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.MFG_PLN.value());
			}
			else if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()))) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_PLN.value());
			}
			else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
				retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PLN.value());
			}
			retR.io_typ(MSC_IO_TYP.GR.value());
			if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
				retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
			}
			else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
				retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
			}
			retR.io_schd_no(src.itm_ord_no());
			retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
			retR.io_schd_sub_no1(src.itm_ord_no());
			retR.io_schd_pr_no(src.io_schd_pr_no());
			retR.schd_dt(src.strg_schd_dt());
			retR.accpt_schd_dt(src.accpt_schd_dt());
			retR.avl_schd_dt(src.avl_schd_dt());
			retR.itm_cd(src.itm_cd());
			retR.itm_sub1(src.itm_sub1());
			retR.itm_sub2(src.itm_sub2());
			retR.itm_sub3(src.itm_sub3());
			retR.ver_no(src.ver_no());
			retR.loc_cd(src.strg_loc_cd());
			retR.str_ln_cd(MAC_STR.NULL_VAL.value());
			MAM_LOC_R locR = _cacheLoc.get(retR.loc_cd());
			retR.stk_arrv_bp_cd(nvl(locR.sppl_cd(), MAC_STR.NULL_VAL.value()));
			if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
				retR.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
				retR.sublot_no(MAC_STR.NULL_VAL.value());
			}
			
			// 手配ＮＯx
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
				retR.sno1(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
				retR.sno2(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
				retR.sno3(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
				retR.sno4(MAC_STR.NULL_VAL.value());
			}
			else {
				retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			}
			
			retR.pack_unit_cd(src.unit_cd());
			retR.pack_unit_qty(src.yield_schd_qty());
			retR.base_unit_cd(src.unit_cd());
			retR.base_unit_qty(src.yield_schd_qty());
			retR.gd_cd(getDefaultFeedStkGd().gd_cd());
			retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
			retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
			retR.wg_cd(src.wg_cd());
			if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
				retR.sppl_cd(src.sppl_cd());
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
				retR.sppl_cd(src.mfg_sppl_cd());
			}
			else {
				retR.sppl_cd(null);
			}
			if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
				retR.gi_loc_cd(src.rqst_loc_cd());
				retR.gr_loc_cd(src.strg_loc_cd());
			}
			retR.org_wg_cd(src.wg_cd());
			retR.sim_mrp_no(src.sim_mrp_no());
			return retR;
		}

		protected MCList<MST_SIM_IO_SCHD_R> getSimIoSchdGi(Ord_Upd01_Dtl1R src) {
			MCList<MST_SIM_IO_SCHD_R> retL = MCList.create(MST_SIM_IO_SCHD_R.class);
			if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
				MST_SIM_IO_SCHD_R retR = MST_SIM_IO_SCHD_R.create();
				retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
				retR.io_typ(MSC_IO_TYP.GI.value());
				if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
				}
				else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
					retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
				}
				retR.io_schd_no(src.itm_ord_no());
				retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				retR.io_schd_sub_no1(src.itm_ord_no());
				retR.io_schd_pr_no(src.io_schd_pr_no());
				retR.schd_dt(src.gi_schd_dt());
				retR.accpt_schd_dt(null);
				retR.avl_schd_dt(null);
				retR.itm_cd(src.itm_cd());
				retR.itm_sub1(src.itm_sub1());
				retR.itm_sub2(src.itm_sub2());
				retR.itm_sub3(src.itm_sub3());
				retR.ver_no(src.ver_no());
				retR.loc_cd(src.strg_loc_cd());
				retR.str_ln_cd(MAC_STR.NULL_VAL.value());
				retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					retR.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
					retR.sublot_no(MAC_STR.NULL_VAL.value());
				}

				// 手配ＮＯx
				//ＭＲＰ用
				retR.ex_sno1(src.sno1());
				retR.ex_sno2(src.sno2());
				retR.ex_sno3(src.sno3());
				retR.ex_sno4(src.sno4());

				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
					retR.sno1(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
					retR.sno2(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
					retR.sno3(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
					retR.sno4(MAC_STR.NULL_VAL.value());
				}
				else {
					retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
				}
				
				// 手配ＮＯx無可ＦＬＧ
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
					retR.sno1_null_flg(true);
				}
				else {
					retR.sno1_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
					retR.sno2_null_flg(true);
				}
				else {
					retR.sno2_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
					retR.sno3_null_flg(true);
				}
				else {
					retR.sno3_null_flg(false);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
					retR.sno4_null_flg(true);
				}
				else {
					retR.sno4_null_flg(false);
				}
				
				retR.pack_unit_cd(src.unit_cd());
				retR.pack_unit_qty(src.yield_schd_qty());
				retR.base_unit_cd(src.unit_cd());
				retR.base_unit_qty(src.yield_schd_qty());
				retR.gd_cd(getDefaultFeedStkGd().gd_cd());
				retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));;
				retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())) {
					retR.wg_cd(src.wg_cd());
				}
				else {
					retR.wg_cd(src.rqst_wg_cd());
				}
				retR.sppl_cd(src.sppl_cd());
				retR.org_wg_cd(src.wg_cd());
				retR.sim_mrp_no(src.sim_mrp_no());
				retL.add(retR);
			}
			else if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
				for (Ord_Sprt02_RsltR r : _bomExpL.subList(_bomIdx, src.itm_ord_no())) {
					if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
						continue;
					}
					MST_SIM_IO_SCHD_R retR = MST_SIM_IO_SCHD_R.create();
					retR.io_schd_sub_no2(r.oper_ord_no());
					retR.schd_dt(r.schd_in_dt());
					retR.itm_cd(r.itm_cd());
					retR.itm_sub1(r.itm_sub1());
					retR.itm_sub2(r.itm_sub2());
					retR.itm_sub3(r.itm_sub3());
					retR.ver_no(r.ver_no());
					retR.alt_grp_cd(r.alt_grp_cd());
					retR.alt_grp_seq(r.alt_grp_seq());
					retR.oper_ord_no(r.oper_ord_no());
					retR.alt_qty(r.alt_qty());
					retR.alt_itm_typ(r.alt_itm_typ());
					retR.alt_itm_ratio(r.alt_itm_ratio());
					retR.alt_alloc_prio(r.alt_alloc_prio());
					retR.loc_cd(r.loc_cd());
					retR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					retR.pack_unit_cd(r.unit_cd());
					retR.pack_unit_qty(r.rqmt_qty());
					retR.base_unit_cd(r.unit_cd());
					retR.base_unit_qty(r.rqmt_qty());
					retR.sim_mrp_no(src.sim_mrp_no());
					retR.io_schd_typ(MSC_IO_SCHD_TYP.INPT_PLN.value());
					retR.io_typ(MSC_IO_TYP.GI.value());

					retR.io_schd_no(src.itm_ord_no());
					if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
					}
					else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
						retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
					}
					retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
					retR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value());
					retR.io_schd_pr_no(src.itm_ord_no());
					retR.str_ln_cd(MAC_STR.NULL_VAL.value());
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						retR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						retR.sublot_no(MAC_STR.NULL_VAL.value());
					}

					// 手配ＮＯx
					//ＭＲＰ用
					retR.ex_sno1(r.sno1());
					retR.ex_sno2(r.sno2());
					retR.ex_sno3(r.sno3());
					retR.ex_sno4(r.sno4());
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						retR.sno1(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						retR.sno2(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						retR.sno3(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						retR.sno4(MAC_STR.NULL_VAL.value());
					}
					else {
						retR.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
					}
					
					// 手配ＮＯx無可ＦＬＧ
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ1())) {
						retR.sno1_null_flg(true);
					}
					else {
						retR.sno1_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ2())) {
						retR.sno2_null_flg(true);
					}
					else {
						retR.sno2_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ3())) {
						retR.sno3_null_flg(true);
					}
					else {
						retR.sno3_null_flg(false);
					}
					if (MAC_SNO_TYP.isEXTND_NULL(r.sno_typ4())) {
						retR.sno4_null_flg(true);
					}
					else {
						retR.sno4_null_flg(false);
					}
					retR.gd_cd(getDefaultFeedStkGd().gd_cd());
					retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
					retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
					retR.asst_typ(getAsstTyp(retR.loc_cd(), _cacheLoc));
					retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					retR.wg_cd(src.wg_cd());
					retR.inpt_ctl_typ(r.inpt_ctl_typ());
					retR.org_wg_cd(src.wg_cd());
					retL.add(retR);
				}
			}
			return retL;
		}

		

		protected void setDbcDefValue(MST_ITM_ORDER_R dbcR) {
			if (isNull(dbcR.mfg_loc_cd())) {
				dbcR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.sppl_cd())) {
				dbcR.sppl_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.maker_cd())) {
				dbcR.maker_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.rqst_loc_cd())) {
				dbcR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.bom_ptn())) {
				dbcR.bom_ptn(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.sno1())) {
				dbcR.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.sno2())) {
				dbcR.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.sno3())) {
				dbcR.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.sno4())) {
				dbcR.sno4(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.inst_qty())) {
				dbcR.inst_qty(MCNumber.ZERO);
			}
			if (isNull(dbcR.yield_schd_qty())) {
				dbcR.yield_schd_qty(MCNumber.ZERO);
			}
			if (isNull(dbcR.not_inst_qty())) {
				dbcR.not_inst_qty(dbcR.inst_qty());
			}
			if (MSC_ITM_ORD_STS_TYP.isOPN(dbcR.itm_ord_sts_typ())
					|| MSC_ITM_ORD_STS_TYP.isSAV(dbcR.itm_ord_sts_typ())) {
				dbcR.not_inst_qty(dbcR.inst_qty());
			}
			if (isNull(dbcR.fxd_yield_qty())) {
				dbcR.fxd_yield_qty(MCNumber.ZERO);
			}

			if (isNull(dbcR.wg_cd())) {
				dbcR.wg_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dbcR.io_schd_pr_no())) {
				dbcR.io_schd_pr_no(dbcR.itm_ord_no());
			}
		}
		
		/** 品目オーダ更新対象外項目を取得 */
		protected String[] getItmOrdRemoveSet(){
			String[] cols ={
					MST_ITM_ORDER_R.$mrp_purc_lt,
					MST_ITM_ORDER_R.$mrp_mfg_st_schd_dt,
					MST_ITM_ORDER_R.$mrp_mfg_end_schd_dt,
					MST_ITM_ORDER_R.$mrp_mfg_lt,
					MST_ITM_ORDER_R.$mrp_gi_schd_dt,
					MST_ITM_ORDER_R.$mrp_strg_schd_dt,
					MST_ITM_ORDER_R.$mrp_accpt_schd_dt,
					MST_ITM_ORDER_R.$mrp_insp_st_schd_dt,
					MST_ITM_ORDER_R.$mrp_insp_end_schd_dt,
					MST_ITM_ORDER_R.$mrp_avl_schd_dt,
					MST_ITM_ORDER_R.$rqmt_no,
					MST_ITM_ORDER_R.$sim_mrp_no,
					MST_ITM_ORDER_R.$mrp_po_schd_dt,
					MST_ITM_ORDER_R.$for_scheduler_frozen_flg
			};
			
			return cols;
		}

		/** 先行手配品目オーダ更新対象外項目を取得 */
		protected String[] getPrcdItmOrdRemoveSet(){
			String[] cols ={
					MST_PRCD_ITM_ORDER_R.$mrp_purc_lt,
					MST_PRCD_ITM_ORDER_R.$mrp_mfg_st_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_mfg_end_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_mfg_lt,
					MST_PRCD_ITM_ORDER_R.$mrp_gi_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_strg_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_accpt_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_insp_st_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_insp_end_schd_dt,
					MST_PRCD_ITM_ORDER_R.$mrp_avl_schd_dt,
					MST_PRCD_ITM_ORDER_R.$rqmt_no,
					MST_PRCD_ITM_ORDER_R.$sim_mrp_no,
					MST_PRCD_ITM_ORDER_R.$mrp_po_schd_dt
			};

			return cols;
		}

		/** 品目マスタキャッシュリストをセットする*/
		protected void setCacheItmList(){
			// 品目マスタをキャッシュする
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.sno1_mng_typ,
					t.sno2_mng_typ,
					t.sno3_mng_typ,
					t.sno4_mng_typ,
					t.stk_mng_typ
					);
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
			for (Ord_Upd01_Dtl1R r : up0()){
				MAM_ITM_R bindRow = MAM_ITM_R.create();
				bindRow.itm_cd(r.itm_cd());
				bindRow.itm_sub1(r.itm_sub1());
				bindRow.itm_sub2(r.itm_sub2());
				bindRow.itm_sub3(r.itm_sub3());
				bindL.add(bindRow);
			}

			for (Ord_Sprt02_RsltR r : _bomExpL){
				MAM_ITM_R bindRow = MAM_ITM_R.create();
				bindRow.itm_cd(r.itm_cd());
				bindRow.itm_sub1(r.itm_sub1());
				bindRow.itm_sub2(r.itm_sub2());
				bindRow.itm_sub3(r.itm_sub3());
				bindL.add(bindRow);
			}
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL, MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		/** 品目マスタの情報を設定する */
		protected void setItmInfo() {
			// 品目マスタをキャッシュする
			setCacheItmList();
			for (Ord_Upd01_Dtl1R r :up0()) {
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR != null) {
					r.chk_itm_sno1_mng_typ(itmR.sno1_mng_typ());
					r.chk_itm_sno2_mng_typ(itmR.sno2_mng_typ());
					r.chk_itm_sno3_mng_typ(itmR.sno3_mng_typ());
					r.chk_itm_sno4_mng_typ(itmR.sno4_mng_typ());
					r.stk_mng_typ(itmR.stk_mng_typ());
				}
			}
		}

		/** 場所マスタキャッシュリストをセットする*/
		protected void setCacheLocList(){
			// 場所マスタをキャッシュする
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.loc_mng_typ);
			locL_bldr.addSelect(t.sppl_cd);
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			for (Ord_Upd01_Dtl1R r : up0()){
				MAM_LOC_R bindRow = MAM_LOC_R.create();
				if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())){
					MAM_LOC_R bindXfrRow = MAM_LOC_R.create();
					bindXfrRow.loc_cd(r.rqst_loc_cd());
					bindL.add(bindXfrRow);
				}
				bindRow.loc_cd(r.strg_loc_cd());
				bindL.add(bindRow);
			}

			for (Ord_Sprt02_RsltR r : _bomExpL){
				MAM_LOC_R bindRow = MAM_LOC_R.create();
				bindRow.loc_cd(r.loc_cd());
				bindL.add(bindRow);
			}
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, bindL, MAM_LOC_R.$loc_cd);
		}
	}

	/**
	 * Ord_Upd02オペレーション.<p>
	 * 
	 * オーダ状況更新</br>
	 */
	public class Ord_Upd02 extends MSBCL_OrdRegService_MC_A.Ord_Upd02 {

		protected MCList<Ord_Upd01_Dtl1R> _opnToSavL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _savToOpnL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _opnToFixL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _savToFixL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _fixToSavL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _fixToOpnL = MCList.create(Ord_Upd01_Dtl1R.class);

		protected MCList<Ord_Upd01_Dtl1R> _opnSavL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _fixL = MCList.create(Ord_Upd01_Dtl1R.class);
		protected MCList<Ord_Upd01_Dtl1R> _canFixL = MCList.create(Ord_Upd01_Dtl1R.class);
		/** 品目マスタ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;

		/** 場所マスタ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文分割
			setUpList();

			// オーダ状況区分更新
			updOrder();

			// 日次生産依頼更新
			updRqmtFixFlg();

			// 受払予定情報更新
			updIoSchd();

			// 出荷・供給依頼サービス
			callShipDmndRqstSrv();

			// 受注状況更新サービス
			callSloStsInsSrv();

			// 下り電文設定
			setDown();
		}

		protected void setUpList() {
			// 品目マスタの情報を補完
			setItmInfo();			
			
			for (Ord_Upd01_Dtl1R r: up0()) {
				// 未確定 ⇒ 保存
				if (MSC_ITM_ORD_STS_TYP.isOPN(r.b_itm_ord_sts_typ())
						&& MSC_ITM_ORD_STS_TYP.isSAV(r.a_itm_ord_sts_typ())) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
					_opnToSavL.add(r);
				}
				// 保存 ⇒ 未確定
				else if (MSC_ITM_ORD_STS_TYP.isSAV(r.b_itm_ord_sts_typ())
						&& MSC_ITM_ORD_STS_TYP.isOPN(r.a_itm_ord_sts_typ())) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.OPN.value());
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
					_savToOpnL.add(r);
				}
				// ⇒ 確定
				else if (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
					if (r.is_src_mfg_inst_flg()) {
						r.inst_itm_ord_sts_typ(r.b_itm_ord_sts_typ());
					}
					if(isNull(r.fix_dt())) {
						r.fix_dt(getToday());
					}
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
					if (r.for_scheduler_frozen_flg()) {
						r.scheduler_frozen_flg(true);
					}
					if (MSC_ITM_ORD_STS_TYP.isOPN(r.b_itm_ord_sts_typ())) {
						_opnToFixL.add(r);
					}
					else if (MSC_ITM_ORD_STS_TYP.isSAV(r.b_itm_ord_sts_typ())) {
						_savToFixL.add(r);
					}
				}
				// ⇒確定解除
				else if (MSC_ITM_ORD_STS_TYP.isFIX(r.b_itm_ord_sts_typ())) {
					r.fix_dt(null);
					r.inst_itm_ord_sts_typ(null);
					if(MSC_ITM_ORD_STS_TYP.isSAV(r.a_itm_ord_sts_typ())) {
						r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
						r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.SAV.value());
						_fixToSavL.add(r);
					}
					else if (MSC_ITM_ORD_STS_TYP.isOPN(r.a_itm_ord_sts_typ())) {
						r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.OPN.value());
						r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
						_fixToOpnL.add(r);
					}
				}
			}

			_opnSavL.addAll(_opnToSavL);
			_opnSavL.addAll(_savToOpnL);
			_fixL.addAll(_opnToFixL);
			_fixL.addAll(_savToFixL);
			_canFixL.addAll(_fixToSavL);
			_canFixL.addAll(_fixToOpnL);
		}

		protected void updOrder() {

			// 未確定 ⇒ 保存
			if (!_opnToSavL.isEmpty()) {
				MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T1");
				MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T2");

				execDbUpdateKey("MSBCL5010_MST_ITM_ORDER_U02", t1, _opnToSavL, t1.itm_ord_sts_typ);
				execDbUpdate("MSBCL5010_MST_OPER_ORDER_U01", t2, _opnToSavL,
						t2.itm_ord_no.eq(bindEx("itm_ord_no")), t2.itm_ord_sts_typ);
			}

			// 保存 ⇒ 未確定
			if (!_savToOpnL.isEmpty()) {
				MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T1");
				MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T2");

				execDbUpdateKey("MSBCL5010_MST_ITM_ORDER_U03", t1, _savToOpnL, t1.itm_ord_sts_typ);
				execDbUpdate("MSBCL5010_MST_OPER_ORDER_U02", t2, _savToOpnL,
						t2.itm_ord_no.eq(bindEx("itm_ord_no")), t2.itm_ord_sts_typ,
						t2.oper_ord_sts_typ);
			}
			
			// 確定
			if (!_fixL.isEmpty()) {
				MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T1");
				MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T2");

				execDbUpdateKey("MSBCL5010_MST_ITM_ORDER_U04", t1, _fixL, t1.itm_ord_sts_typ,
						t1.fix_dt, t1.inst_itm_ord_sts_typ);
				execDbUpdate("MSBCL5010_MST_OPER_ORDER_U03", t2, _fixL,
						t2.itm_ord_no.eq(bindEx("itm_ord_no")), t2.itm_ord_sts_typ,
						t2.oper_ord_sts_typ, t2.scheduler_frozen_flg);
			}

			// 確定解除
			if (!_canFixL.isEmpty()) {
				MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T1");
				MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T2");

				execDbUpdateKey("MSBCL5010_MST_ITM_ORDER_U05", t1, _canFixL, t1.itm_ord_sts_typ,
						t1.fix_dt, t1.inst_itm_ord_sts_typ);
				execDbUpdate("MSBCL5010_MST_OPER_ORDER_U04", t2, _canFixL,
						t2.itm_ord_no.eq(bindEx("itm_ord_no")), t2.itm_ord_sts_typ,
						t2.oper_ord_sts_typ);
			}
		}

		/** 受払予定更新 */
		protected void updIoSchd() {

			// 未確定⇔保存
			if(!_opnSavL.isEmpty()) {
				updIoSchdOpnSav();
			}

			// 確定
			if(!_fixL.isEmpty()) {
				updIoSchdFix();
			}

			// 確定解除
			if(!_canFixL.isEmpty()) {
				updIoSchdCanFix();
			}
		}

		/** 受払予定更新(未確定 ⇔ 保存) */
		protected void updIoSchdOpnSav() {
			if (!_opnToSavL.isEmpty()) {
				// 未確定 ⇒ 保存
				executeBatchUpdate(MSBCL5010_MST_SAVORD_IO_SCHD_I01(), null, _opnToSavL);
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_D01(), null, _opnToSavL);
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_U01(), null, _opnToSavL);
			}
			if (!_savToOpnL.isEmpty()) {
				// 保存 ⇒ 未確定
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_I01(), null, _savToOpnL);
				executeBatchUpdate(MSBCL5010_MST_SAVORD_IO_SCHD_D01(), null, _savToOpnL);
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_U01(), null, _savToOpnL);
			}
		}

		/** 受払予定更新(確定) */
		protected void updIoSchdFix() {
			// 受払予定の削除

			// 削除する前に製造の出庫を抽出
			MCList<MST_ORD_IO_SCHD_R> mfgGiL = MCList.create(MST_ORD_IO_SCHD_R.class);
			MCList<Ord_Upd01_Dtl1R> mfgGrL = _fixL.subList(r -> (!r.is_src_mfg_inst_flg() && MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())));
			if (mfgGrL.size() > 0) {
				MST_ORD_IO_SCHD_R t = MST_ORD_IO_SCHD_R.create("T");
				MCQueryApiBuilder mfgGiL_bldr = MCQueryApiBuilder.create(t);
				mfgGiL_bldr.addWhereWithAnd(t.io_typ.eq(value(MSC_IO_TYP.GI.value())));
				mfgGiL_bldr.addWhereWithAnd(t.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())));
				mfgGiL_bldr.addWhereWithAnd(t.io_schd_sub_no1.eq(bind("itm_ord_no")));
				dbSelect("MSBCL5010_MST_ORD_IO_SCHD_S01", mfgGiL, mfgGiL_bldr, mfgGrL);
			}

			if (!_opnToFixL.isEmpty()) {
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_D02(), null, _opnToFixL);
			}
			if (!_savToFixL.isEmpty()) {
				// 入庫
				executeBatchUpdate(MSBCL5010_MST_SAVORD_IO_SCHD_D02(), null, _savToFixL);
				// 出庫
				executeBatchUpdate(MSBCL5010_MST_ORD_IO_SCHD_D02(), null, _savToFixL);
			}
			if (mfgGrL.size() > 0) {
				// 受払予定作成サービス(製造入庫／出庫)
				callIoSchdInsSrv(mfgGrL, mfgGiL);
			}
		}

		/** 受払予定更新(確定解除) */
		protected void updIoSchdCanFix() {

			// 受払予定の出庫を抽出
			MCList<MST_IO_SCHD_R> giL = MCList.create(MST_IO_SCHD_R.class);
			MCList<Ord_Upd01_Dtl1R> grL = _canFixL.subList(r -> !MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ()));
			if (!grL.isEmpty()) {
				MST_IO_SCHD_R giL_t = MST_IO_SCHD_R.create("T");
				MCQueryApiBuilder giL_bldr = MCQueryApiBuilder.create(giL_t);
				giL_bldr.addWhereWithAnd(giL_t.io_schd_pr_no.eq(bind("itm_ord_no")));
				giL_bldr.addWhereWithAnd(
						giL_t.io_schd_typ.in(value(MSC_IO_SCHD_TYP.INPT.value()),
								value(MSC_IO_SCHD_TYP.XFR_GI.value()),
								value(MSC_IO_SCHD_TYP.XFR_GI_PROV.value()),
								value(MSC_IO_SCHD_TYP.MOVE_GI.value()),
								value(MSC_IO_SCHD_TYP.MOVE_GI_PROV.value())));
				giL_bldr.addWhereWithAnd(giL_t.io_typ.eq(value(MSC_IO_TYP.GI.value())));
				dbSelect("MSBCL5010_MST_IO_SCHD_S01", giL, giL_bldr, grL);
			}

			setCacheLocList(giL);

			// 受払予定削除サービス（製造入庫／出庫）
			callIoSchdDelSrv();

			// 受払予定（未確定、保存）の登録
			// 入庫
			if (!_fixToSavL.isEmpty()) {
				MCList<MST_SAVORD_IO_SCHD_R> savOrdIoSchdGr = MCList.create(MST_SAVORD_IO_SCHD_R.class);
				for (Ord_Upd01_Dtl1R row : _fixToSavL.subList(r -> MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()))) {
					savOrdIoSchdGr.add(getSavOrdIoSchdGr(row, _cacheLoc));
				}
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, savOrdIoSchdGr.size());
				savOrdIoSchdGr.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder savOrdIoSchdGr_bldr = MCQueryApiBuilder.create(MST_SAVORD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_SAVORD_IO_SCHD_I02", savOrdIoSchdGr, savOrdIoSchdGr_bldr);
			}
			if (!_fixToOpnL.isEmpty()) {
				MCList<MST_ORD_IO_SCHD_R> ordIoSchdGr = MCList.create(MST_ORD_IO_SCHD_R.class);
				for (Ord_Upd01_Dtl1R row : _fixToOpnL.subList(r -> MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()))) {
					ordIoSchdGr.add(getOrdIoSchdGr(row, _cacheLoc));
				}
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, ordIoSchdGr.size());
				ordIoSchdGr.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder ordIoSchdGr_bldr = MCQueryApiBuilder.create(MST_ORD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_ORD_IO_SCHD_I02", ordIoSchdGr, ordIoSchdGr_bldr);
			}

			// 出庫
			if (!giL.isEmpty()) {
				MCIndexKey idx = grL.createIndex(Ord_Upd01_Dtl1R.$itm_ord_no);
				MCList<MST_ORD_IO_SCHD_R> ordIoSchdGi = MCList.create(MST_ORD_IO_SCHD_R.class);
				for (MST_IO_SCHD_R row : giL) {
					Ord_Upd01_Dtl1R orgItmOrdR = grL.getFirst(idx, row.io_schd_pr_no());
					MST_ORD_IO_SCHD_R retR = MST_ORD_IO_SCHD_R.create();
					copy(retR, row, createMap_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R(orgItmOrdR));
					ordIoSchdGi.add(retR);
				}
				// 受払予定伝票ＮＯを採番
				doSeqCache(MSC_NUM_SYS_TYP.OSLIPSCHD, ordIoSchdGi.size());
				ordIoSchdGi.forEach(r -> r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.OSLIPSCHD)));
				MCQueryApiBuilder ordIoSchdGi_bldr = MCQueryApiBuilder.create(MST_ORD_IO_SCHD_R.create("T"));
				dbInsert("MSBCL5010_MST_ORD_IO_SCHD_I03", ordIoSchdGi, ordIoSchdGi_bldr);
			}
		}

		protected void updRqmtFixFlg() {
			MCList<Ord_Upd01_Dtl1R> fixOrCanFixL = MCList.create(Ord_Upd01_Dtl1R.class);
			fixOrCanFixL.addAll(_fixL);
			fixOrCanFixL.addAll(_canFixL);

			MCList<MST_RQMT_R> rqmtL = MCList.create(MST_RQMT_R.class);
			for(Ord_Upd01_Dtl1R r: fixOrCanFixL) {
				if(!isNull(r.rqmt_no()) && MSC_MRP_TYP.isMRP(r.mrp_typ())) {
					MST_RQMT_R rqmtR = MST_RQMT_R.create();
					rqmtR.rqmt_no(r.rqmt_no());
					rqmtL.add(rqmtR);
				}
			}

			if (!rqmtL.isEmpty()) {
				updRqmt(rqmtL.groupBy(MST_RQMT_R.$rqmt_no));
			}
		}

		/**　下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 製造に関する受払予定を作成する */
		protected void callIoSchdInsSrv(MCList<Ord_Upd01_Dtl1R> grL, MCList<MST_ORD_IO_SCHD_R> giL) {
			MSBEL_IoSchdService.IoSchd_Ins01 ope = MSBEL_IoSchdService.crtIoSchd_Ins01();
			// 入庫
			addAll(ope.up0(), grL, createMap_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R());
			// 出庫
			addAll(ope.up0(), giL, createMap_IoSchd_Ins01_DtlR_MST_ORD_IO_SCHD_R());
			ope.exec();	
		}

		/** 製造に関する受払予定を削除する */
		protected void callIoSchdDelSrv() {
			MCList<Ord_Upd01_Dtl1R> mfgGrL = _canFixL.subList(r -> MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()));
			if (mfgGrL.isEmpty()) {
				return;
			}

			MSBEL_IoSchdService.IoSchd_Del02 ope = MSBEL_IoSchdService.crtIoSchd_Del02();
			addAll(ope.up0(), mfgGrL, createMap_IoSchd_Del02_CndR_Ord_Upd01_Dtl1R());
			ope.exec();
		}

		protected void callShipDmndRqstSrv() {
			MCList<Ord_Upd01_Dtl1R> rqstL = MCList.create(Ord_Upd01_Dtl1R.class);
			rqstL.addAll(_fixL.subList(r -> isCallShipDmndRqst(r)));
			rqstL.addAll(_canFixL.subList(r -> isCallShipDmndRqst(r)));
			if (rqstL.isEmpty()) {
				return;
			}

			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 ope =
					MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			addAll(ope.up0(), rqstL, createMap_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();
		}

		protected void callSloStsInsSrv() {
			MCList<Ord_Upd01_Dtl1R> sloStsInsL = up0().subList(r->isCallSloStsInsSrv(r));
			if(sloStsInsL.isEmpty()){
				return;
			}

			MSBBL_SloStsRegService.SloSts_Ins02 ope = MSBBL_SloStsRegService.crtSloSts_Ins02();
			addAll(ope.up0(), sloStsInsL, createMap_SloSts_DtlR_Ord_Upd01_Dtl1R());
			ope.exec();
		}

		/** 出荷・供給依頼サービスの呼び出し対象であるかどうかを返す */
		protected boolean isCallShipDmndRqst(Ord_Upd01_Dtl1R r) {
			return MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ())
					&& (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())
						|| MSC_ITM_ORD_STS_TYP.isFIX(r.b_itm_ord_sts_typ()));
		}

		/** 受注状況更新サービスの呼び出し対象であるかどうかを返す */
		protected boolean isCallSloStsInsSrv(Ord_Upd01_Dtl1R r) {
			if (r.is_src_mfg_inst_flg()) {
				return false;
			}
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					&& MSC_MRP_TYP.isMRP(r.mrp_typ())
					&& !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ())
					&& (MSC_ITM_ORD_STS_TYP.isFIX(r.a_itm_ord_sts_typ())
							|| MSC_ITM_ORD_STS_TYP.isFIX(r.b_itm_ord_sts_typ()));
		}

		
		/** 品目マスタ情報を設定する */
		protected void setItmInfo() {
			// 品目マスタをキャッシュする
			setCacheItmList();
			for (Ord_Upd01_Dtl1R r :up0()) {
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR != null) {
					r.chk_itm_sno1_mng_typ(itmR.sno1_mng_typ());
					r.chk_itm_sno2_mng_typ(itmR.sno2_mng_typ());
					r.chk_itm_sno3_mng_typ(itmR.sno3_mng_typ());
					r.chk_itm_sno4_mng_typ(itmR.sno4_mng_typ());
					r.stk_mng_typ(itmR.stk_mng_typ());
				}
			}
		}
		/** 品目マスタキャッシュリストをセットする*/
		protected void setCacheItmList(){
			// 品目マスタをキャッシュする
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.sno1_mng_typ,
					t.sno2_mng_typ,
					t.sno3_mng_typ,
					t.sno4_mng_typ,
					t.stk_mng_typ
					);
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
			for (Ord_Upd01_Dtl1R r : up0()){
				MAM_ITM_R bindRow = MAM_ITM_R.create();
				bindRow.itm_cd(r.itm_cd());
				bindRow.itm_sub1(r.itm_sub1());
				bindRow.itm_sub2(r.itm_sub2());
				bindRow.itm_sub3(r.itm_sub3());
				bindL.add(bindRow);
			}
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL, MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		/** 場所マスタキャッシュリストをセットする*/
		protected void setCacheLocList(MCList<MST_IO_SCHD_R> giL){
			// 場所マスタをキャッシュする
			MCList<MCRow> locLst =MCList.create(MCRow.class);
			locLst.addStringColumn("loc_cd");
			for (Ord_Upd01_Dtl1R r :_canFixL) {
				MCRow row = locLst.createRow();
				row.setStringNE("loc_cd", r.strg_loc_cd());
				locLst.add(row);
				if (!MAC_STR.isNULL_VAL(r.rqst_loc_cd())) {
					MCRow row2 = locLst.createRow();
					row2.setStringNE("loc_cd", r.rqst_loc_cd());
					locLst.add(row2);
				}
			}
			for (MST_IO_SCHD_R r :giL) {
				MCRow row = locLst.createRow();
				row.setStringNE("loc_cd", r.loc_cd());
				locLst.add(row);
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.loc_mng_typ);
			locL_bldr.addSelect(t.sppl_cd);
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, locLst, "loc_cd");
		}

		/** Ord_Upd01_Dtl1R → IoSchd_Del02_CndR (Ord_Upd02 → IoSchd_Del02) */
		protected Map_IoSchd_Del02_CndR_Ord_Upd01_Dtl1R<MSW_IO_SCHD_DEL_R, Ord_Upd01_Dtl1R> createMap_IoSchd_Del02_CndR_Ord_Upd01_Dtl1R() {
			return new Map_IoSchd_Del02_CndR_Ord_Upd01_Dtl1R<MSW_IO_SCHD_DEL_R, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → IoSchd_Del02_CndR (Ord_Upd02 → IoSchd_Del02) */
		public class Map_IoSchd_Del02_CndR_Ord_Upd01_Dtl1R<D extends MSW_IO_SCHD_DEL_R, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_no1, Ord_Upd01_Dtl1R.$itm_ord_no);
			}

			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
			}
		}

		/** MST_IO_SCHD → MST_ORD_IO_SCHD (Ord_Upd02 → Ord_Upd02) */
		protected Map_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R<MST_ORD_IO_SCHD_R, MST_IO_SCHD_R> createMap_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R(Ord_Upd01_Dtl1R hdr) {
			return new Map_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R<MST_ORD_IO_SCHD_R, MST_IO_SCHD_R>(hdr);
		}

		/** MST_IO_SCHD → MST_ORD_IO_SCHD (Ord_Upd02 → Ord_Upd02) */
		public class Map_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R<D extends MST_ORD_IO_SCHD_R, S extends MST_IO_SCHD_R>
				extends MCRowMapper<D, S> {
			protected Ord_Upd01_Dtl1R _hdr;

			public Map_MST_ORD_IO_SCHD_R_MST_IO_SCHD_R(Ord_Upd01_Dtl1R hdr) {
				super();
				_hdr = hdr;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ORD_IO_SCHD_R.$io_typ, MST_IO_SCHD_R.$io_typ);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$io_schd_sub_typ2, MST_IO_SCHD_R.$io_schd_sub_typ2);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$io_schd_sub_no2, MST_IO_SCHD_R.$io_schd_sub_no2);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$io_schd_pr_no, MST_IO_SCHD_R.$io_schd_pr_no);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$itm_cd, MST_IO_SCHD_R.$itm_cd);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$itm_sub1, MST_IO_SCHD_R.$itm_sub1);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$itm_sub2, MST_IO_SCHD_R.$itm_sub2);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$itm_sub3, MST_IO_SCHD_R.$itm_sub3);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$ver_no, MST_IO_SCHD_R.$ver_no);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$lot_no, MST_IO_SCHD_R.$lot_no);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sublot_no, MST_IO_SCHD_R.$sublot_no);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno1, MST_IO_SCHD_R.$sno1);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno1_null_flg, MST_IO_SCHD_R.$sno1_null_flg);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno2, MST_IO_SCHD_R.$sno2);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno2_null_flg, MST_IO_SCHD_R.$sno2_null_flg);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno3, MST_IO_SCHD_R.$sno3);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno3_null_flg, MST_IO_SCHD_R.$sno3_null_flg);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno4, MST_IO_SCHD_R.$sno4);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$sno4_null_flg, MST_IO_SCHD_R.$sno4_null_flg);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$ex_sno1, MST_IO_SCHD_R.$ex_sno1);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$ex_sno2, MST_IO_SCHD_R.$ex_sno2);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$ex_sno3, MST_IO_SCHD_R.$ex_sno3);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$ex_sno4, MST_IO_SCHD_R.$ex_sno4);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$pack_unit_cd, MST_IO_SCHD_R.$pack_unit_cd);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$pack_unit_qty, MST_IO_SCHD_R.$pack_unit_qty);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$base_unit_cd, MST_IO_SCHD_R.$base_unit_cd);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$base_unit_qty, MST_IO_SCHD_R.$base_unit_qty);
				addColumnPathMap(MST_ORD_IO_SCHD_R.$gd_cd, MST_IO_SCHD_R.$gd_cd);
			}

			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_IO_SCHD_TYP.isINPT(src.io_schd_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT_PLN.value());
					dest.schd_dt(src.schd_dt());
					dest.alt_grp_cd(src.alt_grp_cd());
					dest.alt_grp_seq(src.alt_grp_seq());
					dest.oper_ord_no(src.oper_ord_no());
					dest.alt_qty(src.alt_qty());
					dest.alt_itm_typ(src.alt_itm_typ());
					dest.alt_itm_ratio(src.alt_itm_ratio());
					dest.alt_alloc_prio(src.alt_alloc_prio());
					dest.loc_cd(src.loc_cd());
					dest.wg_cd(_hdr.wg_cd());
					dest.inpt_ctl_typ(src.inpt_ctl_typ());
				}
				else {
					if (MSC_IO_SCHD_TYP.isXFR_GI(src.io_schd_typ())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
					}
					else if (MSC_IO_SCHD_TYP.isXFR_GI_PROV(src.io_schd_typ())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
					}
					else if (MSC_IO_SCHD_TYP.isMOVE_GI(src.io_schd_typ())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
					}
					else if (MSC_IO_SCHD_TYP.isMOVE_GI_PROV(src.io_schd_typ())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PLN.value());
					}
					dest.schd_dt(_hdr.gi_schd_dt());
					dest.loc_cd(_hdr.rqst_loc_cd());
					if (MSC_ITM_ORD_TYP.isXFR(_hdr.itm_ord_typ())) {
						dest.wg_cd(_hdr.wg_cd());
					}
					else {
						dest.wg_cd(_hdr.rqst_wg_cd());
					}
					dest.sppl_cd(_hdr.sppl_cd());
					dest.gi_loc_cd(_hdr.rqst_loc_cd());
					dest.gr_loc_cd(_hdr.strg_loc_cd());
				}
				if (MSC_ITM_ORD_STS_TYP.isOPN(_hdr.a_itm_ord_sts_typ())){
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
				}
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
				}
				dest.io_schd_no(_hdr.itm_ord_no());
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				dest.io_schd_sub_no1(_hdr.itm_ord_no());
				dest.str_ln_cd(MAC_STR.NULL_VAL.value());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.asst_typ(getAsstTyp(dest.loc_cd(), _cacheLoc));
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				dest.org_wg_cd(_hdr.wg_cd());
				dest.sim_mrp_no(_hdr.sim_mrp_no());
			}
		}

		/**
		 * MST_ORD_IO_SCHD → IoSchd_Ins01_DtlR (Ord_Upd02 → IoSchd_Ins01)
		 * 確定受払予定（製造出庫）
		 */
		protected Map_IoSchd_Ins01_DtlR_MST_ORD_IO_SCHD_R<IoSchd_Ins01_DtlR, MST_ORD_IO_SCHD_R> createMap_IoSchd_Ins01_DtlR_MST_ORD_IO_SCHD_R() {
			return new Map_IoSchd_Ins01_DtlR_MST_ORD_IO_SCHD_R<IoSchd_Ins01_DtlR, MST_ORD_IO_SCHD_R>();
		}

		/**
		 * MST_ORD_IO_SCHD → IoSchd_Ins01_DtlR (Ord_Upd02 → IoSchd_Ins01)
		 * 確定受払予定（製造出庫）
		 */
		public class Map_IoSchd_Ins01_DtlR_MST_ORD_IO_SCHD_R<D extends IoSchd_Ins01_DtlR, S extends MST_ORD_IO_SCHD_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, MST_ORD_IO_SCHD_R.$io_schd_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_seq, MST_ORD_IO_SCHD_R.$io_schd_seq);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_typ1, MST_ORD_IO_SCHD_R.$io_schd_sub_typ1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no1, MST_ORD_IO_SCHD_R.$io_schd_sub_no1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_seq1, MST_ORD_IO_SCHD_R.$io_schd_sub_seq1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_typ2, MST_ORD_IO_SCHD_R.$io_schd_sub_typ2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no2, MST_ORD_IO_SCHD_R.$io_schd_sub_no2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_seq2, MST_ORD_IO_SCHD_R.$io_schd_sub_seq2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, MST_ORD_IO_SCHD_R.$io_schd_pr_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, MST_ORD_IO_SCHD_R.$schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, MST_ORD_IO_SCHD_R.$accpt_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, MST_ORD_IO_SCHD_R.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, MST_ORD_IO_SCHD_R.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, MST_ORD_IO_SCHD_R.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, MST_ORD_IO_SCHD_R.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, MST_ORD_IO_SCHD_R.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, MST_ORD_IO_SCHD_R.$alt_grp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, MST_ORD_IO_SCHD_R.$alt_grp_seq);
				addColumnPathMap(IoSchd_Ins01_DtlR.$oper_inst_no, MST_ORD_IO_SCHD_R.$oper_inst_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, MST_ORD_IO_SCHD_R.$oper_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, MST_ORD_IO_SCHD_R.$alt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, MST_ORD_IO_SCHD_R.$alt_itm_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_ratio, MST_ORD_IO_SCHD_R.$alt_itm_ratio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, MST_ORD_IO_SCHD_R.$alt_alloc_prio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, MST_ORD_IO_SCHD_R.$loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, MST_ORD_IO_SCHD_R.$str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, MST_ORD_IO_SCHD_R.$stk_arrv_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, MST_ORD_IO_SCHD_R.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, MST_ORD_IO_SCHD_R.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, MST_ORD_IO_SCHD_R.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, MST_ORD_IO_SCHD_R.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, MST_ORD_IO_SCHD_R.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, MST_ORD_IO_SCHD_R.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, MST_ORD_IO_SCHD_R.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, MST_ORD_IO_SCHD_R.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, MST_ORD_IO_SCHD_R.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, MST_ORD_IO_SCHD_R.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, MST_ORD_IO_SCHD_R.$pack_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, MST_ORD_IO_SCHD_R.$pack_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, MST_ORD_IO_SCHD_R.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, MST_ORD_IO_SCHD_R.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, MST_ORD_IO_SCHD_R.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, MST_ORD_IO_SCHD_R.$quality_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_insp_typ, MST_ORD_IO_SCHD_R.$stk_insp_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, MST_ORD_IO_SCHD_R.$stk_id_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_bp_cd, MST_ORD_IO_SCHD_R.$stk_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_scope_typ, MST_IO_SCHD_R.$alloc_scope_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_flg, MST_ORD_IO_SCHD_R.$alloc_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_wait_flg, MST_IO_SCHD_R.$alloc_wait_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, MST_ORD_IO_SCHD_R.$sppl_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, MST_ORD_IO_SCHD_R.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_to, MST_ORD_IO_SCHD_R.$vld_dt_to);
				addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, MST_ORD_IO_SCHD_R.$inpt_ctl_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, MST_IO_SCHD_R.$loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gr_loc_cd, MST_IO_SCHD_R.$gr_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char1, MST_ORD_IO_SCHD_R.$sub_char1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char2, MST_ORD_IO_SCHD_R.$sub_char2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char3, MST_ORD_IO_SCHD_R.$sub_char3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char4, MST_ORD_IO_SCHD_R.$sub_char4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char5, MST_ORD_IO_SCHD_R.$sub_char5);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_num1, MST_ORD_IO_SCHD_R.$sub_num1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_num2, MST_ORD_IO_SCHD_R.$sub_num2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_num3, MST_ORD_IO_SCHD_R.$sub_num3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_dt1, MST_ORD_IO_SCHD_R.$sub_dt1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_dt2, MST_ORD_IO_SCHD_R.$sub_dt2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_dt3, MST_ORD_IO_SCHD_R.$sub_dt3);
			}

			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				if(!isNullOrNullVal(src.ex_sno1()) && isNullOrNullVal(src.sno1())) {
					dest.sno1(src.ex_sno1());
				}
				if(!isNullOrNullVal(src.ex_sno2()) && isNullOrNullVal(src.sno2())) {
					dest.sno2(src.ex_sno2());
				}
				if(!isNullOrNullVal(src.ex_sno3()) && isNullOrNullVal(src.sno3())) {
					dest.sno3(src.ex_sno3());
				}
				if(!isNullOrNullVal(src.ex_sno4()) && isNullOrNullVal(src.sno4())) {
					dest.sno4(src.ex_sno4());
				}
			}
		}

		/** Ord_Upd01_Dtl1R → SloSts_DtlR (Ord_Upd01 → SloSts_Ins02) */
		protected Map_SloSts_DtlR_Ord_Upd01_Dtl1R<SloSts_DtlR, Ord_Upd01_Dtl1R> createMap_SloSts_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_SloSts_DtlR_Ord_Upd01_Dtl1R<SloSts_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → SloSts_DtlR (Ord_Upd01 → SloSts_Ins02) */
		public class Map_SloSts_DtlR_Ord_Upd01_Dtl1R<D extends SloSts_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
				addColumnPathMap(SloSts_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(SloSts_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(SloSts_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(SloSts_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(SloSts_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(SloSts_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(SloSts_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(SloSts_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(SloSts_DtlR.$qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(SloSts_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(SloSts_DtlR.$biz_tm, Ord_Upd01_Dtl1R.$fix_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (MSC_ITM_ORD_STS_TYP.isFIX(src.a_itm_ord_sts_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_FIX.value());
					dest.qty(src.yield_schd_qty());
					dest.unit_cd(src.unit_cd());
					dest.biz_tm(src.fix_dt());
				}
				else if (MSC_ITM_ORD_STS_TYP.isFIX(src.b_itm_ord_sts_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_FIX_CAN.value());
				}
			}
		}
	}

	/**
	 * Ord_Upd03オペレーション.<p>
	 * 
	 * 工程オーダ更新サービス</br>
	 */
	public class Ord_Upd03 extends MSBCL_OrdRegService_MC_A.Ord_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			chkUp(up0());

			insWk(up0());

			MCList<MST_ITM_ORDER_R> itmOrderL = MCList.create(MST_ITM_ORDER_R.class);
			MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);

			getOrder(itmOrderL, operOrderL);

			MCList<MST_OPER_ORDER_R> operL = setOperOrder(up0(), operOrderL);

			setItmOrder(itmOrderL, operL);

			// 予定日計算サービスを実行
			setSchdDt(itmOrderL);

			// オーダ更新サービスの実行
			updOrdexec(itmOrderL, operOrderL);
		}

		protected MCList<MST_OPER_ORDER_R> setOperOrder(
				MCList<Ord_Upd03_DtlR> up, MCList<MST_OPER_ORDER_R> operOrderL) {
			MCList<MST_OPER_ORDER_R> retL = MCList.create(MST_OPER_ORDER_R.class);
			MCIndexKey aOperKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq);
			MCIndexKey aUpKey = up.createIndex(MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq);
			for (Ord_Upd03_DtlR row : up.groupBy(MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq)) {
				MCList<MST_OPER_ORDER_R> operL = operOrderL.subList(aOperKey,
						row.itm_ord_no(), row.oper_cd(), row.oper_seq());
				MCList<Ord_Upd03_DtlR> upL = up.subList(aUpKey, row.itm_ord_no(),
						row.oper_cd(), row.oper_seq());
				if (!isSame(operL.sum(MST_OPER_ORDER_R.$oper_schd_qty),
						upL.sum(Ord_Upd03_DtlR.$oper_schd_qty))) {
					throw new MCAppException(row, null, MSBCL0090, row.itm_ord_no());
				}
				if (upL.size() == 1) {
					MST_OPER_ORDER_R operR = operL.get(0);
					Ord_Upd03_DtlR upR = upL.get(0);

					operR.st_schd_tm(upR.st_schd_tm());
					operR.end_schd_tm(upR.end_schd_tm());
					operR.oper_schd_qty(row.oper_schd_qty());
					retL.add(operR);
				}
				else {
					MST_OPER_ORDER_R operR = operL.get(0);
					for (Ord_Upd03_DtlR upR : upL) {
						MST_OPER_ORDER_R cloneR = operR.clone();
						cloneR.st_schd_tm(upR.st_schd_tm());
						cloneR.end_schd_tm(upR.end_schd_tm());
						cloneR.oper_schd_qty(row.oper_schd_qty());
						cloneR.oper_ord_no(null);
						retL.add(cloneR);
					}
				}
			}

			return retL;
		}

		/**
		 * エラーチェック
		 * @param up
		 */
		protected void chkUp(MCList<Ord_Upd03_DtlR> up) {
			for (Ord_Upd03_DtlR r : up) {
				if (r.st_schd_tm().gt(r.end_schd_tm())) {
					// 工程着手予定日時＞工程終了予定日時
					throw new MCAppException(r, null, MSBCL0074, r.st_schd_tm(),
							r.end_schd_tm(), r.itm_ord_no());
				}
				if (!MSC_OPER_ORD_STS_TYP.isOPN(r.oper_ord_sts_typ())
						&& !MSC_OPER_ORD_STS_TYP.isSAV(r.oper_ord_sts_typ())) {
					// 工程オーダ状況が未確定・保存以外はエラー
					throw new MCAppException(r, null, MSBCL0075, r.itm_ord_no());
				}
			}
		}

		protected void insWk(MCList<Ord_Upd03_DtlR> up) {
			MSW_OPER_ORDER_R S0 = MSW_OPER_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_OPER_ORDER_D02", S0);
			MCList<MSW_OPER_ORDER_R> insWk = MCList.create(MSW_OPER_ORDER_R.class);
			for (Ord_Upd03_DtlR row : up) {
				insWk.add(row.wk());
			}
			MCQueryApiBuilder insWk_bldr = MCQueryApiBuilder.create(MSW_OPER_ORDER_R.create("T"));
			dbInsert("MSBCL5010_MSW_OPER_ORDER_I02", insWk, insWk_bldr);
		}

		protected void getOrder(MCList<MST_ITM_ORDER_R> itmOrderL,
				MCList<MST_OPER_ORDER_R> operOrderL) {
			MSW_OPER_ORDER_R S1T1 = MSW_OPER_ORDER_R.create("T1");

			MST_ITM_ORDER_R itmOrderL_t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrderL_bldr = MCQueryApiBuilder.create(itmOrderL_t);
			itmOrderL_bldr.setWhere(exists(subQuery().select(value("x")).from(S1T1)
					.where(itmOrderL_t.itm_ord_no.eq(S1T1.itm_ord_no))));
			dbSelect("MSBCL5010_MST_ITM_ORDER_S02", itmOrderL, itmOrderL_bldr);

			MST_OPER_ORDER_R operOrderL_t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(operOrderL_t);
			operOrderL_bldr.setWhere(exists(subQuery().select(value("x")).from(S1T1)
					.where(operOrderL_t.itm_ord_no.eq(S1T1.itm_ord_no))));
			dbSelect("MSBCL5010_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr);
		}

		protected void setItmOrder(MCList<MST_ITM_ORDER_R> itmOrderL,
				MCList<MST_OPER_ORDER_R> operL) {
			MCIndexKey aOperKey = operL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			for (MST_ITM_ORDER_R row : itmOrderL) {
				MCList<MST_OPER_ORDER_R> opMinL = operL.subList(aOperKey,
						row.itm_ord_no());
				MCList<MST_OPER_ORDER_R> opMax = opMinL.subList(
						MST_OPER_ORDER_R.$yield_oper_flg, true);
				if (opMinL.size() == 0) {
					continue;
				}
				row.mfg_st_schd_dt(((MCDate) opMinL.min(MST_OPER_ORDER_R.$st_schd_tm))
						.startTimeOfDay());
				if (opMinL.size() > 0) {
					row.mfg_end_schd_dt(((MCDate) opMax
							.max(MST_OPER_ORDER_R.$end_schd_tm)).startTimeOfDay());
				}
				else {
					row.mfg_end_schd_dt(((MCDate) opMinL
							.max(MST_OPER_ORDER_R.$end_schd_tm)).startTimeOfDay());
				}
				row.strg_schd_dt(null);
				row.insp_st_schd_dt(null);
				row.insp_end_schd_dt(null);
				row.po_schd_dt(null);
				row.accpt_schd_dt(null);
				row.avl_schd_dt(null);
			}
		}

		protected void setSchdDt(MCList<MST_ITM_ORDER_R> itmOrderL) {
			MCList<Ord_Sprt03_DtlR> upL = MCList.create(Ord_Sprt03_DtlR.class);
			int i = 0;
			for (MST_ITM_ORDER_R r : itmOrderL) {
				Ord_Sprt03_DtlR upR = Ord_Sprt03_DtlR.create();
				copy(upR, r, createMap_Ord_Sprt03_DtlR_MST_ITM_ORDER_R());
				upR.peg_no(i);
				// 外注製造場所発注先がサービスに取得する
				upR.mfg_sppl_cd(null);
				upL.add(upR);
				i++;
			}
			if (upL.size() > 0) {
				MSBCL_OrdRegService.Ord_Sprt03 oSchdDtCalc = MSBCL_OrdRegService
						.crtOrd_Sprt03();
				oSchdDtCalc.up0().addAll(upL);
				oSchdDtCalc.exec();
			}
		}

		protected void updOrdexec(MCList<MST_ITM_ORDER_R> itmOrderL,
				MCList<MST_OPER_ORDER_R> operOrderL) {
			MSBCL_OrdRegService.Ord_Upd01 oOrdUpd = MSBCL_OrdRegService.crtOrd_Upd01();
			// パラメータの品目オーダリストをサービスの上り電文１へ設定する。
			int i = 0;
			for (MST_ITM_ORDER_R ordR : itmOrderL) {
				Ord_Upd01_Dtl1R ordRow = Ord_Upd01_Dtl1R.create();
				ordRow.ord(ordR);
				ordRow.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				ordRow.mrp_typ(MSC_MRP_TYP.MRP.value());
				ordRow.oper_ord_pr_flg(false);
				ordRow.io_schd_pr_flg(true);
				ordRow.peg_no(i);
				oOrdUpd.up0().add(ordRow);
			}

			// パラメータの工程オーダリストをサービスの上り電文２へ設定する。
			int j = 0;
			for (MST_OPER_ORDER_R operR : operOrderL) {
				Ord_Upd01_Dtl2R operRow = Ord_Upd01_Dtl2R.create();
				copy(operRow, operR, createMap_Ord_Upd01_Dtl2R_MST_OPER_ORDER_R());
				operRow.peg_no(j);
				oOrdUpd.up1().add(operRow);
			}
			oOrdUpd.exec();
		}

		protected Map_Ord_Sprt03_DtlR_MST_ITM_ORDER_R<Ord_Sprt03_DtlR, MST_ITM_ORDER_R> createMap_Ord_Sprt03_DtlR_MST_ITM_ORDER_R() {
			return new Map_Ord_Sprt03_DtlR_MST_ITM_ORDER_R<Ord_Sprt03_DtlR, MST_ITM_ORDER_R>();
		}

		public class Map_Ord_Sprt03_DtlR_MST_ITM_ORDER_R<D extends Ord_Sprt03_DtlR, S extends MST_ITM_ORDER_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_ord_typ,
						MST_ITM_ORDER_R.$itm_ord_typ);
				addColumnPathMap(Ord_Sprt03_DtlR.$po_schd_dt, MST_ITM_ORDER_R.$po_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$gi_schd_dt, MST_ITM_ORDER_R.$gi_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_st_schd_dt,
						MST_ITM_ORDER_R.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_end_schd_dt,
						MST_ITM_ORDER_R.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt,
						MST_ITM_ORDER_R.$strg_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$accpt_schd_dt,
						MST_ITM_ORDER_R.$accpt_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_st_schd_dt,
						MST_ITM_ORDER_R.$insp_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_end_schd_dt,
						MST_ITM_ORDER_R.$insp_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt,
						MST_ITM_ORDER_R.$avl_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, MST_ITM_ORDER_R.$master_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, MST_ITM_ORDER_R.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, MST_ITM_ORDER_R.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, MST_ITM_ORDER_R.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, MST_ITM_ORDER_R.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, MST_ITM_ORDER_R.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, MST_ITM_ORDER_R.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, MST_ITM_ORDER_R.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd,
						MST_ITM_ORDER_R.$rqst_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, MST_ITM_ORDER_R.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd,
						MST_ITM_ORDER_R.$strg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, MST_ITM_ORDER_R.$inst_qty);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_lt, MST_ITM_ORDER_R.$insp_lt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_offst, MST_ITM_ORDER_R.$insp_offst);
				//addColumnPathMap(Ord_Sprt03_DtlR.$mfg_sppl_cd, );
			}
		}

		protected Map_Ord_Upd01_Dtl2R_MST_OPER_ORDER_R<Ord_Upd01_Dtl2R, MST_OPER_ORDER_R> createMap_Ord_Upd01_Dtl2R_MST_OPER_ORDER_R() {
			return new Map_Ord_Upd01_Dtl2R_MST_OPER_ORDER_R<Ord_Upd01_Dtl2R, MST_OPER_ORDER_R>();
		}

		public class Map_Ord_Upd01_Dtl2R_MST_OPER_ORDER_R<D extends Ord_Upd01_Dtl2R, S extends MST_OPER_ORDER_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_no,
						MST_OPER_ORDER_R.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_no,
						MST_OPER_ORDER_R.$oper_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$st_schd_tm,
						MST_OPER_ORDER_R.$st_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$end_schd_tm,
						MST_OPER_ORDER_R.$end_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_lt, MST_OPER_ORDER_R.$oper_lt);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst_typ,
						MST_OPER_ORDER_R.$oper_offst_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst,
						MST_OPER_ORDER_R.$oper_offst);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_schd_qty,
						MST_OPER_ORDER_R.$oper_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl2R.$disp_seq, MST_OPER_ORDER_R.$disp_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ptn, MST_OPER_ORDER_R.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_cd, MST_OPER_ORDER_R.$oper_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_seq, MST_OPER_ORDER_R.$oper_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$loc_cd, MST_OPER_ORDER_R.$loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_sts_typ,
						MST_OPER_ORDER_R.$oper_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_sts_typ,
						MST_OPER_ORDER_R.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$wg_cd, MST_OPER_ORDER_R.$wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$yield_oper_flg,
						MST_OPER_ORDER_R.$yield_oper_flg);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_rsrc, 
						MST_OPER_ORDER_R.$oper_rsrc);
				addColumnPathMap(Ord_Upd01_Dtl2R.$intr_rmrks,
						MST_OPER_ORDER_R.$intr_rmrks);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char1, MST_OPER_ORDER_R.$sub_char1);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char2, MST_OPER_ORDER_R.$sub_char2);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char3, MST_OPER_ORDER_R.$sub_char3);
			}
		}

	}

	/**
	 * Ord_Upd04オペレーション.<p>
	 *
	 * 品目オーダ実績項目更新サービス</br>
	 */
	public class Ord_Upd04 extends MSBCL_OrdRegService_MC_A.Ord_Upd04 {
		protected String _stdCal = getCo().std_cal_cd();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// 品目オーダロック
			lock();

			// ワークテーブル設定
			makeWk();

			// 品目オーダ反映
			updOrd();
		}

		protected void editUp() {
			// N/A
			setPlnItmOrdNo();
		}
		/** 外注品目オーダＮＯから計画品目オーダＮＯを取得する **/
		protected void setPlnItmOrdNo() {
			// オーダ区分が「外注」の上り電文のみ処理対象とする
			MCList<Ord_Upd04_DtlR> outsrcL = up0().subList(Ord_Upd04_DtlR.$itm_ord_typ, MSC_ITM_ORD_TYP.OUTSRC.value());

			if (outsrcL.isEmpty()) {
				return;
			}

			// 発注明細が存在する場合、上り電文の品目オーダＮＯを外注品目オーダＮＯとして発注明細を検索し、発注明細ＮＯから発注予定を検索
			// 外注品目オーダＮＯと計画品目オーダＮＯが異なる発注明細のみ抽出
			MCList<MST_PO_D_R> pdL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R pdL_t = MST_PO_D_R.create("T");
			MCQueryApiBuilder pdL_bldr = MCQueryApiBuilder.create(pdL_t);
			MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T1");
			pdL_bldr.setSelect(pdL_t.outsrc_itm_ord_no);
			pdL_bldr.addSelect(t1.pln_itm_ord_no);
			pdL_bldr.addInnerJoin(t1, bracket(pdL_t.po_no.eq(t1.po_no)
					.and(pdL_t.po_d_no.eq(t1.po_d_no))));
			pdL_bldr.addWhereWithAnd(pdL_t.outsrc_itm_ord_no.eq(bind("itm_ord_no")));
			pdL_bldr.addWhereWithAnd(pdL_t.outsrc_itm_ord_no.neq(t1.pln_itm_ord_no));
			pdL_bldr.addWhereWithAnd(pdL_t.can_flg.eq(value(false)));
			pdL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			dbSelect("MSBCL5010_MST_PO_D_S01", pdL, pdL_bldr, outsrcL);

			// 上り電文の品目オーダＮＯを外注品目オーダＮＯとして、発注予定を検索
			// 外注品目オーダＮＯと計画品目オーダＮＯが異なる発注予定のみ抽出
			MCList<MST_PO_SCHD_R> psL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R psL_t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder psL_bldr = MCQueryApiBuilder.create(psL_t);
			psL_bldr.setSelect(psL_t.outsrc_itm_ord_no);
			psL_bldr.addSelect(psL_t.pln_itm_ord_no);
			psL_bldr.addWhereWithAnd(psL_t.outsrc_itm_ord_no.eq(bind("itm_ord_no")));
			psL_bldr.addWhereWithAnd(psL_t.outsrc_itm_ord_no.neq(psL_t.pln_itm_ord_no));
			psL_bldr.addWhereWithAnd(psL_t.can_flg.eq(value(false)));
			dbSelect("MSBCL5010_MST_PO_SCHD_S01", psL, psL_bldr, outsrcL);

			if (pdL.isEmpty() && psL.isEmpty()) {
				return;
			}
			
			MCIndexKey pdIdx = pdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
			MCIndexKey psIdx = psL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
			MCList<Ord_Upd04_DtlR> addL = MCList.create(Ord_Upd04_DtlR.class);
			
			for (Ord_Upd04_DtlR r : outsrcL) {
				// まずは発注明細を参照
				MCList<MST_PO_D_R> pdSubL = pdL.subList(pdIdx, r.itm_ord_no());
				if (!pdSubL.isEmpty()) {
					// 外注品目オーダＮＯと計画品目オーダＮＯが異なる発注明細を抽出した場合、計画品目オーダＮＯを上り電文に追加
					// ※複数の外注オーダを発注まとめした場合は複数レコード存在する
					for (MST_PO_D_R pdR : pdSubL) {
						Ord_Upd04_DtlR addR = r.clone();
						addR.itm_ord_no(pdR.getStringNE(MST_PO_SCHD_R.$pln_itm_ord_no));
						addL.add(addR);
					}
				}
				else {
					// 発注明細が存在しない場合は発注予定を参照
					MCList<MST_PO_SCHD_R> psSubL = psL.subList(psIdx, r.itm_ord_no());
					for (MST_PO_SCHD_R psR : psSubL) {
						// 外注品目オーダＮＯと計画品目オーダＮＯが異なる発注予定を抽出した場合、計画品目オーダＮＯを上り電文に追加
						// ※複数の外注オーダを発注まとめした場合は複数レコード存在する
						Ord_Upd04_DtlR addR = r.clone();
						addR.itm_ord_no(psR.pln_itm_ord_no());
						addL.add(addR);
					}
				}
			}
			up0().addAll(addL);
		}

		/** 更新対象品目オーダのロックを取得する */
		protected void lock() {
			setKeyWk(up0().groupBy(Ord_Upd04_DtlR.$itm_ord_no));
			executeQuery((MCList<? extends MCRow>)null, MSBCL5010_MST_ITM_ORDER_S01());
		}

		/** 指図・実績からステータス、日付、数量項目を取得しワークテーブルに設定する */
		protected void makeWk() {
			MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_ITM_ORDER_D06", S0);
			for (MCList<Ord_Upd04_DtlR> l: up0().groupList(Ord_Upd04_DtlR.$itm_ord_typ)) {
				insOrdWk(l);
			}
		}

		/** ワークテーブルから品目オーダに反映する */
		protected void updOrd() {
			// ステータス、日付、数量項目をワークテーブルから品目オーダに一括反映
			executeUpdate(MSBCL5010_MST_ITM_ORDER_U01());
		}

		/** オーダ区分に応じて指図・実績からステータス、日付、数量項目を取得しワークテーブルに設定する */
		protected void insOrdWk(MCList<Ord_Upd04_DtlR> l) {

			// ステータス、日付、数量項目設定
			// 複数のオーダを１つの発注や指図にまとめた場合、
			// 数量項目は更新しない（状況・日付項目は反映させる）
			setKeyWk(l);
			MCList<MSW_ITM_ORDER_R> updWkL = getItmOrderPr(l.get(0));

			// 品目オーダ反映用ワークテーブル作成
			if(!updWkL.isEmpty()) {
				MCQueryApiBuilder updWkL_bldr = MCQueryApiBuilder.create(MSW_ITM_ORDER_R.create("T"));
				dbInsertEx("MSBCL5010_MSW_ITM_ORDER_I06", updWkL, updWkL_bldr);
			}
		}

		/** オーダ区分に応じて指図・実績からステータス、日付、数量項目を取得する */
		protected MCList<MSW_ITM_ORDER_R> getItmOrderPr(Ord_Upd04_DtlR top) {

			// 指図実績取得
			MCList<MSW_ITM_ORDER_R> instActL = srchInstAct(top);

			// ステータス、数量、日付項目設定
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			if (top.abort_flg()) {
				updWkL.addAll(setAbortPr(instActL));
			}
			else if(MSC_ITM_ORD_TYP.isMFG(top.itm_ord_typ())) {
				updWkL.addAll(setMfgPr(instActL));
			}
			else if (MSC_ITM_ORD_TYP.isPURC(top.itm_ord_typ())) {
				updWkL.addAll(setPurcPr(instActL));
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(top.itm_ord_typ())) {
				updWkL.addAll(setOutSrcPr(instActL));
			}
			else if (MSC_ITM_ORD_TYP.isXFR(top.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(top.itm_ord_typ())) {
				updWkL.addAll(setXfrPr(instActL));
			}

			return updWkL;
		}

		/** オーダに紐づく指図や実績、検査情報を取得する */
		protected MCList<MSW_ITM_ORDER_R> srchInstAct(Ord_Upd04_DtlR top) {

			MCList<MSW_ITM_ORDER_R> wkL = MCList.create(MSW_ITM_ORDER_R.class);
			wkL.addStringColumn("MFG_STS_TYP");		// 最遅製造状況
			wkL.addStringColumn("SHIP_STS_TYP");	// 最遅出荷状況
			wkL.addStringColumn("ARR_STS_TYP");		// 最遅入荷状況
			wkL.addStringColumn("INSP_STS_TYP");	// 最遅検査状況
			wkL.addStringColumn("MFG_CAL_CD");		// 製造場所カレンダ
			wkL.addStringColumn("SPPL_CAL_CD");		// 発注先カレンダ
			wkL.addBooleanColumn("INSP_BLK_FLG");	// 検査まとめ
			wkL.addBooleanColumn("PURC_CMPL_FLG");	// 仕入完了フラグ
			wkL.addBooleanColumn("ARR_CMPL_FLG");	// 入荷完了フラグ
			wkL.addBooleanColumn("SHIP_CMPL_FLG");	// 出荷完了フラグ
			wkL.addBooleanColumn("PO_SCHD_ABORT_FLG");	// 発注予定打切フラグ
			wkL.addBooleanColumn("ALL_CMPL_FLG");	// 完了フラグ（発注予定打切時、または入荷・仕入完了にオン）
			wkL.addNumberColumn("WK_INST_QTY");	// このサービスで求める指図済の数量（購買、外注、移送の場合に求めなおす）
			wkL.addNumberColumn("WK_NOT_INST_QTY"); // このサービスで求める未指図の数量（購買、外注、移送の場合に求めなおす）
			wkL.addBooleanColumn("XFR_FLG");		// 移動フラグ
			wkL.addBooleanColumn("SHIP_SCHD_ABORT_FLG");	// 出荷予定打切フラグ
			wkL.addStringColumn("ARR_LOC_CD");		// 入荷場所ＣＤ
			wkL.addStringColumn("ARR_SCHD_TM");		// 入荷予定日時
			wkL.addStringColumn("PO_SCHD_NO");		// 発注予定ＮＯ
			wkL.addStringColumn("PO_D_NO");			// 発注明細ＮＯ
			wkL.addStringColumn("ARR_ACT_NO");		// 入荷実績ＮＯ
			wkL.addStringColumn("PURC_ACT_D_NO");		// 仕入実績明細ＮＯ
			wkL.addStringColumn("INSP_ACT_NO");		// 検査実績ＮＯ
			wkL.addStringColumn("OPER_ORD_NO");		// 工程オーダＮＯ
			wkL.addStringColumn("OPER_ORD_STS_TYP");		// 工程オーダＮＯ
			wkL.addStringColumn("ARR_SCHD_NO");		// 入荷予定ＮＯ
			wkL.addStringColumn("SRC_NO3");		// 	作成元ＮＯ３
			wkL.addStringColumn("ITM_MFG_INST_NO");		// 	品目製造指図ＮＯ
			wkL.addStringColumn("YIELD_ACT_NO");		// 	出来高実績ＮＯ

			if(MSC_ITM_ORD_TYP.isMFG(top.itm_ord_typ())){
				srchMfgInstAct(wkL);
			}
			else if (MSC_ITM_ORD_TYP.isPURC(top.itm_ord_typ())){
				srchPurcInstAct(wkL);
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(top.itm_ord_typ())){
				srchOutSrcInstAct(wkL);
			}
			else if (MSC_ITM_ORD_TYP.isXFR(top.itm_ord_typ())){
				srchXfrInstAct(wkL);
				srchXfrInstAct2(wkL);
			}

			return wkL;
		}

		

		// ----------------------------------------------------------

		/** 製造オーダに紐づく指図や実績、検査情報を取得する */
		protected void srchMfgInstAct(MCList<MSW_ITM_ORDER_R> wkL) {
			//・未指図数量（NOT_INST_QTY）：呼び出し元が設定
			//・ステータス(確定、指図・発注済、完了)：MSVT_MFG_INST_PRおよび検査指図から取得
			//・まとめフラグ：製造はまとめなし
			//
			//・出来高予定数量（指図・発注）：製造指図から取得。工程単位指図の場合はＭＡＸ値
			//・製造着手／終了予定日（指図）：製造指図から取得。終了実績日は完了の場合のみ設定
			//・格納完了予定日（指図・発注）：取得してない
			//・検査着手／終了予定日：検査予定から取得。最早着手予定日／最遅終了予定日
			//
			//・出来高実績数量（入荷・出来高）：出来高実績から取得。出来高不良は含めない
			//・検査実績数量：検査実績ヘッダから取得。検査不良数量は含めない
			//・製造着手／終了実績日：製造実績から取得。終了実績日は完了の場合のみ設定
			//・検査着手／終了実績日：検査実績ヘッダから取得。終了実績日は完了の場合のみ設定

			// 製造、出来高
			MCList<MSW_ITM_ORDER_R> mfgL = wkL.clone();
			executeQuery(mfgL, MSBCL5010_MSW_ITM_ORDER_KEY_S06());
			
			// 検査
			MCList<MSW_ITM_ORDER_R> inspL = wkL.clone();
			executeQuery(inspL, MSBCL5010_MSW_ITM_ORDER_KEY_S07());
			
			// wkLに一時カラムが追加されているため、cloneする
			MCList<MSW_ITM_ORDER_R> srchL = wkL.clone();
			
			srchL.addAll(mfgL);
			srchL.addAll(inspL);
			
			if (srchL.isEmpty()) {
				return;
			}
			
			// 工程オーダNOごとにグループ化する
			MCGroupByPolicy ioGbpItem = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no, "OPER_ORD_NO");
			// グループ化した工程オーダNOのうち、工程オーダ状況区分は最新の値にする
			ioGbpItem.max("OPER_ORD_STS_TYP");
			ioGbpItem.min(MSW_ITM_ORDER_R.$itm_ord_sts_typ);
			ioGbpItem.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbpItem.max(MSW_ITM_ORDER_R.$not_inst_qty);
			ioGbpItem.min("MFG_STS_TYP");
			ioGbpItem.max(MSW_ITM_ORDER_R.$ord_gnrt_typ);
			ioGbpItem.min("INSP_STS_TYP");
			ioGbpItem.max("INSP_BLK_FLG");
			ioGbpItem.min(MSW_ITM_ORDER_R.$inst_mfg_st_schd_dt);
			ioGbpItem.min(MSW_ITM_ORDER_R.$mfg_st_act_dt);
			ioGbpItem.max(MSW_ITM_ORDER_R.$inst_mfg_end_schd_dt);
			ioGbpItem.max(MSW_ITM_ORDER_R.$mfg_end_act_dt);
			ioGbpItem.min(MSW_ITM_ORDER_R.$inst_insp_st_schd_dt);
			ioGbpItem.min(MSW_ITM_ORDER_R.$insp_st_act_dt);
			ioGbpItem.max(MSW_ITM_ORDER_R.$inst_insp_end_schd_dt);
			ioGbpItem.max(MSW_ITM_ORDER_R.$insp_end_act_dt);
			ioGbpItem.max("MFG_CAL_CD");
			ioGbpItem.max(MSW_ITM_ORDER_R.$mfg_inst_unit_typ);
			ioGbpItem.max(MSW_ITM_ORDER_R.$oper_ptn);
			MCList<MSW_ITM_ORDER_R> tempSrchL = MCList.create(MSW_ITM_ORDER_R.class);
			// 工程オーダ状況区分に確定以前(未確定、保存、確定)のステータスの工程があるかどうか判定する
			// 確定以前の工程が存在する場合、工程オーダ状況区分リストに品目NOを追加する
			for (MSW_ITM_ORDER_R tempSrchR : srchL.groupBy(ioGbpItem)) {
				String operOrdStsTyp = tempSrchR.getStringNE("OPER_ORD_STS_TYP");
				if (!isNullOrNullVal(tempSrchR.oper_ptn())
						&& (MSC_OPER_ORD_STS_TYP.isOPN(operOrdStsTyp)
								|| MSC_OPER_ORD_STS_TYP.isSAV(operOrdStsTyp)
								|| MSC_OPER_ORD_STS_TYP.isFIX(operOrdStsTyp))) {
					tempSrchR.setBooleanNE("OPER_ORD_STS_TYP_FIX_FLG", true);
				}
				else {
					tempSrchR.setBooleanNE("OPER_ORD_STS_TYP_FIX_FLG", false);
				}

				tempSrchL.add(tempSrchR);
			}
			// 数値項目以外を品目オーダＮＯ単位に集計　※品目オーダの指図数、未指図数は品目オーダＮＯ単位での合計が不要のためMAX値を取得
			MCGroupByPolicy ioGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			ioGbp.min(MSW_ITM_ORDER_R.$itm_ord_sts_typ);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$not_inst_qty);
			ioGbp.min("MFG_STS_TYP");
			ioGbp.max(MSW_ITM_ORDER_R.$ord_gnrt_typ);
			ioGbp.min("INSP_STS_TYP");
			ioGbp.max("INSP_BLK_FLG");
			ioGbp.min(MSW_ITM_ORDER_R.$inst_mfg_st_schd_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$mfg_st_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_mfg_end_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$mfg_end_act_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$inst_insp_st_schd_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$insp_st_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_insp_end_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$insp_end_act_dt);
			ioGbp.max("MFG_CAL_CD");
			ioGbp.max(MSW_ITM_ORDER_R.$mfg_inst_unit_typ);
			ioGbp.max("OPER_ORD_STS_TYP_FIX_FLG");

			wkL.clear();
			wkL.addAll(tempSrchL.groupBy(ioGbp));
			
			// 出来高予定数量を品目製造指図ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> miL = sumQtyByItmOrdNo(srchL, "ITM_MFG_INST_NO",
					MSW_ITM_ORDER_R.$inst_yield_schd_qty);
			MCIndexKey miKey = miL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 出来高実績数量を出来高実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> yaL = sumQtyByItmOrdNo(srchL, "YIELD_ACT_NO",
					MSW_ITM_ORDER_R.$yield_act_qty);
			MCIndexKey yaKey = yaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 検査実績数量を検査実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> iaL = sumQtyByItmOrdNo(srchL, "INSP_ACT_NO",
					MSW_ITM_ORDER_R.$insp_act_qty);
			MCIndexKey iaKey = iaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 集計した数値項目をwkLに設定
			for (MSW_ITM_ORDER_R r : wkL) {
				MSW_ITM_ORDER_R miR = miL.getFirst(miKey, r.itm_ord_no());
				MSW_ITM_ORDER_R yaR = yaL.getFirst(yaKey, r.itm_ord_no());
				MSW_ITM_ORDER_R iaR = iaL.getFirst(iaKey, r.itm_ord_no());
				
				r.inst_yield_schd_qty(miR.inst_yield_schd_qty());
				r.yield_act_qty(yaR.yield_act_qty());
				r.insp_act_qty(iaR.insp_act_qty());
			}
		}

		/**
		 * オーダ実績情報をキーとなるＮＯ単位にグループ化し、品目オーダＮＯ単位に数値を集計する
		 * @param srchL オーダ実績状況
		 * @param keyCol グループ化の単位となるＮＯのカラム名
		 * @param qtyCol 集計対象の数値項目のカラム名
		 * @return
		 */
		protected MCList<MSW_ITM_ORDER_R> sumQtyByItmOrdNo(MCList<MSW_ITM_ORDER_R> srchL, String keyCol, String qtyCol) {
			MCList<MSW_ITM_ORDER_R> gbKeyL = srchL
					.groupBy(MSW_ITM_ORDER_R.$itm_ord_no, keyCol, qtyCol);
			MCGroupByPolicy gbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			gbp.sum(qtyCol);
			return gbKeyL.groupBy(gbp);
		}

		/** 購買オーダに紐づく指図や実績、検査情報を取得する */
		protected void srchPurcInstAct(MCList<MSW_ITM_ORDER_R> wkL) {
			//・未指図数量（NOT_INST_QTY）：
			//・ステータス(確定、指図・発注済、完了)：
			//・まとめフラグ：発注明細から取得
			//
			//・出来高予定数量（指図・発注）：発注明細から取得
			//・発注日：発注ヘッダから取得
			//・格納完了予定日（指図・発注）：発注明細から取得
			//・検収予定日（発注）：発注明細から取得
			//・検査着手／終了予定日：検査予定から取得。最早着手予定日／最遅終了予定日
			//
			//・出来高実績数量（入荷・出来高）：入荷実績から取得。
			//・仕入実績数量：仕入実績明細から取得
			//
			//・検査実績数量：検査実績ヘッダから取得。検査不良数量は含めない
			//・格納完了実績日：入荷実績から取得
			//・検収実績日：仕入実績明細から取得
			//・検査着手／終了実績日：検査実績ヘッダから取得。終了実績日は完了の場合のみ設定

			// 入荷
			MCList<MSW_ITM_ORDER_R> arrL = wkL.clone();
			executeQuery(arrL, MSBCL5010_MSW_ITM_ORDER_KEY_S08());
			
			// 仕入
			MCList<MSW_ITM_ORDER_R> purcL = wkL.clone();
			executeQuery(purcL, MSBCL5010_MSW_ITM_ORDER_KEY_S09());
			
			// 検査
			MCList<MSW_ITM_ORDER_R> inspL = wkL.clone();
			executeQuery(inspL, MSBCL5010_MSW_ITM_ORDER_KEY_S10());
			
			// wkLに一時カラムが追加されているため、cloneする
			MCList<MSW_ITM_ORDER_R> srchL = wkL.clone();
			
			srchL.addAll(arrL);
			srchL.addAll(purcL);
			srchL.addAll(inspL);
			
			if (srchL.isEmpty()) {
				return;
			}
			
			// 数値項目以外を品目オーダＮＯ単位に集計　※品目オーダの指図数、未指図数は品目オーダＮＯ単位での合計が不要のためMAX値を取得
			MCGroupByPolicy ioGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			ioGbp.min(MSW_ITM_ORDER_R.$itm_ord_sts_typ);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$not_inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$blk_flg);
			ioGbp.min("ARR_STS_TYP");
			ioGbp.min("PO_SCHD_ABORT_FLG");
			ioGbp.min("ALL_CMPL_FLG");
			ioGbp.min("PURC_CMPL_FLG");
			ioGbp.min("ARR_CMPL_FLG");
			ioGbp.min("INSP_STS_TYP");
			ioGbp.max("INSP_BLK_FLG");
			ioGbp.max(MSW_ITM_ORDER_R.$po_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_strg_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$strg_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_accpt_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$accpt_act_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$inst_insp_st_schd_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$insp_st_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_insp_end_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$insp_end_act_dt);
			ioGbp.max("SPPL_CAL_CD");

			wkL.clear();
			wkL.addAll(srchL.groupBy(ioGbp));
			
			// 指図数を発注予定ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> psL1 = sumQtyByItmOrdNo(srchL, "PO_SCHD_NO",
					"WK_INST_QTY");
			MCIndexKey ps1Key = psL1.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 未指図数を発注予定ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> psL2 = sumQtyByItmOrdNo(srchL, "PO_SCHD_NO",
					"WK_NOT_INST_QTY");
			MCIndexKey ps2Key = psL2.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 出来高予定数量を発注明細ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> pdL = sumQtyByItmOrdNo(srchL, "PO_D_NO",
					MSW_ITM_ORDER_R.$inst_yield_schd_qty);
			MCIndexKey pdKey = pdL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 出来高実績数量を入荷実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> aaL = sumQtyByItmOrdNo(srchL, "ARR_ACT_NO",
					MSW_ITM_ORDER_R.$yield_act_qty);
			MCIndexKey aaKey = aaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 仕入実績数量を仕入実績明細ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> paL = sumQtyByItmOrdNo(srchL, "PURC_ACT_D_NO",
					MSW_ITM_ORDER_R.$purc_act_qty);
			MCIndexKey paKey = paL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 検査実績数量を検査実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> iaL = sumQtyByItmOrdNo(srchL, "INSP_ACT_NO",
					MSW_ITM_ORDER_R.$insp_act_qty);
			MCIndexKey iaKey = iaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 品目オーダNO + 計算に使用する引数でグループ化し、品目オーダ単位に、 検査着手予定日の最小値と検査終了予定日の最大値を設定
			MCList<MSW_ITM_ORDER_R> aiL = instInspSchdDtByItmOrdNo(srchL);
			MCIndexKey aiKey = aiL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 集計した数値項目をwkLに設定
			for (MSW_ITM_ORDER_R r : wkL) {
				r.setBoolean("PO_SCHD_ABORT_FLG", setFlg(arrL, r.itm_ord_no(), "PO_SCHD_ABORT_FLG"));
				r.setBoolean("ALL_CMPL_FLG", setFlg(arrL, r.itm_ord_no(), "ALL_CMPL_FLG"));
				r.setBoolean("ARR_CMPL_FLG", setFlg(arrL, r.itm_ord_no(), "ARR_CMPL_FLG"));
				
				MSW_ITM_ORDER_R ps1R = psL1.getFirst(ps1Key, r.itm_ord_no());
				MSW_ITM_ORDER_R ps2R = psL2.getFirst(ps2Key, r.itm_ord_no());
				
				r.setNumberNE("WK_INST_QTY", ps1R.getNumberNE("WK_INST_QTY"));
				r.setNumberNE("WK_NOT_INST_QTY", ps2R.getNumberNE("WK_NOT_INST_QTY"));
				if (!r.blk_flg()) {
					MSW_ITM_ORDER_R pdR = pdL.getFirst(pdKey, r.itm_ord_no());
					MSW_ITM_ORDER_R aaR = aaL.getFirst(aaKey, r.itm_ord_no());
					MSW_ITM_ORDER_R paR = paL.getFirst(paKey, r.itm_ord_no());
					MSW_ITM_ORDER_R iaR = iaL.getFirst(iaKey, r.itm_ord_no());
					
					r.inst_yield_schd_qty(pdR.inst_yield_schd_qty());
					r.yield_act_qty(aaR.yield_act_qty());
					r.purc_act_qty(paR.purc_act_qty());
					r.insp_act_qty(iaR.insp_act_qty());
				}

				MSW_ITM_ORDER_R aiR = aiL.getFirst(aiKey, r.itm_ord_no());
				r.inst_insp_st_schd_dt(aiR.inst_insp_st_schd_dt());
				r.inst_insp_end_schd_dt(aiR.inst_insp_end_schd_dt());
			}
		}

		/** 外注オーダに紐づく指図や実績、検査情報を取得する */
		protected void srchOutSrcInstAct(MCList<MSW_ITM_ORDER_R> wkL) {
			//・未指図数量（NOT_INST_QTY）：
			//・ステータス(確定、指図・発注済、完了)：
			//・まとめフラグ：発注明細から取得
			//
			//・出来高予定数量（指図・発注）：発注明細から取得
			//・製造着手／終了予定日（指図）：製造指図から取得。終了実績日は完了の場合のみ設定
			//・格納完了予定日（指図・発注）：発注明細から取得
			//・発注日：発注ヘッダから取得
			//・検収予定日（発注）：発注明細から取得
			//・検査着手／終了予定日：検査予定から取得。最早着手予定日／最遅終了予定日
			//
			//・出来高実績数量（入荷・出来高）：入荷実績から取得。
			//・仕入実績数量：仕入実績明細から取得
			//
			//・検査実績数量：検査実績ヘッダから取得。検査不良数量は含めない
			//・格納完了実績日：入荷実績から取得
			//・検収実績日：仕入実績明細から取得
			//・検査着手／終了実績日：検査実績ヘッダから取得。終了実績日は完了の場合のみ設定

			// 入荷
			MCList<MSW_ITM_ORDER_R> arrL = wkL.clone();
			executeQuery(arrL, MSBCL5010_MSW_ITM_ORDER_KEY_S11());
			
			// 仕入
			MCList<MSW_ITM_ORDER_R> purcL = wkL.clone();
			executeQuery(purcL, MSBCL5010_MSW_ITM_ORDER_KEY_S12());
			
			// 製造、出来高
			MCList<MSW_ITM_ORDER_R> mfgL = wkL.clone();
			executeQuery(mfgL, MSBCL5010_MSW_ITM_ORDER_KEY_S13());
			
			// 検査
			MCList<MSW_ITM_ORDER_R> inspL = wkL.clone();
			executeQuery(inspL, MSBCL5010_MSW_ITM_ORDER_KEY_S14());
			
			// wkLに一時カラムが追加されているため、cloneする
			MCList<MSW_ITM_ORDER_R> srchL = wkL.clone();
			
			srchL.addAll(arrL);
			srchL.addAll(purcL);
			srchL.addAll(mfgL);
			srchL.addAll(inspL);
			
			if (srchL.isEmpty()) {
				return;
			}
			
			// 数値項目以外を品目オーダＮＯ単位に集計　※品目オーダの指図数、未指図数は品目オーダＮＯ単位での合計が不要のためMAX値を取得
			MCGroupByPolicy ioGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			ioGbp.min(MSW_ITM_ORDER_R.$itm_ord_sts_typ);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$not_inst_qty);
			ioGbp.min("ARR_STS_TYP");
			ioGbp.min("MFG_STS_TYP");
			ioGbp.max(MSW_ITM_ORDER_R.$ord_gnrt_typ);
			ioGbp.min("PO_SCHD_ABORT_FLG");
			ioGbp.min("ALL_CMPL_FLG");
			ioGbp.min("PURC_CMPL_FLG");
			ioGbp.min("ARR_CMPL_FLG");
			ioGbp.min("INSP_STS_TYP");
			ioGbp.max("INSP_BLK_FLG");
			ioGbp.max(MSW_ITM_ORDER_R.$blk_flg);
			ioGbp.max(MSW_ITM_ORDER_R.$po_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$inst_mfg_st_schd_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$mfg_st_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_mfg_end_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$mfg_end_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_strg_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$strg_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_accpt_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$accpt_act_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$inst_insp_st_schd_dt);
			ioGbp.min(MSW_ITM_ORDER_R.$insp_st_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_insp_end_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$insp_end_act_dt);
			ioGbp.max("MFG_CAL_CD");
			ioGbp.max("SPPL_CAL_CD");

			wkL.clear();
			wkL.addAll(srchL.groupBy(ioGbp));
			
			// 指図数を発注予定ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> psL1 = sumQtyByItmOrdNo(srchL, "PO_SCHD_NO",
					"WK_INST_QTY");
			MCIndexKey ps1Key = psL1.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 未指図数を発注予定ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> psL2 = sumQtyByItmOrdNo(srchL, "PO_SCHD_NO",
					"WK_NOT_INST_QTY");
			MCIndexKey ps2Key = psL2.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 出来高予定数量を発注明細ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> pdL = sumQtyByItmOrdNo(srchL, "PO_D_NO",
					MSW_ITM_ORDER_R.$inst_yield_schd_qty);
			MCIndexKey pdKey = pdL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 出来高実績数量を入荷実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> aaL = sumQtyByItmOrdNo(srchL, "ARR_ACT_NO",
					MSW_ITM_ORDER_R.$yield_act_qty);
			MCIndexKey aaKey = aaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 仕入実績数量を仕入実績明細ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> paL = sumQtyByItmOrdNo(srchL, "PURC_ACT_D_NO",
					MSW_ITM_ORDER_R.$purc_act_qty);
			MCIndexKey paKey = paL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 検査実績数量を検査実績ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> iaL = sumQtyByItmOrdNo(srchL, "INSP_ACT_NO",
					MSW_ITM_ORDER_R.$insp_act_qty);
			MCIndexKey iaKey = iaL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 品目オーダNO + 計算に使用する引数でグループ化し、品目オーダ単位に、 検査着手予定日の最小値と検査終了予定日の最大値を設定
			MCList<MSW_ITM_ORDER_R> aiL = instInspSchdDtByItmOrdNo(srchL);
			MCIndexKey aiKey = aiL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 集計した数値項目をwkLに設定
			for (MSW_ITM_ORDER_R r : wkL) {
				r.setBoolean("PO_SCHD_ABORT_FLG", setFlg(arrL, r.itm_ord_no(), "PO_SCHD_ABORT_FLG"));
				r.setBoolean("ALL_CMPL_FLG", setFlg(arrL, r.itm_ord_no(), "ALL_CMPL_FLG"));
				r.setBoolean("ARR_CMPL_FLG", setFlg(arrL, r.itm_ord_no(), "ARR_CMPL_FLG"));
				
				MSW_ITM_ORDER_R ps1R = psL1.getFirst(ps1Key, r.itm_ord_no());
				MSW_ITM_ORDER_R ps2R = psL2.getFirst(ps2Key, r.itm_ord_no());
				
				r.setNumberNE("WK_INST_QTY", ps1R.getNumberNE("WK_INST_QTY"));
				r.setNumberNE("WK_NOT_INST_QTY", ps2R.getNumberNE("WK_NOT_INST_QTY"));
				if (!r.blk_flg()) {
					MSW_ITM_ORDER_R pdR = pdL.getFirst(pdKey, r.itm_ord_no());
					MSW_ITM_ORDER_R aaR = aaL.getFirst(aaKey, r.itm_ord_no());
					MSW_ITM_ORDER_R paR = paL.getFirst(paKey, r.itm_ord_no());
					MSW_ITM_ORDER_R iaR = iaL.getFirst(iaKey, r.itm_ord_no());
					
					r.inst_yield_schd_qty(pdR.inst_yield_schd_qty());
					r.yield_act_qty(aaR.yield_act_qty());
					r.purc_act_qty(paR.purc_act_qty());
					r.insp_act_qty(iaR.insp_act_qty());
				}
				
				// 外注の場合、製造指図単位区分は「品目単位」固定
				r.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
				
				MSW_ITM_ORDER_R aiR = aiL.getFirst(aiKey, r.itm_ord_no());
				r.inst_insp_st_schd_dt(aiR.inst_insp_st_schd_dt());
				r.inst_insp_end_schd_dt(aiR.inst_insp_end_schd_dt());
			}
		}

		/** 移送オーダに紐づく指図や実績、検査情報を取得する */
		protected void srchXfrInstAct(MCList<MSW_ITM_ORDER_R> wkL) {
			//・未指図数量（NOT_INST_QTY）：
			//・ステータス(確定、指図・発注済、完了)：
			//・まとめフラグ：出荷予定から取得
			//
			//・出来高予定数量（指図・発注）：
			//・出庫予定日（指図）：
			//・格納完了予定日（指図・発注）：入荷進捗から取得
			//
			//・出来高実績数量（入荷・出来高）：
			//
			//・格納完了実績日：入荷実績から取得

			// wkLに一時カラムが追加されているため、cloneする
			MCList<MSW_ITM_ORDER_R> srchL = wkL.clone();
			executeQuery(srchL, MSBCL5010_MSW_ITM_ORDER_KEY_S04());
			
			// ＷＧ間移動のオーダを省く
			MCList<MSW_ITM_ORDER_R> tmpSrchL = MCList.create(MSW_ITM_ORDER_R.class);	
			for (MSW_ITM_ORDER_R r : srchL) {
				if (!isNull(r.getStringNE("GI_LG_GRP_CD")) && !isNull(r.getStringNE("GR_LG_GRP_CD"))) {
					if (isSame(r.getStringNE("GI_LG_GRP_CD"), r.getStringNE("GR_LG_GRP_CD"))) {
						continue;
					}
				}
				tmpSrchL.add(r);
			}
			srchL.setAll(tmpSrchL);
			if (srchL.isEmpty()) {
				return;
			}
			
			// 数値項目以外を品目オーダＮＯ単位に集計　※品目オーダの指図数、未指図数は品目オーダＮＯ単位での合計が不要のためMAX値を取得
			MCGroupByPolicy ioGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			ioGbp.min(MSW_ITM_ORDER_R.$itm_ord_sts_typ);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$not_inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$blk_flg);
			ioGbp.min("SHIP_SCHD_ABORT_FLG");
			ioGbp.min("SHIP_STS_TYP");
			ioGbp.max("ARR_STS_TYP");
			ioGbp.min("SHIP_CMPL_FLG");
			ioGbp.min("ARR_CMPL_FLG");
			ioGbp.max(MSW_ITM_ORDER_R.$inst_gi_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_strg_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$gi_act_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$strg_act_dt);

			wkL.clear();
			wkL.addAll(srchL.groupBy(ioGbp));
			
			// 指図数を出荷進捗ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> spL1 = sumQtyByItmOrdNo(srchL, "SHIP_PR_NO",
					"WK_INST_QTY");
			MCIndexKey sp1Key = spL1.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 未指図数を出荷進捗ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> spL2 = sumQtyByItmOrdNo(srchL, "SHIP_PR_NO",
					"WK_NOT_INST_QTY");
			MCIndexKey sp2Key = spL2.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			// 出来高予定数量を出荷進捗ＮＯ単位にグループ化し、品目オーダＮＯ単位に集計
			MCList<MSW_ITM_ORDER_R> spL = sumQtyByItmOrdNo(srchL, "SHIP_PR_NO",
					MSW_ITM_ORDER_R.$inst_yield_schd_qty);
			MCIndexKey spKey = spL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 出来高実績数量を入荷進捗ＮＯ単位にグループ化し、品目オーダ単位に集計
			MCList<MSW_ITM_ORDER_R> apL = sumQtyByItmOrdNo(srchL, "ARR_PR_NO",
					MSW_ITM_ORDER_R.$yield_act_qty);
			MCIndexKey apKey = apL.createIndex(MSW_ITM_ORDER_R.$itm_ord_no);
			
			// 集計した数値項目をwkLに設定
			for (MSW_ITM_ORDER_R r : wkL) {
				r.setBooleanNE("XFR_FLG", false);
				MSW_ITM_ORDER_R sp1R = spL1.getFirst(sp1Key, r.itm_ord_no());
				MSW_ITM_ORDER_R sp2R = spL2.getFirst(sp2Key, r.itm_ord_no());
				
				r.setNumberNE("WK_INST_QTY", sp1R.getNumberNE("WK_INST_QTY"));
				r.setNumberNE("WK_NOT_INST_QTY", sp2R.getNumberNE("WK_NOT_INST_QTY"));
				if (!r.blk_flg()) {
					MSW_ITM_ORDER_R spR = spL.getFirst(spKey, r.itm_ord_no());
					MSW_ITM_ORDER_R apR = apL.getFirst(apKey, r.itm_ord_no());
					
					r.inst_yield_schd_qty(spR.inst_yield_schd_qty());
					r.yield_act_qty(apR.yield_act_qty());
				}
			}
		}
		/** ＷＧ間移動オーダに紐づく指図や実績情報を取得する */
		protected void srchXfrInstAct2(MCList<MSW_ITM_ORDER_R> wkL) {
			//・未指図数量（NOT_INST_QTY）：
			//・ステータス(確定、指図・発注済、完了)：
			//・まとめフラグ：移動引当状況から取得
			//
			//・出来高予定数量：移動引当状況から取得
			//・出庫予定日：移動引当状況から取得
			//・格納完了予定日：移動引当状況から取得
			//
			//・出来高実績数量：移動引当状況から取得
			//
			//・格納完了実績日：移動引当状況から取得
			
			// wkLに一時カラムが追加されているため、cloneする
			MCList<MSW_ITM_ORDER_R> srchL = wkL.clone();
			executeQuery(srchL, MSBCL5010_MSW_ITM_ORDER_KEY_S05());
			
			if (srchL.isEmpty()) {
				return;
			}
			
			
			// 数値項目以外を品目オーダＮＯ単位に集計　※品目オーダの指図数、未指図数は品目オーダＮＯ単位での合計が不要のためMAX値を取得
			MCGroupByPolicy ioGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no, "ship_inst_typ");
			ioGbp.max(MSW_ITM_ORDER_R.$inst_qty);
			ioGbp.max(MSW_ITM_ORDER_R.$not_inst_qty);
			
			ioGbp.max(MSW_ITM_ORDER_R.$blk_flg);
			ioGbp.max(MSW_ITM_ORDER_R.$inst_gi_schd_dt);
			ioGbp.max(MSW_ITM_ORDER_R.$gi_act_dt);

			wkL.clear();
			wkL.addAll(srchL.groupBy(ioGbp));
			
			
			MCList<MSW_ITM_ORDER_R> grpL1 = srchL.groupBy(MSW_ITM_ORDER_R.$itm_ord_no, "cmpl_flg");
			MCIndexKey grpL1Key = grpL1.createIndex(MSW_ITM_ORDER_R.$itm_ord_no, "cmpl_flg");
			
			MCGroupByPolicy instPrGbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no, "pr_sts_typ");
			instPrGbp.sum("wk_trd_unit_qty");
			instPrGbp.sum("wk_act_qty");
			MCList<MSW_ITM_ORDER_R> grpL2 = srchL.groupBy(instPrGbp);
			MCIndexKey grpL2Key = grpL2.createIndex(MSW_ITM_ORDER_R.$itm_ord_no, "pr_sts_typ");

			MCList<MSW_ITM_ORDER_R> grpL3 = srchL.groupBy(MSW_ITM_ORDER_R.$itm_ord_no, "pr_sts_typ", "abort_flg");
			MCIndexKey grpL3Key = grpL3.createIndex(MSW_ITM_ORDER_R.$itm_ord_no, "pr_sts_typ", "abort_flg");
			
			MCList<MSW_ITM_ORDER_R> wkInstL = MCList.create(MSW_ITM_ORDER_R.class);
			MCList<MSW_ITM_ORDER_R> wkNotInstL =  MCList.create(MSW_ITM_ORDER_R.class);
			
			for (MSW_ITM_ORDER_R wkR : wkL) {
				// 移動ＦＬＧ
				wkR.setBooleanNE("XFR_FLG", true);
				
				MCList<MSW_ITM_ORDER_R> addwkInstL = grpL2.subList(grpL2Key, wkR.itm_ord_no());
				for(MSW_ITM_ORDER_R addwkInstLR : addwkInstL) {
					if(!MSC_PR_STS_TYP.isNOT_INST(addwkInstLR.getStringNE("pr_sts_typ"))){
						wkInstL.add(addwkInstLR);
					}else {
						wkNotInstL.add(addwkInstLR);
					}
				}
				
				// 出来高予定数量
				wkR.inst_yield_schd_qty(wkInstL.sum("wk_trd_unit_qty"));
				wkR.setNumberNE("WK_INST_QTY", wkInstL.sum("wk_trd_unit_qty"));
				
				// 未指図数量
				wkR.setNumberNE("WK_NOT_INST_QTY", wkNotInstL.sum("wk_trd_unit_qty"));
				
				// 移動移送予定に紐づく移動引当状況が全件完了している場合、完了
				if (isNull(grpL1.getFirst(grpL1Key, wkR.itm_ord_no(), "0"))) {
					wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				// 移動指図あり
				else if (!MAC_SHIP_INST_TYP.isNON(wkR.getStringNE("ship_inst_typ"))) {	
					// 移動移送予定に紐づく移動引当状況に未指図のレコードがない場合は、指図・発注済み
					if (isNull(grpL2.getFirst(grpL2Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.NOT_INST.value()))) {
						wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
						
					}
					// 移動移送予定に紐づく移動引当状況に未指図以外（指図済・一部完了・完了）のレコードが存在する場合
					else if (!isNull(grpL2.getFirst(grpL2Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.INST.value()))
								|| !isNull(grpL2.getFirst(grpL2Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.PART_COMP.value()))
								|| !isNull(grpL2.getFirst(grpL2Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.COMP.value()))
							) {
						// 打切り以外のレコードが全件未指図の場合、確定
						if (isNull(grpL3.getFirst(grpL3Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.INST.value(), "0"))
								&& isNull(grpL3.getFirst(grpL3Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.PART_COMP.value(), "0"))
								&& isNull(grpL3.getFirst(grpL3Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.COMP.value(), "0"))
								) {
							wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
						}	
						// 未指図のレコードがある場合は、一部指図・発注済み
						else if (!isNull(grpL3.getFirst(grpL3Key, wkR.itm_ord_no(), MSC_PR_STS_TYP.NOT_INST.value(), "0"))) {
							wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
							
						}
						// それ以外は指図・発注済み
						else {
							wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
						}
					}
					// 上記以外は、確定
					else {
						wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
					}
				}
				// 上記以外は、確定
				else {
					wkR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				}

				//　格納完了予定日
				wkR.inst_strg_schd_dt(wkR.inst_gi_schd_dt());
				
				// 納品数量
				MCList<MSW_ITM_ORDER_R> wkActL = grpL2.subList(grpL2Key, wkR.itm_ord_no());
				wkR.yield_act_qty(wkActL.sum("wk_act_qty"));
				
				//　格納完了実績日 
				wkR.strg_act_dt(wkR.gi_act_dt());
				
			}
		}

		/** 製造オーダのステータス、数量、日付項目を設定する */
		protected MCList<MSW_ITM_ORDER_R> setMfgPr(MCList<MSW_ITM_ORDER_R> l) {
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			String tmpCalCdMfg = "tmp_cal_cd_mfg";
			l.addStringColumn(tmpCalCdMfg);
			for(MSW_ITM_ORDER_R r: l) {
				String mfgSts = r.getStringNE("MFG_STS_TYP");
				String inspSts = r.getStringNE("INSP_STS_TYP");
				boolean inspBlk = r.getBooleanNE("INSP_BLK_FLG");
				String mfgCal = r.getStringNE("MFG_CAL_CD");
				// 同一品目オーダ内に、工程オーダのステータスが確定以前のデータが存在しているかを判別するフラグ
				// (true：未確定、保存、確定の工程が存在する、false：未確定、保存、確定の工程が存在しない)
				boolean operOrdStsTypFlg = r.getBooleanNE("OPER_ORD_STS_TYP_FIX_FLG");

				// ステータス
				if(MSC_MFG_STS_TYP.isCMPL(mfgSts)
						&& (!operOrdStsTypFlg)
						&& r.not_inst_qty().isZero()
						&& (isNull(inspSts) || MSC_INSP_STS_TYP.isJDG(inspSts))){
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if(r.not_inst_qty().lte(MCNumber.ZERO)) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
				}
				else if(!isNull(mfgSts)){
					// ステータス 指図保存も指図済みとして扱う
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
				}
				else if(isNull(mfgSts)
						&& (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ()))) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				}

				// 製造指図単位区分
				if(isNull(mfgSts) && !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ())){
					r.setStringNE("mfg_inst_unit_typ", null);
				}				

				// 検査実績数
				// 検査対象外の場合はnullを設定（検査実績数に0が設定されていると品目オーダ進捗一覧照会で仕入進捗率の算出に使用されてしまうため）
				if (isNull(inspSts)) {
					r.insp_act_qty(null);
				}

				// 各日付の調整
				// 完了
				if (MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					// 調整不要
				}
				// 製造完了、かつ完了でない
				else if (MSC_MFG_STS_TYP.isCMPL(mfgSts)
						&& r.not_inst_qty().isZero()
						&& !MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					r.insp_end_act_dt(null);
				}
				// 指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					r.mfg_end_act_dt(null);
					r.insp_end_act_dt(null);
				}
				// 一部指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ())) {
					r.inst_mfg_end_schd_dt(null);
					r.mfg_end_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				// 確定以下
				else {
					r.inst_mfg_st_schd_dt(null);
					r.mfg_st_act_dt(null);
					r.inst_mfg_end_schd_dt(null);
					r.mfg_end_act_dt(null);
					r.inst_insp_st_schd_dt(null);
					r.insp_st_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				
				// 検査対象外、検査まとめを考慮した設定
				if(isNull(inspSts) || inspBlk) {
					r.insp_act_qty(null);
					r.insp_end_act_dt(null);
				}

				// ＬＴ取得用カレンダＣＤの設定
				r.setStringNE(tmpCalCdMfg, nvl(mfgCal, _stdCal));
				updWkL.add(r);
			}
			
			// 製造ＬＴ（実績）取得
			String mfgLt = "mfg_lt";
			execCalDaysBatch(mfgLt, updWkL, MSW_ITM_ORDER_R.$mfg_st_act_dt, MSW_ITM_ORDER_R.$mfg_end_act_dt, tmpCalCdMfg);
			for (MSW_ITM_ORDER_R r: updWkL) {
				String mfgSts = r.getStringNE("MFG_STS_TYP");
				// 製造ＬＴ（実績）設定
				if(MSC_MFG_STS_TYP.isCMPL(mfgSts)
						&& !isNullOr(r.mfg_st_act_dt(), r.mfg_end_act_dt())){
					MCNumber days = r.getNumberNE(mfgLt);
					r.mfg_lt(days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1));
				}
				else {
					r.mfg_lt(null);
				}
			}
			
			return updWkL;
		}

		/** 購買オーダのステータス、数量、日付項目を設定する */
		protected MCList<MSW_ITM_ORDER_R> setPurcPr(MCList<MSW_ITM_ORDER_R> l) {
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			String tmpCalCdSppl = "tmp_cal_cd_sppl";
			l.addStringColumn(tmpCalCdSppl);
			for(MSW_ITM_ORDER_R r: l) {
				String arrSts = r.getStringNE("ARR_STS_TYP");
				String inspSts = r.getStringNE("INSP_STS_TYP");
				boolean schdAbort = r.getBooleanNE("PO_SCHD_ABORT_FLG");
				boolean cmpl = r.getBooleanNE("ALL_CMPL_FLG"); // 品目オーダに紐づくすべてのレコードが入荷・仕入完了、または打切となっている場合はオン
				boolean arrCmpl = r.getBooleanNE("ARR_CMPL_FLG");
				boolean inspBlk = r.getBooleanNE("INSP_BLK_FLG");
				String spplCal = r.getStringNE("SPPL_CAL_CD");

				// ステータス
				if (cmpl && !schdAbort && (isNull(inspSts) || MSC_INSP_STS_TYP.isJDG(inspSts))) {
					// 完了状態で入荷・仕入完了のレコードが存在し、検査対象外または検査完了の場合は完了
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if (cmpl && schdAbort) {
					// 完了状態で発注予定がすべて打ち切られている場合は完了
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if(r.getNumberNE("WK_NOT_INST_QTY").lte(MCNumber.ZERO)) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
				}
				else if(!isNull(arrSts)){
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
				}
				else if(isNull(arrSts)
						&& (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ()))) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				}

				// 各日付の調整
				// 完了
				if (MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					// 調整不要
				}
				// 入荷、かつ完了でない
				else if (arrCmpl && !MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					r.accpt_act_dt(null);
					r.insp_end_act_dt(null);
				}
				// 指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					r.strg_act_dt(null);
					r.accpt_act_dt(null);
					r.insp_end_act_dt(null);
				}
				// 一部指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ())) {
					r.po_dt(null);
					r.inst_strg_schd_dt(null);
					r.strg_act_dt(null);
					r.inst_accpt_schd_dt(null);
					r.accpt_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				// 確定以下
				else {
					r.po_dt(null);
					r.inst_strg_schd_dt(null);
					r.strg_act_dt(null);
					r.inst_accpt_schd_dt(null);
					r.accpt_act_dt(null);
					r.inst_insp_st_schd_dt(null);
					r.insp_st_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				
				// 検査対象外、検査まとめを考慮した設定
				if(isNull(inspSts) || inspBlk) {
					r.insp_act_qty(null);
					r.insp_end_act_dt(null);
				}
				
				// ＬＴ取得用カレンダＣＤの設定
				r.setStringNE(tmpCalCdSppl, nvl(spplCal, _stdCal));
				
				updWkL.add(r);
			}
			
			// 購入ＬＴ（実績）取得
			String purcLt = "purc_lt";
			execCalDaysBatch(purcLt, updWkL, MSW_ITM_ORDER_R.$po_dt, MSW_ITM_ORDER_R.$strg_act_dt, tmpCalCdSppl);
			for(MSW_ITM_ORDER_R r: updWkL) {
				boolean arrCmpl = r.getBooleanNE("ARR_CMPL_FLG");
				// 購入ＬＴ（実績）設定
				if(arrCmpl && !isNullOr(r.po_dt(), r.strg_act_dt())) {
					MCNumber days = r.getNumberNE(purcLt);
					r.purc_lt(days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1));
				}
				else {
					r.purc_lt(null);
				}
			}
			return updWkL;
		}

		/** 外注オーダのステータス、数量、日付項目を設定する */
		protected MCList<MSW_ITM_ORDER_R> setOutSrcPr(MCList<MSW_ITM_ORDER_R> l) {
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			String tmpCalCdSppl = "tmp_cal_cd_sppl";
			String tmpCalCdMfg = "tmp_cal_cd_mfg";
			l.addStringColumn(tmpCalCdSppl);
			l.addStringColumn(tmpCalCdMfg);
			for(MSW_ITM_ORDER_R r: l) {
				String arrSts = r.getStringNE("ARR_STS_TYP");
				String mfgSts = r.getStringNE("MFG_STS_TYP");
				boolean schdAbort = r.getBooleanNE("PO_SCHD_ABORT_FLG");
				boolean cmpl = r.getBooleanNE("ALL_CMPL_FLG"); // 品目オーダに紐づくすべてのレコードが入荷・仕入完了、または打切となっている場合はオン
				boolean arrCmpl = r.getBooleanNE("ARR_CMPL_FLG");
				String inspSts = r.getStringNE("INSP_STS_TYP");
				boolean inspBlk = r.getBooleanNE("INSP_BLK_FLG");
				String spplCal = r.getStringNE("SPPL_CAL_CD");
				String mfgCal = r.getStringNE("MFG_CAL_CD");

				// ステータス
				if (cmpl && !schdAbort && (isNull(inspSts) || MSC_INSP_STS_TYP.isJDG(inspSts))) {
					// 完了状態で入荷・仕入完了のレコードが存在し、検査対象外または検査完了の場合は完了
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if (cmpl && schdAbort) {
					// 完了状態で発注予定がすべて打ち切られている場合は完了
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if(r.getNumberNE("WK_NOT_INST_QTY").lte(MCNumber.ZERO)) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
				}
				else if(!isNull(arrSts) || !isNull(mfgSts)){
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
				}
				else if(isNull(arrSts) && isNull(mfgSts)
						&& (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ()))) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				}

				// 製造指図単位区分
				if(isNull(mfgSts) && !MSC_ORD_GNRT_TYP.isUPLND(r.ord_gnrt_typ())){
					r.setStringNE("mfg_inst_unit_typ", null);
				}


				// 各日付の調整
				// 完了
				if (MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					// 調整不要
				}
				// 入荷、かつ完了でない
				else if (arrCmpl && !MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					r.accpt_act_dt(null);
					r.insp_end_act_dt(null);
				}
				// 指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					r.mfg_end_act_dt(null);
					r.strg_act_dt(null);
					r.accpt_act_dt(null);
					r.insp_end_act_dt(null);
				}
				// 一部指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ())) {
					r.po_dt(null);
					r.inst_mfg_end_schd_dt(null);
					r.mfg_end_act_dt(null);
					r.inst_strg_schd_dt(null);
					r.strg_act_dt(null);
					r.inst_accpt_schd_dt(null);
					r.accpt_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				// 確定以下
				else {
					r.po_dt(null);
					r.inst_mfg_st_schd_dt(null);
					r.mfg_st_act_dt(null);
					r.inst_mfg_end_schd_dt(null);
					r.mfg_end_act_dt(null);
					r.inst_strg_schd_dt(null);
					r.strg_act_dt(null);
					r.inst_accpt_schd_dt(null);
					r.accpt_act_dt(null);
					r.inst_insp_st_schd_dt(null);
					r.insp_st_act_dt(null);
					r.inst_insp_end_schd_dt(null);
					r.insp_end_act_dt(null);
				}
				
				// 検査対象外、検査まとめを考慮した設定
				if(isNull(inspSts) || inspBlk) {
					r.insp_act_qty(null);
					r.insp_end_act_dt(null);
				}
				
				// ＬＴ取得用カレンダＣＤの設定
				l.setStringNE(tmpCalCdSppl, nvl(spplCal, _stdCal));
				l.setStringNE(tmpCalCdMfg, nvl(mfgCal, _stdCal));
				
				updWkL.add(r);
			}
			
			// 購入ＬＴ（実績）取得
			String purcLt = "purc_lt";
			execCalDaysBatch(purcLt, updWkL, MSW_ITM_ORDER_R.$po_dt, MSW_ITM_ORDER_R.$strg_act_dt, tmpCalCdSppl);
			// 製造ＬＴ（実績）取得
			String mfgLt = "mfg_lt";
			execCalDaysBatch(mfgLt, updWkL, MSW_ITM_ORDER_R.$mfg_st_act_dt, MSW_ITM_ORDER_R.$mfg_end_act_dt, tmpCalCdMfg);
			
			for(MSW_ITM_ORDER_R r: l) {
				boolean arrCmpl = r.getBooleanNE("ARR_CMPL_FLG");
				String mfgSts = r.getStringNE("MFG_STS_TYP");
				// 購入ＬＴ（実績）設定
				if(arrCmpl && !isNullOr(r.po_dt(), r.strg_act_dt())) {
					MCNumber days = r.getNumberNE(purcLt);
					r.purc_lt(days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1));
				}
				else {
					r.purc_lt(null);
				}

				// 製造ＬＴ（実績）設定
				if(MSC_MFG_STS_TYP.isCMPL(mfgSts)
						&& !isNullOr(r.mfg_st_act_dt(), r.mfg_end_act_dt())){
					MCNumber days = r.getNumberNE(mfgLt);
					r.mfg_lt(days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1));
				}
				else {
					r.mfg_lt(null);
				}
			}
			return updWkL;
		}

		/** 移送オーダのステータス、数量、日付項目を設定する */
		protected MCList<MSW_ITM_ORDER_R> setXfrPr(MCList<MSW_ITM_ORDER_R> l) {
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			for(MSW_ITM_ORDER_R r: l.subList("XFR_FLG", false)) {
				String shipSts = r.getStringNE("SHIP_STS_TYP");
				String arrSts = r.getStringNE("ARR_STS_TYP");
				boolean arrCmpl = r.getBooleanNE("ARR_CMPL_FLG");
				boolean shipCmpl = r.getBooleanNE("SHIP_CMPL_FLG");
				boolean schdAbort = r.getBooleanNE("SHIP_SCHD_ABORT_FLG");

				// ステータス
				// 出荷済かつ入荷済
				if(arrCmpl && shipCmpl){
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				else if (schdAbort) {
					// 出荷予定がすべて打ち切られている場合は完了
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				}
				// 指図残なし、または出荷済
				else if(r.getNumberNE("WK_NOT_INST_QTY").lte(MCNumber.ZERO) || shipCmpl) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.INST.value());
				}
				// 指図数＞０
				else if(r.getNumberNE("WK_INST_QTY").gt(MCNumber.ZERO)){
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
				}
				else if (r.getNumberNE("WK_INST_QTY").eq(MCNumber.ZERO)) {
					// ピッキングありで取り消し
					if (MSC_PR_STS_TYP.isNOT_INST(r.getString("SHIP_STS_TYP"))) {
						r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
					}
					else {
						MCList<MST_SHIP_ACT_D_R> dbcL = MCList.create(MST_SHIP_ACT_D_R.class);
						MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
						MCQueryApiBuilder dbcL_builder = MCQueryApiBuilder.create(t);
						dbcL_builder.setSelect(t.trd_unit_qty);
						dbcL_builder.setWhere(t.io_schd_pr_no.eq(bind("1")), r.itm_ord_no());
						dbcL_builder.addWhereWithAnd(t.can_flg.eq(value(false)));
						dbSelect("MSBCL5010_MST_SHIP_ACT_D_S01", dbcL, dbcL_builder);

						// 対象外で一部出荷済
						if (!dbcL.isEmpty() && dbcL.sum(MST_SHIP_ACT_D_R.$trd_unit_qty).lte(r.getNumberNE("WK_NOT_INST_QTY"))) {
							r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.PART_INST.value());
						}
						// 対象外で取り消し
						else if (dbcL.isEmpty() && MSC_PR_STS_TYP.isNOT_SHIP(r.getString("SHIP_STS_TYP"))) {
							r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
						}
					}
				}
				else if((MSC_PR_STS_TYP.isNOT_INST(shipSts) || MSC_PR_STS_TYP.isNOT_SHIP(shipSts))
						&& (MSC_ITM_ORD_STS_TYP.isPART_INST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ()))) {
					r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				}

				// 各日付の調整
				// 入荷（完了含む）
				if (MSC_PR_STS_TYP.isARR(arrSts)) {
					// 調整不要
				}
				// 指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					r.gi_act_dt(null);
					r.strg_act_dt(null);
				}
				// 一部指図・発注済以下
				else {
					r.inst_gi_schd_dt(null);
					r.inst_strg_schd_dt(null);
					r.gi_act_dt(null);
					r.strg_act_dt(null);
				}

				updWkL.add(r);
			}
			// 移動
			for(MSW_ITM_ORDER_R r: l.subList("XFR_FLG", true)) {
				// 各日付の調整
				// 入荷（完了含む）
				if (MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					// 調整不要
				}
				// 指図・発注済
				else if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					r.gi_act_dt(null);
					r.strg_act_dt(null);
				}
				// 一部指図・発注済以下
				else {
					r.inst_gi_schd_dt(null);
					r.inst_strg_schd_dt(null);
					r.gi_act_dt(null);
					r.strg_act_dt(null);
				}

				updWkL.add(r);
			}
			return updWkL;
		}

		/** 打切時のステータスを設定する */
		protected MCList<MSW_ITM_ORDER_R> setAbortPr(MCList<MSW_ITM_ORDER_R> l) {
			MCList<MSW_ITM_ORDER_R> updWkL = MCList.create(MSW_ITM_ORDER_R.class);
			for(MSW_ITM_ORDER_R r: l) {
				r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.CMPL.value());
				updWkL.add(r);
			}
			return updWkL;
		}

		/** ワークテーブル（キー項目テーブル）に挿入する */
		protected void setKeyWk(MCList<Ord_Upd04_DtlR> l) {
			MCList<MST_ITM_ORDER_R> dbcL = MCList.create(MST_ITM_ORDER_R.class);
			for(Ord_Upd04_DtlR r: l) {
				MST_ITM_ORDER_R dbcR = MST_ITM_ORDER_R.create();
				dbcR.itm_ord_no(r.itm_ord_no());
				dbcL.add(dbcR);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
			dbWkDelete("MSBCL5010_MSW_ITM_ORDER_D01", dbcL_bldr.getBaseDbc());
			if(!dbcL.isEmpty()) {
				dbWkInsert("MSBCL5010_MSW_ITM_ORDER_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 品目オーダNO + 計算に使用する引数でグループ化し、計算する<br>
		 * 計算後は、品目オーダ単位に、 検査着手予定日の最小値と検査終了予定日の最大値を設定する
		 * 
		 * @param srchL
		 * @return
		 */
		protected MCList<MSW_ITM_ORDER_R> instInspSchdDtByItmOrdNo(MCList<MSW_ITM_ORDER_R> srchL){
			MCList<MSW_ITM_ORDER_R> gbKeyL =  MCList.create(MSW_ITM_ORDER_R.class);
			for (MSW_ITM_ORDER_R srchGrpR : srchL.groupBy(MSW_ITM_ORDER_R.$itm_ord_no, MST_ARR_PR_R.$arr_schd_tm, 
					MST_ARR_SCHD_R.$arr_loc_cd, "ARR_SCHD_NO")) {
				String arrSchdNo = srchGrpR.getStringNE("ARR_SCHD_NO");
				if(!isNull(arrSchdNo)){
					MCList<MSW_ITM_ORDER_R> srchSubL = srchL.subList("SRC_NO3", arrSchdNo);
					if(!srchSubL.isEmpty()) {
						MSW_ITM_ORDER_R srchSubR = srchSubL.get(0);
						srchGrpR.insp_lt(srchSubR.insp_lt());
						srchGrpR.insp_offst(srchSubR.insp_offst());
					}
				}
				gbKeyL.add(srchGrpR);
			}
			setInstInspSchdDt(gbKeyL);
			
			MCGroupByPolicy gbp = new MCGroupByPolicy(MSW_ITM_ORDER_R.$itm_ord_no);
			gbp.min(MSW_ITM_ORDER_R.$inst_insp_st_schd_dt);
			gbp.max(MSW_ITM_ORDER_R.$inst_insp_end_schd_dt);
			return gbKeyL.groupBy(gbp);
		}
		
		/**
		 * 検査予定日に、休日を考慮したリードタイム計算日付を設定する
		 * 
		 * @param gbKeyL
		 */
		protected void setInstInspSchdDt(MCList<MSW_ITM_ORDER_R> gbKeyL){
			for(MSW_ITM_ORDER_R r : gbKeyL) {
				MCNumber inspLt = r.insp_lt();
				String arrLocCd = r.getStringNE("ARR_LOC_CD");
				if (!isNull(inspLt) && !isNull(arrLocCd)) {
					MCDate base_dt = MCDate.valueOf(r.getStringNE("ARR_SCHD_TM"), "yyyy-MM-dd").trunc(MCDateFieldType.DAY);
					MCNumber lt = r.insp_offst().multiply(-1);
					r.inst_insp_st_schd_dt(getCalDateLoc(base_dt, lt, true, arrLocCd, false));
					r.inst_insp_end_schd_dt(getCalDateLoc(r.inst_insp_st_schd_dt(), inspLt, true, arrLocCd, false));
				}
			}
		}
		
		protected boolean setFlg( MCList<MSW_ITM_ORDER_R> l, String itmOrdNo, String flgName) {
			if(l.isEmpty()) {
				return false;
			}
			MCList<MSW_ITM_ORDER_R> subL = l.subList(MSW_ITM_ORDER_R.$itm_ord_no, itmOrdNo);
			if(subL.isEmpty()) {
				return false;
			}
			for(MSW_ITM_ORDER_R subR : subL) {
				if(!subR.getBoolean(flgName)) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * Ord_Upd05オペレーション.<p>
	 *
	 * 工程オーダ実績項目更新サービス</br>
	 */
	public class Ord_Upd05 extends MSBCL_OrdRegService_MC_A.Ord_Upd05 {
		protected String _stdCal = getCo().std_cal_cd();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// キーワークテーブル作成
			setKeyWk();

			// 工程オーダロック取得
			getLockOperOrder();

			// ステータス、日付、数量項目更新
			updateOperOrder();
		}

		/** 上り電文を編集する */
		protected void editUp() {
			// N/A
		}

		/** 更新対象工程オーダのロックを取得する */
		protected void getLockOperOrder() {
			executeQuery((MCList<? extends MCRow>)null, MSBCL5010_MST_OPER_ORDER_S01());
		}

		/** 指図や実績からステータス、日付、数量項目を品目オーダに反映する */
		protected void updateOperOrder() {

			// 指図実績取得
			MCList<MSW_OPER_ORDER_R> instActWkL = srchInstAct();
			if(instActWkL.isEmpty()) {
				return;
			}

			// ステータス、数量、日付項目設定
			setOperPr(instActWkL);

			// 工程オーダ反映用ワークテーブル作成
			MSW_OPER_ORDER_R S0 = MSW_OPER_ORDER_R.create();
			execDbWkDelete("MSBCL5010_MSW_OPER_ORDER_D03", S0);
			MCQueryApiBuilder instActWkL_bldr = MCQueryApiBuilder.create(MSW_OPER_ORDER_R.create("T"));
			dbInsertEx("MSBCL5010_MSW_OPER_ORDER_I03", instActWkL, instActWkL_bldr);

			// ステータス、日付、数量項目をワークテーブルから工程オーダに一括反映
			executeUpdate(MSBCL5010_MST_OPER_ORDER_U01());
		}

		/** 工程オーダに紐づく指図や実績を取得する */
		protected MCList<MSW_OPER_ORDER_R> srchInstAct() {
			MCList<MSW_OPER_ORDER_R> wkL = MCList.create(MSW_OPER_ORDER_R.class);
			wkL.addStringColumn("MFG_STS_TYP");		// 最遅製造状況区分
			wkL.addStringColumn("MFG_CAL_CD");		// 製造場所カレンダ
			wkL.addStringColumn("MAX_MFG_STS_TYP");		// 最早工程オーダ状況区分
			executeQuery(wkL, MSBCL5010_MSW_OPER_ORDER_KEY_S01());
			return wkL;
		}

		
		/** 工程オーダのステータス、数量、日付項目を設定する */
		protected void setOperPr(MCList<MSW_OPER_ORDER_R> instActWkL) {
			String tmpCalCdMfg = "tmp_cal_cd_mfg";
			instActWkL.addStringColumn(tmpCalCdMfg);
			for (MSW_OPER_ORDER_R r : instActWkL) {
				String operSts = r.getStringNE("MFG_STS_TYP");
				String maxOperSts = r.getStringNE("MAX_MFG_STS_TYP");

				// 工程オーダ状況区分
				if(MSC_MFG_STS_TYP.isCMPL(operSts)
						&& !nvl(r.not_oper_schd_qty(), MCNumber.ZERO).gt(0)){
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.CMPL.value());
				}
				else if(isNull(operSts) 
						&& (MSC_ITM_ORD_STS_TYP.isINST(r. itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isCMPL(r. itm_ord_sts_typ()))) {
					// 品目オーダが指図済または完了にもかかわらず工程指図が存在しない場合は、指図されなかった工程とみなし、工程オーダを完了にする
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.CMPL.value());
				}
				// 一部指図以降の指図がある
				else if(MSC_MFG_STS_TYP.isSAV(maxOperSts) || MSC_MFG_STS_TYP.isSTT(maxOperSts)
						|| MSC_MFG_STS_TYP.isORD(maxOperSts) || MSC_MFG_STS_TYP.isCMPL(maxOperSts)){
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
					if(nvl(r.not_oper_schd_qty(), MCNumber.ZERO).gt(0)){
						r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.PART_INST.value());
					}
					else {
						r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.INST.value());
					}
				}
				else {
					r.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.FIX.value());
				}

				// 各日付項目の調整
				if(MSC_OPER_ORD_STS_TYP.isCMPL(r.oper_ord_sts_typ())) {
					// 調整不要
				}
				// 指図済
				else if(MSC_OPER_ORD_STS_TYP.isINST(r.oper_ord_sts_typ())) {
					r.act_end_tm(null);
				}
				// 一部指図済
				else if(MSC_OPER_ORD_STS_TYP.isPART_INST(r.oper_ord_sts_typ())) {
					r.inst_end_schd_tm(null);
					r.act_end_tm(null);
				}
				// 確定
				else {
					r.inst_st_schd_tm(null);
					r.inst_end_schd_tm(null);
					r.act_end_tm(null);
				}
				
				// ＬＴ取得用カレンダＣＤの設定
				r.setStringNE(tmpCalCdMfg, nvl(r.getStringNE("MFG_CAL_CD"), _stdCal));
			}
			
			// 工程ＬＴ（実績）取得
			String operLt = "oper_lt";
			execCalDaysBatch(operLt, instActWkL, MSW_OPER_ORDER_R.$act_st_tm, MSW_OPER_ORDER_R.$act_end_tm, tmpCalCdMfg);
			for (MSW_OPER_ORDER_R r : instActWkL) {
				// 工程ＬＴ（実績）
				if(MSC_MFG_STS_TYP.isCMPL(r.oper_ord_sts_typ())
						&& !isNullOr(r.act_st_tm(), r.act_end_tm())) {
					MCNumber days = r.getNumberNE(operLt);
					r.oper_lt(days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1));
				}
				else {
					r.oper_lt(null);
				}
			}
		}

		/** キー項目ワークテーブルを作成する */
		protected void setKeyWk() {
			MCList<MST_ITM_ORDER_R> dbcL = MCList.create(MST_ITM_ORDER_R.class);
			for(Ord_Upd05_DtlR r: up0().groupBy(Ord_Upd05_DtlR.$itm_ord_no)) {
				MST_ITM_ORDER_R dbcR = MST_ITM_ORDER_R.create();
				dbcR.itm_ord_no(r.itm_ord_no());
				dbcL.add(dbcR);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
			dbWkDelete("MSBCL5010_MSW_ITM_ORDER_D02", dbcL_bldr.getBaseDbc());
			if(!dbcL.isEmpty()) {
				dbWkInsert("MSBCL5010_MSW_ITM_ORDER_I02", dbcL, dbcL_bldr.getBaseDbc());
			}
		}
	}

	/**
	 * Ord_Imp01オペレーション.<p>
	 *
	 * オーダ取込サービス</br>
	 */
	public class Ord_Imp01 extends MSBCL_OrdRegService_MC_A.Ord_Imp01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callOrdRegSprtAndChkSrv();

			setDown();

		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setNullVal();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		protected void callOrdRegSprtAndChkSrv() {

			MSBCL_OrdRegService.Ord_Sprt04 sprt = MSBCL_OrdRegService.crtOrd_Sprt04();
			addAll(sprt.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Ord_Imp01_DtlR());
			sprt.exec();
			
			// 入力支援サービスで補完された属性情報をコピー
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk1 = up0().join(Ord_Imp01_DtlR.$peg_no, sprt.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk1, createMap_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R1());

			MSBCL_OrdRegService.Ord_Chk01 chk = MSBCL_OrdRegService.crtOrd_Chk01();
			chk.up0().setAll(sprt.down0());
			chk.exec();

			copyErrFlg(up0(), chk.down0());
			// チェック後済みの情報をコピー
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk2 = up0().join(Ord_Imp01_DtlR.$peg_no, chk.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk2, createMap_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R2());
		}

		/**
		 * 上り電文がNULLだった場合にＮＵＬＬ文字を設定する
		 */
		protected void setNullVal() {
			for (Ord_Imp01_DtlR row : up0()) {
				if (isNull(row.itm_sub1())) {
					row.itm_sub1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.itm_sub2())) {
					row.itm_sub2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.itm_sub3())) {
					row.itm_sub3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.mfg_loc_cd())) {
					row.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.sppl_cd())) {
					row.sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.maker_cd())) {
					row.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.rqst_loc_cd())) {
					row.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.sno1())) {
					row.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.sno2())) {
					row.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.sno3())) {
					row.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(row.sno4())) {
					row.sno4(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/** Ord_Imp01_DtlR → Ord_Upd01_Dtl1R (Ord_Imp01 → Ord_Sprt04) */
		protected Map_Ord_Upd01_Dtl1R_Ord_Imp01_DtlR<Ord_Upd01_Dtl1R, Ord_Imp01_DtlR> createMap_Ord_Upd01_Dtl1R_Ord_Imp01_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Imp01_DtlR<Ord_Upd01_Dtl1R, Ord_Imp01_DtlR>();
		}

		/** Ord_Imp01_DtlR → Ord_Upd01_Dtl1R (Ord_Imp01 → Ord_Sprt04) */
		public class Map_Ord_Upd01_Dtl1R_Ord_Imp01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Ord_Imp01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Ord_Imp01_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Ord_Imp01_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Ord_Imp01_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Ord_Imp01_DtlR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Ord_Imp01_DtlR.$ord_gnrt_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Ord_Imp01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Ord_Imp01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Ord_Imp01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Ord_Imp01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Ord_Imp01_DtlR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Ord_Imp01_DtlR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Ord_Imp01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Ord_Imp01_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Ord_Imp01_DtlR.$maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Ord_Imp01_DtlR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Ord_Imp01_DtlR.$rqst_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Ord_Imp01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Ord_Imp01_DtlR.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Ord_Imp01_DtlR.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Ord_Imp01_DtlR.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, Ord_Imp01_DtlR.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Ord_Imp01_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt,Ord_Imp01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt,Ord_Imp01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, Ord_Imp01_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt,	Ord_Imp01_DtlR.$strg_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt,Ord_Imp01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt,	Ord_Imp01_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt,	Ord_Imp01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt,Ord_Imp01_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Ord_Imp01_DtlR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Ord_Imp01_DtlR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Ord_Imp01_DtlR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Ord_Imp01_DtlR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Ord_Imp01_DtlR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Ord_Imp01_DtlR.$itm_ord_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.oper_ord_pr_flg(src.getBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg));
				dest.io_schd_pr_flg(src.getBooleanNE(Ord_Upd01_Dtl1R.$io_schd_pr_flg));
			}
		}

		/** Ord_Upd01_Dtl1R → Ord_Imp01_DtlR (Ord_Chk01 → Ord_Imp01) */		
		protected Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R1<Ord_Imp01_DtlR,Ord_Upd01_Dtl1R> createMap_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R1() {
			return new Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R1<Ord_Imp01_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → Ord_Imp01_DtlR (Ord_Chk01 → Ord_Imp01) */		
		public class Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R1<D extends Ord_Imp01_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_nm, Ord_Upd01_Dtl1R.$itm_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_nm, Ord_Upd01_Dtl1R.$unit_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$cont_fctr_flg, Ord_Upd01_Dtl1R.$cont_fctr_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$cont_fctr_unit_cd, Ord_Upd01_Dtl1R.$cont_fctr_unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$cont_fctr_unit_nm, Ord_Upd01_Dtl1R.$cont_fctr_unit_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$std_cont_fctr, Ord_Upd01_Dtl1R.$std_cont_fctr);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_site_cd, Ord_Upd01_Dtl1R.$strg_site_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_site_nm, Ord_Upd01_Dtl1R.$strg_site_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_grp_cd, Ord_Upd01_Dtl1R.$strg_loc_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_grp_nm, Ord_Upd01_Dtl1R.$strg_loc_grp_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_nm, Ord_Upd01_Dtl1R.$strg_lg_grp_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_alloc_grp_cd, Ord_Upd01_Dtl1R.$strg_alloc_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_alloc_grp_nm, Ord_Upd01_Dtl1R.$strg_alloc_grp_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_nm, Ord_Upd01_Dtl1R.$strg_loc_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_site_cd, Ord_Upd01_Dtl1R.$mfg_site_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_site_nm, Ord_Upd01_Dtl1R.$mfg_site_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_grp_cd, Ord_Upd01_Dtl1R.$mfg_loc_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_grp_nm, Ord_Upd01_Dtl1R.$mfg_loc_grp_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_nm, Ord_Upd01_Dtl1R.$mfg_loc_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_nm, Ord_Upd01_Dtl1R.$sppl_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_nm, Ord_Upd01_Dtl1R.$maker_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_site_cd, Ord_Upd01_Dtl1R.$rqst_site_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_site_nm, Ord_Upd01_Dtl1R.$rqst_site_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_grp_cd, Ord_Upd01_Dtl1R.$rqst_loc_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_grp_nm, Ord_Upd01_Dtl1R.$rqst_loc_grp_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_nm, Ord_Upd01_Dtl1R.$rqst_loc_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_nm, Ord_Upd01_Dtl1R.$rqst_wg_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$wg_nm, Ord_Upd01_Dtl1R.$wg_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$cont_fctr_inst_qty, Ord_Upd01_Dtl1R.$cont_fctr_inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$cont_fctr_schd_yield, Ord_Upd01_Dtl1R.$cont_fctr_schd_yield);
				addColumnPathMap(Ord_Upd01_Dtl1R.$wrk_no, Ord_Upd01_Dtl1R.$wrk_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$wrk_nm, Ord_Upd01_Dtl1R.$wrk_nm);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_typ, Ord_Upd01_Dtl1R.$itm_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_typ_d_cd, Ord_Upd01_Dtl1R.$itm_typ_d_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_typ_d_nm, Ord_Upd01_Dtl1R.$itm_typ_d_nm);
			}
		}
	}

	/** Ord_Upd01_Dtl1R → Ord_Imp01_DtlR (Ord_Chk01 → Ord_Imp01) */		
	protected Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R2<Ord_Imp01_DtlR,Ord_Upd01_Dtl1R> createMap_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R2() {
		return new Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R2<Ord_Imp01_DtlR, Ord_Upd01_Dtl1R>();
	}

	/** Ord_Upd01_Dtl1R → Ord_Imp01_DtlR (Ord_Chk01 → Ord_Imp01) */		
	public class Map_Ord_Imp01_DtlR_Ord_Upd01_Dtl1R2<D extends Ord_Imp01_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Imp01_DtlR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
			addColumnPathMap(Ord_Imp01_DtlR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
			addColumnPathMap(Ord_Imp01_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
			addColumnPathMap(Ord_Imp01_DtlR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
			addColumnPathMap(Ord_Imp01_DtlR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
			addColumnPathMap(Ord_Imp01_DtlR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
			addColumnPathMap(Ord_Imp01_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(Ord_Imp01_DtlR.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
			addColumnPathMap(Ord_Imp01_DtlR.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
			addColumnPathMap(Ord_Imp01_DtlR.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
			addColumnPathMap(Ord_Imp01_DtlR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
			addColumnPathMap(Ord_Imp01_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
			addColumnPathMap(Ord_Imp01_DtlR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
			addColumnPathMap(Ord_Imp01_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
			addColumnPathMap(Ord_Imp01_DtlR.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
			addColumnPathMap(Ord_Imp01_DtlR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
			addColumnPathMap(Ord_Imp01_DtlR.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
			addColumnPathMap(Ord_Imp01_DtlR.$not_fix_flg, Ord_Upd01_Dtl1R.$not_fix_flg);
			addColumnPathMap(Ord_Imp01_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
			addColumnPathMap(Ord_Imp01_DtlR.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
			addColumnPathMap(Ord_Imp01_DtlR.$rqst_wg_nm, Ord_Upd01_Dtl1R.$rqst_wg_nm);
		}
	}

	protected void updRqmt(MCList<MST_RQMT_R> rqmtNoL) {

		MCList<MST_RQMT_R> rqmtL = MCList.create(MST_RQMT_R.class);
		MST_RQMT_R rqmtL_t = MST_RQMT_R.create("T");
		MCQueryApiBuilder rqmtL_bldr = MCQueryApiBuilder.create(rqmtL_t);
		rqmtL_bldr.setSelect(rqmtL_t.rqmt_no, rqmtL_t.rqmt_qty, rqmtL_t.fix_flg);
		rqmtL_bldr.setOrderByAsc(rqmtL_t.rqmt_no);
		dbSelectKeyForUpdate("MSBCL5010_MST_RQMT_S01", rqmtL, rqmtL_bldr, rqmtNoL);

		MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R itmOrdL_t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(itmOrdL_t);
		itmOrdL_bldr.addWhereWithAnd(itmOrdL_t.rqmt_no.eq(bind("rqmt_no")));
		itmOrdL_bldr.addGroupBy(itmOrdL_t.rqmt_no, itmOrdL_t.itm_ord_sts_typ);
		itmOrdL_bldr.addGroupFunc(sum(itmOrdL_t.yield_schd_qty), "yield_schd_qty");
		dbSelect("MSBCL5010_MST_ITM_ORDER_S03", itmOrdL, itmOrdL_bldr, rqmtL);

		MCList<MST_RQMT_R> updL = MCList.create(MST_RQMT_R.class);
		MCIndexKey idx = itmOrdL.createIndex(MST_ITM_ORDER_R.$rqmt_no);
		for (MST_RQMT_R r : rqmtL) {
			boolean oldFlg = r.fix_flg();
			setRqmtFixFlg(r, itmOrdL.subList(idx, r.rqmt_no()));
			if(!isSame(oldFlg, r.fix_flg())) {
				updL.add(r);
			}
		}

		if(!updL.isEmpty()) {
			MST_RQMT_R updL_t = MST_RQMT_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
			updL_bldr.setSet(updL_t.fix_flg);
			dbUpdateKey("MSBCL5010_MST_RQMT_U01", updL, updL_bldr);
		}
	}

	/** 日時生産依頼の確定フラグを設定する */
	protected void setRqmtFixFlg(MST_RQMT_R rqmt, MCList<MST_ITM_ORDER_R> itmOrdL) {

		if (itmOrdL.size() == 0) {
			rqmt.fix_flg(false);
			return;
		}

		MCList<MST_ITM_ORDER_R> notFixL = MCList.create(MST_ITM_ORDER_R.class);
		MCNumber fixRqmtQty = MCNumber.ZERO;

		for (MST_ITM_ORDER_R r : itmOrdL) {
			if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ())
					|| MSC_ITM_ORD_STS_TYP.isSAV(r.itm_ord_sts_typ())) {
				notFixL.add(r);
			}
			else {
				fixRqmtQty = fixRqmtQty.add(r.yield_schd_qty());
			}
		}

		if (fixRqmtQty.eq(MCNumber.ZERO)) {
			// 確定以降オーダなし
			rqmt.fix_flg(false);
		}
		else if (notFixL.isEmpty() || fixRqmtQty.gte(rqmt.rqmt_qty())) {
			// すべて確定以降,或いは所要量≦依頼済オーダの出来高予定数
			rqmt.fix_flg(true);
		}
		else {
			rqmt.fix_flg(false);
		}
	}

	/** 未確定受払予定（入庫） */
	protected MST_ORD_IO_SCHD_R getOrdIoSchdGr(Ord_Upd01_Dtl1R src, FXUCL_MCDbcCache<MAM_LOC_R> locList) {

		// 受払情報（入庫）
		MST_ORD_IO_SCHD_R retR = MST_ORD_IO_SCHD_R.create();
		if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.MFG_PLN.value());
		}
		else if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()))) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_PLN.value());
		}
		else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PLN.value());
		}
		retR.io_typ(MSC_IO_TYP.GR.value());
		if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
			retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
		}
		else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
			retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
		}
		retR.io_schd_no(src.itm_ord_no());
		retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
		retR.io_schd_sub_no1(src.itm_ord_no());
		retR.io_schd_pr_no(src.io_schd_pr_no());
		retR.schd_dt(src.strg_schd_dt());
		retR.accpt_schd_dt(src.accpt_schd_dt());
		retR.avl_schd_dt(src.avl_schd_dt());
		retR.itm_cd(src.itm_cd());
		retR.itm_sub1(src.itm_sub1());
		retR.itm_sub2(src.itm_sub2());
		retR.itm_sub3(src.itm_sub3());
		retR.ver_no(src.ver_no());
		retR.loc_cd(src.strg_loc_cd());
		retR.str_ln_cd(MAC_STR.NULL_VAL.value());
		MAM_LOC_R locR = locList.get(retR.loc_cd());
		retR.stk_arrv_bp_cd(nvl(locR.sppl_cd(), MAC_STR.NULL_VAL.value()));
		if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
			retR.lot_no(MAC_STR.NULL_VAL.value());
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
			retR.sublot_no(MAC_STR.NULL_VAL.value());
		}
		
		// 手配ＮＯx
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
			retR.sno1(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
			retR.sno2(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
			retR.sno3(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
			retR.sno4(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
		}
		
		retR.pack_unit_cd(src.unit_cd());
		retR.pack_unit_qty(src.yield_schd_qty());
		retR.base_unit_cd(src.unit_cd());
		retR.base_unit_qty(src.yield_schd_qty());
		retR.gd_cd(getDefaultFeedStkGd().gd_cd());
		retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
		retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
		retR.asst_typ(getAsstTyp(retR.loc_cd(), locList));
		retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
		retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
		retR.wg_cd(src.wg_cd());
		if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
			retR.sppl_cd(src.sppl_cd());
		}
		else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())){
			retR.sppl_cd(src.mfg_sppl_cd());
		}
		else {
			retR.sppl_cd(null);
		}
		if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
			retR.gi_loc_cd(src.rqst_loc_cd());
			retR.gr_loc_cd(src.strg_loc_cd());
		}
		retR.org_wg_cd(src.wg_cd());
		return retR;
	}

	/** 保存受払予定（入庫） */
	protected MST_SAVORD_IO_SCHD_R getSavOrdIoSchdGr(Ord_Upd01_Dtl1R src, FXUCL_MCDbcCache<MAM_LOC_R> locList) {

		// 受払情報（入庫）
		MST_SAVORD_IO_SCHD_R retR = MST_SAVORD_IO_SCHD_R.create();
		if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.MFG_PLN.value());
		}
		else if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ()))) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_PLN.value());
		}
		else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
			retR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PLN.value());
		}
		retR.io_typ(MSC_IO_TYP.GR.value());
		if (MSC_ITM_ORD_STS_TYP.isOPN(src.itm_ord_sts_typ())) {
			retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.OPN.value());
		}
		else if (MSC_ITM_ORD_STS_TYP.isSAV(src.itm_ord_sts_typ())) {
			retR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
		}
		retR.io_schd_no(src.itm_ord_no());
		retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
		retR.io_schd_sub_no1(src.itm_ord_no());
		retR.io_schd_pr_no(src.itm_ord_no());
		retR.schd_dt(src.strg_schd_dt());
		retR.accpt_schd_dt(src.accpt_schd_dt());
		retR.avl_schd_dt(src.avl_schd_dt());
		retR.itm_cd(src.itm_cd());
		retR.itm_sub1(src.itm_sub1());
		retR.itm_sub2(src.itm_sub2());
		retR.itm_sub3(src.itm_sub3());
		retR.ver_no(src.ver_no());
		retR.loc_cd(src.strg_loc_cd());
		retR.str_ln_cd(MAC_STR.NULL_VAL.value());
		MAM_LOC_R locR = locList.get(retR.loc_cd());
		retR.stk_arrv_bp_cd(nvl(locR.sppl_cd(), MAC_STR.NULL_VAL.value()));
		if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
			retR.lot_no(MAC_STR.NULL_VAL.value());
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
			retR.sublot_no(MAC_STR.NULL_VAL.value());
		}
		
		// 手配ＮＯx
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno1_mng_typ())) {
			retR.sno1(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno2_mng_typ())) {
			retR.sno2(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno3_mng_typ())) {
			retR.sno3(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
		}
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(src.chk_itm_sno4_mng_typ())) {
			retR.sno4(MAC_STR.NULL_VAL.value());
		}
		else {
			retR.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
		}
		
		retR.pack_unit_cd(src.unit_cd());
		retR.pack_unit_qty(src.yield_schd_qty());
		retR.base_unit_cd(src.unit_cd());
		retR.base_unit_qty(src.yield_schd_qty());
		retR.gd_cd(getDefaultFeedStkGd().gd_cd());
		retR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
		retR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
		retR.asst_typ(getAsstTyp(retR.loc_cd(), locList));
		retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		retR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
		retR.stk_bp_cd(MAC_STR.NULL_VAL.value());
		retR.wg_cd(src.wg_cd());
		if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
			retR.sppl_cd(src.sppl_cd());
		}
		else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())){
			retR.sppl_cd(src.mfg_sppl_cd());
		}
		else {
			retR.sppl_cd(null);
		}
		if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
				|| (MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ()))) {
			retR.gi_loc_cd(src.rqst_loc_cd());
			retR.gr_loc_cd(src.strg_loc_cd());
		}
		retR.org_wg_cd(src.wg_cd());
		return retR;
	}

	/** 製造（内製または外注）オーダであるかどうかを返す */
	protected boolean isMfgOrOutSrc(Ord_Upd01_Dtl1R r) {
		return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
			|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
	}
	
	/** 場所マスタキャッシュから管轄区分の対応する資産区分を取得する */
	protected String getAsstTyp(String loc_cd, FXUCL_MCDbcCache<MAM_LOC_R> locList){
		String rtn = "";
		MAM_LOC_R locR = locList.get(loc_cd);
		if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())){
			rtn = MAC_ASST_TYP.CO_SLS.value();
		}
		else if (MAC_LOC_MNG_TYP.isPRD(locR.loc_mng_typ())){
			rtn = MAC_ASST_TYP.CO_PROD.value();
		}
		return rtn;
	}

	/** 
	 * Ord_Upd01_Dtl1R → IoSchd_Ins01_DtlR (Ord_Upd01,Ord_Upd02 → IoSchd_Ins01)
	 * 確定受払予定（製造入庫）
	 */
	protected Map_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R<IoSchd_Ins01_DtlR, Ord_Upd01_Dtl1R> createMap_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R() {
		return new Map_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R<IoSchd_Ins01_DtlR, Ord_Upd01_Dtl1R>();
	}

	/** 
	 * Ord_Upd01_Dtl1R → IoSchd_Ins01_DtlR (Ord_Upd01,Ord_Upd02 → IoSchd_Ins01)
	 * 確定受払予定（製造入庫）
	 */
	public class Map_IoSchd_Ins01_DtlR_Ord_Upd01_Dtl1R<D extends IoSchd_Ins01_DtlR, S extends Ord_Upd01_Dtl1R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no1, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, Ord_Upd01_Dtl1R.$io_schd_pr_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, Ord_Upd01_Dtl1R.$strg_sppl_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
			if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
				dest.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(src.sublot_mng_typ())) {
				dest.sublot_no(MAC_STR.NULL_VAL.value());
			}
			dest.str_ln_cd(MAC_STR.NULL_VAL.value());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.gd_cd(getDefaultFeedStkGd().gd_cd());
		}
	}

	/** Ord_Upd01_Dtl1R → ShipDmndRqst_Chk01_DtlR (Ord_Chk01,Ord_Chk02 → ShipDmndRqst_Chk01) */
	protected Map_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R<ShipDmndRqst_Chk01_DtlR, Ord_Upd01_Dtl1R> createMap_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R() {
		return new Map_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R<ShipDmndRqst_Chk01_DtlR, Ord_Upd01_Dtl1R>();
	}

	/** Ord_Upd01_Dtl1R → ShipDmndRqst_Chk01_DtlR (Ord_Chk01,Ord_Chk02 → ShipDmndRqst_Chk01) */
	public class Map_ShipDmndRqst_Chk01_DtlR_Ord_Upd01_Dtl1R<D extends ShipDmndRqst_Chk01_DtlR, S extends Ord_Upd01_Dtl1R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, Ord_Upd01_Dtl1R.$data_crud_typ);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_fr_wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_to_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm, Ord_Upd01_Dtl1R.$gi_schd_dt);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_qty, Ord_Upd01_Dtl1R.$inst_qty);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
				dest.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
				if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
					dest.sppl_cd(src.mfg_sppl_cd());
					dest.maker_cd(src.mfg_maker_cd());
				}
			}
			else {
				dest.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
			}
			dest.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.ORD.value());
			dest.rqst_dt(getToday());
			if (MSC_ITM_ORD_STS_TYP.isFIX(src.a_itm_ord_sts_typ())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			dest.setDateNE("avl_schd_dt", src.avl_schd_dt());
		}
	}

	/** Ord_Upd01_Dtl1R → ShipDmndRqst_Upd01_DtlR (Ord_Upd01,Ord_Upd02 → ShipDmndRqst_Upd01) */
	protected Map_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R<ShipDmndRqst_Upd01_DtlR, Ord_Upd01_Dtl1R> createMap_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R() {
		return new Map_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R<ShipDmndRqst_Upd01_DtlR, Ord_Upd01_Dtl1R>();
	}

	public class Map_ShipDmndRqst_Upd01_DtlR_Ord_Upd01_Dtl1R<D extends ShipDmndRqst_Upd01_DtlR, S extends Ord_Upd01_Dtl1R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm, Ord_Upd01_Dtl1R.$gi_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_qty, Ord_Upd01_Dtl1R.$inst_qty);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_qty, Ord_Upd01_Dtl1R.$inst_qty);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$io_schd_pr_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_ord_no, Ord_Upd01_Dtl1R.$itm_ord_no);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
			addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
				dest.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
				if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())) {
					dest.sppl_cd(src.mfg_sppl_cd());
					dest.maker_cd(src.mfg_maker_cd());
				}
			}
			else {
				dest.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
			}
			dest.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.ORD.value());
			dest.rqst_dt(getToday());
			if (!src.uplnd_outsrc_flg()) {
				if (MSC_ITM_ORD_STS_TYP.isFIX(src.itm_ord_sts_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				dest.data_crud_typ(src.data_crud_typ());
			}
			dest.uplnd_outsrc_flg(src.uplnd_outsrc_flg());
			dest.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
				dest.sno1_null_flg(true);
			}
			else {
				dest.sno1_null_flg(false);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
				dest.sno2_null_flg(true);
			}
			else {
				dest.sno2_null_flg(false);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
				dest.sno3_null_flg(true);
			}
			else {
				dest.sno3_null_flg(false);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
				dest.sno4_null_flg(true);
			}
			else {
				dest.sno4_null_flg(false);
			}
		}
	}
	protected void chkReq(MCMessageList msgL, MCRow chkRow, String chkCol, MCRow causeRow) {
		Comparable<?> val = chkRow.getValueNE(chkCol);
		if (isNull(val)) {
			MCMessage msg = msgNoDataAtReq(getLabel(chkRow, chkCol));
			msg.setCauseRow(causeRow, null);
			msgL.add(msg);
		}
	}
	/**
	 * Ord_Imp02オペレーション.<p>
	 *
	 */
	public class Ord_Imp02 extends MSBCL_OrdRegService_MC_A.Ord_Imp02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callOrdRegSprtAndChkSrv();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
			setItmOrd();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		protected void setItmOrd() {
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MSW_ITM_ORDER_KEY_R w = MSW_ITM_ORDER_KEY_R.create("W");
			for (Ord_Imp02_DtlR r : up0().groupBy(Ord_Imp02_DtlR.$itm_ord_no)) {
				MST_ITM_ORDER_R itmOrdR = MST_ITM_ORDER_R.create();
				itmOrdR.itm_ord_no(r.itm_ord_no());
				itmOrdL.add(itmOrdR);
			}
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBCL5010_MSW_ITM_ORDER_D03", itmOrdL_bldr.getBaseDbc());
			dbWkInsert("MSBCL5010_MSW_ITM_ORDER_I03", itmOrdL, itmOrdL_bldr.getBaseDbc());

			itmOrdL_bldr.setSelect(
					t.itm_ord_no, t.itm_ord_typ, t.ver_no, t.strg_loc_cd,
					t.mfg_loc_cd, t.sppl_cd, t.maker_cd, t.rqst_loc_cd, t.bom_ptn,
					t.inst_qty, t.yield_schd_qty, t.po_schd_dt, t.mfg_st_schd_dt,
					t.mfg_end_schd_dt, t.gi_schd_dt, t.strg_schd_dt, t.accpt_schd_dt,
					t.insp_st_schd_dt, t.insp_end_schd_dt, t.avl_schd_dt, t.master_dt,
					t.sno1, t.sno2, t.sno3, t.sno4, t.itm_ord_sts_typ, t.upd_cntr
					);
			itmOrdL_bldr.addInnerJoin(w, bracket(w.itm_ord_no.eq(t.itm_ord_no)));
			dbSelect("MSBCL5010_MST_ITM_ORDER_S04", itmOrdL, itmOrdL_bldr);

			MCIndexKey itmOrdIdxkey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Ord_Imp02_DtlR r : up0()) {
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdIdxkey, r.itm_ord_no());
				if (isNull(itmOrdR)) {
					continue;
				}
				r.itm_ord_typ(itmOrdR.itm_ord_typ());
				r.ver_no(itmOrdR.ver_no());
				r.strg_loc_cd(itmOrdR.strg_loc_cd());
				r.mfg_loc_cd(itmOrdR.mfg_loc_cd());
				r.sppl_cd(itmOrdR.sppl_cd());
				r.maker_cd(itmOrdR.maker_cd());
				r.rqst_loc_cd(itmOrdR.rqst_loc_cd());
				r.bom_ptn(itmOrdR.bom_ptn());
				r.inst_qty(itmOrdR.inst_qty());
				r.yield_schd_qty(itmOrdR.yield_schd_qty());
				r.po_schd_dt(itmOrdR.po_schd_dt());
				r.mfg_st_schd_dt(itmOrdR.mfg_st_schd_dt());
				r.mfg_end_schd_dt(itmOrdR.mfg_end_schd_dt());
				r.gi_schd_dt(itmOrdR.gi_schd_dt());
				r.strg_schd_dt(itmOrdR.strg_schd_dt());
				r.accpt_schd_dt(itmOrdR.accpt_schd_dt());
				r.insp_st_schd_dt(itmOrdR.insp_st_schd_dt());
				r.insp_end_schd_dt(itmOrdR.insp_end_schd_dt());
				r.avl_schd_dt(itmOrdR.avl_schd_dt());
				r.master_dt(itmOrdR.master_dt());
				r.sno1(itmOrdR.sno1());
				r.sno2(itmOrdR.sno2());
				r.sno3(itmOrdR.sno3());
				r.sno4(itmOrdR.sno4());
				r.itm_ord_sts_typ(itmOrdR.itm_ord_sts_typ());
				r.itm_order_upd_cntr(itmOrdR.upd_cntr());
				if (isNull(r.itm_sub1())) {
					r.itm_sub1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub2())) {
					r.itm_sub2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub3())) {
					r.itm_sub3(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected void callOrdRegSprtAndChkSrv() {
			// 入力支援サービスで補完
			MSBCL_OrdRegService.Ord_Sprt04 sprt = MSBCL_OrdRegService.crtOrd_Sprt04();
			addAll(sprt.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Ord_Imp02_DtlR());
			sprt.exec();
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk1 = up0().join(Ord_Imp02_DtlR.$peg_no, sprt.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk1, createMap_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R1());

			// 取込前のチェック
			MSBCL_OrdRegService.Ord_Chk01 chk = MSBCL_OrdRegService.crtOrd_Chk01();
			chk.up0().setAll(sprt.down0());
			copyByPegNo(chk.up0(), new String[]{Ord_Upd01_Dtl1R.$itm_ord_no}, up0(), new String[]{Ord_Imp02_DtlR.$itm_ord_no});
			chk.up0().setStringNE(Ord_Imp02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			chk.exec();
			copyErrFlg(up0(), chk.down0());
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk2 = up0().join(Ord_Imp01_DtlR.$peg_no, chk.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(up0(), jk2, createMap_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R2());
		}

		protected Map_Ord_Upd01_Dtl1R_Ord_Imp02_DtlR<Ord_Upd01_Dtl1R, Ord_Imp02_DtlR> createMap_Ord_Upd01_Dtl1R_Ord_Imp02_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Imp02_DtlR<Ord_Upd01_Dtl1R, Ord_Imp02_DtlR>();
		}

		public class Map_Ord_Upd01_Dtl1R_Ord_Imp02_DtlR<D extends Ord_Upd01_Dtl1R, S extends Ord_Imp02_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Ord_Imp02_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Ord_Imp02_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Ord_Imp02_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Ord_Imp02_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Ord_Imp02_DtlR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Ord_Imp02_DtlR.$ord_gnrt_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Ord_Imp02_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Ord_Imp02_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Ord_Imp02_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Ord_Imp02_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Ord_Imp02_DtlR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Ord_Imp02_DtlR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Ord_Imp02_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Ord_Imp02_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Ord_Imp02_DtlR.$maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Ord_Imp02_DtlR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Ord_Imp02_DtlR.$rqst_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Ord_Imp02_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Ord_Imp02_DtlR.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Ord_Imp02_DtlR.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Ord_Imp02_DtlR.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, Ord_Imp02_DtlR.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Ord_Imp02_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Ord_Imp02_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Ord_Imp02_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, Ord_Imp02_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, Ord_Imp02_DtlR.$strg_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, Ord_Imp02_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, Ord_Imp02_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, Ord_Imp02_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Ord_Imp02_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Ord_Imp02_DtlR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Ord_Imp02_DtlR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Ord_Imp02_DtlR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Ord_Imp02_DtlR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Ord_Imp02_DtlR.$sno4);
			}
		}

		protected Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R1<Ord_Imp02_DtlR, Ord_Upd01_Dtl1R> createMap_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R1() {
			return new Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R1<Ord_Imp02_DtlR, Ord_Upd01_Dtl1R>();
		}

		public class Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R1<D extends Ord_Imp02_DtlR, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Imp02_DtlR.$itm_nm, Ord_Upd01_Dtl1R.$itm_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$unit_nm, Ord_Upd01_Dtl1R.$unit_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$cont_fctr_flg, Ord_Upd01_Dtl1R.$cont_fctr_flg);
				addColumnPathMap(Ord_Imp02_DtlR.$cont_fctr_unit_cd, Ord_Upd01_Dtl1R.$cont_fctr_unit_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$cont_fctr_unit_nm, Ord_Upd01_Dtl1R.$cont_fctr_unit_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$std_cont_fctr, Ord_Upd01_Dtl1R.$std_cont_fctr);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_site_cd, Ord_Upd01_Dtl1R.$strg_site_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_site_nm, Ord_Upd01_Dtl1R.$strg_site_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_loc_grp_cd, Ord_Upd01_Dtl1R.$strg_loc_grp_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_loc_grp_nm, Ord_Upd01_Dtl1R.$strg_loc_grp_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_lg_grp_cd, Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_lg_grp_nm, Ord_Upd01_Dtl1R.$strg_lg_grp_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_alloc_grp_cd, Ord_Upd01_Dtl1R.$strg_alloc_grp_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_alloc_grp_nm, Ord_Upd01_Dtl1R.$strg_alloc_grp_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_loc_nm, Ord_Upd01_Dtl1R.$strg_loc_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_site_cd, Ord_Upd01_Dtl1R.$mfg_site_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_site_nm, Ord_Upd01_Dtl1R.$mfg_site_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_loc_grp_cd, Ord_Upd01_Dtl1R.$mfg_loc_grp_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_loc_grp_nm, Ord_Upd01_Dtl1R.$mfg_loc_grp_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_loc_nm, Ord_Upd01_Dtl1R.$mfg_loc_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$sppl_nm, Ord_Upd01_Dtl1R.$sppl_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$maker_nm, Ord_Upd01_Dtl1R.$maker_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_site_cd, Ord_Upd01_Dtl1R.$rqst_site_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_site_nm, Ord_Upd01_Dtl1R.$rqst_site_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_loc_grp_cd, Ord_Upd01_Dtl1R.$rqst_loc_grp_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_loc_grp_nm, Ord_Upd01_Dtl1R.$rqst_loc_grp_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_loc_nm, Ord_Upd01_Dtl1R.$rqst_loc_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_wg_nm, Ord_Upd01_Dtl1R.$rqst_wg_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$wg_nm, Ord_Upd01_Dtl1R.$wg_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$cont_fctr_inst_qty, Ord_Upd01_Dtl1R.$cont_fctr_inst_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$cont_fctr_schd_yield, Ord_Upd01_Dtl1R.$cont_fctr_schd_yield);
				addColumnPathMap(Ord_Imp02_DtlR.$wrk_no, Ord_Upd01_Dtl1R.$wrk_no);
				addColumnPathMap(Ord_Imp02_DtlR.$wrk_nm, Ord_Upd01_Dtl1R.$wrk_nm);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_typ, Ord_Upd01_Dtl1R.$itm_typ);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_typ_d_cd, Ord_Upd01_Dtl1R.$itm_typ_d_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_typ_d_nm, Ord_Upd01_Dtl1R.$itm_typ_d_nm);
			}
		}

		protected Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R2<Ord_Imp02_DtlR, Ord_Upd01_Dtl1R> createMap_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R2() {
			return new Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R2<Ord_Imp02_DtlR, Ord_Upd01_Dtl1R>();
		}

		public class Map_Ord_Imp02_DtlR_Ord_Upd01_Dtl1R2<D extends Ord_Imp02_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Imp02_DtlR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(Ord_Imp02_DtlR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(Ord_Imp02_DtlR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(Ord_Imp02_DtlR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(Ord_Imp02_DtlR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(Ord_Imp02_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(Ord_Imp02_DtlR.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(Ord_Imp02_DtlR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(Ord_Imp02_DtlR.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$not_fix_flg, Ord_Upd01_Dtl1R.$not_fix_flg);
				addColumnPathMap(Ord_Imp02_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(Ord_Imp02_DtlR.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
				addColumnPathMap(Ord_Imp02_DtlR.$rqst_wg_nm, Ord_Upd01_Dtl1R.$rqst_wg_nm);
			}
		}
	}

	//FMCB CUSTOM END
}