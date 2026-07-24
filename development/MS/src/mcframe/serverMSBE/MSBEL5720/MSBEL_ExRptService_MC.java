package mcframe.serverMSBE.MSBEL5720;

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
import mcframe.serverMSBE.MSBEL5720.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.Locale;

import mcframe.commonMSBE.MSBER0200.IvDtlR;
import mcframe.commonMSBE.MSBER0200.IvHdrR;
import mcframe.commonMSBE.MSBER0200.MSBER_IvLst;
import mcframe.commonMSBE.MSBER0210.MSBER_PckLst;
import mcframe.commonMSBE.MSBER0210.PckLstDtlR;
import mcframe.commonMSBE.MSBER0210.PckLstHdrR;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.serverCore.report.MCServerReportManager;
import static mcframe.serverMSBE.MSBEL5720.Query.*;
import mcframe.serverMAUC.MAUCL1060.*;

import java.util.*;
import java.util.Map.*;
import mcframe.serverMSUC.MSUCL0120.*;
import java.util.Set;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
import mcframe.serverMAUC.MAUCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ExRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ExRptService_MC extends MSBEL_ExRptService_MC_A{
	//FMCB CUSTOM START
	// ライン生成用
	protected final String _LINE = MSC_IV_PRNT_STR.LINE.name();
	
	protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
	protected MCIndexKey _bpUtilkey;

	/**
	 * ExRpt_Prnt0101オペレーション.<p>
	 *
	 * インボイスを印刷する（複数印刷用）<br>
	 */
	public class ExRpt_Prnt01 extends MSBEL_ExRptService_MC_A.ExRpt_Prnt01 {
		
		// 印刷用のヘッダデータ(共通)
		protected IvHdrR _ivHdr = IvHdrR.create();
		
		// ヘッダの検索結果
		protected MST_IV_R _exIvR = MST_IV_R.create();

		protected MCList<MST_IV_R> _updIvL = MCList.create(MST_IV_R.class);

		//編集対象として一時的に使用するなるReportSet
		protected MCReportSet _tmpRs;

		// 印刷用明細
		protected MCList<IvDtlR> _ivDtlL = MCList.create(IvDtlR.class);

		// iv_noによる検索結果全件
		protected MCList<MST_IV_D_R> _exIvDL = MCList.create(MST_IV_D_R.class);

		// iv_noによる検索結果前件から金額が0以外で、運賃、保険料以外を抽出したもの
		protected MCList<MST_IV_D_R> _exIvDLNotZ = MCList.create(MST_IV_D_R.class);

		// iv_noによる検索結果前件から金額が0の明細を抽出したもの
		protected MCList<MST_IV_D_R> _exIvDLZ = MCList.create(MST_IV_D_R.class);

		protected MCList<MST_IV_R> _lockIvL = MCList.create(MST_IV_R.class);
		
		protected MCList<MST_IV_R> _ivPL = MCList.create(MST_IV_R.class);
		protected MCIndexKey _ivPKey;
		protected MCIndexKey _ivKey;
		/** インボイスReportSetマップ */
		protected Map<String, List<MSBER_IvLst>> _ivLstReportMap;
		/** 再発行インボイスReportSetマップ */
		protected Map<List<String>, MCReportInfoR> _ivLstReprntMap;
		//添付帳票登録サービス呼出対象外のインボイスのキーを保持する
		protected Set<List<String>> _nonTgtIVSet;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			prntIv(up0());
			down0().setAll(up0());
		}
		
		/**
		 * インボイスを印刷する
		 * 
		 * @param l 印刷する輸出インボイスＩＤのリスト
		 */
		protected void prntIv(MCList<ExRpt_Prnt01_CndR> l) {
			_ivLstReportMap = new LinkedHashMap<String, List<MSBER_IvLst>>();
			_ivLstReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
			_nonTgtIVSet = new HashSet<List<String>>();
			
			MCList<ExRpt_Prnt01_CndR> prntL = chkIv();
			for (ExRpt_Prnt01_CndR prntR : prntL) {
				MST_IV_R ivR = _lockIvL.getFirst(_ivKey, prntR.iv_mng_no(), prntR.iv_rev());
				if (isNull(ivR) || ivR.getBooleanNE("iv_prnt_flg")) {
					MST_IV_R ivPR = _ivPL.getFirst(_ivPKey, prntR.iv_mng_no(), prntR.iv_rev());
					reprintIv(ivPR);
					//再発行は添付帳票登録サービス呼出対象外
					addNonTgtSetKey(_nonTgtIVSet,ivPR);
				}
				else {
					// 印刷するヘッダ情報の作成
					makeIvHdr(ivR);
					// 明細の検索
					srchDtl();
					// 金額あり明細のヘッダ
					makeHdr1();
					// 金額ありの明細
					makeDtl1();
					// 金額なしの明細
					makeDtl2();
					// 全体フッタ
					makeFooterAll();
					_updIvL.add(ivR);
					setRs();
					// 印刷データの登録のみ
					MCServerReportManager.request(_tmpRs, false);
					// 一括発行用のマップに設定する
					setIvMap();
				}
				

				//グローバル変数をリセットする
				resetGlobalValue();
			}
			// 印刷
			sendRequest();
			
			// I/V発行済の更新
			updIv();
		}
		
		protected void setRs() {
			_tmpRs.addRow(_ivHdr);
			_tmpRs.addAll(_ivDtlL);
			setAppData();
		}
		
		protected void reprintIv(MST_IV_R ivR) {
			// 業務情報を設定し、印刷データからデータを取得
			MCList<MCReportInfoR> infoL = searchPrintData(ivR);
			if (!isNull(infoL) && !infoL.isEmpty()) {
				// 印刷データが取得できた場合は再印刷
				MSBER_IvLst repSetNew = (MSBER_IvLst) MCServerReportManager.toReportSet(infoL.get(0));
				List<MSBER_IvLst> l = _ivLstReportMap.get(ivR.dlv_id_cd());
				if (null == l) {
					l = new ArrayList<MSBER_IvLst>(Arrays.asList(new MSBER_IvLst[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_ivLstReportMap.put(ivR.dlv_id_cd(), l);
				_ivLstReprntMap.put(Arrays.asList(new String[] {ivR.iv_no(), ivR.iv_mng_no(), ivR.iv_rev().toString()}), infoL.get(0));
			}
		}

		/**
		 * 印刷前チェックを実施する。
		 * @return 印刷対象データ
		 */
		protected MCList<ExRpt_Prnt01_CndR> chkIv(){
			MCList<ExRpt_Prnt01_CndR> okList = MCList.create(ExRpt_Prnt01_CndR.class);
			lockIv(up0());
			getIvP(up0());
			for(ExRpt_Prnt01_CndR up : up0()){
				MCMessageList msgList = new MCMessageList();
				MST_IV_R chkR = _lockIvL.getFirst(_ivKey, up.iv_mng_no(), up.iv_rev());
				MST_IV_R chkIvPR = _ivPL.getFirst(_ivPKey, up.iv_mng_no(), up.iv_rev());

				// 未登録インボイスのチェック
				if(MAC_STR.isNULL_VAL(up.iv_no())) {
					msgList.add(new MCMessage(up, null, MSBEL0322, toDispGUIIndex(up)));
				}
				else if (chkR == null && chkIvPR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_IV",
							new String[]{MST_IV_R.$iv_no},
							new Comparable[]{up.iv_no()}, up));
				}
				if (msgList.isEmpty()) {
					okList.add(up);
				}
				else {
					MCMessagePool.addAll(msgList);
					up.err_flg(true);
				}
				down0().add(up);
			}
			
			return okList;
		}
		
		/**
		 * インボイスヘッダをロックする。
		 * @param r 印刷対象の情報
		 */
		protected void lockIv(MCList<ExRpt_Prnt01_CndR> trgL) {
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder lockIvL_bldr = MCQueryApiBuilder.create(t);

			lockIvL_bldr.setSelect(t.iv_mng_no);
			lockIvL_bldr.addSelect(t.iv_no);
			lockIvL_bldr.addSelect(t.iv_rev);
			lockIvL_bldr.addSelect(t.dlv_id_cd);
			lockIvL_bldr.addSelect(t.iv_prnt_flg);
			lockIvL_bldr.addSelect(cases()
					.when(t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
					.then(bp.prnt_lcl_cd).otherwise(loc.prnt_lcl_cd).as("prnt_lcl_cd"));
			lockIvL_bldr.addLeftOuterJoin(bp, bracket( t.dlv_id_cd.eq(bp.bp_cd)));
			lockIvL_bldr.addLeftOuterJoin(loc, bracket( t.dlv_id_cd.eq(loc.loc_cd)));
			lockIvL_bldr.addWhereWithAnd(t.iv_mng_no.eq(bind(ExRpt_Prnt01_CndR.$iv_mng_no)));
			lockIvL_bldr.addWhereWithAnd(t.iv_rev.eq(bind(ExRpt_Prnt01_CndR.$iv_rev)));
			lockIvL_bldr.setLockTable(t.iv_mng_no);
			lockIvL_bldr.setOrderByAsc(lockIvL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBEL5720_MST_IV_S01", _lockIvL, lockIvL_bldr, trgL);
			_ivKey = _lockIvL.createIndex(MST_IV_R.$iv_mng_no, MST_IV_R.$iv_rev);
		}
		
		/**
		 * インボイスヘッダ（改訂履歴）を取得する。
		 * @param r 印刷対象の情報
		 */
		protected void getIvP(MCList<ExRpt_Prnt01_CndR> trgL) {
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MST_IV_P_R t = MST_IV_P_R.create("T");
			MCQueryApiBuilder ivPL_bldr = MCQueryApiBuilder.create(t);

			ivPL_bldr.setSelect(t.iv_mng_no);
			ivPL_bldr.addSelect(t.iv_no);
			ivPL_bldr.addSelect(t.iv_rev);
			ivPL_bldr.addSelect(t.dlv_id_cd);
			ivPL_bldr.addSelect(cases()
					.when(t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
					.then(bp.prnt_lcl_cd).otherwise(loc.prnt_lcl_cd).as("prnt_lcl_cd"));
			ivPL_bldr.addLeftOuterJoin(bp, bracket( t.dlv_id_cd.eq(bp.bp_cd)));
			ivPL_bldr.addLeftOuterJoin(loc, bracket( t.dlv_id_cd.eq(loc.loc_cd)));
			ivPL_bldr.addWhereWithAnd(t.iv_mng_no.eq(bind(ExRpt_Prnt01_CndR.$iv_mng_no)));
			ivPL_bldr.addWhereWithAnd(t.iv_rev.eq(bind(ExRpt_Prnt01_CndR.$iv_rev)));
			ivPL_bldr.setLockTable(t.iv_mng_no);
			ivPL_bldr.setOrderByAsc(ivPL_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBEL5720_MST_IV_P_S01", _ivPL, ivPL_bldr, trgL);
			_ivPKey = _ivPL.createIndex(MST_IV_R.$iv_mng_no, MST_IV_R.$iv_rev);
		}
		
		protected void resetGlobalValue() {
			_ivHdr = IvHdrR.create();
			_exIvR = MST_IV_R.create();
			_ivDtlL = MCList.create(IvDtlR.class);
			_exIvDL = MCList.create(MST_IV_D_R.class);
			_exIvDLNotZ = MCList.create(MST_IV_D_R.class);
			_exIvDLZ = MCList.create(MST_IV_D_R.class);
		}
		/**
		 * ヘッダ印刷情報を作成
		 * 
		 * @param iv_no インボイスＮＯ
		 */
		protected void makeIvHdr(MST_IV_R ivR) {
			_tmpRs = MSBER_IvLst.create(); 
			_tmpRs.setLocale(toLocaleFromLclCd(getLclCd(ivR)));
			makeHdrIv(ivR.iv_mng_no(), ivR.iv_rev());
			MCNumber amt_dec_place = _exIvR.getNumberNE("amt_dec_place"); //金額小数部有効桁数
			putNumStr(_tmpRs, _ivHdr, IvHdrR.$s_ncv_amt, IvHdrR.$ncv_amt, amt_dec_place);

		}

		/**
		 * 明細印刷情報を検索
		 */
		protected void srchDtl() {
			_exIvDL.addBooleanColumn("dscnt_itm_flg");
			_exIvDL.addBooleanColumn("inc_tax_flg");
			
			MST_IV_D_R t = MST_IV_D_R.create("T");
			MST_IV_R t1 = MST_IV_R.create("T1");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			MAM_UNIT_LCL_R m3 = MAM_UNIT_LCL_R.create("M3");
			MAM_UNIT_R m3b = MAM_UNIT_R.create("M3B");
			MAM_CNTRY_LCL_R m4 = MAM_CNTRY_LCL_R.create("M4");
			MAM_CNTRY_R m4b = MAM_CNTRY_R.create("M4B");
			MAM_ITM_LCL_R m5 = MAM_ITM_LCL_R.create("M5");
			MAM_SUNDRY_ITM_R m6 = MAM_SUNDRY_ITM_R.create("M6");
			MAM_UNIT_LCL_R m7 = MAM_UNIT_LCL_R.create("M7");
			MAM_UNIT_R m7b = MAM_UNIT_R.create("M7B");
			MAM_TAX_R m8 = MAM_TAX_R.create("M8");
			MCQueryApiBuilder exIvDL_bldr = MCQueryApiBuilder.create(t);
			
			exIvDL_bldr.addSelect(t1.trd_ptn_typ);					//取引パタン区分
			exIvDL_bldr.addSelect(m1.exim_xpns_typ);				//輸出入諸掛区分
			exIvDL_bldr.addSelect(m1.dscnt_itm_flg);				//値引品目
			exIvDL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));	//基準単位小数部有効桁数
			exIvDL_bldr.addSelect(m2.dec_place.as("unit_dec_place"));	//単位小数部有効桁数
			exIvDL_bldr.addSelect(nvl( m3.unit_nm, m3b.unit_nm).as("trd_unit_nm"));		//取引単位名
			exIvDL_bldr.addSelect(nvl( m4.cntry_nm, m4b.cntry_nm).as("cntry_org_nm"));		//原産地名
			exIvDL_bldr.removeSelect(MST_IV_D_R.$iv_itm_nm);
			exIvDL_bldr.addSelect(cases().when(t.sundry_itm_flg.eq(value(true)))
					.then(nvl(t.iv_itm_nm, m6.itm_nm))
					.otherwise(nvl(m5.itm_nm, m1.itm_nm)).as("iv_itm_nm"));								//インボイス表記用品名
			exIvDL_bldr.addSelect(nvl( m5.itm_alt_nm1, m1.itm_alt_nm1).as("iv_itm_alt_nm1"));			//インボイス表記用品目名１
			exIvDL_bldr.addSelect(nvl( m5.itm_alt_nm2, m1.itm_alt_nm2).as("iv_itm_alt_nm2"));			//インボイス表記用品目名２
			exIvDL_bldr.addSelect(nvl( m5.itm_alt_nm3, m1.itm_alt_nm3).as("iv_itm_alt_nm3"));			//インボイス表記用品目名３
			exIvDL_bldr.addSelect(nvl( m5.itm_alt_nm4, m1.itm_alt_nm4).as("iv_itm_alt_nm4"));			//インボイス表記用品目名４
			exIvDL_bldr.addSelect(nvl( m7.unit_nm, m7b.unit_nm).as("base_unit_nm"));		//基準単位名
			exIvDL_bldr.addSelect(m8.tax_rate);		//税率
			exIvDL_bldr.addSelect(m8.inc_tax_flg);		//内税ＦＬＧ
			
			exIvDL_bldr.addInnerJoin(t1, bracket( t1.iv_mng_no.eq(t.iv_mng_no)));
			exIvDL_bldr.addLeftOuterJoin(m1, bracket(m1.itm_cd.eq(t.itm_cd)
					.and(m1.itm_sub1.eq(t.itm_sub1))
					.and(m1.itm_sub2.eq(t.itm_sub2))
					.and(m1.itm_sub3.eq(t.itm_sub3))));
			exIvDL_bldr.addLeftOuterJoin(m2, bracket(m2.itm_cd.eq(t.itm_cd)
					.and(m2.itm_sub1.eq(t.itm_sub1))
					.and(m2.itm_sub2.eq(t.itm_sub2))
					.and(m2.itm_sub3.eq(t.itm_sub3))
					.and(m2.unit_cd.eq(t.trd_unit_cd))));
			exIvDL_bldr.addLeftOuterJoin(m3, bracket(m3.unit_cd.eq(t.trd_unit_cd)
					.and(m3.lcl_cd.eq(bind("prnt_lcl_cd")))));
			exIvDL_bldr.addLeftOuterJoin(m3b, bracket(m3b.unit_cd.eq(t.trd_unit_cd)));
			exIvDL_bldr.addLeftOuterJoin(m4, bracket(m4.cntry_cd.eq(t.cntry_org_cd)
					.and(m4.lcl_cd.eq(bind("prnt_lcl_cd")))));
			exIvDL_bldr.addLeftOuterJoin(m4b, bracket(m4b.cntry_cd.eq(t.cntry_org_cd)));
			exIvDL_bldr.addLeftOuterJoin(m5, bracket(m5.itm_cd.eq(t.itm_cd)
					.and(m5.itm_sub1.eq(t.itm_sub1))
					.and(m5.itm_sub2.eq(t.itm_sub2))
					.and(m5.itm_sub3.eq(t.itm_sub3))
					.and(m5.lcl_cd.eq(bind("prnt_lcl_cd")))));
			exIvDL_bldr.addLeftOuterJoin(m6, bracket(m6.itm_cd.eq(t.itm_cd)
					.and(m6.itm_sub1.eq(t.itm_sub1))
					.and(m6.itm_sub2.eq(t.itm_sub2))
					.and(m6.itm_sub3.eq(t.itm_sub3))
					.and(m6.sno1.eq(t.sno1))
					.and(m6.sno2.eq(t.sno2))
					.and(m6.sno3.eq(t.sno3))));
			exIvDL_bldr.addLeftOuterJoin(m7, bracket(m7.unit_cd.eq(t.base_unit_cd)
					.and(m7.lcl_cd.eq(bind("prnt_lcl_cd")))));
			exIvDL_bldr.addLeftOuterJoin(m7b, bracket( m7b.unit_cd.eq(t.base_unit_cd)));
			exIvDL_bldr.addLeftOuterJoin(m8, bracket(m8.tax_cd.eq(t.tax_cd)));

			exIvDL_bldr.setWhere(t1.iv_mng_no.eq(bind("iv_mng_no")));
			exIvDL_bldr.addWhereWithAnd(t1.iv_rev.eq(bind("iv_rev")));

			dbSelect("MSBEL5720_MST_IV_D_S01", _exIvDL, exIvDL_bldr, _exIvR);
					
			//運賃と保険料を計算する
			setSubttl2_3();
			
			// 税額合計
			_ivHdr.tax_amt(_exIvDL.sum(MST_IV_D_R.$trd_cur_tax_amt));
		}
			
		protected void setSubttl2_3() {
			// インボイス金額を輸出入諸掛区分ごとに集計
			MCGroupByPolicy gp = new MCGroupByPolicy("exim_xpns_typ");
			gp.sum(MST_IV_D_R.$trd_cur_amt);
			gp.sum(MST_IV_D_R.$trd_cur_tax_amt);
			MCList<MST_IV_D_R> sumL = _exIvDL.groupBy(gp);

			// 小計２～３、税小計２～３
			boolean isAmt = true;
			_ivHdr.subttl2(getSubttl(MAC_EXIM_XPNS_TYP.FREIGHT, sumL, isAmt));
			_ivHdr.subttl3(getSubttl(MAC_EXIM_XPNS_TYP.INSURANCE, sumL, isAmt));
			isAmt = false;
			_ivHdr.tax_subttl2(getSubttl(MAC_EXIM_XPNS_TYP.FREIGHT, sumL, isAmt));
			_ivHdr.tax_subttl3(getSubttl(MAC_EXIM_XPNS_TYP.INSURANCE, sumL, isAmt));
		}
		
		/**
		 * 輸出入諸掛区分に応じた小計を返す
		 * 
		 * @param typ 輸出入諸掛区分
		 * @param sumL 輸出入諸掛区分ごとに集計されたリスト
		 * @param isAmt trueの場合は取引通貨金額の小計、falseの場合は取引通貨税額の小計を返す
		 * @return 輸出入諸掛区分に応じた小計
		 */
		protected MCNumber getSubttl(MAC_EXIM_XPNS_TYP typ, MCList<MST_IV_D_R> sumL, boolean isAmt) {

			MST_IV_D_R r = sumL.getFirst("exim_xpns_typ", typ.value());
			
			if (isNull(r)) {
				return MCNumber.ZERO;
			}
			else if (isAmt){
				return r.trd_cur_amt();
			}
			else {
				return r.trd_cur_tax_amt();
			}
		}

		/**
		 * 明細のヘッダを作成
		 */
		protected void makeHdr1() {
			addLongLineRow();
			IvDtlR dtlR = IvDtlR.create();
			dtlR.t_itm_code(MSC_IV_PRNT_STR.ITEM.name());
			dtlR.t_po_no(MSC_IV_PRNT_STR.CUST.name());
			dtlR.t_qty(MSC_IV_PRNT_STR.QTY.name());
			dtlR.t_upri(MSC_IV_PRNT_STR.UPRI.name() + MSC_IV_PRNT_STR.LEFT.name()
					+ _ivHdr.cur_nm() + MSC_IV_PRNT_STR.RIGHT.name());
			dtlR.t_amt(MSC_IV_PRNT_STR.AMT.name() + MSC_IV_PRNT_STR.LEFT.name()
					+ _ivHdr.cur_nm() + MSC_IV_PRNT_STR.RIGHT.name());
			dtlR.t_tax_rate(MSC_IV_PRNT_STR.TAX_RATE.name());
			dtlR.t_tax_amt(MSC_IV_PRNT_STR.TAX_AMT.name());
			_ivDtlL.add(dtlR);
			addLongLineRow();
		}

		/**
		 * 長い線として出力する列を追加する
		 * 
		 * @return
		 */
		protected void addLongLineRow() {
			IvDtlR dtlR = IvDtlR.create();
			dtlR.free(getLongLine());
			_ivDtlL.add(dtlR);
		}

		/**
		 * 短い線として出力する列を追加する
		 * 
		 * @return
		 */
		protected void addShortLineRow() {
			IvDtlR dtlR = IvDtlR.create();
			dtlR.free(getShortLine());
			_ivDtlL.add(dtlR);
		}
		/**
		 * 短い線として出力する文字列を返す
		 * 
		 * @return
		 */
		protected String getShortLine() {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 55; i++) {
				sb.append(" ");
			}
			for (int i = 0; i < 69; i++) {
				sb.append(_LINE);
			}
			return sb.toString();
		}


		/**
		 * 金額が0でない明細印刷情報を作成
		 */
		protected void makeDtl1() {
			_exIvDLNotZ = _exIvDL.subList(new Match1());

			// 明細が無い場合はスキップする
			if (_exIvDLNotZ.size() != 0) {
				addDtl(_exIvDLNotZ);
				// 合計
				addTtl(_exIvDLNotZ);
				// フッタ
				makeFooter1();
			}
		}

		/**
		 * 金額が0以外の明細を作成する
		 * 
		 * @param l
		 */
		protected void addDtl(MCList<MST_IV_D_R> l) {
			l.sort(MST_IV_D_R.$disp_seq);
			for (MST_IV_D_R r : l) {
				IvDtlR addR = IvDtlR.create();
				copyD1(addR, r);
				_ivDtlL.add(addR);
			}
			
			_ivDtlL.setNumber(IvDtlR.$amt_dec_place, _exIvR.getNumberNE("amt_dec_place"));
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_trd_unit_qty, IvDtlR.$s_dec_trd_unit_qty, IvDtlR.$trd_unit_qty, IvDtlR.$unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_base_unit_qty, IvDtlR.$s_dec_base_unit_qty, IvDtlR.$base_unit_qty, IvDtlR.$base_unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_trd_cur_upri, IvDtlR.$s_dec_trd_cur_upri, IvDtlR.$trd_cur_upri, IvDtlR.$upri_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_d_amt, IvDtlR.$s_dec_d_amt, IvDtlR.$d_amt, IvDtlR.$amt_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_d_tax_amt, IvDtlR.$s_dec_d_tax_amt, IvDtlR.$d_tax_amt, IvDtlR.$amt_dec_place);
			
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_trd_unit_qty, IvDtlR.$trd_unit_qty, IvDtlR.$unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_base_unit_qty, IvDtlR.$base_unit_qty, IvDtlR.$base_unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_trd_cur_upri, IvDtlR.$trd_cur_upri, IvDtlR.$upri_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_d_amt, IvDtlR.$d_amt, IvDtlR.$amt_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_d_tax_amt, IvDtlR.$d_tax_amt, IvDtlR.$amt_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_tax_rate, IvDtlR.$tax_rate, _ivDtlL.getMeta(IvDtlR.$tax_rate));
		}

		/**
		 * 金額が0の明細印刷情報を作成
		 */
		protected void makeDtl2() {
			_exIvDLZ = _exIvDL.subList(new MCRowMatcher<MST_IV_D_R>() {
				// 金額が0の明細を抽出
				public boolean match(MST_IV_D_R m) {
					if (m.trd_cur_upri().isZero()) {
						return true;
					}
					return false;
				}
			});

			// 対象が無い場合はスキップする
			if (_exIvDLZ.size() != 0) {
				// タイトル
				addFreeOfCharge();
				// 明細
				// 金額(r.trd_cur_upri)が0の場合、単価、金額にはiv_upriとiv_amtを表示する
				// 共通メソッドを使うため、trd_cur_upriとtrd_cur_amtにiv_upriとiv_amtをコピーする。
				for (MST_IV_D_R r : _exIvDLZ) {
					r.trd_cur_upri(r.iv_upri());
					r.trd_cur_amt(r.iv_amt());
					
					// ヘッダの無償金額合計を算出する。
					_ivHdr.ncv_amt(nvl(_ivHdr.ncv_amt(), MCNumber.ZERO).add(nvl(r.iv_amt(), MCNumber.ZERO)));
				}
				addDtl2(_exIvDLZ);
				// 合計
				addTtl2(_exIvDLZ);
				// フッタ
				makeFooter2();

			}
		}

		/**
		 * 金額が0のフッタ２を作成する
		 */
		protected void makeFooterAll() {
			// 金額が0で運賃、保険料以外の明細と、金額が0の明細をマージ
			MCList<MST_IV_D_R> unionL = MCList.create(MST_IV_D_R.class);
			unionL.addAll(_exIvDLNotZ);
			unionL.addAll(_exIvDLZ);
			MCList<MST_IV_D_R> prntUnionL = _exIvDL.subList(new Match2());
			MCList<MST_IV_D_R> groupL = prntUnionL.groupBy(
					MST_IV_D_R.$cntry_org_cd, "cntry_org_nm");
			groupL.sort(MST_IV_D_R.$cntry_org_cd);
			for (MST_IV_D_R r : groupL) {
				IvDtlR dtlR = IvDtlR.create();
				dtlR.f_cntry_org_cd(r.cntry_org_cd());
				dtlR.t_made_in(MSC_IV_PRNT_STR.MADE_IN.name());
				dtlR.f_cntry_org_nm(r.getStringNE("cntry_org_nm"));
				_ivDtlL.add(dtlR);
			}
		}

		/**
		 * 印刷処理をリクエストする
		 */
		protected void sendRequest() {
			printAll();
		}

		protected void printAll() {
			if (_ivLstReportMap == null || _ivLstReportMap.size() == 0) {
				return;
			}
			
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				getIndivPrnt(up0());
			}
			
			// ソート処理
			_ivLstReportMap = ivMapSort(_ivLstReportMap);
			List<MCReportSet> rptSetList = new ArrayList<>();
			for (Map.Entry<String, List<MSBER_IvLst>> en : _ivLstReportMap.entrySet()) {
				MCReportInfoR ivReprntInfo = null;
				MCReportSet allIvRs = null;
				boolean isIvInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldIvMngNo = null;
					String oldIvRev = null;
					for (MSBER_IvLst iv : en.getValue()) {
						if(isSame(iv.getAppReportNo2(), oldIvMngNo)
								&& isSame(iv.getAppReportNo3(), oldIvRev)) {
							allIvRs.addAll(iv.getAll());
						}
						else {
							if (allIvRs != null) {
								allIvRs.setRegister(false);
								MCServerReportManager.requestImmediate(allIvRs);
							}
							ivReprntInfo = getIvReprntInfo(iv);
							if (isNull(ivReprntInfo)) {
								allIvRs = iv.createInstance();
								allIvRs.setLocale(iv.getLocale());
								allIvRs.addAll(iv.getAll());
								oldIvMngNo = iv.getAppReportNo2();
								oldIvRev = iv.getAppReportNo3();
								allIvRs.addWriteListener(new FileWriteListener(rptSetList));
							}
							else {
								allIvRs = null;
								MCServerReportManager.reprint(ivReprntInfo);
							}
						}
					}
					if (allIvRs != null) {
						allIvRs.setRegister(false);
						MCServerReportManager.requestImmediate(allIvRs);
					}
				}
				else {
					// まとめ発行
					for (MSBER_IvLst iv : en.getValue()) {
						if (!isIvInit) {
							allIvRs = iv.createInstance();
							allIvRs.setLocale(iv.getLocale());
							isIvInit = true;
						}
						ivReprntInfo = getIvReprntInfo(iv);
						if (isNull(ivReprntInfo)) {
							allIvRs.addAll(iv.getAll());
						}
					}
					if ( allIvRs.size() != 0) {
						MCServerReportManager.request(allIvRs);
					}
					for (Map.Entry<List<String>, MCReportInfoR> reprntIv : _ivLstReprntMap.entrySet()) {
						if(isSame(reprntIv.getValue().app_to_cd2(), en.getKey())) {
							MCServerReportManager.reprint(reprntIv.getValue());
						}
					}
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callIVAttachSrv(rptSetList);
			}
		}

		protected MCReportInfoR getIvReprntInfo(MSBER_IvLst iv) {
			MCReportInfoR info = iv.getReportInfo();
			return _ivLstReprntMap.get(Arrays.asList(new String[] {info.app_report_no1(), info.app_report_no2(), info.app_report_no3()}));
		}

		/**
		 * インボイスヘッダを更新する。
		 * 
		 */
		protected void updIv() {
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder updIvL_bldr = MCQueryApiBuilder.create(t);
			updIvL_bldr.setSetVL(t.iv_prnt_flg, value(true));
			updIvL_bldr.setWhere(t.iv_no.eq(bind("1")));
			dbUpdateKey("MSBEL5720_MST_IV_U01", _updIvL, updIvL_bldr);
			callRevDataIns01(_updIvL);
		}
		

		/**
		 * 国コードがnullでないものを抽出
		 */
		public class Match2 implements MCRowMatcher<MST_IV_D_R> {
			public boolean match(MST_IV_D_R m) {
				if (!isNull(m.cntry_org_cd())) {
					return true;
				}
				return false;
			}
		}

		/**
		 * 金額が0以外の明細を作成する
		 * 
		 * @param l
		 */
		protected void addDtl2(MCList<MST_IV_D_R> l) {
			l.sort(MST_IV_D_R.$disp_seq);
			for (MST_IV_D_R r : l) {
				IvDtlR addR = IvDtlR.create();
				copyD1_2(addR, r);
				_ivDtlL.add(addR);
			}
			_ivDtlL.setNumber(IvDtlR.$amt_dec_place, _exIvR.getNumberNE("amt_dec_place"));
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_trd_unit_qty2, IvDtlR.$s_dec_trd_unit_qty2, IvDtlR.$trd_unit_qty2, IvDtlR.$unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_base_unit_qty2, IvDtlR.$s_dec_base_unit_qty2, IvDtlR.$base_unit_qty2, IvDtlR.$base_unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_iv_upri, IvDtlR.$s_dec_iv_upri, IvDtlR.$iv_upri, IvDtlR.$upri_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_int_d_iv_amt, IvDtlR.$s_dec_d_iv_amt, IvDtlR.$iv_amt, IvDtlR.$amt_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_trd_unit_qty2, IvDtlR.$trd_unit_qty2, IvDtlR.$unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_base_unit_qty2, IvDtlR.$base_unit_qty2, IvDtlR.$base_unit_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_iv_upri, IvDtlR.$iv_upri, IvDtlR.$upri_dec_place);
			putNumStr(_tmpRs, _ivDtlL, IvDtlR.$s_iv_amt, IvDtlR.$iv_amt, IvDtlR.$amt_dec_place);
		}

		/**
		 * 金額なしの明細用Mapper
		 * 
		 * @return
		 */
		protected void copyD1_2(IvDtlR dest, MST_IV_D_R src) {
			dest.itm_cd2(src.itm_cd());
			dest.itm_sub1_data2(src.itm_sub1());
			dest.itm_sub2_data2(src.itm_sub2());
			dest.itm_sub3_data2(src.itm_sub3());
			putPrntItmSub1(dest, IvDtlR.$itm_sub1_view2, IvDtlR.$itm_sub1_data2);
			putPrntItmSub2(dest, IvDtlR.$itm_sub2_view2, IvDtlR.$itm_sub2_data2);
			putPrntItmSub3(dest, IvDtlR.$itm_sub3_view2, IvDtlR.$itm_sub3_data2);

			dest.cntry_org_cd2(src.cntry_org_cd());
			dest.cntry_org_nm2(src.getStringNE("cntry_org_nm"));
			dest.trd_unit_qty2(src.trd_unit_qty());
			dest.trd_unit_nm2(src.getStringNE("trd_unit_nm"));
			dest.trd_unit_cd2(src.trd_unit_cd());
			dest.iv_upri(src.trd_cur_upri());
			dest.iv_amt(src.trd_cur_amt());
			dest.unit_dec_place(src.getNumber("unit_dec_place"));
			dest.cst_po_no2(src.cst_po_no());
			dest.cst_po_d_no2(src.cst_po_d_no());
			dest.base_unit_qty2(src.base_unit_qty());
			dest.base_unit_nm2(src.getStringNE("base_unit_nm"));
			dest.base_unit_cd2(src.base_unit_cd());
			dest.iv_upri_base_unit_nm(src.getStringNE("base_unit_nm"));
			dest.iv_upri_base_unit_cd(src.base_unit_cd());
			dest.base_unit_dec_place(src.getNumber("base_unit_dec_place"));
			dest.iv_itm_nm2(src.iv_itm_nm());
			dest.iv_itm2_alt_nm1(src.getStringNE("iv_itm_alt_nm1"));
			dest.iv_itm2_alt_nm2(src.getStringNE("iv_itm_alt_nm2"));
			dest.iv_itm2_alt_nm3(src.getStringNE("iv_itm_alt_nm3"));
			dest.iv_itm2_alt_nm4(src.getStringNE("iv_itm_alt_nm4"));
			dest.cst_itm_cd2(src.cst_itm_cd());
			dest.cst_itm_nm2(src.cst_itm_nm());

		}

		/**
		 * トータル行を作成する
		 * 
		 * @param l
		 */
		protected void addTtl2(MCList<MST_IV_D_R> l) {
			addLongLineRow();
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_IV_D_R.$trd_unit_cd, "trd_unit_nm", "unit_dec_place");
			gp.sum(MST_IV_D_R.$trd_unit_qty);
			MCList<MST_IV_D_R> l3 = l.groupBy(gp);
			l3.sort("trd_unit_nm");
			IvDtlR dtlR = null;
			boolean isFirst = true;
			for (MST_IV_D_R r : l3) {
				dtlR = IvDtlR.create();
				if (isFirst) {
					dtlR.t_total2(MSC_IV_PRNT_STR.TOTAL.name());
					isFirst = false;
				}
				dtlR.sum_trd_unit_qty2(r.trd_unit_qty());
				putNumStr(_tmpRs, dtlR, IvDtlR.$s_sum_trd_unit_qty2,
						IvDtlR.$sum_trd_unit_qty2, r.getNumberNE("unit_dec_place"));
				dtlR.sum_trd_unit_nm2(r.getStringNE("trd_unit_nm"));
				dtlR.sum_trd_unit_cd2(r.trd_unit_cd());
				_ivDtlL.add(dtlR);
			}
		}

		/**
		 * 金額が0のフッタ１を作成する
		 */
		protected void makeFooter2() {
			addShortLineRow();
			IvDtlR footR = IvDtlR.create();
			footR.t_no_com(MSC_IV_PRNT_STR.NO_COM_VAL.name());
			footR.f_cur_nm2(_ivHdr.cur_nm());
			footR.f_cur_cd2(_ivHdr.cur_cd());
			footR.d_ncv_amt(_ivHdr.ncv_amt());
			putNumStr(_tmpRs, footR, IvDtlR.$s_d_ncv_amt, IvDtlR.$d_ncv_amt, _exIvR.getNumberNE("amt_dec_place"));
			_ivDtlL.add(footR);

			IvDtlR footR2 = IvDtlR.create();
			footR2.t_no_com(MSC_IV_PRNT_STR.VAL_FOR_CST.name());
			_ivDtlL.add(footR2);

			addLongLineRow();

		}

		/**
		 * Free Of Chargeのタイトルを挿入する
		 */
		protected void addFreeOfCharge() {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 38; i++) {
				sb.append(" ");
			}
			sb.append(MSC_IV_PRNT_STR.FREE_OF_CHRG.name());
			IvDtlR dtlR = IvDtlR.create();
			dtlR.free(sb.toString());
			_ivDtlL.add(dtlR);
		}

		/**
		 * トータル行を作成する
		 * 
		 * @param l
		 */
		protected void addTtl(MCList<MST_IV_D_R> l) {
			addLongLineRow();
			MCGroupByPolicy gp = new MCGroupByPolicy(IvDtlR.$trd_unit_nm);
			gp.sum(MST_IV_D_R.$trd_unit_qty);
			MCList<MST_IV_D_R> l3 = l.groupBy(gp);
			l3.sort(IvDtlR.$trd_unit_nm);
			
			boolean isFirst = true;
			for (MST_IV_D_R r : l3) {
				IvDtlR dtlR = IvDtlR.create();
				if (isFirst) {
					dtlR.t_total(MSC_IV_PRNT_STR.TOTAL.name());
					isFirst = false;
				}
				
				dtlR.sum_trd_unit_qty(r.trd_unit_qty());
				putNumStr(_tmpRs, dtlR, IvDtlR.$s_sum_trd_unit_qty,
						IvDtlR.$sum_trd_unit_qty, r.getNumberNE("unit_dec_place"));
				dtlR.sum_trd_unit_nm(r.getStringNE("trd_unit_nm"));
				_ivDtlL.add(dtlR);
			}
		}

		/**
		 * 金額が0以外の明細のフッタを作成する
		 */
		protected void makeFooter1() {
			
			// 小計見出し
			IvDtlR dtlR = IvDtlR.create();
			dtlR.t_sum_amt(MSC_IV_PRNT_STR.AMT.name());
			dtlR.t_sum_tax_amt(MSC_IV_PRNT_STR.TAX_AMT.name());
			_ivDtlL.add(dtlR);
			
			// FOB
			dtlR = IvDtlR.create();
			dtlR.f_fob(MSC_IV_PRNT_STR.FOB.name());
			dtlR.fob_cur_nm(_ivHdr.cur_nm());
			dtlR.d_fob_amt(_ivHdr.amt().subtract(_ivHdr.subttl2()).subtract(_ivHdr.subttl3()));
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_amt, IvDtlR.$d_fob_amt, _exIvR.getNumberNE("amt_dec_place"));
			dtlR.d_fob_tax_amt(_ivHdr.tax_amt().subtract(_ivHdr.tax_subttl2()).subtract(_ivHdr.tax_subttl3()));
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_tax_amt, IvDtlR.$d_fob_tax_amt, _exIvR.getNumberNE("amt_dec_place"));
			_ivDtlL.add(dtlR);
			
			// FREIGHT
			dtlR = IvDtlR.create();
			dtlR.f_fob(MSC_IV_PRNT_STR.FREIGHT.name());
			dtlR.d_fob_amt(_ivHdr.subttl2());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_amt, IvDtlR.$d_fob_amt, _exIvR.getNumberNE("amt_dec_place"));
			dtlR.d_fob_tax_amt(_ivHdr.tax_subttl2());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_tax_amt, IvDtlR.$d_fob_tax_amt, _exIvR.getNumberNE("amt_dec_place"));
			_ivDtlL.add(dtlR);
			
			// INSURANCE
			dtlR = IvDtlR.create();
			dtlR.f_fob(MSC_IV_PRNT_STR.INSURANCE.name());
			dtlR.d_fob_amt(_ivHdr.subttl3());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_amt, IvDtlR.$d_fob_amt, _exIvR.getNumberNE("amt_dec_place"));
			dtlR.d_fob_tax_amt(_ivHdr.tax_subttl3());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_d_fob_tax_amt, IvDtlR.$d_fob_tax_amt, _exIvR.getNumberNE("amt_dec_place"));
			_ivDtlL.add(dtlR);
			
			addShortLineRow();
			
			dtlR = IvDtlR.create();
			dtlR.d_tterm_nm1(_ivHdr.tterm_nm1());
			dtlR.d_tterm_cd1(_ivHdr.tterm_cd1());
			dtlR.d_tterm_nm2(_ivHdr.tterm_nm2());
			dtlR.d_tterm_cd2(_ivHdr.tterm_cd2());
			dtlR.f_cur_nm(_ivHdr.cur_nm());
			dtlR.f_cur_cd(_ivHdr.cur_cd());
			dtlR.f_amt(_ivHdr.amt());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_f_amt, IvDtlR.$f_amt, _exIvR.getNumberNE("amt_dec_place"));
			dtlR.f_tax_amt(_ivHdr.tax_amt());
			putNumStr(_tmpRs, dtlR, IvDtlR.$s_f_tax_amt, IvDtlR.$f_tax_amt, _exIvR.getNumberNE("amt_dec_place"));
			_ivDtlL.add(dtlR);
			
			addLongLineRow();

		}

		/**
		 * 金額ありの明細用Mapper
		 * 
		 * @return
		 */
		protected void copyD1(IvDtlR dest, MST_IV_D_R src) {
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1_data(src.itm_sub1());
			dest.itm_sub2_data(src.itm_sub2());
			dest.itm_sub3_data(src.itm_sub3());
			putPrntItmSub1(dest, IvDtlR.$itm_sub1_view, IvDtlR.$itm_sub1_data);
			putPrntItmSub2(dest, IvDtlR.$itm_sub2_view, IvDtlR.$itm_sub2_data);
			putPrntItmSub3(dest, IvDtlR.$itm_sub3_view, IvDtlR.$itm_sub3_data);

			dest.cntry_org_cd(src.cntry_org_cd());
			dest.cntry_org_nm(src.getStringNE("cntry_org_nm"));
			dest.trd_unit_qty(src.trd_unit_qty());
			dest.trd_unit_nm(src.getStringNE("trd_unit_nm"));
			dest.trd_unit_cd(src.trd_unit_cd());
			dest.trd_cur_upri(src.trd_cur_upri().multiply(
					MAUCL_TrdUtil.getUpriDispPm(src.getString("trd_ptn_typ"), src.getBooleanNE("dscnt_itm_flg"))));
			dest.d_amt(src.trd_cur_amt().multiply(
					MAUCL_TrdUtil.getAmtDispPm(src.getString("trd_ptn_typ"), src.getBooleanNE("dscnt_itm_flg"))));
			dest.tax_rate(src.getNumberNE("tax_rate"));
			dest.inc_tax_flg(src.getBooleanNE("inc_tax_flg"));
			if (dest.inc_tax_flg()) {
				dest.t_tax_inclusive(MSC_IV_PRNT_STR.INC_TAX.name());
			}
			dest.d_tax_amt(src.trd_cur_tax_amt());
			dest.unit_dec_place(src.getNumberNE("unit_dec_place"));
			dest.cst_po_no(src.cst_po_no());
			dest.cst_po_d_no(src.cst_po_d_no());
			dest.base_unit_qty(src.base_unit_qty());
			dest.base_unit_nm(src.getStringNE("base_unit_nm"));
			dest.base_unit_cd(src.base_unit_cd());
			dest.upri_base_unit_nm(src.getStringNE("base_unit_nm"));
			dest.upri_base_unit_cd(src.base_unit_cd());
			dest.base_unit_dec_place(src.getNumber("base_unit_dec_place"));
			dest.iv_itm_nm(src.iv_itm_nm());
			dest.iv_itm_alt_nm1(src.getStringNE("iv_itm_alt_nm1"));
			dest.iv_itm_alt_nm2(src.getStringNE("iv_itm_alt_nm2"));
			dest.iv_itm_alt_nm3(src.getStringNE("iv_itm_alt_nm3"));
			dest.iv_itm_alt_nm4(src.getStringNE("iv_itm_alt_nm4"));
			dest.cst_itm_cd(src.cst_itm_cd());
			dest.cst_itm_nm(src.cst_itm_nm());

		}

		/**
		 * 運賃、保険以外で、金額が0でないものを抽出
		 */
		public class Match1 implements MCRowMatcher<MST_IV_D_R> {
			public boolean match(MST_IV_D_R m) {
				if (!MAC_EXIM_XPNS_TYP.isFREIGHT(m.getStringNE("exim_xpns_typ"))
						&& !MAC_EXIM_XPNS_TYP.isINSURANCE(m.getStringNE("exim_xpns_typ"))
						&& !m.trd_cur_upri().isZero()) {
					return true;
				}
				return false;
			}
		}

		/**
		 * インボイス用ヘッダ印刷情報を作成
		 * 
		 * @param iv_mng_no インボイス管理ＮＯ
		 * @param iv_rev インボイス改訂番号
		 */
		protected void makeHdrIv(String iv_mng_no, MCNumber iv_rev) {
			srchHdr(iv_mng_no, iv_rev);
			copy(_ivHdr, _exIvR, createMap_IvHdrR_MST_IV_R());
			
			if (!MAC_TRD_PTN_TYP.isSLS(_exIvR.trd_ptn_typ())) {
				_ivHdr.base_unit_disp_flg(true);
				if (MAC_TRD_PTN_TYP.isXFR(_exIvR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isXFR_RTN(_exIvR.trd_ptn_typ())) {
					addNonTgtSetKey(_nonTgtIVSet, _exIvR);
				}
			}
			
			_ivHdr.prnt_dt(getToday()); //発行日
			setAddr();
		}

		
		/**
		 *印刷済みの 印刷データを取得する。
		 * @param r 印刷時の情報
		 * @return 印刷情報のリスト
		 */
		protected MCList<MCReportInfoR> searchPrintData(MST_IV_R ivR) {
			MSBER_IvLst reportSet = MSBER_IvLst.create();
			reportSet.setAppReportNo1(ivR.iv_no());
			reportSet.setAppReportNo2(ivR.iv_mng_no());
			reportSet.setAppReportNo3(ivR.iv_rev().toString());
			String prntLclCd = ivR.getStringNE("prnt_lcl_cd");
			if (!isNull(prntLclCd)) {
				reportSet.setLocale(toLocaleFromLclCd(prntLclCd));
			}
			else {
				reportSet.setLocale(MSBER_IvLst.create().getLocale());
			}
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
			return infoL;
		}
		
		/**
		 * 業務情報を設定する。
		 */
		protected void setAppData(){
			_tmpRs.setAppReportNo1(_exIvR.iv_no());
			_tmpRs.setAppReportNo2(_exIvR.iv_mng_no());
			_tmpRs.setAppReportNo3(_exIvR.iv_rev().toString());
			_tmpRs.setAppToCd1(_exIvR.ship_rqst_id_cd());
			_tmpRs.setAppToNm1(_exIvR.getStringNE("ship_rqst_id_nm"));
			_tmpRs.setAppToCd2(_exIvR.getStringNE("dlv_cd"));
			_tmpRs.setAppToNm2(_exIvR.getStringNE("dlv_nm"));
		}
		
		/**
		 *ヘッダ印刷情報を検索
		 * 
		 * @param iv_mng_no インボイス管理ＮＯ
		 * @param iv_rev インボイス改訂番号
		 */
		protected void srchHdr(String iv_mng_no, MCNumber iv_rev) {
			MCRow bind = MCRow.create();
			bind.addStringColumn(MST_IV_R.$iv_mng_no, iv_mng_no);
			bind.addNumberColumn(MST_IV_R.$iv_rev, iv_rev);
			
			executeQuery(_exIvR, MSBEL5720_MST_IV_S01(), bind);
		}

		protected void setAddr() {
			_ivHdr.co_addr(concatAddress(_ivHdr.co_addr1(), _ivHdr.co_addr2(), _ivHdr.co_addr3(), _ivHdr.co_addr4()));
			_ivHdr.ship_rqst_addr(concatAddress(_ivHdr.ship_rqst_addr1(), _ivHdr.ship_rqst_addr2(), _ivHdr.ship_rqst_addr3(), _ivHdr.ship_rqst_addr4()));
			_ivHdr.dlv_addr(concatAddress(_ivHdr.dlv_addr1(), _ivHdr.dlv_addr2(), _ivHdr.dlv_addr3(), _ivHdr.dlv_addr4()));
		}

		protected String getLclCd(MST_IV_R ivR){
			String prnt_lcl_cd = ivR.getStringNE("prnt_lcl_cd"); //帳票出力ロケールＣＤ
			if (!isNull(prnt_lcl_cd)) {
				return prnt_lcl_cd;
			}
			MSBER_IvLst localRs = MSBER_IvLst.create();
			return toLclCd(localRs.getLocale());
		}
		
		/**
		 * 一括発行用のマップに設定する
		 */
		protected void setIvMap() {
			MSBER_IvLst rs = MSBER_IvLst.create();
			List<MSBER_IvLst> list = _ivLstReportMap.get(_tmpRs.getAppToCd2());
			if (list == null) {
				list = new ArrayList<MSBER_IvLst>();
				_ivLstReportMap.put(_tmpRs.getAppToCd2(), list);
			}
			rs.addAll(_tmpRs.getAll());
			rs.setLocale(_tmpRs.getLocale());
			rs.setAppReportNo1(_tmpRs.getAppReportNo1());
			rs.setAppReportNo2(_tmpRs.getAppReportNo2());
			rs.setAppReportNo3(_tmpRs.getAppReportNo3());
			list.add(rs);
		}
		
		/**
		 * インボイスソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBER_IvLst>> ivMapSort(Map<String, List<MSBER_IvLst>> map) {
			// インボイスReportSetマップソート（納品先順）
			List<Entry<String, List<MSBER_IvLst>>> entries = new ArrayList<Entry<String, List<MSBER_IvLst>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
			LinkedHashMap<String, List<MSBER_IvLst>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBER_IvLst>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}
			
			return result;
		}
		
		//---
		protected Map_IvHdrR_MST_IV_R<IvHdrR,MST_IV_R> createMap_IvHdrR_MST_IV_R() {
			return new Map_IvHdrR_MST_IV_R<IvHdrR, MST_IV_R>();
		}

		public class Map_IvHdrR_MST_IV_R<D extends IvHdrR, S extends MST_IV_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IvHdrR.$iv_mng_no, MST_IV_R.$iv_mng_no);
				addColumnPathMap(IvHdrR.$iv_no, MST_IV_R.$iv_no);
				addColumnPathMap(IvHdrR.$iv_rev, MST_IV_R.$iv_rev);
				addColumnPathMap(IvHdrR.$iv_dt, MST_IV_R.$iv_dt);
				addColumnPathMap(IvHdrR.$ship_rqst_id_cd, MST_IV_R.$ship_rqst_id_cd);
				addColumnPathMap(IvHdrR.$dlv_addr1, MST_IV_R.$dlv_addr1);
				addColumnPathMap(IvHdrR.$dlv_addr2, MST_IV_R.$dlv_addr2);
				addColumnPathMap(IvHdrR.$dlv_addr3, MST_IV_R.$dlv_addr3);
				addColumnPathMap(IvHdrR.$dlv_addr4, MST_IV_R.$dlv_addr4);
				addColumnPathMap(IvHdrR.$trnspt_cd, MST_IV_R.$trnspt_cd);
				addColumnPathMap(IvHdrR.$vssl_flght, MST_IV_R.$vssl_flght);
				addColumnPathMap(IvHdrR.$etd_dt, MST_IV_R.$etd_dt);
				addColumnPathMap(IvHdrR.$load_port_cd, MST_IV_R.$load_port_cd);
				addColumnPathMap(IvHdrR.$dschrg_port_cd, MST_IV_R.$dschrg_port_cd);
				addColumnPathMap(IvHdrR.$via_port_cd, MST_IV_R.$via_port_cd);
				addColumnPathMap(IvHdrR.$tterm_cd1, MST_IV_R.$tterm_cd1);
				addColumnPathMap(IvHdrR.$tterm_cd2, MST_IV_R.$tterm_cd2);
				addColumnPathMap(IvHdrR.$tterm_cd3, MST_IV_R.$tterm_cd3);
				addColumnPathMap(IvHdrR.$tterm_rmrks3, MST_IV_R.$tterm_rmrks3);
				addColumnPathMap(IvHdrR.$lc_no, MST_IV_R.$lc_no);
				addColumnPathMap(IvHdrR.$lc_dt, MST_IV_R.$lc_dt);
				addColumnPathMap(IvHdrR.$lc_rmrks, MST_IV_R.$lc_rmrks);
				addColumnPathMap(IvHdrR.$bl_no, MST_IV_R.$bl_no);
				addColumnPathMap(IvHdrR.$bl_dt, MST_IV_R.$bl_dt);
				addColumnPathMap(IvHdrR.$bl_rmrks, MST_IV_R.$bl_rmrks);
				addColumnPathMap(IvHdrR.$case_mrk1, MST_IV_R.$case_mrk1);
				addColumnPathMap(IvHdrR.$case_mrk2, MST_IV_R.$case_mrk2);
				addColumnPathMap(IvHdrR.$case_mrk3, MST_IV_R.$case_mrk3);
				addColumnPathMap(IvHdrR.$case_mrk4, MST_IV_R.$case_mrk4);
				addColumnPathMap(IvHdrR.$case_mrk5, MST_IV_R.$case_mrk5);
				addColumnPathMap(IvHdrR.$case_mrk6, MST_IV_R.$case_mrk6);
				addColumnPathMap(IvHdrR.$iv_rmrks, MST_IV_R.$iv_rmrks);
				addColumnPathMap(IvHdrR.$amt, MST_IV_R.$ttl_trd_cur_amt);
				addColumnPathMap(IvHdrR.$dlv_id_typ, MST_IV_R.$dlv_id_typ);

				addColumnPathMap(IvHdrR.$co_nm, "co_nm");
				addColumnPathMap(IvHdrR.$co_tel, "co_tel");
				addColumnPathMap(IvHdrR.$co_fax, "co_fax");
				addColumnPathMap(IvHdrR.$co_addr1, "co_addr1");
				addColumnPathMap(IvHdrR.$co_addr2, "co_addr2");
				addColumnPathMap(IvHdrR.$co_addr3, "co_addr3");
				addColumnPathMap(IvHdrR.$co_addr4, "co_addr4");
				addColumnPathMap(IvHdrR.$ship_rqst_id_nm, "ship_rqst_id_nm");
				addColumnPathMap(IvHdrR.$ship_rqst_id_alt_nm1, "ship_rqst_id_alt_nm1");
				addColumnPathMap(IvHdrR.$ship_rqst_id_alt_nm2, "ship_rqst_id_alt_nm2");
				addColumnPathMap(IvHdrR.$ship_rqst_id_alt_nm3, "ship_rqst_id_alt_nm3");
				addColumnPathMap(IvHdrR.$ship_rqst_id_alt_nm4, "ship_rqst_id_alt_nm4");
				addColumnPathMap(IvHdrR.$ship_rqst_addr1, "ship_rqst_addr1");
				addColumnPathMap(IvHdrR.$ship_rqst_addr2, "ship_rqst_addr2");
				addColumnPathMap(IvHdrR.$ship_rqst_addr3, "ship_rqst_addr3");
				addColumnPathMap(IvHdrR.$ship_rqst_addr4, "ship_rqst_addr4");
				addColumnPathMap(IvHdrR.$cur_nm, "cur_nm");
				addColumnPathMap(IvHdrR.$cur_cd, "cur_cd");
				addColumnPathMap(IvHdrR.$tterm_nm1, "tterm_nm1");
				addColumnPathMap(IvHdrR.$tterm_nm2, "tterm_nm2");
				addColumnPathMap(IvHdrR.$tterm_nm3, "tterm_nm3");
				addColumnPathMap(IvHdrR.$trnspt_nm, "trnspt_nm");
				addColumnPathMap(IvHdrR.$load_port_nm, "load_port_nm");
				addColumnPathMap(IvHdrR.$dschrg_port_nm, "dschrg_port_nm");
				addColumnPathMap(IvHdrR.$via_port_nm, "via_port_nm");
				addColumnPathMap(IvHdrR.$dlv_id_cd, "dlv_cd");
				addColumnPathMap(IvHdrR.$dlv_id_nm, "dlv_nm");
				addColumnPathMap(IvHdrR.$dlv_id_alt_nm1, "dlv_id_alt_nm1");
				addColumnPathMap(IvHdrR.$dlv_id_alt_nm2, "dlv_id_alt_nm2");
				addColumnPathMap(IvHdrR.$dlv_id_alt_nm3, "dlv_id_alt_nm3");
				addColumnPathMap(IvHdrR.$dlv_id_alt_nm4, "dlv_id_alt_nm4");
				addColumnPathMap(IvHdrR.$iv_sub_char1, "iv_sub_char1");
				addColumnPathMap(IvHdrR.$iv_sub_char2, "iv_sub_char2");
				addColumnPathMap(IvHdrR.$iv_sub_char3, "iv_sub_char3");
				addColumnPathMap(IvHdrR.$co_cntry_nm, "co_cntry_nm");
				addColumnPathMap(IvHdrR.$ship_rqst_cntry_nm, "ship_rqst_cntry_nm");
				addColumnPathMap(IvHdrR.$dlv_cntry_nm, "dlv_cntry_nm");
				addColumnPathMap(IvHdrR.$dlv_cntry_cd, "dlv_cntry_cd");
			}
		}
		protected void callIVAttachSrv(List<MCReportSet> rsList) {
			List<Attach_Chk01_DtlR> upLst = new ArrayList<Attach_Chk01_DtlR>();
			createAttachLst(rsList,upLst);
			
			if(upLst.isEmpty()) {
				return;
			}
			
			MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
			setAttachUp(ope,upLst);
			ope.exec();
		}
		protected void createAttachLst(List<MCReportSet> rsList, List<Attach_Chk01_DtlR> upLst) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(IvHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				IvHdrR hdrR = (IvHdrR) hdrL.get(0);
				
				//再発行もしくは貸出は登録サービス呼び出し対象外
				if(isNonTgt(_nonTgtIVSet,hdrR)) {
					continue;
				}
				editAttachMap(rs,hdrR,upLst);
			}
		}
		protected void editAttachMap(MCReportSet rs, IvHdrR hdrR,List<Attach_Chk01_DtlR> upLst) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_IvHdrR());
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			upLst.add(up0);
		}
		protected void setAttachUp(MBBCL_AttachService.Attach_Upd01 ope,List<Attach_Chk01_DtlR> upLst) {
			ope.up0().addAll(upLst);
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(false);
		}
		protected Boolean isNonTgt(Set<List<String>> exSet,IvHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.iv_mng_no());
			list.add(hdrR.iv_rev().toString());
			
			if(exSet.contains(list)) {
				return true;
			}
			return false;
		}

		protected Map_Attach_Chk01_DtlR_IvHdrR<Attach_Chk01_DtlR, IvHdrR> createMap_Attach_Chk01_DtlR_IvHdrR() {
			return new Map_Attach_Chk01_DtlR_IvHdrR<Attach_Chk01_DtlR, IvHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_IvHdrR<D extends Attach_Chk01_DtlR, S extends IvHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, IvHdrR.$iv_no);//インボイスＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, IvHdrR.$iv_dt);//インボイス日付
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, IvHdrR.$ship_rqst_id_cd);//納品先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, IvHdrR.$cur_cd);//通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cntry_cd, IvHdrR.$dlv_cntry_cd);//納品先国ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$dlv_cd, IvHdrR.$dlv_id_cd);//納品先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd1, IvHdrR.$tterm_cd1);//取引条件ＣＤ1
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd2, IvHdrR.$tterm_cd2);//取引条件ＣＤ2
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd3, IvHdrR.$tterm_cd3);//取引条件ＣＤ3
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.IV.value());//業務区分：インボイス
				dest.biz_key2(src.iv_rev().toString());//改訂番号
				dest.amt(src.amt().add(src.tax_amt()));//税込金額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		/**添付帳票登録サービス呼出対象外の帳票情報をセットに追加
		 */
		protected void addNonTgtSetKey(Set<List<String>> tgtSet,MST_IV_R r) {
			List<String> keyLst = createIVSetKey(r);
			if(!tgtSet.contains(keyLst)) {
				tgtSet.add(keyLst);
			}
		}
		protected List<String> createIVSetKey(MST_IV_R r){
			List<String> list = new ArrayList<>();
			if (!isNull(r)) {
				list.add(r.iv_mng_no());//インボイス管理ＮＯ
				list.add(r.iv_rev().toString());//改訂番号
			}
			return list;
		}
	}
	/**
	 * ExRpt_Prnt02オペレーション.<p>
	 *
	 * パッキングリストを印刷する（複数印刷用）<br>
	 */
	public class ExRpt_Prnt02 extends MSBEL_ExRptService_MC_A.ExRpt_Prnt02 {
		/** パッキングリストReportSetマップ */
		protected Map<String, List<MSBER_PckLst>> _pckLstReportMap;
		/** 再発行パッキングリストReportSetマップ */
		protected Map<String, MCReportInfoR> _pckLstReprntMap;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initVariable();
			MCList<ExRpt_Prnt02_CndR> okList = chkPl();
			prnt(okList);
		}
		
		/**
		 * 変数の初期化
		 */
		protected void initVariable() {
		
			_pckLstReportMap = new LinkedHashMap<String, List<MSBER_PckLst>>();
			_pckLstReprntMap = new LinkedHashMap<String, MCReportInfoR>();
		}
		
		/**
		 * 印刷前チェックを実施する。
		 * @return 印刷対象データ
		 */
		protected MCList<ExRpt_Prnt02_CndR>  chkPl(){
			MCList<ExRpt_Prnt02_CndR> okList = MCList.create(ExRpt_Prnt02_CndR.class);
			MCList<MST_IV_R> chkL = lockIv(up0());
			MCIndexKey ik = chkL.createIndex(MST_IV_R.$iv_no);
			up0().addStringColumn(MST_IV_R.$iv_mng_no);
			up0().addNumberColumn(MST_IV_R.$iv_rev);
			for(ExRpt_Prnt02_CndR up : up0()){
				MST_IV_R chkR = chkL.getFirst(ik, up.iv_no());
				MCMessageList msgList = new MCMessageList();

				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_IV",
							new String[]{MST_IV_R.$iv_no},
							new Comparable[]{up.iv_no()}, up));
				}
				else {
					// 未登録のインボイスチェック
					if (MAC_STR.isNULL_VAL(up.iv_no())) {
						msgList.add(new MCMessage(up, null, MSBEL0320, toDispGUIIndex(up)));
					}
					// パッキングリスト省略チェック
					if (chkR.pl_skip_flg()) {
						msgList.add(new MCMessage(up, null, MSBEL0321, up.iv_no(), toDispGUIIndex(up)));
					}
					else if (!chkR.pl_reg_flg()) {
						// 未登録のパッキングリストチェック
						msgList.add(new MCMessage(up, null, MSBEL0323, up.iv_no(), toDispGUIIndex(up)));
					}

				}
				if (msgList.isEmpty()) {
					up.pl_prnt_flg(chkR.pl_prnt_flg());
					up.ship_rqst_id_cd(chkR.ship_rqst_id_cd());
					up.ship_rqst_id_nm(chkR.getStringNE("ship_rqst_id_nm"));
					up.dlv_id_cd(chkR.dlv_id_cd());
					up.dlv_id_nm(chkR.getStringNE("dlv_id_nm"));
					up.prnt_lcl_cd(chkR.getStringNE("prnt_lcl_cd"));
					up.setStringNE(MST_IV_R.$iv_mng_no, chkR.iv_mng_no());
					up.setNumberNE(MST_IV_R.$iv_rev, chkR.iv_rev());
					
					okList.add(up);
				}
				else {
					MCMessagePool.addAll(msgList);
					up.err_flg(true);
				}
				down0().add(up);
			}
			
			return okList;
		}
		/**
		 * パッキングリストを発行する
		 * @param r 印刷対象情報
		 */
		protected void prnt(MCList<ExRpt_Prnt02_CndR> okList){
			for(ExRpt_Prnt02_CndR r : okList){
				makePckLstList(r);
			}
			// 印刷
			prntAll();
		}
		/**
		 * MCReportSetのListをもとに帳票を発行します。
		 *  ※　印刷データの登録は実施しません。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected void prntAll() {
			if (_pckLstReportMap == null || _pckLstReportMap.size() == 0) {
				return;
			}
			
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				getIndivPrnt(up0());
			}
			
			// ソート処理
			_pckLstReportMap = pckMapSort(_pckLstReportMap);
			
			for (Map.Entry<String, List<MSBER_PckLst>> en : _pckLstReportMap.entrySet()) {
				MCReportInfoR pckLstReprntInfo = null;
				MCReportSet allPckRs = null;
				boolean isPckInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldPck = null;
					for (MSBER_PckLst pck : en.getValue()) {
						if(isSame(pck.getAppReportNo1(), oldPck)) {
							allPckRs.addAll(pck.getAll());
						}
						else {
							if (allPckRs != null) {
								allPckRs.setRegister(false);
								MCServerReportManager.request(allPckRs);
							}
							pckLstReprntInfo = getPckLstReprntInfo(pck);
							if (isNull(pckLstReprntInfo)) {
								allPckRs = pck.createInstance();
								allPckRs.setLocale(pck.getLocale());
								allPckRs.addAll(pck.getAll());
								oldPck = pck.getAppReportNo1();
							}
							else {
								allPckRs = null;
								MCServerReportManager.reprint(pckLstReprntInfo);
							}
						}
					}
					if (allPckRs != null) {
						allPckRs.setRegister(false);
						MCServerReportManager.request(allPckRs);
					}
				}
				else {
					// まとめ発行
					for (MSBER_PckLst pck : en.getValue()) {
						if (!isPckInit) {
							allPckRs = pck.createInstance();
							allPckRs.setLocale(pck.getLocale());
							isPckInit = true;
						}
						pckLstReprntInfo = getPckLstReprntInfo(pck);
						if (isNull(pckLstReprntInfo)) {
							allPckRs.addAll(pck.getAll());
						}
					}
					if (allPckRs.size() != 0) {
						MCServerReportManager.request(allPckRs);
					}
					for (Map.Entry<String, MCReportInfoR> reprntPck : _pckLstReprntMap.entrySet()) {
						if(isSame(reprntPck.getValue().app_to_cd2(), en.getKey())) {
							MCServerReportManager.reprint(reprntPck.getValue());
						}
					}
				}
			}
		}

		protected MCReportInfoR getPckLstReprntInfo(MSBER_PckLst pck) {
			MCReportInfoR info = pck.getReportInfo();
			return _pckLstReprntMap.get(info.app_report_no1());
		}
		/**
		 * パッキングリストの印刷データを作成する。
		 * @param r
		 */
		protected void makePckLstList(ExRpt_Prnt02_CndR cnd){
			// 印刷済みの場合は再印刷
			if (cnd.pl_prnt_flg()) {
				makeRePrintList(cnd);
				return;
			}
			//　パッキングリストの印刷データ作成
			makePlPrintData(cnd);
		}

		 /**
		  * パッキングリストの再印刷データを作成する。
		 * @param r 印刷時の情報
		  */
		protected void makeRePrintList(ExRpt_Prnt02_CndR r){
			// 業務情報を設定し、印刷データからデータを取得
			MCList<MCReportInfoR> infoL = searchPrintData(r);
			
			if(!isNull(infoL) && !infoL.isEmpty()){
				// 印刷データが取得できた場合は再印刷
				MSBER_PckLst repSetNew = (MSBER_PckLst) MCServerReportManager.toReportSet(infoL.get(0));
				List<MSBER_PckLst> l = _pckLstReportMap.get(r.dlv_id_cd());
				if (null == l) {
					l = new ArrayList<MSBER_PckLst>(Arrays.asList(new MSBER_PckLst[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_pckLstReportMap.put(r.dlv_id_cd(), l);
				_pckLstReprntMap.put(r.iv_no(), infoL.get(0));
			}
		}
		
		/**
		 *印刷済みの 印刷データを取得する。
		 * @param r 印刷時の情報
		 * @return 印刷情報のリスト
		 */
		protected MCList<MCReportInfoR> searchPrintData(ExRpt_Prnt02_CndR r){
			MSBER_PckLst reportSet = MSBER_PckLst.create();
			reportSet.setAppReportNo1(r.iv_no());
			if(!isNull(r.prnt_lcl_cd())) {
				reportSet.setLocale(toLocaleFromLclCd(r.prnt_lcl_cd()));
			}
			else {
				reportSet.setLocale(MSBER_PckLst.create().getLocale());
			}
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
			return infoL;
		}

		/**
		 *印刷データを作成する。
		 * @param r 印刷対象の情報
		 */
		protected void makePlPrintData(ExRpt_Prnt02_CndR cnd){
			MSBER_PckLst reportSet = MSBER_PckLst.create();
			// ヘッダデータ検索
			PckLstHdrR hdr = makePlHdrData(cnd);
			reportSet.addRow(hdr);
			// 業務情報をセット
			setAppData(reportSet, hdr);
			// 明細データ検索
			MCList<PckLstDtlR> dtl = makePlDtlData(reportSet, hdr);
			reportSet.addAll(dtl);

			//　印刷データのみを作成 　※ 実際の印刷処理は最後にまとめて実施
			MCServerReportManager.request(reportSet, false);
			
			// 一括発行用のマップに設定する
			setPckMap(reportSet);
			
			// インボイスヘッダを更新
			updIv(cnd);
		}
		
		/**
		 * 一括発行用のマップに設定する
		 * @param reportSet
		 */
		protected void setPckMap(MSBER_PckLst reportSet) {
			MSBER_PckLst rs = MSBER_PckLst.create();
			List<MSBER_PckLst> list = _pckLstReportMap.get(reportSet.getAppToCd2());
			if (list == null) {
				list = new ArrayList<MSBER_PckLst>();
				_pckLstReportMap.put(reportSet.getAppToCd2(), list);
			}
			rs.addAll(reportSet.getAll());
			rs.setLocale(reportSet.getLocale());
			rs.setAppReportNo1(reportSet.getAppReportNo1());
			list.add(rs);
		}
		
		/**
		 * パッキングリストのヘッダデータを作成する。
		 * @param r 印刷対象の情報
		 */
		protected PckLstHdrR makePlHdrData(ExRpt_Prnt02_CndR cnd) {
			PckLstHdrR hdrData = PckLstHdrR.create();
			executeQuery(hdrData, MSBEL5720_MST_IV_S01(), cnd);
			editHdr(hdrData);
			return hdrData;
		}
		/**
		 * ヘッダ情報を編集する。
		 * @param hdrData　ヘッダ情報
		 */
		protected void editHdr(PckLstHdrR hdrData){
			// 印刷日に[運用日付]を設定
			hdrData.prnt_dt(getToday());
			// 住所の設定
			setAddr(hdrData);		
			// 納品先別名の設定
			setDlvAltNm(hdrData);
		}
		/**
		 * 住所を設定する。
		 * @param hdrR　ヘッダ情報
		 */
		protected void setAddr(PckLstHdrR hdrData) {
			hdrData.co_addr(concatAddress(hdrData.co_addr1(), hdrData.co_addr2(), hdrData.co_addr3(), hdrData.co_addr4()));
			hdrData.ship_rqst_addr(concatAddress(hdrData.ship_rqst_addr1(), hdrData.ship_rqst_addr2(), hdrData.ship_rqst_addr3(), hdrData.ship_rqst_addr4()));
			hdrData.dlv_addr(concatAddress(hdrData.dlv_addr1(), hdrData.dlv_addr2(), hdrData.dlv_addr3(), hdrData.dlv_addr4()));
		}
		
		/**
		 * 納品先別名を設定する。
		 * @param hdrData ヘッダ情報
		 */
		protected void setDlvAltNm(PckLstHdrR hdrData) {
			hdrData.dlv_alt_nm1(hdrData.getString("dlv_id_alt_nm1"));
			hdrData.dlv_alt_nm2(hdrData.getString("dlv_id_alt_nm2"));
			hdrData.dlv_alt_nm3(hdrData.getString("dlv_id_alt_nm3"));
			hdrData.dlv_alt_nm4(hdrData.getString("dlv_id_alt_nm4"));
		}
		
		protected MCList<PckLstDtlR> makeDtlHdr(){
			MCList<PckLstDtlR> drlHdr = MCList.create(PckLstDtlR.class);
			
			// 長い線として出力する列を追加
			addLongLinePLRow(drlHdr);

			PckLstDtlR dtlR = PckLstDtlR.create();
			dtlR.t_cont_no(MSC_PL_PRNT_STR.CONT.name());
			dtlR.t_itm_code(MSC_PL_PRNT_STR.ITEM.name());
			dtlR.t_qty(MSC_PL_PRNT_STR.QTY.name());
			dtlR.t_net(MSC_PL_PRNT_STR.NET.name());
			dtlR.t_grss(MSC_PL_PRNT_STR.GROSS.name());
			dtlR.t_dim(MSC_PL_PRNT_STR.DIM.name());
			drlHdr.add(dtlR);
			
			// （KG）などの表示は2行目にする
			dtlR = PckLstDtlR.create();
			dtlR.t_net(MSC_PL_PRNT_STR.KG.name());
			dtlR.t_grss(MSC_PL_PRNT_STR.KG.name());
			dtlR.t_dim(MSC_PL_PRNT_STR.M3.name());
			drlHdr.add(dtlR);
			
			// 長い線として出力する列を追加
			addLongLinePLRow(drlHdr);
			
			return drlHdr;
		}
		/**
		 * パッキングリストの明細データを作成する。
		 * @param r 印刷対象の情報
		 */
		protected MCList<PckLstDtlR> makePlDtlData(MSBER_PckLst reportSet ,PckLstHdrR hdrData) {
			// 明細ヘッダの作成
			MCList<PckLstDtlR> dtlList = makeDtlHdr();
			
			// 明細本体の作成
			MCList<PckLstDtlR> rsltList = MCList.create(PckLstDtlR.class);
			executeQuery(rsltList, MSBEL5720_MST_PL_D_S01(), hdrData);
			dtlList.addAll(editDtl(reportSet, rsltList));
			
			// 取引単位での合計数を設定
			MCList<PckLstDtlR> unitSumList = makeUnitSum(reportSet, rsltList);
			dtlList.addAll(unitSumList);
			// 明細フッタを作成
			MCList<PckLstDtlR> ttlSumList = makeTtlSum(reportSet, rsltList);
			dtlList.addAll(ttlSumList);
			// 原産地単位のリストを作成
			MCList<PckLstDtlR> ftr = makeCntryOrg(rsltList);
			dtlList.addAll(ftr);

			return dtlList;
		}
		/**
		 * 明細情報を編集する。
		 * @param DtlData　明細情報
		 */
		protected MCList<PckLstDtlR> editDtl(MSBER_PckLst reportSet ,MCList<PckLstDtlR> dtlList){
			
			MCList<PckLstDtlR> prntDtlList = MCList.create(PckLstDtlR.class);

			// 数値系表示用項目を設定
			putNumStrAll(reportSet, dtlList);

			for(PckLstDtlR r : dtlList){
				// 表示用文字列の設定
				putViewStrDtl(r);
				// コンテナ数を設定
				setContainer(r);
				// 明細行の追加
				prntDtlList.add(makePLD(r));
			}
			prntDtlList.sort(PckLstDtlR.$disp_seq);
			
			return prntDtlList;
		}
		
		/**
		 * 表示用項目を設定する。
		 * @param dtl　明細情報
		 */
		protected void putViewStrDtl(PckLstDtlR dtl) {
			
			putPrntItmSub1(dtl, PckLstDtlR.$itm_sub1_view, PckLstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtl, PckLstDtlR.$itm_sub2_view, PckLstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtl, PckLstDtlR.$itm_sub3_view, PckLstDtlR.$itm_sub3_data);
		}
		/**
		 * ”コンテナ数”を設定する。
		 * @param dtl　明細情報
		 */
		protected void setContainer(PckLstDtlR dtl) {
			if(!isNullOr(dtl.cntnr_no_fr(), dtl.cntnr_no_to())){
				dtl.cntnr_no_fr_to(dtl.cntnr_no_fr().toString() + '-' + dtl.cntnr_no_to().toString());
			}
			else if(!isNull(dtl.cntnr_no_fr())){
				dtl.cntnr_no_fr_to(dtl.cntnr_no_fr().toString());
			}
			else if(!isNull(dtl.cntnr_no_to())){
				dtl.cntnr_no_fr_to(dtl.cntnr_no_to().toString());
			}

			if(isNullOr(dtl.cntnr_no_fr(), dtl.cntnr_no_to())){
				// 梱包番号ＦＲもしくは、梱包番号TOが未設定の場合は"1"固定
				dtl.container("1");
			}
			else{
				// コンテナ数 ＝ 梱包番号ＴＯ－ 梱包番号ＦＲ ＋ １ 
				MCNumber container = dtl.cntnr_no_to().subtract(dtl.cntnr_no_fr()).add(1);
				dtl.container(container.toString());
			}
			dtl.container(MSC_PL_PRNT_STR.LEFT.name() + dtl.container()
					+ MSC_PL_PRNT_STR.RIGHT.name());

		}
		
		/**
		 * 取引単位ごとの数量計リストを作成する。
		 * @param baseDtlList 元となる明細データリスト
		 * @return
		 */
		protected MCList<PckLstDtlR> makeUnitSum(MSBER_PckLst reportSet ,MCList<PckLstDtlR> baseDtlList){
			MCList<PckLstDtlR> dtlList = MCList.create(PckLstDtlR.class);

			// 長い線として出力する列を追加
			addLongLinePLRow(dtlList);
			
			MCGroupByPolicy gp = new MCGroupByPolicy(PckLstDtlR.$trd_unit_nm, PckLstDtlR.$trd_unit_dec_place);
			gp.sum(PckLstDtlR.$trd_unit_qty);
			MCList<PckLstDtlR> unitSumListl = baseDtlList.groupBy(gp);
			unitSumListl.sort(PckLstDtlR.$trd_unit_nm);
			boolean isFirst = true;
			for (PckLstDtlR r : unitSumListl) {
				PckLstDtlR dtlR = PckLstDtlR.create();
				if (isFirst) {
					dtlR.t_total(MSC_IV_PRNT_STR.TOTAL.name());
					isFirst = false;
				}
				dtlR.trd_unit_dec_place(r.trd_unit_dec_place());
				dtlR.sum_trd_unit_qty(r.trd_unit_qty());
				dtlR.sum_trd_unit_nm(r.trd_unit_nm());
				dtlList.add(dtlR);
			}
			// [整数部/小数部の分割]取引単位数の合計値
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_sum_trd_unit_qty, PckLstDtlR.$sum_trd_unit_qty, PckLstDtlR.$trd_unit_dec_place);
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_int_sum_trd_unit_qty, PckLstDtlR.$s_dec_sum_trd_unit_qty, PckLstDtlR.$sum_trd_unit_qty, PckLstDtlR.$trd_unit_dec_place);
	
			return dtlList;
		}
		
		/**
		 * 明細フッタを作成する。
		 * @param baseDtlList 元となる明細データリスト
		 * @return
		 */
		protected MCList<PckLstDtlR> makeTtlSum(MSBER_PckLst reportSet ,MCList<PckLstDtlR> baseDtlList){
			MCList<PckLstDtlR> dtlList = MCList.create(PckLstDtlR.class);
			PckLstDtlR ttlRow = PckLstDtlR.create();
			// 純重量
			MCNumber sumNetWt = baseDtlList.sum(PckLstDtlR.$net_wt);
			ttlRow.sum_net_wt(sumNetWt);
			// 総重量
			MCNumber sumGrssWt = baseDtlList.sum(PckLstDtlR.$grss_wt);
			ttlRow.sum_grss_wt(sumGrssWt);
			// 容積
			MCNumber sumDim = baseDtlList.sum(PckLstDtlR.$dim);
			ttlRow.sum_dim(sumDim);
			dtlList.add(ttlRow);
			
			// [整数部/小数部の分割]純重量の合計値
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_sum_net_wt, PckLstDtlR.$sum_net_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			// [整数部/小数部の分割]総重量の合計値
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_sum_grss_wt, PckLstDtlR.$sum_grss_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			// [整数部/小数部の分割]容積の合計値
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_sum_dim, PckLstDtlR.$sum_dim, MSC_PRNT_NUM.DIM_DEC_PLACE.value());

			return dtlList;
		}
		/**
		 * 原産地単位のリストを設定する。
		 * @param dtlList 明細リスト
		 */
		protected MCList<PckLstDtlR> makeCntryOrg(MCList<PckLstDtlR> baseDtlList){
			MCList<PckLstDtlR> ftrList = MCList.create(PckLstDtlR.class);
			// 長い線として出力する列を追加
			addLongLinePLRow(ftrList);

			// 原産地単位に集約
			MCList<PckLstDtlR> CntryOrgList = baseDtlList.groupBy(PckLstDtlR.$cntry_org_cd, PckLstDtlR.$cntry_org_nm);
			CntryOrgList.sort(PckLstDtlR.$cntry_org_cd);
			for (PckLstDtlR r : CntryOrgList) {
				if (!isNull(r.cntry_org_cd())) {
					PckLstDtlR dtlR = PckLstDtlR.create();
					dtlR.f_cntry_org_cd(r.cntry_org_cd());
					dtlR.t_made_in(MSC_IV_PRNT_STR.MADE_IN.name());
					dtlR.f_cntry_org_nm(r.cntry_org_nm());
					ftrList.add(dtlR);
				}
			}

			return ftrList;
		}
		/**
		 * 各数量項目について、表示用項目の設定を行う。
		 * @param reportSet　レポートセット
		 * @param dtlList 明細リスト
		 */
		protected void putNumStrAll(MSBER_PckLst reportSet ,MCList<PckLstDtlR> dtlList){
			// 取引単位数量
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_trd_unit_qty, PckLstDtlR.$trd_unit_qty, PckLstDtlR.$trd_unit_dec_place);
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_int_trd_unit_qty, PckLstDtlR.$s_dec_trd_unit_qty, PckLstDtlR.$trd_unit_qty, PckLstDtlR.$trd_unit_dec_place);
			// 純重量
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_net_wt, PckLstDtlR.$net_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_int_net_wt, PckLstDtlR.$s_dec_net_wt, PckLstDtlR.$net_wt, PckLstDtlR.$wt_dec_place);
			// 総重量
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_grss_wt, PckLstDtlR.$grss_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_int_grss_wt, PckLstDtlR.$s_dec_grss_wt, PckLstDtlR.$grss_wt, PckLstDtlR.$wt_dec_place);
			// 容積
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_dim, PckLstDtlR.$dim, MSC_PRNT_NUM.DIM_DEC_PLACE.value());
			putNumStr(reportSet, dtlList, PckLstDtlR.$s_int_dim, PckLstDtlR.$s_dec_dim, PckLstDtlR.$dim, PckLstDtlR.$dim_dec_place);
		}
		
		/**
		 * 明細のRowを作成する。
		 * @param dtlRow
		 * @return
		 */
		protected PckLstDtlR makePLD(PckLstDtlR dtlRow){
			PckLstDtlR row = PckLstDtlR.create();
			copy(row, dtlRow, createMap_PLD1());
			return row;
		}
		/**
		 * 業務情報を設定する。
		 */
		protected void setAppData(MSBER_PckLst reportSet, PckLstHdrR hdr){
			Locale prntLcl;
			if(!isNull(hdr.prnt_lcl_cd())){
				 prntLcl = toLocaleFromLclCd(hdr.prnt_lcl_cd());
			}
			else{
				 prntLcl =getUsrLocale();
			}
			reportSet.setLocale(prntLcl);
			reportSet.setAppReportNo1(hdr.iv_no());
			reportSet.setAppToCd1(hdr.ship_rqst_id_cd());
			reportSet.setAppToNm1(hdr.ship_rqst_id_nm());
			reportSet.setAppToCd2(hdr.dlv_cd());
			reportSet.setAppToNm2(hdr.dlv_nm());
		}
		
		/**
		 * インボイスヘッダをロックする。
		 * @param r 印刷対象の情報
		 */
		protected MCList<MST_IV_R> lockIv(MCList<ExRpt_Prnt02_CndR> trgL) {
			MCTempView t2 = createTempView("T2");
			MST_IV_R S1T1 = MST_IV_R.create("T1");
			MAM_BP_R S1M03 = MAM_BP_R.create("M03");
			MAM_LOC_R S1M04 = MAM_LOC_R.create("M04");
			MAM_BP_LCL_R m1 = MAM_BP_LCL_R.create("M1");
			MAM_BP_R m1b = MAM_BP_R.create("M1B");
			MAM_LOC_LCL_R m2 = MAM_LOC_LCL_R.create("M2");
			MAM_LOC_R m2b = MAM_LOC_R.create("M2B");
			MAM_BP_LCL_R m3 = MAM_BP_LCL_R.create("M3");
			MAM_BP_R m3b = MAM_BP_R.create("M3B");
			MAM_LOC_LCL_R m4 = MAM_LOC_LCL_R.create("M4");
			MAM_LOC_R m4b = MAM_LOC_R.create("M4B");

			MCList<MST_IV_R> chkL = MCList.create(MST_IV_R.class);
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t); 
			chkL_bldr.setSelect(t.iv_mng_no);
			chkL_bldr.addSelect(t.iv_no);
			chkL_bldr.addSelect(t.iv_rev);
			chkL_bldr.addSelect(t.pl_skip_flg);
			chkL_bldr.addSelect(t.pl_reg_flg);
			chkL_bldr.addSelect(t.ship_rqst_id_cd);
			chkL_bldr.addSelect(cases()
					.when(t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
					.then(nvl(m1.bp_nm, m1b.bp_nm))
					.when(t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.SPPL.value())))
					.then(nvl(m1.bp_nm, m1b.bp_nm))
					.when(t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
					.then(nvl(m2.loc_nm, m2b.loc_nm)).otherwise(nullValue())
					.as("ship_rqst_id_nm"));
			chkL_bldr.addSelect(t.dlv_id_cd);
			chkL_bldr.addSelect(
					cases().when(t.dlv_sundry_flg.eq(value(true))).then(t.dlv_id_nm)
							.when(MSC_DLV_ID_TYP$IS_DLV(t.dlv_id_typ).eq(value(true)))
							.then(nvl(m3.bp_nm, m3b.bp_nm))
							.when(MSC_DLV_ID_TYP$IS_LOC(t.dlv_id_typ).eq(value(true)))
							.then(nvl(m4.loc_nm, m4b.loc_nm)).otherwise(nullValue())
							.as("dlv_id_nm"));
			chkL_bldr.addSelect(t2.pr("prnt_lcl_cd"));
			chkL_bldr.addSelect(t.pl_prnt_flg);
			chkL_bldr
					.addInnerJoin(
							subQuery()
									.select(cases()
											.when(S1T1.ship_rqst_id_typ.eq(value(
													MSC_SHIP_RQST_ID_TYP.CST.value())))
											.then(S1M03.prnt_lcl_cd)
											.otherwise(S1M04.prnt_lcl_cd)
											.as("prnt_lcl_cd"), S1T1.iv_no,
											S1T1.ship_rqst_id_cd, S1T1.dlv_id_cd)
									.from(S1T1.leftOuterJoin(S1M03)
											.on(bracket(S1T1.dlv_id_cd.eq(S1M03.bp_cd)))
											.leftOuterJoin(S1M04)
											.on(bracket(S1T1.dlv_id_cd.eq(S1M04.loc_cd))))
									.view(t2),
							t.iv_no.eq(t2.pr(S1T1.iv_no)));
			chkL_bldr.addLeftOuterJoin(m1, bracket(t2.pr(S1T1.ship_rqst_id_cd)
					.eq(m1.bp_cd).and(t2.pr("prnt_lcl_cd").eq(m1.lcl_cd))));
			chkL_bldr.addLeftOuterJoin(m1b,
					bracket(t2.pr(S1T1.ship_rqst_id_cd).eq(m1b.bp_cd)));
			chkL_bldr.addLeftOuterJoin(m2, bracket(t2.pr(S1T1.ship_rqst_id_cd)
					.eq(m2.loc_cd).and(t2.pr("prnt_lcl_cd").eq(m2.lcl_cd))));
			chkL_bldr.addLeftOuterJoin(m2b,
					bracket(t2.pr(S1T1.ship_rqst_id_cd).eq(m2b.loc_cd)));
			chkL_bldr.addLeftOuterJoin(m3, bracket(t2.pr(S1T1.dlv_id_cd).eq(m3.bp_cd)
					.and(t2.pr("prnt_lcl_cd").eq(m3.lcl_cd))));
			chkL_bldr.addLeftOuterJoin(m3b, bracket(t2.pr(S1T1.dlv_id_cd).eq(m3b.bp_cd)));
			chkL_bldr.addLeftOuterJoin(m4, bracket(t2.pr(S1T1.dlv_id_cd).eq(m4.loc_cd)
					.and(t2.pr("prnt_lcl_cd").eq(m4.lcl_cd))));
			chkL_bldr.addLeftOuterJoin(m4b, bracket( t2.pr(S1T1.dlv_id_cd).eq(m4b.loc_cd)));
			chkL_bldr.addWhereWithAnd(t.iv_no.eq(bind(ExRpt_Prnt02_CndR.$iv_no)));
			chkL_bldr.setLockTable(t.iv_mng_no);
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBEL5720_MST_IV_S02", chkL, chkL_bldr, trgL);
			return chkL;
		}
		
		/**
		 * インボイスヘッダを更新する。
		 * @param r 印刷対象の情報
		 */
		protected void updIv(ExRpt_Prnt02_CndR r) {
			MST_IV_R iv = MST_IV_R.create();
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder iv_bldr = MCQueryApiBuilder.create(t); 
			iv.pl_prnt_flg(true);
			iv_bldr.setSet(t.pl_prnt_flg);
			iv_bldr.setWhere(t.iv_no.eq(bind("1")), r.iv_no());
			dbUpdate("MSBEL5720_MST_IV_U02", iv, iv_bldr);
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MST_IV_R ivR = MST_IV_R.create();
			ivR.iv_mng_no(r.getStringNE(MST_IV_R.$iv_mng_no));
			ivR.iv_rev(r.getNumberNE(MST_IV_R.$iv_rev));
			ivL.add(ivR);
			callRevDataIns01(ivL);
		}
		
		/**
		 * 長い線として出力する列を追加する
		 */
		protected void addLongLinePLRow(MCList<PckLstDtlR> plDtlL) {
			PckLstDtlR dtlR = PckLstDtlR.create();
			dtlR.free(getLongLine());
			plDtlL.add(dtlR);
		}
		
		/**
		 * パッキングリストソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBER_PckLst>> pckMapSort(Map<String, List<MSBER_PckLst>> map) {
			// パッキングリストReportSetマップソート（納品先順）
			List<Entry<String, List<MSBER_PckLst>>> entries = new ArrayList<Entry<String, List<MSBER_PckLst>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
			LinkedHashMap<String, List<MSBER_PckLst>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBER_PckLst>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}
			
			return result;
		}
		
		// Mapper
		protected Map_PLD1<PckLstDtlR,PckLstDtlR> createMap_PLD1() {
			return new Map_PLD1<PckLstDtlR, PckLstDtlR>();
		}

		public class Map_PLD1<D extends PckLstDtlR, S extends PckLstDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PckLstDtlR.$cntnr_no_fr, PckLstDtlR.$cntnr_no_fr);
				addColumnPathMap(PckLstDtlR.$cntnr_no_to, PckLstDtlR.$cntnr_no_to);
				addColumnPathMap(PckLstDtlR.$cntnr_no_fr_to, PckLstDtlR.$cntnr_no_fr_to);
				addColumnPathMap(PckLstDtlR.$itm_cd, PckLstDtlR.$itm_cd);
				addColumnPathMap(PckLstDtlR.$itm_sub1_view, PckLstDtlR.$itm_sub1_view);
				addColumnPathMap(PckLstDtlR.$itm_sub2_view, PckLstDtlR.$itm_sub2_view);
				addColumnPathMap(PckLstDtlR.$itm_sub3_view, PckLstDtlR.$itm_sub3_view);
				addColumnPathMap(PckLstDtlR.$itm_sub1_data, PckLstDtlR.$itm_sub1_data);
				addColumnPathMap(PckLstDtlR.$itm_sub2_data, PckLstDtlR.$itm_sub2_data);
				addColumnPathMap(PckLstDtlR.$itm_sub3_data, PckLstDtlR.$itm_sub3_data);
				addColumnPathMap(PckLstDtlR.$cntry_org_cd, PckLstDtlR.$cntry_org_cd);
				addColumnPathMap(PckLstDtlR.$cntry_org_nm, PckLstDtlR.$cntry_org_nm);
				addColumnPathMap(PckLstDtlR.$trd_unit_qty, PckLstDtlR.$trd_unit_qty);
				addColumnPathMap(PckLstDtlR.$s_trd_unit_qty, PckLstDtlR.$s_trd_unit_qty);
				addColumnPathMap(PckLstDtlR.$s_int_trd_unit_qty, PckLstDtlR.$s_int_trd_unit_qty);
				addColumnPathMap(PckLstDtlR.$s_dec_trd_unit_qty, PckLstDtlR.$s_dec_trd_unit_qty);
				addColumnPathMap(PckLstDtlR.$trd_unit_nm, PckLstDtlR.$trd_unit_nm);
				addColumnPathMap(PckLstDtlR.$trd_unit_cd, PckLstDtlR.$trd_unit_cd);
				addColumnPathMap(PckLstDtlR.$trd_unit_dec_place, PckLstDtlR.$trd_unit_dec_place);
				addColumnPathMap(PckLstDtlR.$wt_dec_place, PckLstDtlR.$wt_dec_place);
				addColumnPathMap(PckLstDtlR.$dim_dec_place, PckLstDtlR.$dim_dec_place);
				addColumnPathMap(PckLstDtlR.$net_wt, PckLstDtlR.$net_wt);
				addColumnPathMap(PckLstDtlR.$s_net_wt, PckLstDtlR.$s_net_wt);
				addColumnPathMap(PckLstDtlR.$s_int_net_wt, PckLstDtlR.$s_int_net_wt);
				addColumnPathMap(PckLstDtlR.$s_dec_net_wt, PckLstDtlR.$s_dec_net_wt);
				addColumnPathMap(PckLstDtlR.$grss_wt, PckLstDtlR.$grss_wt);
				addColumnPathMap(PckLstDtlR.$s_grss_wt, PckLstDtlR.$s_grss_wt);
				addColumnPathMap(PckLstDtlR.$s_int_grss_wt, PckLstDtlR.$s_int_grss_wt);
				addColumnPathMap(PckLstDtlR.$s_dec_grss_wt, PckLstDtlR.$s_dec_grss_wt);
				addColumnPathMap(PckLstDtlR.$dim, PckLstDtlR.$dim);
				addColumnPathMap(PckLstDtlR.$s_dim, PckLstDtlR.$s_dim);
				addColumnPathMap(PckLstDtlR.$s_int_dim, PckLstDtlR.$s_int_dim);
				addColumnPathMap(PckLstDtlR.$s_dec_dim, PckLstDtlR.$s_dec_dim);
				addColumnPathMap(PckLstDtlR.$disp_seq, PckLstDtlR.$disp_seq);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char1, PckLstDtlR.$pl_d_sub_char1);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char2, PckLstDtlR.$pl_d_sub_char2);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char3, PckLstDtlR.$pl_d_sub_char3);
				
				addColumnPathMap(PckLstDtlR.$container, PckLstDtlR.$container);
				addColumnPathMap(PckLstDtlR.$iv_itm_nm, PckLstDtlR.$iv_itm_nm);
				addColumnPathMap(PckLstDtlR.$iv_itm_alt_nm1, PckLstDtlR.$iv_itm_alt_nm1);
				addColumnPathMap(PckLstDtlR.$iv_itm_alt_nm2, PckLstDtlR.$iv_itm_alt_nm2);
				addColumnPathMap(PckLstDtlR.$iv_itm_alt_nm3, PckLstDtlR.$iv_itm_alt_nm3);
				addColumnPathMap(PckLstDtlR.$iv_itm_alt_nm4, PckLstDtlR.$iv_itm_alt_nm4);
				addColumnPathMap(PckLstDtlR.$cst_itm_cd, PckLstDtlR.$cst_itm_cd);
				addColumnPathMap(PckLstDtlR.$cst_itm_nm, PckLstDtlR.$cst_itm_nm);
				addColumnPathMap(PckLstDtlR.$disp_seq, PckLstDtlR.$disp_seq);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char1, PckLstDtlR.$pl_d_sub_char1);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char2, PckLstDtlR.$pl_d_sub_char2);
				addColumnPathMap(PckLstDtlR.$pl_d_sub_char3, PckLstDtlR.$pl_d_sub_char3);

			}
		}
	}
	/**
	 * ExRpt_Prnt03オペレーション.<p>
	 *
	 * インボイスを印刷する（単票印刷用）<br>
	 */
	public class ExRpt_Prnt03 extends MSBEL_ExRptService_MC_A.ExRpt_Prnt03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			MSBEL_ExRptService.ExRpt_Prnt01 prnt01 = MSBEL_ExRptService.crtExRpt_Prnt01();
			prnt01.up0().add(up0());
			prnt01.up1().indiv_prnt_flg(true);
			prnt01.exec();
			copyErrFlg(down0(), prnt01.down0().get(0));
		}
	}
	/**
	 * ExRpt_Prnt04オペレーション.<p>
	 *
	 * パッキングリストを印刷する（単票印刷用）<br>
	 */
	public class ExRpt_Prnt04 extends MSBEL_ExRptService_MC_A.ExRpt_Prnt04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			MSBEL_ExRptService.ExRpt_Prnt02 prnt02 = MSBEL_ExRptService.crtExRpt_Prnt02();
			prnt02.up0().add(up0());
			prnt02.exec();
			copyErrFlg(down0(), prnt02.down0().get(0));
		}

	}

	/**
	 * 長い線として出力する文字列を返す
	 * 
	 * @return 長い線として出力する文字列
	 */
	protected String getLongLine() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 126; i++) {
			sb.append(_LINE);
		}
		return sb.toString();
	}
	/**
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録（サービス呼び出し）。
	 * @param ivL インボイスヘッダリスト
	 */
	protected void callRevDataIns01(MCList<MST_IV_R> ivL) {
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		
		for (MST_IV_R ivR : ivL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(ivR.iv_mng_no());
			opeR.rev_no(ivR.iv_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_IV.value());
			ope.up0().add(opeR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}

	/**
	 * 個別発行取得の呼び出し
	 */
	protected void getIndivPrnt(MCList<?> up0) {
		// インボイスＮＯから納品先を検索→納品先を個別発行処理に連携→フラグ取得
		// インボイスヘッダの取得
		MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_IV_NO_R.create("T"));
		dbWkDelete("MSBEL5720_MSW_IV_NO_D01", insWkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5720_MSW_IV_NO_I01", up0, insWkL_bldr.getBaseDbc());
		
		MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
		MST_IV_R t1 = MST_IV_R.create("T1");
		MST_IV_P_R t2 = MST_IV_P_R.create("T2");
		MSW_IV_NO_KEY_R w1 = MSW_IV_NO_KEY_R.create("W1");
		
		MCMainQuery query = sql("MSBEL5720_MST_IV_S03").mainQuery()
				.select(t1.dlv_id_cd)
				.from(
					t1
					.innerJoin(w1).on(
						t1.iv_no.eq(w1.iv_no)
					)
				)
				.unionAll(
					subQuery()
					.select(t2.dlv_id_cd)
					.from(
						t2
						.innerJoin(w1).on(
							t2.iv_no.eq(w1.iv_no)
						)
					)
				);
		
		executeQuery(ivL, createQueryPlan().setQuery(query));
		
		MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
		ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.DLV.value());
		for (MST_IV_R ivR : ivL.groupBy(MST_IV_R.$dlv_id_cd)) {
			BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
			dtlR.bp_cd(ivR.dlv_id_cd());
			ope.up1().add(dtlR);
		}
		ope.exec();
		
		_bpUtil = ope.down0();
		_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
	}
	
	/**
	 * 帳票ファイル情報取得用のリスナー
	 */
	public class FileWriteListener extends MCFileWriteListener {
		List<MCReportSet> list;
		
		FileWriteListener(List<MCReportSet> list) {
			this.list = list;
		}
		
		@Override
		public void initWrite(MCReportFile rf) {
			if (rf instanceof MCUCXSingleFile) {
				list.add(rf.getReportSet());
			}
			super.initWrite(rf);
		}
	}

	//FMCB CUSTOM END
}