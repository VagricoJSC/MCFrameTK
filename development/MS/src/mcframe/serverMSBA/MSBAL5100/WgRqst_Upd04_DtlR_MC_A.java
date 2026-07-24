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
 * ブロック"WgRqst_Upd04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Upd04_DtlR_MC_A extends MCConstRow {

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public static final String $re_rqst_flg = "re_rqst_flg";
	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public static final String $re_rqst_dt = "re_rqst_dt";
	/**
	 * Readjustment request remarks 再調整依頼備考.<p>
	 *
	 */
	public static final String $wg_re_rqst_cnt_rmrks = "wg_re_rqst_cnt_rmrks";
	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public static final String $prms_uncn_flg = "prms_uncn_flg";
	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_flg = "dlv_inst_rcpt_flg";


	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta re_rqst_flg_META = createCommonMeta($re_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_rqst_dt_META = createCommonMeta($re_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_re_rqst_cnt_rmrks_META = createCommonMeta($wg_re_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RE_RQST_CNT_RMRKS);
	public static final MCMeta prms_uncn_flg_META = createCommonMeta($prms_uncn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_rcpt_flg_META = createCommonMeta($dlv_inst_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<WgRqst_Upd04_DtlR> constMetas = new ConstMetaList<WgRqst_Upd04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_rqst_no_META,
			re_rqst_flg_META,
			re_rqst_dt_META,
			wg_re_rqst_cnt_rmrks_META,
			prms_uncn_flg_META,
			dlv_inst_rcpt_flg_META
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
	protected WgRqst_Upd04_DtlR_MC_A(ConstMetaList<? extends WgRqst_Upd04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd04_DtlR clone() {
		return (WgRqst_Upd04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd04_DtlR createInstance() {
		return (WgRqst_Upd04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd04_DtlR getValues(String... names) {
		return (WgRqst_Upd04_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 0, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 0, $wg_rqst_no, value);
	}


	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return getConstBoolean(offset + 1, $re_rqst_flg);
	}

	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		setConstBoolean(offset + 1, $re_rqst_flg, value);
	}


	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public MCDate re_rqst_dt() {
		return getConstDate(offset + 2, $re_rqst_dt);
	}

	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public void re_rqst_dt(MCDate value) {
		setConstDate(offset + 2, $re_rqst_dt, value);
	}


	/**
	 * Readjustment request remarks 再調整依頼備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return getConstString(offset + 3, $wg_re_rqst_cnt_rmrks);
	}

	/**
	 * Readjustment request remarks 再調整依頼備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		setConstString(offset + 3, $wg_re_rqst_cnt_rmrks, value);
	}


	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public boolean prms_uncn_flg() {
		return getConstBoolean(offset + 4, $prms_uncn_flg);
	}

	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public void prms_uncn_flg(boolean value) {
		setConstBoolean(offset + 4, $prms_uncn_flg, value);
	}


	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public boolean dlv_inst_rcpt_flg() {
		return getConstBoolean(offset + 5, $dlv_inst_rcpt_flg);
	}

	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public void dlv_inst_rcpt_flg(boolean value) {
		setConstBoolean(offset + 5, $dlv_inst_rcpt_flg, value);
	}


	public String getString(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

