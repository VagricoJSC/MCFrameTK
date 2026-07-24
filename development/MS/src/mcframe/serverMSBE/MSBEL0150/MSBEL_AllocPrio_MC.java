package mcframe.serverMSBE.MSBEL0150;

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
import mcframe.serverMSBE.MSBEL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSBE.MSBEL0150.Query.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocPrio"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocPrio_MC extends MSBEL_AllocPrio_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未引当の出荷予定を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AllocPrio_MC_A.Srch01 {
		/**
		 * 引当範囲内
		 */
		protected MCList<Srch01_AllocDtlR> _allocL = null;

		/**
		 * 引当範囲外
		 */
		protected MCList<Srch01_AllocDtlR> _allocExL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			//上り電文編集
			editUp();
			
			MCList<Srch01_AllocDtlR> shipSchdL = getShipSchd();
			if (shipSchdL.isEmpty()) {
				return;
			}
			
			//上り電文編集
			editCnd(shipSchdL);
			
			//出荷予定(null文字を含む)
			MCList<Srch01_AllocDtlR> shipSchdValL = getShipSchdNullVal();
			makeShipSchd(shipSchdValL);
			alloc();
		}
		
		/**
		 *上り電文編集
		 * 
		 */
		protected void editUp() {
			String DefDgCd = getSysParm("DEF_STK_GD_CD");
			if (!isNullOrNullVal(DefDgCd)) {
				up0().gd_cd(DefDgCd) ;
			}
			String DefLgGrpCd = getSysParm("DEF_LG_GRP_CD");
			if (!isNullOrNullVal(DefLgGrpCd)) {
				up0().lg_grp_cd(DefLgGrpCd);
			}
		}
		
		protected void editCnd(MCList<Srch01_AllocDtlR> shipSchdL) {
			up0().addStringColumn("sno1_null_flg", "0");
			up0().addStringColumn("sno2_null_flg", "0");
			up0().addStringColumn("sno3_null_flg", "0");
			up0().addStringColumn("sno4_null_flg", "0");
			
			if (isGetNullVal(shipSchdL)) {
				if (isSnoNull(shipSchdL, "sno1_null_flg")) {
					up0().setStringNE("sno1_null_flg", "1");
				}
				if (isSnoNull(shipSchdL, "sno2_null_flg")) {
					up0().setStringNE("sno2_null_flg", "1");
				}
				if (isSnoNull(shipSchdL, "sno3_null_flg")) {
					up0().setStringNE("sno3_null_flg", "1");
				}
				if (isSnoNull(shipSchdL, "sno4_null_flg")) {
					up0().setStringNE("sno4_null_flg", "1");
				}
			}
		}
		
		/**
		 * 入庫割当を行う。
		 */
		protected void alloc() {
			setshipFrLgGrpCd();
			callThisSprt01();
		}
		
		/**
		 * 出荷元物流グループＣＤを設定する。
		 */
		protected void setshipFrLgGrpCd() {
			
			MCList<MAM_LOC_R> locL = getLocL();
			
			MAM_LOC_R locR = null;
			MCIndexKey idxkey = locL.createIndex(MAM_LOC_R.$loc_cd);
			for (Srch01_AllocDtlR shipSchdR : _allocL) {
				
				shipSchdR.alloc_ship_lg_grp_cd(shipSchdR.ship_fr_lg_grp_cd());
				
				if (isNull(shipSchdR.ship_fr_lg_grp_cd())) {
					
					locR = locL.getFirst(idxkey, nvl(shipSchdR.loc_cd(), shipSchdR.def_loc_cd()));
					
					if (!isNull(locR)) {
						shipSchdR.ship_fr_lg_grp_cd(locR.lg_grp_cd());
					}
				}
			}
		}
		
		/**
		 * 場所マスタの情報を取得する。
		 * @return 場所マスタリスト
		 */
		protected MCList<MAM_LOC_R> getLocL() {
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);

			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R bindR = null;

			for (Srch01_AllocDtlR shipSchdR : _allocL) {

				if (isNull(shipSchdR.ship_fr_lg_grp_cd())) {
					bindR = MAM_LOC_R.create();
					bindR.loc_cd(nvl(shipSchdR.loc_cd(), shipSchdR.def_loc_cd()));
					bindL.add(bindR);
				}
			}

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.lg_grp_cd);
			dbSelectKey("MSBEL0150_MAM_LOC_S01", locL, locL_bldr, bindL.groupBy(MAM_LOC_R.$loc_cd));

			return locL;
		}
		
		protected void callThisSprt01() {
			MSBEL_AllocPrio.Sprt01 sprt01Ope = MSBEL_AllocPrio.crtSprt01();
			sprt01Ope.up0().setAll(_allocL);
			sprt01Ope.exec();
			_allocL.setAll(sprt01Ope.down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			setDown();
		}
		
		@Override
		protected void initSearch() {
			super.initSearch();
			
			_allocL = MCList.create(Srch01_AllocDtlR.class);
			_allocExL = MCList.create(Srch01_AllocDtlR.class);
		}
		
		/**
		 * 出荷予定を取得する。
		 */
		protected MCList<Srch01_AllocDtlR> getShipSchd() {
			
			MCList<Srch01_AllocDtlR> shipSchdL = MCList.create(Srch01_AllocDtlR.class);
			executeQuery(shipSchdL, MSBEL0150_MST_SHIP_SCHD_S01(), up0());
			
			return shipSchdL;
		}
		
		/**
		 * 出荷予定を取得する。（null文字を含む）
		 */
		protected MCList<Srch01_AllocDtlR> getShipSchdNullVal() {
			
			MCList<Srch01_AllocDtlR> shipSchdValL = MCList.create(Srch01_AllocDtlR.class);
			executeQuery(shipSchdValL, MSBEL0150_MST_SHIP_SCHD_S02(), up0());
			
			return shipSchdValL;
		}
		
		
		/**
		 * 引当範囲内外を分ける。
		 */
		protected void makeShipSchd(MCList<Srch01_AllocDtlR> shipSchdValL) {
			
			//引当可能日数超過フラグを取得
			MSBEL_AllocMngService.Alloc_Avl_Sprt01 allocAvlSprt01 = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();
			setPegNo(Srch01_AllocDtlR.$peg_no, shipSchdValL);
			doAllocAvlSprt(allocAvlSprt01, shipSchdValL);
			shipSchdValL.addBooleanColumn("exceed_alloc_days_flg");
			
			MCIndexKey allocAvlSprtKey = allocAvlSprt01.down0().createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
			for (Srch01_AllocDtlR r : shipSchdValL) {
				Alloc_Avl_Sprt01_CndR cndR = allocAvlSprt01.down0().getFirst(allocAvlSprtKey, r.peg_no());
				if (!isNull(cndR)){
					r.setBooleanNE("exceed_alloc_days_flg", cndR.exceed_alloc_days_flg());
				}
			}
			
			_allocL.addAll(shipSchdValL.subList(r -> isAllocWait(r)));
			shipSchdValL.removeAll(_allocL);
			_allocExL.addAll(shipSchdValL);
			_allocL.sort(SortType.ASC, Srch01_AllocDtlR.$pre_alloc_prio,Srch01_AllocDtlR.$ship_schd_no);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(_allocL);
			down1().addAll(_allocExL);
			down1().sort(SortType.ASC, Srch01_AllocDtlR.$ship_schd_no);
		}
		
		/**
		 * null文字の出荷予定を取得するかチェック
		 * 
		 * @return
		 */
		protected boolean isGetNullVal(MCList<Srch01_AllocDtlR> shipSchdL) {
			
			if ((!isNull(up0().sno1()) && !up0().sno1().contains(MAC_STR.NULL_VAL.value()))
					|| (!isNull(up0().sno2()) && !up0().sno2().contains(MAC_STR.NULL_VAL.value()))
					|| (!isNull(up0().sno3()) && !up0().sno3().contains(MAC_STR.NULL_VAL.value()))
					|| (!isNull(up0().sno4()) && !up0().sno4().contains(MAC_STR.NULL_VAL.value()))) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 無し可FLG=1の出荷予定があるかチェック
		 * 
		 * @return
		 */
		protected boolean isSnoNull(MCList<Srch01_AllocDtlR> shipSchdL, String snoStr) {
			
			MCList<Srch01_AllocDtlR> snoNullL = shipSchdL.subList(r -> r.getBooleanNE(snoStr));
			if (!snoNullL.isEmpty()) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 引当保留とするか
		 */
		protected boolean isAllocWait(Srch01_AllocDtlR r) {
			
			if (!r.getBooleanNE("exceed_alloc_days_flg") && r.ship_inst_qty().isZero()
					&& r.ship_act_qty().isZero()
					&& (MAC_ALLOC_TYP.isIMMED(r.alloc_typ())
							|| (MAC_ALLOC_TYP.isNON(r.alloc_typ()) && !isNull(r.xfr_schd_no())))) {
				return true;
			}
			
			return  false;
		}
		
		/**
		 * 引当管理サービスの引当可能日数チェックを実行
		 */
		protected void doAllocAvlSprt(MSBEL_AllocMngService.Alloc_Avl_Sprt01 allocAvlSprt01, MCList<Srch01_AllocDtlR> shipSchdL) {
			
			for (Srch01_AllocDtlR r : shipSchdL) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					Alloc_Avl_Sprt01_CndR cndR = Alloc_Avl_Sprt01_CndR.create();
					copy(cndR, r, createMap_Alloc_Avl_Sprt01_CndR_Srch01_AllocDtlR());
					allocAvlSprt01.up0().add(cndR);
				}
			}
			
			if (!allocAvlSprt01.up0().isEmpty()) {
				allocAvlSprt01.exec();
			}
		}
		
		protected Map_Alloc_Avl_Sprt01_CndR_Srch01_AllocDtlR<Alloc_Avl_Sprt01_CndR, Srch01_AllocDtlR> createMap_Alloc_Avl_Sprt01_CndR_Srch01_AllocDtlR() {
			return new Map_Alloc_Avl_Sprt01_CndR_Srch01_AllocDtlR<Alloc_Avl_Sprt01_CndR, Srch01_AllocDtlR>();
		}

		public class Map_Alloc_Avl_Sprt01_CndR_Srch01_AllocDtlR<D extends Alloc_Avl_Sprt01_CndR, S extends Srch01_AllocDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$peg_no, Srch01_AllocDtlR.$peg_no);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, Srch01_AllocDtlR.$ship_term_cd);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, Srch01_AllocDtlR.$ship_to_lg_grp_cd);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_lg_grp_cd, Srch01_AllocDtlR.$ship_fr_lg_grp_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (src.sls_cststk_flg()) {
					// 預り売上の場合は、売上予定日を出庫予定日とする。
					dest.gi_schd_dt(src.sls_schd_dt());
				}
				else {
					dest.gi_schd_dt(src.ship_schd_tm().startTimeOfDay());
				}
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 引当順変更前チェック処理を実行する。<br>
	 */
	public class Chk01 extends MSBEL_AllocPrio_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chkShipSchd());
			msgL.addAll(chkShipPr());
			
			return msgL;
		}
		
		/**
		 * 出荷進捗の更新カウンタチェックを行う。
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkShipPr() {
			
			MCMessageList msgL = new MCMessageList();
			// ロック
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL0150_MST_SHIP_PR_S01", shipPrL, shipPrL_bldr, up0());

			MCIndexKey idxkey = shipPrL.createIndex(shipPrL_bldr.getBaseDbc().getKeyColumn());
			for (Chk01_AllocDtlR r : up0()) {
				MST_SHIP_PR_R shipPrR = shipPrL.getFirst(idxkey, r.ship_pr_no());
				if (!isNull(shipPrR)) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_AllocDtlR.$ship_pr_upd_cntr,
							shipPrR));
				}

				if (!msgL.isEmpty()) {
					break;
				}
			}
			return msgL;
		}
		
		/**
		 * 出荷予定の更新カウンタチェック、ＤＡＣチェックを行う。
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkShipSchd() {
			
			MCMessageList msgL = new MCMessageList();
			// ロック
			MCList<MST_SHIP_SCHD_R> shipschdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder shipschdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL0150_MST_SHIP_SCHD_S01", shipschdL, shipschdL_bldr, up0());

			MCIndexKey idxkey = shipschdL.createIndex(shipschdL_bldr.getBaseDbc().getKeyColumn());
			for (Chk01_AllocDtlR r : up0()) {
				MST_SHIP_SCHD_R shipSchdR = shipschdL.getFirst(idxkey, r.ship_schd_no());
				if (!isNull(shipSchdR)) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_AllocDtlR.$upd_cntr, shipSchdR));
					// DACチェック
					msgL.addAll(checkWritableLgGrpCdDac(r,
							Chk01_AllocDtlR.$ship_fr_lg_grp_cd));
				}

				if (!msgL.isEmpty()) {
					break;
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 出荷予定を更新する。<br>
	 */
	public class Upd01 extends MSBEL_AllocPrio_MC_A.Upd01 {
		MSBEL_AllocPrio.Chk01 _chk01Ope = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callThisChk01();
			
			throwUpdErr();
			
			updShipSchd();
		}
		
		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			_chk01Ope = MSBEL_AllocPrio.crtChk01();
			_chk01Ope.up0().setAll(up0());
			setPegNo(_chk01Ope.up0());
			_chk01Ope.exec();
			up0().setAll(_chk01Ope.down0());
		}
		
		/**
		 * 登録処理を実行する
		 */
		protected void updShipSchd() {
			
			MCList<MST_SHIP_SCHD_R> dbcL = MCList.create(MST_SHIP_SCHD_R.class);
			for (Chk01_AllocDtlR r : _chk01Ope.down0()) {
				MST_SHIP_SCHD_R tmp = MST_SHIP_SCHD_R.create();
				tmp.ship_schd_no(r.ship_schd_no());
				tmp.alloc_prio(r.alloc_prio());
				dbcL.add(tmp);
			}

			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSet(t.alloc_prio);
			dbUpdateKey("MSBEL0150_MST_SHIP_SCHD_U01", dbcL, dbcL_bldr);
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 入庫割当を行う。<br>
	 */
	public class Sprt01 extends MSBEL_AllocPrio_MC_A.Sprt01 {
		protected MCList<Srch_RsltR> _allocRsltL = MCList.create(Srch_RsltR.class);
		protected MCList<Srch_RsltR> _allocGrpRsltL = MCList.create(Srch_RsltR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initCache();
			editUp();
			callAllocMngSvSrch01();
			setDown();
		}
		
		protected void initCache() {
			initItmUnitCache(up0());
		}
		
		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Srch01_AllocDtlR.$peg_no, up0());
		}
		
		/**
		 * 入庫割当を行う。
		 * 引当管理サービスのロット提案サービスを呼び出す
		 */
		protected void callAllocMngSvSrch01(){
			MSBEL_AllocMngService.Alloc_Srch01 opAlc = MSBEL_AllocMngService.crtAlloc_Srch01();
			opAlc.up0().stk_flg(false);
			opAlc.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			opAlc.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			opAlc.up0().except_alloc_wait_flg(true);
			opAlc.up0().nm_srch_flg(false);
			opAlc.up0().dtl_flg(true);
			cmpNotLotFixFlg();
			setAll(opAlc.up1(), up0(), createMap_Srch_TgtR_Srch01_AllocDtlR());
			
			for (Srch01_AllocDtlR r : up0()) {
				if (!isNull(r.xfr_schd_no())) {
					MSW_IO_SCHD_DEL_R tmpR = MSW_IO_SCHD_DEL_R.create();
					tmpR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value());
					tmpR.io_schd_sub_no1(r.xfr_schd_no());
					opAlc.up4().add(tmpR);
				}
			}
			
			//引当を実行する
			if (!opAlc.up1().isEmpty()) {
				opAlc.exec();
				_allocRsltL.setAll(opAlc.down0());
			}
		}
		
		protected void cmpNotLotFixFlg() {
			up0().addBooleanColumn("not_lot_fix_flg", true);
			MCList<Srch01_AllocDtlR> notLotMixL = up0().subList(r -> (r.not_lot_mix_flg() || r.not_sublot_mix_flg()) && !isNull(r.xfr_schd_no()) );
			if (isNull(notLotMixL)) {
				return;
			}
			
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
			
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R xfrSchd = MST_XFR_SCHD_R.create("XFR_SCHD");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(xfrSchd);
			dbc_bldr.setSelect(xfrSchd.xfr_schd_no,
					xfrSchd.xfr_src_typ,
					xfrSchd.slo_d_no);
			dbSelectKey("MSBEL0150_MST_XFR_SCHD_S01", 
					xfrSchdL, dbc_bldr, up0().groupBy(Srch01_AllocDtlR.$xfr_schd_no));
			
			MCIndexKey xfrSchdIdx = xfrSchdL.createIndex(MST_SHIP_PR_R.$xfr_schd_no);
			for (Srch01_AllocDtlR allocR : notLotMixL) {
				MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdIdx, allocR.xfr_schd_no());
				if (isNull(xfrSchdR)) {
					continue;
				}
				else if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
					up0().setBooleanNE("not_lot_fix_flg", false);
				}
				else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
					up0().setBooleanNE("not_lot_fix_flg", false);
				}
			}
		}
		protected boolean isSrcInpt(MST_XFR_SCHD_R xfrSchdR) {
			return MSC_XFR_SRC_TYP.isINPT(xfrSchdR.xfr_src_typ()) || MSC_XFR_SRC_TYP.isINPT_RPL(xfrSchdR.xfr_src_typ());
		}
		protected boolean isSrcSlo(MST_XFR_SCHD_R xfrSchdR) {
			return !isNull(xfrSchdR.slo_d_no()) || MSC_XFR_SRC_TYP.isSHIP_RPL(xfrSchdR.xfr_src_typ());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(setAllocRsltL(up0()));
		}
		
		/**
		 * 引当結果を上り電文に反映して返す
		 */
		protected MCList<Srch01_AllocDtlR> setAllocRsltL(MCList<Srch01_AllocDtlR> list) {
			MCList<Srch01_AllocDtlR> l = MCList.create(Srch01_AllocDtlR.class);
			MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

			for (Srch01_AllocDtlR r : list) {

				MCNumber alloc_avl_qty = MCNumber.ZERO;
				MCNumber not_alloc_avail_qty = r.wait_qty();

				rsltL.init();
				if (!_allocRsltL.isEmpty()) {
					MCIndexKey idxkey = _allocRsltL.createIndex(Srch_RsltR.$peg_no);
					rsltL = _allocRsltL.subList(idxkey, r.peg_no());
				}
				if (rsltL.isEmpty()) {
					r.alloc_avl_qty(alloc_avl_qty);
					r.not_alloc_avail_qty(r.wait_qty());
					l.add(r);
				}
				else {
					// 引当できた
					rsltL.sort(SortType.DESC, Srch_RsltR.$schd_dt);
					
					for (Srch_RsltR rsltR : rsltL) {
						alloc_avl_qty = alloc_avl_qty.add(rsltR.base_unit_qty());
						not_alloc_avail_qty = not_alloc_avail_qty.subtract(rsltR.base_unit_qty());
					}
					
					if (rsltL.size() > 0) {
						if (not_alloc_avail_qty.eq(MCNumber.ZERO)) {
							r.avl_schd_dt(rsltL.get(0).schd_dt());
							if (!isNull(rsltL.get(0).schd_dt()) && rsltL.get(0).schd_dt().gtDate(r.ship_schd_dt())) {
								r.prms_delay_flg(true);
							}
							if (rsltL.size() > 1) {
								r.split_flg(true);
							}
						}
					}
					
					r.alloc_avl_qty(alloc_avl_qty);
					r.not_alloc_avail_qty(not_alloc_avail_qty);
					l.add(r);
				}
			}
			setCmlValue(l, Srch01_AllocDtlR.$not_alloc_avail_qty, Srch01_AllocDtlR.$cml_not_alloc_avail_qty, 0, l.size() - 1);
			
			return l;
		}
		
		protected Map_Srch_TgtR_Srch01_AllocDtlR<Srch_TgtR, Srch01_AllocDtlR> createMap_Srch_TgtR_Srch01_AllocDtlR() {
			return new Map_Srch_TgtR_Srch01_AllocDtlR<Srch_TgtR, Srch01_AllocDtlR>();
		}
		public class Map_Srch_TgtR_Srch01_AllocDtlR<D extends Srch_TgtR, S extends Srch01_AllocDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, Srch01_AllocDtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$itm_cd, Srch01_AllocDtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, Srch01_AllocDtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, Srch01_AllocDtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, Srch01_AllocDtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, Srch01_AllocDtlR.$ver_no);
				addColumnPathMap(Srch_TgtR.$alloc_grp_cd, Srch01_AllocDtlR.$alloc_grp_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, Srch01_AllocDtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, Srch01_AllocDtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, Srch01_AllocDtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, Srch01_AllocDtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$sno1, Srch01_AllocDtlR.$sno1);
				addColumnPathMap(Srch_TgtR.$sno1_null_flg, Srch01_AllocDtlR.$sno1_null_flg);
				addColumnPathMap(Srch_TgtR.$sno2, Srch01_AllocDtlR.$sno2);
				addColumnPathMap(Srch_TgtR.$sno2_null_flg, Srch01_AllocDtlR.$sno2_null_flg);
				addColumnPathMap(Srch_TgtR.$sno3, Srch01_AllocDtlR.$sno3);
				addColumnPathMap(Srch_TgtR.$sno3_null_flg, Srch01_AllocDtlR.$sno3_null_flg);
				addColumnPathMap(Srch_TgtR.$sno4, Srch01_AllocDtlR.$sno4);
				addColumnPathMap(Srch_TgtR.$sno4_null_flg, Srch01_AllocDtlR.$sno4_null_flg);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, Srch01_AllocDtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Srch01_AllocDtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Srch01_AllocDtlR.$not_sublot_mix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, Srch01_AllocDtlR.$valid_dt_fr);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr_grp, Srch01_AllocDtlR.$valid_dt_fr_grp);
				addColumnPathMap(Srch_TgtR.$vld_dt_to, Srch01_AllocDtlR.$valid_dt_to);
				addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Srch01_AllocDtlR.$alloc_scope_typ);
				addColumnPathMap(Srch_TgtR.$ship_term_cd, Srch01_AllocDtlR.$ship_term_cd);
				addColumnPathMap(Srch_TgtR.$pack_alloc_flg, Srch01_AllocDtlR.$pack_alloc_flg);
				addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, Srch01_AllocDtlR.$alloc_ship_lg_grp_cd);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, Srch01_AllocDtlR.$loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Srch01_AllocDtlR.$str_ln_cd);
				addColumnPathMap(Srch_TgtR.$cst_cd, Srch01_AllocDtlR.$cst_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (src.sls_cststk_flg()) {
					// 預り売上の場合は、売上予定日を出庫予定日とする。
					dest.gi_schd_dt(src.sls_schd_dt());
				}
				else {
					dest.gi_schd_dt(isNull(src.ship_schd_tm()) ? null : src.ship_schd_tm().startTimeOfDay());
				}
				dest.gr_schd_dt(isNull(src.dlv_schd_tm()) ? null : src.dlv_schd_tm().startTimeOfDay());
				
				if (MSC_DLV_ID_TYP.isLOC(src.dlv_id_typ())) {
					
					dest.gr_str_ln_cd(src.dlv_str_ln_cd());
					dest.gr_loc_cd(src.dlv_id_cd());
				}

				dest.dlv_lg_grp_cd(src.ship_to_lg_grp_cd());
				
				if (src.pack_alloc_flg() && src.pack_flg()) {
					
					dest.pack_unit_cd(src.trd_unit_cd());
					
					if (isSame(dest.pack_unit_cd(), src.base_unit_cd())) {
						dest.pack_unit_qty(src.wait_qty());
					}
					else {
						dest.pack_unit_qty(rvrsBaseUnitConv(
								src.wait_qty(), 
								src.trd_unit_conv_base_qty(),  
								src.trd_unit_conv_qty(), 
								src.trd_unit_dec_place(),
								src.trd_unit_rnd_typ()));
					}
				}
				
				dest.base_unit_qty(src.base_unit_qty().subtract(src.alloc_qty()));
				dest.not_lot_fix_flg(src.getBooleanNE("not_lot_fix_flg"));
				
				if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
				}
				else if (MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
				}
				else if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PROV.value());
				}
				else if (MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value());
				}
				
				// 受払予定状況区分は、売上の細かい区分までは設定しなくてよい。
				if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
				}
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				}
				
				// 移動・移送予定の場合は、ＶＭＩ在庫を引当できるよう、在庫識別区分が自社在庫の場合、在庫識別区分をクリアする
				if ((MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) 
						&& MSC_STK_ID_TYP.isCOSTK(dest.stk_id_typ())) {
					dest.stk_id_typ(null);
					dest.stk_bp_cd(null);
				}
				
				dest.stk_alloc_flg(false);
			}
		}
	}
	
	// キャッシュ関連
	protected static final Class<MSBEL_AllocPrio> CLAZZ = MSBEL_AllocPrio.class;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	
	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected void _initItmUnitCache(MCList<? extends MCRow> bindL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place,
				t.rnd_typ, t.pack_flg);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}

	//FMCB CUSTOM END
}