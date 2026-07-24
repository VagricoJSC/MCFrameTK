package mcframe.serverMSBB.MSBBL0120;

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
import mcframe.serverMSBB.MSBBL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.commonFX.notice.FX_Msg.FXUDL0010;
import static mcframe.serverMSBB.MSBBL0120.Query.*;
import mcframe.serverMSBB.MSBBL5010.*;
import java.math.RoundingMode;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran; 
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_MlySPlnItmUpd"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_MlySPlnItmUpd_MC extends MSBBL_MlySPlnItmUpd_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBBL_MlySPlnItmUpd_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if(!chkParam()) {
				return;
			}
			editUp();
			srchHdr();
			if (isNull(down0().ym())) {
				return;
			}
			srchDtl();
		}

		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			if(isNullOr(up0().dpt_cd(), up0().ym(), up0().spln_vers(),
					up0().spln_ym_fr(), up0().spln_ym_to())){
				return false;
			}
			return true;
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp(){
			if(isNull(up0().cst_cd())){
				up0().cst_cd(MAC_STR.NULL_VAL.value());
			}
			if(isNull(up0().wrk_no())){
				up0().wrk_no(MAC_STR.NULL_VAL.value());
			}
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			editUpOnOffStr(up0(), "fix_flg_str", up0().fix_t_flg(), up0().fix_f_flg());
		}

		protected void editUpOnOffStr(MCRow up, String col, boolean t_flg, boolean f_flg) {
			if (!(t_flg && f_flg)) {
				if (t_flg) {
					up.addStringColumn(col, toTrueStr(true));
				}
				if (f_flg) {
					up.addStringColumn(col, toFalseStr(false));
				}
			}
		}

		/**
		 * 集計別販売計画バージョン検索
		 */
		protected void srchHdr(){
			executeQuery(down0(), MSBBL0120_MST_SPLN_SUM_VERS_S01(), up0());
		}

		/**
		 * 集計別販売計画確定、明細、品目内訳検索
		 */
		protected void srchDtl(){
			// 品目内訳検索
			MCList<Srch01_DtlR> itmL = srchItm();
			
			if (isNull(itmL)) {
				down0().clear();
				return ;
			}
			
			// 構成マスタ検索
			MCList<MAM_SPLN_ITM_CONF_R> itmConfL = srchItmConf(up0(), itmL, Srch01_DtlR.$spln_itm_cd);
			
			// 入力フォーム編集
			setInptForm(itmL, itmConfL);
		}
		
		/**
		 * 品目内訳検索
		 */
		protected MCList<Srch01_DtlR> srchItm() {
			MCList<Srch01_DtlR> itmL = MCList.create(Srch01_DtlR.class);
			MCQueryPlan sql = MSBBL0120_MST_SPLN_SUM_DTL_S01();
			executeQuery(itmL, sql, up0());
			return itmL;
		}
		
		/**
		 * 入力フォーム編集
		 */
		protected void setInptForm(MCList<Srch01_DtlR> itmL, MCList<MAM_SPLN_ITM_CONF_R> itmConfL) {
			String[] grpCols = {Srch01_DtlR.$spln_itm_cd, Srch01_DtlR.$cur_cd};
			int grpPegNo = 0;
			for (MCList<Srch01_DtlR> grpL : itmL.groupList(grpCols)) {
				// 紐付けＮＯ設定
				grpL.setNumber(Srch01_DtlR.$grp_peg_no, grpPegNo);
				grpPegNo++;
				grpL.setNumber(Srch01_DtlR.$disp_seq, (MCNumber)grpL.min(Srch01_DtlR.$disp_seq));
				
				// 販売年月ごとに、合計行＋内訳品目行を設定
				for (MCList<Srch01_DtlR> ymL : grpL.groupList(Srch01_DtlR.$spln_ym)) {
					Srch01_DtlR baseR = ymL.get(0);
					Srch01_DtlR splnR = Srch01_DtlR.create();
					splnR.fix_flg(baseR.fix_flg());
					splnR.spln_itm_cd(baseR.spln_itm_cd());
					splnR.spln_itm_nm(baseR.spln_itm_nm());
					splnR.itm_cd(MAC_STR.NULL_VAL.value());
					splnR.itm_sub1(MAC_STR.NULL_VAL.value());
					splnR.itm_sub2(MAC_STR.NULL_VAL.value());
					splnR.itm_sub3(MAC_STR.NULL_VAL.value());
					splnR.unit_cd(null);
					splnR.unit_nm(null);
					splnR.cur_cd(baseR.cur_cd());
					splnR.cur_nm(baseR.cur_nm());
					splnR.amt_dec_place(baseR.amt_dec_place());
					splnR.spln_ym(baseR.spln_ym());
					splnR.spln_set_typ(baseR.spln_set_typ());
					splnR.spln_qty(baseR.dtl_qty());
					splnR.spln_amt(baseR.dtl_amt());
					splnR.disp_seq(baseR.disp_seq());
					splnR.grp_peg_no(baseR.grp_peg_no());
					
					down1().add(splnR);
					down1().addAll(ymL);
					down1().addAll(crtInptForm(itmConfL, ymL, splnR));
				}
			}
		}
		
		/**
		 * 追加入力フォーム取得
		 * @param itmConfL 計画品目構成マスタ
		 * @param ymL 販売計画構成
		 * @param baseR 合計行
		 */
		protected MCList<Srch01_DtlR> crtInptForm(MCList<MAM_SPLN_ITM_CONF_R> itmConfL, 
				MCList<Srch01_DtlR> ymL, Srch01_DtlR splnR){
			
			// 計画品目・販売年月に対応する構成マスタの取得
			MCList<MAM_SPLN_ITM_CONF_R> itmL = subListItmConf(itmConfL, splnR.spln_itm_cd(), splnR.spln_ym());
			
			// itmLから追加する品目のリストを作成する
			MCList<Srch01_DtlR> retL = MCList.create(Srch01_DtlR.class);
			String[] keys = {
					MAM_SPLN_ITM_CONF_R.$itm_cd, 
					MAM_SPLN_ITM_CONF_R.$itm_sub1, 
					MAM_SPLN_ITM_CONF_R.$itm_sub2, 
					MAM_SPLN_ITM_CONF_R.$itm_sub3};
			MCIndexKey ymIdxkey = ymL.createIndex(keys);
			for (MAM_SPLN_ITM_CONF_R itmR : itmL) {
				Srch01_DtlR ymR = ymL.getFirst(ymIdxkey, itmR.toArray(keys));
				if (ymR == null) {
					Srch01_DtlR tmpR = splnR.clone();
					tmpR.spln_qty(null);
					tmpR.spln_amt(null);
					tmpR.itm_cd(itmR.itm_cd());
					tmpR.itm_sub1(itmR.itm_sub1());
					tmpR.itm_sub2(itmR.itm_sub2());
					tmpR.itm_sub3(itmR.itm_sub3());
					tmpR.itm_nm(itmR.getStringNE(Srch01_DtlR.$itm_nm));
					tmpR.unit_cd(itmR.getStringNE(Srch01_DtlR.$unit_cd));
					tmpR.unit_nm(itmR.getStringNE(Srch01_DtlR.$unit_nm));
					retL.add(tmpR);
				}
			}
			return retL;
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBBL_MlySPlnItmUpd_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			calc();
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			setPegNo(up1());
		}

		/**
		 * 数量金額計算
		 */
		protected void calc() {
			MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
			addAll(calcSvc.up0(), up1().subList(r->!MAC_STR.isNULL_VAL(r.itm_cd())), createMap_Calc01_DtlR_Srch01_DtlR());
			calcSvc.up0().setString(Calc01_DtlR.$dpt_cd, up0().dpt_cd());
			calcSvc.up0().setString(Calc01_DtlR.$cst_cd, up0().cst_cd());
			calcSvc.exec();
			MCMessagePool.getMessageList().clear();
			
			// 計算結果を下り電文に設定
			down0().setAll(up1());
			String[] destCols = {Srch01_DtlR.$spln_qty, Srch01_DtlR.$spln_amt};
			String[] srcCols = {Calc01_DtlR.$spln_qty, Calc01_DtlR.$spln_amt};
			copyByPegNo(down0(), destCols, calcSvc.down0(), srcCols);
			
			for (MCList<Srch01_DtlR> grpL : up1().groupList(Srch01_DtlR.$grp_peg_no, Srch01_DtlR.$spln_ym)) {
				Srch01_DtlR splnR = grpL.getFirst(Srch01_DtlR.$itm_cd, MAC_STR.NULL_VAL.value());
				if (splnR != null) {
					splnR.spln_amt(null);
					splnR.spln_qty(null);
					splnR.spln_amt(grpL.sum(Srch01_DtlR.$spln_amt));
					splnR.spln_qty(grpL.sum(Srch01_DtlR.$spln_qty));
				}
			}
		}
	}

	/**
	 * Sprt02オペレーション.<p>
	 *
	 */
	public class Sprt02 extends MSBBL_MlySPlnItmUpd_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			calc();
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			for (Srch01_DtlR r :up1()) {
				r.peg_no(r.grp_peg_no());
			}
		}

		/**
		 * 数量金額計算
		 */
		protected void calc() {
			MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
			addAll(calcSvc.up0(), up1().subList(Srch01_DtlR.$itm_cd, MAC_STR.NULL_VAL.value()), createMap_Calc01_DtlR_Srch01_DtlR());
			calcSvc.up0().setString(Calc01_DtlR.$dpt_cd, up0().dpt_cd());
			calcSvc.up0().setString(Calc01_DtlR.$cst_cd, up0().cst_cd());
			calcSvc.exec();
			MCMessagePool.getMessageList().clear();
			
			// 計算結果を下り電文に設定
			down0().setAll(up1());
			down0().setNumber(Srch01_DtlR.$spln_qty, MCNumber.ZERO);
			down0().setNumber(Srch01_DtlR.$spln_amt, MCNumber.ZERO);
			String[] joinKeys = new String[] {
					Calc01_ItmDtlR.$peg_no,
					Calc01_ItmDtlR.$spln_itm_cd,
					Calc01_ItmDtlR.$itm_cd,
					Calc01_ItmDtlR.$itm_sub1,
					Calc01_ItmDtlR.$itm_sub2,
					Calc01_ItmDtlR.$itm_sub3,
					Calc01_ItmDtlR.$cur_cd,
					Calc01_ItmDtlR.$spln_ym
			};
			MCJoinKey<MCList<Calc01_DtlR>> splnItmJk = down0().join(joinKeys, calcSvc.down0() ,joinKeys);
			join(down0(), splnItmJk, createMap_Srch01_DtlR_Calc01_DtlR());
			MCJoinKey<MCList<Calc01_ItmDtlR>> itmJk = down0().join(joinKeys, calcSvc.down1(), joinKeys);
			join(down0(), itmJk, createMap_Srch01_DtlR_Calc01_ItmDtlR());
		}

		protected Map_Srch01_DtlR_Calc01_DtlR<Srch01_DtlR,Calc01_DtlR> createMap_Srch01_DtlR_Calc01_DtlR() {
			return new Map_Srch01_DtlR_Calc01_DtlR<Srch01_DtlR, Calc01_DtlR>();
		}
		public class Map_Srch01_DtlR_Calc01_DtlR<D extends Srch01_DtlR, S extends Calc01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$spln_qty, Calc01_DtlR.$spln_qty);
				addColumnPathMap(Srch01_DtlR.$spln_amt, Calc01_DtlR.$spln_amt);
			}
		}

		protected Map_Srch01_DtlR_Calc01_ItmDtlR<Srch01_DtlR,Calc01_ItmDtlR> createMap_Srch01_DtlR_Calc01_ItmDtlR() {
			return new Map_Srch01_DtlR_Calc01_ItmDtlR<Srch01_DtlR, Calc01_ItmDtlR>();
		}
		public class Map_Srch01_DtlR_Calc01_ItmDtlR<D extends Srch01_DtlR, S extends Calc01_ItmDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$spln_qty, Calc01_ItmDtlR.$spln_qty);
				addColumnPathMap(Srch01_DtlR.$spln_amt, Calc01_ItmDtlR.$spln_amt);
			}
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBBL_MlySPlnItmUpd_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 部門DACチェック
			msgL.addAll(checkDptDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 計画品目構成マスタ存在チェック
				msgL.addAll(checkSplnItmMst());
				// 小数部有効桁数チェック
				msgL.addAll(checkInptDecPlace());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック＆訂正可否チェック
				msgL.addAll(checkUpdCntrLock());
				setErrFlg(msgL);
				if (hasErrFlgOn(up0(), up1())) {
					return msgL;
				}
				// 販売計画明細の存在チェック
				msgL.addAll(checkSumDtl());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$dpt_cd));
			return msgL;
		}

		/**
		 * 計画品目構成マスタ存在チェック
		 */
		protected MCMessageList checkSplnItmMst() {
			MCMessageList msgL = new MCMessageList();

			// 販売計画品目構成マスタ検索（計画単位＝計画品目）
			FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cacheSplnItmConf = new FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>>();
			cacheSplnItmConf.setFixMaxCacheSize(-1);

			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			up0().spln_ym_fr((MCDate)up1().min(Chk01_DtlR.$spln_ym));
			up0().spln_ym_to((MCDate)up1().max(Chk01_DtlR.$spln_ym));
			MCList<MAM_SPLN_ITM_CONF_R> dbcSplnItmConfL = srchItmConf(up0(), notErrL, Chk01_DtlR.$spln_itm_cd);

			String[] keys = {
					MAM_SPLN_ITM_CONF_R.$spln_itm_cd
				};
			for(MCList<MAM_SPLN_ITM_CONF_R> grpL : dbcSplnItmConfL.groupList(keys) ) {
				cacheSplnItmConf.putCache(getVals(keys, grpL.get(0)), grpL);
			}

			// 有効期間チェック
			for(Chk01_DtlR upR : notErrL) {
				if (upR.isStatusDelete()) {
					continue;
				}
				// 計画品目・販売年月に対応する構成マスタの取得
				MCList<MAM_SPLN_ITM_CONF_R> dbcL = cacheSplnItmConf.getCache(getVals(keys, upR));
				dbcL = subListItmConf(dbcL, upR.spln_itm_cd(), upR.spln_ym());
				String[] itmKeys = {
						MAM_SPLN_ITM_CONF_R.$itm_cd,
						MAM_SPLN_ITM_CONF_R.$itm_sub1,
						MAM_SPLN_ITM_CONF_R.$itm_sub2,
						MAM_SPLN_ITM_CONF_R.$itm_sub3
				};
				MAM_SPLN_ITM_CONF_R matchedR = dbcL.getFirst(itmKeys, getVals(itmKeys, upR));
				if (matchedR == null) {
					msgL.add(new MCMessage(upR, null,
							MSBBL0056,
							upR.spln_itm_cd(),
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							toYMString(upR.spln_ym()),
							toDispGUIIndex(upR)));
				}
			}
			return msgL;
		}

		/**
		 * 計画数量、計画金額の小数有効桁数チェック
		 */
		protected MCMessageList checkInptDecPlace() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			for (Chk01_DtlR upR: notErrL){
				upR.qty_dec_place(0);
				if (!isNull(upR.spln_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$qty_dec_place, Chk01_DtlR.$spln_qty));
				}
				if (!isNull(upR.spln_amt())) {
					msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$amt_dec_place, Chk01_DtlR.$spln_amt));
				}
			}
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			MST_SPLN_LOCK_R dbcR = MST_SPLN_LOCK_R.create();
			MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(MST_SPLN_LOCK_R.create("T"));
			if (dbSelectKeyForUpdate("MSBBL0120_MST_SPLN_LOCK_S01", dbcR, dbcR_bldr, up0()) < 1) {
				throw new MCAppException("FCBCC0110");
			}
		}

		/**
		 * 集計別販売計画バージョン更新カウンタチェック＆訂正可否チェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();
			MST_SPLN_SUM_VERS_R lockedR = MST_SPLN_SUM_VERS_R.create();
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_VERS_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBBL0120_MST_SPLN_SUM_VERS_S01", lockedR, lockedR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, lockedR));
			if (lockedR.locked_flg()) {
				msgL.add(new MCMessage(up0(), null,
						MSBBL0051,
						up0().dpt_cd(),
						up0().cst_cd(),
						up0().wrk_no(),
						toYMString(up0().ym()),
						up0().spln_vers()));
			}
			up0().adopted_flg(lockedR.adopted_flg());
			
			return msgL;
		}

		/**
		 * 販売計画明細存在チェック
		 */
		protected MCMessageList checkSumDtl() {
			MCMessageList msgL = new MCMessageList();

			// 販売計画明細検索
			MCList<MST_SPLN_SUM_DTL_R> dbcL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			MST_SPLN_SUM_DTL_R t = MST_SPLN_SUM_DTL_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.spln_itm_cd);
			dbcL_bldr.addSelect(t.cur_cd);
			dbcL_bldr.addSelect(t.spln_ym);
			dbcL_bldr.setWhere(t.spln_itm_cd.eq(bind("spln_itm_cd")));
			dbcL_bldr.addConstWhereWithAnd(t.dpt_cd.eq(bind("dpt_cd")));
			dbcL_bldr.addConstWhereWithAnd(t.cst_cd.eq(bind("cst_cd")));
			dbcL_bldr.addConstWhereWithAnd(t.wrk_no.eq(bind("wrk_no")));
			dbcL_bldr.addConstWhereWithAnd(t.ym.eq(bind("ym")));
			dbcL_bldr.addConstWhereWithAnd(t.spln_vers.eq(bind("spln_vers")));
			dbSelect("MSBBL0120_MST_SPLN_SUM_DTL_S01", dbcL, dbcL_bldr, up1(), up0());
			
			// 販売計画明細存在チェック
			String[] keys = new String[] {
					MST_SPLN_SUM_DTL_R.$spln_itm_cd,
					MST_SPLN_SUM_DTL_R.$cur_cd,
					MST_SPLN_SUM_DTL_R.$spln_ym
				};
			MCIndexKey idxKey = dbcL.createIndex(keys);
			for(Chk01_DtlR upR : up1().distinctNE(keys)) {
				MST_SPLN_SUM_DTL_R r = dbcL.getFirst(idxKey, getVals(keys, upR));
				if (r == null) {
					msgL.add(new MCMessage(upR, null,
							MSBBL0057,
							upR.spln_itm_cd(),
							upR.cur_cd(),
							toYMString(upR.spln_ym()),
							toDispGUIIndex(upR)));
				}
			}
			return msgL;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBBL_MlySPlnItmUpd_MC_A.Upd01 {
		
		/**
		 * 最新品目別集計判断ＦＬＧ
		 */
		protected boolean _newItmSumFlg = false;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			calcQtyAmt();
			throwUpdErr();
			editUpSub();
			callThisChk01();
			throwUpdErr();
			regSumSpln();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk01_DtlR.$peg_no, up1());
		}

		protected void editUpSub(){
			for (Chk01_DtlR r : up1()) {
				if (MCNumber.ZERO.eq(r.spln_qty()) && MCNumber.ZERO.eq(r.spln_amt())) {
					r.setStatus(MCRow.DELETE);
				}
			}
		}
		
		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBBL_MlySPlnItmUpd.Chk01 ope = MSBBL_MlySPlnItmUpd.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 計画数量金額計算
		 */
		protected void calcQtyAmt(){
			// 数量金額計算の対象を抽出する
			MCList<Calc01_DtlR> tgtL = MCList.create(Calc01_DtlR.class);
			String[] keys = new String[] {
					Chk01_DtlR.$spln_itm_cd,
					Chk01_DtlR.$cur_cd,
					Chk01_DtlR.$spln_ym};
			
			for (MCList<Chk01_DtlR> subL : up1().groupList(keys)) {
				for (Chk01_DtlR r : subL) {
					Calc01_DtlR tgtR = Calc01_DtlR.create();
					if (MAC_STR.isNULL_VAL(r.itm_cd())){
						continue;
					}
					if (isNull(r.spln_qty()) && !isNull(r.spln_amt()) ||
							!isNull(r.spln_qty()) && isNull(r.spln_amt())) {
						tgtR.peg_no(r.peg_no());
						tgtR.spln_itm_cd(r.spln_itm_cd());
						tgtR.itm_cd(r.itm_cd());
						tgtR.itm_sub1(r.itm_sub1());
						tgtR.itm_sub2(r.itm_sub2());
						tgtR.itm_sub3(r.itm_sub3());
						tgtR.dpt_cd(up0().dpt_cd());
						tgtR.cst_cd(up0().cst_cd());
						tgtR.cur_cd(r.cur_cd());
						tgtR.spln_ym(r.spln_ym());
						tgtR.spln_qty(r.spln_qty());
						tgtR.spln_amt(r.spln_amt());
						tgtL.add(tgtR);
					}
				}
			}

			// 数量金額計算を実施する
			if (!isNull(tgtL)) {
				MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
				calcSvc.up0().setAll(tgtL);
				calcSvc.exec();
				String[] destCcols = new String[]{Chk01_DtlR.$spln_qty, Chk01_DtlR.$spln_amt};
				String[] srcCcols = new String[]{Calc01_DtlR.$spln_qty, Calc01_DtlR.$spln_amt};
				copyByPegNo(up1(), destCcols, calcSvc.down0(), srcCcols);
			}
		}

		/**
		 * 集計別販売計画登録
		 */
		protected void regSumSpln(){
			updSumVers();
			updSumFix();
			insDtlWk();
			regSumItm();
			updSumDtl();
			if (_newItmSumFlg) {
				updDtlWk();
				regSumItmNew();
			}
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		/**
		 * 集計別販売計画バージョン更新（更新カウンタをインクリメントする）
		 */
		protected void updSumVers(){
			MST_SPLN_SUM_VERS_R verR = MST_SPLN_SUM_VERS_R.create();
			MCQueryApiBuilder verR_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_VERS_R.create("T"));
			verR.dpt_cd(up0().dpt_cd());
			verR.cst_cd(up0().cst_cd());
			verR.wrk_no(up0().wrk_no());
			verR.ym(up0().ym());
			verR.spln_vers(up0().spln_vers());
			dbTsUpdateKey("MSBBL0120_MST_SPLN_SUM_VERS_U01", verR, verR_bldr.getBaseDbc());
			_newItmSumFlg = up0().adopted_flg();
		}

		/**
		 * 集計別販売計画確定更新
		 */
		protected void updSumFix(){
			String[] fixKeys = {
					Chk01_DtlR.$spln_itm_cd,
					Chk01_DtlR.$cur_cd
			};
			MCList<MST_SPLN_SUM_FIX_R> fixUpdL = MCList.create(MST_SPLN_SUM_FIX_R.class);
			MST_SPLN_SUM_FIX_R t = MST_SPLN_SUM_FIX_R.create("T");
			MCQueryApiBuilder fixUpdL_bldr = MCQueryApiBuilder.create(t);
			addAll(fixUpdL, up1().distinctNE(fixKeys), createMap_MST_SPLN_SUM_FIX_R_Chk01_DtlR());
			fixUpdL_bldr.setSet(t.fix_flg);
			dbUpdateKey("MSBBL0120_MST_SPLN_SUM_FIX_U01", fixUpdL, fixUpdL_bldr);
		}

		/**
		 * 更新処理ワーク登録
		 */
		protected void insDtlWk() {
			String[] keys = {
					Chk01_DtlR.$spln_itm_cd,
					Chk01_DtlR.$cur_cd,
					Chk01_DtlR.$spln_ym
			};
			MCList<MST_SPLN_SUM_DTL_R> itmDbcL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T"));
			addAll(itmDbcL, up1().distinctNE(keys), createMap_MST_SPLN_SUM_DTL_R_Chk01_DtlR());
			dbWkDelete("MSBBL0120_MSW_SPLN_SUM_DTL_D01", itmDbcL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0120_MSW_SPLN_SUM_DTL_I01", itmDbcL, itmDbcL_bldr.getBaseDbc());
		}
		
		/**
		 * 集計別販売計画品目内訳登録
		 */
		protected void regSumItm(){
			// 品目内訳更新前データ検索
			MCList<MST_SPLN_SUM_ITM_R> itmDbcL = MCList.create(MST_SPLN_SUM_ITM_R.class);
			executeQuery(itmDbcL, MSBBL0120_MST_SPLN_SUM_ITM_S01());

			//　品目内訳登録、更新、削除の判断
			MCList<Chk01_DtlR> insL = MCList.create(Chk01_DtlR.class);
			MCList<MST_SPLN_SUM_ITM_R> itmUpdL = MCList.create(MST_SPLN_SUM_ITM_R.class);
			MCList<MST_SPLN_SUM_ITM_R> notMdfL = MCList.create(MST_SPLN_SUM_ITM_R.class);
			String[] itmKey = new String[]{
					MST_SPLN_SUM_ITM_R.$spln_itm_cd,
					MST_SPLN_SUM_ITM_R.$itm_cd,
					MST_SPLN_SUM_ITM_R.$itm_sub1,
					MST_SPLN_SUM_ITM_R.$itm_sub2,
					MST_SPLN_SUM_ITM_R.$itm_sub3,
					MST_SPLN_SUM_ITM_R.$cur_cd,
					MST_SPLN_SUM_ITM_R.$spln_ym};
			MCIndexKey itmIdxKey = itmDbcL.createIndex(itmKey);
			for (Chk01_DtlR upR : up1()) {
				MST_SPLN_SUM_ITM_R itmDbcR = itmDbcL.getFirst(itmIdxKey, getVals(itmKey, upR));
				if (itmDbcR == null) {
					insL.add(upR);
				}
				else {
					if (upR.spln_qty().neq(itmDbcR.spln_qty()) ||
						upR.spln_amt().neq(itmDbcR.spln_amt())) {
						itmDbcR.spln_qty(upR.spln_qty());
						itmDbcR.spln_amt(upR.spln_amt());
						itmUpdL.add(itmDbcR);
					}
					else {
						notMdfL.add(itmDbcR);
					}
				}
			}
			if (itmDbcL.size() != itmUpdL.size() + notMdfL.size()) {
				// 上り電文に存在しないＤＢレコードがある場合 ※発生しない想定
				throw new MCAppException(MSBBL0059, itmDbcL.get(0).spln_itm_cd());
			}
			// 品目内訳　登録、更新を行う
			if (!isNull(itmUpdL)) {
				MST_SPLN_SUM_ITM_R t1 = MST_SPLN_SUM_ITM_R.create("T1");
				MCQueryApiBuilder itmUpdL_bldr = MCQueryApiBuilder.create(t1);
				itmUpdL_bldr.setSet(t1.spln_qty);
				itmUpdL_bldr.addSet(t1.spln_amt);
				dbUpdateKey("MSBBL0120_MST_SPLN_SUM_ITM_U01", itmUpdL, itmUpdL_bldr);
			}
			if (!isNull(insL)) {
				MCList<MST_SPLN_SUM_ITM_R> itmInsL = MCList.create(MST_SPLN_SUM_ITM_R.class);
				MCQueryApiBuilder itmInsL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_ITM_R.create("T"));
				addAll(itmInsL, insL, createMap_MST_SPLN_SUM_ITM_R_Chk01_DtlR());
				dbInsertEx("MSBBL0120_MST_SPLN_SUM_ITM_I01", itmInsL, itmInsL_bldr);
			}
		}

		/**
		 * 集計別販売計画明細更新
		 */
		protected void updSumDtl(){
			MCList<MST_SPLN_SUM_DTL_R> updL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			executeQuery(updL, MSBBL0120_MST_SPLN_SUM_DTL_S02());
			if (!updL.isEmpty()) {
				MST_SPLN_SUM_DTL_R t = MST_SPLN_SUM_DTL_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSet(t.spln_qty);
				bldr.addSet(t.spln_amt);
				dbUpdateKey("MSBBL0120_MST_SPLN_SUM_DTL_U01", updL, bldr);
			}
		}

		/**
		 * 更新処理ワーク登録
		 */
		protected void updDtlWk() {
			// 上り電文以外の明細トランの考慮
			executeUpdate(MSBBL0120_MST_SPLN_SUM_DTL_KEY_I01(), up0());
		}
		
		/**
		 * 最新集計別品目別販売計画更新
		 */
		protected void regSumItmNew(){
			// 品目別データ取得
			MCList<MST_SPLN_SUM_ITM_NEW_R> splnItmL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
			executeQuery(splnItmL, MSBBL0120_MST_SPLN_SUM_ITM_S02(), up0());
			
			// 最新品目別データ作成
			MCList<MST_SPLN_SUM_ITM_NEW_R> itmNewL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
			MCQueryApiBuilder itmNewL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_ITM_NEW_R.create("T"));
			
			String[] itmSplnKeys = new String[] {
					MST_SPLN_SUM_ITM_NEW_R.$dpt_cd,
					MST_SPLN_SUM_ITM_NEW_R.$cst_cd,
					MST_SPLN_SUM_ITM_NEW_R.$wrk_no,
					MST_SPLN_SUM_ITM_NEW_R.$spln_itm_cd,
					MST_SPLN_SUM_ITM_NEW_R.$cur_cd,
					MST_SPLN_SUM_ITM_NEW_R.$spln_ym};
			for (MCList<MST_SPLN_SUM_ITM_NEW_R> grpL : splnItmL.groupList(itmSplnKeys)) {
				grpL.sort(SortType.DESC, MST_SPLN_USR_ITM_NEW_R.$ym);
				MCDate ym = grpL.get(0).ym();
				MCList<MST_SPLN_SUM_ITM_NEW_R> subL = grpL.subList(r->isSame(r.ym(), ym));
				itmNewL.addAll(subL);
			}
			
			executeUpdate(MSBBL0120_MST_SPLN_SUM_ITM_NEW_D01());
			dbInsertEx("MSBBL0120_MST_SPLN_SUM_ITM_NEW_I01", itmNewL, itmNewL_bldr);
		}

		protected Map_MST_SPLN_SUM_ITM_R_Chk01_DtlR<MST_SPLN_SUM_ITM_R,Chk01_DtlR> createMap_MST_SPLN_SUM_ITM_R_Chk01_DtlR() {
			return new Map_MST_SPLN_SUM_ITM_R_Chk01_DtlR<MST_SPLN_SUM_ITM_R, Chk01_DtlR>();
		}
		public class Map_MST_SPLN_SUM_ITM_R_Chk01_DtlR<D extends MST_SPLN_SUM_ITM_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$cur_cd, Chk01_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_ym, Chk01_DtlR.$spln_ym);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_qty, Chk01_DtlR.$spln_qty);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_amt, Chk01_DtlR.$spln_amt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.dpt_cd(up0().dpt_cd());
				dest.cst_cd(up0().cst_cd());
				dest.wrk_no(up0().wrk_no());
				dest.ym(up0().ym());
				dest.spln_vers(up0().spln_vers());
			}
		}

		protected Map_MST_SPLN_SUM_FIX_R_Chk01_DtlR<MST_SPLN_SUM_FIX_R,Chk01_DtlR> createMap_MST_SPLN_SUM_FIX_R_Chk01_DtlR() {
			return new Map_MST_SPLN_SUM_FIX_R_Chk01_DtlR<MST_SPLN_SUM_FIX_R, Chk01_DtlR>();
		}
		public class Map_MST_SPLN_SUM_FIX_R_Chk01_DtlR<D extends MST_SPLN_SUM_FIX_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_FIX_R.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_FIX_R.$cur_cd, Chk01_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_FIX_R.$fix_flg, Chk01_DtlR.$fix_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.dpt_cd(up0().dpt_cd());
				dest.cst_cd(up0().cst_cd());
				dest.wrk_no(up0().wrk_no());
				dest.ym(up0().ym());
				dest.spln_vers(up0().spln_vers());
				dest.itm_cd(MAC_STR.NULL_VAL.value());
				dest.itm_sub1(MAC_STR.NULL_VAL.value());
				dest.itm_sub2(MAC_STR.NULL_VAL.value());
				dest.itm_sub3(MAC_STR.NULL_VAL.value());
			}
		}

		protected Map_MST_SPLN_SUM_DTL_R_Chk01_DtlR<MST_SPLN_SUM_DTL_R,Chk01_DtlR> createMap_MST_SPLN_SUM_DTL_R_Chk01_DtlR() {
			return new Map_MST_SPLN_SUM_DTL_R_Chk01_DtlR<MST_SPLN_SUM_DTL_R, Chk01_DtlR>();
		}
		public class Map_MST_SPLN_SUM_DTL_R_Chk01_DtlR<D extends MST_SPLN_SUM_DTL_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$cur_cd, Chk01_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_ym, Chk01_DtlR.$spln_ym);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_qty, Chk01_DtlR.$spln_qty);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_amt, Chk01_DtlR.$spln_amt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.dpt_cd(up0().dpt_cd());
				dest.cst_cd(up0().cst_cd());
				dest.wrk_no(up0().wrk_no());
				dest.ym(up0().ym());
				dest.spln_vers(up0().spln_vers());
				dest.itm_cd(MAC_STR.NULL_VAL.value());
				dest.itm_sub1(MAC_STR.NULL_VAL.value());
				dest.itm_sub2(MAC_STR.NULL_VAL.value());
				dest.itm_sub3(MAC_STR.NULL_VAL.value());
			}
		}
		
	}

	/**
	 * 構成マスタ取得する
	 * @param bind バインド値：dpt_cd/spln_ym_fr/spln_ym_to
	 * @param itmL 計画品目のリスト
	 * @param splnItmCol itmLの計画品目ＣＤのカラム
	 */
	protected MCList<MAM_SPLN_ITM_CONF_R> srchItmConf(MCRow bind, MCList<?> itmL, String splnItmCol) {
		MCList<MAM_SPLN_ITM_R> splnItmWkL = MCList.create(MAM_SPLN_ITM_R.class);
		MCQueryApiBuilder splnItmWkL_bldr = MCQueryApiBuilder.create(MAM_SPLN_ITM_R.create("T"));
		for (MCRow r : itmL.distinctNE(splnItmCol)) {
			MAM_SPLN_ITM_R tmpR = MAM_SPLN_ITM_R.create();
			tmpR.spln_itm_cd(r.getString(splnItmCol));
			splnItmWkL.add(tmpR);
		}
		dbWkDelete("MSBBL0120_MAW_SPLN_ITM_D01", splnItmWkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL0120_MAW_SPLN_ITM_I01", splnItmWkL, splnItmWkL_bldr.getBaseDbc());
		MCList<MAM_SPLN_ITM_CONF_R> itmConfL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
		executeQuery(itmConfL, MSBBL0120_MAM_SPLN_ITM_CONF_S01(), bind);
		return itmConfL;
	}

	/**
	 * 構成マスタ（自部門とNULL文字部門のみ）から、計画品目・部門・年月に対応する内訳品目のレコードを取得する
	 */
	protected MCList<MAM_SPLN_ITM_CONF_R> subListItmConf(MCList<MAM_SPLN_ITM_CONF_R> itmConfL, String splnItmCd, MCDate ym) {
		if (isNull(itmConfL)) {
			return MCList.create(MAM_SPLN_ITM_CONF_R.class);
		}
		MCList<MAM_SPLN_ITM_CONF_R> splnL = itmConfL.subList(r->isSame(r.spln_itm_cd(), splnItmCd) 
				&& r.st_ym().lte(ym) && ym.lte(r.end_ym()));
		MCList<MAM_SPLN_ITM_CONF_R> itmL = splnL.subList(r->!MAC_STR.isNULL_VAL(r.dpt_cd()));
		if (isNull(itmL)) {
			itmL.setAll(splnL);
		}
		return itmL;
	}
	
	// ---- 共通処理 ---------------------------------------------------------
	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	protected Map_Calc01_DtlR_Srch01_DtlR<Calc01_DtlR,Srch01_DtlR> createMap_Calc01_DtlR_Srch01_DtlR() {
		return new Map_Calc01_DtlR_Srch01_DtlR<Calc01_DtlR, Srch01_DtlR>();
	}
	public class Map_Calc01_DtlR_Srch01_DtlR<D extends Calc01_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Calc01_DtlR.$peg_no, Srch01_DtlR.$peg_no);
			addColumnPathMap(Calc01_DtlR.$spln_itm_cd, Srch01_DtlR.$spln_itm_cd);
			addColumnPathMap(Calc01_DtlR.$itm_cd, Srch01_DtlR.$itm_cd);
			addColumnPathMap(Calc01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub1);
			addColumnPathMap(Calc01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub2);
			addColumnPathMap(Calc01_DtlR.$itm_sub3, Srch01_DtlR.$itm_sub3);
			addColumnPathMap(Calc01_DtlR.$spln_ym, Srch01_DtlR.$spln_ym);
			addColumnPathMap(Calc01_DtlR.$cur_cd, Srch01_DtlR.$cur_cd);
			addColumnPathMap(Calc01_DtlR.$spln_qty, Srch01_DtlR.$spln_qty);
			addColumnPathMap(Calc01_DtlR.$spln_amt, Srch01_DtlR.$spln_amt);
		}
	}

	//FMCB CUSTOM END
}