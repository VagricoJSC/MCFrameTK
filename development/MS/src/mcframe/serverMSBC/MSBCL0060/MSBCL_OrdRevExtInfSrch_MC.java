package mcframe.serverMSBC.MSBCL0060;

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
import mcframe.serverMS.dbc.*;
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
import static mcframe.serverMSBC.MSBCL0060.Query.*;
import java.util.HashMap;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OrdRevExtInfSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OrdRevExtInfSrch_MC extends MSBCL_OrdRevExtInfSrch_MC_A{
	//FMCB CUSTOM START
	/** 明細検索種別：在庫 */
	protected static final String _PROC_STK = "1";
	/** 明細検索種別：品目オーダ */
	protected static final String _PROC_ORD = "2";

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_OrdRevExtInfSrch_MC_A.Srch01 {
		//展開結果ヘッダリスト
		protected MCList<Srch01_RsltR> _srchHrrchyLst = MCList.create(Srch01_RsltR.class);
		//展開結果明細リスト
		protected MCList<Srch01_RsltR> _rsltOrdLst = MCList.create(Srch01_RsltR.class);
		protected MCList<Srch01_RsltR> _rsltStkLst = MCList.create(Srch01_RsltR.class);
		//明細紐づけ用インデックス
		protected MCIndexKey _ordKey;
		protected MCIndexKey _stkKey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			//展開パッケージ実行
			execInsHrrchyProc();

			//展開結果取得
			srchHrrchy();
			if (_srchHrrchyLst.size() == 0) {
				return;
			}

			//展開結果明細取得
			srchHrrchyDtl();

			//下り電文設定
			setDown();
		}

		protected void execInsHrrchyProc(){
			if (!isNull(up0().itm_ord_no())) {
				String procId = "MSPA_INS_HRRCHY$P_INS_ITM_ORD_R_HRRCHY_O";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":itm_ord_no, :max_hrrchy");
			}
			else {
				// ＮＵＬＬ文字補完
				up0().lot_no(isNull(up0().lot_no()) ? MAC_STR.NULL_VAL.value() : up0().lot_no());
				up0().sublot_no(isNull(up0().sublot_no()) ? MAC_STR.NULL_VAL.value() : up0().sublot_no());
				String procId = "MSPA_INS_HRRCHY$P_INS_ITM_ORD_R_HRRCHY_S";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, 
						":itm_cd,:itm_sub1,:itm_sub2, :itm_sub3,"
						+ ":lot_no, :sublot_no, :strg_loc_cd, :max_hrrchy");
			}
		}

		protected void srchHrrchy() {
			executeQuery(_srchHrrchyLst, MSBCL0060_MSW_ITM_ORD_R_HRRCHY_S01());
		}

		protected void srchHrrchyDtl() {
			MCList<Srch01_RsltR> srchItmOrdLst = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> srchStStkLst = MCList.create(Srch01_RsltR.class);

			//検索用リスト（品目オーダ、在庫、移送依頼）に振り分け
			for (Srch01_RsltR r : _srchHrrchyLst) {
				if (!isNull(r.itm_ord_no())) {
					srchItmOrdLst.add(r);
					r.proc_typ(_PROC_ORD);
				}
				else {
					srchStStkLst.add(r);
					r.proc_typ(_PROC_STK);
				}
			}

			//一括検索処理
			srchItmOrd(srchItmOrdLst);
			srchStStk(srchStStkLst);
		}

		protected void setDown() {
			MCList<Srch01_RsltR> downLst = getHrrchyDtl();
			setViewCol(downLst);
			setExtNo(downLst);
			down0().addAll(downLst);
		}

		/**
		 * 品目オーダＮＯで品目オーダを検索する
		 */
		protected void srchItmOrd(MCList<Srch01_RsltR> srchItmOrdLst) {
			if(srchItmOrdLst.isEmpty()) {
				return;
			}
			
			MCList<MST_ITM_ORDER_R> dbcL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			for (Srch01_RsltR r : srchItmOrdLst.groupBy(Srch01_RsltR.$itm_ord_no)){
				MST_ITM_ORDER_R dbc = MST_ITM_ORDER_R.create();
				dbc.itm_ord_no(r.itm_ord_no());
				dbcL.add(dbc);
			}
			dbWkDelete("MSBCL0060_MSW_ITM_ORDER_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBCL0060_MSW_ITM_ORDER_I01", dbcL, dbcL_bldr.getBaseDbc());

			//品目オーダの詳細情報を取得	
			executeQuery(_rsltOrdLst, MSBCL0060_MST_ITM_ORDER_S01());
		}

		/**
		 * 現状在庫を検索する
		 */
		protected void srchStStk(MCList<Srch01_RsltR> srchStStkLst) {
			if(srchStStkLst.isEmpty()) {
				return;
			}

			MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
			String[] keys = new String[]{Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$strg_loc_cd, Srch01_RsltR.$lot_no, Srch01_RsltR.$sublot_no,
				Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3, Srch01_RsltR.$sno4};

			//現状在庫検索
			MCList<Srch01_RsltR> cndL = srchStStkLst.groupBy(keys);
			MCList<MST_STK_R> dbcL = MCList.create(MST_STK_R.class);
			MST_STK_R t = MST_STK_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			for(Srch01_RsltR r: cndL) {
				MST_STK_R dbc = MST_STK_R.create();
				dbc.itm_cd(r.itm_cd());
				dbc.itm_sub1(r.itm_sub1());
				dbc.itm_sub2(r.itm_sub2());
				dbc.itm_sub3(r.itm_sub3());
				dbc.loc_cd(r.strg_loc_cd());
				dbc.lot_no(r.lot_no());
				dbc.sublot_no(r.sublot_no());
				dbc.sno1(r.sno1());
				dbc.sno2(r.sno2());
				dbc.sno3(r.sno3());
				dbc.sno4(r.sno4());
				dbcL.add(dbc);
			}
			dbWkDelete("MSBCL0060_MSW_STK_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBCL0060_MSW_STK_I01", dbcL, dbcL_bldr.getBaseDbc());
			
			executeQuery(l, MSBCL0060_MSVT_AVL_STK_S01());
			_rsltStkLst.addAll(l);
		}

		protected MCList<Srch01_RsltR> getHrrchyDtl() {
			_ordKey = _rsltOrdLst.createIndex(Srch01_RsltR.$itm_ord_no, "WK_SORT_NUM");
			_stkKey = _rsltStkLst.createIndex(Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$stk_loc_cd, Srch01_RsltR.$lot_no, Srch01_RsltR.$sublot_no,
				Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3, Srch01_RsltR.$sno4);

			MCList<Srch01_RsltR> downLst = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r: _srchHrrchyLst) {
				MCList<Srch01_RsltR> rsltL = getOwnLst(r);
				if (rsltL.size() == 0) {
					// 品目オーダを削除した場合など
					Srch01_RsltR arow = Srch01_RsltR.create();
					copy(arow, r, createMap_Srch01_RsltR_Srch01_RsltR_Hdr2());
					downLst.add(arow);
				}
				else {
					for (Srch01_RsltR dr: rsltL) {
						Srch01_RsltR arow = Srch01_RsltR.create();
						copy(arow, r, createMap_Srch01_RsltR_Srch01_RsltR_Hdr());
						copy(arow, dr, createMap_Srch01_RsltR_Srch01_RsltR_Dtl());
						// 品目オーダなしのデータの場合、品目オーダＮＯをクリア
						if (!isSame(dr.getNumberNE("wk_sort_num"), MCNumber.valueOf(1))) {
							arow.itm_ord_no(null);
						}
						downLst.add(arow);
					}
				}
			}
			return downLst;
		}

		protected MCList<Srch01_RsltR> getOwnLst(Srch01_RsltR r) {
			MCList<Srch01_RsltR> retL = MCList.create(Srch01_RsltR.class);
			if (isSame(r.proc_typ(), _PROC_ORD)) {
				retL.add(_rsltOrdLst.getFirst(_ordKey, r.itm_ord_no()));
			}
			else {
				Comparable[] vals = new Comparable[]{r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					r.strg_loc_cd(), r.lot_no(), r.sublot_no(),
					r.sno1(), r.sno2(), r.sno3(), r.sno4()};

				//現状在庫
				retL.addAll(_rsltStkLst.subList(_stkKey, vals));
			}

			return retL;
		}

		/**
		 * 表示用項目を設定する。
		 */
		protected void setViewCol(MCList<Srch01_RsltR> itmOrdHrrchy) {

			for (Srch01_RsltR r: itmOrdHrrchy) {
				
				// 取引
				if (!isNullOrNullVal(r.itm_ord_typ())) {
					MSC_ITM_ORD_TYP.putNameNE(r, Srch01_RsltR.$itm_ord_typ, Srch01_RsltR.$trd_nm);
				}
				else {
					MSC_IO_SCHD_TYP.putNameNE(r, Srch01_RsltR.$io_schd_typ, Srch01_RsltR.$trd_nm);
				}
				
				// データ
				MSC_ORD_EXT_DAT_TYP.putNameNE(r, Srch01_RsltR.$ord_ext_dat_typ, Srch01_RsltR.$ord_ext_dat_typ_nm);
				
				// データＮＯ
				if (!isNullOrNullVal(r.itm_ord_no())) {
					r.ord_ext_dat_no(r.itm_ord_no());
				}
				else {
					r.ord_ext_dat_no(r.io_schd_no());
				}
				
				// 格納場所／納品先
				if (!isNullOrNullVal(r.dlv_cd())) {
					r.strg_dlv_cd(r.dlv_cd());
					r.strg_dlv_nm(r.dlv_nm());
				}
				else if (!isNullOrNullVal(r.stk_loc_cd())) {
					r.strg_dlv_cd(r.stk_loc_cd());
					r.strg_dlv_nm(r.stk_loc_nm());
				}
				else {
					r.strg_dlv_cd(r.strg_loc_cd());
					r.strg_dlv_nm(r.strg_loc_nm());
				}
				
				// 取引場所／取引先
				if (!isNullOrNullVal(r.cst_cd())) {
					r.trd_loc_bp_cd(r.cst_cd());
					r.trd_loc_bp_nm(r.cst_nm());
				}
				else if (!isNullOrNullVal(r.mfg_loc_cd())) {
					r.trd_loc_bp_cd(r.mfg_loc_cd());
					r.trd_loc_bp_nm(r.mfg_loc_nm());
				}
				else if (!isNullOrNullVal(r.sppl_cd())) {
					r.trd_loc_bp_cd(r.sppl_cd());
					r.trd_loc_bp_nm(r.sppl_nm());
				}
				else if (!isNullOrNullVal(r.rqst_loc_cd())) {
					r.trd_loc_bp_cd(r.rqst_loc_cd());
					r.trd_loc_bp_nm(r.rqst_loc_nm());
				}
			}
		}

		/**
		 * 階層を意識したリストの並び順と階層番号とを元に、展開番号を設定する。
		 */
		protected void setExtNo(MCList<Srch01_RsltR> itmOrdHrrchy) {
			//画面の階層部品のソート処理の仕様上、
			//ルートのpar_extno(親の展開番号)はnullであり、
			//extno(展開番号)の最小番号は0であることが必要。
			HashMap<Integer, MCNumber> ext_map = new HashMap<Integer, MCNumber>();
			MCNumber num = MCNumber.ZERO;
			int currLevel = -1;

			for (Srch01_RsltR r: itmOrdHrrchy) {
				currLevel = r.hrrchy().intValue();
				r.par_extno(ext_map.get(Integer.valueOf(currLevel-1)));
				r.extno(num);
				ext_map.put(Integer.valueOf(currLevel), num);

				num = num.add(1);
			}
		}

		protected Map_Srch01_RsltR_Srch01_RsltR_Hdr<Srch01_RsltR,Srch01_RsltR> createMap_Srch01_RsltR_Srch01_RsltR_Hdr() {
			return new Map_Srch01_RsltR_Srch01_RsltR_Hdr<Srch01_RsltR, Srch01_RsltR>();
		}

		public class Map_Srch01_RsltR_Srch01_RsltR_Hdr<D extends Srch01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$hrrchy, Srch01_RsltR.$hrrchy);
				addColumnPathMap(Srch01_RsltR.$itm_ord_no, Srch01_RsltR.$itm_ord_no);
				addColumnPathMap(Srch01_RsltR.$ver_no, Srch01_RsltR.$ver_no);
				addColumnPathMap(Srch01_RsltR.$io_schd_pr_no, Srch01_RsltR.$io_schd_pr_no);
				addColumnPathMap(Srch01_RsltR.$strg_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(Srch01_RsltR.$strg_loc_nm, Srch01_RsltR.$strg_loc_nm);
				addColumnPathMap(Srch01_RsltR.$lot_no, Srch01_RsltR.$lot_no);
				addColumnPathMap(Srch01_RsltR.$sublot_no, Srch01_RsltR.$sublot_no);
				addColumnPathMap(Srch01_RsltR.$schd_alloc_qty, Srch01_RsltR.$schd_alloc_qty);
				addColumnPathMap(Srch01_RsltR.$gi_schd_dt, Srch01_RsltR.$gi_schd_dt);
				addColumnPathMap(Srch01_RsltR.$wrk_no, Srch01_RsltR.$wrk_no);
				addColumnPathMap(Srch01_RsltR.$wrk_nm, Srch01_RsltR.$wrk_nm);
				addColumnPathMap(Srch01_RsltR.$wg_cd, Srch01_RsltR.$wg_cd);
				addColumnPathMap(Srch01_RsltR.$wg_nm, Srch01_RsltR.$wg_nm);
				addColumnPathMap(Srch01_RsltR.$not_fix_flg, Srch01_RsltR.$not_fix_flg);
				addColumnPathMap(Srch01_RsltR.$blk_flg, Srch01_RsltR.$blk_flg);
				addColumnPathMap(Srch01_RsltR.$itm_ord_typ, Srch01_RsltR.$itm_ord_typ);
				addColumnPathMap(Srch01_RsltR.$rqmt_no, Srch01_RsltR.$rqmt_no);
			}
		}

		protected Map_Srch01_RsltR_Srch01_RsltR_Dtl<Srch01_RsltR,Srch01_RsltR> createMap_Srch01_RsltR_Srch01_RsltR_Dtl() {
			return new Map_Srch01_RsltR_Srch01_RsltR_Dtl<Srch01_RsltR, Srch01_RsltR>();
		}

		public class Map_Srch01_RsltR_Srch01_RsltR_Dtl<D extends Srch01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(Srch01_RsltR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(Srch01_RsltR.$itm_nm, Srch01_RsltR.$itm_nm);
				addColumnPathMap(Srch01_RsltR.$itm_ord_sts_typ, Srch01_RsltR.$itm_ord_sts_typ);
				addColumnPathMap(Srch01_RsltR.$inst_qty, Srch01_RsltR.$inst_qty);
				addColumnPathMap(Srch01_RsltR.$yield_schd_qty, Srch01_RsltR.$yield_schd_qty);
				addColumnPathMap(Srch01_RsltR.$base_unit_qty, Srch01_RsltR.$base_unit_qty);
				addColumnPathMap(Srch01_RsltR.$base_unit_cd, Srch01_RsltR.$base_unit_cd);
				addColumnPathMap(Srch01_RsltR.$base_unit_nm, Srch01_RsltR.$base_unit_nm);
				addColumnPathMap(Srch01_RsltR.$base_dec_place, Srch01_RsltR.$base_dec_place);
				addColumnPathMap(Srch01_RsltR.$pack_unit_qty, Srch01_RsltR.$pack_unit_qty);
				addColumnPathMap(Srch01_RsltR.$pack_unit_cd, Srch01_RsltR.$pack_unit_cd);
				addColumnPathMap(Srch01_RsltR.$pack_unit_nm, Srch01_RsltR.$pack_unit_nm);
				addColumnPathMap(Srch01_RsltR.$pack_dec_place, Srch01_RsltR.$pack_dec_place);
				addColumnPathMap(Srch01_RsltR.$po_schd_dt, Srch01_RsltR.$po_schd_dt);
				addColumnPathMap(Srch01_RsltR.$mfg_st_schd_dt, Srch01_RsltR.$mfg_st_schd_dt);
				addColumnPathMap(Srch01_RsltR.$mfg_end_schd_dt, Srch01_RsltR.$mfg_end_schd_dt);
				addColumnPathMap(Srch01_RsltR.$strg_schd_dt, Srch01_RsltR.$strg_schd_dt);
				addColumnPathMap(Srch01_RsltR.$accpt_schd_dt, Srch01_RsltR.$accpt_schd_dt);
				addColumnPathMap(Srch01_RsltR.$insp_st_schd_dt, Srch01_RsltR.$insp_st_schd_dt);
				addColumnPathMap(Srch01_RsltR.$insp_end_schd_dt, Srch01_RsltR.$insp_end_schd_dt);
				addColumnPathMap(Srch01_RsltR.$avl_schd_dt, Srch01_RsltR.$avl_schd_dt);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_cd, Srch01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_nm, Srch01_RsltR.$mfg_loc_nm);
				addColumnPathMap(Srch01_RsltR.$sppl_cd, Srch01_RsltR.$sppl_cd);
				addColumnPathMap(Srch01_RsltR.$sppl_nm, Srch01_RsltR.$sppl_nm);
				addColumnPathMap(Srch01_RsltR.$maker_cd, Srch01_RsltR.$maker_cd);
				addColumnPathMap(Srch01_RsltR.$maker_nm, Srch01_RsltR.$maker_nm);
				addColumnPathMap(Srch01_RsltR.$rqst_loc_cd, Srch01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Srch01_RsltR.$rqst_loc_nm, Srch01_RsltR.$rqst_loc_nm);
				addColumnPathMap(Srch01_RsltR.$rqst_wg_cd, Srch01_RsltR.$rqst_wg_cd);
				addColumnPathMap(Srch01_RsltR.$rqst_wg_nm, Srch01_RsltR.$rqst_wg_nm);
				addColumnPathMap(Srch01_RsltR.$stk_loc_cd, Srch01_RsltR.$stk_loc_cd);
				addColumnPathMap(Srch01_RsltR.$stk_loc_nm, Srch01_RsltR.$stk_loc_nm);
				addColumnPathMap(Srch01_RsltR.$in_xfr_typ, Srch01_RsltR.$in_xfr_typ);
				addColumnPathMap(Srch01_RsltR.$quality_typ, Srch01_RsltR.$quality_typ);
				addColumnPathMap(Srch01_RsltR.$stk_insp_typ, Srch01_RsltR.$stk_insp_typ);
				addColumnPathMap(Srch01_RsltR.$oper_ptn, Srch01_RsltR.$oper_ptn);
				addColumnPathMap(Srch01_RsltR.$bom_ptn, Srch01_RsltR.$bom_ptn);
				addColumnPathMap(Srch01_RsltR.$chd_rqmt_no, Srch01_RsltR.$chd_rqmt_no);
				addColumnPathMap(Srch01_RsltR.$io_schd_typ, Srch01_RsltR.$io_schd_typ);
				addColumnPathMap(Srch01_RsltR.$io_schd_sts_typ, Srch01_RsltR.$io_schd_sts_typ);
				addColumnPathMap(Srch01_RsltR.$io_schd_no, Srch01_RsltR.$io_schd_no);
				addColumnPathMap(Srch01_RsltR.$slo_d_no, Srch01_RsltR.$slo_d_no);
				addColumnPathMap(Srch01_RsltR.$intr_rmrks, Srch01_RsltR.$intr_rmrks);
				addColumnPathMap(Srch01_RsltR.$sub_char1, Srch01_RsltR.$sub_char1);
				addColumnPathMap(Srch01_RsltR.$sub_char2, Srch01_RsltR.$sub_char2);
				addColumnPathMap(Srch01_RsltR.$sub_char3, Srch01_RsltR.$sub_char3);
				addColumnPathMap(Srch01_RsltR.$ord_ext_dat_typ, Srch01_RsltR.$ord_ext_dat_typ);
				addColumnPathMap(Srch01_RsltR.$slo_no, Srch01_RsltR.$slo_no);
				addColumnPathMap(Srch01_RsltR.$dlv_cd, Srch01_RsltR.$dlv_cd);
				addColumnPathMap(Srch01_RsltR.$dlv_nm, Srch01_RsltR.$dlv_nm);
				addColumnPathMap(Srch01_RsltR.$cst_cd, Srch01_RsltR.$cst_cd);
				addColumnPathMap(Srch01_RsltR.$cst_nm, Srch01_RsltR.$cst_nm);
				addColumnPathMap(Srch01_RsltR.$sno1, Srch01_RsltR.$sno1);
				addColumnPathMap(Srch01_RsltR.$sno2, Srch01_RsltR.$sno2);
				addColumnPathMap(Srch01_RsltR.$sno3, Srch01_RsltR.$sno3);
				addColumnPathMap(Srch01_RsltR.$sno4, Srch01_RsltR.$sno4);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!isNull(src.gi_schd_dt())) {
					dest.gi_schd_dt(src.gi_schd_dt());
				}
				
				// 独立所要のＷＧ間依頼のオーダを表示する場合、引当予定の場所が取得できず、格納場所がnullになるので、その場合はオーダの格納場所を設定
				if (isNull(dest.strg_loc_cd())) {
					dest.strg_loc_cd(src.strg_loc_cd());
					dest.strg_loc_nm(src.strg_loc_nm());
				}
			}
		}

		protected Map_Srch01_RsltR_Srch01_RsltR_Hdr2<Srch01_RsltR,Srch01_RsltR> createMap_Srch01_RsltR_Srch01_RsltR_Hdr2() {
			return new Map_Srch01_RsltR_Srch01_RsltR_Hdr2<Srch01_RsltR, Srch01_RsltR>();
		}

		public class Map_Srch01_RsltR_Srch01_RsltR_Hdr2<D extends Srch01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$hrrchy, Srch01_RsltR.$hrrchy);
				addColumnPathMap(Srch01_RsltR.$itm_ord_no, Srch01_RsltR.$itm_ord_no);
				addColumnPathMap(Srch01_RsltR.$rqmt_no, Srch01_RsltR.$rqmt_no);
				addColumnPathMap(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(Srch01_RsltR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(Srch01_RsltR.$itm_nm, Srch01_RsltR.$itm_nm);
				addColumnPathMap(Srch01_RsltR.$ver_no, Srch01_RsltR.$ver_no);
				addColumnPathMap(Srch01_RsltR.$strg_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(Srch01_RsltR.$strg_loc_nm, Srch01_RsltR.$strg_loc_nm);
				addColumnPathMap(Srch01_RsltR.$io_schd_pr_no, Srch01_RsltR.$io_schd_pr_no);
				addColumnPathMap(Srch01_RsltR.$lot_no, Srch01_RsltR.$lot_no);
				addColumnPathMap(Srch01_RsltR.$sublot_no, Srch01_RsltR.$sublot_no);
				addColumnPathMap(Srch01_RsltR.$schd_alloc_qty, Srch01_RsltR.$schd_alloc_qty);
				addColumnPathMap(Srch01_RsltR.$gi_schd_dt, Srch01_RsltR.$gi_schd_dt);
				addColumnPathMap(Srch01_RsltR.$sno1, Srch01_RsltR.$sno1);
				addColumnPathMap(Srch01_RsltR.$sno2, Srch01_RsltR.$sno2);
				addColumnPathMap(Srch01_RsltR.$sno3, Srch01_RsltR.$sno3);
				addColumnPathMap(Srch01_RsltR.$sno4, Srch01_RsltR.$sno4);
				addColumnPathMap(Srch01_RsltR.$wrk_no, Srch01_RsltR.$wrk_no);
				addColumnPathMap(Srch01_RsltR.$wrk_nm, Srch01_RsltR.$wrk_nm);
				addColumnPathMap(Srch01_RsltR.$wg_cd, Srch01_RsltR.$wg_cd);
				addColumnPathMap(Srch01_RsltR.$wg_nm, Srch01_RsltR.$wg_nm);
				addColumnPathMap(Srch01_RsltR.$not_fix_flg, Srch01_RsltR.$not_fix_flg);
				addColumnPathMap(Srch01_RsltR.$blk_flg, Srch01_RsltR.$blk_flg);
				addColumnPathMap(Srch01_RsltR.$itm_ord_typ, Srch01_RsltR.$itm_ord_typ);
			}
		}
	}

	//FMCB CUSTOM END
}