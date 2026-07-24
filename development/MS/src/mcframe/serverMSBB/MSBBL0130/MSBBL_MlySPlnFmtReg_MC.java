package mcframe.serverMSBB.MSBBL0130;

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
import mcframe.serverMSBB.MSBBL0130.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL0130.Query.*;
import static mcframe.commonFX.notice.FX_Msg.FXUDL0010;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_MlySPlnFmtReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_MlySPlnFmtReg_MC extends MSBBL_MlySPlnFmtReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBBL_MlySPlnFmtReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchSplnFmt();
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
		}

		/**
		 * 構成検索処理
		 */
		protected void srchSplnFmt() {
			MCQueryPlan sql = MSBBL0130_MST_SPLN_FMT_S01();
			executeQuery(down0(), sql, up0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 */
	public class Srch02 extends MSBBL_MlySPlnFmtReg_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchSplnFmt();
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
		}

		/**
		 * 構成検索処理
		 */
		protected void srchSplnFmt() {
			MCQueryPlan sql = MSBBL0130_MST_SPLN_FMT_S01();
			executeQuery(down0(), sql, up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setStatus();
		}
		protected void setStatus() {
			down0().setStatus(MCRow.CREATE);
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBBL_MlySPlnFmtReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = {
					Chk01_RsltR.$dpt_cd, Chk01_RsltR.$spln_itm_cd, Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3
			};
			setGrpErrFlgByKey(up0(), grpKeys, Chk01_RsltR.$err_flg);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 更新カウンタチェック
			if (!up1().file_imp_flg()) {
				msgL.addAll(checkUpdCntr());
			}
			return msgL;
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				if (isSame(column, Chk01_RsltR.$spln_set_typ)) {
					String itmCd = row.getString(Chk01_RsltR.$itm_cd);
					if (!isNullOrNullVal(itmCd)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			// 部門ＤＡＣチェック
			msgL.addAll(checkWritableDptCdDac(getChkList(up0()), Chk01_RsltR.$dpt_cd));
			// 計画品目の有効期間チェック
			msgL.addAll(checkSplnItm());
			// 品目の有効期間チェック
			msgL.addAll(checkItm());
			// 設定区分必須チェック
			msgL.addAll(checkSetTyp());
			// ＸＸ別集計ＦＬＧの補正
			correctUnitFlg();
			
			// エラーＦＬＧ設定
			if (!msgL.isEmpty()) {
				setErrFlg(msgL);
				setGrpErrFlg();
			}
			// 全行エラーの場合、以下のチェックを行わない。ロック待ちをなるべく解消するため。
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (!isNull(notErrL)) {
				MCMessageList msg2L = new MCMessageList();
				// 部門ロック
				if (!up1().file_imp_flg()) {
					lockByDpt(notErrL, Chk01_RsltR.$dpt_cd);
				}
				// 構成データ検索
				MCList<MST_SPLN_FMT_R> dbcSplnFmtL = srchSplnFmt(notErrL);
				if (up1().file_imp_flg()) {
					// 構成データ検索
					cmplSplnFmt(notErrL, dbcSplnFmtL);
				}
				// 上り電文に存在するDBレコードの除外
				removeDbcInUp(notErrL, dbcSplnFmtL);
				// 営業部門の有効期間チェック
				msg2L.addAll(checkSlsDpt(notErrL));
				// 期間重複チェック
				msg2L.addAll(checkYm(notErrL, dbcSplnFmtL));
				// 設定区分チェック
				msg2L.addAll(checkItmSetTyp(notErrL, dbcSplnFmtL));
				// エラーＦＬＧ設定
				if (!msg2L.isEmpty()) {
					setErrFlg(msg2L);
					setGrpErrFlg();
					msgL.addAll(msg2L);
				}
				// 登録・訂正可能かチェック
				msgL.addAll(checkUpdatable(getChkList(up0()), dbcSplnFmtL));
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntr(){
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0(), MCRow.MODIFY);
			MCList<MST_SPLN_FMT_R> lockedL = getLockSplnFmt(notErrL, up1().file_imp_flg());
			MCIndexKey splnFmtDbcKey = lockedL.createIndex(MST_SPLN_FMT_R.$spln_fmt_no);
			for (Chk01_RsltR r : notErrL) {
				MST_SPLN_FMT_R selectR = lockedL.getFirst(splnFmtDbcKey, r.spln_fmt_no());
				if (!isNull(r.upd_cntr())) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					// 更新不可項目、更新前項目の補完
					r.dpt_cd(selectR.dpt_cd());
					r.cst_cd(selectR.cst_cd());
					r.wrk_no(selectR.wrk_no());
					r.spln_itm_cd(selectR.spln_itm_cd());
					r.itm_cd(selectR.itm_cd());
					r.itm_sub1(selectR.itm_sub1());
					r.itm_sub2(selectR.itm_sub2());
					r.itm_sub3(selectR.itm_sub3());
					r.old_st_ym(selectR.st_ym());
					r.old_end_ym(selectR.end_ym());
					r.old_cur_cd(selectR.cur_cd());
					r.old_cst_cd_unit_flg(selectR.cst_cd_unit_flg());
					r.old_wrk_no_unit_flg(selectR.wrk_no_unit_flg());
				}
			}
			return msgL;
		}
		/**
		 *  計画品目の有効期間チェック(販売計画品目構成マスタ)
		 */
		protected MCMessageList checkSplnItm() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			notErrL = notErrL.subList(r-> !isNullOrNullVal(r.spln_itm_cd()));
			if (isNull(notErrL)) {
				return msgL;
			}
			
			// 販売計画品目構成マスタ検索（計画単位＝計画品目）
			String[] keys = new String[] {
					Chk01_RsltR.$spln_itm_cd
			};
			MCList<MAM_SPLN_ITM_CONF_R> dbcItmConfL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			for (Chk01_RsltR r : notErrL.distinctNE(keys)) {
				MAM_SPLN_ITM_CONF_R dbcR = MAM_SPLN_ITM_CONF_R.create();
				dbcR.spln_itm_cd(r.spln_itm_cd());
				dbcItmConfL.add(dbcR);
			}
			MCQueryApiBuilder dbcItmConfL_bldr = MCQueryApiBuilder.create(MAM_SPLN_ITM_CONF_R.create("T"));
			dbWkDelete("MSBBL0130_MAW_SPLN_ITM_CONF_D01", dbcItmConfL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0130_MAW_SPLN_ITM_CONF_I01", dbcItmConfL, dbcItmConfL_bldr.getBaseDbc());
			dbcItmConfL.clear();
			executeQuery(dbcItmConfL, MSBBL0130_MAM_SPLN_ITM_CONF_S01());
			
			// 有効期間チェック
			FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cacheItmConf = crtGroupCache(dbcItmConfL,keys);
			for(Chk01_RsltR upR : notErrL) {
				checkItmConfStEndYm(msgL, upR, upR.st_ym(), upR.end_ym(), cacheItmConf, MSBBL0033, keys);
			}
			return msgL;
		}
		
		/**
		 * 品目の有効期間チェック(販売計画品目構成マスタ)
		 */
		protected MCMessageList checkItm() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			notErrL = notErrL.subList(r->!isNullOrNullVal(r.itm_cd()));
			if (isNull(notErrL)) {
				return msgL;
			}
			
			// 販売計画品目構成マスタ検索（計画単位＝品目）
			String[] keys = new String[] {
					Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3
			};
			MCList<MAM_SPLN_ITM_CONF_R> dbcItmConfL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			for (Chk01_RsltR r : notErrL.distinctNE(keys)) {
				MAM_SPLN_ITM_CONF_R dbcR = MAM_SPLN_ITM_CONF_R.create();
				dbcR.itm_cd(r.itm_cd());
				dbcR.itm_sub1(r.itm_sub1());
				dbcR.itm_sub2(r.itm_sub2());
				dbcR.itm_sub3(r.itm_sub3());
				dbcItmConfL.add(dbcR);
			}
			MCQueryApiBuilder dbcItmConfL_bldr = MCQueryApiBuilder.create(MAM_SPLN_ITM_CONF_R.create("T"));
			dbWkDelete("MSBBL0130_MAW_SPLN_ITM_CONF_D02", dbcItmConfL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0130_MAW_SPLN_ITM_CONF_I02", dbcItmConfL, dbcItmConfL_bldr.getBaseDbc());
			dbcItmConfL.clear();
			executeQuery(dbcItmConfL, MSBBL0130_MAM_SPLN_ITM_CONF_S02());
			
			// 有効期間チェック
			FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cacheItmConf = crtGroupCache(dbcItmConfL,keys);
			for(Chk01_RsltR upR : notErrL) {
				checkItmConfStEndYm(msgL, upR, upR.st_ym(), upR.end_ym(), cacheItmConf, MSBBL0034, keys);
			}
			return msgL;
		}

		protected void checkItmConfStEndYm(MCMessageList msgL, Chk01_RsltR upR, MCDate stYm,
				MCDate endYm, FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cacheItmConf,
				String msgId, String[] keys) {
			
			MCDate errStYm = null;
			MCDate errEndYm = null;
			boolean preErrFlg = false;
			
			for (MCDate ym = stYm; ym.lte(endYm); ym = ym.addMonth(1)) {
				boolean curErrFlg = true;
				MCList<MAM_SPLN_ITM_CONF_R> dbcL = cacheItmConf.getCache(getVals(keys, upR));
				if (!isNull(dbcL)) {
					for (MAM_SPLN_ITM_CONF_R dbcR : dbcL) {
						if (dbcR.st_ym().lte(ym) && ym.lte(dbcR.end_ym())) {
							curErrFlg = false;
							break;
						}
					}
				}
				// 今月：エラー
				if (curErrFlg) {
					// 前月⇒今月：エラー⇒エラー
					if (preErrFlg) {
						errEndYm = ym;
					}
					// 前月⇒今月：正常⇒エラー
					else {
						errStYm = ym;
						errEndYm = ym;
					}
				}
				// 前月⇒今月：エラー⇒正常、最後の年月でエラーの場合、メッセージを出力する
				if (preErrFlg && !curErrFlg || curErrFlg && isSame(ym, endYm)) {
					String dispItm = null;
					if (keys[0] == Chk01_RsltR.$itm_cd) {
						dispItm = toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
					}
					else {
						dispItm = upR.spln_itm_cd();
					}
					msgL.add(new MCMessage(upR, keys[0], msgId, dispItm,
							toYMString(errStYm), toYMString(errEndYm),
							toDispGUIIndex(upR)));
				}
				preErrFlg = curErrFlg;
			}
		}

		/**
		 * 営業部門の有効性チェック
		 */
		protected MCMessageList checkSlsDpt(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			// 部門マスタ検索
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbcDptL_bldr = MCQueryApiBuilder.create(t);
			dbcDptL_bldr.setSelect(t.dpt_cd);
			dbcDptL_bldr.addSelect(t.dpt_nm);
			dbcDptL_bldr.addSelect(t.sls_dpt_flg);
			dbcDptL_bldr.addSelect(t.st_dt);
			dbcDptL_bldr.addSelect(trunc(t.end_dt, MCDateFmt.MM).as("end_dt"));
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbcDptL_bldr, notErrL,
					new String[] {
					Chk01_RsltR.$dpt_cd
					});
			
			// 有効期間チェック
			for (Chk01_RsltR upR : notErrL) {
				if (upR.isStatusCreate()) {
					checkSlsDpt(msgL, upR, upR.st_ym(), upR.end_ym(), cacheDpt, true);
				}
				else if (upR.isStatusModify()){
					// 延長した期間のみチェック
					MCDate stYm = null;
					MCDate endYm = null;
					if (upR.st_ym().lt(upR.old_st_ym())) {
						if (upR.end_ym().gt(upR.old_end_ym())) {
							checkSlsDpt(msgL, upR, upR.st_ym(), upR.old_st_ym().addMonth(-1), cacheDpt, true);
							checkSlsDpt(msgL, upR, upR.old_end_ym().addMonth(1), upR.end_ym(), cacheDpt, false);
						}
						else {
							stYm = upR.st_ym();
							endYm = upR.end_ym().lt(upR.old_st_ym()) ? upR.end_ym() : upR.old_st_ym().addMonth(-1);
						}
					}
					else if (upR.end_ym().gt(upR.old_end_ym())) {
						stYm = upR.st_ym().gt(upR.old_end_ym()) ? upR.st_ym() : upR.old_end_ym().addMonth(1);
						endYm = upR.end_ym();
					}
					if (!isNullOr(stYm, endYm)) {
						checkSlsDpt(msgL, upR, stYm, endYm, cacheDpt, true);
					}
				}
			}
			return msgL;
		}
		
		protected void checkSlsDpt(MCMessageList msgL, Chk01_RsltR upR, MCDate stYm,
				MCDate endYm, FXUCL_MCDbcCacheStEnd<MAM_DPT_R> cacheDpt, boolean setNameFlg) {
			
			MCDate errStYm = null;
			MCDate errEndYm = null;
			boolean preErrFlg = false;
			
			for (MCDate ym = stYm; ym.lte(endYm); ym = ym.addMonth(1)) {
				MAM_DPT_R dbc = cacheDpt.get(getYmStDt(ym), upR.dpt_cd());
				boolean curErrFlg = !dbc.sls_dpt_flg();
				// 今月：エラー
				if (curErrFlg) {
					// 前月⇒今月：エラー⇒エラー
					if (preErrFlg) {
						errEndYm = ym;
					}
					// 前月⇒今月：正常⇒エラー
					else {
						errStYm = ym;
						errEndYm = ym;
					}
				}
				// 今月：正常
				else {
					// ファイル入力時に、販売開始年月で部門名を補完する
					if (setNameFlg && isSame(ym, stYm)) {
						upR.dpt_nm(dbc.dpt_nm());
						setNameFlg = false;
					}
				}
				// 前月⇒今月：エラー⇒正常、最後の年月でエラーの場合、メッセージを出力する
				if (preErrFlg && !curErrFlg || curErrFlg && isSame(ym, endYm)) {
					msgL.add(new MCMessage(upR, Chk01_RsltR.$dpt_cd, MSBBL0031, upR.dpt_cd(),
							toYMString(errStYm), toYMString(errEndYm),
							toDispGUIIndex(upR)));
				}
				preErrFlg = curErrFlg;
			}
		}

		/**
		 * 品目行の設定区分必須チェック
		 */
		protected MCMessageList checkSetTyp() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : up0()) {
				if (!isNullOrNullVal(r.itm_cd())) {
					msgL.addAll(check(r, new String[] {Chk01_RsltR.$spln_set_typ}, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * ＸＸ別集計ＦＬＧの補正
		 */
		protected void correctUnitFlg() {
			for (Chk01_RsltR r : up0()) {
				if (isNullOrNullVal(r.cst_cd())) {
					r.cst_cd_unit_flg(false);
				}
				if (isNullOrNullVal(r.wrk_no())) {
					r.wrk_no_unit_flg(false);
				}
			}
		}
		
		/**
		 * 販売構成項目補完
		 */
		protected void cmplSplnFmt(MCList<Chk01_RsltR> notErrL, MCList<MST_SPLN_FMT_R> dbcL) {
			String[] keys = new String[] {
					Chk01_RsltR.$dpt_cd,
					Chk01_RsltR.$cst_cd,
					Chk01_RsltR.$wrk_no,
					Chk01_RsltR.$spln_itm_cd,
					Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3,
					Chk01_RsltR.$st_ym};
			MCJoinKey<MCList<MST_SPLN_FMT_R>> jk = notErrL.join(keys, dbcL ,keys);
			join(notErrL, jk, createMap_Chk01_RsltR_MST_SPLN_FMT_R());
		}

		/**
		 * 適用期間の重複チェック
		 */
		protected MCMessageList checkYm(MCList<Chk01_RsltR> notErrL, MCList<MST_SPLN_FMT_R> dbcSplnFmtL) {
			MCMessageList msgL = new MCMessageList();

			// 販売計画構成データのキャッシュ化（構成キー項目単位）
			String[] keys = getFmtKeys();
			FXUCL_Cache<MCList<MST_SPLN_FMT_R>> cacheSplnFmt = crtGroupCache(dbcSplnFmtL, keys);
			
			// 期間重複チェック
			for(MCList<Chk01_RsltR> grpL : notErrL.groupList(keys)) {
				// 上り電文にないDBレコード
				MCList<MST_SPLN_FMT_R> dbL = cacheSplnFmt.getCache(getVals(keys, grpL.get(0)));
				
				// 期間重複チェック
				for (Chk01_RsltR r1 : grpL) {
					MCDate errStYm = null;
					MCDate errEndYm = null;
					boolean preErrFlg = false;
					MCDate stYm = r1.st_ym();
					MCDate endYm = r1.end_ym();
					
					for (MCDate ym = stYm; ym.lte(endYm); ym = ym.addMonth(1)) {
						boolean curErrFlg = false;
						
						// 上り電文同士の期間重複チェック
						for (Chk01_RsltR r2 : grpL) {
							if (r1 != r2) {
								if (r2.st_ym().lte(ym) && ym.lte(r2.end_ym())) {
									curErrFlg = true;
									break;
								}
							}
						}
						
						// 上り電文と上り電文にないDBレコードの期間重複チェック
						if (!curErrFlg && !isNull(dbL)) {
							for (MST_SPLN_FMT_R r2 : dbL) {
								if (r2.st_ym().lte(ym) && ym.lte(r2.end_ym())) {
									curErrFlg = true;
									break;
								}
							}
						}
						
						// 今月：エラー
						if (curErrFlg) {
							// 前月⇒今月：エラー⇒エラー
							if (preErrFlg) {
								errEndYm = ym;
							}
							// 前月⇒今月：正常⇒エラー
							else {
								errStYm = ym;
								errEndYm = ym;
							}
						}
						// 前月⇒今月：エラー⇒正常、最後の年月でエラーの場合、メッセージを出力する
						// メッセージ編集
						if (preErrFlg && !curErrFlg || curErrFlg && isSame(ym, endYm)) {
							msgL.add(new MCMessage(r1, Chk01_RsltR.$st_ym,
									MSBBL0035,
									r1.spln_itm_cd(),
									toDispItm(r1.itm_cd(), r1.itm_sub1(), r1.itm_sub2(), r1.itm_sub3()),
									toYMString(errStYm),
									toYMString(errEndYm),
									toDispGUIIndex(r1)));
						}
						preErrFlg = curErrFlg;
					}
				}
			}
			return msgL;
		}

		/**
		 * 設定区分の整合性チェック
		 */
		protected MCMessageList checkItmSetTyp(MCList<Chk01_RsltR> notErrL, MCList<MST_SPLN_FMT_R> dbcSplnFmtL) {
			MCMessageList msgL = new MCMessageList();

			// 販売計画構成・データキャッシュ化（部門・品目単位）
			String[] keys = new String[] {
					Chk01_RsltR.$dpt_cd,
					Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3};
			FXUCL_Cache<MCList<MST_SPLN_FMT_R>> cacheItmFmt = crtGroupCache(dbcSplnFmtL, keys);

			// 部門・品目単位で設定区分チェック
			for(MCList<Chk01_RsltR> upL : notErrL.groupList(keys)) {
				Chk01_RsltR r = upL.get(0);
				if (isNullOrNullVal(r.itm_cd())) {
					continue;
				}
				boolean amtFlg = false;
				boolean qtyFlg = false;
				// 上り電文レコード
				for (Chk01_RsltR upR : upL) {
					if (MAC_SPLN_SET_TYP.isAMT(upR.spln_set_typ())) {
						amtFlg = true;
					}
					else if (MAC_SPLN_SET_TYP.isQTY(upR.spln_set_typ())) {
						qtyFlg = true;
					}
				}
				// 上り電文にないDBレコード
				MCList<MST_SPLN_FMT_R> dbL = cacheItmFmt.getCache(getVals(keys, r));
				if (!isNull(dbL)) {
					for (MST_SPLN_FMT_R dbR : dbL) {
						if (MAC_SPLN_SET_TYP.isAMT(dbR.spln_set_typ())) {
							amtFlg = true;
						}
						else if (MAC_SPLN_SET_TYP.isQTY(dbR.spln_set_typ())) {
							qtyFlg = true;
						}
					}
				}
				if (amtFlg && qtyFlg) {
					for(Chk01_RsltR upR : upL) {
						msgL.add(new MCMessage(upR, Chk01_RsltR.$spln_set_typ,
								MSBBL0036,
								upR.dpt_cd(),
								toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
								toDispGUIIndex(upR)));
					}
				}
			}
			return msgL;
		}
		

		protected Map_Chk01_RsltR_MST_SPLN_FMT_R<Chk01_RsltR,MST_SPLN_FMT_R> createMap_Chk01_RsltR_MST_SPLN_FMT_R() {
			return new Map_Chk01_RsltR_MST_SPLN_FMT_R<Chk01_RsltR, MST_SPLN_FMT_R>();
		}
		public class Map_Chk01_RsltR_MST_SPLN_FMT_R<D extends Chk01_RsltR, S extends MST_SPLN_FMT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$spln_fmt_no, MST_SPLN_FMT_R.$spln_fmt_no);
				addColumnPathMap(Chk01_RsltR.$upd_cntr, MST_SPLN_FMT_R.$upd_cntr);
				addColumnPathMap(Chk01_RsltR.$old_st_ym, MST_SPLN_FMT_R.$st_ym);
				addColumnPathMap(Chk01_RsltR.$old_end_ym, MST_SPLN_FMT_R.$end_ym);
				addColumnPathMap(Chk01_RsltR.$old_cur_cd, MST_SPLN_FMT_R.$cur_cd);
				addColumnPathMap(Chk01_RsltR.$old_cst_cd_unit_flg, MST_SPLN_FMT_R.$cst_cd_unit_flg);
				addColumnPathMap(Chk01_RsltR.$old_wrk_no_unit_flg, MST_SPLN_FMT_R.$wrk_no_unit_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setStatus(MCRow.MODIFY);
			}
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBBL_MlySPlnFmtReg_MC_A.Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = {
					Chk02_RsltR.$dpt_cd, Chk02_RsltR.$spln_itm_cd, Chk02_RsltR.$itm_cd,
					Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3
			};
			setGrpErrFlgByKey(up0(), grpKeys, Chk02_RsltR.$err_flg);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntr());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			// 部門ＤＡＣチェック
			msgL.addAll(checkWritableDptCdDac(getChkList(up0()), Chk02_RsltR.$dpt_cd));
			
			// エラーＦＬＧ設定
			if (!msgL.isEmpty()) {
				setErrFlg(msgL);
				setGrpErrFlg();
			}
			// 全行エラーの場合、以下のチェックを行わない。ロック待ちをなるべく解消するため。
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (!isNull(notErrL)) {
				// 部門ロック
				lockByDpt(notErrL, Chk02_RsltR.$dpt_cd);
				
				// 構成データ検索
				MCList<MST_SPLN_FMT_R> dbcSplnFmtL = srchSplnFmt(notErrL);
				
				// 上り電文に存在するDBレコードの除外
				removeDbcInUp(notErrL, dbcSplnFmtL);
				
				// 取消可能かチェック
				msgL.addAll(checkDeletable(notErrL, dbcSplnFmtL));
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntr(){
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			MCList<MST_SPLN_FMT_R> lockedL = getLockSplnFmt(notErrL, false);
			MCIndexKey splnFmtDbcKey = lockedL.createIndex(MST_SPLN_FMT_R.$spln_fmt_no);
			for (Chk02_RsltR r : notErrL) {
				MST_SPLN_FMT_R selectR = lockedL.getFirst(splnFmtDbcKey, r.spln_fmt_no());
				if (!isNull(r.upd_cntr())) {
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					// 更新不可項目、更新前項目の補完
					r.dpt_cd(selectR.dpt_cd());
					r.cst_cd(selectR.cst_cd());
					r.wrk_no(selectR.wrk_no());
					r.spln_itm_cd(selectR.spln_itm_cd());
					r.itm_cd(selectR.itm_cd());
					r.itm_sub1(selectR.itm_sub1());
					r.itm_sub2(selectR.itm_sub2());
					r.itm_sub3(selectR.itm_sub3());
					r.cur_cd(selectR.cur_cd());
					r.st_ym(selectR.st_ym());
					r.end_ym(selectR.end_ym());
					r.cst_cd_unit_flg(selectR.cst_cd_unit_flg());
					r.wrk_no_unit_flg(selectR.wrk_no_unit_flg());
				}
			}
			return msgL;
		}

		/**
		 * 取消可能かチェック
		 */
		protected MCMessageList checkDeletable(MCList<Chk02_RsltR> notErrL, MCList<MST_SPLN_FMT_R> dbcSplnFmtL){
			MCList<Chk01_RsltR> upL = MCList.create(Chk01_RsltR.class);
			addAll(upL, notErrL, createMap_Chk01_RsltR_Chk02_RsltR());
			return checkUpdatable(upL, dbcSplnFmtL);
		}

		protected Map_Chk01_RsltR_Chk02_RsltR<Chk01_RsltR,Chk02_RsltR> createMap_Chk01_RsltR_Chk02_RsltR() {
			return new Map_Chk01_RsltR_Chk02_RsltR<Chk01_RsltR, Chk02_RsltR>();
		}

		public class Map_Chk01_RsltR_Chk02_RsltR<D extends Chk01_RsltR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(Chk01_RsltR.$spln_fmt_no, Chk02_RsltR.$spln_fmt_no);
				addColumnPathMap(Chk01_RsltR.$dpt_cd, Chk02_RsltR.$dpt_cd);
				addColumnPathMap(Chk01_RsltR.$cst_cd, Chk02_RsltR.$cst_cd);
				addColumnPathMap(Chk01_RsltR.$wrk_no, Chk02_RsltR.$wrk_no);
				addColumnPathMap(Chk01_RsltR.$spln_itm_cd, Chk02_RsltR.$spln_itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$cur_cd, Chk02_RsltR.$cur_cd);
				addColumnPathMap(Chk01_RsltR.$st_ym, Chk02_RsltR.$st_ym);
				addColumnPathMap(Chk01_RsltR.$end_ym, Chk02_RsltR.$end_ym);
				addColumnPathMap(Chk01_RsltR.$cst_cd_unit_flg, Chk02_RsltR.$cst_cd_unit_flg);
				addColumnPathMap(Chk01_RsltR.$wrk_no_unit_flg, Chk02_RsltR.$wrk_no_unit_flg);
				addColumnPathMap(Chk01_RsltR.$old_cur_cd, Chk02_RsltR.$cur_cd);
				addColumnPathMap(Chk01_RsltR.$old_st_ym, Chk02_RsltR.$st_ym);
				addColumnPathMap(Chk01_RsltR.$old_end_ym, Chk02_RsltR.$end_ym);
				addColumnPathMap(Chk01_RsltR.$old_cst_cd_unit_flg, Chk02_RsltR.$cst_cd_unit_flg);
				addColumnPathMap(Chk01_RsltR.$old_wrk_no_unit_flg, Chk02_RsltR.$wrk_no_unit_flg);
			}
			
			@Override
			public void copy(D dest, S src) {
				super.copy(dest, src);
				dest.setStatus(MCRow.DELETE);
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBBL_MlySPlnFmtReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 上り電文チェック
			checkUp();
			// 期間補正
			srptMain();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// NULL文字補完
			setNullVal();
		}

		/**
		 * 上り電文チェック
		 */
		protected void checkUp(){
			MCMessageList msgL = new MCMessageList();
			for(Srch01_RsltR upR: up0()) {
				msgL.addAll(check(upR, new String[] {Srch01_RsltR.$st_ym, Chk02_RsltR.$end_ym}, new FXUCL_BeforeAfterValidater()));
				msgL.addAll(check(upR, new String[] {Srch01_RsltR.$spln_itm_cd, Chk02_RsltR.$itm_cd}, new MAUDL_TooManyInputsValidater_NULL_VAL()));
				msgL.addAll(check(upR, new String[] {Srch01_RsltR.$spln_itm_cd, Chk02_RsltR.$itm_cd}, new MAUDL_AtLeastOneValidater_NULL_VAL()));
			}
			for (MCList<Srch01_RsltR> keyL: up0().groupList(getFmtKeys())) {
				for (MCList<Srch01_RsltR> dupL: keyL.groupList(Srch01_RsltR.$st_ym, Srch01_RsltR.$end_ym)) {
					if (dupL.size() > 1) {
						for (int i = 1; i < dupL.size(); i ++) {
							msgL.add(new MCMessage(dupL.get(i), Srch01_RsltR.$st_ym,
									MSBBL0181,
									toDispGUIIndex(dupL.get(i - 1)),
									toDispGUIIndex(dupL.get(i))));
						}
					}
				}
			}
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwErr(msgOpeErr());
			}
		}

		/**
		 * 適用期間補正
		 */
		protected void srptMain(){
			if(isNull(up0())) {
				return;
			}
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			correctRange(up0(), rsltL);
			setDown(rsltL);
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown(MCList<Srch01_RsltR> rsltL){
			down0().addAll(rsltL.subList(MCRow.CREATE));
			down0().addAll(rsltL.subList(MCRow.MODIFY));
			setConstNm(down0());
			setFuncNm(down0());
		}

		/**
		 * NULL文字補完
		 */
		protected void setNullVal() {
			for (Srch01_RsltR upR : up0()) {
				upR.cst_cd(nvl(upR.cst_cd(), MAC_STR.NULL_VAL.value()));
				upR.wrk_no(nvl(upR.wrk_no(), MAC_STR.NULL_VAL.value()));
				upR.spln_itm_cd(nvl(upR.spln_itm_cd(), MAC_STR.NULL_VAL.value()));
				upR.itm_cd(nvl(upR.itm_cd(), MAC_STR.NULL_VAL.value()));
				upR.itm_sub1(nvl(upR.itm_sub1(), MAC_STR.NULL_VAL.value()));
				upR.itm_sub2(nvl(upR.itm_sub2(), MAC_STR.NULL_VAL.value()));
				upR.itm_sub3(nvl(upR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		/**
		 * 適用期間重複補正処理
		 */
		protected void correctRange(MCList<Srch01_RsltR> upL, MCList<Srch01_RsltR> rsltL) {
			// 構成テーブルのデータを検索
			MCList<Srch01_RsltR> dbcL = srchSplnFmtDbData(upL);
			// 電文項目（名称）補完
			supplyNm(upL);
			//適用年月補正を行う
			correctStEndYM(upL, dbcL, rsltL);
		}

		/**
		 * 適用期間の補正を行う
		 */
		protected void correctStEndYM(MCList<Srch01_RsltR> upL, MCList<Srch01_RsltR> dbcL, MCList<Srch01_RsltR> rsltL) {

			// 補正対象リストを作成
			MCList<Srch01_RsltR> dbL = MCList.create(Srch01_RsltR.class);
			MCIndexKey idxKey = upL.createIndex(Srch01_RsltR.$spln_fmt_no);
			for (Srch01_RsltR dbcR: dbcL) {
				Srch01_RsltR r = upL.getFirst(idxKey, dbcR.spln_fmt_no());
				if (isNull(r)) {
					dbL.add(dbcR);
				}
				else {
					r.ins_usr_id(dbcR.ins_usr_id());
					r.ins_usr_nm(dbcR.ins_usr_nm());
					r.ins_func_id(dbcR.ins_func_id());
					r.ins_ts(dbcR.ins_ts());
					r.upd_cntr(dbcR.upd_cntr());
					r.upd_usr_id(dbcR.upd_usr_id());
					r.upd_usr_nm(dbcR.upd_usr_nm());
					r.upd_func_id(dbcR.upd_func_id());
					r.upd_ts(dbcR.upd_ts());
					r.upd_srv_req_no(dbcR.upd_srv_req_no());
				}
			}

			// 構成キー単位で年月の判断＆補正を行う。
			String[] fmtKeys = getFmtKeys();
			for (Srch01_RsltR keyR : upL.groupBy(fmtKeys)) {
				Comparable[] vals = getVals(fmtKeys, keyR);
				MCList<Srch01_RsltR> upSubL = upL.subList(fmtKeys, vals);

				MCList<Srch01_RsltR> upCrtL = upSubL.subList(MCRow.CREATE);
				MCList<Srch01_RsltR> upUpdL = upSubL.subList(MCRow.MODIFY);
				MCList<Srch01_RsltR> dbSubL = dbL.subList(fmtKeys, vals);
				// 新規入力行間の調整
				adjustPeriod(upCrtL, upCrtL);
				rsltL.addAll(upCrtL);
				// 新規入力行をもとに更新行を調整
				adjustPeriod(upUpdL, upCrtL);
				adjustPeriod(upUpdL, upUpdL);
				rsltL.addAll(upUpdL);
				// 調整済み行をもとにDBレコードを調整
				adjustPeriod(dbSubL, rsltL);
				adjustPeriod(dbSubL, dbSubL);
				rsltL.addAll(dbSubL.subList(MCRow.CREATE));
				rsltL.addAll(dbSubL.subList(MCRow.MODIFY));
			}
		}

		/**
		 * 開始／終了年月の調整、レコード分割、合併を行う。
		 */
		protected void adjustPeriod(MCList<Srch01_RsltR> targetL, MCList<Srch01_RsltR> causeL){
			if (isNull(targetL)) {
				return;
			}
			causeL.sort(Srch01_RsltR.$st_ym);
			// 調整元のcauseRowが変更された場合、再度調整を行う。
			boolean endLoopFlg = false;
			while(!endLoopFlg) {
				endLoopFlg = true;
				for (int mc = 0; mc < causeL.size(); mc++) {
					Srch01_RsltR cR = causeL.get(mc);
					if (cR.isStatusDelete()) {
						continue;
					}
					MCDate cStYm = cR.st_ym();
					MCDate cEdYm = cR.end_ym();

					MCList<Srch01_RsltR> tNewL = MCList.create(Srch01_RsltR.class);
					targetL.sort(Srch01_RsltR.$st_ym);
					for (int mt = 0; mt < targetL.size(); mt++) {
						Srch01_RsltR tR = targetL.get(mt);
						if (cR == tR) {
							continue;
						}
						MCDate tStYm = tR.st_ym();
						MCDate tEdYm = tR.end_ym();
						if (tEdYm.gt(cEdYm) && (tStYm.gte(cStYm) && tStYm.lte(cEdYm))) {
							if (isAdjCauseR(tR, cR) && tStYm.gt(cStYm)) {
								cR.end_ym(tStYm.addMonth(-1));
							}
							else {
								tR.st_ym(cEdYm.addMonth(1));
								if (tR.isStatusNone()) {
									tR.setAttributes(cR);
									tR.setStatus(MCRow.MODIFY);
								}
							}
						}
						else if (tStYm.lt(cStYm) && (tEdYm.gte(cStYm) && tEdYm.lte(cEdYm))) {
							tR.end_ym(cStYm.addMonth(-1));
							if (tR.isStatusNone()) {
								tR.setAttributes(cR);
								tR.setStatus(MCRow.MODIFY);
							}
						}
						else if (tStYm.lt(cStYm) && tEdYm.gt(cEdYm)) {
							if (isAdjCauseR(tR, cR)) {
								tR.end_ym(cStYm.addMonth(-1));
								cR.end_ym(tEdYm);
								endLoopFlg = false;
							}
							else {
								Srch01_RsltR newR = Srch01_RsltR.create();
								copy(newR, tR, createMap_Srch01_RsltR_Srch01_RsltR());
								newR.st_ym(cEdYm.addMonth(1));
								newR.setStatus(MCRow.CREATE);
								newR.setAttributes(tR.isStatusNone()?cR:tR);
								tNewL.add(newR);

								tR.end_ym(cStYm.addMonth(-1));
							}
							if (tR.isStatusNone()) {
								tR.setAttributes(cR);
								tR.setStatus(MCRow.MODIFY);
							}
						}
						else if (tStYm.gte(cStYm) && tEdYm.lte(cEdYm)) {
							if (isAdjCauseR(tR, cR) && tStYm.gt(cStYm)) {
								cR.end_ym(tStYm.addMonth(-1));
								tR.end_ym(cEdYm);
								endLoopFlg = false;
							}
							else {
								tR.st_ym(cStYm);
								tR.end_ym(cEdYm);
								cR.setStatus(MCRow.DELETE);
							}
							if (tR.isStatusNone()) {
								tR.setStatus(MCRow.MODIFY);
							}
						}
					}
					targetL.addAll(tNewL);
				}
			}
		}

		/**
		 * CauseRow調整可否判断
		 */
		protected boolean isAdjCauseR(Srch01_RsltR targetR, Srch01_RsltR causeR) {
			if (isSame(causeR.getStatus(), targetR.getStatus())) {
				return true;
			}
			if (causeR.isStatusCreate()) {
				return false;
			}
			return true;
		}

		/**
		 * 補正対象と同じ構成キーを持つ販売計画構成データを検索する
		 */
		protected MCList<Srch01_RsltR> srchSplnFmtDbData(MCList<Srch01_RsltR> srcL) {

			// 販売計画構成ワークテーブルに登録
			MCList<MSW_SPLN_FMT_R> dbcWL1 = MCList.create(MSW_SPLN_FMT_R.class);
			addAll(dbcWL1, srcL, createMap_MSW_SPLN_FMT_R_Srch01_RsltR());
			MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
			execDbWkDelete("MSBBL0130_MSW_SPLN_FMT_D01", S0);
			dbInsertEx("MSBBL0130_MSW_SPLN_FMT_I01", dbcWL1, MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));

			// 更新前データを検索
			MCRow cnd = MCRow.create();
			cnd.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			cnd.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			MCList<Srch01_RsltR> dbL = MCList.create(Srch01_RsltR.class);
			executeQuery(dbL, MSBBL0130_MST_SPLN_FMT_S04(), cnd);
			return dbL;
		}

		/**
		 * 電文項目名補完
		 */
		protected void supplyNm(MCList<Srch01_RsltR> upL) {
			MCList<Srch01_RsltR> dbL = MCList.create(Srch01_RsltR.class);
			MCRow con = MCRow.create();
			con.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			con.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			executeQuery(dbL, MSBBL0130_MSW_SPLN_FMT_S01(), con);
			String[] keys = getCurKeys();
			MCIndexKey idxKey = dbL.createIndex(keys);
			for (Srch01_RsltR r: upL) {
				Srch01_RsltR nmR = dbL.getFirst(idxKey, getVals(keys, r));
				if (!isNull(nmR)) {
					r.dpt_nm(nmR.dpt_nm());
					r.cst_nm(nmR.cst_nm());
					r.wrk_nm(nmR.wrk_nm());
					r.spln_itm_nm(nmR.spln_itm_nm());
					r.itm_nm(nmR.itm_nm());
					r.cur_nm(nmR.cur_nm());
				}
			}
		}
		
		/**
		 * 構成キー＋販売年月＋通貨ＣＤ
		 */
		protected String[] getCurKeys(){
			String[] keys = new String[]{
					MST_SPLN_FMT_R.$dpt_cd,
					MST_SPLN_FMT_R.$cst_cd,
					MST_SPLN_FMT_R.$wrk_no,
					MST_SPLN_FMT_R.$spln_itm_cd,
					MST_SPLN_FMT_R.$itm_cd,
					MST_SPLN_FMT_R.$itm_sub1,
					MST_SPLN_FMT_R.$itm_sub2,
					MST_SPLN_FMT_R.$itm_sub3,
					MST_SPLN_FMT_R.$st_ym,
					MST_SPLN_FMT_R.$cur_cd};
			return keys;
		}

		protected Map_MSW_SPLN_FMT_R_Srch01_RsltR<MSW_SPLN_FMT_R,Srch01_RsltR> createMap_MSW_SPLN_FMT_R_Srch01_RsltR() {
			return new Map_MSW_SPLN_FMT_R_Srch01_RsltR<MSW_SPLN_FMT_R, Srch01_RsltR>();
		}
		public class Map_MSW_SPLN_FMT_R_Srch01_RsltR<D extends MSW_SPLN_FMT_R, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_SPLN_FMT_R.$dpt_cd, Srch01_RsltR.$dpt_cd);
				addColumnPathMap(MSW_SPLN_FMT_R.$cst_cd, Srch01_RsltR.$cst_cd);
				addColumnPathMap(MSW_SPLN_FMT_R.$wrk_no, Srch01_RsltR.$wrk_no);
				addColumnPathMap(MSW_SPLN_FMT_R.$spln_itm_cd, Srch01_RsltR.$spln_itm_cd);
				addColumnPathMap(MSW_SPLN_FMT_R.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(MSW_SPLN_FMT_R.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(MSW_SPLN_FMT_R.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(MSW_SPLN_FMT_R.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(MSW_SPLN_FMT_R.$cur_cd, Srch01_RsltR.$cur_cd);
				addColumnPathMap(MSW_SPLN_FMT_R.$st_ym, Srch01_RsltR.$st_ym);
				addColumnPathMap(MSW_SPLN_FMT_R.$end_ym, Srch01_RsltR.$end_ym);
			}
		}
		
		protected Map_Srch01_RsltR_Srch01_RsltR<Srch01_RsltR,Srch01_RsltR> createMap_Srch01_RsltR_Srch01_RsltR() {
			return new Map_Srch01_RsltR_Srch01_RsltR<Srch01_RsltR, Srch01_RsltR>();
		}
		public class Map_Srch01_RsltR_Srch01_RsltR<D extends Srch01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$st_ym, Srch01_RsltR.$st_ym);
				addColumnPathMap(Srch01_RsltR.$end_ym, Srch01_RsltR.$end_ym);
				addColumnPathMap(Srch01_RsltR.$dpt_cd, Srch01_RsltR.$dpt_cd);
				addColumnPathMap(Srch01_RsltR.$dpt_nm, Srch01_RsltR.$dpt_nm);
				addColumnPathMap(Srch01_RsltR.$cst_cd, Srch01_RsltR.$cst_cd);
				addColumnPathMap(Srch01_RsltR.$cst_nm, Srch01_RsltR.$cst_nm);
				addColumnPathMap(Srch01_RsltR.$wrk_no, Srch01_RsltR.$wrk_no);
				addColumnPathMap(Srch01_RsltR.$wrk_nm, Srch01_RsltR.$wrk_nm);
				addColumnPathMap(Srch01_RsltR.$spln_itm_cd, Srch01_RsltR.$spln_itm_cd);
				addColumnPathMap(Srch01_RsltR.$spln_itm_nm, Srch01_RsltR.$spln_itm_nm);
				addColumnPathMap(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(Srch01_RsltR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(Srch01_RsltR.$itm_nm, Srch01_RsltR.$itm_nm);
				addColumnPathMap(Srch01_RsltR.$cur_cd, Srch01_RsltR.$cur_cd);
				addColumnPathMap(Srch01_RsltR.$cur_nm, Srch01_RsltR.$cur_nm);
				addColumnPathMap(Srch01_RsltR.$spln_set_typ, Srch01_RsltR.$spln_set_typ);
				addColumnPathMap(Srch01_RsltR.$spln_set_typ_nm, Srch01_RsltR.$spln_set_typ_nm);
				addColumnPathMap(Srch01_RsltR.$cst_cd_unit_flg, Srch01_RsltR.$cst_cd_unit_flg);
				addColumnPathMap(Srch01_RsltR.$wrk_no_unit_flg, Srch01_RsltR.$wrk_no_unit_flg);
				addColumnPathMap(Srch01_RsltR.$disp_seq, Srch01_RsltR.$disp_seq);
				addColumnPathMap(Srch01_RsltR.$intr_rmrks, Srch01_RsltR.$intr_rmrks);
				addColumnPathMap(Srch01_RsltR.$sub_char1, Srch01_RsltR.$sub_char1);
				addColumnPathMap(Srch01_RsltR.$sub_char2, Srch01_RsltR.$sub_char2);
				addColumnPathMap(Srch01_RsltR.$sub_char3, Srch01_RsltR.$sub_char3);
			}
		}

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 */
	public class Imp01 extends MSBBL_MlySPlnFmtReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			editUp();
			callThisChk01();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBBL_MlySPlnFmtReg.Chk01 ope = MSBBL_MlySPlnFmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount(), Chk01_RsltR.$dpt_cd);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = (MCList<Chk01_RsltR>)ope.up(0);
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBBL_MlySPlnFmtReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 更新前チェック
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				// 登録処理
				regSplnFmt(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBBL_MlySPlnFmtReg.Chk01 ope = MSBBL_MlySPlnFmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 販売計画構成登録
		 *
		 * @param notErrL
		 */
		protected void regSplnFmt(MCList<Chk01_RsltR> notErrL){
			updSplnFmt(notErrL);
			insSplnFmt(notErrL);
		}

		/**
		 * テーブル登録処理
		 *
		 * @param notErrL
		 */
		protected void insSplnFmt(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> insL = notErrL.subList(MCRow.CREATE);
			if (isNull(insL)) {
				return;
			}
			MCList<MST_SPLN_FMT_R> dbcL = MCList.create(MST_SPLN_FMT_R.class);
			addAll(dbcL, insL, createMap_MST_SPLN_FMT_R_Chk01_RsltR());

			doSeqCache(MSC_NUM_SYS_TYP.SPLNFMT, dbcL.size());
			for (MST_SPLN_FMT_R r: dbcL){
				r.spln_fmt_no(getStrSeq(MSC_NUM_SYS_TYP.SPLNFMT));
				if (!isNullOrNullVal(r.spln_itm_cd())) {
					r.spln_set_typ(null);
				}
			}
			dbInsertEx("MSBBL0130_MST_SPLN_FMT_I01", dbcL, MCQueryApiBuilder.create(MST_SPLN_FMT_R.create("T")));
		}

		/**
		 * テーブル更新処理
		 *
		 * @param notErrL
		 */
		protected void updSplnFmt(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> updL = notErrL.subList(MCRow.MODIFY);
			if (isNull(updL)) {
				return;
			}
			MCList<MST_SPLN_FMT_R> dbcL = MCList.create(MST_SPLN_FMT_R.class);
			addAll(dbcL, updL, createMap_MST_SPLN_FMT_R_Chk01_RsltR());
			for (MST_SPLN_FMT_R r: dbcL){
				if (!isNullOrNullVal(r.spln_itm_cd())) {
					r.spln_set_typ(null);
				}
			}
			dbUpdateKey("MSBBL0130_MST_SPLN_FMT_U01", dbcL, MCQueryApiBuilder.create(MST_SPLN_FMT_R.create("T")));
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount(), Chk01_RsltR.$dpt_cd);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = (MCList<Chk01_RsltR>)ope.up(0);
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected Map_MST_SPLN_FMT_R_Chk01_RsltR<MST_SPLN_FMT_R,Chk01_RsltR> createMap_MST_SPLN_FMT_R_Chk01_RsltR() {
			return new Map_MST_SPLN_FMT_R_Chk01_RsltR<MST_SPLN_FMT_R, Chk01_RsltR>();
		}
		public class Map_MST_SPLN_FMT_R_Chk01_RsltR<D extends MST_SPLN_FMT_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_FMT_R.$spln_fmt_no, Chk01_RsltR.$spln_fmt_no);
				addColumnPathMap(MST_SPLN_FMT_R.$dpt_cd, Chk01_RsltR.$dpt_cd);
				addColumnPathMap(MST_SPLN_FMT_R.$cst_cd, Chk01_RsltR.$cst_cd);
				addColumnPathMap(MST_SPLN_FMT_R.$wrk_no, Chk01_RsltR.$wrk_no);
				addColumnPathMap(MST_SPLN_FMT_R.$spln_itm_cd, Chk01_RsltR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_FMT_R.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_SPLN_FMT_R.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_SPLN_FMT_R.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_SPLN_FMT_R.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_SPLN_FMT_R.$cur_cd, Chk01_RsltR.$cur_cd);
				addColumnPathMap(MST_SPLN_FMT_R.$spln_set_typ, Chk01_RsltR.$spln_set_typ);
				addColumnPathMap(MST_SPLN_FMT_R.$cst_cd_unit_flg, Chk01_RsltR.$cst_cd_unit_flg);
				addColumnPathMap(MST_SPLN_FMT_R.$wrk_no_unit_flg, Chk01_RsltR.$wrk_no_unit_flg);
				addColumnPathMap(MST_SPLN_FMT_R.$disp_seq, Chk01_RsltR.$disp_seq);
				addColumnPathMap(MST_SPLN_FMT_R.$st_ym, Chk01_RsltR.$st_ym);
				addColumnPathMap(MST_SPLN_FMT_R.$end_ym, Chk01_RsltR.$end_ym);
				addColumnPathMap(MST_SPLN_FMT_R.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_SPLN_FMT_R.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_SPLN_FMT_R.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_SPLN_FMT_R.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(MST_SPLN_FMT_R.$upd_cntr, Chk01_RsltR.$upd_cntr);
			}
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBBL_MlySPlnFmtReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				delSplnFmt(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk02_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 取消前チェック
		 */
		protected void callThisChk02() {
			MSBBL_MlySPlnFmtReg.Chk02 ope = MSBBL_MlySPlnFmtReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 販売計画構成取消
		 */
		protected void delSplnFmt(MCList<Chk02_RsltR> notErrL){
			MST_SPLN_FMT_R t = MST_SPLN_FMT_R.create("T");
			execDbDeleteKey("MSBBL0130_MST_SPLN_FMT_D01", t, notErrL);
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount(), Chk02_RsltR.$dpt_cd);
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = (MCList<Chk02_RsltR>)ope.up(0);
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

	}

	// -------共通処理：Chk01/Chk02--------------------------
	/**
	 * 販売計画ロック
	 */
	protected void lockByDpt(MCList<?> upL, String dptCol){
		MCList<?> dptL = upL.distinctNE(dptCol);
		if (isNull(dptL)) {
			return;
		}
		MCList<MST_SPLN_LOCK_R> lockL = MCList.create(MST_SPLN_LOCK_R.class);
		for (MCRow dptR : dptL){
			String  dptCd = dptR.getString(dptCol);
			if (!isNull(dptCd)) {
				MST_SPLN_LOCK_R r = MST_SPLN_LOCK_R.create();
				r.dpt_cd(dptCd);
				lockL.add(r);
			}
		}
		
		MCDBTransaction curTran = dbTran();
		try {
			createDBTran();
			MCList<MST_SPLN_LOCK_R> insL = tryLock(lockL);
			if (!isNull(insL)) {
				// 販売計画ロックテーブルのレコードが存在しなかった場合、レコード追加後に再度ロックする
				try {
					dbInsertEx("MSBBL0130_MST_SPLN_LOCK_I01", insL, MCQueryApiBuilder.create(MST_SPLN_LOCK_R.create("T")));
					dbTran().commit();
				}
				catch(MCException e) {
					// 同時に登録した場合は1度だけ再度ロックを試みる
					if (isSame(FXUDL0010, e.getID())) {
						dbTran().rollback();
					}
					else {
						throw e;
					}
				}
				insL = tryLock(lockL);
				if (!isNull(insL)) {
					throw new MCAppException("FCBCC0110");
				}
			}
		}
		finally {
			setCurrentDBTran(curTran);
		}
	}

	/**
	 * 販売計画ロックテーブル登録
	 */
	protected MCList<MST_SPLN_LOCK_R> tryLock(MCList<MST_SPLN_LOCK_R>  lockL) {
		MCList<MST_SPLN_LOCK_R> insL = MCList.create(MST_SPLN_LOCK_R.class);

		lockL.sort(MST_SPLN_LOCK_R.$dpt_cd);
		MCList<MST_SPLN_LOCK_R> dbcL = MCList.create(MST_SPLN_LOCK_R.class);
		MST_SPLN_LOCK_R t = MST_SPLN_LOCK_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.dpt_cd);
		dbcL_bldr.setWhere(t.dpt_cd.eq(bind("dpt_cd")));
		dbcL_bldr.setOrderByAsc(t.dpt_cd);
		dbSelectForUpdate("MSBBL0130_MST_SPLN_LOCK_S01", dbcL, dbcL_bldr, lockL);

		if (dbcL.size() != lockL.size()) {
			for (MST_SPLN_LOCK_R r: lockL) {
				if (isNull(dbcL.getFirst(MST_SPLN_LOCK_R.$dpt_cd, r.dpt_cd()))) {
					MST_SPLN_LOCK_R insR = MST_SPLN_LOCK_R.create();
					insR.dpt_cd(r.dpt_cd());
					insL.add(insR) ;
				}
			}
		}
		return insL;
	}

	/**
	 * 販売計画構成ロック取得
	 */
	protected MCList<MST_SPLN_FMT_R> getLockSplnFmt(MCList<?> upL, boolean file_imp_flg){
		MCList<MST_SPLN_FMT_R> splnFmtdbcL = MCList.create(MST_SPLN_FMT_R.class);
		MST_SPLN_FMT_R t = MST_SPLN_FMT_R.create("T");
		MCQueryApiBuilder splnFmtdbcL_bldr = MCQueryApiBuilder.create(t);
		upL.sort(MST_SPLN_FMT_R.$spln_fmt_no);
		splnFmtdbcL_bldr.setSelect(t.spln_fmt_no);
		splnFmtdbcL_bldr.addSelect(t.upd_cntr);
		splnFmtdbcL_bldr.addSelect(t.dpt_cd);
		splnFmtdbcL_bldr.addSelect(t.cst_cd);
		splnFmtdbcL_bldr.addSelect(t.wrk_no);
		splnFmtdbcL_bldr.addSelect(t.spln_itm_cd);
		splnFmtdbcL_bldr.addSelect(t.itm_cd);
		splnFmtdbcL_bldr.addSelect(t.itm_sub1);
		splnFmtdbcL_bldr.addSelect(t.itm_sub2);
		splnFmtdbcL_bldr.addSelect(t.itm_sub3);
		splnFmtdbcL_bldr.addSelect(t.st_ym);
		splnFmtdbcL_bldr.addSelect(t.end_ym);
		splnFmtdbcL_bldr.addSelect(t.cur_cd);
		splnFmtdbcL_bldr.addSelect(t.cst_cd_unit_flg);
		splnFmtdbcL_bldr.addSelect(t.wrk_no_unit_flg);
		splnFmtdbcL_bldr.setOrderByAsc(splnFmtdbcL_bldr.getBaseDbc().getKeyColumn$());
		if (file_imp_flg) {
			dbSelectKey("MSBBL0130_MST_SPLN_FMT_S01", splnFmtdbcL, splnFmtdbcL_bldr, upL);
		}
		else {
			dbSelectKeyForUpdateNoWait("MSBBL0130_MST_SPLN_FMT_S02", splnFmtdbcL, splnFmtdbcL_bldr, upL);
		}
		return splnFmtdbcL;
	}

	/**
	 * 販売計画構成データ検索
	 */
	protected MCList<MST_SPLN_FMT_R> srchSplnFmt(MCList<?> notErrL) {
		String[] keys = new String[]{
				MSW_SPLN_FMT_R.$dpt_cd,
				MSW_SPLN_FMT_R.$spln_itm_cd,
				MSW_SPLN_FMT_R.$itm_cd,
				MSW_SPLN_FMT_R.$itm_sub1,
				MSW_SPLN_FMT_R.$itm_sub2,
				MSW_SPLN_FMT_R.$itm_sub3};
		
		MCList<MSW_SPLN_FMT_R> dbcWkL = MCList.create(MSW_SPLN_FMT_R.class);
		for (MCRow r : notErrL.distinctNE(keys)) {
			MSW_SPLN_FMT_R dbcR = MSW_SPLN_FMT_R.create();
			for (String key : keys) {
				dbcR.setValue(key, r.getValue(key));
			}
			dbcR.cst_cd(MAC_STR.NULL_VAL.value());
			dbcR.wrk_no(MAC_STR.NULL_VAL.value());
			dbcR.cur_cd(MAC_STR.NULL_VAL.value());
			dbcWkL.add(dbcR);
		}
		MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
		MCDelete q = sql("MSBBL0130_MSW_SPLN_FMT_D02").delete(S0);
		q.executeUpdate();
		dbInsertEx("MSBBL0130_MSW_SPLN_FMT_I02", dbcWkL, MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
		MCList<MST_SPLN_FMT_R> dbcSplnFmtL = MCList.create(MST_SPLN_FMT_R.class);
		executeQuery(dbcSplnFmtL, MSBBL0130_MST_SPLN_FMT_S02());
		q.executeUpdate();
		return dbcSplnFmtL;
	}
	
	/**
	 * 上り電文に存在するDBレコードの除外<br>
	 * 整合性チェックでは、上り電文にないレコードのみが必要。更新前の値は、上り電文のold_xxx項目にコピー済。
	 */
	protected void removeDbcInUp(MCList<?> notErrL, MCList<MST_SPLN_FMT_R> dbcSplnFmtL){
		if (isNull(dbcSplnFmtL)) {
			return ;
		}
		MCIndexKey idxkey = notErrL.createIndex(MST_SPLN_FMT_R.$spln_fmt_no);
		MCList<MST_SPLN_FMT_R> newL = dbcSplnFmtL.subList(r->!notErrL.contains(idxkey, r.spln_fmt_no()));
		dbcSplnFmtL.setAll(newL);
	}

	protected MCMessageList checkUpdatable(MCList<Chk01_RsltR> notErrL, MCList<MST_SPLN_FMT_R> dbcSplnFmtL) {
		MCMessageList msgL = new MCMessageList();
		if (isNull(notErrL)) {
			return msgL;
		}
		
		// 販売計画構成・データキャッシュ化（部門・計画品目・品目単位）
		String[] keys = new String[] {
				Chk01_RsltR.$dpt_cd,
				Chk01_RsltR.$spln_itm_cd,
				Chk01_RsltR.$itm_cd,
				Chk01_RsltR.$itm_sub1,
				Chk01_RsltR.$itm_sub2,
				Chk01_RsltR.$itm_sub3};
		FXUCL_Cache<MCList<MST_SPLN_FMT_R>> cacheItmFmt = crtGroupCache(dbcSplnFmtL, keys);
		
		// 削除対象となったキーと期間の一覧を作成する
		MCList<MSW_SPLN_FMT_R> chkUsrL = MCList.create(MSW_SPLN_FMT_R.class);
		MCList<MSW_SPLN_FMT_R> chkSumL = MCList.create(MSW_SPLN_FMT_R.class);
		
		for (MCList<Chk01_RsltR> grpL : notErrL.groupList(keys)) {
			for (Chk01_RsltR r : grpL) {
				if (r.isStatusModify()) {
					// 入力フォームのキーと期間に関する項目が入力不可となる方向に変更された場合
					if (!isSame(r.cur_cd(), r.old_cur_cd())
							|| r.cst_cd_unit_flg() != r.old_cst_cd_unit_flg()
							|| r.wrk_no_unit_flg() != r.old_wrk_no_unit_flg()
							|| r.st_ym().gt(r.old_st_ym()) || r.end_ym().lt(r.old_end_ym())) {
						MCList<MST_SPLN_FMT_R> dbcL = cacheItmFmt.getCache(getVals(keys, r));
						checkUpdatable(r, r.old_st_ym(), r.old_end_ym(), true, grpL, dbcL, chkUsrL);
						checkUpdatable(r, r.old_st_ym(), r.old_end_ym(), false, grpL, dbcL, chkSumL);
					}
				}
				else if (r.isStatusDelete()) {
					MCList<MST_SPLN_FMT_R> dbcL = cacheItmFmt.getCache(getVals(keys, r));
					checkUpdatable(r, r.old_st_ym(), r.old_end_ym(), true, grpL, dbcL, chkUsrL);
					checkUpdatable(r, r.old_st_ym(), r.old_end_ym(), false, grpL, dbcL, chkSumL);
				}
			}
		}
		
		// 削除対象となったキーと期間に対して、販売計画が登録済みか否かチェックする
		checkUpdatable(msgL, chkUsrL, true);
		checkUpdatable(msgL, chkSumL, false);
		
		return msgL;
	}
	
	protected void checkUpdatable(Chk01_RsltR r1, MCDate stYm, MCDate endYm, boolean usrFlg,
			MCList<Chk01_RsltR> upL, MCList<MST_SPLN_FMT_R> dbcL, MCList<MSW_SPLN_FMT_R> chkErrL) {
		String cstCd = (usrFlg || r1.old_cst_cd_unit_flg()) ? r1.cst_cd() : MAC_STR.NULL_VAL.value();
		String wrkNo = (usrFlg || r1.old_wrk_no_unit_flg()) ? r1.wrk_no() : MAC_STR.NULL_VAL.value();
		MCList<Chk01_RsltR> chkUpL = upL.subList(r2 -> isSame(r1.old_cur_cd(), r2.cur_cd())
				&& isSame(cstCd, (usrFlg || r2.cst_cd_unit_flg()) ? r2.cst_cd() : MAC_STR.NULL_VAL.value())
				&& isSame(wrkNo, (usrFlg || r2.wrk_no_unit_flg()) ? r2.wrk_no() : MAC_STR.NULL_VAL.value()));
		if (!isNull(dbcL)) {
			dbcL = dbcL.subList(r2 -> isSame(r1.old_cur_cd(), r2.cur_cd())
					&& isSame(cstCd, (usrFlg || r2.cst_cd_unit_flg()) ? r2.cst_cd() : MAC_STR.NULL_VAL.value())
					&& isSame(wrkNo, (usrFlg || r2.wrk_no_unit_flg()) ? r2.wrk_no() : MAC_STR.NULL_VAL.value())
					);
		}
		
		MCDate errStYm = null;
		MCDate errEndYm = null;
		boolean preErrFlg = false;
		
		for (MCDate ym = stYm; ym.lte(endYm); ym = ym.addMonth(1)) {
			boolean curErrFlg = true;
			for (Chk01_RsltR r2 : chkUpL) {
				if (r2.isStatusDelete()) {
					continue;
				}
				if (r2.st_ym().lte(ym) && ym.lte(r2.end_ym())) {
					curErrFlg = false;
					break;
				}
			}
			if (!isNull(dbcL)) {
				for (MST_SPLN_FMT_R r2 : dbcL) {
					if (r2.st_ym().lte(ym) && ym.lte(r2.end_ym())) {
						curErrFlg = false;
						break;
					}
				}
			}
			
			// 今月：エラー
			if (curErrFlg) {
				// 前月⇒今月：エラー⇒エラー
				if (preErrFlg) {
					errEndYm = ym;
				}
				// 前月⇒今月：正常⇒エラー
				else {
					errStYm = ym;
					errEndYm = ym;
				}
			}
			// 前月⇒今月：エラー⇒正常、最後の年月でエラーの場合、メッセージを出力する
			if (preErrFlg && !curErrFlg || curErrFlg && isSame(ym, endYm)) {
				MSW_SPLN_FMT_R tmpR = MSW_SPLN_FMT_R.create();
				tmpR.dpt_cd(r1.dpt_cd());
				tmpR.cst_cd(cstCd);
				tmpR.wrk_no(wrkNo);
				tmpR.spln_itm_cd(r1.spln_itm_cd());
				tmpR.itm_cd(r1.itm_cd());
				tmpR.itm_sub1(r1.itm_sub1());
				tmpR.itm_sub2(r1.itm_sub2());
				tmpR.itm_sub3(r1.itm_sub3());
				tmpR.cur_cd(r1.old_cur_cd());
				tmpR.st_ym(errStYm);
				tmpR.end_ym(errEndYm);
				tmpR.setAttributes(r1);
				chkErrL.add(tmpR);
			}
			preErrFlg = curErrFlg;
		}
	}
	
	protected void checkUpdatable(MCMessageList msgL, MCList<MSW_SPLN_FMT_R> chkL, boolean usrFlg) {
		if (isNull(chkL)) {
			return ;
		}
		
		MCQueryPlan sqlId = usrFlg ? MSBBL0130_MST_SPLN_USR_DTL_S01() : MSBBL0130_MST_SPLN_SUM_DTL_S01();
		String msgId = usrFlg ? MSBBL0021 : MSBBL0022;
		
		MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
		MCDelete q = sql("MSBBL0130_MSW_SPLN_FMT_D03").delete(S0);
		q.executeUpdate();
		dbInsertEx("MSBBL0130_MSW_SPLN_FMT_I03", chkL, MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
		MCList<MSW_SPLN_FMT_R> dtlL = MCList.create(MSW_SPLN_FMT_R.class);
		executeQuery(dtlL, sqlId);
		if (isNull(dtlL)) {
			return ;
		}
		
		String[] wkkeys = {
				MSW_SPLN_FMT_R.$dpt_cd,
				MSW_SPLN_FMT_R.$cst_cd,
				MSW_SPLN_FMT_R.$wrk_no,
				MSW_SPLN_FMT_R.$spln_itm_cd,
				MSW_SPLN_FMT_R.$itm_cd,
				MSW_SPLN_FMT_R.$itm_sub1,
				MSW_SPLN_FMT_R.$itm_sub2,
				MSW_SPLN_FMT_R.$itm_sub3,
				MSW_SPLN_FMT_R.$cur_cd,
		};
		FXUCL_Cache<MCList<MSW_SPLN_FMT_R>> cacheDtl = crtGroupCache(dtlL, wkkeys);
		for (MSW_SPLN_FMT_R chkR : chkL) {
			MCList<MSW_SPLN_FMT_R> dbL = cacheDtl.getCache(getVals(wkkeys, chkR));
			if (isNull(dbL)) {
				continue;
			}
			MCDate errStYm = null;
			MCDate errEndYm = null;
			dbL.sort(MSW_SPLN_FMT_R.$st_ym);
			for (MSW_SPLN_FMT_R dbR : dbL) {
				MCDate ym = dbR.st_ym();
				if (chkR.st_ym().lte(ym) && ym.lte(chkR.end_ym())) {
					if (isNull(errStYm)) {
						errStYm = ym;
					}
					errEndYm = ym;
				}
			}
			if (!isNull(errStYm)) {
				msgL.add(new MCMessage(chkR, Chk01_RsltR.$st_ym,
						msgId,
						chkR.dpt_cd(),
						chkR.cst_cd(),
						chkR.wrk_no(),
						chkR.spln_itm_cd(),
						toDispItm(chkR.itm_cd(),chkR.itm_sub1(),chkR.itm_sub2(),chkR.itm_sub3()),
						toYMString(errStYm),
						toYMString(errEndYm),
						toDispGUIIndex(chkR)));
			}
		}
	}

	protected <T extends MCRow> FXUCL_Cache<MCList<T>> crtGroupCache(MCList<T> dbcL, String[] keys) {
		FXUCL_Cache<MCList<T>> cache = new FXUCL_Cache<>();
		cache.setFixMaxCacheSize(-1);
		for(MCList<T> grpL : dbcL.groupList(keys)) {
			cache.putCache(getVals(keys, grpL.get(0)), grpL);
		}
		return cache;
	}
	
	/**
	 * 構成キー
	 */
	protected String[] getFmtKeys(){
		String[] keys = new String[]{
				MST_SPLN_FMT_R.$dpt_cd,
				MST_SPLN_FMT_R.$cst_cd,
				MST_SPLN_FMT_R.$wrk_no,
				MST_SPLN_FMT_R.$spln_itm_cd,
				MST_SPLN_FMT_R.$itm_cd,
				MST_SPLN_FMT_R.$itm_sub1,
				MST_SPLN_FMT_R.$itm_sub2,
				MST_SPLN_FMT_R.$itm_sub3};
		return keys;
	}

	//-----------------------共通メソッド--------------------------
	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	protected <R extends MCRow> void handleSuccess(MCList<R> l) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBooleanNE(Chk01_RsltR.$err_flg)) {
				r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected <R extends MCRow> void handleEx(Exception e, MCList<R> l) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 *	上り電文行が、同じグループごとにMCListに格納されるように分割する
	 * @param upL クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @param grpCols グループ化カラム
	 */
	protected <T extends MCRow> List<MCList<T>> splitUp(MCList<T> upL, int max, String... grpCols) {
		List<MCList<T>> ret = new ArrayList<>();

		MCList<T>[] grpL = upL.groupList(grpCols);
		MCList<T> tmp = upL.createInstance();
		for (MCList<T> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = upL.createInstance();
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	//FMCB CUSTOM END
}