package mcframe.serverMAUC.MAUCL5010;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static mcframe.serverMAUC.MAUCL5010.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_PushNtcRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_PushNtcRegService_MC extends MAUCL_PushNtcRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PushNtc_Upd01オペレーション.<p>
	 *
	 * プッシュ通知の内容を登録します。<br>
	 */
	public class PushNtc_Upd01 extends MAUCL_PushNtcRegService_MC_A.PushNtc_Upd01 {

		/**
		 * 紐付け
		 */
		protected Map<String, MCNumber> _pegMap = new HashMap<>();

		/**
		 * ワーク
		 */
		protected MCList<MAW_PUSH_NTC_R> _wkL = MCList.create(MAW_PUSH_NTC_R.class);

		/**
		 * ヘッダ情報
		 */
		protected MCList<MAT_PUSH_NTC_H_R> _hdrL = MCList.create(MAT_PUSH_NTC_H_R.class);

		/**
		 * メッセージ情報
		 */
		protected MCList<MAT_PUSH_NTC_MSG_R> _msgL = MCList
				.create(MAT_PUSH_NTC_MSG_R.class);

		/**
		 * 遷移情報
		 */
		protected MCList<MAT_PUSH_NTC_TRANS_R> _transL = MCList
				.create(MAT_PUSH_NTC_TRANS_R.class);

		/**
		 * ユーザ情報
		 */
		protected MCList<MAT_PUSH_NTC_USR_R> _usrL = MCList
				.create(MAT_PUSH_NTC_USR_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			crtWkAndNoMap();
			regWk();
			crt();
			reg();
		}

		/**
		 * ワークデータ及び紐付け管理マップを作成します。
		 */
		protected void crtWkAndNoMap() {
			doSeqCache(MAC_NUM_SYS_TYP.PUSH_NTC_NO, up1().size());
			Map<Comparable<?>, MCList<PushNtc_Upd01_Dtl2R>> up1LMap =
					crtPegListMap(up1(), PushNtc_Upd01_Dtl2R.$peg_no);
			for (PushNtc_Upd01_Dtl1R up0R : up0()) {
				MCNumber pegNo = up0R.peg_no();
				MCList<PushNtc_Upd01_Dtl2R> up1L = up1LMap.get(pegNo);
				if (up1L == null) {
					continue;
				}
				for (PushNtc_Upd01_Dtl2R up1R : up1L) {
					MAW_PUSH_NTC_R wkR = MAW_PUSH_NTC_R.create();
					String pushNtcNo =
							getStrSeq(MAC_NUM_SYS_TYP.PUSH_NTC_NO);
					_pegMap.put(pushNtcNo, pegNo);
					wkR.push_ntc_no(pushNtcNo);
					wkR.push_ntc_typ(up0R.push_ntc_typ());
					wkR.ntc_wg_cd(up1R.ntc_wg_cd());
					wkR.ntc_dpt_cd(up1R.ntc_dpt_cd());
					wkR.ntc_aprv_role_cd(up1R.ntc_aprv_role_cd());
					wkR.ntc_usr_cd(up1R.ntc_usr_cd());
					wkR.master_dt(up1R.master_dt());
					_wkL.add(wkR);
				}
			}
		}

		/**
		 * ワークデータを登録します。
		 */
		protected void regWk() {
			MAW_PUSH_NTC_R t = MAW_PUSH_NTC_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			dbInsertEx(createSqlId(LOGIC_ID, t, "I05"), _wkL, builder);
		}

		/**
		 * 登録データを作成します。
		 */
		protected void crt() {
			crtUsrDtl();
			List<String> pushNtcNoL = getExecPushNtcNo();
			crtHdr(pushNtcNoL);
			crtMsg(pushNtcNoL);
			crtTrans(pushNtcNoL);
		}

		/**
		 * ユーザ情報を作成します。
		 */
		protected void crtUsrDtl() {
			executeQuery(_usrL, MAUCL5010_MAW_PUSH_NTC_S01());
		}

		/**
		 * 実行対象のプッシュ通知NOを取得します。
		 */
		protected List<String> getExecPushNtcNo() {
			String col = MAT_PUSH_NTC_USR_R.$push_ntc_no;
			return _usrL.groupBy(col).getString(col);
		}

		/**
		 * ヘッダ情報を作成します。
		 */
		protected void crtHdr(List<String> pushNtcNoL) {
			if (pushNtcNoL == null) {
				return;
			}
			Map<Comparable<?>, PushNtc_Upd01_Dtl1R> up0RMap =
					crtPegRowMap(up0(), PushNtc_Upd01_Dtl1R.$peg_no);
			for (String pushNtcNo : pushNtcNoL) {
				MCNumber pegNo = _pegMap.get(pushNtcNo);
				if (pegNo == null) {
					continue;
				}
				PushNtc_Upd01_Dtl1R up0R = up0RMap.get(pegNo);
				if (up0R == null) {
					continue;
				}
				MAT_PUSH_NTC_H_R hdrR = MAT_PUSH_NTC_H_R.create();
				hdrR.push_ntc_no(pushNtcNo);
				hdrR.push_ntc_typ(up0R.push_ntc_typ());
				hdrR.msg_id(up0R.msg_id());
				hdrR.src_module_id(up0R.src_module_id());
				hdrR.src_logic_id(up0R.src_logic_id());
				hdrR.src_operation_id(up0R.src_operation_id());
				_hdrL.add(hdrR);
			}
		}

		/**
		 * メッセージ情報を作成します。
		 */
		protected void crtMsg(List<String> pushNtcNoL) {
			if (pushNtcNoL == null) {
				return;
			}
			Map<Comparable<?>, MCList<PushNtc_Upd01_Dtl3R>> up2LMap =
					crtPegListMap(up2(), PushNtc_Upd01_Dtl3R.$peg_no);
			for (String pushNtcNo : pushNtcNoL) {
				MCNumber pegNo = _pegMap.get(pushNtcNo);
				if (pegNo == null) {
					continue;
				}
				MCList<PushNtc_Upd01_Dtl3R> up2L = up2LMap.get(pegNo);
				if (up2L == null) {
					continue;
				}
				for (int i = 0; i < up2L.size(); i++) {
					PushNtc_Upd01_Dtl3R up2R = up2L.get(i);
					MAT_PUSH_NTC_MSG_R msgR = MAT_PUSH_NTC_MSG_R.create();
					msgR.push_ntc_no(pushNtcNo);
					msgR.bind_seq(i);
					msgR.bind_val(up2R.bind_val());
					_msgL.add(msgR);
				}
			}
		}

		/**
		 * 遷移情報を作成します。
		 */
		protected void crtTrans(List<String> pushNtcNoL) {
			if (pushNtcNoL == null) {
				return;
			}
			Map<Comparable<?>, MCList<PushNtc_Upd01_Dtl4R>> up3LMap =
					crtPegListMap(up3(), PushNtc_Upd01_Dtl4R.$peg_no);
			for (String pushNtcNo : pushNtcNoL) {
				MCNumber pegNo = _pegMap.get(pushNtcNo);
				if (pegNo == null) {
					continue;
				}
				MCList<PushNtc_Upd01_Dtl4R> up3L = up3LMap.get(pegNo);
				if (up3L == null) {
					continue;
				}
				for (int i = 0; i < up3L.size(); i++) {
					PushNtc_Upd01_Dtl4R up3R = up3L.get(i);
					MAT_PUSH_NTC_TRANS_R transR =
							MAT_PUSH_NTC_TRANS_R.create();
					transR.push_ntc_no(pushNtcNo);
					transR.column_seq(i);
					transR.data_val(up3R.data_val());
					_transL.add(transR);
				}
			}
		}

		/**
		 * データを登録します。
		 */
		protected void reg() {
			MAT_PUSH_NTC_H_R dbcH = MAT_PUSH_NTC_H_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbcH);
			dbInsertEx(createSqlId(LOGIC_ID, dbcH, "I01"), _hdrL, builder);
			
			MAT_PUSH_NTC_MSG_R dbcM = MAT_PUSH_NTC_MSG_R.create("T");
			builder = MCQueryApiBuilder.create(dbcM);
			dbInsertEx(createSqlId(LOGIC_ID, dbcM, "I02"), _msgL, builder);
			
			MAT_PUSH_NTC_TRANS_R dbcT = MAT_PUSH_NTC_TRANS_R.create("T");
			builder = MCQueryApiBuilder.create(dbcT);
			dbInsertEx(createSqlId(LOGIC_ID, dbcT, "I03"), _transL, builder);
			
			MAT_PUSH_NTC_USR_R dbcU = MAT_PUSH_NTC_USR_R.create("T");
			builder = MCQueryApiBuilder.create(dbcU);
			dbInsertEx(createSqlId(LOGIC_ID, dbcU, "I04"), _usrL, builder);

			// 複数回の呼出を想定
			MAW_PUSH_NTC_R t = MAW_PUSH_NTC_R.create("T");
			execDbWkDelete(createSqlId(LOGIC_ID, t, "D01"), t);
		}

	}

	// **********************************************************************

	/**
	 * 紐付け用のマップを作成します。
	 */
	protected <T extends MCRow> Map<Comparable<?>, T> crtPegRowMap(
			MCList<T> tgtL, String pegCol) {
		Map<Comparable<?>, T> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(pegCol);
		for (MCList<T> tgtGL : tgtGLArr) {
			// tgtGL.size() == 1 を想定
			for (T tgtGR : tgtGL) {
				Comparable<?> val = tgtGR.toArray(pegCol)[0];
				ret.put(val, tgtGR);
			}
		}
		return ret;
	}

	/**
	 * 紐付け用のマップを作成します。
	 */
	protected <T extends MCRow> Map<Comparable<?>, MCList<T>> crtPegListMap(
			MCList<T> tgtL, String pegCol) {
		Map<Comparable<?>, MCList<T>> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(pegCol);
		for (MCList<T> tgtGL : tgtGLArr) {
			Comparable<?> val = tgtGL.get(0).toArray(pegCol)[0];
			ret.put(val, tgtGL);
		}
		return ret;
	}

	//FMCB CUSTOM END
}