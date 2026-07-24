package mcframe.serverMSBH.MSBHL5110;

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
import static mcframe.serverMSBH.MSBHL5110.Query.*;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import java.util.ArrayList;
import java.util.List;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApBalService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApBalService_MC extends MSBHL_ApBalService_MC_A{
	//FMCB CUSTOM START
	/** 買掛残高検索結果一時格納用リスト */
	protected MCList<ApBal_Srch01_RsltR> _tmpL = MCList.create(ApBal_Srch01_RsltR.class);
	/**　為替差損益情報検索結果一時格納用リスト */
	protected MCList<ApBal_Srch01_RsltR> _excGainLossL = MCList.create(ApBal_Srch01_RsltR.class);
	/** 処理グループ */
	protected String[] _grpColsL;
	/** フェッチグループ */
	protected String[] _fetchColsL;
	/** ソート順序 */
	protected String[] _sortColsL;
	/** 集計処理グループ（この項目ごとに集計する。ただし、計上年月を除く）  */
	protected String[] _sumGrpYmColsL;
	/** 集計処理グループ（ただし、部門含む、計上年月を除く）  */
	protected String[] _sumGrpDptYmColsL;
	/** 調整後計上年月ＦＲＯＭ */
	protected static final String $tmp_ac_ym_fr = "TMP_AC_YM_FR"; 
	
	/**
	 * ApBal_Srch01オペレーション.<p>
	 *
	 * 締年月の翌月以降の情報を検索<br>
	 */
	public class ApBal_Srch01 extends MSBHL_ApBalService_MC_A.ApBal_Srch01 {
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache;
		protected FXUCL_MCDbcCache<MST_WRK_R> _wrkCache;
		protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if (getCo().ap_no_use_flg()) {
				// 債務不使用の場合は処理を行わない
				return;
			}
			// 検索条件の編集
			editCnd();
			// 検索前処理
			preSearch();
			// 検索
			search();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			// 締処理前のデータを編集
			setBal();
			// 補完処理
			cmpl();
			// 名称補完
			if (up0().cmpl_nm_flg()) {
				cmplNm();
			}
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			sort();
			down0().setAll(_tmpL);
		}
		
		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			if (isNull(up0().ac_ym())) {
				if (up0().close_flg()) {
					up0().ac_ym(up0().ac_ym_fr().addMonth(-1));
				}
				else {
					up0().ac_ym(MSUCL_ClUtil.getApClYm());
				}
			}
			
			if (up0().ac_ym_fr().gt(up0().ac_ym())) {
				// 集計単位ごとの各先頭行の月初残高を計算するために、検索結果に必ず締済データ（月次買掛残高）が含まれるようにする
				up0().addDateColumn($tmp_ac_ym_fr, up0().ac_ym());
			}
			else {
				// 債務部門集計オフ・ＷＧ集計オンのとき、前月の月末残高を、集計単位ごとの各先頭行の月初残高に
				// 引き継ぐかを判定するため、前月行も検索結果に含まれるようにする
				up0().addDateColumn($tmp_ac_ym_fr, up0().ac_ym_fr().addMonth(-1));
			}
			
			if (up0().ap_cred_crrct_flg()) {
				up0().addStringColumn("TMP_AP_CRED_CRRCT_FLG", MCBooleanUtil.booleanToDBString(true));
			}
			
			up0().addStringColumn("TMP_BASE_CUR_CD", getBaseCur().cur_cd());
		}
		
		/**
		 * 検索前処理
		 */
		protected void preSearch() {
			// フェッチグループを設定
			List<String> fetchColsList = setGrp(true);
			_fetchColsL = fetchColsList.toArray(new String[0]);
			
			// 集計条件を設定
			List<String> grpColsList = setGrp(false);
			// 処理グループの設定
			_grpColsL = grpColsList.toArray(new String[0]);
			// 集計処理グループの設定
			_sumGrpYmColsL = grpColsList.toArray(new String[0]);
			grpColsList.add(ApBal_Srch01_RsltR.$ac_ym);
			_sortColsL = grpColsList.toArray(new String[0]);
			grpColsList.remove(ApBal_Srch01_RsltR.$ac_ym);
			grpColsList.remove(ApBal_Srch01_RsltR.$wg_cd);
			if (!grpColsList.contains(ApBal_Srch01_RsltR.$ap_dpt_cd)) {
				grpColsList.add(ApBal_Srch01_RsltR.$ap_dpt_cd);
			}
			_sumGrpDptYmColsL = grpColsList.toArray(new String[0]);
		}
		
		/**
		 * 集計単位を判定
		 */
		protected List<String> setGrp(boolean makeFetchGroup) {
			List<String> grpColsList = new ArrayList<String>();
			// 集計条件に付与する項目を設定。
			// 部門
			if (up0().group_ap_dpt_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$ap_dpt_cd);
			}
			// 債務与信管理先
			if (up0().group_ap_cred_flg() || !isNull(up0().ap_cred_cd())) {
				grpColsList.add(ApBal_Srch01_RsltR.$ap_cred_cd);
			}
			
			// 買掛先
			if (up0().group_asppl_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$asppl_cd);
			}
			
			// 取引通貨
			if (up0().group_trd_cur_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$trd_cur_cd);
			}
			
			// キー情報
			if (up0().group_rcpt_iv_no_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$rcpt_iv_no);
			}
			if (up0().group_rcpt_iv_mng_no_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$rcpt_iv_mng_no);
			}
			if (up0().group_purc_act_no_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$purc_act_no);
			}
			
			// 案件
			if (up0().group_wrk_no_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$wrk_no);
			}
			
			// 債務区分
			if (up0().group_ap_typ_flg()) {
				grpColsList.add(ApBal_Srch01_RsltR.$ap_typ);
			}
			
			// 基準通貨
			grpColsList.add(ApBal_Srch01_RsltR.$base_cur_cd);
			
			// 部門のＷＧ
			if (up0().group_wg_flg() && !up0().group_ap_dpt_flg() && !makeFetchGroup) {
				grpColsList.add(ApBal_Srch01_RsltR.$wg_cd);
			}
			
			return grpColsList;
		}
		
		/**
		 * 検索処理
		 */
		protected void search() {
			searchForDL(MSBHL5110_MST_MLY_AP_BAL_S02(up0()) , up0(), _tmpL, _fetchColsL);
		}
		
		protected void sort() {
			_tmpL.sort(_sortColsL);
		}
		
		/**
		 * 締処理前の情報の月初残高・当月残高を求める
		 */
		protected void setBal() {
			
			// 残高計算前処理
			preSumBal();
			
			// 要求された集計単位に合わせる
			editList();
		}
		
		/**
		 * 検索期間に未来日を指定した場合や、検索結果の計上年月が連続していない場合に行を補う
		 */
		protected ApBal_Srch01_RsltR createEmptyRow(MCDate acYm, ApBal_Srch01_RsltR baseR) {
			ApBal_Srch01_RsltR addR = ApBal_Srch01_RsltR.create();
			addR.ac_ym(acYm);
			
			addR.ap_dpt_cd(baseR.ap_dpt_cd());
			addR.asppl_cd(baseR.asppl_cd());
			addR.asppl_nm(baseR.asppl_nm());
			addR.purc_act_no(baseR.purc_act_no());
			addR.rcpt_iv_no(baseR.rcpt_iv_no());
			addR.rcpt_iv_mng_no(baseR.rcpt_iv_mng_no());
			addR.trd_cur_cd(baseR.trd_cur_cd());
			addR.wrk_no(baseR.wrk_no());
			addR.ap_typ(baseR.ap_typ());
			addR.ap_cred_cd(baseR.ap_cred_cd());
			addR.base_cur_cd(baseR.base_cur_cd());
			
			addR.exc_gain_loss(MCNumber.ZERO);
			addR.total_exc_gain_loss(MCNumber.ZERO);
			
			addR.purc_amt(MCNumber.ZERO);
			addR.ret_amt(MCNumber.ZERO);
			addR.dscnt_amt(MCNumber.ZERO);
			addR.sw_to_amt(MCNumber.ZERO);
			addR.tax_amt(MCNumber.ZERO);
			addR.cash_amt(MCNumber.ZERO);
			addR.note_amt(MCNumber.ZERO);
			addR.account_amt(MCNumber.ZERO);
			addR.setoff_amt(MCNumber.ZERO);
			addR.sw_amt(MCNumber.ZERO);
			addR.end_bal(MCNumber.ZERO);
			addR.base_cur_purc_amt(MCNumber.ZERO);
			addR.base_cur_ret_amt(MCNumber.ZERO);
			addR.base_cur_dscnt_amt(MCNumber.ZERO);
			addR.base_cur_sw_to_amt(MCNumber.ZERO);
			addR.base_cur_tax_amt(MCNumber.ZERO);
			addR.base_cur_cash_amt(MCNumber.ZERO);
			addR.base_cur_note_amt(MCNumber.ZERO);
			addR.base_cur_account_amt(MCNumber.ZERO);
			addR.base_cur_setoff_amt(MCNumber.ZERO);
			addR.base_cur_sw_amt(MCNumber.ZERO);
			addR.base_cur_end_bal(MCNumber.ZERO);
			addR.asppl_grp_cd1(baseR.asppl_grp_cd1());
			addR.asppl_grp_nm1(baseR.asppl_grp_nm1());
			addR.asppl_grp_cd2(baseR.asppl_grp_cd2());
			addR.asppl_grp_nm2(baseR.asppl_grp_nm2());
			addR.asppl_grp_cd3(baseR.asppl_grp_cd3());
			addR.asppl_grp_nm3(baseR.asppl_grp_nm3());
			addR.asppl_grp_cd4(baseR.asppl_grp_cd4());
			addR.asppl_grp_nm4(baseR.asppl_grp_nm4());
			addR.asppl_grp_cd5(baseR.asppl_grp_cd5());
			addR.asppl_grp_nm5(baseR.asppl_grp_nm5());
			addR.asppl_grp_cd6(baseR.asppl_grp_cd6());
			addR.asppl_grp_nm6(baseR.asppl_grp_nm6());
			addR.asppl_grp_cd7(baseR.asppl_grp_cd7());
			addR.asppl_grp_nm7(baseR.asppl_grp_nm7());
			addR.asppl_grp_cd8(baseR.asppl_grp_cd8());
			addR.asppl_grp_nm8(baseR.asppl_grp_nm8());
			addR.asppl_grp_cd9(baseR.asppl_grp_cd9());
			addR.asppl_grp_nm9(baseR.asppl_grp_nm9());
			addR.asppl_grp_cd10(baseR.asppl_grp_cd10());
			addR.asppl_grp_nm10(baseR.asppl_grp_nm10());
			
			return addR;
		}
		
		
		/**
		 * 残高計算前処理
		 */
		protected void preSumBal() {
			// 為替差損益情報の取得
			executeQuery(_excGainLossL, MSBHL5110_MST_AP_EXC_GAIN_LOSS_S01(), up0());
			MCIndexKey idxExcGainLossL = _excGainLossL.createIndex(
					 ApBal_Srch01_RsltR.$ac_ym
					,ApBal_Srch01_RsltR.$ap_dpt_cd
					,ApBal_Srch01_RsltR.$asppl_cd
					,ApBal_Srch01_RsltR.$rcpt_iv_no
					,ApBal_Srch01_RsltR.$rcpt_iv_mng_no
					,ApBal_Srch01_RsltR.$purc_act_no
					,ApBal_Srch01_RsltR.$trd_cur_cd
					,ApBal_Srch01_RsltR.$wrk_no
					,ApBal_Srch01_RsltR.$ap_typ
					);
			
			// 未締の計上年月に対して為替差損益情報の設定する
			for (ApBal_Srch01_RsltR r : _tmpL) {
				if (r.ac_ym().lte(up0().ac_ym())) {
					continue;
				}
				ApBal_Srch01_RsltR excGinLossR = ApBal_Srch01_RsltR.create();
				excGinLossR = _excGainLossL.getFirst(idxExcGainLossL,
						 r.ac_ym()
						,r.ap_dpt_cd()
						,r.asppl_cd()
						,r.rcpt_iv_no()
						,r.rcpt_iv_mng_no()
						,r.purc_act_no()
						,r.trd_cur_cd()
						,r.wrk_no()
						,r.ap_typ()
						);
				
				if (isNull(excGinLossR)) {
					r.exc_gain_loss(MCNumber.ZERO);
				}
				else {
					r.exc_gain_loss(excGinLossR.exc_gain_loss());
					r.base_cur_sw_amt(
						MCNumber.sum(r.base_cur_sw_amt(), excGinLossR.base_cur_sw_amt())
					);
				}
			}
		}
		
		/**
		 *  集計単位に合わせ結果を加工
		 */
		protected void editList() {
			// 集計単位に合わせ結果を加工
			MCList<ApBal_Srch01_RsltR> editL = MCList.create(ApBal_Srch01_RsltR.class);
			MCList<ApBal_Srch01_RsltR> wrkL = MCList.create(ApBal_Srch01_RsltR.class);
			
			// 集計単位に部門を残して集計し、データがない年月のレコードをを補完
			for (MCList<ApBal_Srch01_RsltR> grpL : _tmpL.groupList(_sumGrpDptYmColsL)) {
				wrkL.clear();
			
				for (MCList<ApBal_Srch01_RsltR> ymL : grpL.groupList(ApBal_Srch01_RsltR.$ac_ym)) {
					ApBal_Srch01_RsltR r = ymL.get(0);
					setSum(r, ymL);
					wrkL.add(r);
				}
				
				wrkL.sort(ApBal_Srch01_RsltR.$ac_ym);
				ApBal_Srch01_RsltR baseR = wrkL.get(0);
				for (MCDate ym = wrkL.get(0).ac_ym(); ym.lte(up0().ac_ym_to()); ym = ym.addMonth(1)) {
					ApBal_Srch01_RsltR r = wrkL.getFirst(ApBal_Srch01_RsltR.$ac_ym, ym);
					if (r == null) {
						r = createEmptyRow(ym, baseR);
					}
					editL.add(r);
				}
			}
			
			// 残高計算
			for (MCList<ApBal_Srch01_RsltR> grpL : editL.groupList(_sumGrpDptYmColsL)) {
				// 未締の年月の月初残高／月末残高／累計為替差損益を設定する
				calcBal(grpL);
			}
			
			_tmpL.setAll(editL);
			
			// 部門情報の補完
			crtDptCache(_tmpL);
			setDptInfo(_tmpL, false);
			
			// 更に、部門毎のデータを集計する
			if (!up0().group_ap_dpt_flg()) {
				if (up0().group_wg_flg()) {
					// ＷＧ振替のレコードを作成する
					MCList<ApBal_Srch01_RsltR> wgXfrL = MCList.create(ApBal_Srch01_RsltR.class);
					for (MCList<ApBal_Srch01_RsltR> grpL : _tmpL.groupList(_sumGrpDptYmColsL)) {
						grpL.sort(ApBal_Srch01_RsltR.$ac_ym);
						ApBal_Srch01_RsltR preR = null;
						for (ApBal_Srch01_RsltR r : grpL) {
							if (preR != null) {
								ApBal_Srch01_RsltR redR = createEmptyRow(r.ac_ym(), r);
								redR.init_bal(preR.end_bal().negate());
								redR.end_bal(preR.end_bal().negate());
								redR.base_cur_init_bal(preR.base_cur_end_bal().negate());
								redR.base_cur_end_bal(preR.base_cur_end_bal().negate());
								redR.total_exc_gain_loss(preR.total_exc_gain_loss().negate());
								redR.wg_cd(r.wg_cd());
								redR.wg_nm(r.wg_nm());
								wgXfrL.add(redR);
								
								ApBal_Srch01_RsltR blkR = createEmptyRow(r.ac_ym(), preR);
								blkR.init_bal(preR.end_bal());
								blkR.end_bal(preR.end_bal());
								blkR.base_cur_init_bal(preR.base_cur_end_bal());
								blkR.base_cur_end_bal(preR.base_cur_end_bal());
								blkR.total_exc_gain_loss(preR.total_exc_gain_loss());
								blkR.wg_cd(preR.wg_cd());
								blkR.wg_nm(preR.wg_nm());
								wgXfrL.add(blkR);
								
								for (MCDate ym = r.ac_ym().addMonth(1); ym.lte(up0().ac_ym_to()); ym = ym.addMonth(1)) {
									redR = redR.clone();
									redR.ac_ym(ym);
									wgXfrL.add(redR);
									blkR = blkR.clone();
									blkR.ac_ym(ym);
									wgXfrL.add(blkR);
								}
							}
							preR = r;
						}
					}
					setDptInfo(wgXfrL, true);
					_tmpL.addAll(wgXfrL);
				}
				
				exclude();
				editL.clear();
				for (MCList<ApBal_Srch01_RsltR> grpL : _tmpL.groupList(_sumGrpYmColsL)) {
					wrkL.clear();
					for (MCList<ApBal_Srch01_RsltR> ymL : grpL.groupList(ApBal_Srch01_RsltR.$ac_ym)) {
						ApBal_Srch01_RsltR r = ymL.get(0);
						setSum(r, ymL);
						wrkL.add(r);
					}
					
					wrkL.sort(ApBal_Srch01_RsltR.$ac_ym);
					ApBal_Srch01_RsltR preR = null;
					
					for (ApBal_Srch01_RsltR r : wrkL) {
						// 最初の年月より後の年月は、残高を再計算する
						if (preR != null) {
							calcBal(r, preR);
						}
						preR = r;
					}
					
					editL.addAll(wrkL);
				}
				_tmpL.setAll(editL);
			}
			else {
				exclude();
			}
		}
		
		protected void setSum(ApBal_Srch01_RsltR r, MCList<ApBal_Srch01_RsltR> ymL) {
			r.init_bal(ymL.sum(ApBal_Srch01_RsltR.$init_bal));
			r.purc_amt(ymL.sum(ApBal_Srch01_RsltR.$purc_amt));
			r.ret_amt(ymL.sum(ApBal_Srch01_RsltR.$ret_amt));
			r.dscnt_amt(ymL.sum(ApBal_Srch01_RsltR.$dscnt_amt));
			r.sw_to_amt(ymL.sum(ApBal_Srch01_RsltR.$sw_to_amt));
			r.tax_amt(ymL.sum(ApBal_Srch01_RsltR.$tax_amt));
			r.cash_amt(ymL.sum(ApBal_Srch01_RsltR.$cash_amt));
			r.note_amt(ymL.sum(ApBal_Srch01_RsltR.$note_amt));
			r.account_amt(ymL.sum(ApBal_Srch01_RsltR.$account_amt));
			r.setoff_amt(ymL.sum(ApBal_Srch01_RsltR.$setoff_amt));
			r.sw_amt(ymL.sum(ApBal_Srch01_RsltR.$sw_amt));
			r.end_bal(ymL.sum(ApBal_Srch01_RsltR.$end_bal));
			
			r.base_cur_init_bal(ymL.sum(ApBal_Srch01_RsltR.$base_cur_init_bal));
			r.base_cur_purc_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_purc_amt));
			r.base_cur_ret_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_ret_amt));
			r.base_cur_dscnt_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_dscnt_amt));
			r.base_cur_sw_to_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_sw_to_amt));
			r.base_cur_tax_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_tax_amt));
			r.base_cur_cash_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_cash_amt));
			r.base_cur_note_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_note_amt));
			r.base_cur_account_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_account_amt));
			r.base_cur_setoff_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_setoff_amt));
			r.base_cur_sw_amt(ymL.sum(ApBal_Srch01_RsltR.$base_cur_sw_amt));
			r.base_cur_end_bal(ymL.sum(ApBal_Srch01_RsltR.$base_cur_end_bal));
			
			r.exc_gain_loss(ymL.sum(ApBal_Srch01_RsltR.$exc_gain_loss));
			r.total_exc_gain_loss(ymL.sum(ApBal_Srch01_RsltR.$total_exc_gain_loss));
		}
		
		/**
		 * 月初残高／月末残高／累計為替差損益を設定する
		 */
		protected void calcBal(MCList<ApBal_Srch01_RsltR> grpL) {
			grpL.sort(ApBal_Srch01_RsltR.$ac_ym);
			ApBal_Srch01_RsltR preR = null;
			
			for (ApBal_Srch01_RsltR r : grpL) {
				// 未締の年月の月初残高／月末残高／累計為替差損益を設定する
				if (r.ac_ym().gt(up0().ac_ym())) {
					calcBal(r, preR);
				}
				preR = r;
			}
		}
		
		/**
		 * 月初残高／月末残高／累計為替差損益を設定する
		 */
		protected void calcBal(ApBal_Srch01_RsltR r, ApBal_Srch01_RsltR preR) {
			// 月末残高
			MCNumber preEndBal = preR == null ? MCNumber.ZERO : preR.end_bal();
			// 基準通貨月末残高
			MCNumber preBaseCurEndBal = preR == null ? MCNumber.ZERO : preR.base_cur_end_bal();
			// 累計為替差損益
			MCNumber preTotalExcGainLoss = preR == null ? MCNumber.ZERO : preR.total_exc_gain_loss();

			// 前月の月末残高を月初残高に設定する
			r.init_bal(preEndBal);
			r.base_cur_init_bal(preBaseCurEndBal);

			// 為替差損益情報を補完する
			r.total_exc_gain_loss(MCNumber.sum(preTotalExcGainLoss, r.exc_gain_loss()));

			// 当月残高を算出する
			r.end_bal(MCNumber.sum(
					 r.init_bal()
					,r.purc_amt()
					,r.ret_amt()
					,r.dscnt_amt()
					,r.sw_to_amt()
					,r.tax_amt()
					,r.cash_amt().negate()
					,r.note_amt().negate()
					,r.account_amt().negate()
					,r.setoff_amt().negate()
					,r.sw_amt().negate()
					));
			r.base_cur_end_bal(MCNumber.sum(
					 r.base_cur_init_bal()
					,r.base_cur_purc_amt()
					,r.base_cur_ret_amt()
					,r.base_cur_dscnt_amt()
					,r.base_cur_sw_to_amt()
					,r.base_cur_tax_amt()
					,r.base_cur_cash_amt().negate()
					,r.base_cur_note_amt().negate()
					,r.base_cur_account_amt().negate()
					,r.base_cur_setoff_amt().negate()
					,r.base_cur_sw_amt().negate()
					,r.exc_gain_loss().negate()
					));
		}
		
		/**
		 * 部門情報をキャッシュする
		 */
		protected void crtDptCache(MCList<ApBal_Srch01_RsltR> list) {
			if (_dptCache == null) {
				MAM_DPT_R dptR = MAM_DPT_R.create("T1");
				MAM_WG_R wgR = MAM_WG_R.create("T2");
				
				MCQueryApiBuilder dpt_bldr = MCQueryApiBuilder.create(dptR);
				dpt_bldr.setSelect(dptR.dpt_cd);
				dpt_bldr.addSelect(dptR.dpt_nm);
				dpt_bldr.addSelect(dptR.wg_cd);
				dpt_bldr.addSelect(wgR.wg_nm);
				dpt_bldr.addLeftOuterJoin(wgR, dptR.wg_cd.eq(wgR.wg_cd));
				
				_dptCache = new FXUCL_MCDbcCacheStEnd<>(dpt_bldr, list, ApBal_Srch01_RsltR.$ap_dpt_cd);
			}
		}
		
		/**
		 * 部門情報を補完する
		 */
		protected void setDptInfo(MCList<ApBal_Srch01_RsltR> list, boolean keepWgFlg) {
			if (isNull(list)) {
				return ;
			}
			
			// 補完
			for (ApBal_Srch01_RsltR r : list) {
				MAM_DPT_R dptR = _dptCache.get(r.ac_ym(), r.ap_dpt_cd());
				r.ap_dpt_nm(dptR.dpt_nm());
				if (!keepWgFlg) {
					r.wg_cd(dptR.wg_cd());
					r.wg_nm(dptR.getStringNE(MAM_WG_R.$wg_nm));
				}
			}
		}
		
		/**
		 * 検索条件に合致しない場合は、検索結果から除外する（部門、ＷＧ）
		 */
		protected void exclude() {
			if (!hasExcludeCnd()) {
				return ;
			}
			MCList<ApBal_Srch01_RsltR> trgtL = MCList.create(ApBal_Srch01_RsltR.class);
			for (ApBal_Srch01_RsltR r : _tmpL) {
				if (!isNull(up0().ap_dpt_nm()) && !isLike(r.ap_dpt_nm(), up0().ap_dpt_nm())) {
					continue;
				}
				if (!isNull(up0().wg_cd()) && !isLike(r.wg_cd(), up0().wg_cd())) {
					continue;
				}
				if (!isNull(up0().wg_nm()) && !isLike(r.wg_nm(), up0().wg_nm())) {
					continue;
				}
				trgtL.add(r);
			}
			_tmpL.setAll(trgtL);
		}
		
		protected boolean hasExcludeCnd() {
			return !isNullAnd(up0().ap_dpt_nm(), up0().wg_cd(), up0().wg_nm());
		}
		
		/**
		 * 全項目ゼロ・nullであるか否かを判定します
		 */
		protected boolean isAllZero (ApBal_Srch01_RsltR r) {
			if (up0().group_trd_cur_flg()) {
				if ((isSame(MCNumber.ZERO, r.init_bal()) || isNull(r.init_bal()))
						 && (isSame(MCNumber.ZERO, r.purc_amt()) || isNull(r.purc_amt()))
						 && (isSame(MCNumber.ZERO, r.ret_amt()) || isNull(r.ret_amt()))
						 && (isSame(MCNumber.ZERO, r.dscnt_amt()) || isNull(r.dscnt_amt()))
						 && (isSame(MCNumber.ZERO, r.sw_to_amt()) || isNull(r.sw_to_amt()))
						 && (isSame(MCNumber.ZERO, r.tax_amt()) || isNull(r.tax_amt()))
						 && (isSame(MCNumber.ZERO, r.cash_amt()) || isNull(r.cash_amt()))
						 && (isSame(MCNumber.ZERO, r.note_amt()) || isNull(r.note_amt()))
						 && (isSame(MCNumber.ZERO, r.account_amt()) || isNull(r.account_amt()))
						 && (isSame(MCNumber.ZERO, r.setoff_amt()) || isNull(r.setoff_amt()))
						 && (isSame(MCNumber.ZERO, r.sw_amt()) || isNull(r.sw_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_init_bal()) || isNull(r.base_cur_init_bal()))
						 && (isSame(MCNumber.ZERO, r.base_cur_purc_amt()) || isNull(r.base_cur_purc_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_ret_amt()) || isNull(r.base_cur_ret_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_dscnt_amt()) || isNull(r.base_cur_dscnt_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_sw_to_amt()) || isNull(r.base_cur_sw_to_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_tax_amt()) || isNull(r.base_cur_tax_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_cash_amt()) || isNull(r.base_cur_cash_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_note_amt()) || isNull(r.base_cur_note_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_account_amt()) || isNull(r.base_cur_account_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_setoff_amt()) || isNull(r.base_cur_setoff_amt()))
						 && (isSame(MCNumber.ZERO, r.base_cur_sw_amt()) || isNull(r.base_cur_sw_amt()))
						 && (isSame(MCNumber.ZERO, r.exc_gain_loss()) || isNull(r.exc_gain_loss()))
						 && (isSame(MCNumber.ZERO, r.total_exc_gain_loss()) || isNull(r.total_exc_gain_loss()))) {
					return true;
				}
			}
			else {
				if ((isSame(MCNumber.ZERO, r.base_cur_init_bal()) || isNull(r.base_cur_init_bal()))
						&& (isSame(MCNumber.ZERO, r.base_cur_purc_amt()) || isNull(r.base_cur_purc_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_ret_amt()) || isNull(r.base_cur_ret_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_dscnt_amt()) || isNull(r.base_cur_dscnt_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_sw_to_amt()) || isNull(r.base_cur_sw_to_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_tax_amt()) || isNull(r.base_cur_tax_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_cash_amt()) || isNull(r.base_cur_cash_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_note_amt()) || isNull(r.base_cur_note_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_account_amt()) || isNull(r.base_cur_account_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_setoff_amt()) || isNull(r.base_cur_setoff_amt()))
						&& (isSame(MCNumber.ZERO, r.base_cur_sw_amt()) || isNull(r.base_cur_sw_amt()))
						&& (isSame(MCNumber.ZERO, r.exc_gain_loss()) || isNull(r.exc_gain_loss()))
						&& (isSame(MCNumber.ZERO, r.total_exc_gain_loss()) || isNull(r.total_exc_gain_loss()))) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 補完処理
		 */
		protected void cmpl() {
			// 補完
			MCList<ApBal_Srch01_RsltR> rsltL = MCList.create(ApBal_Srch01_RsltR.class);
			for (ApBal_Srch01_RsltR r : _tmpL) {
				// 検索対象外期間の場合は表示対象としない
				if (r.ac_ym().lt(up0().ac_ym_fr()) || r.ac_ym().gt(up0().ac_ym_to())) {
					continue;
				}
				
				// 金額情報が設定されていない場合は表示対象としない
				if (isAllZero(r)) {
					continue;
				}
				
				if (!up0().group_trd_cur_flg()) {
					// 取引通貨ごとに集計しない場合は非表示となるため集計不要
					r.trd_cur_cd(null);
					r.trd_cur_nm(null);
					r.init_bal(null);
					r.purc_amt(null);
					r.ret_amt(null);
					r.dscnt_amt(null);
					r.sw_to_amt(null);
					r.tax_amt(null);
					r.cash_amt(null);
					r.note_amt(null);
					r.account_amt(null);
					r.setoff_amt(null);
					r.sw_amt(null);
					r.end_bal(null);
				}
				
				if (!up0().group_ap_dpt_flg()) {
					r.ap_dpt_cd(null);
					r.ap_dpt_nm(null);
				}
				if (!up0().group_wg_flg()) {
					r.wg_cd(null);
					r.wg_nm(null);
				}
				if (!up0().group_asppl_flg()) {
					r.asppl_cd(null);
					r.asppl_nm(null);
					r.asppl_grp_cd1(null);
					r.asppl_grp_nm1(null);
					r.asppl_grp_cd2(null);
					r.asppl_grp_nm2(null);
					r.asppl_grp_cd3(null);
					r.asppl_grp_nm3(null);
					r.asppl_grp_cd4(null);
					r.asppl_grp_nm4(null);
					r.asppl_grp_cd5(null);
					r.asppl_grp_nm5(null);
					r.asppl_grp_cd6(null);
					r.asppl_grp_nm6(null);
					r.asppl_grp_cd7(null);
					r.asppl_grp_nm7(null);
					r.asppl_grp_cd8(null);
					r.asppl_grp_nm8(null);
					r.asppl_grp_cd9(null);
					r.asppl_grp_nm9(null);
					r.asppl_grp_cd10(null);
					r.asppl_grp_nm10(null);
				}
				if (!up0().group_rcpt_iv_no_flg()) {
					r.rcpt_iv_no(null);
				}
				if (!up0().group_rcpt_iv_mng_no_flg()) {
					r.rcpt_iv_mng_no(null);
				}
				if (!up0().group_purc_act_no_flg()) {
					r.purc_act_no(null);
				}
				
				if (!up0().group_wrk_no_flg()) {
					r.wrk_no(null);
					r.wrk_nm(null);
				}
				if (!up0().group_ap_typ_flg()) {
					r.ap_typ(null);
				}
				if (!up0().group_ap_cred_flg()) {
					r.ap_cred_cd(null);
				}
				if (!(up0().group_ap_dpt_flg() 
						&& up0().group_wg_flg()
						&& up0().group_asppl_flg()
						&& up0().group_purc_act_no_flg()
						&& up0().group_rcpt_iv_no_flg()
						&& up0().group_rcpt_iv_mng_no_flg() 
						&& up0().group_trd_cur_flg()
						&& up0().group_wrk_no_flg()
						&& up0().group_ap_typ_flg())){
					// キーの粒度で表示していない場合（集計結果を表示している場合）はクリアする
					r.ins_usr_id(null);
					r.ins_usr_nm(null);
					r.ins_func_id(null);
					r.ins_ts(null);
					r.upd_usr_id(null);
					r.upd_usr_nm(null);
					r.upd_func_id(null);
					r.upd_ts(null);
					r.upd_srv_req_no(null);
				}
				if (MAC_STR.isNULL_VAL(r.ap_dpt_nm())) {
					r.ap_dpt_nm(null);
				}
				if (MAC_STR.isNULL_VAL(r.wg_cd())) {
					r.wg_cd(null);
				}
				if (MAC_STR.isNULL_VAL(r.asppl_nm())) {
					r.asppl_nm(null);
				}
				if (MAC_STR.isNULL_VAL(r.ap_cred_cd())) {
					r.ap_cred_cd(null);
				}
				rsltL.add(r);
			}
			_tmpL.setAll(rsltL);
		}
		
		protected void cmplNm() {
			MCList<ApBal_Srch01_RsltR> list = _tmpL;
			crtCmplNmCache(list);
			
			for (ApBal_Srch01_RsltR r : list) {
				MAM_CUR_R baseCurR = _curCache.get(r.base_cur_cd());
				r.base_cur_nm(baseCurR.cur_nm());
				r.base_cur_amt_dec_place(baseCurR.amt_dec_place());
				
				MAM_CUR_R trdCurR = _curCache.get(r.trd_cur_cd());
				r.trd_cur_nm(trdCurR.cur_nm());
				r.trd_cur_amt_dec_place(trdCurR.amt_dec_place());
				
				MST_WRK_R wrkR = _wrkCache.get(r.wrk_no());
				r.wrk_nm(wrkR.wrk_nm());
			}
			
		}
		
		protected void crtCmplNmCache(MCList<ApBal_Srch01_RsltR> list) {
			if (_curCache == null) {
				MAM_CUR_R dbR = MAM_CUR_R.create();
				
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(dbR);
				bldr.setSelect(dbR.cur_cd);
				bldr.addSelect(dbR.cur_nm);
				bldr.addSelect(dbR.amt_dec_place);
				
				_curCache = new FXUCL_MCDbcCache<>(bldr, list, ApBal_Srch01_RsltR.$trd_cur_cd);
			}
			
			if (_wrkCache == null) {
				MST_WRK_R dbR = MST_WRK_R.create();
				
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(dbR);
				bldr.setSelect(dbR.wrk_no);
				bldr.addSelect(dbR.wrk_nm);
				
				_wrkCache = new FXUCL_MCDbcCache<>(bldr, list, ApBal_Srch01_RsltR.$wrk_no);
			}
		}
		
	}

	//FMCB CUSTOM END
}