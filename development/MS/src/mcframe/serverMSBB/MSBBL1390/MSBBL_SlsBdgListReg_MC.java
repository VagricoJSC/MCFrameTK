package mcframe.serverMSBB.MSBBL1390;

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
import mcframe.serverMSBB.MSBBL1390.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL1390.Query.*;
import mcframe.commonCore.param.MCParam;
import mcframe.commonMA.meta.MA_META;
import java.util.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsBdgListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsBdgListReg_MC extends MSBBL_SlsBdgListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 販売予算情報を検索する<br>
	 */
	public class Srch01 extends MSBBL_SlsBdgListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			MCQueryPlan sql = MSBBL1390_MST_SLS_BDG_S01();
			searchForDL(sql, up0(), down0());

		}

		protected void editCnd() {
			// 集計
			up0().setStringNE("wk_not_sum_flg_str", null);
			if (up0().sum_flg() && !up0().not_sum_flg()) {
				up0().setStringNE("wk_not_sum_flg_str",
						MCBooleanUtil.booleanToDBString(false));
			}
			else if (!up0().sum_flg() && up0().not_sum_flg()) {
				up0().setStringNE("wk_not_sum_flg_str",
						MCBooleanUtil.booleanToDBString(true));
			}
			// 品目体系集計
			up0().setStringNE("wk_sls_itm_grp_not_sum_flg_str", null);
			if (up0().sls_itm_grp_sum_flg() && !up0().sls_itm_grp_not_sum_flg()) {
				up0().setStringNE("wk_sls_itm_grp_not_sum_flg_str",
						MCBooleanUtil.booleanToDBString(false));
			}
			else if (!up0().sls_itm_grp_sum_flg() && up0().sls_itm_grp_not_sum_flg()) {
				up0().setStringNE("wk_sls_itm_grp_not_sum_flg_str",
						MCBooleanUtil.booleanToDBString(true));
			}
			return;
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			MCList<Srch01_DtlR> ret = MCList.create(Srch01_DtlR.class);
			for (Srch01_DtlR r : down0()) {
				// 各メッシュのチェック
				if (!chkMesh(r)) {
					continue;
				}
				ret.add(r);
			}
			down0().setAll(ret);
		}

		/**
		 * メッシュの検索条件により対象外となるレコードを省く。<BR>
		 * メッシュの検索条件に指定された項目に値があるレコードが検索結果となる。<BR>
		 * メッシュ検索を行わない場合は全件を検索結果とする。
		 * @param r 
		 * @return 該当レコードを検索結果とする場合、true、検索結果から省く対象の場合false
		 */
		protected boolean chkMesh(Srch01_DtlR r) {

			if (!up0().mesh_srch_flg()) {
				return true;
			}

			if (!chkMesh(up0().mesh_sls_dpt_flg(), r.not_sum_flg(), r.sls_dpt_cd())) {
				return false;
			}

			if (!chkMesh(up0().mesh_sls_itm_grp_flg(), r.not_sum_flg(), r.sls_itm_grp_cd())) {
				return false;
			}

			if (!chkMesh(up0().mesh_cst_flg(), r.not_sum_flg(), r.cst_cd())) {
				return false;
			}

			if (!chkMesh(up0().mesh_sls_usr_flg(), r.not_sum_flg(), r.sls_usr_cd())) {
				return false;
			}

			if (!chkMesh(up0().mesh_wrk_no_flg(), r.not_sum_flg(), r.wrk_no())) {
				return false;
			}

			return true;
		}

		protected boolean chkMesh(boolean mesh_flg, boolean not_sum_flg, String c) {
			if (mesh_flg) {
				if (isNull(c)) {
					return false;
				}
			}
			else {
				if (not_sum_flg) {
					if (!isNull(c)) {
						return false;
					}
				}
			}
			return true;
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 販売予算情報の登録・訂正前チェック<br>
	 */
	public class Chk01 extends MSBBL_SlsBdgListReg_MC_A.Chk01 {
		
		protected MCList<MST_SLS_BDG_R> _selectL;
		protected String[] _keyCols = MST_SLS_BDG_R.create().getKeyColumn();
		protected MCIndexKey _idxKey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}
		
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			MCList<Chk01_DtlR> notErrL = getChkList(up0(), MCRow.Status.CREATE, MCRow.Status.MODIFY, MCRow.Status.NONE);
			String defWgCd = getSysParm("DEF_WG_CD");
			for (Chk01_DtlR r : notErrL) {
				if (isNull(r.sls_dpt_cd()) && isNull(defWgCd)) {
					msgL.addAll(check(r, Chk01_DtlR.$wg_cd, new FXUCL_RequiredValidater()));
				}
				if (!isNull(defWgCd)) {
					r.wg_cd(defWgCd);
				}
			}
			
			if (!up1().file_imp_flg()) {
				msgL.addAll(check(notErrL, Chk01_DtlR.$bdg_sls_prof_rate, new FXUCL_RequiredValidater()));
				msgL.addAll(check(notErrL, Chk01_DtlR.$bdg_sls_prof_amt, new FXUCL_RequiredValidater()));
			}
			else {
				String[] profCol = new String[]{Chk01_DtlR.$bdg_sls_prof_rate, Chk01_DtlR.$bdg_sls_prof_amt};
				msgL.addAll(check(notErrL, profCol, new FXUCL_AtLeastOneValidater()));
			}

			return msgL;

		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			setDptWg();
			msgL.addAll(chkSlsBdgUpdCntr());
			return msgL;
		}
		
		
		/**
		 * 上り電文に対してＷＧを補完する。リストロジックによる補完よりも前に、
		 * 更新カウンタチェック、ファイル入力時の存在チェックを行うため独自にＷＧを補完する。
		 * リストロジックによる補完は行う。
		 */
		protected void setDptWg() {
			
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbcDptL_bldr = MCQueryApiBuilder.create(t);
			dbcDptL_bldr.setSelect(t.wg_cd);
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
					dbcDptL_bldr, up0().groupBy(Chk01_DtlR.$sls_dpt_cd), Chk01_DtlR.$sls_dpt_cd);

			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.sls_dpt_cd())) {
					MAM_DPT_R dbcDptR = cacheDpt.get(r.ym(), r.sls_dpt_cd());
					if (dbcDptR != null) {
						r.wg_cd(dbcDptR.wg_cd());
					}
				}
			}
		}
		
		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
		
		/**
		 * 販売予算の排他ロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkSlsBdgUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			_selectL = MCList.create(MST_SLS_BDG_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_SLS_BDG_R.create("T"));
			MCList<Chk01_DtlR> notErrL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_DtlR> bindL = MCList.create(Chk01_DtlR.class);
			
			if (!up1().file_imp_flg()) {
				notErrL = getChkList(up0().subList(MCRow.Status.MODIFY));
				if (notErrL.isEmpty()) {
					return msgL;
				}
				
				bindL = notErrL.groupBy(_keyCols);
				selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdate("MSBBL1390_MST_SLS_BDG_S01", _selectL, selectL_bldr, bindL);
			}
			// Imp01から呼ばれた場合、販売予算はロックしない。
			else {
				notErrL = getChkList(up0());
				bindL = notErrL.groupBy(_keyCols);
				dbSelectKey("MSBBL1390_MST_SLS_BDG_S02", _selectL, selectL_bldr, bindL);
			}
			
			_idxKey = _selectL.createIndex(_keyCols);
			for (Chk01_DtlR r : notErrL) {
				MST_SLS_BDG_R selectR = _selectL.getFirst(_idxKey, r.toArray(_keyCols));
				
				if (!up1().file_imp_flg()) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$upd_cntr, selectR));
				}
				// Imp01から呼ばれた場合、販売予算は更新カウンタチェックしない。
				// 更新行については、更新カウンタ設定、ステータスをMODIFYにする。
				else {
					// 更新行
					if (!isNull(selectR)) {
						r.upd_cntr(selectR.getNumber(MST_SLS_BDG_R.$upd_cntr));
						r.setStatus(MCRow.Status.MODIFY);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 販売予算粗利額、販売予算粗利率の算出
		 */
		protected void setBdgSlsProf(Chk01_DtlR r, MST_SLS_BDG_R selectR) {
			// 新規追加時
			if (isNull(selectR)) {
				// 粗利率が指定されていない場合は粗利率を算出
				if (isNull(r.bdg_sls_prof_rate())) {
					setBdgSlsRate(r);
				}
				// 上記以外（粗利率が指定されている場合）は、粗利額を算出
				else {
					setBdgSlsAmt(r);
				}
			}
			// 変更時
			else {
				// 変更がない場合はなにもしない
				if (isSame(r.bdg_sls_amt(), selectR.bdg_sls_amt())
						&& isSame(r.bdg_sls_prof_rate(), selectR.bdg_sls_prof_rate())
						&& isSame(r.bdg_sls_prof_amt(), selectR.bdg_sls_prof_amt())) {
				}
				// 粗利率が指定されていない場合は粗利率を算出
				else if (isNull(r.bdg_sls_prof_rate())) {
					setBdgSlsRate(r);
				}
				// 粗利額が指定されていない場合は粗利額を算出
				else if (isNull(r.bdg_sls_prof_amt())) {
					setBdgSlsAmt(r);
				}
				// 粗利率が変更されている場合は、粗利額を再計算
				else if (!isSame(r.bdg_sls_prof_rate(), selectR.bdg_sls_prof_rate())) {
					setBdgSlsAmt(r);
				}
				// 粗利額が変更されている場合は、粗利率を再計算
				else if (!isSame(r.bdg_sls_prof_amt(), selectR.bdg_sls_prof_amt())) {
					setBdgSlsRate(r);
				}
				// 上記以外（売上金額額のみが変更されている場合）は、粗利額を再計算
				else {
					setBdgSlsRate(r);
				}
			}
		}
		
		protected void setBdgSlsAmt(Chk01_DtlR r) {
			MCNumber amt = r.bdg_sls_amt();
			MCNumber rate = r.bdg_sls_prof_rate();
			MCNumber dec_place = r.amt_dec_place();
			if (isNullOr(amt, rate, dec_place)) {
				return;
			}
			MCNumber prof_amt = amt.multiply(rate.divide(100), dec_place.intValue(), MAC_RND_TYP.RNDUP.toMC());
			
			r.bdg_sls_prof_amt(prof_amt);
		}

		protected void setBdgSlsRate(Chk01_DtlR r) {
			MCNumber amt = r.bdg_sls_amt();
			MCNumber prof_amt = r.bdg_sls_prof_amt();
			if (isNullOr(amt, prof_amt)) {
				return;
			}
			if (amt.isZero()) {
				return;
			}
			MCNumber rate = prof_amt.multiply(100).divide(amt, MA_META.PER.scale(), MAC_RND_TYP.RNDUP.toMC());
			
			r.bdg_sls_prof_rate(rate);
		}


		/**
		 * DACチェック、条件付チェック、固有チェック
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0(), MCRow.Status.CREATE,
					MCRow.Status.MODIFY);

			for (Chk01_DtlR r : notErrL) {
				
				// 売上金額、売上粗利金額の小数桁チェック
				msgL.addAll(checkDecPlace(r, Chk01_DtlR.$amt_dec_place,
						Chk01_DtlR.$bdg_sls_amt));
				msgL.addAll(checkDecPlace(r, Chk01_DtlR.$amt_dec_place,
						Chk01_DtlR.$bdg_sls_prof_amt));

				// 品目体系ＣＤと品目体系集計対象外ＦＬＧの整合性チェック
				msgL.addAll(chkSlsItmGrp(r));

				// DACチェック
				msgL.addAll(checkWritableWgCdDac(r, Chk01_DtlR.$wg_cd));
				
				if (up1().file_imp_flg()) {
					MST_SLS_BDG_R selectR = _selectL.getFirst(_idxKey, r.toArray(_keyCols));
					setBdgSlsProf(r, selectR);
				}
			}
			return msgL;
		}


		/**
		 * 品目体系ＣＤと品目体系集計対象外ＦＬＧの整合チェック
		 * <p>
		 * 	品目体系がNULLだが、品目体系集計対象外ＦＬＧがＯＮの場合はエラーとする
		 * </p>
		 * @param r
		 * @return
		 */
		protected MCMessageList chkSlsItmGrp(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(r.sls_itm_grp_cd()) && r.sls_itm_grp_not_sum_flg()) {
				msgL.add(new MCMessage(r, Chk01_DtlR.$sls_itm_grp_cd, MSBBL0030,
						toDispGUIIndex(r)));
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 販売予算情報の削除前チェック<br>
	 */
	public class Chk02 extends MSBBL_SlsBdgListReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkSlsBdgUpdCntr());
			return msgL;
		}

		/**
		 * 排他ロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkSlsBdgUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());

			MCList<MST_SLS_BDG_R> selectL = MCList.create(MST_SLS_BDG_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_SLS_BDG_R.create("T"));

			String[] keyCols = selectL_bldr.getBaseDbc().getKeyColumn();
			MCList<Chk02_DtlR> bindL = notErrL.groupBy(keyCols);

			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBBL1390_MST_SLS_BDG_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxKey = selectL.createIndex(keyCols);
			for (Chk02_DtlR r : notErrL) {
				MST_SLS_BDG_R selectR = selectL.getFirst(idxKey, r.toArray(keyCols));
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$upd_cntr, selectR));
			}
			return msgL;
		}

		/**
		 * DACチェック
		 * @return
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());

			for (Chk02_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(r, Chk01_DtlR.$wg_cd));
			}
			return msgL;
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 販売予算情報を登録・訂正する<br>
	 */
	public class Upd01 extends MSBBL_SlsBdgListReg_MC_A.Upd01 {
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

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected void doIt() {

			// チェックオペレーションの呼び出し
			callThisChk01();
			upd();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBBL_SlsBdgListReg.Chk01 ope = MSBBL_SlsBdgListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected void upd() {
			
			MCList<MST_SLS_BDG_R> insDbL = MCList.create(MST_SLS_BDG_R.class);
			MCList<MST_SLS_BDG_R> updDbL = MCList.create(MST_SLS_BDG_R.class);

			for (Chk01_DtlR r : up0().subList(MCRow.Status.CREATE).subList(Chk01_DtlR.$err_flg, false)) {
				insDbL.add(r);
			}
			for (Chk01_DtlR r : up0().subList(MCRow.Status.MODIFY).subList(Chk01_DtlR.$err_flg, false)) {
				updDbL.add(r);
			}
			
			if (!insDbL.isEmpty()) {
				dbInsertEx("MSBBL1390_MST_SLS_BDG_I01", insDbL,
						MCQueryApiBuilder.create(MST_SLS_BDG_R.create("T")));
			}
			if (!updDbL.isEmpty()) {
				dbUpdateKey("MSBBL1390_MST_SLS_BDG_U01", updDbL,
						MCQueryApiBuilder.create(MST_SLS_BDG_R.create("T")));
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 販売予算情報を削除する<br>
	 */
	public class Del01 extends MSBBL_SlsBdgListReg_MC_A.Del01 {
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

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected void doIt() {

			callThisChk02();
			del();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBBL_SlsBdgListReg.Chk02 ope = MSBBL_SlsBdgListReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void handleSuccess(MCList<Chk02_DtlR> l) {
			dbTran().commit();
			for (Chk02_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk02_DtlR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected void del() {
			
			MCList<MST_SLS_BDG_R> delDbL = MCList.create(MST_SLS_BDG_R.class);
			for (Chk02_DtlR r : up0().subList(Chk02_DtlR.$err_flg, false)) {
				delDbL.add(r);
			}
			
			if (!delDbL.isEmpty()) {
				dbDeleteKey("MSBBL1390_MST_SLS_BDG_D01", delDbL,
						MCQueryApiBuilder.create(MST_SLS_BDG_R.create("T")));
			}

		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk02_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_DtlR> up0L = ((MCList<Chk02_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 販売予算のキー項目が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_DtlR>> splitUp(MCList<Chk02_DtlR> list, int max) {
			List<MCList<Chk02_DtlR>> ret = new ArrayList<>();
			MCList<Chk02_DtlR>[] grpL = list.groupList(getSlsBdgKey());
			MCList<Chk02_DtlR> tmp = MCList.create(Chk02_DtlR.class);
			for (MCList<Chk02_DtlR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}
	
	protected String[] getSlsBdgKey() {
		
		return new String[] {
				Chk01_DtlR.$sls_dpt_cd,
				Chk01_DtlR.$wg_cd,
				Chk01_DtlR.$sls_itm_grp_cd,
				Chk01_DtlR.$cst_cd,
				Chk01_DtlR.$sls_usr_cd,
				Chk01_DtlR.$trd_cur_cd,
				Chk01_DtlR.$wrk_no,
				Chk01_DtlR.$sls_bdg_grp
		};
		
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * 販売予算情報のファイル入力をする<br>
	 */
	public class Imp01 extends MSBBL_SlsBdgListReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBBL_SlsBdgListReg.Chk01 ope = MSBBL_SlsBdgListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}		

		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	
	/**
	 * 販売予算のキー項目が同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
		List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
		MCList<Chk01_DtlR>[] grpL = list.groupList(getSlsBdgKey());
		MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
		for (MCList<Chk01_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_DtlR.class);
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