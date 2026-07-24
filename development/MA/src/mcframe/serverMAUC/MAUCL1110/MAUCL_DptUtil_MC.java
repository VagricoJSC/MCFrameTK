package mcframe.serverMAUC.MAUCL1110;

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
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;

import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_DptUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_DptUtil_MC extends MAUCL_DptUtil_MC_A{
	//FMCB CUSTOM START
	private static final Class<MAUCL_DptUtil> _clazz = MAUCL_DptUtil.class;
	
	protected static MAUCL_DptUtil getThis(){
		return object(_clazz);
	}
	
	/**
	 * 新部門ＣＤの項目名
	 */
	protected static final String $NEW_DPT_CD = "_new_dpt_cd_util";
	
	/**
	 * エラーＦＬＧの項目名
	 */
	protected static final String $ERR_FLG = "err_flg";
	
	/**
	 * 空白文字列（エラーメッセージ用）
	 */
	protected static final String $BLANK_STR = " ";
	
	// /////////////////////////////////////////////
	// 新部門取得
	// /////////////////////////////////////////////
	
	// 新部門取得ファンクションのキャッシュ
	protected FXUCL_MCFuncCache<String> _c_dpt_cd;
	protected static String getCacheDptCd(String dptCd, MCDate dt) {
		return object(_clazz)._getCacheDptCd(dptCd, dt);
	}
	protected String _getCacheDptCd(String dptCd, MCDate dt) {
		if (_c_dpt_cd == null) {
			_c_dpt_cd = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_DPT$F_GET_DPT_CD_NE(
						value((String) in[0]),
						value((MCDate) in[1]));
			});
		}
		return _c_dpt_cd.get(dptCd, dt);
	}
	
	// 部門マスタのキャッシュ
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
	protected MAM_DPT_R getDptCache(String dptCd, MCDate baseDt) {
		return _cacheDpt.get(baseDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache() {
		if (_cacheDpt == null){
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			MAM_DPT_R dbc = MAM_DPT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(builder, bindL, MAM_DPT_R.$dpt_cd);
		}
		return _cacheDpt;
	}
	
	// キャッシュした部門マスタより部門名を取得
	protected String getDptNm(String dptCd, MCDate dt) {
		if (isNull(dptCd)) {
			return null;
		}
		return getDptCache(dptCd, dt).dpt_nm();
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したロウを返します。<p>
	 * 変換できない場合は、元の部門のままロウを返します。
	 * @param row
	 * @param dptCdColumn
	 * @param dtColumn
	 * @return row
	 */
	public static <R extends MCRow> R setDpt(R row, String dptCdColumn, String dtColumn) {
		return getThis()._setDpt(row, dptCdColumn, null, dtColumn, false);
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したロウを返します。<p>
	 * 新部門が取得できない場合、元の部門のままロウを返します。
	 * dptNmColumnが指定された場合、変換後の部門ＣＤに該当する部門名も取得して返します。
	 * errChkFlgがtrueの場合、新部門が取得できなければエラーメッセージをプールし該当行をエラーにします。
	 * @param row
	 * @param dptCdColumn
	 * @param dptNmColumn
	 * @param dtColumn
	 * @param errChkFlg
	 * @return
	 */
	public static <R extends MCRow> R setDpt(R row, String dptCdColumn, String dptNmColumn, String dtColumn, boolean errChkFlg) {
		return getThis()._setDpt(row, dptCdColumn, dptNmColumn, dtColumn, errChkFlg);
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したロウを返します。<p>
	 * 新部門が取得できない場合、元の部門のままロウを返します。
	 * dptNmColumnが指定された場合、変換後の部門ＣＤに該当する部門名も取得して返します。
	 * errChkFlgがtrueの場合、新部門が取得できなければエラーメッセージをプールし該当行をエラーにします。
	 * @param row
	 * @param dptCdColumn
	 * @param dptNmColumn
	 * @param dtColumn
	 * @param errChkFlg
	 * @return
	 */
	protected <R extends MCRow, L extends MCList<R>> R _setDpt(R row, String dptCdColumn, String dptNmColumn, String dtColumn, boolean errChkFlg) {
		if (!isNull(dptNmColumn)) {
			initDptCache();
		}
		
		L tmpList = (L)MCList.create(MCRow.class);
		tmpList.add(row);
		
		// 新部門取得
		getNewDpt(tmpList, dptCdColumn, dtColumn);
		
		// 取得した新部門ＣＤに対する部門名をロウに格納
		setNewDpt(row, tmpList, dptCdColumn, dptNmColumn, dtColumn, errChkFlg, true);
		
		return row;
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したリストを返します。<p>
	 * 変換できない場合は、元の部門のままリストを返します。
	 * @param list
	 * @param dptCdColumn
	 * @param dtColumn
	 * @return list
	 */
	public static <R extends MCRow, L extends MCList<R>> L setDpt(L list, String dptCdColumn, String dtColumn) {
		return getThis()._setDpt(list, dptCdColumn, null, dtColumn, false);
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したリストを返します。<p>
	 * 新部門が取得できない場合、元の部門のままリストを返します。
	 * dptNmColumnが指定された場合、変換後の部門ＣＤに該当する部門名も取得して返します。
	 * errChkFlgがtrueの場合、新部門が取得できなければエラーメッセージをプールし該当行をエラーにします。
	 * @param list
	 * @param dptCdColumn
	 * @param dptNmColumn
	 * @param dtColumn
	 * @param errChkFlg
	 * @return
	 */
	public static <R extends MCRow, L extends MCList<R>> L setDpt(L list, String dptCdColumn, String dptNmColumn, String dtColumn, boolean errChkFlg) {
		return getThis()._setDpt(list, dptCdColumn, dptNmColumn, dtColumn, errChkFlg);
	}
	
	/**
	 * 部門、日付に応じて新部門に変換したリストを返します。<p>
	 * 新部門が取得できない場合、元の部門のままリストを返します。
	 * dptNmColumnが指定された場合、変換後の部門ＣＤに該当する部門名も取得して返します。
	 * errChkFlgがtrueの場合、新部門が取得できなければエラーメッセージをプールし該当行をエラーにします。
	 * @param list
	 * @param dptCdColumn
	 * @param dptNmColumn
	 * @param dtColumn
	 * @param errChkFlg
	 * @return
	 */
	protected <R extends MCRow, L extends MCList<R>> L _setDpt(L list, String dptCdColumn, String dptNmColumn, String dtColumn, boolean errChkFlg) {
		if (!isNull(dptNmColumn)) {
			initDptCache();
		}
		
		// 重複除外リスト作成
		L dplL = (L)list.subList(MCRow.Status.CREATE, MCRow.Status.MODIFY, MCRow.Status.NONE).groupBy(dptCdColumn, dtColumn);
		
		if (!isNull(dplL) && !dplL.isEmpty()) {
			// 新部門取得
			getNewDpt(dplL, dptCdColumn, dtColumn);
			
			// 取得した新部門ＣＤに対する部門名をリストに格納
			for (R r : list) {
				setNewDpt(r, dplL, dptCdColumn, dptNmColumn, dtColumn, errChkFlg, false);
			}
		}
		return list;
	}
	
	/**
	 * 重複を除外したリストに対し新部門を取得
	 * @param dplL
	 * @param dptCdColumn
	 * @param dtColumn
	 */
	protected <R extends MCRow, L extends MCList<R>> void getNewDpt(L dplL, String dptCdColumn, String dtColumn) {
		dplL.addStringColumn($NEW_DPT_CD);
		for (R dplR : dplL) {
			String dptCd = dplR.getStringNE(dptCdColumn);
			MCDate dt = dplR.getDateNE(dtColumn);
			// 部門、日付がなければ新部門も取得しない
			if (isNull(dptCd) || isNull(dt)) {
				continue;
			}
			dplR.setStringNE($NEW_DPT_CD, getCacheDptCd(dptCd, dt));
		}
	}
	
	/**
	 * 返却するリストに取得した新部門を格納<p>
	 * dptNmColumnが指定された場合、変換後の部門ＣＤに該当する部門名も取得
	 * errChkFlgがtrueの場合、新部門が取得できなければエラーメッセージをプールし該当行をエラーにする
	 * @param r
	 * @param dplL
	 * @param dptCdColumn
	 * @param dptNmColumn
	 * @param dtColumn
	 * @param errChkFlg
	 */
	protected <R extends MCRow, L extends MCList<R>> void setNewDpt(R r, L dplL, String dptCdColumn, String dptNmColumn, String dtColumn, boolean errChkFlg, boolean rowFlg) {
		// 削除行は変換・チェック対象外
		if (r.isStatusDelete()) {
			return;
		}
		String dptCd = r.getStringNE(dptCdColumn);
		MCDate dt = r.getDateNE(dtColumn);
		
		// 部門ＣＤ、日付の値がなければ対象外
		if (isNull(dptCd) || isNull(dt)) {
			return;
		}
		
		for (R dplR : dplL) {
			String dplDptCd = dplR.getStringNE(dptCdColumn);
			MCDate dplDt = dplR.getDateNE(dtColumn);
			String newDptCd = dplR.getStringNE($NEW_DPT_CD);
			if (isSame(dptCd, dplDptCd) && isSame(dt, dplDt)) {
				if (!isNull(newDptCd) && newDptCd != null) {
					r.setStringNE(dptCdColumn, newDptCd);
					break;
				}
				else {
					// エラーチェックフラグがオンの場合で新部門が取得できなかった場合はエラーメッセージを格納し対象行をエラーとする
					if (errChkFlg) {
						MCMessageList msgList = getMessage();
						// 処理対象がロウの場合
						if (rowFlg) {
							msgList.add(new MCMessage(MAUCL0118, dptCd, toYMDString(dt), $BLANK_STR).setCauseRow(r, dptCdColumn));
						}
						else {
							msgList.add(new MCMessage(MAUCL0118, dptCd, toYMDString(dt), toDispGUIIndex(r)).setCauseRow(r, dptCdColumn));
						}
						if (!r.contains($ERR_FLG)) {
							r.addBooleanColumn($ERR_FLG);
						}
						r.setBooleanNE($ERR_FLG, true);
						break;
					}
				}
			}
		}
		// 部門名取得
		if (!isNull(dptNmColumn)) {
			r.setStringNE(dptNmColumn, getDptNm(r.getStringNE(dptCdColumn), r.getDateNE(dtColumn)));
		}
	}
	
	/**
	 * MCMessagePool に格納されているメッセージを返す
	 * @return
	 */
	protected MCMessageList getMessage() {
		return MCMessagePool.getMessageList();
	}

	// 取消データの部門判定に使うカラム名
	protected static final String AC_DT = "ac_dt";
	protected static final String CAN_AC_DT = "can_ac_dt";
	protected static final String DIS_AC_DT = "dis_ac_dt";
	protected static final String CRT = "crt_";
	protected static final String ACT_DPT_CD = "act_dpt_cd";
	protected static final String PURC_DPT_CD = "purc_dpt_cd";
	protected static final String AP_DPT_CD = "ap_dpt_cd";
	protected static final String SLS_DPT_CD = "sls_dpt_cd";
	protected static final String AR_DPT_CD = "ar_dpt_cd";
	protected static final String GI_DPT_CD = "gi_dpt_cd";
	protected static final String GR_DPT_CD = "gr_dpt_cd";
	protected static final String BD_DPT_CD = "bd_dpt_cd";
	protected static final String SUB_DPT_CD1 = "sub_dpt_cd1";
	protected static final String SUB_DPT_CD2 = "sub_dpt_cd2";
	protected static final String SUB_DPT_CD3 = "sub_dpt_cd3";
	protected static final String OUTSRC_MFG_LOC_DPT_CD = "outsrc_mfg_loc_dpt_cd";
	protected static final String SLS_USR_CD = "sls_usr_cd";
	protected static final String PURC_USR_CD = "purc_usr_cd";
	protected static final String WG_CD = "wg_cd";
	protected static final String BD_WG_CD = "bd_wg_cd";

	// 部門ＣＤのカラム名配列
	protected static final String[] KEY_COLS = new String[]{
			ACT_DPT_CD, PURC_DPT_CD, AP_DPT_CD,
			SLS_DPT_CD, AR_DPT_CD, GI_DPT_CD,
			GR_DPT_CD, BD_DPT_CD, SUB_DPT_CD1,
			SUB_DPT_CD2, SUB_DPT_CD3, OUTSRC_MFG_LOC_DPT_CD};

	/**
	 * 取消データの各種部門ＣＤを設定します<br /><br>
	 * 
	 * 処理対象のリストに設定されている取消データの部門ＣＤを計上日を基準に判定し、<br>
	 * 無効な場合は、取消データの各種部門ＣＤに新規データの部門ＣＤを上書きしてリストを返却します。<br>
	 * 有効な場合は、上書きしないで返却します。<br>
	 * <br>
	 * 本ユーティリティは、過月訂正時の取消データに対して処理することを想定しています。<br>
	 * 以下のようなデータで、10月時点でＡ部門が無効であれば新規データのＢ部門で上書きします。<br>
	 * 10月時点でＡ部門が有効であれば何もせずにＡ部門のまま返却します。<br>
	 * ----------------<br>
	 * 無効データ：09月 Ａ部門<br>
	 * 取消データ：10月 Ａ部門<br>
	 * 新規データ：10月 Ｂ部門<br>
	 * ----------------<br>
	 * <br>
	 * 処理対象のリストには以下のカラムが設定されている必要があります。
	 * <li>ac_dt 計上日</li>
	 * <li>dis_ac_dt 元の計上日</li>
	 * <li>can_ac_dt 取消計上日</li>
	 * <li>xx_dpt_cd 各種部門ＣＤ</li>
	 * <li>crt_xx_dpt_cd 新規データの各種部門ＣＤ</li>
	 * <li>crt_sls_usr_cd 新規データの売上担当者ＣＤ（売上担当者ＣＤを設定する場合のみ）</li>
	 * <li>crt_purc_usr_cd 新規データの購買担当者ＣＤ（購買担当者ＣＤを設定する場合のみ）</li>
	 * <li>crt_wg_cd 新規データのワーキンググループＣＤ（ワーキンググループＣＤを設定する場合のみ）</li>
	 * <li>slip_sts_typ 伝票状況区分（カラムの設定が無い場合は考慮しないで処理します）</li><br>
	 * 
	 * 売上部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>sls_usr_cd 売上担当者ＣＤ</li>
	 * <li>wg_cd ワーキンググループＣＤ</li><br>
	 * 
	 * 購買部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>purc_usr_cd 購買担当者ＣＤ</li>
	 * <li>wg_cd ワーキンググループＣＤ</li><br>
	 * 
	 * 負担部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>wg_cd ワーキンググループＣＤ</li>
	 * <br>
	 * colMapについて<br>
	 * 本クラスで定義しているカラム名を変更したい場合はカラム名変換マップに設定してください。<br>
	 * 例えば、処理対象のリストにsls_wg_cdという項目がある場合、<br>
	 * colMap.put("wg_cd", "sls_wg_cd")と設定することで、wg_cdをsls_wg_cdとして処理します。<br>
	 * カラム名変換マップを使わない場合はnullを設定してください。<br>
	 * <br>
	 * 
	 * @param list 処理対象リスト
	 * @param colMap カラム名変換マップ
	 * @return 処理対象リスト
	 */
	public static <R extends MCRow, L extends MCList<R>> L setCanDpt(L list, Map<String, String> colMap) {
		return getThis()._setCanDpt(list, null, colMap);
	}

	/**
	 * 取消データの各種部門ＣＤを設定します<br /><br>
	 * 
	 * 処理対象のリストに設定されている取消データの部門ＣＤを計上日を基準に判定し、<br>
	 * 無効な場合は、取消データの各種部門ＣＤに新規データの部門ＣＤを上書きしてリストを返却します。<br>
	 * 有効な場合は、上書きしないで返却します。<br>
	 * <br>
	 * 本ユーティリティは、過月訂正時の取消データに対して処理することを想定しています。<br>
	 * 以下のようなデータで、10月時点でＡ部門が無効であれば新規データのＢ部門で上書きします。<br>
	 * 10月時点でＡ部門が有効であれば何もせずにＡ部門のまま返却します。<br>
	 * ----------------<br>
	 * 無効データ：09月 Ａ部門<br>
	 * 取消データ：10月 Ａ部門<br>
	 * 新規データ：10月 Ｂ部門<br>
	 * ----------------<br>
	 * <br>
	 * 処理対象のリストには以下のカラムが設定されている必要があります。
	 * <li>ac_dt 計上日</li>
	 * <li>dis_ac_dt 元の計上日</li>
	 * <li>can_ac_dt 取消計上日</li>
	 * <li>xx_dpt_cd 各種部門ＣＤ</li>
	 * <li>crt_xx_dpt_cd 新規データの各種部門ＣＤ</li>
	 * <li>crt_sls_usr_cd 新規データの売上担当者ＣＤ（売上担当者ＣＤを設定する場合のみ）</li>
	 * <li>crt_purc_usr_cd 新規データの購買担当者ＣＤ（購買担当者ＣＤを設定する場合のみ）</li>
	 * <li>crt_wg_cd 新規データのワーキンググループＣＤ（ワーキンググループＣＤを設定する場合のみ）</li>
	 * <li>slip_sts_typ 伝票状況区分（カラムの設定が無い場合は考慮しないで処理します）</li><br>
	 * 
	 * 売上部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>sls_usr_cd 売上担当者ＣＤ</li>
	 * <li>wg_cd ワーキンググループＣＤ</li><br>
	 * 
	 * 購買部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>purc_usr_cd 購買担当者ＣＤ</li>
	 * <li>wg_cd ワーキンググループＣＤ</li><br>
	 * 
	 * 負担部門ＣＤを処理する場合は以下のカラムを設定します。<br>
	 * <li>wg_cd ワーキンググループＣＤ</li>
	 * <br>
	 * tgtKeysについて<br>
	 * 処理対象キー情報の配列に設定されている部門ＣＤを処理します。<br>
	 * 売上部門だけ処理する場合などに指定してください。<br>
	 * <br>
	 * colMapについて<br>
	 * 本クラスで定義しているカラム名を変更したい場合はカラム名変換マップに設定してください。<br>
	 * 例えば、処理対象のリストにsls_wg_cdという項目がある場合、<br>
	 * colMap.put("wg_cd", "sls_wg_cd")と設定することで、wg_cdをsls_wg_cdとして処理します。<br>
	 * カラム名変換マップを使わない場合はnullを設定してください。<br>
	 * <br>
	 * 
	 * @param list 処理対象リスト
	 * @param tgtKeys 処理対象キー情報
	 * @param colMap カラム名変換マップ
	 * @return 処理対象リスト
	 */
	public static <R extends MCRow, L extends MCList<R>> L setCanDpt(L list, String[] tgtKeys, Map<String, String> colMap) {
		return getThis()._setCanDpt(list, tgtKeys, colMap);
	}

	protected <R extends MCRow, L extends MCList<R>> L _setCanDpt(L list, String[] tgtKeys, Map<String, String> colMap) {
		for (MCRow row : list) {
			_setCanDpt(row, tgtKeys, colMap);
		}
		return list;
	}

	/**
	 * 取消データの各種部門ＣＤを設定します
	 * 
	 * @param list 処理対象リスト
	 * @param colMap カラム名変換マップ
	 * @return
	 */
	protected <R extends MCRow> R _setCanDpt(R row, String[] tgtKeys, Map<String, String> colMap) {
		// 取消データ以外は処理しない
		if (row.contains("slip_sts_typ") && !MAC_SLIP_STS_TYP.isCAN(row.getStringNE("slip_sts_typ"))) {
			return row;
		}
		// 無効データの計上日カラムが設定されてない場合は処理しない
		if (!row.contains(DIS_AC_DT)) {
			return row;
		}
		// 計上日関連の値を取得
		MCDate acDt = nvl(row.getDateNE(_getCrtColumn(AC_DT)), row.getDateNE(getColumn(colMap, AC_DT)));
		MCDate disAcDt = row.getDateNE(getColumn(colMap, DIS_AC_DT));
		MCDate canAcDt = row.getDateNE(getColumn(colMap, CAN_AC_DT));

		// 過月訂正の場合のみ処理する
		// 無効データの計上日 ≠ 取消計上日、かつ、取消計上日 ＝ 計上日の場合
		if (!isSame(disAcDt, canAcDt)) {

			initDptCache();
			if (tgtKeys == null) {
				for (int i = 0; KEY_COLS.length > i; i++) {
					setDptSub(row, KEY_COLS[i], acDt, disAcDt, canAcDt, colMap);
				}
			}
			else {
				for (int i = 0; tgtKeys.length > i; i++) {
					setDptSub(row, tgtKeys[i], acDt, disAcDt, canAcDt, colMap);
				}
			}
		}
		return row;
	}

	/**
	 * 部門ＣＤを判定して無効な場合は部門ＣＤを上書きします
	 * 
	 * @param row 処理対象ロウ
	 * @param dptCdCol 処理対象の部門ＣＤカラム名
	 * @param dt 基準日
	 * @param colMap カラム名変換マップ
	 */
	protected void setDptSub(MCRow row, String dptCdCol, MCDate dt, Map<String,String> colMap) {
		String dptCd = row.getStringNE(getColumn(colMap, dptCdCol));
		if (isNull(dptCd)) {
			return;
		}
		// 処理対象の部門を判定し、無効な場合は対象レコードに新規データの情報を設定する
		if (checkDpt(dptCd, dt)) {
			setCrtValue(row, dptCdCol, colMap);
			if (isSame(dptCdCol, SLS_DPT_CD)) {
				setCrtValue(row, SLS_USR_CD, colMap);
				setCrtValue(row, WG_CD, colMap);
			}
			else if (isSame(dptCdCol, PURC_DPT_CD)) {
				setCrtValue(row, PURC_USR_CD, colMap);
				setCrtValue(row, WG_CD, colMap);
			}
			else if (isSame(dptCdCol, BD_DPT_CD)) {
				setCrtValue(row, BD_WG_CD, colMap);
			}
		}
	}
	/**
	 * 部門ＣＤを判定して有効な部門ＣＤに上書きします。
	 * 部門変換を行った場合に有効な部門が取得できない場合はエラー。
	 * 
	 * @param row 処理対象ロウ
	 * @param dptCdCol 処理対象の部門ＣＤカラム名
	 * @param acDt 新規計上日
	 * @param disAcDt 元計上日
	 * @param canAcDt 取消計上日
	 * @param colMap カラム名変換マップ
	 */
	protected void setDptSub(MCRow row, String dptCdCol, MCDate acDt, MCDate disAcDt, MCDate canAcDt, Map<String,String> colMap) {
		String dptCd = row.getStringNE(getColumn(colMap, dptCdCol));
		if (isNull(dptCd) || isNull(canAcDt)) {
			return;
		}
		
		// １．元部門が取消計上日時点で有効
		if (!checkDpt(dptCd, canAcDt)) {
			// 元部門
			if (!isSame(disAcDt, canAcDt)) {
				// 取消計上日で、元部門の部門情報よりＷＧを取得
				setDptWg(row, dptCdCol, canAcDt);
			}
		}
		// ２．元部門が取消計上日時点で無効
		else {
			// 新規部門の取得
			String crtDpt = row.getStringNE(getColumn(colMap, _getCrtColumn(dptCdCol)));
			// ２－１．取消の場合（＝新規部門がNULLの場合）
			if (isNull(crtDpt)) {
				// 元部門を取消計上日で部門変換
				getNewDptCanAcDt(row, dptCdCol);
				// 取消計上日で、部門変換した部門の部門情報よりＷＧを取得
				setDptWg(row, dptCdCol, canAcDt);
			}
			// ２－２．訂正の場合（＝新規部門がセットされている）
			else {
				// ２－２－１．取消計上日＝新規計上日の場合
				if (isSame(canAcDt, acDt)) {
					// 新規部門と同じ値
					setCrtValue(row, dptCdCol, colMap);
					// 新規データと同じＷＧ、担当者
					if (isSame(dptCdCol, SLS_DPT_CD)) {
						setCrtValue(row, SLS_USR_CD, colMap);
						setCrtValue(row, WG_CD, colMap);
					}
					else if (isSame(dptCdCol, PURC_DPT_CD)) {
						setCrtValue(row, PURC_USR_CD, colMap);
						setCrtValue(row, WG_CD, colMap);
					}
					else if (isSame(dptCdCol, BD_DPT_CD)) {
						setCrtValue(row, BD_WG_CD, colMap);
					}
				}
				// ２－２－２．取消計上日≠新規計上日の場合
				else {
					// 新規部門が取消計上日で有効の場合
					if (!checkDpt(crtDpt, canAcDt)) {
						// 新規部門と同じ値
						setCrtValue(row, dptCdCol, colMap);
						// 取消計上日で、新規部門の部門情報よりＷＧを取得
						setDptWg(row, dptCdCol, canAcDt);
						// 新規データと同じ担当者
						if (isSame(dptCdCol, SLS_DPT_CD)) {
							setCrtValue(row, SLS_USR_CD, colMap);
						}
						else if (isSame(dptCdCol, PURC_DPT_CD)) {
							setCrtValue(row, PURC_USR_CD, colMap);
						}
					}
					// 新規部門が取消計上日で無効の場合
					else {
						// 元部門を取消計上日で部門変換
						getNewDptCanAcDt(row, dptCdCol);
						// 取消計上日で、部門変換した部門の部門情報よりＷＧを取得
						setDptWg(row, dptCdCol, canAcDt);
					}
				}
			}
		}
	}
	
	/**
	 * 処理対象部門を取消計上日で部門変換し再セット
	 * 
	 * @param row 処理対象ロウ
	 * @param dptCdCol 処理対象の部門ＣＤカラム名
	 */
	protected void getNewDptCanAcDt(MCRow row, String dptCdCol) {
		// メッセージプールの退避
		MCMessageList mL = (MCMessageList)MCMessagePool.getMessageList().clone();
		MCMessagePool.clear();
		
		// 元部門を取消計上日で部門変換
		MAUCL_DptUtil.setDpt(row, dptCdCol, null, CAN_AC_DT, true);
		// 取得できない場合はエラー
		if (row.getBooleanNE("err_flg")) {
			MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
			MCMessagePool.removeAll(MCMessagePool.getMessageList());
			throw ex;
		}
		
		// 退避していたメッセージを戻す
		MCMessagePool.clear();
		MCMessagePool.addAll(mL);
	}
	
	/**
	 * 基準日に応じた部門情報を取得しＷＧをセット
	 * 
	 * @param row 処理対象ロウ
	 * @param dptCdCol 処理対象の部門ＣＤカラム名
	 * @param dt 基準日
	 */
	protected void setDptWg(MCRow row, String dptCdCol, MCDate dt) {
		MAM_DPT_R newDpt = getDptCache(row.getStringNE(dptCdCol), dt);
		if (isSame(dptCdCol, SLS_DPT_CD) || isSame(dptCdCol, PURC_DPT_CD)) {
			if (row.contains(WG_CD)) {
				row.setString(WG_CD, newDpt.wg_cd());
			}
		}
		else if (isSame(dptCdCol, BD_DPT_CD)) {
			if (row.contains(BD_WG_CD)) {
				row.setString(BD_WG_CD, newDpt.wg_cd());
			}
		}
	}

	protected void setCrtValue(MCRow row, String col, Map<String,String> colMap) {
		// 指定したカラムがある場合、かつ、設定する新規データの値がある場合のみ設定する
		if (row.contains(col)) {
			String crtValue = row.getStringNE(getColumn(colMap, _getCrtColumn(col)));
			if (!isNull(crtValue)) {
				row.setString(col, crtValue);
			}
		}
	}

	/**
	 * 引数のカラム名に「crt_」を付加した文字列を返却する
	 * 
	 * @param col カラム名
	 * @return 編集後の文字列
	 */
	public static String getCrtColumn(String col) {
		return getThis()._getCrtColumn(col);
	}
	protected String _getCrtColumn(String col) {
		StringBuilder sb = new StringBuilder();
		sb.append(CRT);
		sb.append(col);
		return sb.toString(); 
	}

	protected String getColumn(Map<String, String> colMap, String keyCol) {
		if (colMap == null || isNull(colMap.get(keyCol))) {
			return keyCol;
		}
		else {
			return colMap.get(keyCol);
		}
	}

	protected FXUCL_Cache<Boolean> _checkDpt = null;
	protected boolean checkDpt(String dptCd, MCDate dt) {
		if (_checkDpt == null) {
			_checkDpt = new FXUCL_Cache<Boolean>();
			_checkDpt.setFixMaxCacheSize(-1);
		}
		if (isNull(_checkDpt.getCache(dptCd, dt))) {
			MCRow r = MCRow.create();
			sql(createSqlId(LOGIC_ID, "MAPA_DPT$F_CHECK_DPT_CD", "checkDpt"))
					.mainQuery()
					.select(MAPA_DPT$F_CHECK_DPT_CD(value(dptCd), value(dt))
							.as("dpt_cd"))
					.executeQuery(r);
			_checkDpt.putCache(new Comparable<?>[] {dptCd, dt}, isNull(r.getStringNE("dpt_cd")));
		}
		return _checkDpt.getCache(dptCd, dt);
	}
	//FMCB CUSTOM END
}