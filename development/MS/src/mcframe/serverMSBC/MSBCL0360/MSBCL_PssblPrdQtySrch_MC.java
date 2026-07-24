package mcframe.serverMSBC.MSBCL0360;

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
import static mcframe.serverMSBC.MSBCL0360.Query.*;

import java.util.List;

import mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR;
import mcframe.serverMSBE.MSBEL5060.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_PssblPrdQtySrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_PssblPrdQtySrch_MC extends MSBCL_PssblPrdQtySrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造オーダ、及び外注オーダに対して投入品の状況を踏まえての生産可能数状況を参照する<br>
	 */
	public class Srch01 extends MSBCL_PssblPrdQtySrch_MC_A.Srch01 {
		protected final java.math.RoundingMode RND_MODE_UP = MAC_RND_TYP.RNDUP.toMC();
		protected final java.math.RoundingMode RND_MODE_DOWN = MAC_RND_TYP.CUTOFF.toMC();
		protected final java.math.RoundingMode RND_MODE_HALFUP = MAC_RND_TYP.RNDOFF.toMC();
		protected static final int DEC_PLACE = 8; 

		// 投入品ロット情報の最古入庫日をを品目、枝番１、枝番２、枝番３で取得するためのキャッシュ
		protected FXUCL_Cache<MST_LOT_R> _lotCache;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 上り電文編集
			editUp();
			// 検索対象の品目オーダを取得
			MCQueryPlan sql = MSBCL0360_MST_ITM_ORDER_S01();
			searchForDL(sql, up0(), down0(), Srch01_RsltR.$hrrchy);
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			selectRslt();
		}
		
		/**
		 *検索
		 * 
		 */
		protected void selectRslt() {
			//外注オーダについて数量設定
			setQty();

			// 検索結果対象の品目オーダに対する投入品を取得
			getInptItm();

			// 対象投入品のロット情報を取得し、キャッシュ
			srchLot();
			
			// 在庫推移検索サービスを実行（画面で入力された製造場所Gに存在するすべての在庫）
			MCList<RsltR> invList = getInvTransSrch().down1();

			// 製造引当制御マスタ参照のためのキーテーブルを作成
			creKeyTblAllocCtl();
			
			// 製造引当制御マスタから対象の投入品に対する引き当て場所を取得
			MCList<MAM_ALLOC_CTL_R> dbcL = MCList.create(MAM_ALLOC_CTL_R.class);
			executeQuery(dbcL, MSBCL0360_MAM_ALLOC_CTL_S01());

			// 在庫推移検索サービスを実行(製造引当制御マスタの場所のみで当たった分)
			MCList<MAM_ALLOC_CTL_R> allocCtlLocL = dbcL.subList(r -> isNull(r.itm_cd()));
			if (!allocCtlLocL.isEmpty()) {
				invList.addAll(getInvTransSrchAllocCtlLoc(allocCtlLocL).down1());
			}

			// 在庫推移検索サービスを実行(製造引当制御マスタの場所,品目で当たった分)
			MCList<MAM_ALLOC_CTL_R> allocCtlItmL = dbcL.subList(r -> !isNull(r.itm_cd()));
			if (!allocCtlItmL.isEmpty()) {
				invList.addAll(editInvListByAllocCtl(getInvTransSrchAllocCtlItm(allocCtlItmL).down1(), allocCtlItmL));
			}

			// 在庫推移リストの絞り込み
			invList = editInvList(invList);

			// 在庫推移リストから、自分自身の投入による出庫予定を除外する。(未確定出庫・出庫予定を考慮する検索を行った場合)
			if(up0().unfirm_out_flg() || up0().plan_out_flg()) {
				editInvList2(invList);
			}

			//投入品の引当可能在庫数を求める
			calcAllocAvlblInv(invList);

			//投入品ごとに引当数を求める
			calcAllocQty();

			//生産可能数を求める
			calcProdAvlbl();

			// 下り電文編集
			editDown();
		}
		
		/**
		 *上り電文編集
		 * 
		 */
		protected void editUp() {
			String DefWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(DefWgCd)) {
				up0().wg_cd(DefWgCd) ;
			}

			String DefMfgLocGrpCd = getSysParm("DEF_LOC_GRP_CD");
			if (!isNullOrNullVal(DefMfgLocGrpCd)) {
				up0().mfg_loc_grp_cd(DefMfgLocGrpCd) ;
			}

			//検索対象オーダに従って、SQL検索条件の設定
			if (up0().srchItemOrder().equals(MSC_ITM_ORD_TYP.MFG.key())) {
				up0().addStringColumn("WK_MFG", MSC_ITM_ORD_TYP.MFG.key());
				up0().addStringColumn("WK_OUTSRC", null);
				up0().addStringColumn("WK_MFGOUTSRC", null);
			}
			else if (up0().srchItemOrder().equals(MSC_ITM_ORD_TYP.OUTSRC.key())) {
				up0().addStringColumn("WK_MFG", null);
				up0().addStringColumn("WK_OUTSRC", MSC_ITM_ORD_TYP.OUTSRC.key());
				up0().addStringColumn("WK_MFGOUTSRC", null);
			}
			else if (up0().srchItemOrder().equals(MSC_ITM_ORD_TYP.MFG.key() + MSC_ITM_ORD_TYP.OUTSRC.key())) {
				up0().addStringColumn("WK_MFG", null);
				up0().addStringColumn("WK_OUTSRC", null);
				up0().addStringColumn("WK_MFGOUTSRC", MSC_ITM_ORD_TYP.MFG.key() + MSC_ITM_ORD_TYP.OUTSRC.key());
			}
			else {
				up0().addStringColumn("WK_MFG", null);
				up0().addStringColumn("WK_OUTSRC", null);
				up0().addStringColumn("WK_MFGOUTSRC", null);
			}
		}
		
		/**
		 *外注オーダで計画外レコードが作成された場合、計画外レコードの数量を設定する
		 * 
		 */
		protected void setQty() {
			
			MCList<Srch01_RsltR> outsrcL = down0().subList(Srch01_RsltR.$itm_ord_typ,MSC_ITM_ORD_TYP.OUTSRC.value());
			if(isNull(outsrcL)) {
				return;
			}

			MCList<MST_ITM_ORDER_R> ordL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T");
			MST_ITM_ORDER_R t2 = MST_ITM_ORDER_R.create("T2");
			MST_OPER_ORDER_R t3 = MST_OPER_ORDER_R.create("T3");
			MCQueryApiBuilder ordL_bldr = MCQueryApiBuilder.create(t1);

			ordL_bldr.setSelect(t1.io_schd_pr_no);
			ordL_bldr.addSum(t1.not_inst_qty, MST_ITM_ORDER_R.$not_inst_qty);
			ordL_bldr.addSum(t3.not_oper_schd_qty, MST_OPER_ORDER_R.$not_oper_schd_qty);

			ordL_bldr.setWhere(t1.io_schd_pr_no.eq(bind("itm_ord_no")));
			ordL_bldr.addWhereWithAnd(t1.itm_ord_no.eq(t3.itm_ord_no));
			ordL_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(t2)
					.where(value(0).eq(value(0)).and(t1.io_schd_pr_no.eq(t2.io_schd_pr_no))
							.and(MSC_ORD_GNRT_TYP$IS_UPLND(t2.ord_gnrt_typ).eq(value(true))))));

			ordL_bldr.addInnerJoin(t3, bracket(t3.itm_ord_no.eq(t1.itm_ord_no)));
			ordL_bldr.addGroupBy(t1.io_schd_pr_no);

			dbSelect("MSBCL0360_MST_ITM_ORDER_S02", ordL, ordL_bldr, outsrcL);

			//外注レコードが作成されている場合、数量を置換
			for (Srch01_RsltR r : outsrcL) {
				MST_ITM_ORDER_R x = ordL.getFirst(MST_ITM_ORDER_R.$io_schd_pr_no, r.itm_ord_no());
				if (!isNull(x)) {
					r.ord_qty(x.not_inst_qty().subtract(r.ord_qty()));
					r.not_oper_schd_qty(x.getNumber("not_oper_schd_qty").subtract(r.not_oper_schd_qty()));
				}
			}
		}

		/**
		 *検索結果対象の品目オーダに対する投入品を取得
		 * 
		 */
		protected void getInptItm() {
			//ＢＯＭ展開情報ワークをクリア
			MSW_BOM_EXP_R S0T = MSW_BOM_EXP_R.create("T");
			execDbWkDelete("MSBCL0360_MSW_BOM_EXP_D01", S0T);
			//ＢＯＭ展開情報ワークへインプット(品目オーダ情報)を投入
			insWk(down0());
			//ＢＯＭマスタのＷＧ(自ＷＧか共通(NULL文字)か)を決定
			setMstWgCd();
			//ＢＯＭ展開プロシージャ実行
			execBomExpProc();
			//ＢＯＭ展開結果情報ワークから結果を取得
			MCList<Ord_Sprt02_RsltR> rslt = MCList.create(Ord_Sprt02_RsltR.class);
			executeQuery(rslt, MSBCL0360_MSW_BOM_EXP_RSLT_S01());
			addAll(down0(), rslt, createMap_Srch01_RsltR_Ord_Sprt02_RsltR());
			down0().sort(Srch01_RsltR.$peg_no, Srch01_RsltR.$hrrchy, Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, 
						Srch01_RsltR.$itm_sub2,Srch01_RsltR.$itm_sub3,Srch01_RsltR.$schd_in_dt);
			MCNumber i = MCNumber.ZERO;
			for (Srch01_RsltR r :down0()) {
				//検索結果に対してシーケンスを振る
				r.seq_no(i);
				i = i.add(MCNumber.ONE);
				//必要数量の端数を切り上げる
				if (!isNull(r.need_qty())) {
					r.need_qty(r.need_qty().multiply(MCNumber.ONE, r.dec_place().intValue(), RND_MODE_UP));
				}
			}
		}
		
		/**
		 *ＢＯＭ展開情報ワークへインプット(品目オーダ情報)を投入
		 *@param  rsltL 親品目のリスト
		 *
		 */
		protected void insWk(MCList<Srch01_RsltR> rsltL) {
			MCList<MSW_BOM_EXP_R> bomExL = MCList.create(MSW_BOM_EXP_R.class);
			for (Srch01_RsltR r : rsltL) {
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
				row.oper_schd_qty(r.not_oper_schd_qty());
				row.mfg_st_schd_dt(r.mfg_st_schd_dt());
				row.st_schd_dt(r.st_schd_tm());
				row.end_schd_dt(r.end_schd_tm());
				row.sno1(r.sno1());
				row.sno2(r.sno2());
				row.sno3(r.sno3());
				row.sno4(r.sno4());
				bomExL.add(row);
			}
			dbInsertEx("MSBCL0360_MSW_BOM_EXP_I01", bomExL, MCQueryApiBuilder.create(MSW_BOM_EXP_R.create("T")));
		}
		
		/**
		 * ＢＯＭマスタのＷＧ(自ＷＧか共通(NULL文字)か)を決定
		 * 
		 */
		protected void setMstWgCd() {
			executeUpdate(MSBCL0360_MSW_BOM_EXP_U01());
		}
		
		/**
		 * ＢＯＭ展開プロシージャを実行する
		 * 
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
		
		protected Map_Srch01_RsltR_Ord_Sprt02_RsltR<Srch01_RsltR,Ord_Sprt02_RsltR> createMap_Srch01_RsltR_Ord_Sprt02_RsltR() {
			return new Map_Srch01_RsltR_Ord_Sprt02_RsltR<Srch01_RsltR, Ord_Sprt02_RsltR>();
		}

		public class Map_Srch01_RsltR_Ord_Sprt02_RsltR<D extends Srch01_RsltR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$schd_in_dt, Ord_Sprt02_RsltR.$schd_in_dt);
				addColumnPathMap(Srch01_RsltR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
				addColumnPathMap(Srch01_RsltR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
				addColumnPathMap(Srch01_RsltR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
				addColumnPathMap(Srch01_RsltR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
				addColumnPathMap(Srch01_RsltR.$itm_nm, Ord_Sprt02_RsltR.$itm_nm);
				addColumnPathMap(Srch01_RsltR.$sno1, Ord_Sprt02_RsltR.$sno1);
				addColumnPathMap(Srch01_RsltR.$sno2, Ord_Sprt02_RsltR.$sno2);
				addColumnPathMap(Srch01_RsltR.$sno3, Ord_Sprt02_RsltR.$sno3);
				addColumnPathMap(Srch01_RsltR.$sno4, Ord_Sprt02_RsltR.$sno4);
				addColumnPathMap(Srch01_RsltR.$itm_ord_no, Ord_Sprt02_RsltR.$itm_ord_no);
				addColumnPathMap(Srch01_RsltR.$alloc_ctl_typ, Ord_Sprt02_RsltR.$alloc_ctl_typ);
				addColumnPathMap(Srch01_RsltR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
				addColumnPathMap(Srch01_RsltR.$prov_typ, Ord_Sprt02_RsltR.$prov_typ);
				addColumnPathMap(Srch01_RsltR.$unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(Srch01_RsltR.$unit_nm, Ord_Sprt02_RsltR.$unit_nm);
				addColumnPathMap(Srch01_RsltR.$dec_place, Ord_Sprt02_RsltR.$dec_place);
				addColumnPathMap(Srch01_RsltR.$alt_itm_flg, Ord_Sprt02_RsltR.$alt_itm_flg);
				addColumnPathMap(Srch01_RsltR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
				addColumnPathMap(Srch01_RsltR.$alt_grp_nm, Ord_Sprt02_RsltR.$alt_grp_nm);
				addColumnPathMap(Srch01_RsltR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
				addColumnPathMap(Srch01_RsltR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
				addColumnPathMap(Srch01_RsltR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_itm_ratio);
				addColumnPathMap(Srch01_RsltR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
				addColumnPathMap(Srch01_RsltR.$peg_no, Ord_Sprt02_RsltR.$peg_no);
				addColumnPathMap(Srch01_RsltR.$need_qty , Ord_Sprt02_RsltR.$rqmt_qty);
				addColumnPathMap(Srch01_RsltR.$offst_typ , Ord_Sprt02_RsltR.$in_offst_typ);
				addColumnPathMap(Srch01_RsltR.$offst , Ord_Sprt02_RsltR.$in_offst);
				addColumnPathMap(Srch01_RsltR.$rnd_typ , Ord_Sprt02_RsltR.$unit_conv_rnd_typ);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_cd , Ord_Sprt02_RsltR.$loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.hrrchy(MCNumber.ONE);
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
				dest.addStringColumn(Ord_Sprt02_RsltR.$stk_mng_typ, src.stk_mng_typ());
			}
		}
		
		/**
		 *対象投入品のロット情報を取得し、キャッシュ
		 *
		 */
		protected void srchLot() {
			// ワークテーブルの作成
			MCList<MST_LOT_R> dbcL = MCList.create(MST_LOT_R.class);
			for (Srch01_RsltR r : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)
										.groupBy(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3)) {
				MST_LOT_R dbcR = MST_LOT_R.create();
				dbcR.itm_cd(r.itm_cd());
				dbcR.itm_sub1(r.itm_sub1());
				dbcR.itm_sub2(r.itm_sub2());
				dbcR.itm_sub3(r.itm_sub3());
				dbcL.add(dbcR);
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
				dbWkDelete("MSBCL0360_MSW_LOT_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL0360_MSW_LOT_I01", dbcL, dbcL_bldr.getBaseDbc());
			}

			// テーブル取得
			MCList<MST_LOT_R> tblL = MCList.create(MST_LOT_R.class);
			executeQuery(tblL, MSBCL0360_MST_LOT_S01());

			_lotCache = new FXUCL_Cache<MST_LOT_R>();
			_lotCache.setFixMaxCacheSize(-1);
			
			// 品目、枝番１、枝番２、枝番３をキーとしてキャッシュ
			for (MST_LOT_R r : tblL) {
				_lotCache.putCache(new Comparable<?>[] {r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()}, r);
			}
		}

		/**
		 *製造引当制御マスタ参照のためのキーテーブルを作成
		 * 
		 */
		protected void creKeyTblAllocCtl() {
			MCList<MAM_ALLOC_CTL_R> wkL = MCList.create(MAM_ALLOC_CTL_R.class);
			MCList<Srch01_RsltR> srch01_ResltR = down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)
														.groupBy(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, 
																Srch01_RsltR.$itm_sub3, Srch01_RsltR.$mfg_loc_cd);
			for (Srch01_RsltR lst1R :srch01_ResltR) {
				MAM_ALLOC_CTL_R wkLR = MAM_ALLOC_CTL_R.create();
				wkLR.to_loc_cd(lst1R.mfg_loc_cd());
				wkLR.itm_cd(lst1R.itm_cd());
				wkLR.itm_sub1(lst1R.itm_sub1());
				wkLR.itm_sub2(lst1R.itm_sub2());
				wkLR.itm_sub3(lst1R.itm_sub3());
				wkL.add(wkLR);
			}
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_ALLOC_CTL_R.create("T"));
				dbWkDelete("MSBCL0360_MAW_ALLOC_CTL_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL0360_MAW_ALLOC_CTL_I01", wkL, wkL_bldr.getBaseDbc());
			}
		}

		/**
		 * 在庫推移リストの絞り込み
		 * @param invList 在庫推移検索サービスから取得したリスト
		 * @return invListの編集結果
		 * 
		 */
		protected MCList<RsltR> editInvList(MCList<RsltR> invList) {
			//製造場所G単位で検索したものと製造引当マスタから検索したものの重複をカット
			MCList<RsltR> invListDupCut = MCList.create(RsltR.class);
			invListDupCut = invList.distinctNE(RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$ver_flg,
										RsltR.$sno1, RsltR.$sno2, RsltR.$sno3, RsltR.$sno4, RsltR.$ver_no, RsltR.$loc_cd,
										RsltR.$site_cd, RsltR.$wg_cd, RsltR.$lg_grp_cd, RsltR.$alloc_grp_cd,
										RsltR.$loc_grp_cd, RsltR.$dt);
			
			//在庫推移リストを検索対象投入品のみに絞り込む
			MCIndexKey Key = invListDupCut.createIndex(RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3);
			MCList<RsltR> invListTmp = MCList.create(RsltR.class);
			for (Srch01_RsltR rsltLR : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)
											.groupBy(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3)){
				invListTmp.addAll(invListDupCut.subList(Key, new Comparable [] {rsltLR.itm_cd(), rsltLR.itm_sub1(),rsltLR.itm_sub2(),rsltLR.itm_sub3()}));
				
			}
			return invListTmp;
		}
		/**
		 * 在庫推移リストから、自分自身の投入による出庫予定を除外する。(未確定出庫・出庫予定を考慮する検索を行った場合)
		 * @param invList 在庫推移検索サービスから取得したリスト
		 * 
		 */
		protected void editInvList2(MCList<RsltR> invList) {
			//在庫推移を詳細モードで検索
			MCList<RsltR> invListDtl  = getInvTransSrchDtl().down1();

			//検索結果レコードから検索対象製造品の品目オーダＮＯを抽出する。
			MCIndexKey Key = invListDtl.createIndex(RsltR.$par_itm_ord_no);
			MCList<RsltR> invListDtltmp = MSBEL_InvTransService.crtInvTrans_Srch03().down1();
			//詳細モードで検索した在庫推移リストから、検索対象製造品の品目オーダＮＯのもののみのリストを作成する。
			for (Srch01_RsltR rsltLR : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE).groupBy(Srch01_RsltR.$itm_ord_no)) {
				invListDtltmp.addAll(invListDtl.subList(Key, rsltLR.itm_ord_no()));
			}
			invListDtltmp = invListDtltmp.subList(r ->  (MSC_IO_SCHD_TYP.isINPT_PLN(r.io_schd_typ()) && MSC_IO_SCHD_STS_TYP.isOPN(r.io_schd_sts_typ()))  ||     //受払予定区分：投入計画、受払予定状況区分：未確定
														(MSC_IO_SCHD_TYP.isINPT_PLN(r.io_schd_typ()) && MSC_IO_SCHD_STS_TYP.isORD_SAV(r.io_schd_sts_typ()))  || //受払予定区分：投入計画、受払予定状況区分：オーダ保存
														(MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ()) && MSC_IO_SCHD_STS_TYP.isFIX(r.io_schd_sts_typ()))  ||         //受払予定区分：投入、受払予定状況区分：依頼
														(MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ()) && MSC_IO_SCHD_STS_TYP.isSCHD(r.io_schd_sts_typ()))  ||        //受払予定区分：投入、受払予定状況区分：予定
														(MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ()) && MSC_IO_SCHD_STS_TYP.isMFG_SAV(r.io_schd_sts_typ()))         //受払予定区分：投入、受払予定状況区分：製造保存
												);
			//出庫予定が存在する日以降の在庫数に投入による出庫予定分を足す。（当処理の仮想引当で計算するため）
			for (RsltR invListDtltmpR : invListDtltmp) {
				for (RsltR invListR : invList.subList(new String[] {RsltR.$itm_cd, RsltR.$itm_sub1,RsltR.$itm_sub2,
														RsltR.$itm_sub3,RsltR.$sno1,RsltR.$sno2,RsltR.$sno3,RsltR.$sno4,RsltR.$loc_cd},
													new Comparable[] {invListDtltmpR.itm_cd(), invListDtltmpR.itm_sub1(),invListDtltmpR.itm_sub2(),
														invListDtltmpR.itm_sub3(),invListDtltmpR.sno1(),invListDtltmpR.sno2(),invListDtltmpR.sno3(),
														invListDtltmpR.sno4(),invListDtltmpR.loc_cd()})) {
					if (!isNull(invListR.dt())) {
						if (invListR.dt().gte(invListDtltmpR.dt())){
							invListR.stk_qty(invListR.stk_qty().add(invListDtltmpR.gi_schd_qty()));
						}
					}
				}
			}
		}
		
		/**
		 *投入品の引当可能在庫数を求める
		 * @param invList 在庫推移検索サービスから取得したリスト
		 * 
		 */
		protected void calcAllocAvlblInv(MCList<RsltR> invList) {
			//投入品レコードに引当可能在庫数をセット
			MCIndexKey Key = invList.createIndex(RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$dt);
			for (Srch01_RsltR rsltLR : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)) {
				Comparable<?>[] vals = new Comparable[]{rsltLR.itm_cd(), rsltLR.itm_sub1(), rsltLR.itm_sub2(), rsltLR.itm_sub3(), rsltLR.schd_in_dt()};
				MCGroupByPolicy gp = new MCGroupByPolicy();
				gp.addKey(new String[]{RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$sno1, RsltR.$sno2, RsltR.$sno3, RsltR.$sno4, RsltR.$dt});
				gp.sum(new String[]{RsltR.$stk_qty});
				MCList<RsltR> invListTmp = invList.subList(Key, vals).groupBy(gp);
				//該当の投入行に対して、品目・枝番・手配ＮＯ・投入予定日まで一致する在庫推移リストがあるか
				RsltR invOwn = invListTmp.getFirst(new String[]{RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$sno1, RsltR.$sno2, RsltR.$sno3, RsltR.$sno4, RsltR.$dt},
						new Comparable[]{rsltLR.itm_cd(), rsltLR.itm_sub1(), rsltLR.itm_sub2(), rsltLR.itm_sub3(), rsltLR.sno1(), rsltLR.sno2(), rsltLR.sno3(), rsltLR.sno4(), rsltLR.schd_in_dt()});
				//引当可能数のセット
				setAllocAvlblQty(rsltLR, invOwn);

				//該当の投入行に対して、引当可能な手配ＮＯ違いのレコードを一時的に結果レコードに追加する(引当計算用に)
				MCList<Srch01_RsltR> snoList = judgeSno(rsltLR);
				for (Srch01_RsltR r : snoList) { 
					RsltR invOtherSno = invListTmp.getFirst(new String[]{RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$sno1, RsltR.$sno2, RsltR.$sno3, RsltR.$sno4, RsltR.$dt},
							new Comparable[]{r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(), r.sno4(), r.schd_in_dt()});
					Srch01_RsltR addR = Srch01_RsltR.create();
					Srch01_RsltR.copyall(addR, rsltLR);
					addR.sno1(r.sno1());
					addR.sno2(r.sno2());
					addR.sno3(r.sno3());
					addR.sno4(r.sno4());
					//引当可能数のセット
					setAllocAvlblQty(addR, invOtherSno);
					addR.no_output_flg(true);
					down0().add(addR);
				}
			}
		}
		
		/**
		 *引当可能数のセット
		 * @param result 引当可能数をセットするrow
		 * @param inv 引当可能数をセットする対象の在庫リストのrowト
		 * 
		 */
		protected void setAllocAvlblQty(Srch01_RsltR result, RsltR inv) { 
			if (!isNull(inv)) {
				result.alloc_avlbl_qty(inv.stk_qty());
			}
			else {
				result.alloc_avlbl_qty(MCNumber.ZERO);
			}
		}

		/**
		 *手配ＮＯ区分を元に引当可能な手配ＮＯを決定する
		 * @param rsltLR 引当可能な手配ＮＯを抽出するためのrow
		 * @return 引当可能な手配ＮＯのリスト
		 * 
		 */
		protected MCList<Srch01_RsltR> judgeSno(Srch01_RsltR rsltLR) {
			MCList<Srch01_RsltR> snoList = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> snoListTmp = MCList.create(Srch01_RsltR.class);
			if (rsltLR.sno1_null_flg() || rsltLR.sno2_null_flg() || rsltLR.sno3_null_flg() || rsltLR.sno4_null_flg()) {
				//対象の手配ＮＯを決定する
				snoList.add(rsltLR);
				if (rsltLR.sno1_null_flg()) {
					snoListTmp = snoList.clone();
					snoListTmp.setStringNE(Srch01_RsltR.$sno1, MAC_STR.NULL_VAL.value());
					snoList.addAll(snoListTmp);
				}
				if (rsltLR.sno2_null_flg()) {
					snoListTmp = snoList.clone();
					snoListTmp.setStringNE(Srch01_RsltR.$sno2, MAC_STR.NULL_VAL.value());
					snoList.addAll(snoListTmp);
				}
				if (rsltLR.sno3_null_flg()) {
					snoListTmp = snoList.clone();
					snoListTmp.setStringNE(Srch01_RsltR.$sno3, MAC_STR.NULL_VAL.value());
					snoList.addAll(snoListTmp);
				}
				if (rsltLR.sno4_null_flg()) {
					snoListTmp = snoList.clone();
					snoListTmp.setStringNE(Srch01_RsltR.$sno4, MAC_STR.NULL_VAL.value());
					snoList.addAll(snoListTmp);
				}
				snoList = snoList.distinctNE(Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3, Srch01_RsltR.$sno4)
								.subList(r -> !(r.sno1().equals(rsltLR.sno1()) && r.sno2().equals(rsltLR.sno2()) && r.sno3().equals(rsltLR.sno3()) && r.sno4().equals(rsltLR.sno4())));
			}
			return snoList;
		}

		/**
		 *投入品の引当数を求める
		 * 
		 */
		protected void calcAllocQty() {
			for (Srch01_RsltR rsltR : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ZERO)) {
				//代替品のリスト
				MCList<Srch01_RsltR> inptListAlt = down0().subList(new String[] {Srch01_RsltR.$peg_no, Srch01_RsltR.$hrrchy} , 
																	new Comparable<?>[] {rsltR.peg_no(),MCNumber.ONE})
														.subList(r -> !isNull(r.alt_grp_cd()))
														.subList(r -> !r.no_output_flg());
				//通常品のリスト
				MCList<Srch01_RsltR> inptListNoAlt = down0().subList(new String[] {Srch01_RsltR.$peg_no, Srch01_RsltR.$hrrchy} , 
																	new Comparable<?>[] {rsltR.peg_no(),MCNumber.ONE})
														.subList(r -> isNull(r.alt_grp_cd()))
														.subList(r -> !r.getBooleanNE("no_output_flg"));
				//代替品の引当
				MCIndexKey key = inptListAlt.createIndex(Srch01_RsltR.$alt_grp_cd,Srch01_RsltR.$alt_grp_seq);
				for (Srch01_RsltR inptListR : inptListAlt.groupBy(Srch01_RsltR.$alt_grp_cd, Srch01_RsltR.$alt_grp_seq)) {
					MCList<Srch01_RsltR> AltGList = inptListAlt.subList(key, inptListR.alt_grp_cd(), inptListR.alt_grp_seq());
					//代替品の引当数を求める
					calcAlt(AltGList);
				}
				//通常投入品の引当
				for (Srch01_RsltR inptListR : inptListNoAlt) {
					if (calcTargetInpt(inptListR)) {
						if (inptListR.alloc_avlbl_qty().gte(inptListR.need_qty())) {
							//引当可能数 >= 必要数のときは、引当数に必要数をすべてセット（充足）
							inptListR.alloc_qty(inptListR.need_qty());
							//引当可能数再計算
							reCalcAllocAvlblQty(inptListR);
						}
						else {
							//引当可能数 >= 必要数でないときは、引当数に引当可能数をすべてセット（残りの在庫で引当てられるだけ引き当てる）
							inptListR.alloc_qty(inptListR.alloc_avlbl_qty());
							//引当可能数再計算
							reCalcAllocAvlblQty(inptListR);
							//手配ＮＯ違いの引当
							allocOtherSno(inptListR, inptListR.need_qty());
						}
					}
				}
				
			}
		}

		/**
		 *手配ＮＯ違いの引当
		 * @param row 処理対象のrow
		 * @param needQty 処理対象行の必要数量
		 * 
		 */
		protected void allocOtherSno(Srch01_RsltR row, MCNumber needQty) {
			MCNumber remNeedQty = needQty.subtract(row.alloc_qty());
			MCList<Srch01_RsltR> OtherSnoList = down0().subList(Srch01_RsltR.$seq_no , row.seq_no()).subList(r -> r.no_output_flg());
			//手配Noの降順にソートして、手配Noが設定されているものから引き当てる
			OtherSnoList.sort(SortType.DESC, Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3, Srch01_RsltR.$sno4);
			for(Srch01_RsltR r : OtherSnoList) {
				//表示対象手配ＮＯの引当可能在庫数に、手配違いの引当可能在庫数を足しこむ
				row.alloc_avlbl_qty(row.alloc_avlbl_qty().add(r.alloc_avlbl_qty()));
				if (r.alloc_avlbl_qty().gte(remNeedQty)) {
					//引当可能数 >= 必要数のときは、引当数に必要数をすべてセット（充足）
					r.alloc_qty(remNeedQty.multiply(MCNumber.ONE, row.dec_place().intValue(), MAC_RND_TYP.toMC(row.rnd_typ())));
					row.alloc_qty(row.alloc_qty().add(r.alloc_qty()));
					//引当可能数再計算
					reCalcAllocAvlblQty(r);
				}
				else {
					//引当可能数 >= 必要数でないときは、引当数に引当可能数をすべてセット（残りの在庫で引当てられるだけ引き当てる）
					r.alloc_qty(r.alloc_avlbl_qty());
					row.alloc_qty(row.alloc_qty().add(r.alloc_qty()));
					//引当可能数再計算
					reCalcAllocAvlblQty(r);
				}
				remNeedQty = remNeedQty.subtract(r.alloc_qty());
				if (remNeedQty.lte(MCNumber.ZERO)){ 
					remNeedQty = MCNumber.ZERO;
				}
			}
		}

		/**
		 *代替品の引当数を求める
		 * @param list 処理対象の代替品Ｇのリスト
		 * 
		 */
		protected void calcAlt(MCList<Srch01_RsltR> list) {
			//混在可
			if (MAC_ALT_ITM_TYP.isMIX(list.get(0).alt_itm_typ())) {
				list.sort(Srch01_RsltR.$alt_alloc_prio, Srch01_RsltR.$seq_no);
				allocAltItmMix(list);
			}
			//混在不可（引当優先順）
			if (MAC_ALT_ITM_TYP.isMONO_PRIO(list.get(0).alt_itm_typ())) {
				list.sort(Srch01_RsltR.$alt_alloc_prio, Srch01_RsltR.$seq_no);
				allocAltItmNoMix(list);
			}
			
			//混在不可（最古入庫日優先順）
			if (MAC_ALT_ITM_TYP.isMONO_FIFO(list.get(0).alt_itm_typ())) {
				//各代替品の最古入庫日の取得
				for (Srch01_RsltR resultR : list) {
					MST_LOT_R lotR = _lotCache.getCache(resultR.itm_cd(), resultR.itm_sub1(), resultR.itm_sub2(), resultR.itm_sub3());
					if(!isNull(lotR)) {
						resultR.setDateNE("first_gr_dt", lotR.first_gr_dt());
					}
					else {
						resultR.setDateNE("first_gr_dt", new MCDate().endTimeOfDay());
					}
				}
				list.sort("first_gr_dt", Srch01_RsltR.$alt_alloc_prio, Srch01_RsltR.$seq_no);
				allocAltItmNoMix(list);
			}
		}

		/**
		 *引当対象投入品チェック
		 * @param list 処理対象のrow
		 * @return 引当計算対象の場合true
		 * 
		 */
		protected Boolean calcTargetInpt(Srch01_RsltR r) {
			if (!MAC_PROV_TYP.isSS((String)r.getValue("prov_typ")) &&                   //支給区分が"自給"は引当数計算対象外
				!MAC_INPT_CTL_TYP.isNO_MRP_INST((String)r.getValue("inpt_ctl_typ")) &&  //投入制御区分が、"ＭＲＰ対象外（指図書のみ）"は引当数計算対象外
				!MAC_STK_MNG_TYP.isNOT_MNG((String)r.getValue("stk_mng_typ"))) {        //在庫管理区分が、"在庫管理しない"は引当数計算対象外
				return true;
			}
			r.not_target_flg(true);
			return false;
		}

		/**
		 *混在可代替品の引当
		 * @param list 処理対象の代替品Ｇのリスト
		 * 
		 */
		protected void allocAltItmMix(MCList<Srch01_RsltR> list) {
			MCNumber allocPercentage = MCNumber.ZERO;
			MCNumber tmpNeedQty = MCNumber.ZERO;
			for (Srch01_RsltR resultR : list) {
				if (!allocPercentage.gt(MCNumber.ONE) && calcTargetInpt(resultR)) {
					//当行時点での必要数
					tmpNeedQty = resultR.need_qty().multiply(MCNumber.ONE.subtract(allocPercentage));
					if (resultR.alloc_avlbl_qty().gte(tmpNeedQty)) {
						//引当可能数 >= 必要数のときは、引当数に必要数をすべてセット（充足）
						resultR.alloc_qty(tmpNeedQty.multiply(MCNumber.ONE, resultR.dec_place().intValue(), MAC_RND_TYP.toMC(resultR.rnd_typ())));
						//引当可能数再計算
						reCalcAllocAvlblQty(resultR);
					}
					else {
						//引当可能数 >= 必要数でないときは、引当数に引当可能数をすべてセット（残りの在庫で引当てられるだけ引き当てる）
						resultR.alloc_qty(resultR.alloc_avlbl_qty());
						//引当可能数再計算
						reCalcAllocAvlblQty(resultR);
						//手配ＮＯ違いの引当
						allocOtherSno(resultR, tmpNeedQty);
					}
					resultR.select_alt_flg(true);
					//当行時点までで引き当てた割合
					if (!resultR.alloc_qty().isZero() && !resultR.need_qty().isZero()) {
						allocPercentage = allocPercentage.add(resultR.alloc_qty().divide(resultR.need_qty(), DEC_PLACE, RND_MODE_UP));
					}
				}
			}
		}

		/**
		 *混在不可代替品の引当
		 * @param list 処理対象の代替品Ｇのリスト
		 * 
		 */
		protected void allocAltItmNoMix(MCList<Srch01_RsltR> list) {
			//対象代替品の決定
			for (Srch01_RsltR resultR : list) {
				if (calcTargetInpt(resultR)) {
					if (!resultR.alloc_avlbl_qty().eq(MCNumber.ZERO) && isNull(list.getFirst(Srch01_RsltR.$select_alt_flg, true))) {
						resultR.select_alt_flg(true);
					}
					else {
						resultR.not_target_flg(true);
					}
				}
			}
			if (!(Boolean)list.max(Srch01_RsltR.$select_alt_flg)) {
				Srch01_RsltR r = list.get(0);
				r.select_alt_flg(true);
				r.not_target_flg(false);
			}
			//対象代替品の引当
			Srch01_RsltR resultR = list.getFirst(Srch01_RsltR.$select_alt_flg, true);
			if (resultR.alloc_avlbl_qty().gte(resultR.need_qty())) {
				//引当可能数 >= 必要数のときは、引当数に必要数をすべてセット（充足）
				resultR.alloc_qty(resultR.need_qty());
				//引当可能数再計算
				reCalcAllocAvlblQty(resultR);
			}
			else {
				//引当可能数 >= 必要数でないときは、引当数に引当可能数をすべてセット（残りの在庫で引当てられるだけ引き当てる）
				resultR.alloc_qty(resultR.alloc_avlbl_qty());
				//引当可能数再計算
				reCalcAllocAvlblQty(resultR);
				//手配ＮＯ違いの引当
				allocOtherSno(resultR, resultR.need_qty());
			}
		}
		
		/**
		 *引当可能数再計算
		 * @param row 処理対象のrow
		 * 
		 */
		protected void reCalcAllocAvlblQty(Srch01_RsltR row) {
			String[] keys = {Srch01_RsltR.$itm_cd,Srch01_RsltR.$itm_sub1,Srch01_RsltR.$itm_sub2,Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$sno1,Srch01_RsltR.$sno2,Srch01_RsltR.$sno3,Srch01_RsltR.$sno4};
			Comparable<?>[] vals = new  Comparable<?>[] {row.itm_cd(),row.itm_sub1(),row.itm_sub2(),row.itm_sub3(),
														row.sno1(),row.sno2(),row.sno3(),row.sno4()};
			MCList<Srch01_RsltR> list = down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)
										.subList(keys, vals)
										.subList(r -> r.schd_in_dt().gte(row.schd_in_dt()))
										.subList(r -> r.seq_no().gt(row.seq_no()));
			
			//負数であれば、引当可能在庫数量の再計算後に引当数量を再設定する。
			boolean Negative_flg = false;
			if (row.alloc_avlbl_qty().isNegative()) {
				row.alloc_avlbl_qty(MCNumber.ZERO);
				row.alloc_qty(row.need_qty());
				Negative_flg = true;
			}
			
			for (Srch01_RsltR listR : list) {
				MCNumber reCalcQty = MCNumber.ZERO;
				//引当数量が必要数量に満たない場合でも、内部的には必要数量を減算した数値を保持しておく。
				if (row.need_qty().gte(row.alloc_qty())) {
					reCalcQty = listR.alloc_avlbl_qty().subtract(row.need_qty());
				}
				else {
					reCalcQty = listR.alloc_avlbl_qty().subtract(row.alloc_qty());
				}
				listR.alloc_avlbl_qty(reCalcQty);
			}
			
			if (Negative_flg) {
				row.alloc_qty(MCNumber.ZERO);
			}
		}

		/**
		 *生産可能数を求める
		 * 
		 */
		protected void calcProdAvlbl() {
			//検索対象品目オーダＮＯののリスト(ループ用)
			for (Srch01_RsltR rsltR : down0().groupBy(Srch01_RsltR.$itm_ord_no)) {
				MCList<Srch01_RsltR> lstPar = down0().subList(new String[] {Srch01_RsltR.$itm_ord_no,Srch01_RsltR.$hrrchy},
															new Comparable[] {rsltR.itm_ord_no(),MCNumber.ZERO});
				MCList<Srch01_RsltR> lstChd = down0().subList(new String[] {Srch01_RsltR.$itm_ord_no,Srch01_RsltR.$hrrchy},
															new Comparable[] {rsltR.itm_ord_no(),MCNumber.ONE})
													.subList(r -> !r.no_output_flg());
				MCList<Srch01_RsltR> lstChdAlt = lstChd.subList(r -> !isNull(r.alt_grp_cd()));
				MCList<Srch01_RsltR> lstChdNotAlt = lstChd.subList(r -> isNull(r.alt_grp_cd()));
				MCIndexKey key = lstChdAlt.createIndex(Srch01_RsltR.$alt_grp_cd,Srch01_RsltR.$alt_grp_seq);
				for (Srch01_RsltR lstParR : lstPar) {
					//代替
					for (Srch01_RsltR lst3R : lstChdAlt.groupBy(Srch01_RsltR.$alt_grp_cd,Srch01_RsltR.$alt_grp_seq)) {
						//同一代替G、代替連番ごとに処理
						MCList<Srch01_RsltR> tmpList = lstChdAlt.subList(key, lst3R.alt_grp_cd(),lst3R.alt_grp_seq());
						MCNumber prod_avbal = MCNumber.ZERO;
						for (Srch01_RsltR tmpListR : tmpList.subList(Srch01_RsltR.$select_alt_flg, true)) {
							//該当レコードの代替品引当数で生産可能な親の数量を求める
							if (!lstParR.ord_qty().isZero()) {
								tmpListR.addNumberColumn("prod_avlbl_qty_ko",
										(tmpListR.alloc_qty().multiply(lstParR.ord_qty())
												.divide(tmpListR.need_qty(),
														tmpListR.dec_place().intValue(),
														MAC_RND_TYP.toMC(tmpListR.rnd_typ()))));
								prod_avbal = prod_avbal.add(tmpListR.getNumberNE("prod_avlbl_qty_ko"));

							}
						}
						//代替品グループ全体の引当数で生産可能な親の数量を求める
						prod_avbal = prod_avbal.multiply(MCNumber.ONE, lstParR.dec_place().intValue(), RND_MODE_DOWN);
						
						for (Srch01_RsltR tmpListR : tmpList) {
							//部品状況判定
							setPurcItmSts(lstParR, tmpListR, prod_avbal);
						}
					}
					//代替以外
					for (Srch01_RsltR lstChdNotAltR : lstChdNotAlt) {
						MCNumber prod_avbal = MCNumber.ZERO;
						if (!lstChdNotAltR.not_target_flg()) {
							//該当レコードの投入品引当数で生産可能な親の数量を求める
							if (!lstParR.ord_qty().isZero()) {
								lstChdNotAltR.addNumberColumn("prod_avlbl_qty_ko",
										(lstChdNotAltR.alloc_qty().multiply(lstParR.ord_qty())
												.divide(lstChdNotAltR.need_qty(),
														lstChdNotAltR.dec_place().intValue(),
														MAC_RND_TYP.toMC(lstChdNotAltR.rnd_typ()))));
								prod_avbal = lstChdNotAltR.getNumberNE("prod_avlbl_qty_ko").multiply(MCNumber.ONE, lstParR.dec_place().intValue(), RND_MODE_DOWN);
							}
						}
						//部品状況判定
						setPurcItmSts(lstParR, lstChdNotAltR, prod_avbal);
					}
					
					//生産可否状況判定
					setProdAvlblSts(lstParR, lstChd);
				}
			}
		}
		/**
		 *部品状況判定
		 * @param parentR    親品目のrow
		 * @param childR     処理対象投入品のrow
		 * @param prod_avbal 処理対象投入品のrowの引当数で生産可能な親品目の数
		 * 
		 */
		protected void setPurcItmSts(Srch01_RsltR parentR, Srch01_RsltR childR, MCNumber prod_avbal) {
			if (parentR.ord_qty().lte(childR.getNumberNE("prod_avlbl_qty_ko"))) {
				if (childR.not_target_flg()) {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.NOT_APPLY.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", null);
				}
				else {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.PARTS_ALL.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", prod_avbal);
				}
			}
			else if(MCNumber.ZERO.eq(childR.getNumberNE("prod_avlbl_qty_ko"))){
				if (childR.not_target_flg()) {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.NOT_APPLY.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", null);
				}
				else {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.PARTS_NONE.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", prod_avbal);
				}
			}
			else {
				if (childR.not_target_flg()) {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.NOT_APPLY.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", null);
				}
				else {
					childR.purc_itm_sts(MSC_PARTS_STS_STR.PARTS_SOME.name(getUsrLocale()));
					childR.addNumberColumn("prod_avlbl_qty_ko", prod_avbal);
				}
			}
		}
		/**
		 *生産可否状況判定
		 * @param parentR   親品目のrow
		 * @param childList 親品目のrowに紐づく投入品のリスト
		 * 
		 */
		protected void setProdAvlblSts(Srch01_RsltR parentR, MCList<Srch01_RsltR> childList) {
			parentR.prod_avlbl_qty((MCNumber)childList.min("prod_avlbl_qty_ko"));
			if(isNull(parentR.prod_avlbl_qty())) {
				//全投入品が引当計算対象外
				parentR.prod_avlbl_sts(MSC_PROD_AVLBL_STR.PROD_ALL.name(getUsrLocale()));
				parentR.prod_avlbl_qty(parentR.ord_qty());
			}
			else if(parentR.prod_avlbl_qty().gte(parentR.ord_qty())) {
				parentR.prod_avlbl_sts(MSC_PROD_AVLBL_STR.PROD_ALL.name(getUsrLocale()));
			}
			else if(parentR.prod_avlbl_qty().eq(MCNumber.ZERO)) {
				parentR.prod_avlbl_sts(MSC_PROD_AVLBL_STR.PROD_NONE.name(getUsrLocale()));
			}
			else {
				parentR.prod_avlbl_sts(MSC_PROD_AVLBL_STR.PROD_SOME.name(getUsrLocale()));
			}
		}

		/**
		 *下り電文編集
		 * 
		 */
		protected void editDown() {
			//工程オーダＮＯ、工程コード、工程連番を子品目へ引き継ぎ
			MCIndexKey key = down0().createIndex(Srch01_RsltR.$peg_no,Srch01_RsltR.$hrrchy);
			for (Srch01_RsltR r : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ZERO)) {
				MCList<Srch01_RsltR> l = down0().subList(key, new Comparable[]{r.peg_no(),MCNumber.ONE });
				l.setString(Srch01_RsltR.$oper_ord_no, r.oper_ord_no());
				l.setString(Srch01_RsltR.$oper_cd, r.oper_cd());
				l.setString(Srch01_RsltR.$oper_nm, r.oper_nm());
				l.setNumber(Srch01_RsltR.$oper_seq, r.oper_seq());
			}
			//複数工程存在する製造品の親品目レコードを1行に集約
			for (Srch01_RsltR r : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ZERO).groupBy(Srch01_RsltR.$itm_ord_no)) {
				MCList<Srch01_RsltR> l = down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ZERO).subList(Srch01_RsltR.$itm_ord_no, r.itm_ord_no());
				Srch01_RsltR firstRow = l.get(0);
				for (Srch01_RsltR row : l) {
					if (!row.equals(firstRow)) {
						down0().remove(row);
					}
				}
			}
			//親品目レコードから表示不要な値を削除
			for (Srch01_RsltR r : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ZERO)) {
				r.oper_cd(null);
				r.oper_nm(null);
				r.oper_seq(null);
			}
			//子品目レコードから表示不要な値を削除
			for (Srch01_RsltR r : down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE)) {
				r.itm_ord_no(null);
				r.mfg_loc_cd(null);
			}
			//引当計算用に保持しておいた手配ＮＯ違いのレコードを削除する
			down0().removeIf(r -> (boolean)r.getValueNE("no_output_flg"));
			//出力用にソート
			down0().sort(Srch01_RsltR.$peg_no, Srch01_RsltR.$hrrchy, Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, 
					Srch01_RsltR.$itm_sub2,Srch01_RsltR.$itm_sub3,Srch01_RsltR.$schd_in_dt);

		}
		
		/**
		 *在庫推移検索サービスの呼び出し（製造場所Gに存在するすべての在庫）
		 * @return 検索結果在庫推移リスト
		 * 
		 */
		protected MSBEL_InvTransService.InvTrans_Srch03 getInvTransSrch() {
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = MSBEL_InvTransService.crtInvTrans_Srch03();
			setCommonParam(invTransSrch03);
			invTransSrch03.up0().dtl_flg(false);
			
			invTransSrch03.exec();
			
			return invTransSrch03;
		}

		/**
		 *在庫推移検索サービスの呼び出し（製造引当制御マスタの場所に存在する在庫）
		 * @param dbcLR 製造引当制御マスタ検索結果のrow
		 * @return 検索結果在庫推移リスト
		 * 
		 */
		protected MSBEL_InvTransService.InvTrans_Srch03 getInvTransSrchAllocCtlLoc(MCList<MAM_ALLOC_CTL_R> dbcL) {	
			
			List<String> cndLocCdL = dbcL.groupBy(MAM_ALLOC_CTL_R.$fr_loc_cd).getStringNE(MAM_ALLOC_CTL_R.$fr_loc_cd);
			String cndLocCdStr = MCStringUtil.arrayValueJoin(cndLocCdL.toArray(new String[cndLocCdL.size()]));
			
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = MSBEL_InvTransService.crtInvTrans_Srch03();
			setCommonParam(invTransSrch03);
			invTransSrch03.up0().wg_cd(null);
			invTransSrch03.up0().loc_grp_cd(null);
			invTransSrch03.up0().loc_cd(cndLocCdStr);
			invTransSrch03.up0().dtl_flg(false);
			
			invTransSrch03.exec();
			
			return invTransSrch03;
		}
		
		/**
		 *在庫推移検索サービスの呼び出し（製造引当制御マスタの場所・品目に存在する在庫）
		 * @param dbcLR 製造引当制御マスタ検索結果のrow
		 * @return 検索結果在庫推移リスト
		 * 
		 */
		protected MSBEL_InvTransService.InvTrans_Srch03 getInvTransSrchAllocCtlItm(MCList<MAM_ALLOC_CTL_R> dbcL) {	
			List<String> cndLocCdL = dbcL.groupBy(MAM_ALLOC_CTL_R.$fr_loc_cd).getStringNE(MAM_ALLOC_CTL_R.$fr_loc_cd);
			List<String> cndItmCdL = dbcL.groupBy(MAM_ALLOC_CTL_R.$itm_cd).getStringNE(MAM_ALLOC_CTL_R.$itm_cd);
			List<String> cndSub1L = dbcL.groupBy(MAM_ALLOC_CTL_R.$itm_sub1).getStringNE(MAM_ALLOC_CTL_R.$itm_sub1);
			List<String> cndSub2L = dbcL.groupBy(MAM_ALLOC_CTL_R.$itm_sub2).getStringNE(MAM_ALLOC_CTL_R.$itm_sub2);
			List<String> cndSub3L = dbcL.groupBy(MAM_ALLOC_CTL_R.$itm_sub3).getStringNE(MAM_ALLOC_CTL_R.$itm_sub3);
			String cndLocCdStr = MCStringUtil.arrayValueJoin(cndLocCdL.toArray(new String[cndLocCdL.size()]));
			String cndItmCdStr = MCStringUtil.arrayValueJoin(cndItmCdL.toArray(new String[cndItmCdL.size()]));
			String cndSub1CdStr = MCStringUtil.arrayValueJoin(cndSub1L.toArray(new String[cndSub1L.size()]));
			String cndSub2CdStr = MCStringUtil.arrayValueJoin(cndSub2L.toArray(new String[cndSub2L.size()]));
			String cndSub3CdStr = MCStringUtil.arrayValueJoin(cndSub3L.toArray(new String[cndSub3L.size()]));
			
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = MSBEL_InvTransService.crtInvTrans_Srch03();
			setCommonParam(invTransSrch03);
			invTransSrch03.up0().wg_cd(null);
			invTransSrch03.up0().loc_grp_cd(null);
			invTransSrch03.up0().loc_cd(cndLocCdStr);
			invTransSrch03.up0().itm_cd(cndItmCdStr);
			invTransSrch03.up0().itm_sub1(cndSub1CdStr);
			invTransSrch03.up0().itm_sub2(cndSub2CdStr);
			invTransSrch03.up0().itm_sub3(cndSub3CdStr);
			invTransSrch03.up0().dtl_flg(false);
			
			invTransSrch03.exec();
			
			return invTransSrch03;
		}
		/**
		 * 在庫推移リストの絞り込み（製造引当制御マスタで設定されている品目・移動元場所の組合せに絞る）
		 * @param invList 在庫推移検索サービスから取得したリスト
		 * @param allocCtlL　製造引当制御マスタから取得したリスト
		 * @return invListの編集結果
		 */
		protected MCList<RsltR> editInvListByAllocCtl(MCList<RsltR> invList,
				MCList<MAM_ALLOC_CTL_R> allocCtlL) {
			MCList<RsltR> invListTmp = MCList.create(RsltR.class);
			
			MCIndexKey Key = invList.createIndex(RsltR.$itm_cd, RsltR.$itm_sub1,
					RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$loc_cd);
			for (MAM_ALLOC_CTL_R allocCtlR : allocCtlL) {
				invListTmp.addAll(invList.subList(Key, new Comparable[] {
						allocCtlR.itm_cd(), allocCtlR.itm_sub1(), allocCtlR.itm_sub2(),
						allocCtlR.itm_sub3(), allocCtlR.fr_loc_cd()
				}));
			}
			
			return invListTmp;
		}
	
		/**
		 *在庫推移検索サービスの呼び出し（詳細モード）
		 * @return 検索結果在庫推移リスト
		 * 
		 */
		protected MSBEL_InvTransService.InvTrans_Srch03 getInvTransSrchDtl() {
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = MSBEL_InvTransService.crtInvTrans_Srch03();
			setCommonParam(invTransSrch03);
			//入庫はすべてfalse
			invTransSrch03.up0().gr_prcd_flg(false);
			invTransSrch03.up0().gr_sts_opn_grp_flg(false);
			invTransSrch03.up0().gr_sts_ordsav_grp_flg(false);
			invTransSrch03.up0().gr_sts_fix_grp_flg(false);
			invTransSrch03.up0().gr_sts_schd_grp_flg(false);
			invTransSrch03.up0().gr_sts_ord_grp_flg(false);
			invTransSrch03.up0().gr_act_flg(false);
			//出庫実績はfalse
			invTransSrch03.up0().gi_act_flg(false);
			//未確定出庫のみ
			if (up0().unfirm_out_flg() && !up0().plan_out_flg()) {
				invTransSrch03.up0().gi_prcd_flg(true);
				invTransSrch03.up0().gi_sts_opn_grp_flg(true);
				invTransSrch03.up0().gi_sts_ordsav_grp_flg(true);
				invTransSrch03.up0().gi_sts_fix_grp_flg(false);
				invTransSrch03.up0().gi_sts_schd_grp_flg(false);
				invTransSrch03.up0().gi_sts_ord_grp_flg(false);
			}
			//出庫予定のみ
			else if(!up0().unfirm_out_flg() && up0().plan_out_flg()){
				invTransSrch03.up0().gi_prcd_flg(false);
				invTransSrch03.up0().gi_sts_opn_grp_flg(false);
				invTransSrch03.up0().gi_sts_ordsav_grp_flg(false);
				invTransSrch03.up0().gi_sts_fix_grp_flg(true);
				invTransSrch03.up0().gi_sts_schd_grp_flg(true);
				invTransSrch03.up0().gi_sts_ord_grp_flg(true);
			}
			//両方
			else{
				invTransSrch03.up0().gi_prcd_flg(true);
				invTransSrch03.up0().gi_sts_opn_grp_flg(true);
				invTransSrch03.up0().gi_sts_ordsav_grp_flg(true);
				invTransSrch03.up0().gi_sts_fix_grp_flg(true);
				invTransSrch03.up0().gi_sts_schd_grp_flg(true);
				invTransSrch03.up0().gi_sts_ord_grp_flg(true);
			}
			//明細検索
			invTransSrch03.up0().dtl_flg(true);
			
			invTransSrch03.exec();
			
			return invTransSrch03;
		}

		/**
		 *在庫推移検索サービスのパラメータ設定（共通）
		 * @param invTransSrch03 在庫推移検索サービス（使用可能日基準での呼び出し)オブジェクト
		 * 
		 */
		protected void setCommonParam(MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03){
			if(up0().skt_flg()) {
				invTransSrch03.up0().gr_act_flg(true);
				invTransSrch03.up0().gi_act_flg(true);
			}
			else {
				invTransSrch03.up0().gr_act_flg(false);
				invTransSrch03.up0().gi_act_flg(false);
			}
			if(up0().plan_in_flg()) {
				invTransSrch03.up0().gr_sts_fix_grp_flg(true);
				invTransSrch03.up0().gr_sts_schd_grp_flg(true);
				invTransSrch03.up0().gr_sts_ord_grp_flg(true);
			}
			else {
				invTransSrch03.up0().gr_sts_fix_grp_flg(false);
				invTransSrch03.up0().gr_sts_schd_grp_flg(false);
				invTransSrch03.up0().gr_sts_ord_grp_flg(false);
			}
			if(up0().unfirm_in_flg()) {
				invTransSrch03.up0().gr_prcd_flg(true);
				invTransSrch03.up0().gr_sts_opn_grp_flg(true);
				invTransSrch03.up0().gr_sts_ordsav_grp_flg(true);
			}
			else {
				invTransSrch03.up0().gr_prcd_flg(false);
				invTransSrch03.up0().gr_sts_opn_grp_flg(false);
				invTransSrch03.up0().gr_sts_ordsav_grp_flg(false);
			}
			if(up0().plan_out_flg()) {
				invTransSrch03.up0().gi_sts_fix_grp_flg(true);
				invTransSrch03.up0().gi_sts_schd_grp_flg(true);
				invTransSrch03.up0().gi_sts_ord_grp_flg(true);
			}
			else {
				invTransSrch03.up0().gi_sts_fix_grp_flg(false);
				invTransSrch03.up0().gi_sts_schd_grp_flg(false);
				invTransSrch03.up0().gi_sts_ord_grp_flg(false);
			}
			if(up0().unfirm_out_flg()) {
				invTransSrch03.up0().gi_prcd_flg(true);
				invTransSrch03.up0().gi_sts_opn_grp_flg(true);
				invTransSrch03.up0().gi_sts_ordsav_grp_flg(true);
			}
			else {
				invTransSrch03.up0().gi_prcd_flg(false);
				invTransSrch03.up0().gi_sts_opn_grp_flg(false);
				invTransSrch03.up0().gi_sts_ordsav_grp_flg(false);
			}
			invTransSrch03.up0().tgt_ver_flg(true);
			invTransSrch03.up0().non_ver_flg(true);
			invTransSrch03.up0().dt_fr(getMinInptDt()); //対象投入品の最小投入日
			invTransSrch03.up0().dt_to(getMaxInptDt()); //対象投入品の最大投入日
			invTransSrch03.up0().loc_cd(null);
			invTransSrch03.up0().site_cd(null);
			invTransSrch03.up0().wg_cd(up0().wg_cd());
			invTransSrch03.up0().lg_grp_cd(null);
			invTransSrch03.up0().alloc_grp_cd(null);
			invTransSrch03.up0().loc_grp_cd(up0().mfg_loc_grp_cd());
			invTransSrch03.up0().itm_cd(null);
			invTransSrch03.up0().itm_sub1(null);
			invTransSrch03.up0().itm_sub2(null);
			invTransSrch03.up0().itm_sub3(null);
			invTransSrch03.up0().quality_typ(MAC_QUALITY_TYP.GOOD.value());
			invTransSrch03.up0().sum_unit_typ(MSC_SUM_UNIT_TYP.LOC.value());
			invTransSrch03.up0().sno1_flg(true);
			invTransSrch03.up0().sno2_flg(true);
			invTransSrch03.up0().sno3_flg(true);
			invTransSrch03.up0().sno4_flg(true);
		}
		
		/**
		 *対象投入品の最小投入日を取得
		 * @return 最小投入日
		 * 
		 */
		protected MCDate getMinInptDt() {
			MCDate date = (MCDate)down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE).min(Srch01_RsltR.$schd_in_dt);
			if (isNull(date)) {
				return getToday();
			}
			else {
				return date;
			}
		}
		
		/**
		 *対象投入品の最大投入日を取得
		 * @return 最大投入日
		 * 
		 */
		protected MCDate getMaxInptDt() {
			MCDate date = (MCDate)down0().subList(Srch01_RsltR.$hrrchy, MCNumber.ONE).max(Srch01_RsltR.$schd_in_dt);
			if (isNull(date)) {
				return up0().dt_to();
			}
			else {
				return date;
			}
		}
	}

	//FMCB CUSTOM END
}