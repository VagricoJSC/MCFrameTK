package mcframe.serverMSBA.MSBAL5100;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"WgRqst_Upd02_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Upd02_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";
	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public static final String $re_prms_dt = "re_prms_dt";
	/**
	 * Manual reply 手動回答.<p>
	 *
	 */
	public static final String $man_prms_flg = "man_prms_flg";
	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public static final String $auto_prms_flg = "auto_prms_flg";
	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public static final String $auto_prms_tgt_flg = "auto_prms_tgt_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta man_prms_flg_META = createCommonMeta($man_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_prms_flg_META = createCommonMeta($auto_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_prms_tgt_flg_META = createCommonMeta($auto_prms_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<WgRqst_Upd02_Dtl1R> constMetas = new ConstMetaList<WgRqst_Upd02_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			wg_rqst_no_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			man_prms_flg_META,
			auto_prms_flg_META,
			auto_prms_tgt_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected WgRqst_Upd02_Dtl1R_MC_A(ConstMetaList<? extends WgRqst_Upd02_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl1R clone() {
		return (WgRqst_Upd02_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl1R createInstance() {
		return (WgRqst_Upd02_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl1R getValues(String... names) {
		return (WgRqst_Upd02_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 2, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 2, $wg_rqst_no, value);
	}


	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 3, $prms_ntc_flg);
	}

	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 3, $prms_ntc_flg, value);
	}


	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 4, $prms_dt);
	}

	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 4, $prms_dt, value);
	}


	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 5, $re_prms_ntc_flg);
	}

	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 5, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 6, $re_prms_dt);
	}

	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 6, $re_prms_dt, value);
	}


	/**
	 * Manual reply 手動回答.<p>
	 *
	 */
	public boolean man_prms_flg() {
		return getConstBoolean(offset + 7, $man_prms_flg);
	}

	/**
	 * Manual reply 手動回答.<p>
	 *
	 */
	public void man_prms_flg(boolean value) {
		setConstBoolean(offset + 7, $man_prms_flg, value);
	}


	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public boolean auto_prms_flg() {
		return getConstBoolean(offset + 8, $auto_prms_flg);
	}

	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public void auto_prms_flg(boolean value) {
		setConstBoolean(offset + 8, $auto_prms_flg, value);
	}


	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public boolean auto_prms_tgt_flg() {
		return getConstBoolean(offset + 9, $auto_prms_tgt_flg);
	}

	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public void auto_prms_tgt_flg(boolean value) {
		setConstBoolean(offset + 9, $auto_prms_tgt_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($man_prms_flg.equalsIgnoreCase(name)) {
			return man_prms_flg();
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			return auto_prms_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($man_prms_flg.equalsIgnoreCase(name)) {
			return man_prms_flg();
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			return auto_prms_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($man_prms_flg.equalsIgnoreCase(name)) {
			man_prms_flg(value);
			return;
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			auto_prms_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($man_prms_flg.equalsIgnoreCase(name)) {
			man_prms_flg(value);
			return;
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			auto_prms_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

