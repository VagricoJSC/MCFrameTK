package mcframe.clientMBBE.MBBEP0100;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMBBE.MBBEP0100.MBBEP_SrchRsltRef_MC.MB_MBBEL0040_Prnt01Caller;

/**
 * 画面"MBBEP_SrchRsltRef"パネルクラスです。<p>
 *
 * 検索ＳＱＬ実行結果を参照します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_SrchRsltRef_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBEP0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_nm = null;
	public MCLabel Cnd_bind_Label = null;
	/**
	 * Bind バインド.<p>
	 *
	 */
	public MCTextField Cnd_bind = null;
	/**
	 * Redisplay 再表示する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton Cnd_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0100.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	public MCColumnConfig columnRslt_disp_str001 = null;
	public MCColumnConfig columnRslt_disp_str002 = null;
	public MCColumnConfig columnRslt_disp_str003 = null;
	public MCColumnConfig columnRslt_disp_str004 = null;
	public MCColumnConfig columnRslt_disp_str005 = null;
	public MCColumnConfig columnRslt_disp_str006 = null;
	public MCColumnConfig columnRslt_disp_str007 = null;
	public MCColumnConfig columnRslt_disp_str008 = null;
	public MCColumnConfig columnRslt_disp_str009 = null;
	public MCColumnConfig columnRslt_disp_str010 = null;
	public MCColumnConfig columnRslt_disp_str011 = null;
	public MCColumnConfig columnRslt_disp_str012 = null;
	public MCColumnConfig columnRslt_disp_str013 = null;
	public MCColumnConfig columnRslt_disp_str014 = null;
	public MCColumnConfig columnRslt_disp_str015 = null;
	public MCColumnConfig columnRslt_disp_str016 = null;
	public MCColumnConfig columnRslt_disp_str017 = null;
	public MCColumnConfig columnRslt_disp_str018 = null;
	public MCColumnConfig columnRslt_disp_str019 = null;
	public MCColumnConfig columnRslt_disp_str020 = null;
	public MCColumnConfig columnRslt_disp_str021 = null;
	public MCColumnConfig columnRslt_disp_str022 = null;
	public MCColumnConfig columnRslt_disp_str023 = null;
	public MCColumnConfig columnRslt_disp_str024 = null;
	public MCColumnConfig columnRslt_disp_str025 = null;
	public MCColumnConfig columnRslt_disp_str026 = null;
	public MCColumnConfig columnRslt_disp_str027 = null;
	public MCColumnConfig columnRslt_disp_str028 = null;
	public MCColumnConfig columnRslt_disp_str029 = null;
	public MCColumnConfig columnRslt_disp_str030 = null;
	public MCColumnConfig columnRslt_disp_str031 = null;
	public MCColumnConfig columnRslt_disp_str032 = null;
	public MCColumnConfig columnRslt_disp_str033 = null;
	public MCColumnConfig columnRslt_disp_str034 = null;
	public MCColumnConfig columnRslt_disp_str035 = null;
	public MCColumnConfig columnRslt_disp_str036 = null;
	public MCColumnConfig columnRslt_disp_str037 = null;
	public MCColumnConfig columnRslt_disp_str038 = null;
	public MCColumnConfig columnRslt_disp_str039 = null;
	public MCColumnConfig columnRslt_disp_str040 = null;
	public MCColumnConfig columnRslt_disp_str041 = null;
	public MCColumnConfig columnRslt_disp_str042 = null;
	public MCColumnConfig columnRslt_disp_str043 = null;
	public MCColumnConfig columnRslt_disp_str044 = null;
	public MCColumnConfig columnRslt_disp_str045 = null;
	public MCColumnConfig columnRslt_disp_str046 = null;
	public MCColumnConfig columnRslt_disp_str047 = null;
	public MCColumnConfig columnRslt_disp_str048 = null;
	public MCColumnConfig columnRslt_disp_str049 = null;
	public MCColumnConfig columnRslt_disp_str050 = null;
	public MCColumnConfig columnRslt_disp_str051 = null;
	public MCColumnConfig columnRslt_disp_str052 = null;
	public MCColumnConfig columnRslt_disp_str053 = null;
	public MCColumnConfig columnRslt_disp_str054 = null;
	public MCColumnConfig columnRslt_disp_str055 = null;
	public MCColumnConfig columnRslt_disp_str056 = null;
	public MCColumnConfig columnRslt_disp_str057 = null;
	public MCColumnConfig columnRslt_disp_str058 = null;
	public MCColumnConfig columnRslt_disp_str059 = null;
	public MCColumnConfig columnRslt_disp_str060 = null;
	public MCColumnConfig columnRslt_disp_str061 = null;
	public MCColumnConfig columnRslt_disp_str062 = null;
	public MCColumnConfig columnRslt_disp_str063 = null;
	public MCColumnConfig columnRslt_disp_str064 = null;
	public MCColumnConfig columnRslt_disp_str065 = null;
	public MCColumnConfig columnRslt_disp_str066 = null;
	public MCColumnConfig columnRslt_disp_str067 = null;
	public MCColumnConfig columnRslt_disp_str068 = null;
	public MCColumnConfig columnRslt_disp_str069 = null;
	public MCColumnConfig columnRslt_disp_str070 = null;
	public MCColumnConfig columnRslt_disp_str071 = null;
	public MCColumnConfig columnRslt_disp_str072 = null;
	public MCColumnConfig columnRslt_disp_str073 = null;
	public MCColumnConfig columnRslt_disp_str074 = null;
	public MCColumnConfig columnRslt_disp_str075 = null;
	public MCColumnConfig columnRslt_disp_str076 = null;
	public MCColumnConfig columnRslt_disp_str077 = null;
	public MCColumnConfig columnRslt_disp_str078 = null;
	public MCColumnConfig columnRslt_disp_str079 = null;
	public MCColumnConfig columnRslt_disp_str080 = null;
	public MCColumnConfig columnRslt_disp_str081 = null;
	public MCColumnConfig columnRslt_disp_str082 = null;
	public MCColumnConfig columnRslt_disp_str083 = null;
	public MCColumnConfig columnRslt_disp_str084 = null;
	public MCColumnConfig columnRslt_disp_str085 = null;
	public MCColumnConfig columnRslt_disp_str086 = null;
	public MCColumnConfig columnRslt_disp_str087 = null;
	public MCColumnConfig columnRslt_disp_str088 = null;
	public MCColumnConfig columnRslt_disp_str089 = null;
	public MCColumnConfig columnRslt_disp_str090 = null;
	public MCColumnConfig columnRslt_disp_str091 = null;
	public MCColumnConfig columnRslt_disp_str092 = null;
	public MCColumnConfig columnRslt_disp_str093 = null;
	public MCColumnConfig columnRslt_disp_str094 = null;
	public MCColumnConfig columnRslt_disp_str095 = null;
	public MCColumnConfig columnRslt_disp_str096 = null;
	public MCColumnConfig columnRslt_disp_str097 = null;
	public MCColumnConfig columnRslt_disp_str098 = null;
	public MCColumnConfig columnRslt_disp_str099 = null;
	public MCColumnConfig columnRslt_disp_str100 = null;
	public MCColumnConfig columnRslt_disp_str101 = null;
	public MCColumnConfig columnRslt_disp_str102 = null;
	public MCColumnConfig columnRslt_disp_str103 = null;
	public MCColumnConfig columnRslt_disp_str104 = null;
	public MCColumnConfig columnRslt_disp_str105 = null;
	public MCColumnConfig columnRslt_disp_str106 = null;
	public MCColumnConfig columnRslt_disp_str107 = null;
	public MCColumnConfig columnRslt_disp_str108 = null;
	public MCColumnConfig columnRslt_disp_str109 = null;
	public MCColumnConfig columnRslt_disp_str110 = null;
	public MCColumnConfig columnRslt_disp_str111 = null;
	public MCColumnConfig columnRslt_disp_str112 = null;
	public MCColumnConfig columnRslt_disp_str113 = null;
	public MCColumnConfig columnRslt_disp_str114 = null;
	public MCColumnConfig columnRslt_disp_str115 = null;
	public MCColumnConfig columnRslt_disp_str116 = null;
	public MCColumnConfig columnRslt_disp_str117 = null;
	public MCColumnConfig columnRslt_disp_str118 = null;
	public MCColumnConfig columnRslt_disp_str119 = null;
	public MCColumnConfig columnRslt_disp_str120 = null;
	public MCColumnConfig columnRslt_disp_str121 = null;
	public MCColumnConfig columnRslt_disp_str122 = null;
	public MCColumnConfig columnRslt_disp_str123 = null;
	public MCColumnConfig columnRslt_disp_str124 = null;
	public MCColumnConfig columnRslt_disp_str125 = null;
	public MCColumnConfig columnRslt_disp_str126 = null;
	public MCColumnConfig columnRslt_disp_str127 = null;
	public MCColumnConfig columnRslt_disp_str128 = null;
	public MCColumnConfig columnRslt_disp_str129 = null;
	public MCColumnConfig columnRslt_disp_str130 = null;
	public MCColumnConfig columnRslt_disp_str131 = null;
	public MCColumnConfig columnRslt_disp_str132 = null;
	public MCColumnConfig columnRslt_disp_str133 = null;
	public MCColumnConfig columnRslt_disp_str134 = null;
	public MCColumnConfig columnRslt_disp_str135 = null;
	public MCColumnConfig columnRslt_disp_str136 = null;
	public MCColumnConfig columnRslt_disp_str137 = null;
	public MCColumnConfig columnRslt_disp_str138 = null;
	public MCColumnConfig columnRslt_disp_str139 = null;
	public MCColumnConfig columnRslt_disp_str140 = null;
	public MCColumnConfig columnRslt_disp_str141 = null;
	public MCColumnConfig columnRslt_disp_str142 = null;
	public MCColumnConfig columnRslt_disp_str143 = null;
	public MCColumnConfig columnRslt_disp_str144 = null;
	public MCColumnConfig columnRslt_disp_str145 = null;
	public MCColumnConfig columnRslt_disp_str146 = null;
	public MCColumnConfig columnRslt_disp_str147 = null;
	public MCColumnConfig columnRslt_disp_str148 = null;
	public MCColumnConfig columnRslt_disp_str149 = null;
	public MCColumnConfig columnRslt_disp_str150 = null;
	public MCColumnConfig columnRslt_disp_str151 = null;
	public MCColumnConfig columnRslt_disp_str152 = null;
	public MCColumnConfig columnRslt_disp_str153 = null;
	public MCColumnConfig columnRslt_disp_str154 = null;
	public MCColumnConfig columnRslt_disp_str155 = null;
	public MCColumnConfig columnRslt_disp_str156 = null;
	public MCColumnConfig columnRslt_disp_str157 = null;
	public MCColumnConfig columnRslt_disp_str158 = null;
	public MCColumnConfig columnRslt_disp_str159 = null;
	public MCColumnConfig columnRslt_disp_str160 = null;
	public MCColumnConfig columnRslt_disp_str161 = null;
	public MCColumnConfig columnRslt_disp_str162 = null;
	public MCColumnConfig columnRslt_disp_str163 = null;
	public MCColumnConfig columnRslt_disp_str164 = null;
	public MCColumnConfig columnRslt_disp_str165 = null;
	public MCColumnConfig columnRslt_disp_str166 = null;
	public MCColumnConfig columnRslt_disp_str167 = null;
	public MCColumnConfig columnRslt_disp_str168 = null;
	public MCColumnConfig columnRslt_disp_str169 = null;
	public MCColumnConfig columnRslt_disp_str170 = null;
	public MCColumnConfig columnRslt_disp_str171 = null;
	public MCColumnConfig columnRslt_disp_str172 = null;
	public MCColumnConfig columnRslt_disp_str173 = null;
	public MCColumnConfig columnRslt_disp_str174 = null;
	public MCColumnConfig columnRslt_disp_str175 = null;
	public MCColumnConfig columnRslt_disp_str176 = null;
	public MCColumnConfig columnRslt_disp_str177 = null;
	public MCColumnConfig columnRslt_disp_str178 = null;
	public MCColumnConfig columnRslt_disp_str179 = null;
	public MCColumnConfig columnRslt_disp_str180 = null;
	public MCColumnConfig columnRslt_disp_str181 = null;
	public MCColumnConfig columnRslt_disp_str182 = null;
	public MCColumnConfig columnRslt_disp_str183 = null;
	public MCColumnConfig columnRslt_disp_str184 = null;
	public MCColumnConfig columnRslt_disp_str185 = null;
	public MCColumnConfig columnRslt_disp_str186 = null;
	public MCColumnConfig columnRslt_disp_str187 = null;
	public MCColumnConfig columnRslt_disp_str188 = null;
	public MCColumnConfig columnRslt_disp_str189 = null;
	public MCColumnConfig columnRslt_disp_str190 = null;
	public MCColumnConfig columnRslt_disp_str191 = null;
	public MCColumnConfig columnRslt_disp_str192 = null;
	public MCColumnConfig columnRslt_disp_str193 = null;
	public MCColumnConfig columnRslt_disp_str194 = null;
	public MCColumnConfig columnRslt_disp_str195 = null;
	public MCColumnConfig columnRslt_disp_str196 = null;
	public MCColumnConfig columnRslt_disp_str197 = null;
	public MCColumnConfig columnRslt_disp_str198 = null;
	public MCColumnConfig columnRslt_disp_str199 = null;
	public MCColumnConfig columnRslt_disp_str200 = null;
	public MCColumnConfig columnRslt_disp_dt001 = null;
	public MCColumnConfig columnRslt_disp_dt002 = null;
	public MCColumnConfig columnRslt_disp_dt003 = null;
	public MCColumnConfig columnRslt_disp_dt004 = null;
	public MCColumnConfig columnRslt_disp_dt005 = null;
	public MCColumnConfig columnRslt_disp_dt006 = null;
	public MCColumnConfig columnRslt_disp_dt007 = null;
	public MCColumnConfig columnRslt_disp_dt008 = null;
	public MCColumnConfig columnRslt_disp_dt009 = null;
	public MCColumnConfig columnRslt_disp_dt010 = null;
	public MCColumnConfig columnRslt_disp_num001 = null;
	public MCColumnConfig columnRslt_disp_num002 = null;
	public MCColumnConfig columnRslt_disp_num003 = null;
	public MCColumnConfig columnRslt_disp_num004 = null;
	public MCColumnConfig columnRslt_disp_num005 = null;
	public MCColumnConfig columnRslt_disp_num006 = null;
	public MCColumnConfig columnRslt_disp_num007 = null;
	public MCColumnConfig columnRslt_disp_num008 = null;
	public MCColumnConfig columnRslt_disp_num009 = null;
	public MCColumnConfig columnRslt_disp_num010 = null;
	// [RsltSml]ブロック関連のField定義
	public MCPanel RsltSmlPanel = null;
	// [RsltSml]ブロックの項目のField定義
	public MCLabel RsltSml_exec_time_Label = null;
	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public MCNumberField RsltSml_exec_time = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MB_MBBEL0040_Prnt01]のCallerの作成 */
	protected MBBEP_SrchRsltRef_MC.MB_MBBEL0040_Prnt01Caller createMB_MBBEL0040_Prnt01() {
		MBBEP_SrchRsltRef_MC.MB_MBBEL0040_Prnt01Caller<MBBEP_SrchRsltRef, MB_MBBEL0040_Prnt01Bridge>
		caller = ((MBBEP_SrchRsltRef_MC)this).new MB_MBBEL0040_Prnt01Caller<MBBEP_SrchRsltRef, MB_MBBEL0040_Prnt01Bridge>(
					(MBBEP_SrchRsltRef)this, new MB_MBBEL0040_Prnt01Bridge());
		return caller;
	}
	/** [MB_MBBEL0040_Prnt01]の呼び出し */
	protected void callMB_MBBEL0040_Prnt01() {
		MCCaller caller = createMB_MBBEL0040_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0100.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0100.RsltR> aRsltL;
	/** [RsltSml]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0100.RsltSmlR aRsltSmlR;
	/** [RsltLbl]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0100.RsltLblR aRsltLblR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0100.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0100.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBE.MBBEP0100.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0100.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBE.MBBEP0100.RsltR createRsltR() {
		return mcframe.clientMBBE.MBBEP0100.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0100.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0100.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 項目コピーによってaRsltSmlRを設定します。
	 *
	 * aRsltSmlRのインスタンスは変更されません。
	 *
	 * @param row RsltSmlR
	 */
	public void setRsltSmlR(mcframe.clientMBBE.MBBEP0100.RsltSmlR row) {
		if (row != null) {
			MCRow.copyall(getRsltSmlR(), row);
		}
	}

	/**
	 * [RsltSml]ブロックのコンテナaRsltSmlRを返します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0100.RsltSmlR getRsltSmlR() {
		return aRsltSmlR;
	}

	/**
	 * aRsltSmlRを作成します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0100.RsltSmlR createRsltSmlR() {
		return mcframe.clientMBBE.MBBEP0100.RsltSmlR.create();
	}

	/**
	 * 項目コピーによってaRsltLblRを設定します。
	 *
	 * aRsltLblRのインスタンスは変更されません。
	 *
	 * @param row RsltLblR
	 */
	public void setRsltLblR(mcframe.clientMBBE.MBBEP0100.RsltLblR row) {
		if (row != null) {
			MCRow.copyall(getRsltLblR(), row);
		}
	}

	/**
	 * [RsltLbl]ブロックのコンテナaRsltLblRを返します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0100.RsltLblR getRsltLblR() {
		return aRsltLblR;
	}

	/**
	 * aRsltLblRを作成します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0100.RsltLblR createRsltLblR() {
		return mcframe.clientMBBE.MBBEP0100.RsltLblR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltSmlR())) ret.add(getRsltSmlR());
		if(!MCCollectionUtil.contains(ret, getRsltLblR())) ret.add(getRsltLblR());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltSmlR()) return "RsltSml";
		if(aCnt == getRsltLblR()) return "RsltLbl";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltSml")) return getRsltSmlR();
		if(bId.equals("RsltLbl")) return getRsltLblR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(RsltPanel);
		ret.add(RsltSmlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_SrchRsltRef_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aRsltSmlR = createRsltSmlR();
		aRsltLblR = createRsltLblR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_SrchRsltRef_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRsltSmlR = createRsltSmlR();
		aRsltLblR = createRsltLblR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_SrchRsltRef_MC.jbCreateCnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbCreateRslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbCreateRsltSml((MBBEP_SrchRsltRef)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_SrchRsltRef p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBEP_SrchRsltRef p) {
	}

	/**
	 * [RsltSml]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltSml(MBBEP_SrchRsltRef p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_biz_dat_id_ListPutter]の定義 */
	private MCListPutter Cnd_biz_dat_id_p = null;

	/**
	 * [Cnd_biz_dat_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_dat_id_ListPutter() {
		if (Cnd_biz_dat_id_p == null) {
			Cnd_biz_dat_id_p = createCnd_biz_dat_id_ListPutter(Cnd_biz_dat_id, "biz_dat_id", "biz_dat_nm");

		}
		return Cnd_biz_dat_id_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_SrchRsltRef create(){
		MBBEP_SrchRsltRef p = new MBBEP_SrchRsltRef();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_SrchRsltRef create(String name){
		MBBEP_SrchRsltRef p = new MBBEP_SrchRsltRef(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MBBEP_SrchRsltRef_MC.jbfInitCnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbfInitRslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbfInitRsltSml((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbInitCnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbInitRslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.jbInitRsltSml((MBBEP_SrchRsltRef)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id_Label = p.beansFactory.createLabel("Cnd.biz_dat_id_Label");
		p.Cnd_biz_dat_id = p.beansFactory.createTextComboBox("Cnd.biz_dat_id");
		p.Cnd_biz_dat_id.setLabel(p.Cnd_biz_dat_id_Label);
		p.Cnd_biz_dat_nm = p.beansFactory.createTextField("Cnd.biz_dat_nm");
		p.Cnd_bind_Label = p.beansFactory.createLabel("Cnd.bind_Label");
		p.Cnd_bind = p.beansFactory.createTextField("Cnd.bind");
		p.Cnd_bind.setLabel(p.Cnd_bind_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_dwnld = p.beansFactory.createButton("Cnd.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_disp_str001 = p.beansFactory.createTableColumn("Rslt.disp_str001", MCColumnType.TEXT);
		p.columnRslt_disp_str002 = p.beansFactory.createTableColumn("Rslt.disp_str002", MCColumnType.TEXT);
		p.columnRslt_disp_str003 = p.beansFactory.createTableColumn("Rslt.disp_str003", MCColumnType.TEXT);
		p.columnRslt_disp_str004 = p.beansFactory.createTableColumn("Rslt.disp_str004", MCColumnType.TEXT);
		p.columnRslt_disp_str005 = p.beansFactory.createTableColumn("Rslt.disp_str005", MCColumnType.TEXT);
		p.columnRslt_disp_str006 = p.beansFactory.createTableColumn("Rslt.disp_str006", MCColumnType.TEXT);
		p.columnRslt_disp_str007 = p.beansFactory.createTableColumn("Rslt.disp_str007", MCColumnType.TEXT);
		p.columnRslt_disp_str008 = p.beansFactory.createTableColumn("Rslt.disp_str008", MCColumnType.TEXT);
		p.columnRslt_disp_str009 = p.beansFactory.createTableColumn("Rslt.disp_str009", MCColumnType.TEXT);
		p.columnRslt_disp_str010 = p.beansFactory.createTableColumn("Rslt.disp_str010", MCColumnType.TEXT);
		p.columnRslt_disp_str011 = p.beansFactory.createTableColumn("Rslt.disp_str011", MCColumnType.TEXT);
		p.columnRslt_disp_str012 = p.beansFactory.createTableColumn("Rslt.disp_str012", MCColumnType.TEXT);
		p.columnRslt_disp_str013 = p.beansFactory.createTableColumn("Rslt.disp_str013", MCColumnType.TEXT);
		p.columnRslt_disp_str014 = p.beansFactory.createTableColumn("Rslt.disp_str014", MCColumnType.TEXT);
		p.columnRslt_disp_str015 = p.beansFactory.createTableColumn("Rslt.disp_str015", MCColumnType.TEXT);
		p.columnRslt_disp_str016 = p.beansFactory.createTableColumn("Rslt.disp_str016", MCColumnType.TEXT);
		p.columnRslt_disp_str017 = p.beansFactory.createTableColumn("Rslt.disp_str017", MCColumnType.TEXT);
		p.columnRslt_disp_str018 = p.beansFactory.createTableColumn("Rslt.disp_str018", MCColumnType.TEXT);
		p.columnRslt_disp_str019 = p.beansFactory.createTableColumn("Rslt.disp_str019", MCColumnType.TEXT);
		p.columnRslt_disp_str020 = p.beansFactory.createTableColumn("Rslt.disp_str020", MCColumnType.TEXT);
		p.columnRslt_disp_str021 = p.beansFactory.createTableColumn("Rslt.disp_str021", MCColumnType.TEXT);
		p.columnRslt_disp_str022 = p.beansFactory.createTableColumn("Rslt.disp_str022", MCColumnType.TEXT);
		p.columnRslt_disp_str023 = p.beansFactory.createTableColumn("Rslt.disp_str023", MCColumnType.TEXT);
		p.columnRslt_disp_str024 = p.beansFactory.createTableColumn("Rslt.disp_str024", MCColumnType.TEXT);
		p.columnRslt_disp_str025 = p.beansFactory.createTableColumn("Rslt.disp_str025", MCColumnType.TEXT);
		p.columnRslt_disp_str026 = p.beansFactory.createTableColumn("Rslt.disp_str026", MCColumnType.TEXT);
		p.columnRslt_disp_str027 = p.beansFactory.createTableColumn("Rslt.disp_str027", MCColumnType.TEXT);
		p.columnRslt_disp_str028 = p.beansFactory.createTableColumn("Rslt.disp_str028", MCColumnType.TEXT);
		p.columnRslt_disp_str029 = p.beansFactory.createTableColumn("Rslt.disp_str029", MCColumnType.TEXT);
		p.columnRslt_disp_str030 = p.beansFactory.createTableColumn("Rslt.disp_str030", MCColumnType.TEXT);
		p.columnRslt_disp_str031 = p.beansFactory.createTableColumn("Rslt.disp_str031", MCColumnType.TEXT);
		p.columnRslt_disp_str032 = p.beansFactory.createTableColumn("Rslt.disp_str032", MCColumnType.TEXT);
		p.columnRslt_disp_str033 = p.beansFactory.createTableColumn("Rslt.disp_str033", MCColumnType.TEXT);
		p.columnRslt_disp_str034 = p.beansFactory.createTableColumn("Rslt.disp_str034", MCColumnType.TEXT);
		p.columnRslt_disp_str035 = p.beansFactory.createTableColumn("Rslt.disp_str035", MCColumnType.TEXT);
		p.columnRslt_disp_str036 = p.beansFactory.createTableColumn("Rslt.disp_str036", MCColumnType.TEXT);
		p.columnRslt_disp_str037 = p.beansFactory.createTableColumn("Rslt.disp_str037", MCColumnType.TEXT);
		p.columnRslt_disp_str038 = p.beansFactory.createTableColumn("Rslt.disp_str038", MCColumnType.TEXT);
		p.columnRslt_disp_str039 = p.beansFactory.createTableColumn("Rslt.disp_str039", MCColumnType.TEXT);
		p.columnRslt_disp_str040 = p.beansFactory.createTableColumn("Rslt.disp_str040", MCColumnType.TEXT);
		p.columnRslt_disp_str041 = p.beansFactory.createTableColumn("Rslt.disp_str041", MCColumnType.TEXT);
		p.columnRslt_disp_str042 = p.beansFactory.createTableColumn("Rslt.disp_str042", MCColumnType.TEXT);
		p.columnRslt_disp_str043 = p.beansFactory.createTableColumn("Rslt.disp_str043", MCColumnType.TEXT);
		p.columnRslt_disp_str044 = p.beansFactory.createTableColumn("Rslt.disp_str044", MCColumnType.TEXT);
		p.columnRslt_disp_str045 = p.beansFactory.createTableColumn("Rslt.disp_str045", MCColumnType.TEXT);
		p.columnRslt_disp_str046 = p.beansFactory.createTableColumn("Rslt.disp_str046", MCColumnType.TEXT);
		p.columnRslt_disp_str047 = p.beansFactory.createTableColumn("Rslt.disp_str047", MCColumnType.TEXT);
		p.columnRslt_disp_str048 = p.beansFactory.createTableColumn("Rslt.disp_str048", MCColumnType.TEXT);
		p.columnRslt_disp_str049 = p.beansFactory.createTableColumn("Rslt.disp_str049", MCColumnType.TEXT);
		p.columnRslt_disp_str050 = p.beansFactory.createTableColumn("Rslt.disp_str050", MCColumnType.TEXT);
		p.columnRslt_disp_str051 = p.beansFactory.createTableColumn("Rslt.disp_str051", MCColumnType.TEXT);
		p.columnRslt_disp_str052 = p.beansFactory.createTableColumn("Rslt.disp_str052", MCColumnType.TEXT);
		p.columnRslt_disp_str053 = p.beansFactory.createTableColumn("Rslt.disp_str053", MCColumnType.TEXT);
		p.columnRslt_disp_str054 = p.beansFactory.createTableColumn("Rslt.disp_str054", MCColumnType.TEXT);
		p.columnRslt_disp_str055 = p.beansFactory.createTableColumn("Rslt.disp_str055", MCColumnType.TEXT);
		p.columnRslt_disp_str056 = p.beansFactory.createTableColumn("Rslt.disp_str056", MCColumnType.TEXT);
		p.columnRslt_disp_str057 = p.beansFactory.createTableColumn("Rslt.disp_str057", MCColumnType.TEXT);
		p.columnRslt_disp_str058 = p.beansFactory.createTableColumn("Rslt.disp_str058", MCColumnType.TEXT);
		p.columnRslt_disp_str059 = p.beansFactory.createTableColumn("Rslt.disp_str059", MCColumnType.TEXT);
		p.columnRslt_disp_str060 = p.beansFactory.createTableColumn("Rslt.disp_str060", MCColumnType.TEXT);
		p.columnRslt_disp_str061 = p.beansFactory.createTableColumn("Rslt.disp_str061", MCColumnType.TEXT);
		p.columnRslt_disp_str062 = p.beansFactory.createTableColumn("Rslt.disp_str062", MCColumnType.TEXT);
		p.columnRslt_disp_str063 = p.beansFactory.createTableColumn("Rslt.disp_str063", MCColumnType.TEXT);
		p.columnRslt_disp_str064 = p.beansFactory.createTableColumn("Rslt.disp_str064", MCColumnType.TEXT);
		p.columnRslt_disp_str065 = p.beansFactory.createTableColumn("Rslt.disp_str065", MCColumnType.TEXT);
		p.columnRslt_disp_str066 = p.beansFactory.createTableColumn("Rslt.disp_str066", MCColumnType.TEXT);
		p.columnRslt_disp_str067 = p.beansFactory.createTableColumn("Rslt.disp_str067", MCColumnType.TEXT);
		p.columnRslt_disp_str068 = p.beansFactory.createTableColumn("Rslt.disp_str068", MCColumnType.TEXT);
		p.columnRslt_disp_str069 = p.beansFactory.createTableColumn("Rslt.disp_str069", MCColumnType.TEXT);
		p.columnRslt_disp_str070 = p.beansFactory.createTableColumn("Rslt.disp_str070", MCColumnType.TEXT);
		p.columnRslt_disp_str071 = p.beansFactory.createTableColumn("Rslt.disp_str071", MCColumnType.TEXT);
		p.columnRslt_disp_str072 = p.beansFactory.createTableColumn("Rslt.disp_str072", MCColumnType.TEXT);
		p.columnRslt_disp_str073 = p.beansFactory.createTableColumn("Rslt.disp_str073", MCColumnType.TEXT);
		p.columnRslt_disp_str074 = p.beansFactory.createTableColumn("Rslt.disp_str074", MCColumnType.TEXT);
		p.columnRslt_disp_str075 = p.beansFactory.createTableColumn("Rslt.disp_str075", MCColumnType.TEXT);
		p.columnRslt_disp_str076 = p.beansFactory.createTableColumn("Rslt.disp_str076", MCColumnType.TEXT);
		p.columnRslt_disp_str077 = p.beansFactory.createTableColumn("Rslt.disp_str077", MCColumnType.TEXT);
		p.columnRslt_disp_str078 = p.beansFactory.createTableColumn("Rslt.disp_str078", MCColumnType.TEXT);
		p.columnRslt_disp_str079 = p.beansFactory.createTableColumn("Rslt.disp_str079", MCColumnType.TEXT);
		p.columnRslt_disp_str080 = p.beansFactory.createTableColumn("Rslt.disp_str080", MCColumnType.TEXT);
		p.columnRslt_disp_str081 = p.beansFactory.createTableColumn("Rslt.disp_str081", MCColumnType.TEXT);
		p.columnRslt_disp_str082 = p.beansFactory.createTableColumn("Rslt.disp_str082", MCColumnType.TEXT);
		p.columnRslt_disp_str083 = p.beansFactory.createTableColumn("Rslt.disp_str083", MCColumnType.TEXT);
		p.columnRslt_disp_str084 = p.beansFactory.createTableColumn("Rslt.disp_str084", MCColumnType.TEXT);
		p.columnRslt_disp_str085 = p.beansFactory.createTableColumn("Rslt.disp_str085", MCColumnType.TEXT);
		p.columnRslt_disp_str086 = p.beansFactory.createTableColumn("Rslt.disp_str086", MCColumnType.TEXT);
		p.columnRslt_disp_str087 = p.beansFactory.createTableColumn("Rslt.disp_str087", MCColumnType.TEXT);
		p.columnRslt_disp_str088 = p.beansFactory.createTableColumn("Rslt.disp_str088", MCColumnType.TEXT);
		p.columnRslt_disp_str089 = p.beansFactory.createTableColumn("Rslt.disp_str089", MCColumnType.TEXT);
		p.columnRslt_disp_str090 = p.beansFactory.createTableColumn("Rslt.disp_str090", MCColumnType.TEXT);
		p.columnRslt_disp_str091 = p.beansFactory.createTableColumn("Rslt.disp_str091", MCColumnType.TEXT);
		p.columnRslt_disp_str092 = p.beansFactory.createTableColumn("Rslt.disp_str092", MCColumnType.TEXT);
		p.columnRslt_disp_str093 = p.beansFactory.createTableColumn("Rslt.disp_str093", MCColumnType.TEXT);
		p.columnRslt_disp_str094 = p.beansFactory.createTableColumn("Rslt.disp_str094", MCColumnType.TEXT);
		p.columnRslt_disp_str095 = p.beansFactory.createTableColumn("Rslt.disp_str095", MCColumnType.TEXT);
		p.columnRslt_disp_str096 = p.beansFactory.createTableColumn("Rslt.disp_str096", MCColumnType.TEXT);
		p.columnRslt_disp_str097 = p.beansFactory.createTableColumn("Rslt.disp_str097", MCColumnType.TEXT);
		p.columnRslt_disp_str098 = p.beansFactory.createTableColumn("Rslt.disp_str098", MCColumnType.TEXT);
		p.columnRslt_disp_str099 = p.beansFactory.createTableColumn("Rslt.disp_str099", MCColumnType.TEXT);
		p.columnRslt_disp_str100 = p.beansFactory.createTableColumn("Rslt.disp_str100", MCColumnType.TEXT);
		p.columnRslt_disp_str101 = p.beansFactory.createTableColumn("Rslt.disp_str101", MCColumnType.TEXT);
		p.columnRslt_disp_str102 = p.beansFactory.createTableColumn("Rslt.disp_str102", MCColumnType.TEXT);
		p.columnRslt_disp_str103 = p.beansFactory.createTableColumn("Rslt.disp_str103", MCColumnType.TEXT);
		p.columnRslt_disp_str104 = p.beansFactory.createTableColumn("Rslt.disp_str104", MCColumnType.TEXT);
		p.columnRslt_disp_str105 = p.beansFactory.createTableColumn("Rslt.disp_str105", MCColumnType.TEXT);
		p.columnRslt_disp_str106 = p.beansFactory.createTableColumn("Rslt.disp_str106", MCColumnType.TEXT);
		p.columnRslt_disp_str107 = p.beansFactory.createTableColumn("Rslt.disp_str107", MCColumnType.TEXT);
		p.columnRslt_disp_str108 = p.beansFactory.createTableColumn("Rslt.disp_str108", MCColumnType.TEXT);
		p.columnRslt_disp_str109 = p.beansFactory.createTableColumn("Rslt.disp_str109", MCColumnType.TEXT);
		p.columnRslt_disp_str110 = p.beansFactory.createTableColumn("Rslt.disp_str110", MCColumnType.TEXT);
		p.columnRslt_disp_str111 = p.beansFactory.createTableColumn("Rslt.disp_str111", MCColumnType.TEXT);
		p.columnRslt_disp_str112 = p.beansFactory.createTableColumn("Rslt.disp_str112", MCColumnType.TEXT);
		p.columnRslt_disp_str113 = p.beansFactory.createTableColumn("Rslt.disp_str113", MCColumnType.TEXT);
		p.columnRslt_disp_str114 = p.beansFactory.createTableColumn("Rslt.disp_str114", MCColumnType.TEXT);
		p.columnRslt_disp_str115 = p.beansFactory.createTableColumn("Rslt.disp_str115", MCColumnType.TEXT);
		p.columnRslt_disp_str116 = p.beansFactory.createTableColumn("Rslt.disp_str116", MCColumnType.TEXT);
		p.columnRslt_disp_str117 = p.beansFactory.createTableColumn("Rslt.disp_str117", MCColumnType.TEXT);
		p.columnRslt_disp_str118 = p.beansFactory.createTableColumn("Rslt.disp_str118", MCColumnType.TEXT);
		p.columnRslt_disp_str119 = p.beansFactory.createTableColumn("Rslt.disp_str119", MCColumnType.TEXT);
		p.columnRslt_disp_str120 = p.beansFactory.createTableColumn("Rslt.disp_str120", MCColumnType.TEXT);
		p.columnRslt_disp_str121 = p.beansFactory.createTableColumn("Rslt.disp_str121", MCColumnType.TEXT);
		p.columnRslt_disp_str122 = p.beansFactory.createTableColumn("Rslt.disp_str122", MCColumnType.TEXT);
		p.columnRslt_disp_str123 = p.beansFactory.createTableColumn("Rslt.disp_str123", MCColumnType.TEXT);
		p.columnRslt_disp_str124 = p.beansFactory.createTableColumn("Rslt.disp_str124", MCColumnType.TEXT);
		p.columnRslt_disp_str125 = p.beansFactory.createTableColumn("Rslt.disp_str125", MCColumnType.TEXT);
		p.columnRslt_disp_str126 = p.beansFactory.createTableColumn("Rslt.disp_str126", MCColumnType.TEXT);
		p.columnRslt_disp_str127 = p.beansFactory.createTableColumn("Rslt.disp_str127", MCColumnType.TEXT);
		p.columnRslt_disp_str128 = p.beansFactory.createTableColumn("Rslt.disp_str128", MCColumnType.TEXT);
		p.columnRslt_disp_str129 = p.beansFactory.createTableColumn("Rslt.disp_str129", MCColumnType.TEXT);
		p.columnRslt_disp_str130 = p.beansFactory.createTableColumn("Rslt.disp_str130", MCColumnType.TEXT);
		p.columnRslt_disp_str131 = p.beansFactory.createTableColumn("Rslt.disp_str131", MCColumnType.TEXT);
		p.columnRslt_disp_str132 = p.beansFactory.createTableColumn("Rslt.disp_str132", MCColumnType.TEXT);
		p.columnRslt_disp_str133 = p.beansFactory.createTableColumn("Rslt.disp_str133", MCColumnType.TEXT);
		p.columnRslt_disp_str134 = p.beansFactory.createTableColumn("Rslt.disp_str134", MCColumnType.TEXT);
		p.columnRslt_disp_str135 = p.beansFactory.createTableColumn("Rslt.disp_str135", MCColumnType.TEXT);
		p.columnRslt_disp_str136 = p.beansFactory.createTableColumn("Rslt.disp_str136", MCColumnType.TEXT);
		p.columnRslt_disp_str137 = p.beansFactory.createTableColumn("Rslt.disp_str137", MCColumnType.TEXT);
		p.columnRslt_disp_str138 = p.beansFactory.createTableColumn("Rslt.disp_str138", MCColumnType.TEXT);
		p.columnRslt_disp_str139 = p.beansFactory.createTableColumn("Rslt.disp_str139", MCColumnType.TEXT);
		p.columnRslt_disp_str140 = p.beansFactory.createTableColumn("Rslt.disp_str140", MCColumnType.TEXT);
		p.columnRslt_disp_str141 = p.beansFactory.createTableColumn("Rslt.disp_str141", MCColumnType.TEXT);
		p.columnRslt_disp_str142 = p.beansFactory.createTableColumn("Rslt.disp_str142", MCColumnType.TEXT);
		p.columnRslt_disp_str143 = p.beansFactory.createTableColumn("Rslt.disp_str143", MCColumnType.TEXT);
		p.columnRslt_disp_str144 = p.beansFactory.createTableColumn("Rslt.disp_str144", MCColumnType.TEXT);
		p.columnRslt_disp_str145 = p.beansFactory.createTableColumn("Rslt.disp_str145", MCColumnType.TEXT);
		p.columnRslt_disp_str146 = p.beansFactory.createTableColumn("Rslt.disp_str146", MCColumnType.TEXT);
		p.columnRslt_disp_str147 = p.beansFactory.createTableColumn("Rslt.disp_str147", MCColumnType.TEXT);
		p.columnRslt_disp_str148 = p.beansFactory.createTableColumn("Rslt.disp_str148", MCColumnType.TEXT);
		p.columnRslt_disp_str149 = p.beansFactory.createTableColumn("Rslt.disp_str149", MCColumnType.TEXT);
		p.columnRslt_disp_str150 = p.beansFactory.createTableColumn("Rslt.disp_str150", MCColumnType.TEXT);
		p.columnRslt_disp_str151 = p.beansFactory.createTableColumn("Rslt.disp_str151", MCColumnType.TEXT);
		p.columnRslt_disp_str152 = p.beansFactory.createTableColumn("Rslt.disp_str152", MCColumnType.TEXT);
		p.columnRslt_disp_str153 = p.beansFactory.createTableColumn("Rslt.disp_str153", MCColumnType.TEXT);
		p.columnRslt_disp_str154 = p.beansFactory.createTableColumn("Rslt.disp_str154", MCColumnType.TEXT);
		p.columnRslt_disp_str155 = p.beansFactory.createTableColumn("Rslt.disp_str155", MCColumnType.TEXT);
		p.columnRslt_disp_str156 = p.beansFactory.createTableColumn("Rslt.disp_str156", MCColumnType.TEXT);
		p.columnRslt_disp_str157 = p.beansFactory.createTableColumn("Rslt.disp_str157", MCColumnType.TEXT);
		p.columnRslt_disp_str158 = p.beansFactory.createTableColumn("Rslt.disp_str158", MCColumnType.TEXT);
		p.columnRslt_disp_str159 = p.beansFactory.createTableColumn("Rslt.disp_str159", MCColumnType.TEXT);
		p.columnRslt_disp_str160 = p.beansFactory.createTableColumn("Rslt.disp_str160", MCColumnType.TEXT);
		p.columnRslt_disp_str161 = p.beansFactory.createTableColumn("Rslt.disp_str161", MCColumnType.TEXT);
		p.columnRslt_disp_str162 = p.beansFactory.createTableColumn("Rslt.disp_str162", MCColumnType.TEXT);
		p.columnRslt_disp_str163 = p.beansFactory.createTableColumn("Rslt.disp_str163", MCColumnType.TEXT);
		p.columnRslt_disp_str164 = p.beansFactory.createTableColumn("Rslt.disp_str164", MCColumnType.TEXT);
		p.columnRslt_disp_str165 = p.beansFactory.createTableColumn("Rslt.disp_str165", MCColumnType.TEXT);
		p.columnRslt_disp_str166 = p.beansFactory.createTableColumn("Rslt.disp_str166", MCColumnType.TEXT);
		p.columnRslt_disp_str167 = p.beansFactory.createTableColumn("Rslt.disp_str167", MCColumnType.TEXT);
		p.columnRslt_disp_str168 = p.beansFactory.createTableColumn("Rslt.disp_str168", MCColumnType.TEXT);
		p.columnRslt_disp_str169 = p.beansFactory.createTableColumn("Rslt.disp_str169", MCColumnType.TEXT);
		p.columnRslt_disp_str170 = p.beansFactory.createTableColumn("Rslt.disp_str170", MCColumnType.TEXT);
		p.columnRslt_disp_str171 = p.beansFactory.createTableColumn("Rslt.disp_str171", MCColumnType.TEXT);
		p.columnRslt_disp_str172 = p.beansFactory.createTableColumn("Rslt.disp_str172", MCColumnType.TEXT);
		p.columnRslt_disp_str173 = p.beansFactory.createTableColumn("Rslt.disp_str173", MCColumnType.TEXT);
		p.columnRslt_disp_str174 = p.beansFactory.createTableColumn("Rslt.disp_str174", MCColumnType.TEXT);
		p.columnRslt_disp_str175 = p.beansFactory.createTableColumn("Rslt.disp_str175", MCColumnType.TEXT);
		p.columnRslt_disp_str176 = p.beansFactory.createTableColumn("Rslt.disp_str176", MCColumnType.TEXT);
		p.columnRslt_disp_str177 = p.beansFactory.createTableColumn("Rslt.disp_str177", MCColumnType.TEXT);
		p.columnRslt_disp_str178 = p.beansFactory.createTableColumn("Rslt.disp_str178", MCColumnType.TEXT);
		p.columnRslt_disp_str179 = p.beansFactory.createTableColumn("Rslt.disp_str179", MCColumnType.TEXT);
		p.columnRslt_disp_str180 = p.beansFactory.createTableColumn("Rslt.disp_str180", MCColumnType.TEXT);
		p.columnRslt_disp_str181 = p.beansFactory.createTableColumn("Rslt.disp_str181", MCColumnType.TEXT);
		p.columnRslt_disp_str182 = p.beansFactory.createTableColumn("Rslt.disp_str182", MCColumnType.TEXT);
		p.columnRslt_disp_str183 = p.beansFactory.createTableColumn("Rslt.disp_str183", MCColumnType.TEXT);
		p.columnRslt_disp_str184 = p.beansFactory.createTableColumn("Rslt.disp_str184", MCColumnType.TEXT);
		p.columnRslt_disp_str185 = p.beansFactory.createTableColumn("Rslt.disp_str185", MCColumnType.TEXT);
		p.columnRslt_disp_str186 = p.beansFactory.createTableColumn("Rslt.disp_str186", MCColumnType.TEXT);
		p.columnRslt_disp_str187 = p.beansFactory.createTableColumn("Rslt.disp_str187", MCColumnType.TEXT);
		p.columnRslt_disp_str188 = p.beansFactory.createTableColumn("Rslt.disp_str188", MCColumnType.TEXT);
		p.columnRslt_disp_str189 = p.beansFactory.createTableColumn("Rslt.disp_str189", MCColumnType.TEXT);
		p.columnRslt_disp_str190 = p.beansFactory.createTableColumn("Rslt.disp_str190", MCColumnType.TEXT);
		p.columnRslt_disp_str191 = p.beansFactory.createTableColumn("Rslt.disp_str191", MCColumnType.TEXT);
		p.columnRslt_disp_str192 = p.beansFactory.createTableColumn("Rslt.disp_str192", MCColumnType.TEXT);
		p.columnRslt_disp_str193 = p.beansFactory.createTableColumn("Rslt.disp_str193", MCColumnType.TEXT);
		p.columnRslt_disp_str194 = p.beansFactory.createTableColumn("Rslt.disp_str194", MCColumnType.TEXT);
		p.columnRslt_disp_str195 = p.beansFactory.createTableColumn("Rslt.disp_str195", MCColumnType.TEXT);
		p.columnRslt_disp_str196 = p.beansFactory.createTableColumn("Rslt.disp_str196", MCColumnType.TEXT);
		p.columnRslt_disp_str197 = p.beansFactory.createTableColumn("Rslt.disp_str197", MCColumnType.TEXT);
		p.columnRslt_disp_str198 = p.beansFactory.createTableColumn("Rslt.disp_str198", MCColumnType.TEXT);
		p.columnRslt_disp_str199 = p.beansFactory.createTableColumn("Rslt.disp_str199", MCColumnType.TEXT);
		p.columnRslt_disp_str200 = p.beansFactory.createTableColumn("Rslt.disp_str200", MCColumnType.TEXT);
		p.columnRslt_disp_dt001 = p.beansFactory.createTableColumn("Rslt.disp_dt001", MCColumnType.DATE);
		p.columnRslt_disp_dt002 = p.beansFactory.createTableColumn("Rslt.disp_dt002", MCColumnType.DATE);
		p.columnRslt_disp_dt003 = p.beansFactory.createTableColumn("Rslt.disp_dt003", MCColumnType.DATE);
		p.columnRslt_disp_dt004 = p.beansFactory.createTableColumn("Rslt.disp_dt004", MCColumnType.DATE);
		p.columnRslt_disp_dt005 = p.beansFactory.createTableColumn("Rslt.disp_dt005", MCColumnType.DATE);
		p.columnRslt_disp_dt006 = p.beansFactory.createTableColumn("Rslt.disp_dt006", MCColumnType.DATE);
		p.columnRslt_disp_dt007 = p.beansFactory.createTableColumn("Rslt.disp_dt007", MCColumnType.DATE);
		p.columnRslt_disp_dt008 = p.beansFactory.createTableColumn("Rslt.disp_dt008", MCColumnType.DATE);
		p.columnRslt_disp_dt009 = p.beansFactory.createTableColumn("Rslt.disp_dt009", MCColumnType.DATE);
		p.columnRslt_disp_dt010 = p.beansFactory.createTableColumn("Rslt.disp_dt010", MCColumnType.DATE);
		p.columnRslt_disp_num001 = p.beansFactory.createTableColumn("Rslt.disp_num001", MCColumnType.NUMBER);
		p.columnRslt_disp_num002 = p.beansFactory.createTableColumn("Rslt.disp_num002", MCColumnType.NUMBER);
		p.columnRslt_disp_num003 = p.beansFactory.createTableColumn("Rslt.disp_num003", MCColumnType.NUMBER);
		p.columnRslt_disp_num004 = p.beansFactory.createTableColumn("Rslt.disp_num004", MCColumnType.NUMBER);
		p.columnRslt_disp_num005 = p.beansFactory.createTableColumn("Rslt.disp_num005", MCColumnType.NUMBER);
		p.columnRslt_disp_num006 = p.beansFactory.createTableColumn("Rslt.disp_num006", MCColumnType.NUMBER);
		p.columnRslt_disp_num007 = p.beansFactory.createTableColumn("Rslt.disp_num007", MCColumnType.NUMBER);
		p.columnRslt_disp_num008 = p.beansFactory.createTableColumn("Rslt.disp_num008", MCColumnType.NUMBER);
		p.columnRslt_disp_num009 = p.beansFactory.createTableColumn("Rslt.disp_num009", MCColumnType.NUMBER);
		p.columnRslt_disp_num010 = p.beansFactory.createTableColumn("Rslt.disp_num010", MCColumnType.NUMBER);
	}

	/**
	 * [RsltSml]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltSml(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.RsltSmlPanel = p.beansFactory.createPanel("RsltSml");
		// ブロックの項目の初期化
		p.RsltSml_exec_time_Label = p.beansFactory.createLabel("RsltSml.exec_time_Label");
		p.RsltSml_exec_time = p.beansFactory.createNumberField("RsltSml.exec_time");
		p.RsltSml_exec_time.setLabel(p.RsltSml_exec_time_Label);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id.setListType(MCListType.FREE);
		p.Cnd_biz_dat_id.setLinkBeans(p.Cnd_biz_dat_nm);
		p.CndPanel.add(p.Cnd_biz_dat_id_Label);
		p.CndPanel.add(p.Cnd_biz_dat_id);
		p.CndPanel.setLastBeans(p.Cnd_biz_dat_id);
		p.Cnd_biz_dat_id.setNextBeans(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0100.CndR.biz_dat_id_META);
		p.CndPanel.add(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_nm.setNextBeans(p.Cnd_bind);
		p.Cnd_biz_dat_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0100.CndR.biz_dat_nm_META);
		p.CndPanel.add(p.Cnd_bind_Label);
		p.CndPanel.add(p.Cnd_bind);
		p.Cnd_bind.setNextBeans(p.Cnd_srch);
		p.Cnd_bind.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0100.CndR.bind_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_dwnld);
		p.Cnd_dwnld.setIcon("DWNLD");
		p.Cnd_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.CndPanel.add(p.Cnd_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.RsltSmlPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltSml]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltSml(MBBEP_SrchRsltRef p) {
		// ブロック関連の初期化
		p.add(p.RsltSmlPanel);
		p.RsltSmlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.RsltSmlPanel.add(p.RsltSml_exec_time_Label);
		p.RsltSmlPanel.add(p.RsltSml_exec_time);
		p.RsltSmlPanel.setLastBeans(p.RsltSml_exec_time);
		p.RsltSml_exec_time.setRow(p.getRsltSmlR(), mcframe.clientMBBE.MBBEP0100.RsltSmlR.exec_time_META);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MBBEP_SrchRsltRef_MC.mcInitCnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.mcInitRslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.mcInitRsltSml((MBBEP_SrchRsltRef)this);

		// [SRCH]ステータスのモードの設定
		MBBEP_SrchRsltRef_MC.statusInitSRCH_Cnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitSRCH_Rslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitSRCH_RsltSml((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitSRCH_RsltLbl((MBBEP_SrchRsltRef)this);

		// [REF]ステータスのモードの設定
		MBBEP_SrchRsltRef_MC.statusInitREF_Cnd((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitREF_Rslt((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitREF_RsltSml((MBBEP_SrchRsltRef)this);
		MBBEP_SrchRsltRef_MC.statusInitREF_RsltLbl((MBBEP_SrchRsltRef)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_SrchRsltRef p) {
		p.Cnd_biz_dat_id.setListListener(p);
		p.Cnd_biz_dat_id.addAllListener(p);
		p.Cnd_biz_dat_nm.setListListener(p);
		p.Cnd_biz_dat_nm.addAllListener(p);
		p.Cnd_bind.setListListener(p);
		p.Cnd_bind.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_dwnld.addAllListener(p);
		p.Cnd_dwnld.setAPMethodName("doCnd_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBEP_SrchRsltRef p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_disp_str001.addAllListener(p);
		p.columnRslt_disp_str001.setListListener(p);
		p.columnRslt_disp_str002.addAllListener(p);
		p.columnRslt_disp_str002.setListListener(p);
		p.columnRslt_disp_str003.addAllListener(p);
		p.columnRslt_disp_str003.setListListener(p);
		p.columnRslt_disp_str004.addAllListener(p);
		p.columnRslt_disp_str004.setListListener(p);
		p.columnRslt_disp_str005.addAllListener(p);
		p.columnRslt_disp_str005.setListListener(p);
		p.columnRslt_disp_str006.addAllListener(p);
		p.columnRslt_disp_str006.setListListener(p);
		p.columnRslt_disp_str007.addAllListener(p);
		p.columnRslt_disp_str007.setListListener(p);
		p.columnRslt_disp_str008.addAllListener(p);
		p.columnRslt_disp_str008.setListListener(p);
		p.columnRslt_disp_str009.addAllListener(p);
		p.columnRslt_disp_str009.setListListener(p);
		p.columnRslt_disp_str010.addAllListener(p);
		p.columnRslt_disp_str010.setListListener(p);
		p.columnRslt_disp_str011.addAllListener(p);
		p.columnRslt_disp_str011.setListListener(p);
		p.columnRslt_disp_str012.addAllListener(p);
		p.columnRslt_disp_str012.setListListener(p);
		p.columnRslt_disp_str013.addAllListener(p);
		p.columnRslt_disp_str013.setListListener(p);
		p.columnRslt_disp_str014.addAllListener(p);
		p.columnRslt_disp_str014.setListListener(p);
		p.columnRslt_disp_str015.addAllListener(p);
		p.columnRslt_disp_str015.setListListener(p);
		p.columnRslt_disp_str016.addAllListener(p);
		p.columnRslt_disp_str016.setListListener(p);
		p.columnRslt_disp_str017.addAllListener(p);
		p.columnRslt_disp_str017.setListListener(p);
		p.columnRslt_disp_str018.addAllListener(p);
		p.columnRslt_disp_str018.setListListener(p);
		p.columnRslt_disp_str019.addAllListener(p);
		p.columnRslt_disp_str019.setListListener(p);
		p.columnRslt_disp_str020.addAllListener(p);
		p.columnRslt_disp_str020.setListListener(p);
		p.columnRslt_disp_str021.addAllListener(p);
		p.columnRslt_disp_str021.setListListener(p);
		p.columnRslt_disp_str022.addAllListener(p);
		p.columnRslt_disp_str022.setListListener(p);
		p.columnRslt_disp_str023.addAllListener(p);
		p.columnRslt_disp_str023.setListListener(p);
		p.columnRslt_disp_str024.addAllListener(p);
		p.columnRslt_disp_str024.setListListener(p);
		p.columnRslt_disp_str025.addAllListener(p);
		p.columnRslt_disp_str025.setListListener(p);
		p.columnRslt_disp_str026.addAllListener(p);
		p.columnRslt_disp_str026.setListListener(p);
		p.columnRslt_disp_str027.addAllListener(p);
		p.columnRslt_disp_str027.setListListener(p);
		p.columnRslt_disp_str028.addAllListener(p);
		p.columnRslt_disp_str028.setListListener(p);
		p.columnRslt_disp_str029.addAllListener(p);
		p.columnRslt_disp_str029.setListListener(p);
		p.columnRslt_disp_str030.addAllListener(p);
		p.columnRslt_disp_str030.setListListener(p);
		p.columnRslt_disp_str031.addAllListener(p);
		p.columnRslt_disp_str031.setListListener(p);
		p.columnRslt_disp_str032.addAllListener(p);
		p.columnRslt_disp_str032.setListListener(p);
		p.columnRslt_disp_str033.addAllListener(p);
		p.columnRslt_disp_str033.setListListener(p);
		p.columnRslt_disp_str034.addAllListener(p);
		p.columnRslt_disp_str034.setListListener(p);
		p.columnRslt_disp_str035.addAllListener(p);
		p.columnRslt_disp_str035.setListListener(p);
		p.columnRslt_disp_str036.addAllListener(p);
		p.columnRslt_disp_str036.setListListener(p);
		p.columnRslt_disp_str037.addAllListener(p);
		p.columnRslt_disp_str037.setListListener(p);
		p.columnRslt_disp_str038.addAllListener(p);
		p.columnRslt_disp_str038.setListListener(p);
		p.columnRslt_disp_str039.addAllListener(p);
		p.columnRslt_disp_str039.setListListener(p);
		p.columnRslt_disp_str040.addAllListener(p);
		p.columnRslt_disp_str040.setListListener(p);
		p.columnRslt_disp_str041.addAllListener(p);
		p.columnRslt_disp_str041.setListListener(p);
		p.columnRslt_disp_str042.addAllListener(p);
		p.columnRslt_disp_str042.setListListener(p);
		p.columnRslt_disp_str043.addAllListener(p);
		p.columnRslt_disp_str043.setListListener(p);
		p.columnRslt_disp_str044.addAllListener(p);
		p.columnRslt_disp_str044.setListListener(p);
		p.columnRslt_disp_str045.addAllListener(p);
		p.columnRslt_disp_str045.setListListener(p);
		p.columnRslt_disp_str046.addAllListener(p);
		p.columnRslt_disp_str046.setListListener(p);
		p.columnRslt_disp_str047.addAllListener(p);
		p.columnRslt_disp_str047.setListListener(p);
		p.columnRslt_disp_str048.addAllListener(p);
		p.columnRslt_disp_str048.setListListener(p);
		p.columnRslt_disp_str049.addAllListener(p);
		p.columnRslt_disp_str049.setListListener(p);
		p.columnRslt_disp_str050.addAllListener(p);
		p.columnRslt_disp_str050.setListListener(p);
		p.columnRslt_disp_str051.addAllListener(p);
		p.columnRslt_disp_str051.setListListener(p);
		p.columnRslt_disp_str052.addAllListener(p);
		p.columnRslt_disp_str052.setListListener(p);
		p.columnRslt_disp_str053.addAllListener(p);
		p.columnRslt_disp_str053.setListListener(p);
		p.columnRslt_disp_str054.addAllListener(p);
		p.columnRslt_disp_str054.setListListener(p);
		p.columnRslt_disp_str055.addAllListener(p);
		p.columnRslt_disp_str055.setListListener(p);
		p.columnRslt_disp_str056.addAllListener(p);
		p.columnRslt_disp_str056.setListListener(p);
		p.columnRslt_disp_str057.addAllListener(p);
		p.columnRslt_disp_str057.setListListener(p);
		p.columnRslt_disp_str058.addAllListener(p);
		p.columnRslt_disp_str058.setListListener(p);
		p.columnRslt_disp_str059.addAllListener(p);
		p.columnRslt_disp_str059.setListListener(p);
		p.columnRslt_disp_str060.addAllListener(p);
		p.columnRslt_disp_str060.setListListener(p);
		p.columnRslt_disp_str061.addAllListener(p);
		p.columnRslt_disp_str061.setListListener(p);
		p.columnRslt_disp_str062.addAllListener(p);
		p.columnRslt_disp_str062.setListListener(p);
		p.columnRslt_disp_str063.addAllListener(p);
		p.columnRslt_disp_str063.setListListener(p);
		p.columnRslt_disp_str064.addAllListener(p);
		p.columnRslt_disp_str064.setListListener(p);
		p.columnRslt_disp_str065.addAllListener(p);
		p.columnRslt_disp_str065.setListListener(p);
		p.columnRslt_disp_str066.addAllListener(p);
		p.columnRslt_disp_str066.setListListener(p);
		p.columnRslt_disp_str067.addAllListener(p);
		p.columnRslt_disp_str067.setListListener(p);
		p.columnRslt_disp_str068.addAllListener(p);
		p.columnRslt_disp_str068.setListListener(p);
		p.columnRslt_disp_str069.addAllListener(p);
		p.columnRslt_disp_str069.setListListener(p);
		p.columnRslt_disp_str070.addAllListener(p);
		p.columnRslt_disp_str070.setListListener(p);
		p.columnRslt_disp_str071.addAllListener(p);
		p.columnRslt_disp_str071.setListListener(p);
		p.columnRslt_disp_str072.addAllListener(p);
		p.columnRslt_disp_str072.setListListener(p);
		p.columnRslt_disp_str073.addAllListener(p);
		p.columnRslt_disp_str073.setListListener(p);
		p.columnRslt_disp_str074.addAllListener(p);
		p.columnRslt_disp_str074.setListListener(p);
		p.columnRslt_disp_str075.addAllListener(p);
		p.columnRslt_disp_str075.setListListener(p);
		p.columnRslt_disp_str076.addAllListener(p);
		p.columnRslt_disp_str076.setListListener(p);
		p.columnRslt_disp_str077.addAllListener(p);
		p.columnRslt_disp_str077.setListListener(p);
		p.columnRslt_disp_str078.addAllListener(p);
		p.columnRslt_disp_str078.setListListener(p);
		p.columnRslt_disp_str079.addAllListener(p);
		p.columnRslt_disp_str079.setListListener(p);
		p.columnRslt_disp_str080.addAllListener(p);
		p.columnRslt_disp_str080.setListListener(p);
		p.columnRslt_disp_str081.addAllListener(p);
		p.columnRslt_disp_str081.setListListener(p);
		p.columnRslt_disp_str082.addAllListener(p);
		p.columnRslt_disp_str082.setListListener(p);
		p.columnRslt_disp_str083.addAllListener(p);
		p.columnRslt_disp_str083.setListListener(p);
		p.columnRslt_disp_str084.addAllListener(p);
		p.columnRslt_disp_str084.setListListener(p);
		p.columnRslt_disp_str085.addAllListener(p);
		p.columnRslt_disp_str085.setListListener(p);
		p.columnRslt_disp_str086.addAllListener(p);
		p.columnRslt_disp_str086.setListListener(p);
		p.columnRslt_disp_str087.addAllListener(p);
		p.columnRslt_disp_str087.setListListener(p);
		p.columnRslt_disp_str088.addAllListener(p);
		p.columnRslt_disp_str088.setListListener(p);
		p.columnRslt_disp_str089.addAllListener(p);
		p.columnRslt_disp_str089.setListListener(p);
		p.columnRslt_disp_str090.addAllListener(p);
		p.columnRslt_disp_str090.setListListener(p);
		p.columnRslt_disp_str091.addAllListener(p);
		p.columnRslt_disp_str091.setListListener(p);
		p.columnRslt_disp_str092.addAllListener(p);
		p.columnRslt_disp_str092.setListListener(p);
		p.columnRslt_disp_str093.addAllListener(p);
		p.columnRslt_disp_str093.setListListener(p);
		p.columnRslt_disp_str094.addAllListener(p);
		p.columnRslt_disp_str094.setListListener(p);
		p.columnRslt_disp_str095.addAllListener(p);
		p.columnRslt_disp_str095.setListListener(p);
		p.columnRslt_disp_str096.addAllListener(p);
		p.columnRslt_disp_str096.setListListener(p);
		p.columnRslt_disp_str097.addAllListener(p);
		p.columnRslt_disp_str097.setListListener(p);
		p.columnRslt_disp_str098.addAllListener(p);
		p.columnRslt_disp_str098.setListListener(p);
		p.columnRslt_disp_str099.addAllListener(p);
		p.columnRslt_disp_str099.setListListener(p);
		p.columnRslt_disp_str100.addAllListener(p);
		p.columnRslt_disp_str100.setListListener(p);
		p.columnRslt_disp_str101.addAllListener(p);
		p.columnRslt_disp_str101.setListListener(p);
		p.columnRslt_disp_str102.addAllListener(p);
		p.columnRslt_disp_str102.setListListener(p);
		p.columnRslt_disp_str103.addAllListener(p);
		p.columnRslt_disp_str103.setListListener(p);
		p.columnRslt_disp_str104.addAllListener(p);
		p.columnRslt_disp_str104.setListListener(p);
		p.columnRslt_disp_str105.addAllListener(p);
		p.columnRslt_disp_str105.setListListener(p);
		p.columnRslt_disp_str106.addAllListener(p);
		p.columnRslt_disp_str106.setListListener(p);
		p.columnRslt_disp_str107.addAllListener(p);
		p.columnRslt_disp_str107.setListListener(p);
		p.columnRslt_disp_str108.addAllListener(p);
		p.columnRslt_disp_str108.setListListener(p);
		p.columnRslt_disp_str109.addAllListener(p);
		p.columnRslt_disp_str109.setListListener(p);
		p.columnRslt_disp_str110.addAllListener(p);
		p.columnRslt_disp_str110.setListListener(p);
		p.columnRslt_disp_str111.addAllListener(p);
		p.columnRslt_disp_str111.setListListener(p);
		p.columnRslt_disp_str112.addAllListener(p);
		p.columnRslt_disp_str112.setListListener(p);
		p.columnRslt_disp_str113.addAllListener(p);
		p.columnRslt_disp_str113.setListListener(p);
		p.columnRslt_disp_str114.addAllListener(p);
		p.columnRslt_disp_str114.setListListener(p);
		p.columnRslt_disp_str115.addAllListener(p);
		p.columnRslt_disp_str115.setListListener(p);
		p.columnRslt_disp_str116.addAllListener(p);
		p.columnRslt_disp_str116.setListListener(p);
		p.columnRslt_disp_str117.addAllListener(p);
		p.columnRslt_disp_str117.setListListener(p);
		p.columnRslt_disp_str118.addAllListener(p);
		p.columnRslt_disp_str118.setListListener(p);
		p.columnRslt_disp_str119.addAllListener(p);
		p.columnRslt_disp_str119.setListListener(p);
		p.columnRslt_disp_str120.addAllListener(p);
		p.columnRslt_disp_str120.setListListener(p);
		p.columnRslt_disp_str121.addAllListener(p);
		p.columnRslt_disp_str121.setListListener(p);
		p.columnRslt_disp_str122.addAllListener(p);
		p.columnRslt_disp_str122.setListListener(p);
		p.columnRslt_disp_str123.addAllListener(p);
		p.columnRslt_disp_str123.setListListener(p);
		p.columnRslt_disp_str124.addAllListener(p);
		p.columnRslt_disp_str124.setListListener(p);
		p.columnRslt_disp_str125.addAllListener(p);
		p.columnRslt_disp_str125.setListListener(p);
		p.columnRslt_disp_str126.addAllListener(p);
		p.columnRslt_disp_str126.setListListener(p);
		p.columnRslt_disp_str127.addAllListener(p);
		p.columnRslt_disp_str127.setListListener(p);
		p.columnRslt_disp_str128.addAllListener(p);
		p.columnRslt_disp_str128.setListListener(p);
		p.columnRslt_disp_str129.addAllListener(p);
		p.columnRslt_disp_str129.setListListener(p);
		p.columnRslt_disp_str130.addAllListener(p);
		p.columnRslt_disp_str130.setListListener(p);
		p.columnRslt_disp_str131.addAllListener(p);
		p.columnRslt_disp_str131.setListListener(p);
		p.columnRslt_disp_str132.addAllListener(p);
		p.columnRslt_disp_str132.setListListener(p);
		p.columnRslt_disp_str133.addAllListener(p);
		p.columnRslt_disp_str133.setListListener(p);
		p.columnRslt_disp_str134.addAllListener(p);
		p.columnRslt_disp_str134.setListListener(p);
		p.columnRslt_disp_str135.addAllListener(p);
		p.columnRslt_disp_str135.setListListener(p);
		p.columnRslt_disp_str136.addAllListener(p);
		p.columnRslt_disp_str136.setListListener(p);
		p.columnRslt_disp_str137.addAllListener(p);
		p.columnRslt_disp_str137.setListListener(p);
		p.columnRslt_disp_str138.addAllListener(p);
		p.columnRslt_disp_str138.setListListener(p);
		p.columnRslt_disp_str139.addAllListener(p);
		p.columnRslt_disp_str139.setListListener(p);
		p.columnRslt_disp_str140.addAllListener(p);
		p.columnRslt_disp_str140.setListListener(p);
		p.columnRslt_disp_str141.addAllListener(p);
		p.columnRslt_disp_str141.setListListener(p);
		p.columnRslt_disp_str142.addAllListener(p);
		p.columnRslt_disp_str142.setListListener(p);
		p.columnRslt_disp_str143.addAllListener(p);
		p.columnRslt_disp_str143.setListListener(p);
		p.columnRslt_disp_str144.addAllListener(p);
		p.columnRslt_disp_str144.setListListener(p);
		p.columnRslt_disp_str145.addAllListener(p);
		p.columnRslt_disp_str145.setListListener(p);
		p.columnRslt_disp_str146.addAllListener(p);
		p.columnRslt_disp_str146.setListListener(p);
		p.columnRslt_disp_str147.addAllListener(p);
		p.columnRslt_disp_str147.setListListener(p);
		p.columnRslt_disp_str148.addAllListener(p);
		p.columnRslt_disp_str148.setListListener(p);
		p.columnRslt_disp_str149.addAllListener(p);
		p.columnRslt_disp_str149.setListListener(p);
		p.columnRslt_disp_str150.addAllListener(p);
		p.columnRslt_disp_str150.setListListener(p);
		p.columnRslt_disp_str151.addAllListener(p);
		p.columnRslt_disp_str151.setListListener(p);
		p.columnRslt_disp_str152.addAllListener(p);
		p.columnRslt_disp_str152.setListListener(p);
		p.columnRslt_disp_str153.addAllListener(p);
		p.columnRslt_disp_str153.setListListener(p);
		p.columnRslt_disp_str154.addAllListener(p);
		p.columnRslt_disp_str154.setListListener(p);
		p.columnRslt_disp_str155.addAllListener(p);
		p.columnRslt_disp_str155.setListListener(p);
		p.columnRslt_disp_str156.addAllListener(p);
		p.columnRslt_disp_str156.setListListener(p);
		p.columnRslt_disp_str157.addAllListener(p);
		p.columnRslt_disp_str157.setListListener(p);
		p.columnRslt_disp_str158.addAllListener(p);
		p.columnRslt_disp_str158.setListListener(p);
		p.columnRslt_disp_str159.addAllListener(p);
		p.columnRslt_disp_str159.setListListener(p);
		p.columnRslt_disp_str160.addAllListener(p);
		p.columnRslt_disp_str160.setListListener(p);
		p.columnRslt_disp_str161.addAllListener(p);
		p.columnRslt_disp_str161.setListListener(p);
		p.columnRslt_disp_str162.addAllListener(p);
		p.columnRslt_disp_str162.setListListener(p);
		p.columnRslt_disp_str163.addAllListener(p);
		p.columnRslt_disp_str163.setListListener(p);
		p.columnRslt_disp_str164.addAllListener(p);
		p.columnRslt_disp_str164.setListListener(p);
		p.columnRslt_disp_str165.addAllListener(p);
		p.columnRslt_disp_str165.setListListener(p);
		p.columnRslt_disp_str166.addAllListener(p);
		p.columnRslt_disp_str166.setListListener(p);
		p.columnRslt_disp_str167.addAllListener(p);
		p.columnRslt_disp_str167.setListListener(p);
		p.columnRslt_disp_str168.addAllListener(p);
		p.columnRslt_disp_str168.setListListener(p);
		p.columnRslt_disp_str169.addAllListener(p);
		p.columnRslt_disp_str169.setListListener(p);
		p.columnRslt_disp_str170.addAllListener(p);
		p.columnRslt_disp_str170.setListListener(p);
		p.columnRslt_disp_str171.addAllListener(p);
		p.columnRslt_disp_str171.setListListener(p);
		p.columnRslt_disp_str172.addAllListener(p);
		p.columnRslt_disp_str172.setListListener(p);
		p.columnRslt_disp_str173.addAllListener(p);
		p.columnRslt_disp_str173.setListListener(p);
		p.columnRslt_disp_str174.addAllListener(p);
		p.columnRslt_disp_str174.setListListener(p);
		p.columnRslt_disp_str175.addAllListener(p);
		p.columnRslt_disp_str175.setListListener(p);
		p.columnRslt_disp_str176.addAllListener(p);
		p.columnRslt_disp_str176.setListListener(p);
		p.columnRslt_disp_str177.addAllListener(p);
		p.columnRslt_disp_str177.setListListener(p);
		p.columnRslt_disp_str178.addAllListener(p);
		p.columnRslt_disp_str178.setListListener(p);
		p.columnRslt_disp_str179.addAllListener(p);
		p.columnRslt_disp_str179.setListListener(p);
		p.columnRslt_disp_str180.addAllListener(p);
		p.columnRslt_disp_str180.setListListener(p);
		p.columnRslt_disp_str181.addAllListener(p);
		p.columnRslt_disp_str181.setListListener(p);
		p.columnRslt_disp_str182.addAllListener(p);
		p.columnRslt_disp_str182.setListListener(p);
		p.columnRslt_disp_str183.addAllListener(p);
		p.columnRslt_disp_str183.setListListener(p);
		p.columnRslt_disp_str184.addAllListener(p);
		p.columnRslt_disp_str184.setListListener(p);
		p.columnRslt_disp_str185.addAllListener(p);
		p.columnRslt_disp_str185.setListListener(p);
		p.columnRslt_disp_str186.addAllListener(p);
		p.columnRslt_disp_str186.setListListener(p);
		p.columnRslt_disp_str187.addAllListener(p);
		p.columnRslt_disp_str187.setListListener(p);
		p.columnRslt_disp_str188.addAllListener(p);
		p.columnRslt_disp_str188.setListListener(p);
		p.columnRslt_disp_str189.addAllListener(p);
		p.columnRslt_disp_str189.setListListener(p);
		p.columnRslt_disp_str190.addAllListener(p);
		p.columnRslt_disp_str190.setListListener(p);
		p.columnRslt_disp_str191.addAllListener(p);
		p.columnRslt_disp_str191.setListListener(p);
		p.columnRslt_disp_str192.addAllListener(p);
		p.columnRslt_disp_str192.setListListener(p);
		p.columnRslt_disp_str193.addAllListener(p);
		p.columnRslt_disp_str193.setListListener(p);
		p.columnRslt_disp_str194.addAllListener(p);
		p.columnRslt_disp_str194.setListListener(p);
		p.columnRslt_disp_str195.addAllListener(p);
		p.columnRslt_disp_str195.setListListener(p);
		p.columnRslt_disp_str196.addAllListener(p);
		p.columnRslt_disp_str196.setListListener(p);
		p.columnRslt_disp_str197.addAllListener(p);
		p.columnRslt_disp_str197.setListListener(p);
		p.columnRslt_disp_str198.addAllListener(p);
		p.columnRslt_disp_str198.setListListener(p);
		p.columnRslt_disp_str199.addAllListener(p);
		p.columnRslt_disp_str199.setListListener(p);
		p.columnRslt_disp_str200.addAllListener(p);
		p.columnRslt_disp_str200.setListListener(p);
		p.columnRslt_disp_dt001.addAllListener(p);
		p.columnRslt_disp_dt001.setListListener(p);
		p.columnRslt_disp_dt002.addAllListener(p);
		p.columnRslt_disp_dt002.setListListener(p);
		p.columnRslt_disp_dt003.addAllListener(p);
		p.columnRslt_disp_dt003.setListListener(p);
		p.columnRslt_disp_dt004.addAllListener(p);
		p.columnRslt_disp_dt004.setListListener(p);
		p.columnRslt_disp_dt005.addAllListener(p);
		p.columnRslt_disp_dt005.setListListener(p);
		p.columnRslt_disp_dt006.addAllListener(p);
		p.columnRslt_disp_dt006.setListListener(p);
		p.columnRslt_disp_dt007.addAllListener(p);
		p.columnRslt_disp_dt007.setListListener(p);
		p.columnRslt_disp_dt008.addAllListener(p);
		p.columnRslt_disp_dt008.setListListener(p);
		p.columnRslt_disp_dt009.addAllListener(p);
		p.columnRslt_disp_dt009.setListListener(p);
		p.columnRslt_disp_dt010.addAllListener(p);
		p.columnRslt_disp_dt010.setListListener(p);
		p.columnRslt_disp_num001.addAllListener(p);
		p.columnRslt_disp_num001.setListListener(p);
		p.columnRslt_disp_num002.addAllListener(p);
		p.columnRslt_disp_num002.setListListener(p);
		p.columnRslt_disp_num003.addAllListener(p);
		p.columnRslt_disp_num003.setListListener(p);
		p.columnRslt_disp_num004.addAllListener(p);
		p.columnRslt_disp_num004.setListListener(p);
		p.columnRslt_disp_num005.addAllListener(p);
		p.columnRslt_disp_num005.setListListener(p);
		p.columnRslt_disp_num006.addAllListener(p);
		p.columnRslt_disp_num006.setListListener(p);
		p.columnRslt_disp_num007.addAllListener(p);
		p.columnRslt_disp_num007.setListListener(p);
		p.columnRslt_disp_num008.addAllListener(p);
		p.columnRslt_disp_num008.setListListener(p);
		p.columnRslt_disp_num009.addAllListener(p);
		p.columnRslt_disp_num009.setListListener(p);
		p.columnRslt_disp_num010.addAllListener(p);
		p.columnRslt_disp_num010.setListListener(p);
	}

	/**
	 *  [RsltSml]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltSml(MBBEP_SrchRsltRef p) {
		p.RsltSml_exec_time.setListListener(p);
		p.RsltSml_exec_time.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBEP_SrchRsltRef p){
		p.Cnd_biz_dat_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bind.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBEP_SrchRsltRef p){
		p.columnRslt_disp_str001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str100.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str101.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str102.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str103.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str104.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str105.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str106.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str107.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str108.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str109.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str110.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str111.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str112.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str113.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str114.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str115.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str116.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str117.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str118.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str119.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str120.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str121.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str122.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str123.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str124.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str125.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str126.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str127.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str128.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str129.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str130.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str131.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str132.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str133.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str134.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str135.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str136.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str137.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str138.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str139.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str140.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str141.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str142.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str143.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str144.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str145.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str146.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str147.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str148.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str149.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str150.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str151.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str152.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str153.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str154.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str155.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str156.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str157.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str158.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str159.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str160.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str161.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str162.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str163.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str164.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str165.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str166.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str167.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str168.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str169.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str170.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str171.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str172.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str173.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str174.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str175.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str176.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str177.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str178.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str179.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str180.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str181.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str182.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str183.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str184.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str185.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str186.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str187.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str188.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str189.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str190.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str191.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str192.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str193.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str194.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str195.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str196.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str197.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str198.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str199.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_str200.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_dt010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_num010.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltSml(MBBEP_SrchRsltRef p){
		p.RsltSml_exec_time.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltLbl(MBBEP_SrchRsltRef p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBEP_SrchRsltRef p){
		p.Cnd_biz_dat_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_biz_dat_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bind.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBEP_SrchRsltRef p){
		p.columnRslt_disp_str001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str099.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str100.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str101.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str102.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str103.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str104.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str105.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str106.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str107.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str108.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str109.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str110.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str111.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str112.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str113.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str114.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str115.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str116.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str117.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str118.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str119.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str120.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str121.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str122.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str123.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str124.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str125.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str126.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str127.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str128.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str129.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str130.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str131.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str132.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str133.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str134.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str135.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str136.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str137.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str138.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str139.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str140.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str141.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str142.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str143.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str144.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str145.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str146.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str147.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str148.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str149.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str150.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str151.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str152.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str153.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str154.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str155.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str156.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str157.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str158.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str159.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str160.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str161.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str162.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str163.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str164.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str165.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str166.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str167.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str168.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str169.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str170.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str171.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str172.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str173.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str174.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str175.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str176.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str177.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str178.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str179.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str180.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str181.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str182.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str183.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str184.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str185.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str186.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str187.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str188.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str189.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str190.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str191.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str192.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str193.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str194.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str195.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str196.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str197.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str198.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str199.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_str200.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_dt010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_num010.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltSml(MBBEP_SrchRsltRef p){
		p.RsltSml_exec_time.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltLbl(MBBEP_SrchRsltRef p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MBBEP_SrchRsltRef_MC.setTableConfigRslt((MBBEP_SrchRsltRef)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBEP_SrchRsltRef p) {
		p.columnRslt_disp_str001.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str001_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str001);
		p.columnRslt_disp_str002.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str002_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str002);
		p.columnRslt_disp_str003.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str003_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str003);
		p.columnRslt_disp_str004.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str004_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str004);
		p.columnRslt_disp_str005.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str005_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str005);
		p.columnRslt_disp_str006.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str006_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str006);
		p.columnRslt_disp_str007.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str007_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str007);
		p.columnRslt_disp_str008.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str008_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str008);
		p.columnRslt_disp_str009.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str009_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str009);
		p.columnRslt_disp_str010.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str010_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str010);
		p.columnRslt_disp_str011.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str011_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str011);
		p.columnRslt_disp_str012.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str012_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str012);
		p.columnRslt_disp_str013.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str013_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str013);
		p.columnRslt_disp_str014.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str014_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str014);
		p.columnRslt_disp_str015.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str015_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str015);
		p.columnRslt_disp_str016.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str016_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str016);
		p.columnRslt_disp_str017.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str017_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str017);
		p.columnRslt_disp_str018.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str018_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str018);
		p.columnRslt_disp_str019.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str019_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str019);
		p.columnRslt_disp_str020.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str020_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str020);
		p.columnRslt_disp_str021.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str021_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str021);
		p.columnRslt_disp_str022.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str022_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str022);
		p.columnRslt_disp_str023.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str023_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str023);
		p.columnRslt_disp_str024.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str024_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str024);
		p.columnRslt_disp_str025.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str025_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str025);
		p.columnRslt_disp_str026.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str026_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str026);
		p.columnRslt_disp_str027.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str027_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str027);
		p.columnRslt_disp_str028.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str028_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str028);
		p.columnRslt_disp_str029.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str029_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str029);
		p.columnRslt_disp_str030.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str030_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str030);
		p.columnRslt_disp_str031.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str031_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str031);
		p.columnRslt_disp_str032.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str032_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str032);
		p.columnRslt_disp_str033.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str033_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str033);
		p.columnRslt_disp_str034.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str034_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str034);
		p.columnRslt_disp_str035.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str035_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str035);
		p.columnRslt_disp_str036.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str036_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str036);
		p.columnRslt_disp_str037.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str037_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str037);
		p.columnRslt_disp_str038.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str038_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str038);
		p.columnRslt_disp_str039.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str039_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str039);
		p.columnRslt_disp_str040.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str040_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str040);
		p.columnRslt_disp_str041.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str041_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str041);
		p.columnRslt_disp_str042.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str042_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str042);
		p.columnRslt_disp_str043.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str043_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str043);
		p.columnRslt_disp_str044.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str044_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str044);
		p.columnRslt_disp_str045.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str045_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str045);
		p.columnRslt_disp_str046.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str046_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str046);
		p.columnRslt_disp_str047.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str047_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str047);
		p.columnRslt_disp_str048.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str048_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str048);
		p.columnRslt_disp_str049.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str049_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str049);
		p.columnRslt_disp_str050.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str050_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str050);
		p.columnRslt_disp_str051.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str051_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str051);
		p.columnRslt_disp_str052.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str052_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str052);
		p.columnRslt_disp_str053.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str053_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str053);
		p.columnRslt_disp_str054.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str054_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str054);
		p.columnRslt_disp_str055.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str055_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str055);
		p.columnRslt_disp_str056.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str056_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str056);
		p.columnRslt_disp_str057.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str057_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str057);
		p.columnRslt_disp_str058.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str058_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str058);
		p.columnRslt_disp_str059.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str059_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str059);
		p.columnRslt_disp_str060.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str060_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str060);
		p.columnRslt_disp_str061.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str061_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str061);
		p.columnRslt_disp_str062.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str062_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str062);
		p.columnRslt_disp_str063.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str063_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str063);
		p.columnRslt_disp_str064.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str064_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str064);
		p.columnRslt_disp_str065.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str065_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str065);
		p.columnRslt_disp_str066.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str066_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str066);
		p.columnRslt_disp_str067.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str067_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str067);
		p.columnRslt_disp_str068.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str068_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str068);
		p.columnRslt_disp_str069.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str069_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str069);
		p.columnRslt_disp_str070.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str070_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str070);
		p.columnRslt_disp_str071.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str071_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str071);
		p.columnRslt_disp_str072.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str072_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str072);
		p.columnRslt_disp_str073.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str073_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str073);
		p.columnRslt_disp_str074.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str074_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str074);
		p.columnRslt_disp_str075.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str075_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str075);
		p.columnRslt_disp_str076.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str076_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str076);
		p.columnRslt_disp_str077.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str077_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str077);
		p.columnRslt_disp_str078.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str078_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str078);
		p.columnRslt_disp_str079.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str079_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str079);
		p.columnRslt_disp_str080.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str080_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str080);
		p.columnRslt_disp_str081.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str081_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str081);
		p.columnRslt_disp_str082.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str082_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str082);
		p.columnRslt_disp_str083.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str083_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str083);
		p.columnRslt_disp_str084.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str084_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str084);
		p.columnRslt_disp_str085.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str085_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str085);
		p.columnRslt_disp_str086.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str086_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str086);
		p.columnRslt_disp_str087.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str087_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str087);
		p.columnRslt_disp_str088.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str088_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str088);
		p.columnRslt_disp_str089.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str089_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str089);
		p.columnRslt_disp_str090.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str090_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str090);
		p.columnRslt_disp_str091.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str091_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str091);
		p.columnRslt_disp_str092.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str092_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str092);
		p.columnRslt_disp_str093.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str093_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str093);
		p.columnRslt_disp_str094.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str094_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str094);
		p.columnRslt_disp_str095.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str095_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str095);
		p.columnRslt_disp_str096.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str096_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str096);
		p.columnRslt_disp_str097.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str097_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str097);
		p.columnRslt_disp_str098.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str098_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str098);
		p.columnRslt_disp_str099.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str099_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str099);
		p.columnRslt_disp_str100.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str100_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str100);
		p.columnRslt_disp_str101.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str101_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str101);
		p.columnRslt_disp_str102.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str102_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str102);
		p.columnRslt_disp_str103.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str103_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str103);
		p.columnRslt_disp_str104.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str104_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str104);
		p.columnRslt_disp_str105.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str105_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str105);
		p.columnRslt_disp_str106.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str106_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str106);
		p.columnRslt_disp_str107.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str107_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str107);
		p.columnRslt_disp_str108.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str108_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str108);
		p.columnRslt_disp_str109.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str109_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str109);
		p.columnRslt_disp_str110.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str110_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str110);
		p.columnRslt_disp_str111.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str111_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str111);
		p.columnRslt_disp_str112.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str112_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str112);
		p.columnRslt_disp_str113.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str113_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str113);
		p.columnRslt_disp_str114.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str114_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str114);
		p.columnRslt_disp_str115.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str115_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str115);
		p.columnRslt_disp_str116.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str116_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str116);
		p.columnRslt_disp_str117.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str117_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str117);
		p.columnRslt_disp_str118.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str118_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str118);
		p.columnRslt_disp_str119.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str119_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str119);
		p.columnRslt_disp_str120.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str120_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str120);
		p.columnRslt_disp_str121.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str121_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str121);
		p.columnRslt_disp_str122.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str122_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str122);
		p.columnRslt_disp_str123.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str123_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str123);
		p.columnRslt_disp_str124.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str124_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str124);
		p.columnRslt_disp_str125.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str125_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str125);
		p.columnRslt_disp_str126.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str126_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str126);
		p.columnRslt_disp_str127.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str127_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str127);
		p.columnRslt_disp_str128.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str128_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str128);
		p.columnRslt_disp_str129.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str129_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str129);
		p.columnRslt_disp_str130.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str130_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str130);
		p.columnRslt_disp_str131.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str131_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str131);
		p.columnRslt_disp_str132.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str132_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str132);
		p.columnRslt_disp_str133.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str133_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str133);
		p.columnRslt_disp_str134.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str134_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str134);
		p.columnRslt_disp_str135.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str135_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str135);
		p.columnRslt_disp_str136.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str136_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str136);
		p.columnRslt_disp_str137.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str137_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str137);
		p.columnRslt_disp_str138.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str138_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str138);
		p.columnRslt_disp_str139.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str139_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str139);
		p.columnRslt_disp_str140.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str140_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str140);
		p.columnRslt_disp_str141.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str141_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str141);
		p.columnRslt_disp_str142.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str142_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str142);
		p.columnRslt_disp_str143.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str143_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str143);
		p.columnRslt_disp_str144.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str144_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str144);
		p.columnRslt_disp_str145.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str145_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str145);
		p.columnRslt_disp_str146.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str146_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str146);
		p.columnRslt_disp_str147.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str147_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str147);
		p.columnRslt_disp_str148.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str148_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str148);
		p.columnRslt_disp_str149.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str149_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str149);
		p.columnRslt_disp_str150.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str150_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str150);
		p.columnRslt_disp_str151.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str151_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str151);
		p.columnRslt_disp_str152.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str152_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str152);
		p.columnRslt_disp_str153.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str153_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str153);
		p.columnRslt_disp_str154.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str154_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str154);
		p.columnRslt_disp_str155.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str155_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str155);
		p.columnRslt_disp_str156.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str156_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str156);
		p.columnRslt_disp_str157.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str157_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str157);
		p.columnRslt_disp_str158.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str158_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str158);
		p.columnRslt_disp_str159.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str159_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str159);
		p.columnRslt_disp_str160.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str160_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str160);
		p.columnRslt_disp_str161.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str161_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str161);
		p.columnRslt_disp_str162.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str162_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str162);
		p.columnRslt_disp_str163.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str163_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str163);
		p.columnRslt_disp_str164.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str164_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str164);
		p.columnRslt_disp_str165.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str165_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str165);
		p.columnRslt_disp_str166.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str166_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str166);
		p.columnRslt_disp_str167.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str167_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str167);
		p.columnRslt_disp_str168.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str168_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str168);
		p.columnRslt_disp_str169.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str169_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str169);
		p.columnRslt_disp_str170.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str170_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str170);
		p.columnRslt_disp_str171.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str171_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str171);
		p.columnRslt_disp_str172.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str172_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str172);
		p.columnRslt_disp_str173.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str173_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str173);
		p.columnRslt_disp_str174.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str174_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str174);
		p.columnRslt_disp_str175.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str175_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str175);
		p.columnRslt_disp_str176.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str176_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str176);
		p.columnRslt_disp_str177.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str177_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str177);
		p.columnRslt_disp_str178.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str178_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str178);
		p.columnRslt_disp_str179.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str179_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str179);
		p.columnRslt_disp_str180.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str180_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str180);
		p.columnRslt_disp_str181.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str181_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str181);
		p.columnRslt_disp_str182.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str182_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str182);
		p.columnRslt_disp_str183.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str183_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str183);
		p.columnRslt_disp_str184.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str184_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str184);
		p.columnRslt_disp_str185.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str185_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str185);
		p.columnRslt_disp_str186.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str186_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str186);
		p.columnRslt_disp_str187.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str187_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str187);
		p.columnRslt_disp_str188.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str188_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str188);
		p.columnRslt_disp_str189.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str189_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str189);
		p.columnRslt_disp_str190.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str190_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str190);
		p.columnRslt_disp_str191.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str191_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str191);
		p.columnRslt_disp_str192.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str192_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str192);
		p.columnRslt_disp_str193.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str193_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str193);
		p.columnRslt_disp_str194.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str194_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str194);
		p.columnRslt_disp_str195.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str195_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str195);
		p.columnRslt_disp_str196.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str196_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str196);
		p.columnRslt_disp_str197.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str197_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str197);
		p.columnRslt_disp_str198.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str198_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str198);
		p.columnRslt_disp_str199.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str199_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str199);
		p.columnRslt_disp_str200.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_str200_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_str200);
		p.columnRslt_disp_dt001.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt001_META);
		p.columnRslt_disp_dt001.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt001);
		p.columnRslt_disp_dt002.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt002_META);
		p.columnRslt_disp_dt002.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt002);
		p.columnRslt_disp_dt003.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt003_META);
		p.columnRslt_disp_dt003.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt003);
		p.columnRslt_disp_dt004.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt004_META);
		p.columnRslt_disp_dt004.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt004);
		p.columnRslt_disp_dt005.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt005_META);
		p.columnRslt_disp_dt005.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt005);
		p.columnRslt_disp_dt006.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt006_META);
		p.columnRslt_disp_dt006.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt006);
		p.columnRslt_disp_dt007.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt007_META);
		p.columnRslt_disp_dt007.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt007);
		p.columnRslt_disp_dt008.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt008_META);
		p.columnRslt_disp_dt008.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt008);
		p.columnRslt_disp_dt009.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt009_META);
		p.columnRslt_disp_dt009.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt009);
		p.columnRslt_disp_dt010.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_dt010_META);
		p.columnRslt_disp_dt010.setFormatID(mcframe.commonMA.meta.MA_META.DISP_DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_dt010);
		p.columnRslt_disp_num001.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num001_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num001);
		p.columnRslt_disp_num002.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num002_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num002);
		p.columnRslt_disp_num003.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num003_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num003);
		p.columnRslt_disp_num004.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num004_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num004);
		p.columnRslt_disp_num005.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num005_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num005);
		p.columnRslt_disp_num006.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num006_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num006);
		p.columnRslt_disp_num007.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num007_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num007);
		p.columnRslt_disp_num008.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num008_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num008);
		p.columnRslt_disp_num009.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num009_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num009);
		p.columnRslt_disp_num010.setMeta(mcframe.clientMBBE.MBBEP0100.RsltR.disp_num010_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_num010);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_dat_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_dat_id.getListConfig().setPutter(getCnd_biz_dat_id_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_biz_dat_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_dat_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BizDatID");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_biz_dat_id) return getCnd_biz_dat_id(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Cnd_dwnld) doCnd_dwnld(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_dwnld(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_biz_dat_id) return doCnd_biz_dat_id_VC(info);
		if (vc == Cnd_biz_dat_nm) return doCnd_biz_dat_nm_VC(info);
		if (vc == Cnd_bind) return doCnd_bind_VC(info);
		if (vc == columnRslt_disp_str001) return doRslt_disp_str001_VC(info);
		if (vc == columnRslt_disp_str002) return doRslt_disp_str002_VC(info);
		if (vc == columnRslt_disp_str003) return doRslt_disp_str003_VC(info);
		if (vc == columnRslt_disp_str004) return doRslt_disp_str004_VC(info);
		if (vc == columnRslt_disp_str005) return doRslt_disp_str005_VC(info);
		if (vc == columnRslt_disp_str006) return doRslt_disp_str006_VC(info);
		if (vc == columnRslt_disp_str007) return doRslt_disp_str007_VC(info);
		if (vc == columnRslt_disp_str008) return doRslt_disp_str008_VC(info);
		if (vc == columnRslt_disp_str009) return doRslt_disp_str009_VC(info);
		if (vc == columnRslt_disp_str010) return doRslt_disp_str010_VC(info);
		if (vc == columnRslt_disp_str011) return doRslt_disp_str011_VC(info);
		if (vc == columnRslt_disp_str012) return doRslt_disp_str012_VC(info);
		if (vc == columnRslt_disp_str013) return doRslt_disp_str013_VC(info);
		if (vc == columnRslt_disp_str014) return doRslt_disp_str014_VC(info);
		if (vc == columnRslt_disp_str015) return doRslt_disp_str015_VC(info);
		if (vc == columnRslt_disp_str016) return doRslt_disp_str016_VC(info);
		if (vc == columnRslt_disp_str017) return doRslt_disp_str017_VC(info);
		if (vc == columnRslt_disp_str018) return doRslt_disp_str018_VC(info);
		if (vc == columnRslt_disp_str019) return doRslt_disp_str019_VC(info);
		if (vc == columnRslt_disp_str020) return doRslt_disp_str020_VC(info);
		if (vc == columnRslt_disp_str021) return doRslt_disp_str021_VC(info);
		if (vc == columnRslt_disp_str022) return doRslt_disp_str022_VC(info);
		if (vc == columnRslt_disp_str023) return doRslt_disp_str023_VC(info);
		if (vc == columnRslt_disp_str024) return doRslt_disp_str024_VC(info);
		if (vc == columnRslt_disp_str025) return doRslt_disp_str025_VC(info);
		if (vc == columnRslt_disp_str026) return doRslt_disp_str026_VC(info);
		if (vc == columnRslt_disp_str027) return doRslt_disp_str027_VC(info);
		if (vc == columnRslt_disp_str028) return doRslt_disp_str028_VC(info);
		if (vc == columnRslt_disp_str029) return doRslt_disp_str029_VC(info);
		if (vc == columnRslt_disp_str030) return doRslt_disp_str030_VC(info);
		if (vc == columnRslt_disp_str031) return doRslt_disp_str031_VC(info);
		if (vc == columnRslt_disp_str032) return doRslt_disp_str032_VC(info);
		if (vc == columnRslt_disp_str033) return doRslt_disp_str033_VC(info);
		if (vc == columnRslt_disp_str034) return doRslt_disp_str034_VC(info);
		if (vc == columnRslt_disp_str035) return doRslt_disp_str035_VC(info);
		if (vc == columnRslt_disp_str036) return doRslt_disp_str036_VC(info);
		if (vc == columnRslt_disp_str037) return doRslt_disp_str037_VC(info);
		if (vc == columnRslt_disp_str038) return doRslt_disp_str038_VC(info);
		if (vc == columnRslt_disp_str039) return doRslt_disp_str039_VC(info);
		if (vc == columnRslt_disp_str040) return doRslt_disp_str040_VC(info);
		if (vc == columnRslt_disp_str041) return doRslt_disp_str041_VC(info);
		if (vc == columnRslt_disp_str042) return doRslt_disp_str042_VC(info);
		if (vc == columnRslt_disp_str043) return doRslt_disp_str043_VC(info);
		if (vc == columnRslt_disp_str044) return doRslt_disp_str044_VC(info);
		if (vc == columnRslt_disp_str045) return doRslt_disp_str045_VC(info);
		if (vc == columnRslt_disp_str046) return doRslt_disp_str046_VC(info);
		if (vc == columnRslt_disp_str047) return doRslt_disp_str047_VC(info);
		if (vc == columnRslt_disp_str048) return doRslt_disp_str048_VC(info);
		if (vc == columnRslt_disp_str049) return doRslt_disp_str049_VC(info);
		if (vc == columnRslt_disp_str050) return doRslt_disp_str050_VC(info);
		if (vc == columnRslt_disp_str051) return doRslt_disp_str051_VC(info);
		if (vc == columnRslt_disp_str052) return doRslt_disp_str052_VC(info);
		if (vc == columnRslt_disp_str053) return doRslt_disp_str053_VC(info);
		if (vc == columnRslt_disp_str054) return doRslt_disp_str054_VC(info);
		if (vc == columnRslt_disp_str055) return doRslt_disp_str055_VC(info);
		if (vc == columnRslt_disp_str056) return doRslt_disp_str056_VC(info);
		if (vc == columnRslt_disp_str057) return doRslt_disp_str057_VC(info);
		if (vc == columnRslt_disp_str058) return doRslt_disp_str058_VC(info);
		if (vc == columnRslt_disp_str059) return doRslt_disp_str059_VC(info);
		if (vc == columnRslt_disp_str060) return doRslt_disp_str060_VC(info);
		if (vc == columnRslt_disp_str061) return doRslt_disp_str061_VC(info);
		if (vc == columnRslt_disp_str062) return doRslt_disp_str062_VC(info);
		if (vc == columnRslt_disp_str063) return doRslt_disp_str063_VC(info);
		if (vc == columnRslt_disp_str064) return doRslt_disp_str064_VC(info);
		if (vc == columnRslt_disp_str065) return doRslt_disp_str065_VC(info);
		if (vc == columnRslt_disp_str066) return doRslt_disp_str066_VC(info);
		if (vc == columnRslt_disp_str067) return doRslt_disp_str067_VC(info);
		if (vc == columnRslt_disp_str068) return doRslt_disp_str068_VC(info);
		if (vc == columnRslt_disp_str069) return doRslt_disp_str069_VC(info);
		if (vc == columnRslt_disp_str070) return doRslt_disp_str070_VC(info);
		if (vc == columnRslt_disp_str071) return doRslt_disp_str071_VC(info);
		if (vc == columnRslt_disp_str072) return doRslt_disp_str072_VC(info);
		if (vc == columnRslt_disp_str073) return doRslt_disp_str073_VC(info);
		if (vc == columnRslt_disp_str074) return doRslt_disp_str074_VC(info);
		if (vc == columnRslt_disp_str075) return doRslt_disp_str075_VC(info);
		if (vc == columnRslt_disp_str076) return doRslt_disp_str076_VC(info);
		if (vc == columnRslt_disp_str077) return doRslt_disp_str077_VC(info);
		if (vc == columnRslt_disp_str078) return doRslt_disp_str078_VC(info);
		if (vc == columnRslt_disp_str079) return doRslt_disp_str079_VC(info);
		if (vc == columnRslt_disp_str080) return doRslt_disp_str080_VC(info);
		if (vc == columnRslt_disp_str081) return doRslt_disp_str081_VC(info);
		if (vc == columnRslt_disp_str082) return doRslt_disp_str082_VC(info);
		if (vc == columnRslt_disp_str083) return doRslt_disp_str083_VC(info);
		if (vc == columnRslt_disp_str084) return doRslt_disp_str084_VC(info);
		if (vc == columnRslt_disp_str085) return doRslt_disp_str085_VC(info);
		if (vc == columnRslt_disp_str086) return doRslt_disp_str086_VC(info);
		if (vc == columnRslt_disp_str087) return doRslt_disp_str087_VC(info);
		if (vc == columnRslt_disp_str088) return doRslt_disp_str088_VC(info);
		if (vc == columnRslt_disp_str089) return doRslt_disp_str089_VC(info);
		if (vc == columnRslt_disp_str090) return doRslt_disp_str090_VC(info);
		if (vc == columnRslt_disp_str091) return doRslt_disp_str091_VC(info);
		if (vc == columnRslt_disp_str092) return doRslt_disp_str092_VC(info);
		if (vc == columnRslt_disp_str093) return doRslt_disp_str093_VC(info);
		if (vc == columnRslt_disp_str094) return doRslt_disp_str094_VC(info);
		if (vc == columnRslt_disp_str095) return doRslt_disp_str095_VC(info);
		if (vc == columnRslt_disp_str096) return doRslt_disp_str096_VC(info);
		if (vc == columnRslt_disp_str097) return doRslt_disp_str097_VC(info);
		if (vc == columnRslt_disp_str098) return doRslt_disp_str098_VC(info);
		if (vc == columnRslt_disp_str099) return doRslt_disp_str099_VC(info);
		if (vc == columnRslt_disp_str100) return doRslt_disp_str100_VC(info);
		if (vc == columnRslt_disp_str101) return doRslt_disp_str101_VC(info);
		if (vc == columnRslt_disp_str102) return doRslt_disp_str102_VC(info);
		if (vc == columnRslt_disp_str103) return doRslt_disp_str103_VC(info);
		if (vc == columnRslt_disp_str104) return doRslt_disp_str104_VC(info);
		if (vc == columnRslt_disp_str105) return doRslt_disp_str105_VC(info);
		if (vc == columnRslt_disp_str106) return doRslt_disp_str106_VC(info);
		if (vc == columnRslt_disp_str107) return doRslt_disp_str107_VC(info);
		if (vc == columnRslt_disp_str108) return doRslt_disp_str108_VC(info);
		if (vc == columnRslt_disp_str109) return doRslt_disp_str109_VC(info);
		if (vc == columnRslt_disp_str110) return doRslt_disp_str110_VC(info);
		if (vc == columnRslt_disp_str111) return doRslt_disp_str111_VC(info);
		if (vc == columnRslt_disp_str112) return doRslt_disp_str112_VC(info);
		if (vc == columnRslt_disp_str113) return doRslt_disp_str113_VC(info);
		if (vc == columnRslt_disp_str114) return doRslt_disp_str114_VC(info);
		if (vc == columnRslt_disp_str115) return doRslt_disp_str115_VC(info);
		if (vc == columnRslt_disp_str116) return doRslt_disp_str116_VC(info);
		if (vc == columnRslt_disp_str117) return doRslt_disp_str117_VC(info);
		if (vc == columnRslt_disp_str118) return doRslt_disp_str118_VC(info);
		if (vc == columnRslt_disp_str119) return doRslt_disp_str119_VC(info);
		if (vc == columnRslt_disp_str120) return doRslt_disp_str120_VC(info);
		if (vc == columnRslt_disp_str121) return doRslt_disp_str121_VC(info);
		if (vc == columnRslt_disp_str122) return doRslt_disp_str122_VC(info);
		if (vc == columnRslt_disp_str123) return doRslt_disp_str123_VC(info);
		if (vc == columnRslt_disp_str124) return doRslt_disp_str124_VC(info);
		if (vc == columnRslt_disp_str125) return doRslt_disp_str125_VC(info);
		if (vc == columnRslt_disp_str126) return doRslt_disp_str126_VC(info);
		if (vc == columnRslt_disp_str127) return doRslt_disp_str127_VC(info);
		if (vc == columnRslt_disp_str128) return doRslt_disp_str128_VC(info);
		if (vc == columnRslt_disp_str129) return doRslt_disp_str129_VC(info);
		if (vc == columnRslt_disp_str130) return doRslt_disp_str130_VC(info);
		if (vc == columnRslt_disp_str131) return doRslt_disp_str131_VC(info);
		if (vc == columnRslt_disp_str132) return doRslt_disp_str132_VC(info);
		if (vc == columnRslt_disp_str133) return doRslt_disp_str133_VC(info);
		if (vc == columnRslt_disp_str134) return doRslt_disp_str134_VC(info);
		if (vc == columnRslt_disp_str135) return doRslt_disp_str135_VC(info);
		if (vc == columnRslt_disp_str136) return doRslt_disp_str136_VC(info);
		if (vc == columnRslt_disp_str137) return doRslt_disp_str137_VC(info);
		if (vc == columnRslt_disp_str138) return doRslt_disp_str138_VC(info);
		if (vc == columnRslt_disp_str139) return doRslt_disp_str139_VC(info);
		if (vc == columnRslt_disp_str140) return doRslt_disp_str140_VC(info);
		if (vc == columnRslt_disp_str141) return doRslt_disp_str141_VC(info);
		if (vc == columnRslt_disp_str142) return doRslt_disp_str142_VC(info);
		if (vc == columnRslt_disp_str143) return doRslt_disp_str143_VC(info);
		if (vc == columnRslt_disp_str144) return doRslt_disp_str144_VC(info);
		if (vc == columnRslt_disp_str145) return doRslt_disp_str145_VC(info);
		if (vc == columnRslt_disp_str146) return doRslt_disp_str146_VC(info);
		if (vc == columnRslt_disp_str147) return doRslt_disp_str147_VC(info);
		if (vc == columnRslt_disp_str148) return doRslt_disp_str148_VC(info);
		if (vc == columnRslt_disp_str149) return doRslt_disp_str149_VC(info);
		if (vc == columnRslt_disp_str150) return doRslt_disp_str150_VC(info);
		if (vc == columnRslt_disp_str151) return doRslt_disp_str151_VC(info);
		if (vc == columnRslt_disp_str152) return doRslt_disp_str152_VC(info);
		if (vc == columnRslt_disp_str153) return doRslt_disp_str153_VC(info);
		if (vc == columnRslt_disp_str154) return doRslt_disp_str154_VC(info);
		if (vc == columnRslt_disp_str155) return doRslt_disp_str155_VC(info);
		if (vc == columnRslt_disp_str156) return doRslt_disp_str156_VC(info);
		if (vc == columnRslt_disp_str157) return doRslt_disp_str157_VC(info);
		if (vc == columnRslt_disp_str158) return doRslt_disp_str158_VC(info);
		if (vc == columnRslt_disp_str159) return doRslt_disp_str159_VC(info);
		if (vc == columnRslt_disp_str160) return doRslt_disp_str160_VC(info);
		if (vc == columnRslt_disp_str161) return doRslt_disp_str161_VC(info);
		if (vc == columnRslt_disp_str162) return doRslt_disp_str162_VC(info);
		if (vc == columnRslt_disp_str163) return doRslt_disp_str163_VC(info);
		if (vc == columnRslt_disp_str164) return doRslt_disp_str164_VC(info);
		if (vc == columnRslt_disp_str165) return doRslt_disp_str165_VC(info);
		if (vc == columnRslt_disp_str166) return doRslt_disp_str166_VC(info);
		if (vc == columnRslt_disp_str167) return doRslt_disp_str167_VC(info);
		if (vc == columnRslt_disp_str168) return doRslt_disp_str168_VC(info);
		if (vc == columnRslt_disp_str169) return doRslt_disp_str169_VC(info);
		if (vc == columnRslt_disp_str170) return doRslt_disp_str170_VC(info);
		if (vc == columnRslt_disp_str171) return doRslt_disp_str171_VC(info);
		if (vc == columnRslt_disp_str172) return doRslt_disp_str172_VC(info);
		if (vc == columnRslt_disp_str173) return doRslt_disp_str173_VC(info);
		if (vc == columnRslt_disp_str174) return doRslt_disp_str174_VC(info);
		if (vc == columnRslt_disp_str175) return doRslt_disp_str175_VC(info);
		if (vc == columnRslt_disp_str176) return doRslt_disp_str176_VC(info);
		if (vc == columnRslt_disp_str177) return doRslt_disp_str177_VC(info);
		if (vc == columnRslt_disp_str178) return doRslt_disp_str178_VC(info);
		if (vc == columnRslt_disp_str179) return doRslt_disp_str179_VC(info);
		if (vc == columnRslt_disp_str180) return doRslt_disp_str180_VC(info);
		if (vc == columnRslt_disp_str181) return doRslt_disp_str181_VC(info);
		if (vc == columnRslt_disp_str182) return doRslt_disp_str182_VC(info);
		if (vc == columnRslt_disp_str183) return doRslt_disp_str183_VC(info);
		if (vc == columnRslt_disp_str184) return doRslt_disp_str184_VC(info);
		if (vc == columnRslt_disp_str185) return doRslt_disp_str185_VC(info);
		if (vc == columnRslt_disp_str186) return doRslt_disp_str186_VC(info);
		if (vc == columnRslt_disp_str187) return doRslt_disp_str187_VC(info);
		if (vc == columnRslt_disp_str188) return doRslt_disp_str188_VC(info);
		if (vc == columnRslt_disp_str189) return doRslt_disp_str189_VC(info);
		if (vc == columnRslt_disp_str190) return doRslt_disp_str190_VC(info);
		if (vc == columnRslt_disp_str191) return doRslt_disp_str191_VC(info);
		if (vc == columnRslt_disp_str192) return doRslt_disp_str192_VC(info);
		if (vc == columnRslt_disp_str193) return doRslt_disp_str193_VC(info);
		if (vc == columnRslt_disp_str194) return doRslt_disp_str194_VC(info);
		if (vc == columnRslt_disp_str195) return doRslt_disp_str195_VC(info);
		if (vc == columnRslt_disp_str196) return doRslt_disp_str196_VC(info);
		if (vc == columnRslt_disp_str197) return doRslt_disp_str197_VC(info);
		if (vc == columnRslt_disp_str198) return doRslt_disp_str198_VC(info);
		if (vc == columnRslt_disp_str199) return doRslt_disp_str199_VC(info);
		if (vc == columnRslt_disp_str200) return doRslt_disp_str200_VC(info);
		if (vc == columnRslt_disp_dt001) return doRslt_disp_dt001_VC(info);
		if (vc == columnRslt_disp_dt002) return doRslt_disp_dt002_VC(info);
		if (vc == columnRslt_disp_dt003) return doRslt_disp_dt003_VC(info);
		if (vc == columnRslt_disp_dt004) return doRslt_disp_dt004_VC(info);
		if (vc == columnRslt_disp_dt005) return doRslt_disp_dt005_VC(info);
		if (vc == columnRslt_disp_dt006) return doRslt_disp_dt006_VC(info);
		if (vc == columnRslt_disp_dt007) return doRslt_disp_dt007_VC(info);
		if (vc == columnRslt_disp_dt008) return doRslt_disp_dt008_VC(info);
		if (vc == columnRslt_disp_dt009) return doRslt_disp_dt009_VC(info);
		if (vc == columnRslt_disp_dt010) return doRslt_disp_dt010_VC(info);
		if (vc == columnRslt_disp_num001) return doRslt_disp_num001_VC(info);
		if (vc == columnRslt_disp_num002) return doRslt_disp_num002_VC(info);
		if (vc == columnRslt_disp_num003) return doRslt_disp_num003_VC(info);
		if (vc == columnRslt_disp_num004) return doRslt_disp_num004_VC(info);
		if (vc == columnRslt_disp_num005) return doRslt_disp_num005_VC(info);
		if (vc == columnRslt_disp_num006) return doRslt_disp_num006_VC(info);
		if (vc == columnRslt_disp_num007) return doRslt_disp_num007_VC(info);
		if (vc == columnRslt_disp_num008) return doRslt_disp_num008_VC(info);
		if (vc == columnRslt_disp_num009) return doRslt_disp_num009_VC(info);
		if (vc == columnRslt_disp_num010) return doRslt_disp_num010_VC(info);
		if (vc == RsltSml_exec_time) return doRsltSml_exec_time_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bind]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bind_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str100]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str100_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str101]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str101_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str102]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str102_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str103]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str103_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str104]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str104_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str105]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str105_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str106]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str106_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str107]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str107_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str108]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str108_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str109]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str109_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str110]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str110_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str111]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str111_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str112]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str112_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str113]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str113_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str114]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str114_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str115]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str115_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str116]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str116_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str117]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str117_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str118]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str118_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str119]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str119_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str120]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str120_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str121]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str121_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str122]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str122_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str123]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str123_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str124]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str124_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str125]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str125_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str126]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str126_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str127]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str127_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str128]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str128_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str129]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str129_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str130]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str130_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str131]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str131_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str132]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str132_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str133]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str133_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str134]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str134_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str135]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str135_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str136]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str136_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str137]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str137_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str138]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str138_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str139]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str139_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str140]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str140_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str141]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str141_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str142]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str142_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str143]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str143_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str144]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str144_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str145]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str145_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str146]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str146_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str147]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str147_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str148]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str148_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str149]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str149_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str150]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str150_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str151]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str151_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str152]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str152_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str153]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str153_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str154]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str154_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str155]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str155_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str156]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str156_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str157]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str157_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str158]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str158_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str159]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str159_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str160]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str160_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str161]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str161_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str162]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str162_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str163]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str163_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str164]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str164_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str165]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str165_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str166]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str166_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str167]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str167_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str168]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str168_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str169]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str169_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str170]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str170_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str171]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str171_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str172]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str172_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str173]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str173_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str174]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str174_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str175]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str175_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str176]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str176_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str177]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str177_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str178]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str178_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str179]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str179_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str180]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str180_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str181]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str181_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str182]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str182_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str183]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str183_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str184]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str184_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str185]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str185_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str186]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str186_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str187]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str187_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str188]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str188_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str189]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str189_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str190]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str190_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str191]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str191_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str192]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str192_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str193]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str193_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str194]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str194_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str195]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str195_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str196]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str196_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str197]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str197_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str198]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str198_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str199]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str199_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_str200]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_str200_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_dt010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_dt010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_num010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_num010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSml]パネルの[exec_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSml_exec_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_biz_dat_id) doCnd_biz_dat_id_NC(info);
		else if (nc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NC(info);
		else if (nc == Cnd_bind) doCnd_bind_NC(info);
		else if (nc == columnRslt_disp_str001) doRslt_disp_str001_NC(info);
		else if (nc == columnRslt_disp_str002) doRslt_disp_str002_NC(info);
		else if (nc == columnRslt_disp_str003) doRslt_disp_str003_NC(info);
		else if (nc == columnRslt_disp_str004) doRslt_disp_str004_NC(info);
		else if (nc == columnRslt_disp_str005) doRslt_disp_str005_NC(info);
		else if (nc == columnRslt_disp_str006) doRslt_disp_str006_NC(info);
		else if (nc == columnRslt_disp_str007) doRslt_disp_str007_NC(info);
		else if (nc == columnRslt_disp_str008) doRslt_disp_str008_NC(info);
		else if (nc == columnRslt_disp_str009) doRslt_disp_str009_NC(info);
		else if (nc == columnRslt_disp_str010) doRslt_disp_str010_NC(info);
		else if (nc == columnRslt_disp_str011) doRslt_disp_str011_NC(info);
		else if (nc == columnRslt_disp_str012) doRslt_disp_str012_NC(info);
		else if (nc == columnRslt_disp_str013) doRslt_disp_str013_NC(info);
		else if (nc == columnRslt_disp_str014) doRslt_disp_str014_NC(info);
		else if (nc == columnRslt_disp_str015) doRslt_disp_str015_NC(info);
		else if (nc == columnRslt_disp_str016) doRslt_disp_str016_NC(info);
		else if (nc == columnRslt_disp_str017) doRslt_disp_str017_NC(info);
		else if (nc == columnRslt_disp_str018) doRslt_disp_str018_NC(info);
		else if (nc == columnRslt_disp_str019) doRslt_disp_str019_NC(info);
		else if (nc == columnRslt_disp_str020) doRslt_disp_str020_NC(info);
		else if (nc == columnRslt_disp_str021) doRslt_disp_str021_NC(info);
		else if (nc == columnRslt_disp_str022) doRslt_disp_str022_NC(info);
		else if (nc == columnRslt_disp_str023) doRslt_disp_str023_NC(info);
		else if (nc == columnRslt_disp_str024) doRslt_disp_str024_NC(info);
		else if (nc == columnRslt_disp_str025) doRslt_disp_str025_NC(info);
		else if (nc == columnRslt_disp_str026) doRslt_disp_str026_NC(info);
		else if (nc == columnRslt_disp_str027) doRslt_disp_str027_NC(info);
		else if (nc == columnRslt_disp_str028) doRslt_disp_str028_NC(info);
		else if (nc == columnRslt_disp_str029) doRslt_disp_str029_NC(info);
		else if (nc == columnRslt_disp_str030) doRslt_disp_str030_NC(info);
		else if (nc == columnRslt_disp_str031) doRslt_disp_str031_NC(info);
		else if (nc == columnRslt_disp_str032) doRslt_disp_str032_NC(info);
		else if (nc == columnRslt_disp_str033) doRslt_disp_str033_NC(info);
		else if (nc == columnRslt_disp_str034) doRslt_disp_str034_NC(info);
		else if (nc == columnRslt_disp_str035) doRslt_disp_str035_NC(info);
		else if (nc == columnRslt_disp_str036) doRslt_disp_str036_NC(info);
		else if (nc == columnRslt_disp_str037) doRslt_disp_str037_NC(info);
		else if (nc == columnRslt_disp_str038) doRslt_disp_str038_NC(info);
		else if (nc == columnRslt_disp_str039) doRslt_disp_str039_NC(info);
		else if (nc == columnRslt_disp_str040) doRslt_disp_str040_NC(info);
		else if (nc == columnRslt_disp_str041) doRslt_disp_str041_NC(info);
		else if (nc == columnRslt_disp_str042) doRslt_disp_str042_NC(info);
		else if (nc == columnRslt_disp_str043) doRslt_disp_str043_NC(info);
		else if (nc == columnRslt_disp_str044) doRslt_disp_str044_NC(info);
		else if (nc == columnRslt_disp_str045) doRslt_disp_str045_NC(info);
		else if (nc == columnRslt_disp_str046) doRslt_disp_str046_NC(info);
		else if (nc == columnRslt_disp_str047) doRslt_disp_str047_NC(info);
		else if (nc == columnRslt_disp_str048) doRslt_disp_str048_NC(info);
		else if (nc == columnRslt_disp_str049) doRslt_disp_str049_NC(info);
		else if (nc == columnRslt_disp_str050) doRslt_disp_str050_NC(info);
		else if (nc == columnRslt_disp_str051) doRslt_disp_str051_NC(info);
		else if (nc == columnRslt_disp_str052) doRslt_disp_str052_NC(info);
		else if (nc == columnRslt_disp_str053) doRslt_disp_str053_NC(info);
		else if (nc == columnRslt_disp_str054) doRslt_disp_str054_NC(info);
		else if (nc == columnRslt_disp_str055) doRslt_disp_str055_NC(info);
		else if (nc == columnRslt_disp_str056) doRslt_disp_str056_NC(info);
		else if (nc == columnRslt_disp_str057) doRslt_disp_str057_NC(info);
		else if (nc == columnRslt_disp_str058) doRslt_disp_str058_NC(info);
		else if (nc == columnRslt_disp_str059) doRslt_disp_str059_NC(info);
		else if (nc == columnRslt_disp_str060) doRslt_disp_str060_NC(info);
		else if (nc == columnRslt_disp_str061) doRslt_disp_str061_NC(info);
		else if (nc == columnRslt_disp_str062) doRslt_disp_str062_NC(info);
		else if (nc == columnRslt_disp_str063) doRslt_disp_str063_NC(info);
		else if (nc == columnRslt_disp_str064) doRslt_disp_str064_NC(info);
		else if (nc == columnRslt_disp_str065) doRslt_disp_str065_NC(info);
		else if (nc == columnRslt_disp_str066) doRslt_disp_str066_NC(info);
		else if (nc == columnRslt_disp_str067) doRslt_disp_str067_NC(info);
		else if (nc == columnRslt_disp_str068) doRslt_disp_str068_NC(info);
		else if (nc == columnRslt_disp_str069) doRslt_disp_str069_NC(info);
		else if (nc == columnRslt_disp_str070) doRslt_disp_str070_NC(info);
		else if (nc == columnRslt_disp_str071) doRslt_disp_str071_NC(info);
		else if (nc == columnRslt_disp_str072) doRslt_disp_str072_NC(info);
		else if (nc == columnRslt_disp_str073) doRslt_disp_str073_NC(info);
		else if (nc == columnRslt_disp_str074) doRslt_disp_str074_NC(info);
		else if (nc == columnRslt_disp_str075) doRslt_disp_str075_NC(info);
		else if (nc == columnRslt_disp_str076) doRslt_disp_str076_NC(info);
		else if (nc == columnRslt_disp_str077) doRslt_disp_str077_NC(info);
		else if (nc == columnRslt_disp_str078) doRslt_disp_str078_NC(info);
		else if (nc == columnRslt_disp_str079) doRslt_disp_str079_NC(info);
		else if (nc == columnRslt_disp_str080) doRslt_disp_str080_NC(info);
		else if (nc == columnRslt_disp_str081) doRslt_disp_str081_NC(info);
		else if (nc == columnRslt_disp_str082) doRslt_disp_str082_NC(info);
		else if (nc == columnRslt_disp_str083) doRslt_disp_str083_NC(info);
		else if (nc == columnRslt_disp_str084) doRslt_disp_str084_NC(info);
		else if (nc == columnRslt_disp_str085) doRslt_disp_str085_NC(info);
		else if (nc == columnRslt_disp_str086) doRslt_disp_str086_NC(info);
		else if (nc == columnRslt_disp_str087) doRslt_disp_str087_NC(info);
		else if (nc == columnRslt_disp_str088) doRslt_disp_str088_NC(info);
		else if (nc == columnRslt_disp_str089) doRslt_disp_str089_NC(info);
		else if (nc == columnRslt_disp_str090) doRslt_disp_str090_NC(info);
		else if (nc == columnRslt_disp_str091) doRslt_disp_str091_NC(info);
		else if (nc == columnRslt_disp_str092) doRslt_disp_str092_NC(info);
		else if (nc == columnRslt_disp_str093) doRslt_disp_str093_NC(info);
		else if (nc == columnRslt_disp_str094) doRslt_disp_str094_NC(info);
		else if (nc == columnRslt_disp_str095) doRslt_disp_str095_NC(info);
		else if (nc == columnRslt_disp_str096) doRslt_disp_str096_NC(info);
		else if (nc == columnRslt_disp_str097) doRslt_disp_str097_NC(info);
		else if (nc == columnRslt_disp_str098) doRslt_disp_str098_NC(info);
		else if (nc == columnRslt_disp_str099) doRslt_disp_str099_NC(info);
		else if (nc == columnRslt_disp_str100) doRslt_disp_str100_NC(info);
		else if (nc == columnRslt_disp_str101) doRslt_disp_str101_NC(info);
		else if (nc == columnRslt_disp_str102) doRslt_disp_str102_NC(info);
		else if (nc == columnRslt_disp_str103) doRslt_disp_str103_NC(info);
		else if (nc == columnRslt_disp_str104) doRslt_disp_str104_NC(info);
		else if (nc == columnRslt_disp_str105) doRslt_disp_str105_NC(info);
		else if (nc == columnRslt_disp_str106) doRslt_disp_str106_NC(info);
		else if (nc == columnRslt_disp_str107) doRslt_disp_str107_NC(info);
		else if (nc == columnRslt_disp_str108) doRslt_disp_str108_NC(info);
		else if (nc == columnRslt_disp_str109) doRslt_disp_str109_NC(info);
		else if (nc == columnRslt_disp_str110) doRslt_disp_str110_NC(info);
		else if (nc == columnRslt_disp_str111) doRslt_disp_str111_NC(info);
		else if (nc == columnRslt_disp_str112) doRslt_disp_str112_NC(info);
		else if (nc == columnRslt_disp_str113) doRslt_disp_str113_NC(info);
		else if (nc == columnRslt_disp_str114) doRslt_disp_str114_NC(info);
		else if (nc == columnRslt_disp_str115) doRslt_disp_str115_NC(info);
		else if (nc == columnRslt_disp_str116) doRslt_disp_str116_NC(info);
		else if (nc == columnRslt_disp_str117) doRslt_disp_str117_NC(info);
		else if (nc == columnRslt_disp_str118) doRslt_disp_str118_NC(info);
		else if (nc == columnRslt_disp_str119) doRslt_disp_str119_NC(info);
		else if (nc == columnRslt_disp_str120) doRslt_disp_str120_NC(info);
		else if (nc == columnRslt_disp_str121) doRslt_disp_str121_NC(info);
		else if (nc == columnRslt_disp_str122) doRslt_disp_str122_NC(info);
		else if (nc == columnRslt_disp_str123) doRslt_disp_str123_NC(info);
		else if (nc == columnRslt_disp_str124) doRslt_disp_str124_NC(info);
		else if (nc == columnRslt_disp_str125) doRslt_disp_str125_NC(info);
		else if (nc == columnRslt_disp_str126) doRslt_disp_str126_NC(info);
		else if (nc == columnRslt_disp_str127) doRslt_disp_str127_NC(info);
		else if (nc == columnRslt_disp_str128) doRslt_disp_str128_NC(info);
		else if (nc == columnRslt_disp_str129) doRslt_disp_str129_NC(info);
		else if (nc == columnRslt_disp_str130) doRslt_disp_str130_NC(info);
		else if (nc == columnRslt_disp_str131) doRslt_disp_str131_NC(info);
		else if (nc == columnRslt_disp_str132) doRslt_disp_str132_NC(info);
		else if (nc == columnRslt_disp_str133) doRslt_disp_str133_NC(info);
		else if (nc == columnRslt_disp_str134) doRslt_disp_str134_NC(info);
		else if (nc == columnRslt_disp_str135) doRslt_disp_str135_NC(info);
		else if (nc == columnRslt_disp_str136) doRslt_disp_str136_NC(info);
		else if (nc == columnRslt_disp_str137) doRslt_disp_str137_NC(info);
		else if (nc == columnRslt_disp_str138) doRslt_disp_str138_NC(info);
		else if (nc == columnRslt_disp_str139) doRslt_disp_str139_NC(info);
		else if (nc == columnRslt_disp_str140) doRslt_disp_str140_NC(info);
		else if (nc == columnRslt_disp_str141) doRslt_disp_str141_NC(info);
		else if (nc == columnRslt_disp_str142) doRslt_disp_str142_NC(info);
		else if (nc == columnRslt_disp_str143) doRslt_disp_str143_NC(info);
		else if (nc == columnRslt_disp_str144) doRslt_disp_str144_NC(info);
		else if (nc == columnRslt_disp_str145) doRslt_disp_str145_NC(info);
		else if (nc == columnRslt_disp_str146) doRslt_disp_str146_NC(info);
		else if (nc == columnRslt_disp_str147) doRslt_disp_str147_NC(info);
		else if (nc == columnRslt_disp_str148) doRslt_disp_str148_NC(info);
		else if (nc == columnRslt_disp_str149) doRslt_disp_str149_NC(info);
		else if (nc == columnRslt_disp_str150) doRslt_disp_str150_NC(info);
		else if (nc == columnRslt_disp_str151) doRslt_disp_str151_NC(info);
		else if (nc == columnRslt_disp_str152) doRslt_disp_str152_NC(info);
		else if (nc == columnRslt_disp_str153) doRslt_disp_str153_NC(info);
		else if (nc == columnRslt_disp_str154) doRslt_disp_str154_NC(info);
		else if (nc == columnRslt_disp_str155) doRslt_disp_str155_NC(info);
		else if (nc == columnRslt_disp_str156) doRslt_disp_str156_NC(info);
		else if (nc == columnRslt_disp_str157) doRslt_disp_str157_NC(info);
		else if (nc == columnRslt_disp_str158) doRslt_disp_str158_NC(info);
		else if (nc == columnRslt_disp_str159) doRslt_disp_str159_NC(info);
		else if (nc == columnRslt_disp_str160) doRslt_disp_str160_NC(info);
		else if (nc == columnRslt_disp_str161) doRslt_disp_str161_NC(info);
		else if (nc == columnRslt_disp_str162) doRslt_disp_str162_NC(info);
		else if (nc == columnRslt_disp_str163) doRslt_disp_str163_NC(info);
		else if (nc == columnRslt_disp_str164) doRslt_disp_str164_NC(info);
		else if (nc == columnRslt_disp_str165) doRslt_disp_str165_NC(info);
		else if (nc == columnRslt_disp_str166) doRslt_disp_str166_NC(info);
		else if (nc == columnRslt_disp_str167) doRslt_disp_str167_NC(info);
		else if (nc == columnRslt_disp_str168) doRslt_disp_str168_NC(info);
		else if (nc == columnRslt_disp_str169) doRslt_disp_str169_NC(info);
		else if (nc == columnRslt_disp_str170) doRslt_disp_str170_NC(info);
		else if (nc == columnRslt_disp_str171) doRslt_disp_str171_NC(info);
		else if (nc == columnRslt_disp_str172) doRslt_disp_str172_NC(info);
		else if (nc == columnRslt_disp_str173) doRslt_disp_str173_NC(info);
		else if (nc == columnRslt_disp_str174) doRslt_disp_str174_NC(info);
		else if (nc == columnRslt_disp_str175) doRslt_disp_str175_NC(info);
		else if (nc == columnRslt_disp_str176) doRslt_disp_str176_NC(info);
		else if (nc == columnRslt_disp_str177) doRslt_disp_str177_NC(info);
		else if (nc == columnRslt_disp_str178) doRslt_disp_str178_NC(info);
		else if (nc == columnRslt_disp_str179) doRslt_disp_str179_NC(info);
		else if (nc == columnRslt_disp_str180) doRslt_disp_str180_NC(info);
		else if (nc == columnRslt_disp_str181) doRslt_disp_str181_NC(info);
		else if (nc == columnRslt_disp_str182) doRslt_disp_str182_NC(info);
		else if (nc == columnRslt_disp_str183) doRslt_disp_str183_NC(info);
		else if (nc == columnRslt_disp_str184) doRslt_disp_str184_NC(info);
		else if (nc == columnRslt_disp_str185) doRslt_disp_str185_NC(info);
		else if (nc == columnRslt_disp_str186) doRslt_disp_str186_NC(info);
		else if (nc == columnRslt_disp_str187) doRslt_disp_str187_NC(info);
		else if (nc == columnRslt_disp_str188) doRslt_disp_str188_NC(info);
		else if (nc == columnRslt_disp_str189) doRslt_disp_str189_NC(info);
		else if (nc == columnRslt_disp_str190) doRslt_disp_str190_NC(info);
		else if (nc == columnRslt_disp_str191) doRslt_disp_str191_NC(info);
		else if (nc == columnRslt_disp_str192) doRslt_disp_str192_NC(info);
		else if (nc == columnRslt_disp_str193) doRslt_disp_str193_NC(info);
		else if (nc == columnRslt_disp_str194) doRslt_disp_str194_NC(info);
		else if (nc == columnRslt_disp_str195) doRslt_disp_str195_NC(info);
		else if (nc == columnRslt_disp_str196) doRslt_disp_str196_NC(info);
		else if (nc == columnRslt_disp_str197) doRslt_disp_str197_NC(info);
		else if (nc == columnRslt_disp_str198) doRslt_disp_str198_NC(info);
		else if (nc == columnRslt_disp_str199) doRslt_disp_str199_NC(info);
		else if (nc == columnRslt_disp_str200) doRslt_disp_str200_NC(info);
		else if (nc == columnRslt_disp_dt001) doRslt_disp_dt001_NC(info);
		else if (nc == columnRslt_disp_dt002) doRslt_disp_dt002_NC(info);
		else if (nc == columnRslt_disp_dt003) doRslt_disp_dt003_NC(info);
		else if (nc == columnRslt_disp_dt004) doRslt_disp_dt004_NC(info);
		else if (nc == columnRslt_disp_dt005) doRslt_disp_dt005_NC(info);
		else if (nc == columnRslt_disp_dt006) doRslt_disp_dt006_NC(info);
		else if (nc == columnRslt_disp_dt007) doRslt_disp_dt007_NC(info);
		else if (nc == columnRslt_disp_dt008) doRslt_disp_dt008_NC(info);
		else if (nc == columnRslt_disp_dt009) doRslt_disp_dt009_NC(info);
		else if (nc == columnRslt_disp_dt010) doRslt_disp_dt010_NC(info);
		else if (nc == columnRslt_disp_num001) doRslt_disp_num001_NC(info);
		else if (nc == columnRslt_disp_num002) doRslt_disp_num002_NC(info);
		else if (nc == columnRslt_disp_num003) doRslt_disp_num003_NC(info);
		else if (nc == columnRslt_disp_num004) doRslt_disp_num004_NC(info);
		else if (nc == columnRslt_disp_num005) doRslt_disp_num005_NC(info);
		else if (nc == columnRslt_disp_num006) doRslt_disp_num006_NC(info);
		else if (nc == columnRslt_disp_num007) doRslt_disp_num007_NC(info);
		else if (nc == columnRslt_disp_num008) doRslt_disp_num008_NC(info);
		else if (nc == columnRslt_disp_num009) doRslt_disp_num009_NC(info);
		else if (nc == columnRslt_disp_num010) doRslt_disp_num010_NC(info);
		else if (nc == RsltSml_exec_time) doRsltSml_exec_time_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bind]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bind_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str010_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str011_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str012_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str013_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str014_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str015_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str016_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str017_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str018_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str019_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str020_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str021_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str022_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str023_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str024_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str025_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str026_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str027_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str028_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str029_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str030_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str031_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str032_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str033_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str034_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str035_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str036_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str037_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str038_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str039_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str040_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str041_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str042_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str043_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str044_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str045_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str046_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str047_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str048_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str049_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str050_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str051_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str052_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str053_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str054_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str055_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str056_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str057_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str058_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str059_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str060_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str061_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str062_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str063_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str064_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str065_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str066_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str067_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str068_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str069_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str070_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str071_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str072_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str073_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str074_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str075_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str076_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str077_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str078_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str079_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str080_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str081_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str082_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str083_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str084_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str085_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str086_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str087_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str088_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str089_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str090_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str091_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str092_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str093_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str094_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str095_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str096_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str097_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str098_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str099_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str100]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str100_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str101]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str101_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str102]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str102_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str103]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str103_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str104]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str104_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str105]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str105_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str106]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str106_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str107]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str107_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str108]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str108_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str109]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str109_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str110]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str110_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str111]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str111_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str112]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str112_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str113]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str113_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str114]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str114_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str115]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str115_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str116]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str116_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str117]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str117_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str118]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str118_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str119]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str119_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str120]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str120_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str121]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str121_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str122]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str122_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str123]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str123_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str124]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str124_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str125]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str125_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str126]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str126_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str127]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str127_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str128]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str128_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str129]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str129_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str130]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str130_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str131]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str131_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str132]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str132_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str133]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str133_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str134]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str134_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str135]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str135_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str136]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str136_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str137]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str137_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str138]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str138_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str139]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str139_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str140]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str140_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str141]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str141_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str142]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str142_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str143]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str143_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str144]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str144_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str145]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str145_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str146]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str146_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str147]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str147_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str148]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str148_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str149]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str149_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str150]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str150_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str151]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str151_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str152]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str152_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str153]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str153_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str154]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str154_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str155]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str155_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str156]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str156_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str157]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str157_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str158]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str158_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str159]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str159_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str160]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str160_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str161]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str161_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str162]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str162_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str163]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str163_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str164]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str164_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str165]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str165_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str166]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str166_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str167]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str167_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str168]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str168_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str169]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str169_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str170]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str170_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str171]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str171_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str172]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str172_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str173]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str173_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str174]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str174_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str175]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str175_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str176]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str176_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str177]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str177_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str178]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str178_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str179]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str179_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str180]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str180_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str181]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str181_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str182]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str182_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str183]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str183_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str184]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str184_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str185]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str185_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str186]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str186_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str187]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str187_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str188]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str188_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str189]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str189_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str190]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str190_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str191]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str191_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str192]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str192_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str193]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str193_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str194]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str194_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str195]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str195_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str196]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str196_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str197]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str197_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str198]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str198_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str199]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str199_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str200]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str200_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt010_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num010_NC(MCEventInfo info){
	}

	/**
	 * [RsltSml]パネルの[exec_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSml_exec_time_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_biz_dat_id) doCnd_biz_dat_id_NE(info);
		else if (ne == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NE(info);
		else if (ne == Cnd_bind) doCnd_bind_NE(info);
		else if (ne == columnRslt_disp_str001) doRslt_disp_str001_NE(info);
		else if (ne == columnRslt_disp_str002) doRslt_disp_str002_NE(info);
		else if (ne == columnRslt_disp_str003) doRslt_disp_str003_NE(info);
		else if (ne == columnRslt_disp_str004) doRslt_disp_str004_NE(info);
		else if (ne == columnRslt_disp_str005) doRslt_disp_str005_NE(info);
		else if (ne == columnRslt_disp_str006) doRslt_disp_str006_NE(info);
		else if (ne == columnRslt_disp_str007) doRslt_disp_str007_NE(info);
		else if (ne == columnRslt_disp_str008) doRslt_disp_str008_NE(info);
		else if (ne == columnRslt_disp_str009) doRslt_disp_str009_NE(info);
		else if (ne == columnRslt_disp_str010) doRslt_disp_str010_NE(info);
		else if (ne == columnRslt_disp_str011) doRslt_disp_str011_NE(info);
		else if (ne == columnRslt_disp_str012) doRslt_disp_str012_NE(info);
		else if (ne == columnRslt_disp_str013) doRslt_disp_str013_NE(info);
		else if (ne == columnRslt_disp_str014) doRslt_disp_str014_NE(info);
		else if (ne == columnRslt_disp_str015) doRslt_disp_str015_NE(info);
		else if (ne == columnRslt_disp_str016) doRslt_disp_str016_NE(info);
		else if (ne == columnRslt_disp_str017) doRslt_disp_str017_NE(info);
		else if (ne == columnRslt_disp_str018) doRslt_disp_str018_NE(info);
		else if (ne == columnRslt_disp_str019) doRslt_disp_str019_NE(info);
		else if (ne == columnRslt_disp_str020) doRslt_disp_str020_NE(info);
		else if (ne == columnRslt_disp_str021) doRslt_disp_str021_NE(info);
		else if (ne == columnRslt_disp_str022) doRslt_disp_str022_NE(info);
		else if (ne == columnRslt_disp_str023) doRslt_disp_str023_NE(info);
		else if (ne == columnRslt_disp_str024) doRslt_disp_str024_NE(info);
		else if (ne == columnRslt_disp_str025) doRslt_disp_str025_NE(info);
		else if (ne == columnRslt_disp_str026) doRslt_disp_str026_NE(info);
		else if (ne == columnRslt_disp_str027) doRslt_disp_str027_NE(info);
		else if (ne == columnRslt_disp_str028) doRslt_disp_str028_NE(info);
		else if (ne == columnRslt_disp_str029) doRslt_disp_str029_NE(info);
		else if (ne == columnRslt_disp_str030) doRslt_disp_str030_NE(info);
		else if (ne == columnRslt_disp_str031) doRslt_disp_str031_NE(info);
		else if (ne == columnRslt_disp_str032) doRslt_disp_str032_NE(info);
		else if (ne == columnRslt_disp_str033) doRslt_disp_str033_NE(info);
		else if (ne == columnRslt_disp_str034) doRslt_disp_str034_NE(info);
		else if (ne == columnRslt_disp_str035) doRslt_disp_str035_NE(info);
		else if (ne == columnRslt_disp_str036) doRslt_disp_str036_NE(info);
		else if (ne == columnRslt_disp_str037) doRslt_disp_str037_NE(info);
		else if (ne == columnRslt_disp_str038) doRslt_disp_str038_NE(info);
		else if (ne == columnRslt_disp_str039) doRslt_disp_str039_NE(info);
		else if (ne == columnRslt_disp_str040) doRslt_disp_str040_NE(info);
		else if (ne == columnRslt_disp_str041) doRslt_disp_str041_NE(info);
		else if (ne == columnRslt_disp_str042) doRslt_disp_str042_NE(info);
		else if (ne == columnRslt_disp_str043) doRslt_disp_str043_NE(info);
		else if (ne == columnRslt_disp_str044) doRslt_disp_str044_NE(info);
		else if (ne == columnRslt_disp_str045) doRslt_disp_str045_NE(info);
		else if (ne == columnRslt_disp_str046) doRslt_disp_str046_NE(info);
		else if (ne == columnRslt_disp_str047) doRslt_disp_str047_NE(info);
		else if (ne == columnRslt_disp_str048) doRslt_disp_str048_NE(info);
		else if (ne == columnRslt_disp_str049) doRslt_disp_str049_NE(info);
		else if (ne == columnRslt_disp_str050) doRslt_disp_str050_NE(info);
		else if (ne == columnRslt_disp_str051) doRslt_disp_str051_NE(info);
		else if (ne == columnRslt_disp_str052) doRslt_disp_str052_NE(info);
		else if (ne == columnRslt_disp_str053) doRslt_disp_str053_NE(info);
		else if (ne == columnRslt_disp_str054) doRslt_disp_str054_NE(info);
		else if (ne == columnRslt_disp_str055) doRslt_disp_str055_NE(info);
		else if (ne == columnRslt_disp_str056) doRslt_disp_str056_NE(info);
		else if (ne == columnRslt_disp_str057) doRslt_disp_str057_NE(info);
		else if (ne == columnRslt_disp_str058) doRslt_disp_str058_NE(info);
		else if (ne == columnRslt_disp_str059) doRslt_disp_str059_NE(info);
		else if (ne == columnRslt_disp_str060) doRslt_disp_str060_NE(info);
		else if (ne == columnRslt_disp_str061) doRslt_disp_str061_NE(info);
		else if (ne == columnRslt_disp_str062) doRslt_disp_str062_NE(info);
		else if (ne == columnRslt_disp_str063) doRslt_disp_str063_NE(info);
		else if (ne == columnRslt_disp_str064) doRslt_disp_str064_NE(info);
		else if (ne == columnRslt_disp_str065) doRslt_disp_str065_NE(info);
		else if (ne == columnRslt_disp_str066) doRslt_disp_str066_NE(info);
		else if (ne == columnRslt_disp_str067) doRslt_disp_str067_NE(info);
		else if (ne == columnRslt_disp_str068) doRslt_disp_str068_NE(info);
		else if (ne == columnRslt_disp_str069) doRslt_disp_str069_NE(info);
		else if (ne == columnRslt_disp_str070) doRslt_disp_str070_NE(info);
		else if (ne == columnRslt_disp_str071) doRslt_disp_str071_NE(info);
		else if (ne == columnRslt_disp_str072) doRslt_disp_str072_NE(info);
		else if (ne == columnRslt_disp_str073) doRslt_disp_str073_NE(info);
		else if (ne == columnRslt_disp_str074) doRslt_disp_str074_NE(info);
		else if (ne == columnRslt_disp_str075) doRslt_disp_str075_NE(info);
		else if (ne == columnRslt_disp_str076) doRslt_disp_str076_NE(info);
		else if (ne == columnRslt_disp_str077) doRslt_disp_str077_NE(info);
		else if (ne == columnRslt_disp_str078) doRslt_disp_str078_NE(info);
		else if (ne == columnRslt_disp_str079) doRslt_disp_str079_NE(info);
		else if (ne == columnRslt_disp_str080) doRslt_disp_str080_NE(info);
		else if (ne == columnRslt_disp_str081) doRslt_disp_str081_NE(info);
		else if (ne == columnRslt_disp_str082) doRslt_disp_str082_NE(info);
		else if (ne == columnRslt_disp_str083) doRslt_disp_str083_NE(info);
		else if (ne == columnRslt_disp_str084) doRslt_disp_str084_NE(info);
		else if (ne == columnRslt_disp_str085) doRslt_disp_str085_NE(info);
		else if (ne == columnRslt_disp_str086) doRslt_disp_str086_NE(info);
		else if (ne == columnRslt_disp_str087) doRslt_disp_str087_NE(info);
		else if (ne == columnRslt_disp_str088) doRslt_disp_str088_NE(info);
		else if (ne == columnRslt_disp_str089) doRslt_disp_str089_NE(info);
		else if (ne == columnRslt_disp_str090) doRslt_disp_str090_NE(info);
		else if (ne == columnRslt_disp_str091) doRslt_disp_str091_NE(info);
		else if (ne == columnRslt_disp_str092) doRslt_disp_str092_NE(info);
		else if (ne == columnRslt_disp_str093) doRslt_disp_str093_NE(info);
		else if (ne == columnRslt_disp_str094) doRslt_disp_str094_NE(info);
		else if (ne == columnRslt_disp_str095) doRslt_disp_str095_NE(info);
		else if (ne == columnRslt_disp_str096) doRslt_disp_str096_NE(info);
		else if (ne == columnRslt_disp_str097) doRslt_disp_str097_NE(info);
		else if (ne == columnRslt_disp_str098) doRslt_disp_str098_NE(info);
		else if (ne == columnRslt_disp_str099) doRslt_disp_str099_NE(info);
		else if (ne == columnRslt_disp_str100) doRslt_disp_str100_NE(info);
		else if (ne == columnRslt_disp_str101) doRslt_disp_str101_NE(info);
		else if (ne == columnRslt_disp_str102) doRslt_disp_str102_NE(info);
		else if (ne == columnRslt_disp_str103) doRslt_disp_str103_NE(info);
		else if (ne == columnRslt_disp_str104) doRslt_disp_str104_NE(info);
		else if (ne == columnRslt_disp_str105) doRslt_disp_str105_NE(info);
		else if (ne == columnRslt_disp_str106) doRslt_disp_str106_NE(info);
		else if (ne == columnRslt_disp_str107) doRslt_disp_str107_NE(info);
		else if (ne == columnRslt_disp_str108) doRslt_disp_str108_NE(info);
		else if (ne == columnRslt_disp_str109) doRslt_disp_str109_NE(info);
		else if (ne == columnRslt_disp_str110) doRslt_disp_str110_NE(info);
		else if (ne == columnRslt_disp_str111) doRslt_disp_str111_NE(info);
		else if (ne == columnRslt_disp_str112) doRslt_disp_str112_NE(info);
		else if (ne == columnRslt_disp_str113) doRslt_disp_str113_NE(info);
		else if (ne == columnRslt_disp_str114) doRslt_disp_str114_NE(info);
		else if (ne == columnRslt_disp_str115) doRslt_disp_str115_NE(info);
		else if (ne == columnRslt_disp_str116) doRslt_disp_str116_NE(info);
		else if (ne == columnRslt_disp_str117) doRslt_disp_str117_NE(info);
		else if (ne == columnRslt_disp_str118) doRslt_disp_str118_NE(info);
		else if (ne == columnRslt_disp_str119) doRslt_disp_str119_NE(info);
		else if (ne == columnRslt_disp_str120) doRslt_disp_str120_NE(info);
		else if (ne == columnRslt_disp_str121) doRslt_disp_str121_NE(info);
		else if (ne == columnRslt_disp_str122) doRslt_disp_str122_NE(info);
		else if (ne == columnRslt_disp_str123) doRslt_disp_str123_NE(info);
		else if (ne == columnRslt_disp_str124) doRslt_disp_str124_NE(info);
		else if (ne == columnRslt_disp_str125) doRslt_disp_str125_NE(info);
		else if (ne == columnRslt_disp_str126) doRslt_disp_str126_NE(info);
		else if (ne == columnRslt_disp_str127) doRslt_disp_str127_NE(info);
		else if (ne == columnRslt_disp_str128) doRslt_disp_str128_NE(info);
		else if (ne == columnRslt_disp_str129) doRslt_disp_str129_NE(info);
		else if (ne == columnRslt_disp_str130) doRslt_disp_str130_NE(info);
		else if (ne == columnRslt_disp_str131) doRslt_disp_str131_NE(info);
		else if (ne == columnRslt_disp_str132) doRslt_disp_str132_NE(info);
		else if (ne == columnRslt_disp_str133) doRslt_disp_str133_NE(info);
		else if (ne == columnRslt_disp_str134) doRslt_disp_str134_NE(info);
		else if (ne == columnRslt_disp_str135) doRslt_disp_str135_NE(info);
		else if (ne == columnRslt_disp_str136) doRslt_disp_str136_NE(info);
		else if (ne == columnRslt_disp_str137) doRslt_disp_str137_NE(info);
		else if (ne == columnRslt_disp_str138) doRslt_disp_str138_NE(info);
		else if (ne == columnRslt_disp_str139) doRslt_disp_str139_NE(info);
		else if (ne == columnRslt_disp_str140) doRslt_disp_str140_NE(info);
		else if (ne == columnRslt_disp_str141) doRslt_disp_str141_NE(info);
		else if (ne == columnRslt_disp_str142) doRslt_disp_str142_NE(info);
		else if (ne == columnRslt_disp_str143) doRslt_disp_str143_NE(info);
		else if (ne == columnRslt_disp_str144) doRslt_disp_str144_NE(info);
		else if (ne == columnRslt_disp_str145) doRslt_disp_str145_NE(info);
		else if (ne == columnRslt_disp_str146) doRslt_disp_str146_NE(info);
		else if (ne == columnRslt_disp_str147) doRslt_disp_str147_NE(info);
		else if (ne == columnRslt_disp_str148) doRslt_disp_str148_NE(info);
		else if (ne == columnRslt_disp_str149) doRslt_disp_str149_NE(info);
		else if (ne == columnRslt_disp_str150) doRslt_disp_str150_NE(info);
		else if (ne == columnRslt_disp_str151) doRslt_disp_str151_NE(info);
		else if (ne == columnRslt_disp_str152) doRslt_disp_str152_NE(info);
		else if (ne == columnRslt_disp_str153) doRslt_disp_str153_NE(info);
		else if (ne == columnRslt_disp_str154) doRslt_disp_str154_NE(info);
		else if (ne == columnRslt_disp_str155) doRslt_disp_str155_NE(info);
		else if (ne == columnRslt_disp_str156) doRslt_disp_str156_NE(info);
		else if (ne == columnRslt_disp_str157) doRslt_disp_str157_NE(info);
		else if (ne == columnRslt_disp_str158) doRslt_disp_str158_NE(info);
		else if (ne == columnRslt_disp_str159) doRslt_disp_str159_NE(info);
		else if (ne == columnRslt_disp_str160) doRslt_disp_str160_NE(info);
		else if (ne == columnRslt_disp_str161) doRslt_disp_str161_NE(info);
		else if (ne == columnRslt_disp_str162) doRslt_disp_str162_NE(info);
		else if (ne == columnRslt_disp_str163) doRslt_disp_str163_NE(info);
		else if (ne == columnRslt_disp_str164) doRslt_disp_str164_NE(info);
		else if (ne == columnRslt_disp_str165) doRslt_disp_str165_NE(info);
		else if (ne == columnRslt_disp_str166) doRslt_disp_str166_NE(info);
		else if (ne == columnRslt_disp_str167) doRslt_disp_str167_NE(info);
		else if (ne == columnRslt_disp_str168) doRslt_disp_str168_NE(info);
		else if (ne == columnRslt_disp_str169) doRslt_disp_str169_NE(info);
		else if (ne == columnRslt_disp_str170) doRslt_disp_str170_NE(info);
		else if (ne == columnRslt_disp_str171) doRslt_disp_str171_NE(info);
		else if (ne == columnRslt_disp_str172) doRslt_disp_str172_NE(info);
		else if (ne == columnRslt_disp_str173) doRslt_disp_str173_NE(info);
		else if (ne == columnRslt_disp_str174) doRslt_disp_str174_NE(info);
		else if (ne == columnRslt_disp_str175) doRslt_disp_str175_NE(info);
		else if (ne == columnRslt_disp_str176) doRslt_disp_str176_NE(info);
		else if (ne == columnRslt_disp_str177) doRslt_disp_str177_NE(info);
		else if (ne == columnRslt_disp_str178) doRslt_disp_str178_NE(info);
		else if (ne == columnRslt_disp_str179) doRslt_disp_str179_NE(info);
		else if (ne == columnRslt_disp_str180) doRslt_disp_str180_NE(info);
		else if (ne == columnRslt_disp_str181) doRslt_disp_str181_NE(info);
		else if (ne == columnRslt_disp_str182) doRslt_disp_str182_NE(info);
		else if (ne == columnRslt_disp_str183) doRslt_disp_str183_NE(info);
		else if (ne == columnRslt_disp_str184) doRslt_disp_str184_NE(info);
		else if (ne == columnRslt_disp_str185) doRslt_disp_str185_NE(info);
		else if (ne == columnRslt_disp_str186) doRslt_disp_str186_NE(info);
		else if (ne == columnRslt_disp_str187) doRslt_disp_str187_NE(info);
		else if (ne == columnRslt_disp_str188) doRslt_disp_str188_NE(info);
		else if (ne == columnRslt_disp_str189) doRslt_disp_str189_NE(info);
		else if (ne == columnRslt_disp_str190) doRslt_disp_str190_NE(info);
		else if (ne == columnRslt_disp_str191) doRslt_disp_str191_NE(info);
		else if (ne == columnRslt_disp_str192) doRslt_disp_str192_NE(info);
		else if (ne == columnRslt_disp_str193) doRslt_disp_str193_NE(info);
		else if (ne == columnRslt_disp_str194) doRslt_disp_str194_NE(info);
		else if (ne == columnRslt_disp_str195) doRslt_disp_str195_NE(info);
		else if (ne == columnRslt_disp_str196) doRslt_disp_str196_NE(info);
		else if (ne == columnRslt_disp_str197) doRslt_disp_str197_NE(info);
		else if (ne == columnRslt_disp_str198) doRslt_disp_str198_NE(info);
		else if (ne == columnRslt_disp_str199) doRslt_disp_str199_NE(info);
		else if (ne == columnRslt_disp_str200) doRslt_disp_str200_NE(info);
		else if (ne == columnRslt_disp_dt001) doRslt_disp_dt001_NE(info);
		else if (ne == columnRslt_disp_dt002) doRslt_disp_dt002_NE(info);
		else if (ne == columnRslt_disp_dt003) doRslt_disp_dt003_NE(info);
		else if (ne == columnRslt_disp_dt004) doRslt_disp_dt004_NE(info);
		else if (ne == columnRslt_disp_dt005) doRslt_disp_dt005_NE(info);
		else if (ne == columnRslt_disp_dt006) doRslt_disp_dt006_NE(info);
		else if (ne == columnRslt_disp_dt007) doRslt_disp_dt007_NE(info);
		else if (ne == columnRslt_disp_dt008) doRslt_disp_dt008_NE(info);
		else if (ne == columnRslt_disp_dt009) doRslt_disp_dt009_NE(info);
		else if (ne == columnRslt_disp_dt010) doRslt_disp_dt010_NE(info);
		else if (ne == columnRslt_disp_num001) doRslt_disp_num001_NE(info);
		else if (ne == columnRslt_disp_num002) doRslt_disp_num002_NE(info);
		else if (ne == columnRslt_disp_num003) doRslt_disp_num003_NE(info);
		else if (ne == columnRslt_disp_num004) doRslt_disp_num004_NE(info);
		else if (ne == columnRslt_disp_num005) doRslt_disp_num005_NE(info);
		else if (ne == columnRslt_disp_num006) doRslt_disp_num006_NE(info);
		else if (ne == columnRslt_disp_num007) doRslt_disp_num007_NE(info);
		else if (ne == columnRslt_disp_num008) doRslt_disp_num008_NE(info);
		else if (ne == columnRslt_disp_num009) doRslt_disp_num009_NE(info);
		else if (ne == columnRslt_disp_num010) doRslt_disp_num010_NE(info);
		else if (ne == RsltSml_exec_time) doRsltSml_exec_time_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bind]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bind_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str010_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str011_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str012_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str013_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str014_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str015_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str016_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str017_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str018_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str019_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str020_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str021_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str022_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str023_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str024_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str025_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str026_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str027_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str028_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str029_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str030_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str031_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str032_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str033_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str034_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str035_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str036_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str037_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str038_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str039_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str040_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str041_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str042_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str043_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str044_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str045_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str046_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str047_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str048_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str049_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str050_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str051_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str052_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str053_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str054_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str055_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str056_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str057_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str058_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str059_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str060_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str061_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str062_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str063_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str064_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str065_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str066_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str067_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str068_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str069_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str070_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str071_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str072_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str073_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str074_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str075_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str076_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str077_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str078_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str079_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str080_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str081_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str082_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str083_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str084_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str085_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str086_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str087_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str088_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str089_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str090_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str091_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str092_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str093_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str094_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str095_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str096_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str097_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str098_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str099_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str100]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str100_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str101]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str101_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str102]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str102_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str103]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str103_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str104]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str104_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str105]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str105_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str106]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str106_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str107]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str107_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str108]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str108_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str109]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str109_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str110]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str110_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str111]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str111_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str112]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str112_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str113]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str113_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str114]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str114_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str115]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str115_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str116]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str116_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str117]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str117_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str118]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str118_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str119]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str119_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str120]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str120_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str121]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str121_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str122]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str122_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str123]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str123_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str124]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str124_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str125]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str125_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str126]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str126_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str127]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str127_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str128]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str128_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str129]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str129_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str130]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str130_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str131]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str131_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str132]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str132_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str133]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str133_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str134]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str134_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str135]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str135_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str136]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str136_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str137]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str137_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str138]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str138_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str139]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str139_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str140]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str140_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str141]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str141_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str142]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str142_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str143]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str143_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str144]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str144_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str145]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str145_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str146]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str146_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str147]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str147_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str148]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str148_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str149]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str149_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str150]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str150_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str151]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str151_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str152]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str152_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str153]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str153_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str154]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str154_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str155]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str155_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str156]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str156_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str157]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str157_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str158]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str158_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str159]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str159_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str160]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str160_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str161]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str161_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str162]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str162_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str163]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str163_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str164]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str164_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str165]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str165_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str166]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str166_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str167]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str167_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str168]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str168_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str169]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str169_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str170]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str170_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str171]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str171_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str172]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str172_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str173]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str173_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str174]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str174_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str175]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str175_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str176]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str176_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str177]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str177_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str178]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str178_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str179]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str179_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str180]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str180_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str181]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str181_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str182]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str182_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str183]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str183_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str184]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str184_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str185]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str185_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str186]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str186_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str187]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str187_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str188]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str188_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str189]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str189_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str190]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str190_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str191]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str191_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str192]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str192_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str193]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str193_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str194]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str194_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str195]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str195_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str196]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str196_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str197]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str197_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str198]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str198_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str199]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str199_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str200]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str200_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt010_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num010_NE(MCEventInfo info){
	}

	/**
	 * [RsltSml]パネルの[exec_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSml_exec_time_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_biz_dat_id) doCnd_biz_dat_id_NX(info);
		else if (nx == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NX(info);
		else if (nx == Cnd_bind) doCnd_bind_NX(info);
		else if (nx == columnRslt_disp_str001) doRslt_disp_str001_NX(info);
		else if (nx == columnRslt_disp_str002) doRslt_disp_str002_NX(info);
		else if (nx == columnRslt_disp_str003) doRslt_disp_str003_NX(info);
		else if (nx == columnRslt_disp_str004) doRslt_disp_str004_NX(info);
		else if (nx == columnRslt_disp_str005) doRslt_disp_str005_NX(info);
		else if (nx == columnRslt_disp_str006) doRslt_disp_str006_NX(info);
		else if (nx == columnRslt_disp_str007) doRslt_disp_str007_NX(info);
		else if (nx == columnRslt_disp_str008) doRslt_disp_str008_NX(info);
		else if (nx == columnRslt_disp_str009) doRslt_disp_str009_NX(info);
		else if (nx == columnRslt_disp_str010) doRslt_disp_str010_NX(info);
		else if (nx == columnRslt_disp_str011) doRslt_disp_str011_NX(info);
		else if (nx == columnRslt_disp_str012) doRslt_disp_str012_NX(info);
		else if (nx == columnRslt_disp_str013) doRslt_disp_str013_NX(info);
		else if (nx == columnRslt_disp_str014) doRslt_disp_str014_NX(info);
		else if (nx == columnRslt_disp_str015) doRslt_disp_str015_NX(info);
		else if (nx == columnRslt_disp_str016) doRslt_disp_str016_NX(info);
		else if (nx == columnRslt_disp_str017) doRslt_disp_str017_NX(info);
		else if (nx == columnRslt_disp_str018) doRslt_disp_str018_NX(info);
		else if (nx == columnRslt_disp_str019) doRslt_disp_str019_NX(info);
		else if (nx == columnRslt_disp_str020) doRslt_disp_str020_NX(info);
		else if (nx == columnRslt_disp_str021) doRslt_disp_str021_NX(info);
		else if (nx == columnRslt_disp_str022) doRslt_disp_str022_NX(info);
		else if (nx == columnRslt_disp_str023) doRslt_disp_str023_NX(info);
		else if (nx == columnRslt_disp_str024) doRslt_disp_str024_NX(info);
		else if (nx == columnRslt_disp_str025) doRslt_disp_str025_NX(info);
		else if (nx == columnRslt_disp_str026) doRslt_disp_str026_NX(info);
		else if (nx == columnRslt_disp_str027) doRslt_disp_str027_NX(info);
		else if (nx == columnRslt_disp_str028) doRslt_disp_str028_NX(info);
		else if (nx == columnRslt_disp_str029) doRslt_disp_str029_NX(info);
		else if (nx == columnRslt_disp_str030) doRslt_disp_str030_NX(info);
		else if (nx == columnRslt_disp_str031) doRslt_disp_str031_NX(info);
		else if (nx == columnRslt_disp_str032) doRslt_disp_str032_NX(info);
		else if (nx == columnRslt_disp_str033) doRslt_disp_str033_NX(info);
		else if (nx == columnRslt_disp_str034) doRslt_disp_str034_NX(info);
		else if (nx == columnRslt_disp_str035) doRslt_disp_str035_NX(info);
		else if (nx == columnRslt_disp_str036) doRslt_disp_str036_NX(info);
		else if (nx == columnRslt_disp_str037) doRslt_disp_str037_NX(info);
		else if (nx == columnRslt_disp_str038) doRslt_disp_str038_NX(info);
		else if (nx == columnRslt_disp_str039) doRslt_disp_str039_NX(info);
		else if (nx == columnRslt_disp_str040) doRslt_disp_str040_NX(info);
		else if (nx == columnRslt_disp_str041) doRslt_disp_str041_NX(info);
		else if (nx == columnRslt_disp_str042) doRslt_disp_str042_NX(info);
		else if (nx == columnRslt_disp_str043) doRslt_disp_str043_NX(info);
		else if (nx == columnRslt_disp_str044) doRslt_disp_str044_NX(info);
		else if (nx == columnRslt_disp_str045) doRslt_disp_str045_NX(info);
		else if (nx == columnRslt_disp_str046) doRslt_disp_str046_NX(info);
		else if (nx == columnRslt_disp_str047) doRslt_disp_str047_NX(info);
		else if (nx == columnRslt_disp_str048) doRslt_disp_str048_NX(info);
		else if (nx == columnRslt_disp_str049) doRslt_disp_str049_NX(info);
		else if (nx == columnRslt_disp_str050) doRslt_disp_str050_NX(info);
		else if (nx == columnRslt_disp_str051) doRslt_disp_str051_NX(info);
		else if (nx == columnRslt_disp_str052) doRslt_disp_str052_NX(info);
		else if (nx == columnRslt_disp_str053) doRslt_disp_str053_NX(info);
		else if (nx == columnRslt_disp_str054) doRslt_disp_str054_NX(info);
		else if (nx == columnRslt_disp_str055) doRslt_disp_str055_NX(info);
		else if (nx == columnRslt_disp_str056) doRslt_disp_str056_NX(info);
		else if (nx == columnRslt_disp_str057) doRslt_disp_str057_NX(info);
		else if (nx == columnRslt_disp_str058) doRslt_disp_str058_NX(info);
		else if (nx == columnRslt_disp_str059) doRslt_disp_str059_NX(info);
		else if (nx == columnRslt_disp_str060) doRslt_disp_str060_NX(info);
		else if (nx == columnRslt_disp_str061) doRslt_disp_str061_NX(info);
		else if (nx == columnRslt_disp_str062) doRslt_disp_str062_NX(info);
		else if (nx == columnRslt_disp_str063) doRslt_disp_str063_NX(info);
		else if (nx == columnRslt_disp_str064) doRslt_disp_str064_NX(info);
		else if (nx == columnRslt_disp_str065) doRslt_disp_str065_NX(info);
		else if (nx == columnRslt_disp_str066) doRslt_disp_str066_NX(info);
		else if (nx == columnRslt_disp_str067) doRslt_disp_str067_NX(info);
		else if (nx == columnRslt_disp_str068) doRslt_disp_str068_NX(info);
		else if (nx == columnRslt_disp_str069) doRslt_disp_str069_NX(info);
		else if (nx == columnRslt_disp_str070) doRslt_disp_str070_NX(info);
		else if (nx == columnRslt_disp_str071) doRslt_disp_str071_NX(info);
		else if (nx == columnRslt_disp_str072) doRslt_disp_str072_NX(info);
		else if (nx == columnRslt_disp_str073) doRslt_disp_str073_NX(info);
		else if (nx == columnRslt_disp_str074) doRslt_disp_str074_NX(info);
		else if (nx == columnRslt_disp_str075) doRslt_disp_str075_NX(info);
		else if (nx == columnRslt_disp_str076) doRslt_disp_str076_NX(info);
		else if (nx == columnRslt_disp_str077) doRslt_disp_str077_NX(info);
		else if (nx == columnRslt_disp_str078) doRslt_disp_str078_NX(info);
		else if (nx == columnRslt_disp_str079) doRslt_disp_str079_NX(info);
		else if (nx == columnRslt_disp_str080) doRslt_disp_str080_NX(info);
		else if (nx == columnRslt_disp_str081) doRslt_disp_str081_NX(info);
		else if (nx == columnRslt_disp_str082) doRslt_disp_str082_NX(info);
		else if (nx == columnRslt_disp_str083) doRslt_disp_str083_NX(info);
		else if (nx == columnRslt_disp_str084) doRslt_disp_str084_NX(info);
		else if (nx == columnRslt_disp_str085) doRslt_disp_str085_NX(info);
		else if (nx == columnRslt_disp_str086) doRslt_disp_str086_NX(info);
		else if (nx == columnRslt_disp_str087) doRslt_disp_str087_NX(info);
		else if (nx == columnRslt_disp_str088) doRslt_disp_str088_NX(info);
		else if (nx == columnRslt_disp_str089) doRslt_disp_str089_NX(info);
		else if (nx == columnRslt_disp_str090) doRslt_disp_str090_NX(info);
		else if (nx == columnRslt_disp_str091) doRslt_disp_str091_NX(info);
		else if (nx == columnRslt_disp_str092) doRslt_disp_str092_NX(info);
		else if (nx == columnRslt_disp_str093) doRslt_disp_str093_NX(info);
		else if (nx == columnRslt_disp_str094) doRslt_disp_str094_NX(info);
		else if (nx == columnRslt_disp_str095) doRslt_disp_str095_NX(info);
		else if (nx == columnRslt_disp_str096) doRslt_disp_str096_NX(info);
		else if (nx == columnRslt_disp_str097) doRslt_disp_str097_NX(info);
		else if (nx == columnRslt_disp_str098) doRslt_disp_str098_NX(info);
		else if (nx == columnRslt_disp_str099) doRslt_disp_str099_NX(info);
		else if (nx == columnRslt_disp_str100) doRslt_disp_str100_NX(info);
		else if (nx == columnRslt_disp_str101) doRslt_disp_str101_NX(info);
		else if (nx == columnRslt_disp_str102) doRslt_disp_str102_NX(info);
		else if (nx == columnRslt_disp_str103) doRslt_disp_str103_NX(info);
		else if (nx == columnRslt_disp_str104) doRslt_disp_str104_NX(info);
		else if (nx == columnRslt_disp_str105) doRslt_disp_str105_NX(info);
		else if (nx == columnRslt_disp_str106) doRslt_disp_str106_NX(info);
		else if (nx == columnRslt_disp_str107) doRslt_disp_str107_NX(info);
		else if (nx == columnRslt_disp_str108) doRslt_disp_str108_NX(info);
		else if (nx == columnRslt_disp_str109) doRslt_disp_str109_NX(info);
		else if (nx == columnRslt_disp_str110) doRslt_disp_str110_NX(info);
		else if (nx == columnRslt_disp_str111) doRslt_disp_str111_NX(info);
		else if (nx == columnRslt_disp_str112) doRslt_disp_str112_NX(info);
		else if (nx == columnRslt_disp_str113) doRslt_disp_str113_NX(info);
		else if (nx == columnRslt_disp_str114) doRslt_disp_str114_NX(info);
		else if (nx == columnRslt_disp_str115) doRslt_disp_str115_NX(info);
		else if (nx == columnRslt_disp_str116) doRslt_disp_str116_NX(info);
		else if (nx == columnRslt_disp_str117) doRslt_disp_str117_NX(info);
		else if (nx == columnRslt_disp_str118) doRslt_disp_str118_NX(info);
		else if (nx == columnRslt_disp_str119) doRslt_disp_str119_NX(info);
		else if (nx == columnRslt_disp_str120) doRslt_disp_str120_NX(info);
		else if (nx == columnRslt_disp_str121) doRslt_disp_str121_NX(info);
		else if (nx == columnRslt_disp_str122) doRslt_disp_str122_NX(info);
		else if (nx == columnRslt_disp_str123) doRslt_disp_str123_NX(info);
		else if (nx == columnRslt_disp_str124) doRslt_disp_str124_NX(info);
		else if (nx == columnRslt_disp_str125) doRslt_disp_str125_NX(info);
		else if (nx == columnRslt_disp_str126) doRslt_disp_str126_NX(info);
		else if (nx == columnRslt_disp_str127) doRslt_disp_str127_NX(info);
		else if (nx == columnRslt_disp_str128) doRslt_disp_str128_NX(info);
		else if (nx == columnRslt_disp_str129) doRslt_disp_str129_NX(info);
		else if (nx == columnRslt_disp_str130) doRslt_disp_str130_NX(info);
		else if (nx == columnRslt_disp_str131) doRslt_disp_str131_NX(info);
		else if (nx == columnRslt_disp_str132) doRslt_disp_str132_NX(info);
		else if (nx == columnRslt_disp_str133) doRslt_disp_str133_NX(info);
		else if (nx == columnRslt_disp_str134) doRslt_disp_str134_NX(info);
		else if (nx == columnRslt_disp_str135) doRslt_disp_str135_NX(info);
		else if (nx == columnRslt_disp_str136) doRslt_disp_str136_NX(info);
		else if (nx == columnRslt_disp_str137) doRslt_disp_str137_NX(info);
		else if (nx == columnRslt_disp_str138) doRslt_disp_str138_NX(info);
		else if (nx == columnRslt_disp_str139) doRslt_disp_str139_NX(info);
		else if (nx == columnRslt_disp_str140) doRslt_disp_str140_NX(info);
		else if (nx == columnRslt_disp_str141) doRslt_disp_str141_NX(info);
		else if (nx == columnRslt_disp_str142) doRslt_disp_str142_NX(info);
		else if (nx == columnRslt_disp_str143) doRslt_disp_str143_NX(info);
		else if (nx == columnRslt_disp_str144) doRslt_disp_str144_NX(info);
		else if (nx == columnRslt_disp_str145) doRslt_disp_str145_NX(info);
		else if (nx == columnRslt_disp_str146) doRslt_disp_str146_NX(info);
		else if (nx == columnRslt_disp_str147) doRslt_disp_str147_NX(info);
		else if (nx == columnRslt_disp_str148) doRslt_disp_str148_NX(info);
		else if (nx == columnRslt_disp_str149) doRslt_disp_str149_NX(info);
		else if (nx == columnRslt_disp_str150) doRslt_disp_str150_NX(info);
		else if (nx == columnRslt_disp_str151) doRslt_disp_str151_NX(info);
		else if (nx == columnRslt_disp_str152) doRslt_disp_str152_NX(info);
		else if (nx == columnRslt_disp_str153) doRslt_disp_str153_NX(info);
		else if (nx == columnRslt_disp_str154) doRslt_disp_str154_NX(info);
		else if (nx == columnRslt_disp_str155) doRslt_disp_str155_NX(info);
		else if (nx == columnRslt_disp_str156) doRslt_disp_str156_NX(info);
		else if (nx == columnRslt_disp_str157) doRslt_disp_str157_NX(info);
		else if (nx == columnRslt_disp_str158) doRslt_disp_str158_NX(info);
		else if (nx == columnRslt_disp_str159) doRslt_disp_str159_NX(info);
		else if (nx == columnRslt_disp_str160) doRslt_disp_str160_NX(info);
		else if (nx == columnRslt_disp_str161) doRslt_disp_str161_NX(info);
		else if (nx == columnRslt_disp_str162) doRslt_disp_str162_NX(info);
		else if (nx == columnRslt_disp_str163) doRslt_disp_str163_NX(info);
		else if (nx == columnRslt_disp_str164) doRslt_disp_str164_NX(info);
		else if (nx == columnRslt_disp_str165) doRslt_disp_str165_NX(info);
		else if (nx == columnRslt_disp_str166) doRslt_disp_str166_NX(info);
		else if (nx == columnRslt_disp_str167) doRslt_disp_str167_NX(info);
		else if (nx == columnRslt_disp_str168) doRslt_disp_str168_NX(info);
		else if (nx == columnRslt_disp_str169) doRslt_disp_str169_NX(info);
		else if (nx == columnRslt_disp_str170) doRslt_disp_str170_NX(info);
		else if (nx == columnRslt_disp_str171) doRslt_disp_str171_NX(info);
		else if (nx == columnRslt_disp_str172) doRslt_disp_str172_NX(info);
		else if (nx == columnRslt_disp_str173) doRslt_disp_str173_NX(info);
		else if (nx == columnRslt_disp_str174) doRslt_disp_str174_NX(info);
		else if (nx == columnRslt_disp_str175) doRslt_disp_str175_NX(info);
		else if (nx == columnRslt_disp_str176) doRslt_disp_str176_NX(info);
		else if (nx == columnRslt_disp_str177) doRslt_disp_str177_NX(info);
		else if (nx == columnRslt_disp_str178) doRslt_disp_str178_NX(info);
		else if (nx == columnRslt_disp_str179) doRslt_disp_str179_NX(info);
		else if (nx == columnRslt_disp_str180) doRslt_disp_str180_NX(info);
		else if (nx == columnRslt_disp_str181) doRslt_disp_str181_NX(info);
		else if (nx == columnRslt_disp_str182) doRslt_disp_str182_NX(info);
		else if (nx == columnRslt_disp_str183) doRslt_disp_str183_NX(info);
		else if (nx == columnRslt_disp_str184) doRslt_disp_str184_NX(info);
		else if (nx == columnRslt_disp_str185) doRslt_disp_str185_NX(info);
		else if (nx == columnRslt_disp_str186) doRslt_disp_str186_NX(info);
		else if (nx == columnRslt_disp_str187) doRslt_disp_str187_NX(info);
		else if (nx == columnRslt_disp_str188) doRslt_disp_str188_NX(info);
		else if (nx == columnRslt_disp_str189) doRslt_disp_str189_NX(info);
		else if (nx == columnRslt_disp_str190) doRslt_disp_str190_NX(info);
		else if (nx == columnRslt_disp_str191) doRslt_disp_str191_NX(info);
		else if (nx == columnRslt_disp_str192) doRslt_disp_str192_NX(info);
		else if (nx == columnRslt_disp_str193) doRslt_disp_str193_NX(info);
		else if (nx == columnRslt_disp_str194) doRslt_disp_str194_NX(info);
		else if (nx == columnRslt_disp_str195) doRslt_disp_str195_NX(info);
		else if (nx == columnRslt_disp_str196) doRslt_disp_str196_NX(info);
		else if (nx == columnRslt_disp_str197) doRslt_disp_str197_NX(info);
		else if (nx == columnRslt_disp_str198) doRslt_disp_str198_NX(info);
		else if (nx == columnRslt_disp_str199) doRslt_disp_str199_NX(info);
		else if (nx == columnRslt_disp_str200) doRslt_disp_str200_NX(info);
		else if (nx == columnRslt_disp_dt001) doRslt_disp_dt001_NX(info);
		else if (nx == columnRslt_disp_dt002) doRslt_disp_dt002_NX(info);
		else if (nx == columnRslt_disp_dt003) doRslt_disp_dt003_NX(info);
		else if (nx == columnRslt_disp_dt004) doRslt_disp_dt004_NX(info);
		else if (nx == columnRslt_disp_dt005) doRslt_disp_dt005_NX(info);
		else if (nx == columnRslt_disp_dt006) doRslt_disp_dt006_NX(info);
		else if (nx == columnRslt_disp_dt007) doRslt_disp_dt007_NX(info);
		else if (nx == columnRslt_disp_dt008) doRslt_disp_dt008_NX(info);
		else if (nx == columnRslt_disp_dt009) doRslt_disp_dt009_NX(info);
		else if (nx == columnRslt_disp_dt010) doRslt_disp_dt010_NX(info);
		else if (nx == columnRslt_disp_num001) doRslt_disp_num001_NX(info);
		else if (nx == columnRslt_disp_num002) doRslt_disp_num002_NX(info);
		else if (nx == columnRslt_disp_num003) doRslt_disp_num003_NX(info);
		else if (nx == columnRslt_disp_num004) doRslt_disp_num004_NX(info);
		else if (nx == columnRslt_disp_num005) doRslt_disp_num005_NX(info);
		else if (nx == columnRslt_disp_num006) doRslt_disp_num006_NX(info);
		else if (nx == columnRslt_disp_num007) doRslt_disp_num007_NX(info);
		else if (nx == columnRslt_disp_num008) doRslt_disp_num008_NX(info);
		else if (nx == columnRslt_disp_num009) doRslt_disp_num009_NX(info);
		else if (nx == columnRslt_disp_num010) doRslt_disp_num010_NX(info);
		else if (nx == RsltSml_exec_time) doRsltSml_exec_time_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bind]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bind_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str010_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str011_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str012_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str013_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str014_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str015_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str016_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str017_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str018_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str019_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str020_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str021_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str022_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str023_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str024_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str025_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str026_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str027_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str028_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str029_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str030_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str031_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str032_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str033_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str034_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str035_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str036_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str037_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str038_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str039_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str040_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str041_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str042_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str043_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str044_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str045_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str046_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str047_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str048_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str049_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str050_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str051_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str052_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str053_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str054_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str055_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str056_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str057_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str058_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str059_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str060_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str061_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str062_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str063_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str064_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str065_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str066_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str067_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str068_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str069_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str070_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str071_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str072_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str073_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str074_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str075_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str076_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str077_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str078_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str079_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str080_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str081_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str082_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str083_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str084_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str085_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str086_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str087_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str088_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str089_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str090_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str091_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str092_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str093_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str094_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str095_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str096_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str097_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str098_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str099_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str100]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str100_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str101]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str101_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str102]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str102_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str103]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str103_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str104]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str104_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str105]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str105_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str106]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str106_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str107]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str107_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str108]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str108_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str109]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str109_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str110]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str110_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str111]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str111_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str112]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str112_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str113]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str113_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str114]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str114_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str115]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str115_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str116]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str116_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str117]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str117_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str118]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str118_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str119]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str119_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str120]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str120_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str121]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str121_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str122]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str122_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str123]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str123_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str124]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str124_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str125]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str125_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str126]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str126_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str127]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str127_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str128]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str128_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str129]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str129_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str130]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str130_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str131]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str131_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str132]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str132_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str133]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str133_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str134]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str134_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str135]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str135_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str136]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str136_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str137]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str137_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str138]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str138_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str139]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str139_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str140]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str140_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str141]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str141_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str142]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str142_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str143]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str143_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str144]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str144_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str145]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str145_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str146]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str146_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str147]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str147_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str148]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str148_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str149]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str149_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str150]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str150_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str151]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str151_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str152]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str152_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str153]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str153_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str154]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str154_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str155]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str155_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str156]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str156_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str157]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str157_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str158]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str158_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str159]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str159_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str160]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str160_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str161]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str161_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str162]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str162_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str163]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str163_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str164]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str164_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str165]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str165_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str166]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str166_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str167]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str167_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str168]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str168_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str169]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str169_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str170]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str170_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str171]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str171_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str172]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str172_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str173]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str173_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str174]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str174_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str175]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str175_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str176]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str176_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str177]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str177_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str178]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str178_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str179]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str179_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str180]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str180_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str181]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str181_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str182]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str182_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str183]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str183_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str184]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str184_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str185]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str185_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str186]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str186_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str187]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str187_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str188]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str188_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str189]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str189_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str190]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str190_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str191]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str191_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str192]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str192_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str193]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str193_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str194]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str194_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str195]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str195_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str196]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str196_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str197]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str197_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str198]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str198_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str199]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str199_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str200]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str200_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt010_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num010_NX(MCEventInfo info){
	}

	/**
	 * [RsltSml]パネルの[exec_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSml_exec_time_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_biz_dat_id) doCnd_biz_dat_id_LC(info);
		else if (lc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_LC(info);
		else if (lc == Cnd_bind) doCnd_bind_LC(info);
		else if (lc == columnRslt_disp_str001) doRslt_disp_str001_LC(info);
		else if (lc == columnRslt_disp_str002) doRslt_disp_str002_LC(info);
		else if (lc == columnRslt_disp_str003) doRslt_disp_str003_LC(info);
		else if (lc == columnRslt_disp_str004) doRslt_disp_str004_LC(info);
		else if (lc == columnRslt_disp_str005) doRslt_disp_str005_LC(info);
		else if (lc == columnRslt_disp_str006) doRslt_disp_str006_LC(info);
		else if (lc == columnRslt_disp_str007) doRslt_disp_str007_LC(info);
		else if (lc == columnRslt_disp_str008) doRslt_disp_str008_LC(info);
		else if (lc == columnRslt_disp_str009) doRslt_disp_str009_LC(info);
		else if (lc == columnRslt_disp_str010) doRslt_disp_str010_LC(info);
		else if (lc == columnRslt_disp_str011) doRslt_disp_str011_LC(info);
		else if (lc == columnRslt_disp_str012) doRslt_disp_str012_LC(info);
		else if (lc == columnRslt_disp_str013) doRslt_disp_str013_LC(info);
		else if (lc == columnRslt_disp_str014) doRslt_disp_str014_LC(info);
		else if (lc == columnRslt_disp_str015) doRslt_disp_str015_LC(info);
		else if (lc == columnRslt_disp_str016) doRslt_disp_str016_LC(info);
		else if (lc == columnRslt_disp_str017) doRslt_disp_str017_LC(info);
		else if (lc == columnRslt_disp_str018) doRslt_disp_str018_LC(info);
		else if (lc == columnRslt_disp_str019) doRslt_disp_str019_LC(info);
		else if (lc == columnRslt_disp_str020) doRslt_disp_str020_LC(info);
		else if (lc == columnRslt_disp_str021) doRslt_disp_str021_LC(info);
		else if (lc == columnRslt_disp_str022) doRslt_disp_str022_LC(info);
		else if (lc == columnRslt_disp_str023) doRslt_disp_str023_LC(info);
		else if (lc == columnRslt_disp_str024) doRslt_disp_str024_LC(info);
		else if (lc == columnRslt_disp_str025) doRslt_disp_str025_LC(info);
		else if (lc == columnRslt_disp_str026) doRslt_disp_str026_LC(info);
		else if (lc == columnRslt_disp_str027) doRslt_disp_str027_LC(info);
		else if (lc == columnRslt_disp_str028) doRslt_disp_str028_LC(info);
		else if (lc == columnRslt_disp_str029) doRslt_disp_str029_LC(info);
		else if (lc == columnRslt_disp_str030) doRslt_disp_str030_LC(info);
		else if (lc == columnRslt_disp_str031) doRslt_disp_str031_LC(info);
		else if (lc == columnRslt_disp_str032) doRslt_disp_str032_LC(info);
		else if (lc == columnRslt_disp_str033) doRslt_disp_str033_LC(info);
		else if (lc == columnRslt_disp_str034) doRslt_disp_str034_LC(info);
		else if (lc == columnRslt_disp_str035) doRslt_disp_str035_LC(info);
		else if (lc == columnRslt_disp_str036) doRslt_disp_str036_LC(info);
		else if (lc == columnRslt_disp_str037) doRslt_disp_str037_LC(info);
		else if (lc == columnRslt_disp_str038) doRslt_disp_str038_LC(info);
		else if (lc == columnRslt_disp_str039) doRslt_disp_str039_LC(info);
		else if (lc == columnRslt_disp_str040) doRslt_disp_str040_LC(info);
		else if (lc == columnRslt_disp_str041) doRslt_disp_str041_LC(info);
		else if (lc == columnRslt_disp_str042) doRslt_disp_str042_LC(info);
		else if (lc == columnRslt_disp_str043) doRslt_disp_str043_LC(info);
		else if (lc == columnRslt_disp_str044) doRslt_disp_str044_LC(info);
		else if (lc == columnRslt_disp_str045) doRslt_disp_str045_LC(info);
		else if (lc == columnRslt_disp_str046) doRslt_disp_str046_LC(info);
		else if (lc == columnRslt_disp_str047) doRslt_disp_str047_LC(info);
		else if (lc == columnRslt_disp_str048) doRslt_disp_str048_LC(info);
		else if (lc == columnRslt_disp_str049) doRslt_disp_str049_LC(info);
		else if (lc == columnRslt_disp_str050) doRslt_disp_str050_LC(info);
		else if (lc == columnRslt_disp_str051) doRslt_disp_str051_LC(info);
		else if (lc == columnRslt_disp_str052) doRslt_disp_str052_LC(info);
		else if (lc == columnRslt_disp_str053) doRslt_disp_str053_LC(info);
		else if (lc == columnRslt_disp_str054) doRslt_disp_str054_LC(info);
		else if (lc == columnRslt_disp_str055) doRslt_disp_str055_LC(info);
		else if (lc == columnRslt_disp_str056) doRslt_disp_str056_LC(info);
		else if (lc == columnRslt_disp_str057) doRslt_disp_str057_LC(info);
		else if (lc == columnRslt_disp_str058) doRslt_disp_str058_LC(info);
		else if (lc == columnRslt_disp_str059) doRslt_disp_str059_LC(info);
		else if (lc == columnRslt_disp_str060) doRslt_disp_str060_LC(info);
		else if (lc == columnRslt_disp_str061) doRslt_disp_str061_LC(info);
		else if (lc == columnRslt_disp_str062) doRslt_disp_str062_LC(info);
		else if (lc == columnRslt_disp_str063) doRslt_disp_str063_LC(info);
		else if (lc == columnRslt_disp_str064) doRslt_disp_str064_LC(info);
		else if (lc == columnRslt_disp_str065) doRslt_disp_str065_LC(info);
		else if (lc == columnRslt_disp_str066) doRslt_disp_str066_LC(info);
		else if (lc == columnRslt_disp_str067) doRslt_disp_str067_LC(info);
		else if (lc == columnRslt_disp_str068) doRslt_disp_str068_LC(info);
		else if (lc == columnRslt_disp_str069) doRslt_disp_str069_LC(info);
		else if (lc == columnRslt_disp_str070) doRslt_disp_str070_LC(info);
		else if (lc == columnRslt_disp_str071) doRslt_disp_str071_LC(info);
		else if (lc == columnRslt_disp_str072) doRslt_disp_str072_LC(info);
		else if (lc == columnRslt_disp_str073) doRslt_disp_str073_LC(info);
		else if (lc == columnRslt_disp_str074) doRslt_disp_str074_LC(info);
		else if (lc == columnRslt_disp_str075) doRslt_disp_str075_LC(info);
		else if (lc == columnRslt_disp_str076) doRslt_disp_str076_LC(info);
		else if (lc == columnRslt_disp_str077) doRslt_disp_str077_LC(info);
		else if (lc == columnRslt_disp_str078) doRslt_disp_str078_LC(info);
		else if (lc == columnRslt_disp_str079) doRslt_disp_str079_LC(info);
		else if (lc == columnRslt_disp_str080) doRslt_disp_str080_LC(info);
		else if (lc == columnRslt_disp_str081) doRslt_disp_str081_LC(info);
		else if (lc == columnRslt_disp_str082) doRslt_disp_str082_LC(info);
		else if (lc == columnRslt_disp_str083) doRslt_disp_str083_LC(info);
		else if (lc == columnRslt_disp_str084) doRslt_disp_str084_LC(info);
		else if (lc == columnRslt_disp_str085) doRslt_disp_str085_LC(info);
		else if (lc == columnRslt_disp_str086) doRslt_disp_str086_LC(info);
		else if (lc == columnRslt_disp_str087) doRslt_disp_str087_LC(info);
		else if (lc == columnRslt_disp_str088) doRslt_disp_str088_LC(info);
		else if (lc == columnRslt_disp_str089) doRslt_disp_str089_LC(info);
		else if (lc == columnRslt_disp_str090) doRslt_disp_str090_LC(info);
		else if (lc == columnRslt_disp_str091) doRslt_disp_str091_LC(info);
		else if (lc == columnRslt_disp_str092) doRslt_disp_str092_LC(info);
		else if (lc == columnRslt_disp_str093) doRslt_disp_str093_LC(info);
		else if (lc == columnRslt_disp_str094) doRslt_disp_str094_LC(info);
		else if (lc == columnRslt_disp_str095) doRslt_disp_str095_LC(info);
		else if (lc == columnRslt_disp_str096) doRslt_disp_str096_LC(info);
		else if (lc == columnRslt_disp_str097) doRslt_disp_str097_LC(info);
		else if (lc == columnRslt_disp_str098) doRslt_disp_str098_LC(info);
		else if (lc == columnRslt_disp_str099) doRslt_disp_str099_LC(info);
		else if (lc == columnRslt_disp_str100) doRslt_disp_str100_LC(info);
		else if (lc == columnRslt_disp_str101) doRslt_disp_str101_LC(info);
		else if (lc == columnRslt_disp_str102) doRslt_disp_str102_LC(info);
		else if (lc == columnRslt_disp_str103) doRslt_disp_str103_LC(info);
		else if (lc == columnRslt_disp_str104) doRslt_disp_str104_LC(info);
		else if (lc == columnRslt_disp_str105) doRslt_disp_str105_LC(info);
		else if (lc == columnRslt_disp_str106) doRslt_disp_str106_LC(info);
		else if (lc == columnRslt_disp_str107) doRslt_disp_str107_LC(info);
		else if (lc == columnRslt_disp_str108) doRslt_disp_str108_LC(info);
		else if (lc == columnRslt_disp_str109) doRslt_disp_str109_LC(info);
		else if (lc == columnRslt_disp_str110) doRslt_disp_str110_LC(info);
		else if (lc == columnRslt_disp_str111) doRslt_disp_str111_LC(info);
		else if (lc == columnRslt_disp_str112) doRslt_disp_str112_LC(info);
		else if (lc == columnRslt_disp_str113) doRslt_disp_str113_LC(info);
		else if (lc == columnRslt_disp_str114) doRslt_disp_str114_LC(info);
		else if (lc == columnRslt_disp_str115) doRslt_disp_str115_LC(info);
		else if (lc == columnRslt_disp_str116) doRslt_disp_str116_LC(info);
		else if (lc == columnRslt_disp_str117) doRslt_disp_str117_LC(info);
		else if (lc == columnRslt_disp_str118) doRslt_disp_str118_LC(info);
		else if (lc == columnRslt_disp_str119) doRslt_disp_str119_LC(info);
		else if (lc == columnRslt_disp_str120) doRslt_disp_str120_LC(info);
		else if (lc == columnRslt_disp_str121) doRslt_disp_str121_LC(info);
		else if (lc == columnRslt_disp_str122) doRslt_disp_str122_LC(info);
		else if (lc == columnRslt_disp_str123) doRslt_disp_str123_LC(info);
		else if (lc == columnRslt_disp_str124) doRslt_disp_str124_LC(info);
		else if (lc == columnRslt_disp_str125) doRslt_disp_str125_LC(info);
		else if (lc == columnRslt_disp_str126) doRslt_disp_str126_LC(info);
		else if (lc == columnRslt_disp_str127) doRslt_disp_str127_LC(info);
		else if (lc == columnRslt_disp_str128) doRslt_disp_str128_LC(info);
		else if (lc == columnRslt_disp_str129) doRslt_disp_str129_LC(info);
		else if (lc == columnRslt_disp_str130) doRslt_disp_str130_LC(info);
		else if (lc == columnRslt_disp_str131) doRslt_disp_str131_LC(info);
		else if (lc == columnRslt_disp_str132) doRslt_disp_str132_LC(info);
		else if (lc == columnRslt_disp_str133) doRslt_disp_str133_LC(info);
		else if (lc == columnRslt_disp_str134) doRslt_disp_str134_LC(info);
		else if (lc == columnRslt_disp_str135) doRslt_disp_str135_LC(info);
		else if (lc == columnRslt_disp_str136) doRslt_disp_str136_LC(info);
		else if (lc == columnRslt_disp_str137) doRslt_disp_str137_LC(info);
		else if (lc == columnRslt_disp_str138) doRslt_disp_str138_LC(info);
		else if (lc == columnRslt_disp_str139) doRslt_disp_str139_LC(info);
		else if (lc == columnRslt_disp_str140) doRslt_disp_str140_LC(info);
		else if (lc == columnRslt_disp_str141) doRslt_disp_str141_LC(info);
		else if (lc == columnRslt_disp_str142) doRslt_disp_str142_LC(info);
		else if (lc == columnRslt_disp_str143) doRslt_disp_str143_LC(info);
		else if (lc == columnRslt_disp_str144) doRslt_disp_str144_LC(info);
		else if (lc == columnRslt_disp_str145) doRslt_disp_str145_LC(info);
		else if (lc == columnRslt_disp_str146) doRslt_disp_str146_LC(info);
		else if (lc == columnRslt_disp_str147) doRslt_disp_str147_LC(info);
		else if (lc == columnRslt_disp_str148) doRslt_disp_str148_LC(info);
		else if (lc == columnRslt_disp_str149) doRslt_disp_str149_LC(info);
		else if (lc == columnRslt_disp_str150) doRslt_disp_str150_LC(info);
		else if (lc == columnRslt_disp_str151) doRslt_disp_str151_LC(info);
		else if (lc == columnRslt_disp_str152) doRslt_disp_str152_LC(info);
		else if (lc == columnRslt_disp_str153) doRslt_disp_str153_LC(info);
		else if (lc == columnRslt_disp_str154) doRslt_disp_str154_LC(info);
		else if (lc == columnRslt_disp_str155) doRslt_disp_str155_LC(info);
		else if (lc == columnRslt_disp_str156) doRslt_disp_str156_LC(info);
		else if (lc == columnRslt_disp_str157) doRslt_disp_str157_LC(info);
		else if (lc == columnRslt_disp_str158) doRslt_disp_str158_LC(info);
		else if (lc == columnRslt_disp_str159) doRslt_disp_str159_LC(info);
		else if (lc == columnRslt_disp_str160) doRslt_disp_str160_LC(info);
		else if (lc == columnRslt_disp_str161) doRslt_disp_str161_LC(info);
		else if (lc == columnRslt_disp_str162) doRslt_disp_str162_LC(info);
		else if (lc == columnRslt_disp_str163) doRslt_disp_str163_LC(info);
		else if (lc == columnRslt_disp_str164) doRslt_disp_str164_LC(info);
		else if (lc == columnRslt_disp_str165) doRslt_disp_str165_LC(info);
		else if (lc == columnRslt_disp_str166) doRslt_disp_str166_LC(info);
		else if (lc == columnRslt_disp_str167) doRslt_disp_str167_LC(info);
		else if (lc == columnRslt_disp_str168) doRslt_disp_str168_LC(info);
		else if (lc == columnRslt_disp_str169) doRslt_disp_str169_LC(info);
		else if (lc == columnRslt_disp_str170) doRslt_disp_str170_LC(info);
		else if (lc == columnRslt_disp_str171) doRslt_disp_str171_LC(info);
		else if (lc == columnRslt_disp_str172) doRslt_disp_str172_LC(info);
		else if (lc == columnRslt_disp_str173) doRslt_disp_str173_LC(info);
		else if (lc == columnRslt_disp_str174) doRslt_disp_str174_LC(info);
		else if (lc == columnRslt_disp_str175) doRslt_disp_str175_LC(info);
		else if (lc == columnRslt_disp_str176) doRslt_disp_str176_LC(info);
		else if (lc == columnRslt_disp_str177) doRslt_disp_str177_LC(info);
		else if (lc == columnRslt_disp_str178) doRslt_disp_str178_LC(info);
		else if (lc == columnRslt_disp_str179) doRslt_disp_str179_LC(info);
		else if (lc == columnRslt_disp_str180) doRslt_disp_str180_LC(info);
		else if (lc == columnRslt_disp_str181) doRslt_disp_str181_LC(info);
		else if (lc == columnRslt_disp_str182) doRslt_disp_str182_LC(info);
		else if (lc == columnRslt_disp_str183) doRslt_disp_str183_LC(info);
		else if (lc == columnRslt_disp_str184) doRslt_disp_str184_LC(info);
		else if (lc == columnRslt_disp_str185) doRslt_disp_str185_LC(info);
		else if (lc == columnRslt_disp_str186) doRslt_disp_str186_LC(info);
		else if (lc == columnRslt_disp_str187) doRslt_disp_str187_LC(info);
		else if (lc == columnRslt_disp_str188) doRslt_disp_str188_LC(info);
		else if (lc == columnRslt_disp_str189) doRslt_disp_str189_LC(info);
		else if (lc == columnRslt_disp_str190) doRslt_disp_str190_LC(info);
		else if (lc == columnRslt_disp_str191) doRslt_disp_str191_LC(info);
		else if (lc == columnRslt_disp_str192) doRslt_disp_str192_LC(info);
		else if (lc == columnRslt_disp_str193) doRslt_disp_str193_LC(info);
		else if (lc == columnRslt_disp_str194) doRslt_disp_str194_LC(info);
		else if (lc == columnRslt_disp_str195) doRslt_disp_str195_LC(info);
		else if (lc == columnRslt_disp_str196) doRslt_disp_str196_LC(info);
		else if (lc == columnRslt_disp_str197) doRslt_disp_str197_LC(info);
		else if (lc == columnRslt_disp_str198) doRslt_disp_str198_LC(info);
		else if (lc == columnRslt_disp_str199) doRslt_disp_str199_LC(info);
		else if (lc == columnRslt_disp_str200) doRslt_disp_str200_LC(info);
		else if (lc == columnRslt_disp_dt001) doRslt_disp_dt001_LC(info);
		else if (lc == columnRslt_disp_dt002) doRslt_disp_dt002_LC(info);
		else if (lc == columnRslt_disp_dt003) doRslt_disp_dt003_LC(info);
		else if (lc == columnRslt_disp_dt004) doRslt_disp_dt004_LC(info);
		else if (lc == columnRslt_disp_dt005) doRslt_disp_dt005_LC(info);
		else if (lc == columnRslt_disp_dt006) doRslt_disp_dt006_LC(info);
		else if (lc == columnRslt_disp_dt007) doRslt_disp_dt007_LC(info);
		else if (lc == columnRslt_disp_dt008) doRslt_disp_dt008_LC(info);
		else if (lc == columnRslt_disp_dt009) doRslt_disp_dt009_LC(info);
		else if (lc == columnRslt_disp_dt010) doRslt_disp_dt010_LC(info);
		else if (lc == columnRslt_disp_num001) doRslt_disp_num001_LC(info);
		else if (lc == columnRslt_disp_num002) doRslt_disp_num002_LC(info);
		else if (lc == columnRslt_disp_num003) doRslt_disp_num003_LC(info);
		else if (lc == columnRslt_disp_num004) doRslt_disp_num004_LC(info);
		else if (lc == columnRslt_disp_num005) doRslt_disp_num005_LC(info);
		else if (lc == columnRslt_disp_num006) doRslt_disp_num006_LC(info);
		else if (lc == columnRslt_disp_num007) doRslt_disp_num007_LC(info);
		else if (lc == columnRslt_disp_num008) doRslt_disp_num008_LC(info);
		else if (lc == columnRslt_disp_num009) doRslt_disp_num009_LC(info);
		else if (lc == columnRslt_disp_num010) doRslt_disp_num010_LC(info);
		else if (lc == RsltSml_exec_time) doRsltSml_exec_time_LC(info);
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bind]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bind_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str010_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str011_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str012_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str013_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str014_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str015_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str016_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str017_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str018_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str019_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str020_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str021_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str022_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str023_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str024_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str025_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str026_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str027_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str028_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str029_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str030_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str031_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str032_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str033_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str034_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str035_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str036_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str037_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str038_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str039_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str040_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str041_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str042_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str043_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str044_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str045_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str046_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str047_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str048_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str049_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str050_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str051_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str052_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str053_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str054_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str055_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str056_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str057_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str058_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str059_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str060_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str061_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str062_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str063_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str064_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str065_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str066_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str067_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str068_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str069_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str070_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str071_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str072_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str073_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str074_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str075_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str076_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str077_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str078_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str079_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str080_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str081_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str082_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str083_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str084_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str085_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str086_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str087_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str088_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str089_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str090_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str091_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str092_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str093_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str094_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str095_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str096_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str097_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str098_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str099_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str100]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str100_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str101]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str101_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str102]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str102_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str103]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str103_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str104]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str104_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str105]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str105_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str106]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str106_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str107]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str107_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str108]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str108_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str109]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str109_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str110]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str110_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str111]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str111_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str112]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str112_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str113]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str113_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str114]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str114_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str115]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str115_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str116]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str116_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str117]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str117_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str118]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str118_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str119]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str119_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str120]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str120_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str121]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str121_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str122]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str122_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str123]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str123_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str124]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str124_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str125]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str125_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str126]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str126_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str127]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str127_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str128]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str128_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str129]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str129_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str130]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str130_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str131]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str131_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str132]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str132_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str133]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str133_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str134]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str134_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str135]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str135_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str136]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str136_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str137]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str137_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str138]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str138_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str139]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str139_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str140]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str140_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str141]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str141_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str142]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str142_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str143]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str143_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str144]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str144_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str145]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str145_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str146]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str146_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str147]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str147_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str148]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str148_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str149]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str149_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str150]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str150_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str151]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str151_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str152]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str152_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str153]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str153_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str154]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str154_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str155]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str155_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str156]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str156_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str157]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str157_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str158]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str158_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str159]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str159_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str160]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str160_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str161]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str161_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str162]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str162_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str163]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str163_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str164]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str164_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str165]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str165_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str166]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str166_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str167]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str167_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str168]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str168_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str169]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str169_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str170]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str170_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str171]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str171_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str172]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str172_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str173]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str173_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str174]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str174_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str175]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str175_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str176]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str176_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str177]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str177_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str178]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str178_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str179]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str179_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str180]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str180_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str181]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str181_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str182]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str182_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str183]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str183_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str184]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str184_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str185]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str185_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str186]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str186_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str187]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str187_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str188]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str188_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str189]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str189_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str190]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str190_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str191]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str191_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str192]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str192_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str193]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str193_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str194]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str194_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str195]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str195_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str196]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str196_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str197]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str197_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str198]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str198_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str199]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str199_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_str200]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_str200_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_dt010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_dt010_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_num010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_num010_LC(MCEventInfo info){
	}

	/**
	 * [RsltSml]パネルの[exec_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSml_exec_time_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_dat_id]の作成メソッド
	 */
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBizDatID(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0040.Prnt01")) {
			return new MB_MBBEL0040_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0040_Prnt01;

		/** コンストラクタ */
		protected MB_MBBEL0040_Prnt01Bridge() {
			p_MB_MBBEL0040_Prnt01 = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0100.RsltR.class));
			param.addDownBlock(mcframe.clientMBBE.MBBEP0100.RsltLblR.create());
			param.addDownBlock(mcframe.clientMBBE.MBBEP0100.RsltSmlR.create());

			p_MB_MBBEL0040_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0040_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0040_Prnt01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0100.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0100.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0100.RsltR>)down(0);
		}
		protected mcframe.clientMBBE.MBBEP0100.RsltLblR down1() {
			return (mcframe.clientMBBE.MBBEP0100.RsltLblR)down(1);
		}
		protected mcframe.clientMBBE.MBBEP0100.RsltSmlR down2() {
			return (mcframe.clientMBBE.MBBEP0100.RsltSmlR)down(2);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0040_Prnt01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0100.RsltR.class));
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0100.RsltLblR.create());
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0100.RsltSmlR.create());
		}
		protected MCParam param() {
			return p_MB_MBBEL0040_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0100.RsltR>)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(0));
			setRsltLblR((mcframe.clientMBBE.MBBEP0100.RsltLblR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(1));
			setRsltSmlR((mcframe.clientMBBE.MBBEP0100.RsltSmlR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getRsltL().clear();
			getRsltLblR().clear();
			getRsltSmlR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRsltLblR());
			result.add(getRsltSmlR());
			return result;
		}
	}
}