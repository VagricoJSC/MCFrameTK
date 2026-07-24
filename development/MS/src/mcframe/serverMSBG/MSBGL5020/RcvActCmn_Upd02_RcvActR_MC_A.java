package mcframe.serverMSBG.MSBGL5020;

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
 * ブロック"RcvActCmn_Upd02_RcvAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvActCmn_Upd02_RcvActR_MC_A extends MCConstRow {

	/**
	 * Transfer source transaction cd. 振替元取引ＣＤ.<p>
	 *
	 */
	public static final String $fr_trd_cd = "fr_trd_cd";
	/**
	 * Transfer source payment result No. 振替元入金実績ＮＯ.<p>
	 *
	 */
	public static final String $fr_rcv_act_no = "fr_rcv_act_no";
	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public static final String $fr_rcv_act_seq = "fr_rcv_act_seq";
	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public static final String $fr_rcv_act_rev = "fr_rcv_act_rev";
	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public static final String $to_trd_cd = "to_trd_cd";
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public static final String $to_rcv_act_no = "to_rcv_act_no";
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public static final String $to_rcv_act_seq = "to_rcv_act_seq";
	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public static final String $to_rcv_act_rev = "to_rcv_act_rev";


	public static final MCMeta fr_trd_cd_META = createCommonMeta($fr_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta fr_rcv_act_no_META = createCommonMeta($fr_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta fr_rcv_act_seq_META = createCommonMeta($fr_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta fr_rcv_act_rev_META = createCommonMeta($fr_rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta to_trd_cd_META = createCommonMeta($to_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta to_rcv_act_no_META = createCommonMeta($to_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta to_rcv_act_seq_META = createCommonMeta($to_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta to_rcv_act_rev_META = createCommonMeta($to_rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final ConstMetaList<RcvActCmn_Upd02_RcvActR> constMetas = new ConstMetaList<RcvActCmn_Upd02_RcvActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			fr_trd_cd_META,
			fr_rcv_act_no_META,
			fr_rcv_act_seq_META,
			fr_rcv_act_rev_META,
			to_trd_cd_META,
			to_rcv_act_no_META,
			to_rcv_act_seq_META,
			to_rcv_act_rev_META
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
	protected RcvActCmn_Upd02_RcvActR_MC_A(ConstMetaList<? extends RcvActCmn_Upd02_RcvActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_RcvActR clone() {
		return (RcvActCmn_Upd02_RcvActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_RcvActR createInstance() {
		return (RcvActCmn_Upd02_RcvActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_RcvActR getValues(String... names) {
		return (RcvActCmn_Upd02_RcvActR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transfer source transaction cd. 振替元取引ＣＤ.<p>
	 *
	 */
	public String fr_trd_cd() {
		return getConstString(offset + 0, $fr_trd_cd);
	}

	/**
	 * Transfer source transaction cd. 振替元取引ＣＤ.<p>
	 *
	 */
	public void fr_trd_cd(String value) {
		setConstString(offset + 0, $fr_trd_cd, value);
	}


	/**
	 * Transfer source payment result No. 振替元入金実績ＮＯ.<p>
	 *
	 */
	public String fr_rcv_act_no() {
		return getConstString(offset + 1, $fr_rcv_act_no);
	}

	/**
	 * Transfer source payment result No. 振替元入金実績ＮＯ.<p>
	 *
	 */
	public void fr_rcv_act_no(String value) {
		setConstString(offset + 1, $fr_rcv_act_no, value);
	}


	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public MCNumber fr_rcv_act_seq() {
		return getConstNumber(offset + 2, $fr_rcv_act_seq);
	}

	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public void fr_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 2, $fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public void fr_rcv_act_seq(int value) {
		setConstNumber(offset + 2, $fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public void fr_rcv_act_seq(long value) {
		setConstNumber(offset + 2, $fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public void fr_rcv_act_seq(float value) {
		setConstNumber(offset + 2, $fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元入金実績連番.<p>
	 *
	 */
	public void fr_rcv_act_seq(double value) {
		setConstNumber(offset + 2, $fr_rcv_act_seq, value);
	}


	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public MCNumber fr_rcv_act_rev() {
		return getConstNumber(offset + 3, $fr_rcv_act_rev);
	}

	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public void fr_rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 3, $fr_rcv_act_rev, value);
	}

	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public void fr_rcv_act_rev(int value) {
		setConstNumber(offset + 3, $fr_rcv_act_rev, value);
	}

	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public void fr_rcv_act_rev(long value) {
		setConstNumber(offset + 3, $fr_rcv_act_rev, value);
	}

	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public void fr_rcv_act_rev(float value) {
		setConstNumber(offset + 3, $fr_rcv_act_rev, value);
	}

	/**
	 * Transfer source payment result rev. number 振替元入金実績改訂番号.<p>
	 *
	 */
	public void fr_rcv_act_rev(double value) {
		setConstNumber(offset + 3, $fr_rcv_act_rev, value);
	}


	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public String to_trd_cd() {
		return getConstString(offset + 4, $to_trd_cd);
	}

	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public void to_trd_cd(String value) {
		setConstString(offset + 4, $to_trd_cd, value);
	}


	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public String to_rcv_act_no() {
		return getConstString(offset + 5, $to_rcv_act_no);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_no(String value) {
		setConstString(offset + 5, $to_rcv_act_no, value);
	}


	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public MCNumber to_rcv_act_seq() {
		return getConstNumber(offset + 6, $to_rcv_act_seq);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 6, $to_rcv_act_seq, value);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_seq(int value) {
		setConstNumber(offset + 6, $to_rcv_act_seq, value);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_seq(long value) {
		setConstNumber(offset + 6, $to_rcv_act_seq, value);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_seq(float value) {
		setConstNumber(offset + 6, $to_rcv_act_seq, value);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void to_rcv_act_seq(double value) {
		setConstNumber(offset + 6, $to_rcv_act_seq, value);
	}


	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public MCNumber to_rcv_act_rev() {
		return getConstNumber(offset + 7, $to_rcv_act_rev);
	}

	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public void to_rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 7, $to_rcv_act_rev, value);
	}

	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public void to_rcv_act_rev(int value) {
		setConstNumber(offset + 7, $to_rcv_act_rev, value);
	}

	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public void to_rcv_act_rev(long value) {
		setConstNumber(offset + 7, $to_rcv_act_rev, value);
	}

	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public void to_rcv_act_rev(float value) {
		setConstNumber(offset + 7, $to_rcv_act_rev, value);
	}

	/**
	 * Transfer destination payment result rev. number 振替先入金実績改訂番号.<p>
	 *
	 */
	public void to_rcv_act_rev(double value) {
		setConstNumber(offset + 7, $to_rcv_act_rev, value);
	}


	public String getString(String name) {
		if ($fr_trd_cd.equalsIgnoreCase(name)) {
			return fr_trd_cd();
		}
		if ($fr_rcv_act_no.equalsIgnoreCase(name)) {
			return fr_rcv_act_no();
		}
		if ($to_trd_cd.equalsIgnoreCase(name)) {
			return to_trd_cd();
		}
		if ($to_rcv_act_no.equalsIgnoreCase(name)) {
			return to_rcv_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			return fr_rcv_act_seq();
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			return fr_rcv_act_rev();
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			return to_rcv_act_seq();
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			return to_rcv_act_rev();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($fr_trd_cd.equalsIgnoreCase(name)) {
			return fr_trd_cd();
		}
		if ($fr_rcv_act_no.equalsIgnoreCase(name)) {
			return fr_rcv_act_no();
		}
		if ($to_trd_cd.equalsIgnoreCase(name)) {
			return to_trd_cd();
		}
		if ($to_rcv_act_no.equalsIgnoreCase(name)) {
			return to_rcv_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			return fr_rcv_act_seq();
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			return fr_rcv_act_rev();
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			return to_rcv_act_seq();
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			return to_rcv_act_rev();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_trd_cd.equalsIgnoreCase(name)) {
			fr_trd_cd(value);
			return;
		}
		if ($fr_rcv_act_no.equalsIgnoreCase(name)) {
			fr_rcv_act_no(value);
			return;
		}
		if ($to_trd_cd.equalsIgnoreCase(name)) {
			to_trd_cd(value);
			return;
		}
		if ($to_rcv_act_no.equalsIgnoreCase(name)) {
			to_rcv_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_trd_cd.equalsIgnoreCase(name)) {
			fr_trd_cd(value);
			return;
		}
		if ($fr_rcv_act_no.equalsIgnoreCase(name)) {
			fr_rcv_act_no(value);
			return;
		}
		if ($to_trd_cd.equalsIgnoreCase(name)) {
			to_trd_cd(value);
			return;
		}
		if ($to_rcv_act_no.equalsIgnoreCase(name)) {
			to_rcv_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($fr_rcv_act_seq.equalsIgnoreCase(name)) {
			fr_rcv_act_seq(value);
			return;
		}
		if ($fr_rcv_act_rev.equalsIgnoreCase(name)) {
			fr_rcv_act_rev(value);
			return;
		}
		if ($to_rcv_act_seq.equalsIgnoreCase(name)) {
			to_rcv_act_seq(value);
			return;
		}
		if ($to_rcv_act_rev.equalsIgnoreCase(name)) {
			to_rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

