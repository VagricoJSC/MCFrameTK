package mcframe.clientMGBF.MGBFP0250;

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
	 * REF,View,0;UPD,Create,1;DEL,Delete,2; REF,参照する,0;UPD,作成する,1;DEL,削除する,2;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	public static final String $calc_no_p = "calc_no_p";
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public static final String $cost_io_id = "cost_io_id";
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public static final String $cost_io_nm = "cost_io_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Not created 未作成.<p>
	 *
	 */
	public static final String $unmake_flg = "unmake_flg";
	/**
	 * Created 作成済.<p>
	 *
	 */
	public static final String $made_flg = "made_flg";

	public static final String $calc_no = $calc_no_p + ".calc_no";
	public static final String $rmrks = $calc_no_p + ".rmrks";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_p_META = createInnerRowMeta($calc_no_p, mcframe.clientMGUB.MGUBP0010.CalcNoR.class);
	public static final MCMeta cost_io_id_META = createCommonMeta($cost_io_id, mcframe.commonMA.meta.MA_META.COST_IO_ID);
	public static final MCMeta cost_io_nm_META = createCommonMeta($cost_io_nm, mcframe.commonMA.meta.MA_META.COST_IO_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta unmake_flg_META = createCommonMeta($unmake_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta made_flg_META = createCommonMeta($made_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_p_META,
			cost_io_id_META,
			cost_io_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			unmake_flg_META,
			made_flg_META
		},
		new String[][]{
			{
				"calc_no",
				"rmrks"
			},
			{
				$calc_no,
				$rmrks
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

	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_no_p + ".calc_no", "calc_grp_cd"},	// calc_no_p.calc_no
				{$cost_io_id, "calc_grp_cd"}	// cost_io_id
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
	 * REF,View,0;UPD,Create,1;DEL,Delete,2; REF,参照する,0;UPD,作成する,1;DEL,削除する,2;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REF,View,0;UPD,Create,1;DEL,Delete,2; REF,参照する,0;UPD,作成する,1;DEL,削除する,2;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}


	public mcframe.clientMGUB.MGUBP0010.CalcNoR calc_no_p(){
		return (mcframe.clientMGUB.MGUBP0010.CalcNoR) getConstInnerRow(offset + 3, $calc_no_p);
	}
	
	public void calc_no_p(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		setConstInnerRow(offset + 3, $calc_no_p, row);
	}


	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumber cost_io_id() {
		return getConstNumber(offset + 4, $cost_io_id);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(MCNumber value) {
		setConstNumber(offset + 4, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(int value) {
		setConstNumber(offset + 4, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(long value) {
		setConstNumber(offset + 4, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(float value) {
		setConstNumber(offset + 4, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(double value) {
		setConstNumber(offset + 4, $cost_io_id, value);
	}


	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public String cost_io_nm() {
		return getConstString(offset + 5, $cost_io_nm);
	}

	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public void cost_io_nm(String value) {
		setConstString(offset + 5, $cost_io_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 6, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 6, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 7, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 7, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 8, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 8, $memo3, value);
	}


	/**
	 * Not created 未作成.<p>
	 *
	 */
	public boolean unmake_flg() {
		return getConstBoolean(offset + 9, $unmake_flg);
	}

	/**
	 * Not created 未作成.<p>
	 *
	 */
	public void unmake_flg(boolean value) {
		setConstBoolean(offset + 9, $unmake_flg, value);
	}


	/**
	 * Created 作成済.<p>
	 *
	 */
	public boolean made_flg() {
		return getConstBoolean(offset + 10, $made_flg);
	}

	/**
	 * Created 作成済.<p>
	 *
	 */
	public void made_flg(boolean value) {
		setConstBoolean(offset + 10, $made_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			return cost_io_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($unmake_flg.equalsIgnoreCase(name)) {
			return unmake_flg();
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			return made_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			return cost_io_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unmake_flg.equalsIgnoreCase(name)) {
			return unmake_flg();
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			return made_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			cost_io_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unmake_flg.equalsIgnoreCase(name)) {
			unmake_flg(value);
			return;
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			made_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			cost_io_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unmake_flg.equalsIgnoreCase(name)) {
			unmake_flg(value);
			return;
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			made_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			return calc_no_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			calc_no_p(
				((MCContainerMeta) calc_no_p_META).castInnerRow(mcframe.clientMGUB.MGUBP0010.CalcNoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String calc_no() {
		return calc_no_p().calc_no();
	}

	public void calc_no(String value) {
		calc_no_p().calc_no(value);
	}

	public String rmrks() {
		return calc_no_p().rmrks();
	}

	public void rmrks(String value) {
		calc_no_p().rmrks(value);
	}

}

