package mcframe.serverMSLA.MSLAL6230;

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
import mcframe.serverMSLA.MSLAL6230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSBC.MSBCL6080.*;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import static mcframe.serverMSLA.MSLAL6230.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.commonCore.container.MCRow.Status;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverPF.dbc.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_WkActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_WkActRecvIfService_MC extends MSLAL_WkActRecvIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * WkActRecvIf_Upd01オペレーション.<p>
	 *
	 * 工数実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class WkActRecvIf_Upd01 extends MSLAL_WkActRecvIfService_MC_A.WkActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callWkActRecvIfUpd02();
		}

		/**
		 * WkActRecvIf_Upd02を実行する。
		 */
		protected void callWkActRecvIfUpd02() {
			MSLAL_WkActRecvIfService.WkActRecvIf_Upd02 ope = MSLAL_WkActRecvIfService.crtWkActRecvIf_Upd02();

			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());

			ope.exec();
		}

		protected Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR,Upd01_DtlR> createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR() {
			return new Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, Upd01_DtlR.$ext_sys_cd);
			}
		}
	}

	/**
	 * WkActRecvIf_Upd02オペレーション.<p>
	 *
	 * 工数実績受信ＩＦ取込を行う。（ＩＦデータ確認、および工数実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class WkActRecvIf_Upd02 extends MSLAL_WkActRecvIfService_MC_A.WkActRecvIf_Upd02 {

		/** 処理対象件数 **/
		protected int _totalNum = 0;

		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;

		/** エラー件数 **/
		protected int _errNum = 0;

		/** スキップ **/
		protected int _skipNum = 0;

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg = false;
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;

		/** 工数受信実績リスト(新規) **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _wkActLNew = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

		/** 工数受信実績リスト(更新) **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _wkActLUpd = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

		/** 工数受信実績リスト **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _wkActL = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();

				writeStartLog();

				preSrch();

				exe();

				setDown();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * 工数実績受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			// 工数実績データの取得
			getWkActL();

			// 計画外実績のデータ補完
			fillValForExtYieldAct();

			chkCrtWkActDupli();

			copyCrtToUpd();

			_wkActL.setAll(_wkActLNew);
			_wkActL.addAll(_wkActLUpd);

			_totalNum = _wkActL.size();

			setSkipForRecvExcluded();
		}

		/**
		 * 工数実績受信データを取得する。
		 */
		protected void getWkActL() {
			if (up0().isEmpty()) {
				// 新規工数の取得
				executeQuery(_wkActLNew, MSLAL6230_MST_WK_ACT_RECV_IF_S01());
				// 更新工数の取得
				executeQuery(_wkActLUpd, MSLAL6230_MST_WK_ACT_RECV_IF_S02());
				return;
			}

			if (up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg()) {
				// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
				// 同一外部システムデータNOのレコードをまとめて処理する
				MCList<MST_WK_ACT_RECV_IF_R> wkRL = getWkRecvL();
				// 新規工数の取得
				MCList<MST_WK_ACT_RECV_IF_R> wkRLCrt = wkRL.subList(MST_WK_ACT_RECV_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				if (!isNull(wkRLCrt)) {
					executeQuery(_wkActLNew, MSLAL6230_MST_WK_ACT_RECV_IF_S01(), wkRLCrt);
				}
				// 更新工数の取得
				MCList<MST_WK_ACT_RECV_IF_R> wkRLUpdDel = wkRL.subList(createUpdDelMatcher());
				if (!isNull(wkRLUpdDel)) {
					executeQuery(_wkActLUpd, MSLAL6230_MST_WK_ACT_RECV_IF_S02(), wkRLUpdDel);
				}
			}
			else {
				// 新規工数の取得
				executeQuery(_wkActLNew, MSLAL6230_MST_WK_ACT_RECV_IF_S01(), up0());
				// 更新工数の取得
				executeQuery(_wkActLUpd, MSLAL6230_MST_WK_ACT_RECV_IF_S02(), up0());
			}
		}

		protected MCList<MST_WK_ACT_RECV_IF_R> getWkRecvL() {
			MCList<MST_WK_ACT_RECV_IF_R> wkRL = MCList.create(MST_WK_ACT_RECV_IF_R.class);
			MST_WK_ACT_RECV_IF_R t = MST_WK_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder wkRL_bldr = MCQueryApiBuilder.create(t);

			wkRL_bldr.setDistinct();
			wkRL_bldr.setSelect(t.ext_data_no,t.ext_sys_cd,t.data_crud_typ);
			wkRL_bldr.setWhere(t.imp_flg.eq(value(true)));
			wkRL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
			wkRL_bldr.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
			wkRL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
			wkRL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));

			dbSelect("MSLAL6230_MST_WK_ACT_RECV_IF_S01", wkRL, wkRL_bldr, up0());

			return wkRL;
		}
		
		/**
		 * 計画外製造実績のデータ補完。
		 * 新規のデータのみを対象に補完を行う
		 */
		protected void fillValForExtYieldAct() {
			// 外部出来高実績ＮＯの値がセットされているデータがある場合、データの補完を行う
			if (isExistYieldActNo(_wkActLNew)) {
				MCList<MST_WK_ACT_RECV_IF_R> rsltNewL = MCList.create(MST_WK_ACT_RECV_IF_R.class);
				executeQuery(rsltNewL, MSLAL6230_MST_WK_ACT_RECV_IF_S03(), _wkActLNew);
				complementWkActNewL(_wkActLNew, rsltNewL);
			}
		}
		
		/**
		 * 外部出来高実績ＮＯがセットされているデータが1件以上存在するかチェック。
		 */
		protected boolean isExistYieldActNo(MCList<WkActRecvIf_Upd02_ActLstR> actL) {
			for (WkActRecvIf_Upd02_ActLstR actR : actL) {
				if (!isNull(actR.ext_yield_act_no())) {
					return true;
				}
			}
			return false;
		}
		
		protected void complementWkActNewL(MCList<WkActRecvIf_Upd02_ActLstR> trgtL, MCList<MST_WK_ACT_RECV_IF_R> complementL) {
			MCIndexKey rsltK = complementL.createIndex(MST_WK_ACT_RECV_IF_R.$data_lno);
			for (WkActRecvIf_Upd02_ActLstR r : trgtL) {
				MST_WK_ACT_RECV_IF_R complementR = complementL.getFirst(rsltK, r.data_lno());
				if (!isNull(complementR)) {
					complementWkActRecvIfNew(r, complementR);
				}
			}
		}
		
		protected void complementWkActRecvIfNew(WkActRecvIf_Upd02_ActLstR trgtData, MST_WK_ACT_RECV_IF_R complementData) {
			
			// 計画外実績のデータのみを補完対象とする
			boolean unschdActFlg = isDBBooleanVal(complementData.getStringNE("UNSCHD_ACT_FLG"));
			if (!unschdActFlg) {
				return;
			}
			
			// 計画外実績の場合、常に指図工数実績であるため、trueで上書きする
			trgtData.inst_wk_act_flg(true);
			
			// データが設定されている場合は補完を行わない
			if (isNull(trgtData.wk_schd_no())) {
				trgtData.wk_schd_no(complementData.wk_schd_no());
			}
			if (isNull(trgtData.oper_inst_no())) {
				trgtData.oper_inst_no(complementData.oper_inst_no());
			}
			if (isNull(trgtData.mfg_inst_no())) {
				trgtData.mfg_inst_no(complementData.mfg_inst_no());
			}
			if (isNull(trgtData.mfg_inst_rev())) {
				trgtData.mfg_inst_rev(complementData.mfg_inst_rev());
			}
			if (isNull(trgtData.oper_cd())) {
				trgtData.oper_cd(complementData.oper_cd());
			}
			if (isNull(trgtData.mfg_loc_cd())) {
				trgtData.mfg_loc_cd(complementData.getStringNE("MFG_LOC_CD"));
			}
			
			// 入力チェックの際に使用する値を補完する
			trgtData.setBooleanNE("unschdActFlg", unschdActFlg);
			MCNumber wkSchdActNum = complementData.getNumberNE("WK_SCHD_ACT_FLG");
			if (!isNull(wkSchdActNum) && wkSchdActNum.intValue() >= 1) {
				trgtData.wk_schd_act_flg(true);
			}
			else {
				trgtData.wk_schd_act_flg(false);
			}
		}
		
		protected boolean isDBBooleanVal(String val) {
			if (!isNull(val)) {
				if (MCBooleanUtil.dbStringToBoolean(val)) {
					return true;
				}
			}
			
			return false;
		}
		
		protected void chkCrtWkActDupli() {
			if (_wkActLNew.isEmpty()) {
				return;
			}

			// 新規工数の場合、外部システムＣＤ、外部工数実績ＮＯごとの件数を計算する
			MCGroupByPolicy extkeypolicy = new MCGroupByPolicy(getExtKeyCols());

			extkeypolicy.count(WkActRecvIf_Upd02_ActLstR.$ext_key_count);

			MCList<WkActRecvIf_Upd02_ActLstR> extkeyList = _wkActLNew.groupBy(extkeypolicy);

			MCIndexKey extkeyCountKey = _wkActLNew.createIndex(getExtKeyCols());

			extkeyList.forEach(r -> {
				MCList<WkActRecvIf_Upd02_ActLstR> itmList = _wkActLNew.subList(extkeyCountKey, 
						r.ext_wk_act_no(), r.ext_sys_cd());
				itmList.forEach(itmR -> {
					itmR.ext_key_count(r.ext_key_count());
				});
			});
		}

		protected String[] getExtKeyCols() {
			return new String[] {
					  WkActRecvIf_Upd02_ActLstR.$ext_wk_act_no
					, WkActRecvIf_Upd02_ActLstR.$ext_sys_cd
			};
		}
		
		protected void copyCrtToUpd() {
			MCIndexKey schdIk = _wkActLNew.createIndex(WkActRecvIf_Upd02_ActLstR.$ext_sys_cd, WkActRecvIf_Upd02_ActLstR.$ext_wk_act_no);
			for (WkActRecvIf_Upd02_ActLstR updR : _wkActLUpd) {
				if (!isNull(updR.wk_act_no()) ) {
					continue;
				}

				WkActRecvIf_Upd02_ActLstR newR = _wkActLNew.getFirst(schdIk, updR.ext_sys_cd(), updR.ext_wk_act_no());
				if (newR == null) {
					continue;
				}

				if (isNull(updR.mfg_inst_no())) {
					updR.mfg_inst_no(newR.mfg_inst_no());
					updR.inst_wk_act_flg(newR.inst_wk_act_flg());
				}
				if (isNull(updR.oper_inst_no())) {
					updR.oper_inst_no(newR.oper_inst_no());
				}
				if (isNull(updR.wk_schd_no())) {
					updR.wk_schd_no(newR.wk_schd_no());
				}
				if (isNull(updR.oper_cd())) {
					updR.oper_cd(newR.oper_cd());
				}
				if (isNull(updR.oper_seq())) {
					updR.oper_seq(newR.oper_seq());
				}
				if (isNull(updR.wk_cost_cd())) {
					updR.wk_cost_cd(newR.wk_cost_cd());
				}
				if (isNull(updR.mfg_loc_cd())) {
					updR.mfg_loc_cd(newR.mfg_loc_cd());
				}
				if (isNull(updR.mfg_inst_rev())) {
					updR.mfg_inst_rev_flg(false);
				}
				else {
					updR.mfg_inst_rev_flg(newR.mfg_inst_rev_flg());
				}

			}
			
		}

		/**
		 *  ＩＦ制御マスタの設定により、<br>
		 *  受信対象外の場合、スキップフラグを設定する。
		 */
		protected void setSkipForRecvExcluded() {
			if (isNull(_wkActL)) {
				return;
			}

			MCList<WkActRecvIf_Upd02_ActLstR> recvTgtL = getRecvTargetL();

			MCIndexKey rtIdx = recvTgtL.createIndex(getRecvTgtKeyCols());
			for (WkActRecvIf_Upd02_ActLstR actR : _wkActL) {
				WkActRecvIf_Upd02_ActLstR rtR = recvTgtL.getFirst(rtIdx, getRecvTgtKeyVals(actR));
				if (rtR == null) {
					actR.skip_by_if_ctl_flg(true);
				}
			}
		}

		protected MCList<WkActRecvIf_Upd02_ActLstR> getRecvTargetL() {
			MCList<WkActRecvIf_Upd02_ActLstR> rtL = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

			MCList<WkActRecvIf_Upd02_ActLstR>  chkL = getNoDupChkList();

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			MCNumber pegNo = MCNumber.ZERO;
			Map<MCNumber, WkActRecvIf_Upd02_ActLstR> condM = new HashMap<MCNumber, WkActRecvIf_Upd02_ActLstR>();
			for (WkActRecvIf_Upd02_ActLstR chkR : chkL) {
				SCMLinkUtil_Srch01_CndR upR = ope.up0().add();
				upR.peg_no(pegNo);
				upR.if_proc_typ(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value());
				upR.loc_cd(chkR.loc_cd());
				upR.oper_cd(chkR.oper_cd());
				upR.master_dt(chkR.recv_dt());
				upR.wk_cost_cd(chkR.wk_cost_cd());

				condM.put(pegNo, chkR);
				pegNo = pegNo.add(1);
			}

			ope.exec();

			for (SCMLinkUtil_Srch01_CndR r : ope.down0()) {
				if (isNull(r.ext_sys_cd())) {
					continue;
				}

				if (condM.containsKey(r.peg_no())) {
					WkActRecvIf_Upd02_ActLstR condR = condM.get(r.peg_no());
					rtL.add(condR);
				}
			}

			return rtL;
		}

		protected MCList<WkActRecvIf_Upd02_ActLstR> getNoDupChkList() {
			for (WkActRecvIf_Upd02_ActLstR actR : _wkActL) {
				if (isNull(actR.loc_cd())) {
					actR.loc_cd(actR.mfg_loc_cd());
				}
			}

			return _wkActL.groupBy(getRecvTgtKeyCols());
		}

		protected String[] getRecvTgtKeyCols() {
			return new String[] {
					  WkActRecvIf_Upd02_ActLstR.$loc_cd
					, WkActRecvIf_Upd02_ActLstR.$oper_cd
					, WkActRecvIf_Upd02_ActLstR.$recv_dt
					, WkActRecvIf_Upd02_ActLstR.$wk_cost_cd
			};
		}

		protected Comparable<?>[] getRecvTgtKeyVals(WkActRecvIf_Upd02_ActLstR actR) {
			return new Comparable<?>[] {
					  actR.loc_cd()
					, actR.oper_cd()
					, actR.recv_dt()
			};
		}


		/**
		 * 工数実績受信ＩＦ処理のメイン処理
		 */
		protected void exe() {
			callWkActRecvIfUpd03();
		}

		/**
		 * スレッドを分割し、各スレッドごとにWkActRecvIf_Upd03を実行する。
		 */
		protected void callWkActRecvIfUpd03() {
			if (_wkActL.isEmpty()) {
				return;
			}

			// スレッドを分割しない
			if (!isMultiThread()) {
				callSnglWkActRecvIfUpd03();
				return;
			}

			callMutliWkActRecvIfUpd03();
		}

		protected void callSnglWkActRecvIfUpd03() {
			MSLAL_WkActRecvIfService.WkActRecvIf_Upd03 upd03 = MSLAL_WkActRecvIfService.crtWkActRecvIf_Upd03();

			// 設定
			upd03._no = 1;
			upd03.up0().setAll(_wkActL);
			upd03.up1().if_upd_typ(up1().if_upd_typ());
			// 実行
			upd03.exec();

			// 実績取込の結果：　集計（総件数は集計済のため、不要）
			_okNum += upd03.down0().ok_num().intValue();
			_errNum += upd03.down0().err_num().intValue();
			_skipNum += upd03.down0().skip_num().intValue();
			_totalNum += upd03.down0().total_num().intValue();
		}

		protected void callMutliWkActRecvIfUpd03() {
			int no = 0;

			List<MSLAL_WkActRecvIfService.WkActRecvIf_Upd03> grpLAry = new ArrayList<>();

			// 製造指図ＮＯ、分割連番ごとにスレッドを分割する。
			for (MCList<WkActRecvIf_Upd02_ActLstR> grpL : _wkActL.groupList(WkActRecvIf_Upd02_ActLstR.$mfg_inst_no,WkActRecvIf_Upd02_ActLstR.$div_seq)) {
				MSLAL_WkActRecvIfService.WkActRecvIf_Upd03 upd03 = MSLAL_WkActRecvIfService.crtWkActRecvIf_Upd03();

				upd03._no = ++no;
				upd03.up0().setAll(grpL);
				upd03.up1().if_upd_typ(up1().if_upd_typ());

				grpLAry.add(upd03);
			}

			MCServerThreadManager.setCommitAndRollback(true);

			// 件数の多いスレッドを優先に実行する。
			Collections.sort(grpLAry, new Comparator<MSLAL_WkActRecvIfService.WkActRecvIf_Upd03>() {

				public int compare(MSLAL_WkActRecvIfService.WkActRecvIf_Upd03 o1, MSLAL_WkActRecvIfService.WkActRecvIf_Upd03 o2) {
					return (o1.up0().size() - o2.up0().size()) * -1;	// 降順
				}
			});

			MCServerThreadManager.invokeAndWait(grpLAry, FXBAL_BatchLogManager.class);

			// 工数実績取込の結果：　集計（総件数は集計済のため、不要）
			for (MSLAL_WkActRecvIfService.WkActRecvIf_Upd03 ope : grpLAry) {
				_okNum += ope.down0().ok_num().intValue();
				_errNum += ope.down0().err_num().intValue();
				_skipNum += ope.down0().skip_num().intValue();
				_totalNum += ope.down0().total_num().intValue();
			}
		}

		protected boolean isMultiThread() {
			if (MCServerThreadManager.getLimitThreadSize() <= 1) {
				return false;
			}

			// 実績一括受信バッチではIF更新区分が「エラーを無視して登録」の場合のみ、マルチスレッド実行を許可する
			if (up1().src_actlumprecv_flg() && MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) {
				return false;
			}

			return true;
		}

		/**
		 * 初期処理
		 */
		protected void initProc() {
			initLogger();

			editIfUpdTyp();
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}
			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			getConcurrentLogger();
		}

		/**
		 * ＩＦ更新区分：エラーを無視して登録かエラー行まで登録かにする。
		 */
		protected void editIfUpdTyp() {
			if (isNull(up1().if_upd_typ())) {
				up1().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			}
			else if (!MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				up1().if_upd_typ(MAC_IF_UPD_TYP.STOP_ERROR.value());
			}
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}

			logger().writeStartLog(MSLAL0151);

			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 * @param ex 例外
		 */
		protected void handleEx(Exception ex) {
			MCException mcEx;

			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}

			if (!up1().src_actlumprecv_flg()) {
				logger().writeProcessLog(mcEx);
			}

			_exceptionFlg = true;

			throw mcEx;
		}

		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}

			if (_errNum > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}

			logger().writeEndLog(MSLAL0152, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}

		protected MCRowMatcher<MST_WK_ACT_RECV_IF_R> createUpdDelMatcher() {
			return new UpdOrDelMatcher<MST_WK_ACT_RECV_IF_R>();
		}

		public class UpdOrDelMatcher<T extends MST_WK_ACT_RECV_IF_R> implements MCRowMatcher<T> {
			@Override
			public boolean match(T row) {

				if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
					return true;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
					return true;
				}
				return false;
			}
		}
	}
	
	/**
	 * WkActRecvIf_Upd03オペレーション.<p>
	 *
	 * 工数実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class WkActRecvIf_Upd03 extends MSLAL_WkActRecvIfService_MC_A.WkActRecvIf_Upd03 {
		/** WkActRecvIf_Upd04を呼び出す際に、ループサイズを指定する **/
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6230.loop_size", 100);

		/** 処理対象件数 **/
		protected int _totalNum = 0;
		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;
		/** エラー件数 **/
		protected int _errNum = 0;
		/** スキップ件数 **/
		protected int _skipNum = 0;

		/**
		 * バッチログのlogger<br>
		 * MfgActRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		/**
		 * インスタンス生成元（MfgActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

		/** 工数実績受信ＩＦ **/
		protected MCList<MST_WK_ACT_RECV_IF_R> _wkActIFL = null;
		protected MST_WK_ACT_RECV_IF_R _wkActIFL_t = null;
		protected MCQueryApiBuilder _wkActIFL_bldr = null;
		/** 工数実績受信ＩＦインデックス **/
		protected MCIndexKey _wkActIFIdx = null;

		/**
		 * MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<WkActRecvIf_Upd02_ActLstR> _exeRslt = null;

		/** 工数実績登録ＯＫリスト **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _okActL   = MCList.create(WkActRecvIf_Upd02_ActLstR.class);
		/** 工数実績スキップリスト **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _skipActL = MCList.create(WkActRecvIf_Upd02_ActLstR.class);
		/** 工数実績エラーリスト **/
		protected MCList<WkActRecvIf_Upd02_ActLstR> _errActL  = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

		/** エラー発生受信実績キーＭａｐ（キー：外部システムＣＤ、値：外部システムデータＮＯリスト「昇順」） **/
		protected Map<String, TreeSet<MCNumber>> _errKeyMap = new HashMap<String, TreeSet<MCNumber>>();

		/** 重複取込不可チェック用キャッシュ **/
		protected Map<String, WkActRecvIf_Upd02_ActLstR> _notDupImpM = new HashMap<String, WkActRecvIf_Upd02_ActLstR>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();

				exe();

				setDown();
			}
			finally {
				closeLogger();
				clearCache();
			}
		}

		/**
		 * 実績受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {
			// ソートする
			up0().sort(getActSortPolicy());

			// データログ関連キーの設定
			setWkActLogKey(up0());

			// 実績登録処理の呼び出し
			dealWithRegActArray(up0());
		}

		/**
		 * ソート順
		 */
		protected MCSortPolicy getActSortPolicy() {
			MCSortPolicy stPlcy = new MCSortPolicy();

			stPlcy.add(SortType.ASC, WkActRecvIf_Upd02_ActLstR.$ext_sys_cd);    // 外部システムＣＤ
			stPlcy.add(SortType.ASC, WkActRecvIf_Upd02_ActLstR.$ext_data_no);   // 外部システムデータＮＯ
			stPlcy.add(SortType.ASC, WkActRecvIf_Upd02_ActLstR.$ext_data_lno);  // 外部システムデータ行ＮＯ
			stPlcy.add(SortType.ASC, WkActRecvIf_Upd02_ActLstR.$data_no);       // データＮＯ
			stPlcy.add(SortType.ASC, WkActRecvIf_Upd02_ActLstR.$data_lno);      // データ行ＮＯ

			return stPlcy;
		}

		/**
		 * まとめ可能なデータを集めてから、実績登録処理を呼び出す。
		 * @param subL 実績登録対象データの組
		 */
		protected void dealWithRegActArray(MCList<WkActRecvIf_Upd02_ActLstR> subL) {
			WkActRecvIf_Upd02_ActLstR hdrR = WkActRecvIf_Upd02_ActLstR.create();
			MCList<WkActRecvIf_Upd02_ActLstR> tgtL = MCList.create(WkActRecvIf_Upd02_ActLstR.class);

			// まとめ単位の指定に従い、まとめ可能なデータを集めて、実績登録処理を呼び出す。
			Map<String, MCNumber> skipExtNoM = new HashMap<String, MCNumber>();
			for (int i = 0; i < subL.size(); i++) {
				WkActRecvIf_Upd02_ActLstR actR = subL.get(i);
				if (isNotRegAct(actR)) {
					continue;
				}

				setBaseStatusItems(actR);

				calcWkActCost(actR);

				if (!tgtL.isEmpty() && (isNextExecUnit(hdrR, actR) || _loopCnt <= tgtL.size())) {
					callWkActRecvIfUpd04(tgtL, skipExtNoM);
					tgtL.clear();
					skipExtNoM.clear();
				}

				hdrR = actR;
				tgtL.add(actR);

				if (actR.isStatusCreate()) {
					setCrtWkActNoCache(getCacheKey(actR.ext_sys_cd(), actR.ext_wk_act_no()), MAC_STR.NULL_VAL.value());
				}
				else {
					skipExtNoM.put(actR.ext_wk_act_no(), actR.ext_data_no());
				}
			}

			// 後ろにある工数受信実績を登録する。
			callWkActRecvIfUpd04(tgtL, skipExtNoM);
		}

		protected boolean isNextExecUnit(WkActRecvIf_Upd02_ActLstR hdrR, WkActRecvIf_Upd02_ActLstR curR) {
			// 製造指図ＮＯが変わった場合、次の実行単位とする。
			if (!isSame(hdrR.mfg_inst_no(), curR.mfg_inst_no())) {
				return true;
			}
			// 外部システムＣＤが変わった場合、次の実行単位とする。
			if (!isSame(hdrR.ext_sys_cd(), curR.ext_sys_cd())) {
				return true;
			}

			// データ更新区分「取消・新規・訂正」が変わった場合、次の実行単位とする。
			if (!isSame(hdrR.data_crud_typ(), curR.data_crud_typ())) {
				return true;
			}

			return false;
		}

		protected void setBaseStatusItems(WkActRecvIf_Upd02_ActLstR actR) {
			actR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());

			if (MAC_DATA_CRUD_TYP.isCRT(actR.data_crud_typ())) {
				actR.setStatus(Status.CREATE);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(actR.data_crud_typ())) {
				actR.setStatus(Status.MODIFY);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				actR.setStatus(Status.DELETE);
			}
		}

		protected boolean isNotRegAct(WkActRecvIf_Upd02_ActLstR actR) {
			//  ＩＦ制御マスタによりスキップ行
			if (actR.inst_wk_act_flg() && actR.skip_by_if_ctl_flg()) {
				setAsNotImpl(actR);
				return true;
			}

			// ＩＦ更新区分：エラーを無視して登録以外の場合、エラー行以降の行をスキップ対象とする。
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(actR)) {
				setAsNotImpl(actR);
				return true;
			}

			// 新規の場合、外部システムＣＤ＋外部工数実績ＮＯが重複すると、エラーとなる
			if (MAC_DATA_CRUD_TYP.isCRT(actR.data_crud_typ())) {
				if (actR.ext_key_count().intValue() > 1) {
					MCMessagePool.add(actR, null, MSLAL0114, actR.data_no(), actR.data_lno(), actR.ext_wk_act_no(), actR.ext_sys_cd());
					setErrFlag(actR);
					return true;
				}

				// 新規の場合、外部システムＣＤ、外部工数実績ＮＯが工数実績に存在すると、エラーを出す
				if (actR.ext_key_act_flg()) {
					MCMessagePool.add(actR, null, MSLAL0115, actR.data_no(), actR.data_lno(), actR.ext_wk_act_no(), actR.ext_sys_cd());
					setErrFlag(actR);
					return true;
				}

				// 重複取込不可チェック
				if (isNotDupImpWk(actR)) {
					MCMessagePool.add(actR, null, MSLAL0148, actR.data_no(), actR.data_lno(), actR.wk_schd_no());
					setErrFlag(actR);
					return true;
				}
				
				// 計画外実績の場合
				if (actR.getBooleanNE("unschdActFlg")) {
					// 工数管理ＣＤの必須チェック
					if (isNull(actR.wk_cost_cd())) {
						MCMessagePool.add(actR, null, MSLAL0619, actR.data_no(), actR.data_lno());
						setErrFlag(actR);
						return true;
					}
				}
			}
			// 訂正・取消の場合、工数実績ＮＯが特定できない場合、エラーとなる
			else {
				// 今回の受信処理で登録成功した場合、工数実績ＮＯを設定する。
				if (isNull(actR.wk_act_no())) {
					actR.wk_act_no(getCrtWkActNoCache(getCacheKey(actR.ext_sys_cd(), actR.ext_wk_act_no())));
				}
				if (isNull(actR.wk_act_no())) {
					MCMessagePool.add(actR, null, MSLAL0128, actR.data_no(), actR.data_lno(), actR.ext_wk_act_no(), actR.ext_sys_cd());
					setErrFlag(actR);
					return true;
				}
			}

			// 指図工数の場合
			if (actR.inst_wk_act_flg()) {
				// 同じ「製造指図ＮＯ、工程コード、工程連番」で、複数工程指図ＮＯがある場合、エラーとなる
				if (actR.oper_wk_count().intValue() > 1) {
					MCMessagePool.add(actR, null, MSLAL0085, MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					return true;
				}
			}
			// 指図外工数の場合
			else {
				// 部門ＣＤがない場合、エラーとなる
				if (isNull(actR.dpt_cd()) && !MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					MCMessagePool.add(actR, null, MSLAL0155, actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					return true;
				}
				// 品目が入力されたら、場所ＣＤがない場合、エラーとなる
				if (isNull(actR.loc_cd()) && !isNull(actR.itm_cd()) && !MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					MCMessagePool.add(actR, null, MSLAL0154, actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					return true;
				}
				//  ＩＦ制御マスタによりスキップ行
				if (actR.skip_by_if_ctl_flg()) {
					setAsNotImpl(actR);
					return true;
				}
			}

			if (!MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				// 工数管理ＣＤが特定できない場合、エラーとする。
				if (isNull(actR.wk_cost_cd())) {
					MCMessagePool.add(actR, null, MSLAL0116, actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					return true;
				}

				// 計上日は必須、運用日付以前
				if (isNull(actR.ac_dt()) || !isBeforeAfter(actR.ac_dt(), getToday())) {
					MCMessagePool.add(actR, null, MSLAL0101, actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					return true;
				}
	
				// 製造指図改訂番号チェック
				if (actR.mfg_inst_rev_flg() && !isNull(actR.mfg_inst_no())) {
					MCMessagePool.add(actR, null, MSLAL0150, actR.data_no(), actR.data_lno(), actR.mfg_inst_no());
					setErrFlag(actR);
					return true;
				}
			}

			return false;
		}

		/**
		 * ＩＦ制御マスタ「重複取込不可」がオンの場合、<br>
		 * 同じ工数予定ＮＯにおいて、複数回（外部システムデータＮＯ＋外部システムＣＤ）実績の取り込みであるかどうか判断する。
		 * @param aR 実績対象
		 * @return true: 複数回取込, false: それ以外
		 */
		protected boolean isNotDupImpWk(WkActRecvIf_Upd02_ActLstR aR) {
			if (!aR.not_dup_imp_flg()) {
				return false;
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) || isNull(aR.wk_schd_no())) {
				return false;
			}

			if (aR.wk_schd_act_flg()) {
				return true;
			}

			String ndkey = aR.wk_schd_no() + MAC_STR.CD_NM_DLM.value() + aR.div_seq();
			WkActRecvIf_Upd02_ActLstR bfR = _notDupImpM.get(ndkey);
			if (bfR == null) {
				_notDupImpM.put(ndkey, aR);
				return false;
			}

			if (isSame(bfR.ext_data_no(), aR.ext_data_no()) && isSame(bfR.ext_sys_cd(), aR.ext_sys_cd())) {
				return false;
			}

			return true;
		}

		/**
		 * WkActRecvIfUpd04を呼び出す。
		 * @param tgtL 工数実績登録対象
		 * @param skipExtNoM スキップ古いデータマップ
		 */
		protected void callWkActRecvIfUpd04(MCList<WkActRecvIf_Upd02_ActLstR> tgtL, Map<String, MCNumber> skipExtNoM) {
			// 工数実績受信ＩＦのロック
			lockWkActRecvIf(tgtL);

			exceptNotRegWkAct(tgtL, skipExtNoM);

			// 工数実績登録処理を呼び出す。
			MSLAL_WkActRecvIfService.WkActRecvIf_Upd04 ope = MSLAL_WkActRecvIfService.crtWkActRecvIf_Upd04();
			ope.up0().setAll(tgtL);
			ope.up1().if_upd_typ(up1().if_upd_typ());
			ope.exec();

			// 処理結果の集計
			mergeExeRslt(ope.down0());

			// 実績登録の後処理
			afterCall();

			// ワークテーブルのデータを削除
			delWkActRecvIfWk();
		}

		protected void exceptNotRegWkAct(MCList<WkActRecvIf_Upd02_ActLstR> wkL, Map<String, MCNumber> skipExtNoM) {
			if (wkL.isEmpty()) {
				return;
			}

			// 全てロックできない場合、クリアする。
			if (_wkActIFL.isEmpty()) {
				_skipNum += wkL.size();
				wkL.clear();
				return;
			}

			for (int i = wkL.size() -1 ; i >= 0 ; i--) {
				WkActRecvIf_Upd02_ActLstR wkR = wkL.get(i);

				// ロックできない行をスキップ
				if (_wkActIFL.getFirst(_wkActIFIdx, wkR.data_lno()) == null) {
					_skipNum++;
					wkL.remove(i);
				}
				// 外部システムデータＮＯが大きいデータを取り込む。小さいほうがあれば、スキップする。
				if (skipExtNoM.containsKey(wkR.ext_wk_act_no())) {
					if (skipExtNoM.get(wkR.ext_wk_act_no()).gt(wkR.ext_data_no())) {
						MCMessagePool.add(wkR, null, MSLAL0072, MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), wkR.data_no(), wkR.data_lno());
						setSkipFlag(wkR);
						wkL.remove(i);
					}
				}
			}
		}

		protected void calcWkActCost(WkActRecvIf_Upd02_ActLstR wkR) {
			if (wkR.isStatusDelete()) {
				return;
			}

			if (!isNull(wkR.wk_cost()) && wkR.wk_cost().isPositive()) {
				return;
			}

			if (wkR.wk_cost_calc_upd_flg() && !isNull(wkR.end_hm()) && !isNull(wkR.st_hm())) {
				// 着手・終了時刻と中断時間から工数を求める
				wkR.wk_cost(wkR.end_hm().diffMinute(wkR.st_hm()));
				if (!isNull(wkR.brk_pd())) {
					wkR.wk_cost(wkR.wk_cost().subtract(wkR.brk_pd()));
				}
			}

			if (isNull(wkR.wk_cost())) {
				wkR.wk_cost(MCNumber.ZERO);
			}
		}

		protected void mergeExeRslt(MCList<WkActRecvIf_Upd02_ActLstR> downL) {
			for (WkActRecvIf_Upd02_ActLstR r : downL) {
				if (r.err_flg()) {
					setErrFlag(r);
				}
				else {
					setOkFlag(r);
				}
			}
		}

		protected void setWkActLogKey(MCList<WkActRecvIf_Upd02_ActLstR> actL) {
			actL.forEach(r -> {
				r.setParamIndex(_no);
			});

			_logger.setLogKey(actL,
					WkActRecvIf_Upd02_ActLstR.$batch_log_no,
					WkActRecvIf_Upd02_ActLstR.$log_sub_key1,
					WkActRecvIf_Upd02_ActLstR.$log_sub_key2);
		}

		protected void lockWkActRecvIf(MCList<WkActRecvIf_Upd02_ActLstR> actL) {
			MSW_WK_ACT_RECV_IF_KEY_R w1 = MSW_WK_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			_wkActIFL = MCList.create(MST_WK_ACT_RECV_IF_R.class);

			for (WkActRecvIf_Upd02_ActLstR actR : actL) {
				MST_WK_ACT_RECV_IF_R ifR = MST_WK_ACT_RECV_IF_R.create();
				ifR.data_lno(actR.data_lno());
				_wkActIFL.add(ifR);
			}

			for (WkActRecvIf_Upd02_ActLstR actR : _errActL) {
				MST_WK_ACT_RECV_IF_R ifR = MST_WK_ACT_RECV_IF_R.create();
				ifR.data_lno(actR.data_lno());
				_wkActIFL.add(ifR);
			}

			for (WkActRecvIf_Upd02_ActLstR actR : _skipActL) {
				MST_WK_ACT_RECV_IF_R ifR = MST_WK_ACT_RECV_IF_R.create();
				ifR.data_lno(actR.data_lno());
				_wkActIFL.add(ifR);
			}

			_wkActIFL_t = MST_WK_ACT_RECV_IF_R.create("T");
			_wkActIFL_bldr = MCQueryApiBuilder.create(_wkActIFL_t);

			dbWkDelete("MSLAL6230_MSW_WK_ACT_RECV_IF_D01", _wkActIFL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6230_MSW_WK_ACT_RECV_IF_I01", _wkActIFL, _wkActIFL_bldr.getBaseDbc());

			_wkActIFL_bldr.setSelect(_wkActIFL_t.data_lno);
			_wkActIFL_bldr.addSelect(_wkActIFL_t.data_no);

			_wkActIFL_bldr.addInnerJoin(w1, bracket(_wkActIFL_t.data_lno.eq(w1.data_lno)));
			_wkActIFL_bldr.addLeftOuterJoin(t2, _wkActIFL_t.data_no.eq(t2.data_no));

			_wkActIFL_bldr.setWhere(value(0).eq(value(0)));
			_wkActIFL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_wkActIFL_bldr.addWhereWithAnd(_wkActIFL_t.imp_flg.eq(value(true)));
			_wkActIFL_bldr.addOrderByAsc(_wkActIFL_t.data_lno);
			_wkActIFL_bldr.setLockTable(_wkActIFL_t.data_lno);

			dbSelectForUpdate("MSLAL6230_MST_WK_ACT_RECV_IF_S02", _wkActIFL, _wkActIFL_bldr);

			_wkActIFIdx = _wkActIFL.createIndex(MST_WK_ACT_RECV_IF_R.$data_lno);
		}
		
		/**
		 * 工数実績受信ＩＦワークテーブルのデータを削除する。
		 */
		protected void delWkActRecvIfWk() {
			if (!isNull(_wkActIFL)) {
				dbWkDelete("MSLAL6230_MSW_WK_ACT_RECV_IF_D02", _wkActIFL_bldr.getBaseDbc());
			}
		}

		/**
		 *工数実績受信ＩＦ取込の後処理。
		 */
		protected void afterCall() {
			// 処理結果の保存
			updIf();

			// メッセージの出力
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);

			dbTran().commit();

			msgList.clear();
		}

		/**
		 * 工数実績受信ＩＦを更新する。
		 */
		protected void updIf() {
			// 更新対象テーブル
			MCList<MST_WK_ACT_RECV_IF_R> wkL = MCList.create(MST_WK_ACT_RECV_IF_R.class);

			// 更新データ設定
			setUpdIfData(wkL, _okActL);
			setUpdIfData(wkL, _errActL);
			setUpdIfData(wkL, _skipActL);

			// 更新処理の実行
			if (!wkL.isEmpty()) {
				MST_WK_ACT_RECV_IF_R t = MST_WK_ACT_RECV_IF_R.create("T");
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
				wkL_bldr.setSet(
						t.imp_flg,
						t.exe_sts_typ,
						t.batch_log_no,
						t.log_sub_key1,
						t.log_sub_key2);
				dbUpdateKey("MSLAL6230_MST_WK_ACT_RECV_IF_U01", wkL, wkL_bldr);
			}

			_okActL.clear();
			_errActL.clear();
			_skipActL.clear();
		}

		protected void setUpdIfData(MCList<MST_WK_ACT_RECV_IF_R> wkL, 
									MCList<WkActRecvIf_Upd02_ActLstR> rstL) {
			if (rstL.isEmpty()) {
				return;
			}

			for (WkActRecvIf_Upd02_ActLstR rstR : rstL) {
				MST_WK_ACT_RECV_IF_R uR = MST_WK_ACT_RECV_IF_R.create();
				uR.data_lno(rstR.data_lno());
				uR.imp_flg(rstR.imp_flg());
				uR.exe_sts_typ(rstR.exe_sts_typ());
				uR.batch_log_no(rstR.batch_log_no());
				uR.log_sub_key1(rstR.log_sub_key1());
				uR.log_sub_key2(rstR.log_sub_key2());
				wkL.add(uR);
			}
		}

		protected String[] getWkUpdIfCols() {
			return new String[] {
					MST_WK_ACT_RECV_IF_R.$imp_flg,
					MST_WK_ACT_RECV_IF_R.$exe_sts_typ,
					MST_WK_ACT_RECV_IF_R.$batch_log_no,
					MST_WK_ACT_RECV_IF_R.$log_sub_key1,
					MST_WK_ACT_RECV_IF_R.$log_sub_key2
			};
		}

		protected void setOkFlag(WkActRecvIf_Upd02_ActLstR aR) {
			aR.err_flg(false);
			aR.imp_flg(false);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());

			// ok集計
			_okNum++;
			_okActL.add(aR);
		}

		protected void setSkipFlag(WkActRecvIf_Upd02_ActLstR aR) {
			aR.err_flg(false);
			aR.imp_flg(false);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());

			// skip集計
			_skipNum++;
			_skipActL.add(aR);
		}

		protected void setAsNotImpl(WkActRecvIf_Upd02_ActLstR aR) {
			// 「未処理のままにする」ため、総数から減らし、ＩＦテーブルも更新しない
			_totalNum--;
			aR.err_flg(false);
		}

		protected void setErrFlag(WkActRecvIf_Upd02_ActLstR aR) {
			// エラーＦＬＧ設定
			aR.err_flg(true);
			aR.imp_flg(true);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());

			// エラー集計
			_errNum++;
			_errActL.add(aR);

			// エラーの外部システムデータＮＯを記憶
			setErrKeyMap(aR);
		}

		protected void setErrKeyMap(WkActRecvIf_Upd02_ActLstR aR) {
			// エラー発生受信実績キーの設定
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				valL = new TreeSet<MCNumber>();
			}

			valL.add(aR.ext_data_no());
			_errKeyMap.put(aR.ext_sys_cd(), valL);
		}

		protected boolean isExtDataNoHasErr(WkActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				return false;
			}

			return valL.contains(aR.ext_data_no());
		}

		protected boolean isAfterErrExtDataNo(WkActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null || valL.isEmpty()) {
				return false;
			}

			return aR.ext_data_no().gt(valL.first());
		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			initLogger();
			initCache();
		}

		/**
		 * バッチログのインスタンスを取得する。
		 */
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		/**
		 * バッチログをクローズする。
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				if (_logger != null) {
					_logger.close();
				}
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
			down0().total_num(_totalNum);
		}
	}

	/**
	 * WkActRecvIf_Upd04オペレーション.<p>
	 *
	 * 工数実績受信ＩＦ取込を行う。（工数実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class WkActRecvIf_Upd04 extends MSLAL_WkActRecvIfService_MC_A.WkActRecvIf_Upd04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}

			initProc();
			proc();
		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			// ソートする
			up0().sort(getSortPolicy());
			lockMfgHdr();
		}

		/**
		 * ソート順
		 */
		protected MCSortPolicy getSortPolicy() {
			MCSortPolicy stPlcy = new MCSortPolicy();

			stPlcy.add(SortType.ASC,  WkActRecvIf_Upd02_ActLstR.$ext_sys_cd);   // 外部システムＣＤ
			stPlcy.add(SortType.ASC,  WkActRecvIf_Upd02_ActLstR.$ext_data_no);  // 外部システムデータＮＯ
			stPlcy.add(SortType.ASC,  WkActRecvIf_Upd02_ActLstR.$ext_data_lno); // 外部システムデータ行ＮＯ

			return stPlcy;
		}
		protected void lockMfgHdr() {
			// 製造指図のロック
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(mfgInstL_t);
			dbSelectKeyForUpdate("MSLAL6230_MST_MFG_INST_S01", mfgInstL, mfgInstL_bldr, up0());
		}

		/**
		 * 登録処理
		 */
		protected void proc() {
			MCSavepoint sp = null;

			try {
				sp = setSavepoint();

				callWkActRcptIfService();
			}
			catch (Exception ex) {
				handleEx(ex, sp, up0());
			}
			finally {
				sp = null;
			}
		}

		/**
		 * 取込単位ごとのセーブポイントを作成する
		 */
		protected MCSavepoint setSavepoint() {
			return dbTran().setSavepoint();
		}

		/**
		 * 工数実績受信IFサービスの呼出
		 */
		protected void callWkActRcptIfService() {
			if((MAC_DATA_CRUD_TYP.isDEL(up0().get(0).data_crud_typ()))) {
				callWkActDel();
			}
			else {
				callWkActUpd();
			}
		}

		protected void setPegNo(Map<MCNumber, WkActRecvIf_Upd02_ActLstR> upPegNoM) {
			MCNumber pegNo = MCNumber.ZERO;
			
			for (WkActRecvIf_Upd02_ActLstR uR : up0()) {
				uR.peg_no(pegNo);
				upPegNoM.put(pegNo, uR);

				pegNo = pegNo.add(1);
			}
		}

		protected void callWkActUpd() {
			MSBCL_MfgActRcptIFService.MfgActIF_Upd02 oUpd = MSBCL_MfgActRcptIFService.crtMfgActIF_Upd02();

			oUpd.up0().if_upd_typ(up1().if_upd_typ());
			oUpd.up0().upd_cntr_chk_flg(false);
			oUpd.up0().is_src_batch_flg(true);
			oUpd.up0().not_commit_flg(true);

			Map<MCNumber, WkActRecvIf_Upd02_ActLstR> upPegNoM = new HashMap<MCNumber, WkActRecvIf_Upd02_ActLstR>();
			setPegNo(upPegNoM);

			addAll(oUpd.up1(), up0(), createMap_MfgActIF_Upd02_RsltR_WkActRecvIf_Upd02_ActLstR());

			oUpd.exec();

			for (MfgActIF_Upd02_RsltR dnR : oUpd.down0()) {
				WkActRecvIf_Upd02_ActLstR upR = upPegNoM.remove(dnR.peg_no());
				if (upR == null || isNull(upR.ext_wk_act_no())) {
					continue;
				}

				if (dnR.err_flg()) {
					setErrResult(upR);
				} else {
					setOkResult(upR);
				}

				if(!(MAC_DATA_CRUD_TYP.isCRT(up0().get(0).data_crud_typ()))) {
					continue;
				}
				if (dnR.err_flg() || isNull(dnR.wk_act_no())) {
					continue;
				}

				setCrtWkActNoCache(getCacheKey(upR.ext_sys_cd(), upR.ext_wk_act_no()), dnR.wk_act_no());
			}

			for (Map.Entry<MCNumber, WkActRecvIf_Upd02_ActLstR> entry : upPegNoM.entrySet()) {
				setErrResult(entry.getValue());
			}
		}

		protected void callWkActDel() {
			MSBCL_MfgActRcptIFService.MfgActIF_Del02 oDel = MSBCL_MfgActRcptIFService.crtMfgActIF_Del02();

			oDel.up0().if_upd_typ(up1().if_upd_typ());
			oDel.up0().upd_cntr_chk_flg(false);
			oDel.up0().is_src_batch_flg(true);
			oDel.up0().not_commit_flg(true);

			Map<MCNumber, WkActRecvIf_Upd02_ActLstR> upPegNoM = new HashMap<MCNumber, WkActRecvIf_Upd02_ActLstR>();
			setPegNo(upPegNoM);

			addAll(oDel.up1(), up0(), createMap_MfgActIF_Del02_RsltR_WkActRecvIf_Upd02_ActLstR());

			oDel.exec();

			for (MfgActIF_Upd02_RsltR dnR : oDel.down0()) {
				WkActRecvIf_Upd02_ActLstR upR = upPegNoM.remove(dnR.peg_no());
				if (upR == null) {
					continue;
				}
				if (dnR.err_flg()) {
					setErrResult(upR);
				} else {
					setOkResult(upR);
				}
			}

			for (Map.Entry<MCNumber, WkActRecvIf_Upd02_ActLstR> entry : upPegNoM.entrySet()) {
				setErrResult(entry.getValue());
			}
		}

		/**
		 * 工数実績登録処理でエラーが発生した場合の処理。
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<WkActRecvIf_Upd02_ActLstR> list) {
			String msgId = null;
			String msg = null;
			MCMessageList causeMsgList = null;

			if (ex instanceof MCException) {
				MCException mcex = (MCException) ex;
				msgId = mcex.getID();
				msg = mcex.getMCMessage().toString();
				causeMsgList = mcex.getCauseMessageList();
			}
			else {
				msgId = ex instanceof MCException ? ((MCException) ex).getID() : null;
				msg = ex.toString();
				causeMsgList = new MCMessageList();
			}

			for (WkActRecvIf_Upd02_ActLstR wkRow : list) {
				MCMessagePool.add(wkRow, null, MSLAL0153, wkRow.data_no(), wkRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(wkRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}

				setErrResult(wkRow);
			}

			if (sp != null) {
				dbTran().rollback(sp);
			}
		}

		/**
		 * 処理結果区分にOKを設定
		 * 
		 * @param recvR
		 */
		protected void setOkResult(WkActRecvIf_Upd02_ActLstR recvR) {
			recvR.err_flg(false);
			recvR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());

			down0().add(recvR);
		}

		/**
		 * 処理結果区分にエラーを設定
		 * 
		 * @param recvR
		 */
		protected void setErrResult(WkActRecvIf_Upd02_ActLstR recvR) {
			recvR.err_flg(true);
			recvR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());

			down0().add(recvR);
		}

		protected Map_MfgActIF_Upd02_RsltR_WkActRecvIf_Upd02_ActLstR<MfgActIF_Upd02_RsltR,WkActRecvIf_Upd02_ActLstR> createMap_MfgActIF_Upd02_RsltR_WkActRecvIf_Upd02_ActLstR() {
			return new Map_MfgActIF_Upd02_RsltR_WkActRecvIf_Upd02_ActLstR<MfgActIF_Upd02_RsltR, WkActRecvIf_Upd02_ActLstR>();
		}

		public class Map_MfgActIF_Upd02_RsltR_WkActRecvIf_Upd02_ActLstR<D extends MfgActIF_Upd02_RsltR, S extends WkActRecvIf_Upd02_ActLstR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 紐づけＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$peg_no, WkActRecvIf_Upd02_ActLstR.$peg_no);
				// データ更新区分
				addColumnPathMap(MfgActIF_Upd02_RsltR.$data_crud_typ, WkActRecvIf_Upd02_ActLstR.$data_crud_typ);
				// 指図工数実績
				addColumnPathMap(MfgActIF_Upd02_RsltR.$inst_wk_act_flg, WkActRecvIf_Upd02_ActLstR.$inst_wk_act_flg);
				// 製造指図ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$mfg_inst_no, WkActRecvIf_Upd02_ActLstR.$mfg_inst_no);
				// 分割連番
				addColumnPathMap(MfgActIF_Upd02_RsltR.$div_seq, WkActRecvIf_Upd02_ActLstR.$div_seq);
				// 工程ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$oper_cd, WkActRecvIf_Upd02_ActLstR.$oper_cd);
				// 工数管理ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_cost_cd, WkActRecvIf_Upd02_ActLstR.$wk_cost_cd);
				// 計上日
				addColumnPathMap(MfgActIF_Upd02_RsltR.$ac_dt, WkActRecvIf_Upd02_ActLstR.$ac_dt);
				// 中断時間
				addColumnPathMap(MfgActIF_Upd02_RsltR.$brk_pd, WkActRecvIf_Upd02_ActLstR.$brk_pd);
				// 打切
				addColumnPathMap(MfgActIF_Upd02_RsltR.$abort_flg, WkActRecvIf_Upd02_ActLstR.$abort_flg);
				// 勤務種類ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_day_cd, WkActRecvIf_Upd02_ActLstR.$wk_day_cd);
				// 工数理由ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_rsn_cd, WkActRecvIf_Upd02_ActLstR.$wk_rsn_cd);
				// 部門ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$dpt_cd, WkActRecvIf_Upd02_ActLstR.$dpt_cd);
				// 場所ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$loc_cd, WkActRecvIf_Upd02_ActLstR.$loc_cd);
				// 棚・ラインＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$str_ln_cd, WkActRecvIf_Upd02_ActLstR.$str_ln_cd);
				// 作業者ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_usr_cd, WkActRecvIf_Upd02_ActLstR.$wk_usr_cd);
				// 作業者部門ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_usr_dpt_cd, WkActRecvIf_Upd02_ActLstR.$wk_usr_dpt_cd);
				// 設備
				addColumnPathMap(MfgActIF_Upd02_RsltR.$fclty, WkActRecvIf_Upd02_ActLstR.$fclty);
				// 品目ＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$itm_cd, WkActRecvIf_Upd02_ActLstR.$itm_cd);
				// 枝番１
				addColumnPathMap(MfgActIF_Upd02_RsltR.$itm_sub1, WkActRecvIf_Upd02_ActLstR.$itm_sub1);
				// 枝番２
				addColumnPathMap(MfgActIF_Upd02_RsltR.$itm_sub2, WkActRecvIf_Upd02_ActLstR.$itm_sub2);
				// 枝番３
				addColumnPathMap(MfgActIF_Upd02_RsltR.$itm_sub3, WkActRecvIf_Upd02_ActLstR.$itm_sub3);
				// ロットＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$lot_no, WkActRecvIf_Upd02_ActLstR.$lot_no);
				// サブロットＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$sublot_no, WkActRecvIf_Upd02_ActLstR.$sublot_no);
				// 手配ＮＯ１
				addColumnPathMap(MfgActIF_Upd02_RsltR.$sno1, WkActRecvIf_Upd02_ActLstR.$sno1);
				// 手配ＮＯ２
				addColumnPathMap(MfgActIF_Upd02_RsltR.$sno2, WkActRecvIf_Upd02_ActLstR.$sno2);
				// 手配ＮＯ３
				addColumnPathMap(MfgActIF_Upd02_RsltR.$sno3, WkActRecvIf_Upd02_ActLstR.$sno3);
				// 手配ＮＯ４
				addColumnPathMap(MfgActIF_Upd02_RsltR.$sno4, WkActRecvIf_Upd02_ActLstR.$sno4);
				// 工数予定ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_schd_no, WkActRecvIf_Upd02_ActLstR.$wk_schd_no);
				// 工程実績ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$oper_act_no, WkActRecvIf_Upd02_ActLstR.$oper_act_no);
				// 工数実績ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_act_no, WkActRecvIf_Upd02_ActLstR.$wk_act_no);

				// 内部備考（実績）
				addColumnPathMap(MfgActIF_Upd02_RsltR.$act_intr_rmrks, WkActRecvIf_Upd02_ActLstR.$wk_intr_rmrks);
				// 予備１
				addColumnPathMap(MfgActIF_Upd02_RsltR.$act_sub_char1, WkActRecvIf_Upd02_ActLstR.$sub_char1);
				// 予備２
				addColumnPathMap(MfgActIF_Upd02_RsltR.$act_sub_char2, WkActRecvIf_Upd02_ActLstR.$sub_char2);
				// 予備３
				addColumnPathMap(MfgActIF_Upd02_RsltR.$act_sub_char3, WkActRecvIf_Upd02_ActLstR.$sub_char3);

				// 着手時刻
				addColumnPathMap(MfgActIF_Upd02_RsltR.$st_tm, WkActRecvIf_Upd02_ActLstR.$st_hm);
				// 終了時刻
				addColumnPathMap(MfgActIF_Upd02_RsltR.$end_tm, WkActRecvIf_Upd02_ActLstR.$end_hm);
				// 実績工数
				addColumnPathMap(MfgActIF_Upd02_RsltR.$act_wk_cost, WkActRecvIf_Upd02_ActLstR.$wk_cost);
				// 自動工数計算更新許可
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_cost_calc_ctl_flg, WkActRecvIf_Upd02_ActLstR.$wk_cost_calc_upd_flg);

				// 外部システムＣＤ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$ext_sys_cd, WkActRecvIf_Upd02_ActLstR.$ext_sys_cd);
				// 外部工数実績ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$ext_wk_act_no, WkActRecvIf_Upd02_ActLstR.$ext_wk_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.mes_flg(true);

				// 電文中のブロック位置の引き継ぎ
				dest.setParamIndex(src.getParamIndex());
				dest.setParamRowIndex(src.getParamRowIndex());

				if (!dest.isStatusCreate() && MAC_STR.isNULL_VAL(dest.wk_act_no())) {
					dest.wk_act_no(getCrtWkActNoCache(getCacheKey(dest.ext_sys_cd(), dest.ext_wk_act_no())));
				}
			}
		}

		protected Map_MfgActIF_Del02_RsltR_WkActRecvIf_Upd02_ActLstR<MfgActIF_Upd02_RsltR,WkActRecvIf_Upd02_ActLstR> createMap_MfgActIF_Del02_RsltR_WkActRecvIf_Upd02_ActLstR() {
			return new Map_MfgActIF_Del02_RsltR_WkActRecvIf_Upd02_ActLstR<MfgActIF_Upd02_RsltR, WkActRecvIf_Upd02_ActLstR>();
		}

		public class Map_MfgActIF_Del02_RsltR_WkActRecvIf_Upd02_ActLstR<D extends MfgActIF_Upd02_RsltR, S extends WkActRecvIf_Upd02_ActLstR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 紐づけＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$peg_no, WkActRecvIf_Upd02_ActLstR.$peg_no);
				// データ更新区分
				addColumnPathMap(MfgActIF_Upd02_RsltR.$data_crud_typ, WkActRecvIf_Upd02_ActLstR.$data_crud_typ);
				// 指図工数実績
				addColumnPathMap(MfgActIF_Upd02_RsltR.$inst_wk_act_flg, WkActRecvIf_Upd02_ActLstR.$inst_wk_act_flg);
				// 製造指図ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$mfg_inst_no, WkActRecvIf_Upd02_ActLstR.$mfg_inst_no);
				// 分割連番
				addColumnPathMap(MfgActIF_Upd02_RsltR.$div_seq, WkActRecvIf_Upd02_ActLstR.$div_seq);
				// 工数実績ＮＯ
				addColumnPathMap(MfgActIF_Upd02_RsltR.$wk_act_no, WkActRecvIf_Upd02_ActLstR.$wk_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 電文中のブロック位置の引き継ぎ
				dest.setParamIndex(src.getParamIndex());
				dest.setParamRowIndex(src.getParamRowIndex());

				if (MAC_STR.isNULL_VAL(dest.wk_act_no())) {
					dest.wk_act_no(getCrtWkActNoCache(getCacheKey(dest.ext_sys_cd(), dest.ext_wk_act_no())));
				}
			}
		}
	}


	// ------------- Upd03とUpd04で共通して使用するキャッシュ：　新規工数実績. START -------------
	protected static final Class<MSLAL_WkActRecvIfService> CLAZZ = MSLAL_WkActRecvIfService.class;

	protected FXUCL_Cache<String> _crtWkActCache = null;

	protected static void initCache() {
		object(CLAZZ)._initCache();
	}

	protected static void clearCache() {
		object(CLAZZ)._clearCache();
	}

	protected void _initCache() {
		_crtWkActCache = new FXUCL_Cache<String>();
		_crtWkActCache.setFixMaxCacheSize(-1);
	}

	protected void _clearCache() {
		if (_crtWkActCache != null) {
			_crtWkActCache = null;
		}
	}

	protected static void setCrtWkActNoCache(String[] cacheKey, String wkActNo) {
		object(CLAZZ)._crtWkActCache.putCache(cacheKey, wkActNo);
	}

	protected static String getCrtWkActNoCache(String[] cacheKey) {
		return object(CLAZZ)._crtWkActCache.getCache(cacheKey);
	}

	protected String[] getCacheKey(String extSysCd, String extWkActNo) {
		return new String[] {
				nvl(extSysCd, MAC_STR.NULL_VAL.value()),
				nvl(extWkActNo, MAC_STR.NULL_VAL.value())
		};
	}
	// ------------- Upd03とUpd04で共通して使用するキャッシュ：　新規工数実績.  END  -------------

	//FMCB CUSTOM END
}