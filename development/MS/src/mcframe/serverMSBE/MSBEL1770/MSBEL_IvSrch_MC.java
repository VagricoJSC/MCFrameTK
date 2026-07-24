package mcframe.serverMSBE.MSBEL1770;

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
import static mcframe.serverMSBE.MSBEL1770.Query.*;
import mcframe.serverMSBE.MSBEL5720.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IvSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IvSrch_MC extends MSBEL_IvSrch_MC_A{
	//FMCB CUSTOM START
	protected static final String _srchMode_HDR = "0";
	protected static final String _srchMode_DTL = "1";
	protected static final String _srchMode_SHIP_INST = "2";
	protected static final String _srchMode_SHIP_ACT = "3";
	protected static final String _srchMode_SLS_ACT = "4";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * インボイス情報、インボイス出荷実績明細を検索する<br>
	 */
	public class Srch01 extends MSBEL_IvSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			
			if (isSrchShipInstData(up0())) {
				// Ｉ／Ｖ出荷指図データの検索する
				MCQueryPlan sql = MSBEL1770_MST_IV_D_S02();
				sql.addDynamicSQLInfo(MSBEL1770_MST_IV_D_S02_JOIN01());
				
				// インボイスＮＯでソート・フェッチをする。
				// ただし、インボイス未登録（インボイスＮＯが「*」のケースがあるので、インボイス管理ＮＯも条件に加える。
				searchForDL(sql, up0(), down0(), Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no);
			}
			else if (isSrchShipActData(up0())) {
				// Ｉ／Ｖ出荷実績データの検索する
				// 配送先経由区分：経由するの検索処理
				MCQueryPlan sql1 = MSBEL1770_MST_IV_D_S02();
				sql1.addDynamicSQLInfo(MSBEL1770_MST_IV_D_S02_JOIN02());
				
				// 配送先経由区分：経由しないの検索処理
				MCQueryPlan sql2 = MSBEL1770_MST_IV_D_S02();
				sql2.addDynamicSQLInfo(MSBEL1770_MST_IV_D_S02_JOIN03());
				
				// インボイスＮＯでソート・フェッチをする。
				// ただし、インボイス未登録（インボイスＮＯが「*」のケースがあるので、インボイス管理ＮＯも条件に加える。
				searchForDL(sql1, up0(), down0(), Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no);
				searchForDL(sql2, up0(), down0(), Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no);
			}
			else if (isSrchSlsActData(up0())) {
				// Ｉ／Ｖ売上実績データの検索する
				MCQueryPlan sql = MSBEL1770_MST_IV_D_S02();
				sql.addDynamicSQLInfo(MSBEL1770_MST_IV_D_S02_JOIN04());
				
				// インボイスＮＯでソート・フェッチをする。
				// ただし、インボイス未登録（インボイスＮＯが「*」のケースがあるので、インボイス管理ＮＯも条件に加える。
				searchForDL(sql, up0(), down0(), Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no);
			}
			else {
				// 予定データを検索する
				MCQueryPlan sql = MSBEL1770_MST_IV_D_S01();
				
				// インボイスＮＯでソート・フェッチをする。
				// ただし、インボイス未登録（インボイスＮＯが「*」のケースがあるので、インボイス管理ＮＯも条件に加える。
				searchForDL(sql, up0(), down0(), Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no);
			}
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			
			// 追加情報を取得する
			setAddInfo(down0());
			
			down0().setAll(chkDac(down0()));

			// 合計項目の算出
			calcTtl(down0());
			// ヘッダ単位での検索の場合のデータ整形
			makeHdr(down0());
		}
		@Override
		protected void doEditDown() {
			super.doEditDown();
			String[] sortCols = null;
			if (isSrchHdrData(up0())) {
				sortCols = new String[]{Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no, Srch01_RsltR.$iv_rev};
			}
			else if (isSrchDtlData(up0())) {
				sortCols = new String[]{Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_mng_no, Srch01_RsltR.$iv_d_no};
			}
			else if (isSrchShipInstData(up0())) {
				sortCols = new String[]{Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_d_no, Srch01_RsltR.$ship_inst_d_no};
			}
			else if (isSrchShipActData(up0())) {
				sortCols = new String[]{Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_d_no, Srch01_RsltR.$ship_act_d_no};
			}
			else if (isSrchSlsActData(up0())) {
				sortCols = new String[]{Srch01_RsltR.$iv_no, Srch01_RsltR.$iv_d_no, Srch01_RsltR.$sls_act_d_no};
			}
			else {
				return;
			}
			down0().sort(sortCols);
		}
		/**
		 * 追加情報を設定する。
		 * @param downList 検索結果
		 */
		protected void setAddInfo(MCList<Srch01_RsltR> downList) {
			
			if(downList.isEmpty()){
				return;
			}
			
			MCList<Srch01_RsltR> addInfoL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			
			// ワークテーブルを登録する
			insIvNoWk(downList);
			
			// 追加情報を取得する
			executeQuery(addInfoL, MSBEL1770_MST_IV_D_S03());
			
			// インデックスキーを作成する
			MCIndexKey idx = addInfoL.createIndex(Srch01_RsltR.$iv_d_no);
			
			for (MCList<Srch01_RsltR> downGrpList : downList.groupList(Srch01_RsltR.$iv_mng_no)) {
				MCList<Srch01_RsltR> downGrpL = MCList.create(Srch01_RsltR.class);
				boolean ivCompFlg = true;
				
				for (Srch01_RsltR r : downGrpList) {
					Srch01_RsltR addInfoR = addInfoL.getFirst(idx, r.iv_d_no());
					
					// 進捗状況区分の設定
					r.pr_sts_typ(getPrStsTyp(addInfoR, r));
					
					// 指図数量、出荷数量、売上数量の設定
					if (isSrchDtlData(up0())) {
						if (isNull(addInfoR)) {
							r.ship_inst_qty(MCNumber.ZERO);
							r.ship_act_qty(MCNumber.ZERO);
							r.sls_qty(MCNumber.ZERO);
						}
						else {
							r.ship_inst_qty(addInfoR.ship_inst_qty());
							r.ship_act_qty(addInfoR.ship_act_qty());
							r.sls_qty(addInfoR.sls_qty());
						}
					}
					
					// ヘッダのＩ／Ｖ取引の設定
					if(isSrchHdrData(up0())){
						if (!MSC_IV_PR_STS_TYP.isCOMP(r.pr_sts_typ())) {
							ivCompFlg = false;
						}
					}
					// 明細、Ｉ／Ｖ出荷指図、Ｉ／Ｖ出荷実績、Ｉ／Ｖ売上実績の進捗状況区分のチェック
					else if (MSC_IV_PR_STS_TYP.isNOT_IV(r.pr_sts_typ()) && !up0().not_iv_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isNOT_INST(r.pr_sts_typ()) && !up0().not_inst_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isPART_INST(r.pr_sts_typ()) && !up0().part_inst_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isINST(r.pr_sts_typ()) && !up0().inst_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isNOT_SHIP(r.pr_sts_typ()) && !up0().not_ship_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isPART_SHIP(r.pr_sts_typ()) && !up0().part_ship_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isSHIP(r.pr_sts_typ()) && !up0().ship_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isNOT_SLS(r.pr_sts_typ()) && !up0().not_sls_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isSLS(r.pr_sts_typ()) && !up0().sls_flg()) {
						continue;
					}
					else if (MSC_IV_PR_STS_TYP.isCOMP(r.pr_sts_typ()) && !up0().comp_flg()) {
						continue;
					}
					downGrpL.add(r);
				}
				
				// ヘッダのＩ／Ｖ取引のチェック
				if (isSrchHdrData(up0()) && ivCompFlg && !up0().iv_comp_flg()) {
					continue;
				}
				else if (isSrchHdrData(up0()) && !ivCompFlg && !up0().iv_not_comp_flg()) {
					continue;
				}
				
				downGrpL.setBoolean(Srch01_RsltR.$iv_comp_flg, ivCompFlg);
				downL.addAll(downGrpL);
			}
			
			downList.setAll(downL);
		}
		/**
		 * インボイスＮＯワークテーブルを登録する。
		 * @param downList 検索結果
		 */
		protected void insIvNoWk(MCList<Srch01_RsltR> downList) {
			MCQueryApiBuilder ivNoWkL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			dbWkDelete("MSBEL1770_MSW_IV_D_D01", ivNoWkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1770_MSW_IV_D_I01", downList, ivNoWkL_bldr.getBaseDbc());
		}
		/**
		 * 進捗状況区分を取得する。
		 */
		protected String getPrStsTyp(Srch01_RsltR addInfoR, Srch01_RsltR r) {
			
			// 三国間の場合で、インボイスが未登録
			if (MAC_STR.isNULL_VAL(r.iv_no())) {
				return MSC_IV_PR_STS_TYP.NOT_IV.value();
			}
			
			if (isNull(addInfoR)) {
				return null;
			}
			
			// インボイス明細数量、指図数量、出荷数量、売上数量
			MCNumber ivQty = addInfoR.base_unit_qty();
			MCNumber shipInstQty = addInfoR.ship_inst_qty();
			MCNumber shipActQty = addInfoR.ship_act_qty();
			MCNumber slsQty = addInfoR.sls_qty();
			
			// 売上数量＝インボイス明細数量または貸出出荷かつ、
			// 出荷数量＝インボイス明細数量または手配区分が仕入直送または貸出売上の場合
			if ((slsQty.eq(ivQty) || isVmi(addInfoR)) && (shipActQty.eq(ivQty) || isProcDdlv(addInfoR)) || isSlsCnsgn(addInfoR)) {
				return MSC_IV_PR_STS_TYP.COMP.value();
			}
			// 預り売上がオンかつ売上数量＝インボイス明細数量かつ、
			// 出荷指図対象外かつ出荷数量＝０または出荷指図対象かつ指図数量＝０の場合
			else if (isSlsCststk(addInfoR) && slsQty.eq(ivQty)
					&& ((!isShipInst(addInfoR) && shipActQty.isZero()) || (isShipInst(addInfoR) && shipInstQty.isZero()))) {
				return MSC_IV_PR_STS_TYP.SLS.value();
			}
			// 預り売上がオンかつ売上数量≠インボイス明細数量かつ、
			// 出荷指図対象外かつ出荷数量＝０または出荷指図対象かつ指図数量＝０の場合
			else if (isSlsCststk(addInfoR) && slsQty.neq(ivQty)
					&& ((!isShipInst(addInfoR) && shipActQty.isZero()) || (isShipInst(addInfoR) && shipInstQty.isZero()))) {
				return MSC_IV_PR_STS_TYP.NOT_SLS.value();
			}
			// 出荷数量＝インボイス明細数量かつ売上数量≠インボイス明細数量の場合
			else if (shipActQty.eq(ivQty) && slsQty.neq(ivQty)) {
				return MSC_IV_PR_STS_TYP.SHIP.value();
			}
			// 出荷数量＞０かつ出荷数量＜インボイス明細数量の場合
			else if (shipActQty.gt(0) && shipActQty.lt(ivQty)) {
				return MSC_IV_PR_STS_TYP.PART_SHIP.value();
			}
			// 出荷指図対象外かつ出荷数量＝０かつ売上数量≠インボイス明細数量の場合
			else if (!isShipInst(addInfoR) && shipActQty.isZero() && slsQty.neq(ivQty)) {
				return MSC_IV_PR_STS_TYP.NOT_SHIP.value();
			}
			// 出荷指図対象かつ指図数量＝インボイス明細数量の場合
			else if (isShipInst(addInfoR) && shipInstQty.eq(ivQty)) {
				return MSC_IV_PR_STS_TYP.INST.value();
			}
			// 出荷指図対象かつ指図数量＞０かつ指図数量＜インボイス明細数量の場合
			else if (isShipInst(addInfoR) && shipInstQty.gt(0) && shipInstQty.lt(ivQty)) {
				return MSC_IV_PR_STS_TYP.PART_INST.value();
			}
			// 出荷指図対象かつ指図数量＝０かつ売上数量≠インボイス明細数量
			else if (isShipInst(addInfoR) && shipInstQty.isZero() && slsQty.neq(ivQty)) {
				return MSC_IV_PR_STS_TYP.NOT_INST.value();
			}
			else {
				return null;
			}
		}
		
		/**
		 * 仕入直送の場合、trueを返す。
		 */
		protected boolean isProcDdlv(Srch01_RsltR addInfoR) {
			return MAC_SLO_PROC_TYP.isPURC_DDLV(addInfoR.getStringNE(MST_SLO_D_R.$proc_typ));
		}
		
		/**
		 * 預り売上の場合、trueを返す。
		 */
		protected boolean isSlsCststk(Srch01_RsltR addInfoR) {
			return addInfoR.sls_cststk_flg();
		}
		
		/**
		 * 貸出出荷の場合、trueを返す。
		 */
		protected boolean isVmi(Srch01_RsltR addInfoR) {
			return MCBooleanUtil.dbStringToBoolean(addInfoR.getStringNE(MST_SLO_D_R.$vmi_flg));
		}
		
		/**
		 * 貸出売上の場合、trueを返す。
		 */
		protected boolean isSlsCnsgn(Srch01_RsltR addInfoR) {
			return MAC_TRD_PTN_TYP.isSLS_CNSGN(addInfoR.trd_ptn_typ());
		}
		
		/**
		 * 指図対象の場合、trueを返す。
		 */
		protected boolean isShipInst(Srch01_RsltR addInfoR) {
			return MAC_SHIP_INST_TYP.isPICK(addInfoR.getStringNE(MST_SLO_D_R.$ship_inst_typ))
					|| MAC_SHIP_INST_TYP.isNO_PICK(addInfoR.getStringNE(MST_SLO_D_R.$ship_inst_typ));
		}
		/**
		 * ヘッダ単位での検索の場合,インボイスヘッダ単位でのデータ形式に整形する。
		 * @param downList
		 */
		protected void makeHdr(MCList<Srch01_RsltR> downList){
			// ヘッダ検索以外は何もしない
			if(!isSrchHdrData(up0())){
				return ;
			}
			
			// 検索結果としては、インボイスＮＯ単位(ヘッダ単位)で1レコードとなるように編集をする。
			// 理由）合計項目(Ｉ／Ｖ計や、無償計など)の計算の為に、インボイス明細単位での情報が必要なため。
			MCList<Srch01_RsltR> hdrList = MCList.create(Srch01_RsltR.class);
			for(MCList<Srch01_RsltR> ivList: down0().groupList(Srch01_RsltR.$iv_mng_no, Srch01_RsltR.$iv_rev)){
				Srch01_RsltR hdrR = ivList.get(0);
				hdrList.add(trimDtlData(hdrR));
			}
			down0().setAll(hdrList);
		}
		
		protected MCList<Srch01_RsltR> chkDac(MCList<Srch01_RsltR> chkL){
			MCList<Srch01_RsltR> rsltL = chkL.createInstance();

			for(MCList<Srch01_RsltR> subL : chkL.groupList(Srch01_RsltR.$iv_mng_no, Srch01_RsltR.$iv_rev)){
				// 売上・貸出出荷・貸出売上の場合
				if(MAC_TRD_PTN_TYP.isSLS(subL.get(0).trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSLS_CNSGN(subL.get(0).trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(subL.get(0).trd_ptn_typ())){
					boolean dacOK = true;
					for(Srch01_RsltR r : subL){
						if(!readableWgCdDac(r.sls_dpt_wg_cd())){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
				// 支給・移送の場合
				else if(MAC_TRD_PTN_TYP.isPROV(subL.get(0).trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR(subL.get(0).trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(subL.get(0).trd_ptn_typ())){
					boolean dacOK = true;
					for(Srch01_RsltR r : subL){
						if(!readableLocCdDac(r.getStringNE("chk_gi_loc_cd"))){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
			}
			
			return rsltL;
		}
		
		/**
		 * ヘッダデータの参照かを判定する。
		 * @param up 検索条件
		 * @return true/false
		 */
		protected boolean isSrchHdrData(Srch01_CndR up) {
			if (isSame(up.srch_mode(), _srchMode_HDR)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 明細データの参照かどうかを判定する。
		 * @param up 検索条件
		 * @return true/false
		 */
		protected boolean isSrchDtlData(Srch01_CndR up) {
			if (isSame(up.srch_mode(), _srchMode_DTL)) {
				return true;
			}
			return false;
		}
		/**
		 * Ｉ／Ｖ出荷指図データの参照かどうかを判定する。
		 * @param up 検索条件
		 * @return true/false
		 */
		protected boolean isSrchShipInstData(Srch01_CndR up) {
			if (isSame(up.srch_mode(), _srchMode_SHIP_INST)) {
				return true;
			}
			return false;
		}
		/**
		 * Ｉ／Ｖ出荷実績データの参照かどうかを判定する。
		 * @param up 検索条件
		 * @return true/false
		 */
		protected boolean isSrchShipActData(Srch01_CndR up) {
			if (isSame(up.srch_mode(), _srchMode_SHIP_ACT)) {
				return true;
			}
			return false;
		}
		/**
		 * Ｉ／Ｖ売上実績データの参照かどうかを判定する。
		 * @param up 検索条件
		 * @return true/false
		 */
		protected boolean isSrchSlsActData(Srch01_CndR up) {
			if (isSame(up.srch_mode(), _srchMode_SLS_ACT)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 輸出状況
			if (!(up0().ex_im_not_comp_flg() && up0().ex_im_comp_flg())) {
				if (up0().ex_im_comp_flg()) {
					up0().addStringColumn("cmpl_flg_str", "1");
				}
				else {
					up0().addStringColumn("cmpl_flg_str", "0");
				}
			}
			// 仕入状況
			if (!(up0().purc_im_not_comp_flg() && up0().purc_im_comp_flg())) {
				if (up0().purc_im_comp_flg()) {
					up0().addStringColumn("purc_cmpl_flg_str", "1");
				}
				else {
					up0().addStringColumn("purc_cmpl_flg_str", "0");
				}
			}
			// Ｉ／Ｖ登録
			if (!(up0().iv_not_reg_flg() && up0().iv_reg_flg())) {
				// 「Ｉ／Ｖ登録」とは逆のFLG値となる
				if (up0().iv_reg_flg()) {
					up0().addStringColumn("pre_rcpt_iv_flg_str", "0");
				}
				else {
					up0().addStringColumn("pre_rcpt_iv_flg_str", "1");
				}
			}
			// Ｐ／Ｌ登録
			// 全部オンならバインドなし
			if (!(up0().pl_not_reg_flg() && up0().pl_reg_flg() && up0().pl_skip_flg())) {
				if (up0().pl_not_reg_flg()) {
					if (!up0().pl_reg_flg() && !up0().pl_skip_flg()) {
						// 未登録だけオン
						up0().addStringColumn("pl_ptn1", "1");
					}
					else if (up0().pl_reg_flg() && !up0().pl_skip_flg()) {
						// 未登録と登録済がオン
						up0().addStringColumn("pl_ptn2", "1");
					}
					else {
						// 未登録と省略がオン
						up0().addStringColumn("pl_ptn3", "1");
					}
				}
				else {
					if (up0().pl_reg_flg() && !up0().pl_skip_flg()) {
						// 登録済だけオン
						up0().addStringColumn("pl_ptn4", "1");
					}
					else if (up0().pl_reg_flg() && up0().pl_skip_flg()) {
						// 登録済と省略がオン
						up0().addStringColumn("pl_ptn5", "1");
					}
					else {
						// 省略のみがオン
						up0().addStringColumn("pl_ptn6", "1");
					}
				}
			}
			// Ｉ／Ｖ発行
			if (!(up0().iv_prnt_yet_flg() && up0().iv_prnt_done_flg())) {
				if (up0().iv_prnt_yet_flg()) {
					up0().addStringColumn("iv_prnt_flg_str", "0");
				}
				else {
					up0().addStringColumn("iv_prnt_flg_str", "1");
				}
			}
			// Ｐ／Ｌ発行
			if (!(up0().pl_prnt_yet_flg() && up0().pl_prnt_done_flg())) {
				if (up0().pl_prnt_yet_flg()) {
					up0().addStringColumn("pl_prnt_flg_str", "0");
				}
				else {
					up0().addStringColumn("pl_prnt_flg_str", "1");
				}
			}
			// 預り売上
			if (!(up0().sls_cststk_flg() && up0().sls_cststk_invalid_flg())) {
				if (up0().sls_cststk_flg()) {
					up0().addStringColumn("sls_cststk_flg_str", "1");
				}
				else {
					up0().addStringColumn("sls_cststk_flg_str", "0");
				}
			}
			// 取消含む
			if (!up0().inc_can_flg()) {
				up0().addStringColumn("inc_can_flg_str", "0");
			}
			// 過去改訂含む
			if (!up0().inc_past_flg()) {
				up0().addStringColumn("inc_past_flg_str", "0");
			}
			
			up.addDateColumn("TODAY", getToday());
		}
		/**
		 * インボイス単位で各合計値を算出・設定する。
		 * @param list 設定対象のリスト
		 */
		protected  void calcTtl(MCList<Srch01_RsltR> list) {
			
			if(!isSrchHdrData(up0())){
				return ;
			}
			
			for(MCList<Srch01_RsltR> ivGrp : list.groupList(Srch01_RsltR.$iv_mng_no, Srch01_RsltR.$iv_rev)){
				setIvAmt(ivGrp.get(0), ivGrp); // ヘッダ単位の検索では1行目を抽出するので、1行目のみ値を設定する。
			}
		}

		/**
		 * ヘッダ情報の整形の為に明細情報を削除する。
		 * @param hdrR 整形対象のRow
		 * @return 整形後のRow
		 */
		protected Srch01_RsltR trimDtlData(Srch01_RsltR hdrR){
			
			hdrR.clear(getTrimDtlCols());
			return hdrR;
		}
		
		/** 画面遷移時に値の引継ぎを行うカラム名配列を返します */
		protected String[] getTrimDtlCols() {
			Srch01_RsltR row = Srch01_RsltR.create();
			String []  strL = row.getKeys(Srch01_RsltR.$$TRIM_Dtl_COL).toArray(new String[]{});
			return strL;
		}
		
		/**
		 * 金額の設定
		 * 
		 * @param rsltR
		 * @param subL
		 */
		protected void setIvAmt(Srch01_RsltR rsltR, MCList<Srch01_RsltR> subL) {

			//取引金額計
			MCNumber ttlTrdCurAmt = getTtlAmt(subL, Srch01_RsltR.$trd_cur_amt);

			//取引税込金額計
			rsltR.ttl_trd_cur_inc_tax_amt(getTtlAmt(subL, Srch01_RsltR.$trd_cur_inc_tax_amt));

			rsltR.ttl_iv_amt(getTtlAmt(subL, Srch01_RsltR.$iv_amt)); 					//Ｉ／Ｖ計
			rsltR.ttl_ncv_amt(rsltR.ttl_iv_amt().subtract(ttlTrdCurAmt));				//無償計（＝Ｉ／Ｖ計－取引金額計）

			// 取引金額を輸出入諸掛区分ごとに集計
			MCList<Srch01_RsltR> baseL = subL.subList(Srch01_RsltR.$exim_xpns_typ, null);
			rsltR.ttl_base_amt(getTtlAmt(baseL, Srch01_RsltR.$trd_cur_amt));			//本体（＝「輸出入諸掛区分」が未設定の取引金額の合算値）
			
			MCList<Srch01_RsltR> freightL = subL.subList(Srch01_RsltR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.FREIGHT.value());
			rsltR.ttl_freight_amt(getTtlAmt(freightL, Srch01_RsltR.$trd_cur_amt));		//運賃
			
			MCList<Srch01_RsltR> insuranceL = subL.subList(Srch01_RsltR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.INSURANCE.value());
			rsltR.ttl_insurance_amt(getTtlAmt(insuranceL, Srch01_RsltR.$trd_cur_amt));	//保険料
			
			rsltR.ttl_oth_amt(ttlTrdCurAmt
					.subtract(rsltR.ttl_base_amt())
					.subtract(rsltR.ttl_freight_amt())
					.subtract(rsltR.ttl_insurance_amt()));								//その他経費（＝取引金額計－本体－運賃－保険料）
		}

		/**
		 * 合計金額を取得する
		 * 
		 * @param subL：インボイスごとのリスト
		 * @param col：集計するカラム名
		 * @return
		 */
		protected MCNumber getTtlAmt(MCList<Srch01_RsltR> subL, String col) {
			
			MCNumber ttlAmt = MCNumber.ZERO;
			for (Srch01_RsltR subR : subL) {
				MCNumber amt = subR.getNumberNE(col);
				if (isNull(amt)) {
					continue;
				}
				if (subR.dscnt_itm_flg()) {
					ttlAmt = ttlAmt.subtract(amt);
				}
				else {
					ttlAmt = ttlAmt.add(amt);
				}
			}
			return ttlAmt;
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * インボイスを発行する<br>
	 */
	public class Prnt01 extends MSBEL_IvSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBEL_ExRptService.ExRpt_Prnt01 ope = MSBEL_ExRptService.crtExRpt_Prnt01();
			setAll(ope.up0(), up0(), createMap_ExRpt_Prnt01_CndR_Prnt01_CndR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(ExRpt_Prnt01_CndR.$iv_no);
			for (Prnt01_CndR up : up0()) {
				ExRpt_Prnt01_CndR down = ope.down0().getFirst(ik, up.iv_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
		}
		
		protected Map_ExRpt_Prnt01_CndR_Prnt01_CndR<ExRpt_Prnt01_CndR,Prnt01_CndR> createMap_ExRpt_Prnt01_CndR_Prnt01_CndR() {
			return new Map_ExRpt_Prnt01_CndR_Prnt01_CndR<ExRpt_Prnt01_CndR, Prnt01_CndR>();
		}

		public class Map_ExRpt_Prnt01_CndR_Prnt01_CndR<D extends ExRpt_Prnt01_CndR, S extends Prnt01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ExRpt_Prnt01_CndR.$iv_no, Prnt01_CndR.$iv_no);
				addColumnPathMap(ExRpt_Prnt01_CndR.$iv_mng_no, Prnt01_CndR.$iv_mng_no);
				addColumnPathMap(ExRpt_Prnt01_CndR.$iv_rev, Prnt01_CndR.$iv_rev);
			}
		}
	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * パッキングリストを発行する<br>
	 */
	public class Prnt02 extends MSBEL_IvSrch_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBEL_ExRptService.ExRpt_Prnt02 ope = MSBEL_ExRptService.crtExRpt_Prnt02();
			setAll(ope.up0(), up0().groupBy(Prnt02_CndR.$iv_no), createMap_ExRpt_Prnt02_CndR_Prnt02_CndR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(ExRpt_Prnt02_CndR.$iv_no);
			for (Prnt02_CndR up : up0()) {
				ExRpt_Prnt02_CndR down = ope.down0().getFirst(ik, up.iv_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
		}
		
		protected Map_ExRpt_Prnt02_CndR_Prnt02_CndR<ExRpt_Prnt02_CndR,Prnt02_CndR> createMap_ExRpt_Prnt02_CndR_Prnt02_CndR() {
			return new Map_ExRpt_Prnt02_CndR_Prnt02_CndR<ExRpt_Prnt02_CndR, Prnt02_CndR>();
		}

		public class Map_ExRpt_Prnt02_CndR_Prnt02_CndR<D extends ExRpt_Prnt02_CndR, S extends Prnt02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ExRpt_Prnt02_CndR.$iv_no, Prnt02_CndR.$iv_no);
			}
		}
	}

	//FMCB CUSTOM END
}