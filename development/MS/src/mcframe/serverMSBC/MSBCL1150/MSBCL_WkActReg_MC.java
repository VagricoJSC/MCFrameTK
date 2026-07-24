package mcframe.serverMSBC.MSBCL1150;

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
import mcframe.serverMSBC.MSBCL1150.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL1150.Query.*;
import mcframe.serverMSBC.MSBCL6050.*;
import mcframe.serverMSBC.MSBCL6060.*;
import mcframe.serverMSBC.MSBCL6110.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import java.util.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_WkActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_WkActReg_MC extends MSBCL_WkActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工数実績を登録・訂正するために、工数予定・工数実績残・工数実績を検索する。<br>
	 */
	public class Srch01 extends MSBCL_WkActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			
			if (isSrchActData(up0())) {
				// 実績済みのデータのみ検索する
				MCQueryPlan wkActSql = MSBCL1150_MST_WK_ACT_S01();
				searchForDL(wkActSql, up0(), down0());
			}
			if (isSrchSchdData(up0())) {
				// 未実績のデータのみ検索する
				MCQueryPlan noWkActSql = MSBCL1150_MST_WK_ACT_REM_S01();
				searchForDL(noWkActSql, up0(), down0());
			}
			
		}
		
		/**
		 * 実績データを参照するかどうか
		 * @param up
		 * @return
		 */
		protected boolean isSrchActData(Srch01_CndR up) {
			if (!up.stt_flg() && !up.cmpl_flg() && !up.no_schd_flg()) {
				return false;
			}
			if (!up.oper_stt_flg() && !up.oper_cmpl_flg() && !up.oper_no_inst_flg()) {
				return false;
			}
			return true;
		}
		
		/**
		 * 未実績データを参照するかどうか
		 * @param up
		 * @return
		 */
		protected boolean isSrchSchdData(Srch01_CndR up) {
			if (up.no_mfg_inst_only_flg()) {
				return false;
			}
			
			if (!up.ord_flg()) {
				return false;
			}
			
			if (!up.oper_ord_flg() && !up.oper_stt_flg()) {
				return false;
			}

			if (isNullAnd(up.ac_dt_fr(), up.ac_dt_to(), up.wk_rsn_cd(), up.wk_rsn_nm(),
					up.wk_day_cd(), up.wk_day_nm(), up.dpt_wg_cd(), up.dpt_wg_nm(),
					up.wk_usr_cd(), up.wk_usr_nm(), up.wk_usr_dpt_cd(),
					up.wk_usr_dpt_nm(), up.wk_act_no(), up.mfg_act_no(),
					up.fclty(),
					up.act_intr_rmrks(), up.act_sub_char1(), up.act_sub_char2(),
					up.act_sub_char3(), up.ext_wk_act_no())) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
			down0().removeAll(setMesflg(up0(), down0()));
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 工数実績を参照する<br>
	 */
	public class Srch02 extends MSBCL_WkActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			MCQueryPlan wkActSql = MSBCL1150_MST_WK_ACT_S01();
			searchForDL(wkActSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		    down0().removeAll(setMesflg(up0(), down0()));
		}
	}
	
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 未実績の工数予定及び、実績登録済みの工数予定を検索する。予定工数と実績工数を比較するために、実績が分割されている場合であっても予定の粒度で検索する<br>
	 */
	public class Srch03 extends MSBCL_WkActReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			MCQueryPlan wkActSql = MSBCL1150_MST_WK_SCHD_S01();
			searchForDL(wkActSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		    down0().removeAll(setMesflg(up0(), down0()));
		}
	}
	
	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 工数の状況
		if (up.ord_flg()) {
			up.addStringColumn("TMP_STS_ORD", MSC_MFG_STS_TYP.ORD.value());
		}
		if (up.stt_flg()) {
			up.addStringColumn("TMP_STS_STT", MSC_MFG_STS_TYP.STT.value());
		}
		if (up.cmpl_flg()) {
			up.addStringColumn("TMP_STS_CMPL", MSC_MFG_STS_TYP.CMPL.value());
		}
		up.addStringColumn("TMP_NO_SCHD", toTrueStr(up.no_schd_flg()));
		
		// 工程の状況
		if (up.oper_ord_flg()) {
			up.addStringColumn("TMP_OPER_STS_ORD", MSC_MFG_STS_TYP.ORD.value());
		}
		if (up.oper_stt_flg()) {
			up.addStringColumn("TMP_OPER_STS_STT", MSC_MFG_STS_TYP.STT.value());
		}
		if (up.oper_cmpl_flg()) {
			up.addStringColumn("TMP_OPER_STS_CMPL", MSC_MFG_STS_TYP.CMPL.value());
		}
		up.addStringColumn("TMP_OPER_NO_INST", toTrueStr(up.oper_no_inst_flg()));
		
		up.addStringColumn("TMP_NO_MFG_INST_ONLY", toTrueStr(up.no_mfg_inst_only_flg()));
	}
	
	/**
	 * 下り電文の加工の共通処理
	 */
	protected void editDownCmn(Srch01_RsltR r) {
		// 工数の合計値を設定
		if (!isNull(r.wk_schd_no())) {
			r.schd_sum_wk_cost(nvl(r.schd_fxd_wk_cost(), MCNumber.ZERO).add(
				nvl(r.schd_wk_cost(), MCNumber.ZERO)));
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ工数実績のチェック処理を行う<br>
	 */
	public class Imp01 extends MSBCL_WkActReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callWkActChk();
			
			setDown();
		}
		
		protected void editUp() {
			editUpForUpdImp(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callWkActChk() {
			MSBCL_MfgActRegService.MfgActReg_Chk04 ope = MSBCL_MfgActRegService.crtMfgActReg_Chk04();
			addAll(ope.up0(), up0(), createMap_MfgActReg_Chk04_RsltR_Upd01_RsltR());

			ope.up1().file_imp_flg(true);
			ope.up1().upd_cntr_chk_flg(false);

			ope.exec();

			setAll(up0(),ope.down0(), createMap_Upd01_RsltR_MfgActReg_Chk04_RsltR());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Upd01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Upd01_RsltR> up0L = ((MCList<Upd01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 工数実績を登録、更新する<br>
	 */
	public class Upd01 extends MSBCL_WkActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();

			callWkActUpdChk();

			callWkActUpd();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			editUpForUpdImp(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callWkActUpdChk() {
			MSBCL_MfgActRegService.MfgActReg_Chk04 ope = MSBCL_MfgActRegService.crtMfgActReg_Chk04();
			addAll(ope.up0(), up0(), createMap_MfgActReg_Chk04_RsltR_Upd01_RsltR());
			ope.up1().upd_cntr_chk_flg(true);

			ope.exec();

			setAll(up0(), ope.down0(), createMap_Upd01_RsltR_MfgActReg_Chk04_RsltR());
		}
		
		/**
		 * 登録・訂正処理を実行する
		 */
		protected void callWkActUpd() {
			MSBCL_MfgActRegService.MfgActReg_Upd03 ope = MSBCL_MfgActRegService.crtMfgActReg_Upd03();
			addAll(ope.up0(), up0(), createMap_MfgActReg_Chk04_RsltR_Upd01_RsltR());

			ope.exec();

			setAll(down0(), ope.down0(), createMap_Upd01_RsltR_MfgActReg_Chk04_RsltR());
		}
	}
	
	protected void editUpForUpdImp(MCList<Upd01_RsltR> upL) {
		setPegNo(Upd01_RsltR.$peg_no, upL);

		for (Upd01_RsltR r : upL) {
			if (isNull(r.wk_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				if (!isNull(r.mfg_inst_no())) {
					r.dpt_cd(null);
				}
			}
		}
	}
		/**
		 * MES対象フラグを取得・設定する
		 */
		protected MCList<Srch01_RsltR> setMesflg(Srch01_CndR up0, MCList<Srch01_RsltR> localDown) {
			MCList<Srch01_RsltR> dtlL = null ;
			MCList<Srch01_RsltR> returnL = null ;
			// ＭＥＳ対象
			dtlL = localDown.subList(Srch01_RsltR.$mes_flg, false);

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, Srch01_RsltR> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (Srch01_RsltR dtlR : dtlL) {
				SCMLinkUtil_Srch01_CndR upR = o.up0().add();
				upR.peg_no(peg);
				upR.if_proc_typ(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value());
				upR.loc_cd(dtlR.loc_cd());
				upR.oper_cd(dtlR.oper_cd());
				upR.master_dt(getToday());

				map.put(peg, dtlR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						Srch01_RsltR dtlR = map.get(r.peg_no());
						dtlR.mes_flg(!isNull(r.ext_sys_cd()));
					}
				}
			}

			if (up0.mes_tgt_flg() && up0.not_mes_tgt_flg()) {
				// 両方trueなら何もしない
				returnL = MCList.create(Srch01_RsltR.class);
			}
			else if (up0.mes_tgt_flg()){
				returnL = localDown.subList(Srch01_RsltR.$mes_flg, false);
			}
			else if (up0.not_mes_tgt_flg()) {
				returnL = localDown.subList(Srch01_RsltR.$mes_flg, true);
			}
			else {
				returnL = localDown;
			}
			return returnL;
		}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 工数実績を取り消す<br>
	 */
	public class Del01 extends MSBCL_WkActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			
			callWkActDelChk();
			
			callWkActDel();
			
			setDown();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Upd01_RsltR.$peg_no, up0());
			
			for (Upd01_RsltR r : up0()) {
				r.setStatus(MCRow.Status.DELETE);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * 下り電文の編集
		 */
		protected void setDown() {
			for (Upd01_RsltR r : down0()) {
				// 行ステータスを削除で渡してしまうと、エラー発生時に入力不可行となってしまうため、NONEで渡す
				r.setStatus(MCRow.Status.NONE);
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callWkActDelChk() {
			MSBCL_MfgActRegService.MfgActReg_Chk05 ope = MSBCL_MfgActRegService.crtMfgActReg_Chk05();
			addAll(ope.up0(), up0(), createMap_MfgActReg_Chk05_RsltR_Upd01_RsltR());
			ope.up1().upd_cntr_chk_flg(true);

			ope.exec();

			setAll(up0(), ope.down0(), createMap_Upd01_RsltR_MfgActReg_Chk05_RsltR());
		}
		
		/**
		 * 取消処理を実行する
		 */
		protected void callWkActDel() {
			MSBCL_MfgActRegService.MfgActReg_Del02 ope = MSBCL_MfgActRegService.crtMfgActReg_Del02();
			addAll(ope.up0(), up0(), createMap_MfgActReg_Chk05_RsltR_Upd01_RsltR());

			ope.exec();

			setAll(down0(), ope.down0(), createMap_Upd01_RsltR_MfgActReg_Chk05_RsltR());
		}
	}

	protected Map_MfgActReg_Chk04_RsltR_Upd01_RsltR<MfgActReg_Chk04_RsltR,Upd01_RsltR> createMap_MfgActReg_Chk04_RsltR_Upd01_RsltR() {
		return new Map_MfgActReg_Chk04_RsltR_Upd01_RsltR<MfgActReg_Chk04_RsltR, Upd01_RsltR>();
	}

	public class Map_MfgActReg_Chk04_RsltR_Upd01_RsltR<D extends MfgActReg_Chk04_RsltR, S extends Upd01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgActReg_Chk04_RsltR.$peg_no, Upd01_RsltR.$peg_no);                                          // 紐付けＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$data_crud_typ, Upd01_RsltR.$data_crud_typ);                            // データ更新区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$err_flg, Upd01_RsltR.$err_flg);                                        // エラーＦＬＧ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$inst_wk_act_flg, Upd01_RsltR.$inst_wk_act_flg);                        // 指図工数実績
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_inst_no, Upd01_RsltR.$mfg_inst_no);                                // 製造指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$div_seq, Upd01_RsltR.$div_seq);                                        // 分割連番
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_cd, Upd01_RsltR.$oper_cd);                                        // 工程ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_nm, Upd01_RsltR.$oper_nm);                                        // 工程名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_cd, Upd01_RsltR.$wk_cost_cd);                                  // 工数管理ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_nm, Upd01_RsltR.$wk_cost_nm);                                  // 工数管理名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$ac_dt, Upd01_RsltR.$ac_dt);                                            // 計上日
			addColumnPathMap(MfgActReg_Chk04_RsltR.$old_ac_dt, Upd01_RsltR.$old_ac_dt);                                    // 更新前計上日
			addColumnPathMap(MfgActReg_Chk04_RsltR.$st_tm, Upd01_RsltR.$st_tm);                                            // 着手時刻
			addColumnPathMap(MfgActReg_Chk04_RsltR.$end_tm, Upd01_RsltR.$end_tm);                                          // 終了時刻
			addColumnPathMap(MfgActReg_Chk04_RsltR.$brk_pd, Upd01_RsltR.$brk_pd);                                          // 中断時間
			addColumnPathMap(MfgActReg_Chk04_RsltR.$act_wk_cost, Upd01_RsltR.$act_wk_cost);                                // 実績工数
			addColumnPathMap(MfgActReg_Chk04_RsltR.$abort_flg, Upd01_RsltR.$abort_flg);                                    // 打切
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_unit_nm, Upd01_RsltR.$wk_cost_unit_nm);                        // 工数管理単位名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_dec_place, Upd01_RsltR.$wk_cost_dec_place);                    // 小数部有効桁数
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_rnd_typ, Upd01_RsltR.$wk_cost_rnd_typ);                        // 端数処理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_day_cd, Upd01_RsltR.$wk_day_cd);                                    // 勤務種類ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_day_nm, Upd01_RsltR.$wk_day_nm);                                    // 勤務種類名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_rsn_cd, Upd01_RsltR.$wk_rsn_cd);                                    // 工数理由ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_rsn_nm, Upd01_RsltR.$wk_rsn_nm);                                    // 工数理由名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$dpt_cd, Upd01_RsltR.$dpt_cd);                                          // 部門ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$dpt_nm, Upd01_RsltR.$dpt_nm);                                          // 部門名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_cd, Upd01_RsltR.$loc_cd);                                          // 場所ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_nm, Upd01_RsltR.$loc_nm);                                          // 場所名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$str_ln_tgt_flg, Upd01_RsltR.$str_ln_tgt_flg);                          // 棚・ライン対象
			addColumnPathMap(MfgActReg_Chk04_RsltR.$str_ln_cd, Upd01_RsltR.$str_ln_cd);                                    // 棚・ラインＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$str_ln_nm, Upd01_RsltR.$str_ln_nm);                                    // 棚・ライン名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$str_ln_cd_none_flg, Upd01_RsltR.$str_ln_cd_none_flg);                  // 棚・ライン無
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_usr_cd, Upd01_RsltR.$wk_usr_cd);                                    // 作業者ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_usr_nm, Upd01_RsltR.$wk_usr_nm);                                    // 作業者名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_usr_dpt_cd, Upd01_RsltR.$wk_usr_dpt_cd);                            // 作業者部門ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_usr_dpt_nm, Upd01_RsltR.$wk_usr_dpt_nm);                            // 作業者部門名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$fclty, Upd01_RsltR.$fclty);                                       // 設備
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_cost_calc_ctl_flg, Upd01_RsltR.$wk_cost_calc_ctl_flg);              // 自動工数計算更新許可
			addColumnPathMap(MfgActReg_Chk04_RsltR.$act_intr_rmrks, Upd01_RsltR.$act_intr_rmrks);                          // 内部備考（実績）
			addColumnPathMap(MfgActReg_Chk04_RsltR.$act_sub_char1, Upd01_RsltR.$act_sub_char1);                            // 予備１（実績）
			addColumnPathMap(MfgActReg_Chk04_RsltR.$act_sub_char2, Upd01_RsltR.$act_sub_char2);                            // 予備２（実績）
			addColumnPathMap(MfgActReg_Chk04_RsltR.$act_sub_char3, Upd01_RsltR.$act_sub_char3);                            // 予備３（実績）
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_cd, Upd01_RsltR.$itm_cd);                                          // 品目ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_sub1, Upd01_RsltR.$itm_sub1);                                      // 枝番１
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_sub2, Upd01_RsltR.$itm_sub2);                                      // 枝番２
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_sub3, Upd01_RsltR.$itm_sub3);                                      // 枝番３
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_nm, Upd01_RsltR.$itm_nm);                                          // 品名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$lot_mng_typ, Upd01_RsltR.$lot_mng_typ);                                // ロット管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sublot_mng_typ, Upd01_RsltR.$sublot_mng_typ);                          // サブロット管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno1_mng_typ, Upd01_RsltR.$sno1_mng_typ);                              // 手配ＮＯ１管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno2_mng_typ, Upd01_RsltR.$sno2_mng_typ);                              // 手配ＮＯ２管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno3_mng_typ, Upd01_RsltR.$sno3_mng_typ);                              // 手配ＮＯ３管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno4_mng_typ, Upd01_RsltR.$sno4_mng_typ);                              // 手配ＮＯ４管理区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$lot_no, Upd01_RsltR.$lot_no);                                          // ロットＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sublot_no, Upd01_RsltR.$sublot_no);                                    // サブロットＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno1, Upd01_RsltR.$sno1);                                              // 手配ＮＯ１
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno2, Upd01_RsltR.$sno2);                                              // 手配ＮＯ２
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno3, Upd01_RsltR.$sno3);                                              // 手配ＮＯ３
			addColumnPathMap(MfgActReg_Chk04_RsltR.$sno4, Upd01_RsltR.$sno4);                                              // 手配ＮＯ４
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wrk_no, Upd01_RsltR.$wrk_no);                                          // 案件ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wrk_nm, Upd01_RsltR.$wrk_nm);                                          // 案件名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_mfg_inst_no, Upd01_RsltR.$itm_mfg_inst_no);                        // 品目製造指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_inst_no, Upd01_RsltR.$oper_inst_no);                              // 工程指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_schd_no, Upd01_RsltR.$wk_schd_no);                                  // 工数予定ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_act_no, Upd01_RsltR.$mfg_act_no);                                  // 製造実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_act_no, Upd01_RsltR.$oper_act_no);                                // 工程実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_act_no, Upd01_RsltR.$wk_act_no);                                    // 工数実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$dpt_wg_cd, Upd01_RsltR.$dpt_wg_cd);                                    // 部門ワーキンググループＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$dpt_wg_nm, Upd01_RsltR.$dpt_wg_nm);                                    // 部門ワーキンググループ名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_wg_cd, Upd01_RsltR.$loc_wg_cd);                                    // 場所ワーキンググループＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_wg_nm, Upd01_RsltR.$loc_wg_nm);                                    // 場所ワーキンググループ名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_grp_cd, Upd01_RsltR.$loc_grp_cd);                                  // 場所グループＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$loc_grp_nm, Upd01_RsltR.$loc_grp_nm);                                  // 場所グループ名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$site_cd, Upd01_RsltR.$site_cd);                                        // 工場・物流倉庫ＣＤ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$site_nm, Upd01_RsltR.$site_nm);                                        // 工場・物流倉庫名
			addColumnPathMap(MfgActReg_Chk04_RsltR.$rtn_sts_typ, Upd01_RsltR.$rtn_sts_typ);                                // 処理結果状況区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_inst_upd_cntr, Upd01_RsltR.$mfg_inst_upd_cntr);                    // 製造指図更新カウンタ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_act_upd_cntr, Upd01_RsltR.$wk_act_upd_cntr);                        // 工数実績更新カウンタ

		}
	}

	protected Map_Upd01_RsltR_MfgActReg_Chk04_RsltR<Upd01_RsltR,MfgActReg_Chk04_RsltR> createMap_Upd01_RsltR_MfgActReg_Chk04_RsltR() {
		return new Map_Upd01_RsltR_MfgActReg_Chk04_RsltR<Upd01_RsltR, MfgActReg_Chk04_RsltR>();
	}

	public class Map_Upd01_RsltR_MfgActReg_Chk04_RsltR<D extends Upd01_RsltR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Upd01_RsltR.$peg_no, MfgActReg_Chk04_RsltR.$peg_no);                                          // 紐付けＮＯ
			addColumnPathMap(Upd01_RsltR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);                            // データ更新区分
			addColumnPathMap(Upd01_RsltR.$err_flg, MfgActReg_Chk04_RsltR.$err_flg);                                        // エラーＦＬＧ
			addColumnPathMap(Upd01_RsltR.$inst_wk_act_flg, MfgActReg_Chk04_RsltR.$inst_wk_act_flg);                        // 指図工数実績
			addColumnPathMap(Upd01_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);                                // 製造指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);                                        // 分割連番
			addColumnPathMap(Upd01_RsltR.$oper_cd, MfgActReg_Chk04_RsltR.$oper_cd);                                        // 工程ＣＤ
			addColumnPathMap(Upd01_RsltR.$oper_nm, MfgActReg_Chk04_RsltR.$oper_nm);                                        // 工程名
			addColumnPathMap(Upd01_RsltR.$wk_cost_cd, MfgActReg_Chk04_RsltR.$wk_cost_cd);                                  // 工数管理ＣＤ
			addColumnPathMap(Upd01_RsltR.$wk_cost_nm, MfgActReg_Chk04_RsltR.$wk_cost_nm);                                  // 工数管理名
			addColumnPathMap(Upd01_RsltR.$ac_dt, MfgActReg_Chk04_RsltR.$ac_dt);                                            // 計上日
			addColumnPathMap(Upd01_RsltR.$old_ac_dt, MfgActReg_Chk04_RsltR.$old_ac_dt);                                    // 更新前計上日
			addColumnPathMap(Upd01_RsltR.$st_tm, MfgActReg_Chk04_RsltR.$st_tm);                                            // 着手時刻
			addColumnPathMap(Upd01_RsltR.$end_tm, MfgActReg_Chk04_RsltR.$end_tm);                                          // 終了時刻
			addColumnPathMap(Upd01_RsltR.$brk_pd, MfgActReg_Chk04_RsltR.$brk_pd);                                          // 中断時間
			addColumnPathMap(Upd01_RsltR.$act_wk_cost, MfgActReg_Chk04_RsltR.$act_wk_cost);                                // 実績工数
			addColumnPathMap(Upd01_RsltR.$abort_flg, MfgActReg_Chk04_RsltR.$abort_flg);                                    // 打切
			addColumnPathMap(Upd01_RsltR.$wk_cost_unit_nm, MfgActReg_Chk04_RsltR.$wk_cost_unit_nm);                        // 工数管理単位名
			addColumnPathMap(Upd01_RsltR.$wk_cost_dec_place, MfgActReg_Chk04_RsltR.$wk_cost_dec_place);                    // 小数部有効桁数
			addColumnPathMap(Upd01_RsltR.$wk_cost_rnd_typ, MfgActReg_Chk04_RsltR.$wk_cost_rnd_typ);                        // 端数処理区分
			addColumnPathMap(Upd01_RsltR.$wk_day_cd, MfgActReg_Chk04_RsltR.$wk_day_cd);                                    // 勤務種類ＣＤ
			addColumnPathMap(Upd01_RsltR.$wk_day_nm, MfgActReg_Chk04_RsltR.$wk_day_nm);                                    // 勤務種類名
			addColumnPathMap(Upd01_RsltR.$wk_rsn_cd, MfgActReg_Chk04_RsltR.$wk_rsn_cd);                                    // 工数理由ＣＤ
			addColumnPathMap(Upd01_RsltR.$wk_rsn_nm, MfgActReg_Chk04_RsltR.$wk_rsn_nm);                                    // 工数理由名
			addColumnPathMap(Upd01_RsltR.$dpt_cd, MfgActReg_Chk04_RsltR.$dpt_cd);                                          // 部門ＣＤ
			addColumnPathMap(Upd01_RsltR.$dpt_nm, MfgActReg_Chk04_RsltR.$dpt_nm);                                          // 部門名
			addColumnPathMap(Upd01_RsltR.$loc_cd, MfgActReg_Chk04_RsltR.$loc_cd);                                          // 場所ＣＤ
			addColumnPathMap(Upd01_RsltR.$loc_nm, MfgActReg_Chk04_RsltR.$loc_nm);                                          // 場所名
			addColumnPathMap(Upd01_RsltR.$str_ln_tgt_flg, MfgActReg_Chk04_RsltR.$str_ln_tgt_flg);                          // 棚・ライン対象
			addColumnPathMap(Upd01_RsltR.$str_ln_cd, MfgActReg_Chk04_RsltR.$str_ln_cd);                                    // 棚・ラインＣＤ
			addColumnPathMap(Upd01_RsltR.$str_ln_nm, MfgActReg_Chk04_RsltR.$str_ln_nm);                                    // 棚・ライン名
			addColumnPathMap(Upd01_RsltR.$str_ln_cd_none_flg, MfgActReg_Chk04_RsltR.$str_ln_cd_none_flg);                  // 棚・ライン無
			addColumnPathMap(Upd01_RsltR.$wk_usr_cd, MfgActReg_Chk04_RsltR.$wk_usr_cd);                                    // 作業者ＣＤ
			addColumnPathMap(Upd01_RsltR.$wk_usr_nm, MfgActReg_Chk04_RsltR.$wk_usr_nm);                                    // 作業者名
			addColumnPathMap(Upd01_RsltR.$wk_usr_dpt_cd, MfgActReg_Chk04_RsltR.$wk_usr_dpt_cd);                            // 作業者部門ＣＤ
			addColumnPathMap(Upd01_RsltR.$wk_usr_dpt_nm, MfgActReg_Chk04_RsltR.$wk_usr_dpt_nm);                            // 作業者部門名
			addColumnPathMap(Upd01_RsltR.$fclty, MfgActReg_Chk04_RsltR.$fclty);                                       // 設備
			addColumnPathMap(Upd01_RsltR.$wk_cost_calc_ctl_flg, MfgActReg_Chk04_RsltR.$wk_cost_calc_ctl_flg);              // 自動工数計算更新許可
			addColumnPathMap(Upd01_RsltR.$act_intr_rmrks, MfgActReg_Chk04_RsltR.$act_intr_rmrks);                          // 内部備考（実績）
			addColumnPathMap(Upd01_RsltR.$act_sub_char1, MfgActReg_Chk04_RsltR.$act_sub_char1);                            // 予備１（実績）
			addColumnPathMap(Upd01_RsltR.$act_sub_char2, MfgActReg_Chk04_RsltR.$act_sub_char2);                            // 予備２（実績）
			addColumnPathMap(Upd01_RsltR.$act_sub_char3, MfgActReg_Chk04_RsltR.$act_sub_char3);                            // 予備３（実績）
			addColumnPathMap(Upd01_RsltR.$itm_cd, MfgActReg_Chk04_RsltR.$itm_cd);                                          // 品目ＣＤ
			addColumnPathMap(Upd01_RsltR.$itm_sub1, MfgActReg_Chk04_RsltR.$itm_sub1);                                      // 枝番１
			addColumnPathMap(Upd01_RsltR.$itm_sub2, MfgActReg_Chk04_RsltR.$itm_sub2);                                      // 枝番２
			addColumnPathMap(Upd01_RsltR.$itm_sub3, MfgActReg_Chk04_RsltR.$itm_sub3);                                      // 枝番３
			addColumnPathMap(Upd01_RsltR.$itm_nm, MfgActReg_Chk04_RsltR.$itm_nm);                                          // 品名
			addColumnPathMap(Upd01_RsltR.$lot_mng_typ, MfgActReg_Chk04_RsltR.$lot_mng_typ);                                // ロット管理区分
			addColumnPathMap(Upd01_RsltR.$sublot_mng_typ, MfgActReg_Chk04_RsltR.$sublot_mng_typ);                          // サブロット管理区分
			addColumnPathMap(Upd01_RsltR.$sno1_mng_typ, MfgActReg_Chk04_RsltR.$sno1_mng_typ);                              // 手配ＮＯ１管理区分
			addColumnPathMap(Upd01_RsltR.$sno2_mng_typ, MfgActReg_Chk04_RsltR.$sno2_mng_typ);                              // 手配ＮＯ２管理区分
			addColumnPathMap(Upd01_RsltR.$sno3_mng_typ, MfgActReg_Chk04_RsltR.$sno3_mng_typ);                              // 手配ＮＯ３管理区分
			addColumnPathMap(Upd01_RsltR.$sno4_mng_typ, MfgActReg_Chk04_RsltR.$sno4_mng_typ);                              // 手配ＮＯ４管理区分
			addColumnPathMap(Upd01_RsltR.$lot_no, MfgActReg_Chk04_RsltR.$lot_no);                                          // ロットＮＯ
			addColumnPathMap(Upd01_RsltR.$sublot_no, MfgActReg_Chk04_RsltR.$sublot_no);                                    // サブロットＮＯ
			addColumnPathMap(Upd01_RsltR.$sno1, MfgActReg_Chk04_RsltR.$sno1);                                              // 手配ＮＯ１
			addColumnPathMap(Upd01_RsltR.$sno2, MfgActReg_Chk04_RsltR.$sno2);                                              // 手配ＮＯ２
			addColumnPathMap(Upd01_RsltR.$sno3, MfgActReg_Chk04_RsltR.$sno3);                                              // 手配ＮＯ３
			addColumnPathMap(Upd01_RsltR.$sno4, MfgActReg_Chk04_RsltR.$sno4);                                              // 手配ＮＯ４
			addColumnPathMap(Upd01_RsltR.$wrk_no, MfgActReg_Chk04_RsltR.$wrk_no);                                          // 案件ＮＯ
			addColumnPathMap(Upd01_RsltR.$wrk_nm, MfgActReg_Chk04_RsltR.$wrk_nm);                                          // 案件名
			addColumnPathMap(Upd01_RsltR.$itm_mfg_inst_no, MfgActReg_Chk04_RsltR.$itm_mfg_inst_no);                        // 品目製造指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$oper_inst_no, MfgActReg_Chk04_RsltR.$oper_inst_no);                              // 工程指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$wk_schd_no, MfgActReg_Chk04_RsltR.$wk_schd_no);                                  // 工数予定ＮＯ
			addColumnPathMap(Upd01_RsltR.$mfg_act_no, MfgActReg_Chk04_RsltR.$mfg_act_no);                                  // 製造実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$oper_act_no, MfgActReg_Chk04_RsltR.$oper_act_no);                                // 工程実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);                                    // 工数実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$dpt_wg_cd, MfgActReg_Chk04_RsltR.$dpt_wg_cd);                                    // 部門ワーキンググループＣＤ
			addColumnPathMap(Upd01_RsltR.$dpt_wg_nm, MfgActReg_Chk04_RsltR.$dpt_wg_nm);                                    // 部門ワーキンググループ名
			addColumnPathMap(Upd01_RsltR.$loc_wg_cd, MfgActReg_Chk04_RsltR.$loc_wg_cd);                                    // 場所ワーキンググループＣＤ
			addColumnPathMap(Upd01_RsltR.$loc_wg_nm, MfgActReg_Chk04_RsltR.$loc_wg_nm);                                    // 場所ワーキンググループ名
			addColumnPathMap(Upd01_RsltR.$loc_grp_cd, MfgActReg_Chk04_RsltR.$loc_grp_cd);                                  // 場所グループＣＤ
			addColumnPathMap(Upd01_RsltR.$loc_grp_nm, MfgActReg_Chk04_RsltR.$loc_grp_nm);                                  // 場所グループ名
			addColumnPathMap(Upd01_RsltR.$site_cd, MfgActReg_Chk04_RsltR.$site_cd);                                        // 工場・物流倉庫ＣＤ
			addColumnPathMap(Upd01_RsltR.$site_nm, MfgActReg_Chk04_RsltR.$site_nm);                                        // 工場・物流倉庫名
			addColumnPathMap(Upd01_RsltR.$rtn_sts_typ, MfgActReg_Chk04_RsltR.$rtn_sts_typ);                                // 処理結果状況区分
			addColumnPathMap(Upd01_RsltR.$mfg_inst_upd_cntr, MfgActReg_Chk04_RsltR.$mfg_inst_upd_cntr);                    // 製造指図更新カウンタ
			addColumnPathMap(Upd01_RsltR.$wk_act_upd_cntr, MfgActReg_Chk04_RsltR.$wk_act_upd_cntr);                        // 工数実績更新カウンタ

		}
	}


	protected Map_MfgActReg_Chk05_RsltR_Upd01_RsltR<MfgActReg_Chk04_RsltR,Upd01_RsltR> createMap_MfgActReg_Chk05_RsltR_Upd01_RsltR() {
		return new Map_MfgActReg_Chk05_RsltR_Upd01_RsltR<MfgActReg_Chk04_RsltR, Upd01_RsltR>();
	}

	public class Map_MfgActReg_Chk05_RsltR_Upd01_RsltR<D extends MfgActReg_Chk04_RsltR, S extends Upd01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgActReg_Chk04_RsltR.$peg_no, Upd01_RsltR.$peg_no);                              // 紐付けＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$data_crud_typ, Upd01_RsltR.$data_crud_typ);                // データ更新区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$err_flg, Upd01_RsltR.$err_flg);                            // エラーフラグ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$inst_wk_act_flg, Upd01_RsltR.$inst_wk_act_flg);            // 指図工数実績
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_inst_no, Upd01_RsltR.$mfg_inst_no);                    // 製造指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$div_seq, Upd01_RsltR.$div_seq);                            // 分割連番
			addColumnPathMap(MfgActReg_Chk04_RsltR.$ac_dt, Upd01_RsltR.$ac_dt);                                // 計上日
			addColumnPathMap(MfgActReg_Chk04_RsltR.$old_ac_dt, Upd01_RsltR.$old_ac_dt);                        // 更新前計上日
			addColumnPathMap(MfgActReg_Chk04_RsltR.$itm_mfg_inst_no, Upd01_RsltR.$itm_mfg_inst_no);            // 品目製造指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_inst_no, Upd01_RsltR.$oper_inst_no);                  // 工程指図ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_schd_no, Upd01_RsltR.$wk_schd_no);                      // 工数予定ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_act_no, Upd01_RsltR.$mfg_act_no);                      // 製造実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$oper_act_no, Upd01_RsltR.$oper_act_no);                    // 工程実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_act_no, Upd01_RsltR.$wk_act_no);                        // 工数実績ＮＯ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$rtn_sts_typ, Upd01_RsltR.$rtn_sts_typ);                    // 処理結果状況区分
			addColumnPathMap(MfgActReg_Chk04_RsltR.$mfg_inst_upd_cntr, Upd01_RsltR.$mfg_inst_upd_cntr);        // 製造指図更新カウンタ
			addColumnPathMap(MfgActReg_Chk04_RsltR.$wk_act_upd_cntr, Upd01_RsltR.$wk_act_upd_cntr);            // 工数実績更新カウンタ

		}
	}

	protected Map_Upd01_RsltR_MfgActReg_Chk05_RsltR<Upd01_RsltR,MfgActReg_Chk04_RsltR> createMap_Upd01_RsltR_MfgActReg_Chk05_RsltR() {
		return new Map_Upd01_RsltR_MfgActReg_Chk05_RsltR<Upd01_RsltR, MfgActReg_Chk04_RsltR>();
	}

	public class Map_Upd01_RsltR_MfgActReg_Chk05_RsltR<D extends Upd01_RsltR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Upd01_RsltR.$peg_no, MfgActReg_Chk04_RsltR.$peg_no);                              // 紐付けＮＯ
			addColumnPathMap(Upd01_RsltR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);                // データ更新区分
			addColumnPathMap(Upd01_RsltR.$err_flg, MfgActReg_Chk04_RsltR.$err_flg);                            // エラーＦＬＧ
			addColumnPathMap(Upd01_RsltR.$inst_wk_act_flg, MfgActReg_Chk04_RsltR.$inst_wk_act_flg);            // 指図工数実績
			addColumnPathMap(Upd01_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);                    // 製造指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);                            // 分割連番
			addColumnPathMap(Upd01_RsltR.$ac_dt, MfgActReg_Chk04_RsltR.$ac_dt);                                // 計上日
			addColumnPathMap(Upd01_RsltR.$old_ac_dt, MfgActReg_Chk04_RsltR.$old_ac_dt);                        // 更新前計上日
			addColumnPathMap(Upd01_RsltR.$itm_mfg_inst_no, MfgActReg_Chk04_RsltR.$itm_mfg_inst_no);            // 品目製造指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$oper_inst_no, MfgActReg_Chk04_RsltR.$oper_inst_no);                  // 工程指図ＮＯ
			addColumnPathMap(Upd01_RsltR.$wk_schd_no, MfgActReg_Chk04_RsltR.$wk_schd_no);                      // 工数予定ＮＯ
			addColumnPathMap(Upd01_RsltR.$mfg_act_no, MfgActReg_Chk04_RsltR.$mfg_act_no);                      // 製造実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$oper_act_no, MfgActReg_Chk04_RsltR.$oper_act_no);                    // 工程実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);                        // 工数実績ＮＯ
			addColumnPathMap(Upd01_RsltR.$rtn_sts_typ, MfgActReg_Chk04_RsltR.$rtn_sts_typ);                    // 処理結果状況区分
			addColumnPathMap(Upd01_RsltR.$mfg_inst_upd_cntr, MfgActReg_Chk04_RsltR.$mfg_inst_upd_cntr);        // 製造指図更新カウンタ
			addColumnPathMap(Upd01_RsltR.$wk_act_upd_cntr, MfgActReg_Chk04_RsltR.$wk_act_upd_cntr);            // 工数実績更新カウンタ

		}
	}


	/**
	 * 製造指図ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Upd01_RsltR>> splitUp(MCList<Upd01_RsltR> list, int max) {
		List<MCList<Upd01_RsltR>> ret = new ArrayList<>();
		MCList<Upd01_RsltR>[] grpL = list.groupList(Upd01_RsltR.$mfg_inst_no);
		MCList<Upd01_RsltR> tmp = MCList.create(Upd01_RsltR.class);
		for (MCList<Upd01_RsltR> grp : grpL) {
			// 分割条件がnullの行は「１スレッドあたりの最大件数」に従って1件1件追加する
			if (isNull(grp.get(0).mfg_inst_no())) {
				for (Upd01_RsltR r :grp) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = MCList.create(Upd01_RsltR.class);
					}
					tmp.add(r);
				}
			}
			// 分割条件がnullでない行はグループごとに追加する
			else {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Upd01_RsltR.class);
				}
				tmp.addAll(grp);
			}
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	//FMCB CUSTOM END
}