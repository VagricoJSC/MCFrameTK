package mcframe.serverPFBC.PFBCL5010;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import mcframe.serverCore.requester.cooperate.MCCooperateInvokeManager;

import mcframe.serverMAUC.MAUCL5030.MAUCL_IfCmnService;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBCL_DSIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBCL_DSIfService_MC extends PFBCL_DSIfService_MC_A{
	//FMCB CUSTOM START

	/** 処理対象の会社ＣＤのリスト */
	protected List<String> _coCdL = new ArrayList<>();

	/** バッチ制御テーブルのロックに失敗した会社ＣＤのリスト */
	protected List<String> _lockErrCoCdL = new ArrayList<>();

	/** バッチ制御テーブルのロック解除に失敗した会社ＣＤのリスト */
	protected List<String> _unlockErrCoCdL = new ArrayList<>();

	/**
	 * DSIf_Imp01オペレーション.<p>
	 *
	 */
	public class DSIf_Imp01 extends PFBCL_DSIfService_MC_A.DSIf_Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		protected boolean _isLockErr = false;

		@Override
		protected void preExec() {
			Map<String, String> params = getCmdParams();
			if (isNullOr(params.get(MAC_IF_CTL_TYP.CMD_PATH.key()),
					params.get(MAC_IF_CTL_TYP.CMD_ARG01.key()),
					params.get(MAC_IF_CTL_TYP.CMD_ARG04.key()),
					params.get(MAC_IF_CTL_TYP.CMD_ARG06.key()))) {
				throw new MCAppException(PFBCL0001,
						params.get(MAC_IF_CTL_TYP.CMD_PATH.key()),
						params.get(MAC_IF_CTL_TYP.CMD_ARG01.key()),
						params.get(MAC_IF_CTL_TYP.CMD_ARG04.key()),
						params.get(MAC_IF_CTL_TYP.CMD_ARG06.key()));
			}

			_coCdL = getCoCdL("PF", "PFBCL5010", "DSIf_Imp01");
			if (_isLockErr = !lock(_coCdL)) {
				throw new MCAppException(PFBCL0002, up0().get(0).if_proc_typ(),
						up0().get(0).ext_sys_cd(), String.join(", ", _lockErrCoCdL));
			}
		}

		@Override
		protected String buildCmdStr() {
			Map<String, String> orgParams = getCmdParams();
			Map<String, String> biParams = new LinkedHashMap<>();
			String val = up0().get(0).if_proc_typ();

			String cmdPath = orgParams.get(MAC_IF_CTL_TYP.CMD_PATH.key()) + "\\" + MAC_IF_PROC_TYP.ds_wrap_cmd(val);
			biParams.put(MAC_IF_CTL_TYP.CMD_PATH.key(), quote(cmdPath));

			biParams.put(MAC_IF_CTL_TYP.CMD_ARG01.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG01.key())));
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG02.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG02.key())));
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG03.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG03.key())));
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG04.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG04.key())));
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG05.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG05.key())));
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG06.key(), quote(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG06.key())));

			String cmdArg07 = "VTB_ROOT/" + nvl(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG07.key()), "");
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG07.key(), quote(cmdArg07));

			String cmdArg08 = orgParams.get(MAC_IF_CTL_TYP.CMD_ARG08.key());
			if (MAC_IF_PROC_TYP.is_ds_impmd_fix(val)) {
				cmdArg08 = "2";
			}
			else if (!isSameStr("1", cmdArg08) && !isSameStr("2", cmdArg08)) {
				cmdArg08 = "1";
			}
			biParams.put(MAC_IF_CTL_TYP.CMD_ARG08.key(), quote(cmdArg08));

			final String OBJECT_NAME = "MCFBI_OBJECT_NAME";
			final String VTB_NAME = "MCFBI_VTB_NAME";
			final String IMP_CONDITION = "MCFBI_IMP_CONDITION";
			final String KEY_VTB_NAME = "MCFBI_KEY_VTB_NAME";
			final String DEL_CONDITION = "MCFBI_DEL_CONDITION";
			final String KEY_DEL_CONDITION = "MCFBI_KEY_DEL_CONDITION";

			biParams.put(OBJECT_NAME, quote(MAC_IF_PROC_TYP.ds_obj(val)));
			biParams.put(VTB_NAME, quote(MAC_IF_PROC_TYP.ds_vtb_tbl(val)));

			String impCondition = "";
			if (!isNull(MAC_IF_PROC_TYP.upd_if_tbl(val))) {
				impCondition = String.format("DATA_NO IN (%s)",
						String.join(", ", toListStr(up0().getNumberNE(SdrvDtlR.$data_no))));
			}
			biParams.put(IMP_CONDITION, quote(impCondition));

			String keyVtbName = "";
			String delCondition = "";
			String keyDelCondition = "";
			if (!isNull(MAC_IF_PROC_TYP.ds_obj_join_key_imp(val))) {
				keyVtbName = biParams.get(VTB_NAME) + "_KEY";

				String cmpKeyImp = MAC_IF_PROC_TYP.ds_obj_join_key_imp(val);
				String cmpKeyWrk = MAC_IF_PROC_TYP.ds_obj_join_key_wrk(val);
				if (MAC_IF_PROC_TYP.is_ds_cost(val)) {
					if (!(isNull(orgParams.get(MAC_IF_CTL_TYP.CMD_ARG09.key()))
							|| isSameStr("1", orgParams.get(MAC_IF_CTL_TYP.CMD_ARG09.key())))) {
						cmpKeyImp = "CMP_CALC_NO";
						cmpKeyWrk = "V_COL2";
					}
				}
				delCondition = String.format("%s IN (SELECT %s FROM MCFCT_KEY T WHERE T.TBL_NM = '%s')",
						cmpKeyImp,
						cmpKeyWrk,
						biParams.get(OBJECT_NAME));
				keyDelCondition = String.format("TBL_NM = '%s' AND DATA_NO IN (%s)",
						biParams.get(OBJECT_NAME),
						String.join(", ", toListStr(up0().getNumberNE(SdrvDtlR.$data_no))));
			}
			biParams.put(KEY_VTB_NAME, quote(keyVtbName));
			biParams.put(DEL_CONDITION, quote(delCondition));
			biParams.put(KEY_DEL_CONDITION, quote(keyDelCondition));

			return String.join(" ", biParams.values());
		}

		/**
		 * List(MCNumber)をList(String)に変換します
		 * 
		 */
		protected List<String> toListStr(List<MCNumber> src) {
			List<String> dest = new ArrayList<>();
			if (src == null || src.size() == 0) return dest;
			src.forEach(r -> dest.add(r.toSimpleString()));
			return dest;
		}

		/**
		 * ダブルクオーテーションを除外した後、文字列が一致するかどうかを比較します<br>
		 * nullと空文字は同じ扱いにします
		 * 
		 */
		protected boolean isSameStr(String val1, String val2) {
			String str1 = isNull(val1) ? "" : val1.replace("\"", "");
			String str2 = isNull(val2) ? "" : val2.replace("\"", "");
			return isSame(str1, str2);
		}

		/**
		 * ダブルクオーテーションを除外した後、ダブルクオーテーションを文字列の先頭と末尾に付与します<br>
		 * nullと空文字は同じ扱いにします
		 * 
		 */
		protected String quote(String val) {
			String str = isNull(val) ? "" : val;
			return "\"" + str.replace("\"", "") + "\"";
		}

		@Override
		protected void postExec(boolean isErr) {
			if (!_isLockErr) {
				if (!unlock(_coCdL)) {
					handleUnlockErr();
				}
			}

			if (!isErr) {
				if (getExitCd() == 0) {
					getLogger().writeProcessLog(PFBZL0069, up0().get(0).if_proc_typ(),
							up0().get(0).ext_sys_cd(), getExitCd());
				}
				else {
					String hexExitCd = Integer.toHexString(getExitCd());
					MCMessage msg = new MCMessage(PFBZL0070, up0().get(0).if_proc_typ(),
							up0().get(0).ext_sys_cd(), "0x" + hexExitCd, getStdErr());
					if (hexExitCd.charAt(0) == 'a') {
						getLogger().writeProcessLog(msg);
					}
					else {
						throw new MCAppException(msg);
					}
				}
			}
		}

		/**
		 * 指定された会社についてBI Linkバッチ制御をロックします。<br>
		 * １件でもロックできなかった場合は、それまでのロックを解除します。
		 * 
		 * @return 全てロックできた場合はtrue、それ以外はfalse
		 */
		protected boolean lock(List<String> coCdL) {
			if (coCdL == null || coCdL.size() == 0) return true;
			Map<String, MCOperation> map = new HashMap<>();
			for (String coCd : coCdL) {
				MAUCL_IfCmnService.MultiExec_Upd01 ope = MAUCL_IfCmnService.crtMultiExec_Upd01();
				ope.up0().if_proc_typ(up0().get(0).if_proc_typ());
				ope.up0().exec_co_cd(getCo().co_cd());
				map.put(coCd, ope);
			}

			List<String> successCoCdL = new ArrayList<>();
			_lockErrCoCdL.clear();
			try {
				MCCooperateInvokeManager.exec(map);
			}
			catch (MCException ex) {
				for (String coCd : coCdL) {
					MCException coEx = MCCooperateInvokeManager.getException(coCd);
					if (coEx != null) {
						getLogger().writeProcessLog(coEx);
					}
				}
			}
			finally {
				for (String coCd : coCdL) {
					MAUCL_IfCmnService.MultiExec_Upd01 ope = (MAUCL_IfCmnService.MultiExec_Upd01) map.get(coCd);
					if (ope.down0().rslt_flg()) {
						successCoCdL.add(coCd);
					}
					else {
						_lockErrCoCdL.add(coCd);
					}
				}
			}

			if (_lockErrCoCdL.size() > 0) {
				if (!unlock(successCoCdL)) {
					handleUnlockErr();
				}
			}
			return _lockErrCoCdL.size() == 0;
		}

		/**
		 * 指定された会社についてBI Linkバッチ制御のロックを解除します。
		 * 
		 * @return 全て解除できた場合はtrue、それ以外はfalse
		 */
		protected boolean unlock(List<String> coCdL) {
			if (coCdL == null || coCdL.size() == 0) return true;
			Map<String, MCOperation> map = new HashMap<>();
			for (String coCd : coCdL) {
				MAUCL_IfCmnService.MultiExec_Upd02 ope = MAUCL_IfCmnService.crtMultiExec_Upd02();
				ope.up0().if_proc_typ(up0().get(0).if_proc_typ());
				ope.up0().exec_co_cd(getCo().co_cd());
				map.put(coCd, ope);
			}

			_unlockErrCoCdL.clear();
			try {
				MCCooperateInvokeManager.exec(map);
			}
			catch (MCException ex) {
				for (String coCd : coCdL) {
					MCException coEx = MCCooperateInvokeManager.getException(coCd);
					if (coEx != null) {
						getLogger().writeProcessLog(coEx);
					}
				}
			}
			finally {
				for (String coCd : coCdL) {
					MAUCL_IfCmnService.MultiExec_Upd02 ope = (MAUCL_IfCmnService.MultiExec_Upd02) map.get(coCd);
					if (!ope.down0().rslt_flg()) {
						_unlockErrCoCdL.add(coCd);
					}
				}
			}

			return _unlockErrCoCdL.size() == 0;
		}

		/**
		 * BI Linkバッチ制御のロックを解除に失敗した場合の処理です。
		 * 
		 */
		protected void handleUnlockErr() {
			getLogger().writeProcessLog(PFBCL0003, up0().get(0).if_proc_typ(),
					up0().get(0).ext_sys_cd(), String.join(", ", _unlockErrCoCdL));
			// 送受信状況区分をエラーにしたくないため、Exceptionにはしない
			// Exceptionにはしないが、エラーがある旨を表示したい
			// causerowが未指定だと、上り電文のデータ数だけメッセージが複製される
			MCMessagePool.add(new MCMessage(up0().get(0), null, MAUDL0009));
		}

		/**
		 * ログインユーザが実行可能な会社ＣＤのリストを返します。
		 * 
		 */
		protected List<String> getCoCdL(String modid, String logid, String opeid) {
			MCList<? extends MCRow> coL = MCCooperateInvokeManager.getExecutableCoList(modid, logid, opeid);
			return coL.getStringNE(MCCooperateInvokeManager.$co_cd);
		}
	}

	//FMCB CUSTOM END
}