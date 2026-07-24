package mcframe.clientMSBE.MSBEP2210;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends mcframe.clientMSBD.MSBDP0140.CndR {

	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	public static final String $rcpt_iv_src_typ = "rcpt_iv_src_typ";
	public static final String $io_srch_only_flg = "io_srch_only_flg";


	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_src_typ_META = createCommonMeta($rcpt_iv_src_typ, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP);
	public static final MCMeta io_srch_only_flg_META = createCommonMeta($io_srch_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		mcframe.clientMSBD.MSBDP0140.CndR.constMetas,
		new MCMeta[]{
			rcpt_iv_mng_no_META,
			rcpt_iv_src_typ_META,
			io_srch_only_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		mcframe.clientMSBD.MSBDP0140.CndR.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[PURC_ONLY_ITEM]のキー定数 */
	public static final String $$PURC_ONLY_ITEM = "PURC_ONLY_ITEM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMSBD.MSBDP0140.CndR.EXTMAP,
		new MCExtMap.Entry($$PURC_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$srch_tgt_typ, "E"},	// srch_tgt_typ
				{$srch_tgt_typ_nm, "E"},	// srch_tgt_typ_nm
				{$srch_tgt_no, "E"},	// srch_tgt_no
				{$purc_schd_dt_to, "E"}	// purc_schd_dt_to
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	public String rcpt_iv_mng_no() {
		return getConstString(offset + 0, $rcpt_iv_mng_no);
	}

	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 0, $rcpt_iv_mng_no, value);
	}


	public String rcpt_iv_src_typ() {
		return getConstString(offset + 1, $rcpt_iv_src_typ);
	}

	public void rcpt_iv_src_typ(String value) {
		setConstString(offset + 1, $rcpt_iv_src_typ, value);
	}


	public boolean io_srch_only_flg() {
		return getConstBoolean(offset + 2, $io_srch_only_flg);
	}

	public void io_srch_only_flg(boolean value) {
		setConstBoolean(offset + 2, $io_srch_only_flg, value);
	}


	public String getString(String name) {
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			return io_srch_only_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			return io_srch_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			io_srch_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			io_srch_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

