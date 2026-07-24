package mcframe.clientMBBB.MBBBP0110;

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
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * SD,Send;CAN,Cancel sending;DEL,Delete;UPD,Update remarks;REF,View SD,送信する;CAN,送信を取り消す;DEL,削除する;UPD,備考を更新する;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_ym_fr = "ac_ym_fr";
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public static final String $ac_ym_to = "ac_ym_to";
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public static final String $ac_slip_dt = "ac_slip_dt";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public static final String $data_typ = "data_typ";
	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public static final String $data_typ_nm = "data_typ_nm";
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public static final String $jnl_rmrks = "jnl_rmrks";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta ac_ym_fr_META = createCommonMeta($ac_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_to_META = createCommonMeta($ac_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_slip_dt_META = createCommonMeta($ac_slip_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta data_typ_META = createCommonMeta($data_typ, mcframe.commonMA.meta.MA_META.DATA_TYP);
	public static final MCMeta data_typ_nm_META = createCommonMeta($data_typ_nm, mcframe.commonMA.meta.MA_META.DATA_TYP_NM);
	public static final MCMeta jnl_rmrks_META = createCommonMeta($jnl_rmrks, mcframe.commonMA.meta.MA_META.JNL_RMRKS);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ac_ym_fr_META,
			ac_ym_to_META,
			ac_slip_dt_META,
			jnl_act_cd_META,
			jnl_act_nm_META,
			data_typ_META,
			data_typ_nm_META,
			jnl_rmrks_META
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
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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



	/**
	 * SD,Send;CAN,Cancel sending;DEL,Delete;UPD,Update remarks;REF,View SD,送信する;CAN,送信を取り消す;DEL,削除する;UPD,備考を更新する;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * SD,Send;CAN,Cancel sending;DEL,Delete;UPD,Update remarks;REF,View SD,送信する;CAN,送信を取り消す;DEL,削除する;UPD,備考を更新する;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_ym_fr() {
		return getConstDate(offset + 1, $ac_ym_fr);
	}

	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public void ac_ym_fr(MCDate value) {
		setConstDate(offset + 1, $ac_ym_fr, value);
	}


	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDate ac_ym_to() {
		return getConstDate(offset + 2, $ac_ym_to);
	}

	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public void ac_ym_to(MCDate value) {
		setConstDate(offset + 2, $ac_ym_to, value);
	}


	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCDate ac_slip_dt() {
		return getConstDate(offset + 3, $ac_slip_dt);
	}

	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public void ac_slip_dt(MCDate value) {
		setConstDate(offset + 3, $ac_slip_dt, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 4, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 4, $jnl_act_cd, value);
	}


	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 5, $jnl_act_nm);
	}

	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 5, $jnl_act_nm, value);
	}


	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public String data_typ() {
		return getConstString(offset + 6, $data_typ);
	}

	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public void data_typ(String value) {
		setConstString(offset + 6, $data_typ, value);
	}


	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public String data_typ_nm() {
		return getConstString(offset + 7, $data_typ_nm);
	}

	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public void data_typ_nm(String value) {
		setConstString(offset + 7, $data_typ_nm, value);
	}


	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public String jnl_rmrks() {
		return getConstString(offset + 8, $jnl_rmrks);
	}

	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public void jnl_rmrks(String value) {
		setConstString(offset + 8, $jnl_rmrks, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			return data_typ_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			return data_typ_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			data_typ_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			data_typ_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

