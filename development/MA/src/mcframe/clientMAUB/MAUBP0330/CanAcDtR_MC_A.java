package mcframe.clientMAUB.MAUBP0330;

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
 * ブロック"CanAcDt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CanAcDtR_MC_A extends MCConstRow {

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt_for_input = "can_ac_dt_for_input";
	/**
	 * Cancellation recording date (For communication) 取消計上日（通信用）.<p>
	 *
	 */
	public static final String $can_ac_dt_for_call = "can_ac_dt_for_call";
	/**
	 * Recording date (At search) 計上日（検索時）.<p>
	 *
	 */
	public static final String $ac_dt_after_srch = "ac_dt_after_srch";


	public static final MCMeta can_ac_dt_for_input_META = createCommonMeta($can_ac_dt_for_input, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_for_call_META = createCommonMeta($can_ac_dt_for_call, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_after_srch_META = createCommonMeta($ac_dt_after_srch, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<CanAcDtR> constMetas = new ConstMetaList<CanAcDtR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			can_ac_dt_for_input_META,
			can_ac_dt_for_call_META,
			ac_dt_after_srch_META
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
	protected CanAcDtR_MC_A(ConstMetaList<? extends CanAcDtR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CanAcDtR clone() {
		return (CanAcDtR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CanAcDtR createInstance() {
		return (CanAcDtR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CanAcDtR getValues(String... names) {
		return (CanAcDtR) super.getValues(names);
	}



	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt_for_input() {
		return getConstDate(offset + 0, $can_ac_dt_for_input);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt_for_input(MCDate value) {
		setConstDate(offset + 0, $can_ac_dt_for_input, value);
	}


	/**
	 * Cancellation recording date (For communication) 取消計上日（通信用）.<p>
	 *
	 */
	public MCDate can_ac_dt_for_call() {
		return getConstDate(offset + 1, $can_ac_dt_for_call);
	}

	/**
	 * Cancellation recording date (For communication) 取消計上日（通信用）.<p>
	 *
	 */
	public void can_ac_dt_for_call(MCDate value) {
		setConstDate(offset + 1, $can_ac_dt_for_call, value);
	}


	/**
	 * Recording date (At search) 計上日（検索時）.<p>
	 *
	 */
	public MCDate ac_dt_after_srch() {
		return getConstDate(offset + 2, $ac_dt_after_srch);
	}

	/**
	 * Recording date (At search) 計上日（検索時）.<p>
	 *
	 */
	public void ac_dt_after_srch(MCDate value) {
		setConstDate(offset + 2, $ac_dt_after_srch, value);
	}


	public MCDate getDate(String name) {
		if ($can_ac_dt_for_input.equalsIgnoreCase(name)) {
			return can_ac_dt_for_input();
		}
		if ($can_ac_dt_for_call.equalsIgnoreCase(name)) {
			return can_ac_dt_for_call();
		}
		if ($ac_dt_after_srch.equalsIgnoreCase(name)) {
			return ac_dt_after_srch();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($can_ac_dt_for_input.equalsIgnoreCase(name)) {
			return can_ac_dt_for_input();
		}
		if ($can_ac_dt_for_call.equalsIgnoreCase(name)) {
			return can_ac_dt_for_call();
		}
		if ($ac_dt_after_srch.equalsIgnoreCase(name)) {
			return ac_dt_after_srch();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($can_ac_dt_for_input.equalsIgnoreCase(name)) {
			can_ac_dt_for_input(value);
			return;
		}
		if ($can_ac_dt_for_call.equalsIgnoreCase(name)) {
			can_ac_dt_for_call(value);
			return;
		}
		if ($ac_dt_after_srch.equalsIgnoreCase(name)) {
			ac_dt_after_srch(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt_for_input.equalsIgnoreCase(name)) {
			can_ac_dt_for_input(value);
			return;
		}
		if ($can_ac_dt_for_call.equalsIgnoreCase(name)) {
			can_ac_dt_for_call(value);
			return;
		}
		if ($ac_dt_after_srch.equalsIgnoreCase(name)) {
			ac_dt_after_srch(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

