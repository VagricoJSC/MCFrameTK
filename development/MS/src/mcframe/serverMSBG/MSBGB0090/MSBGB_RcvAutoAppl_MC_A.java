package mcframe.serverMSBG.MSBGB0090;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBGB_RcvAutoAppl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGB_RcvAutoAppl_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGB0090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGB_RcvAutoAppl.RcvAutoAppl_Upd01 aRcvAutoAppl_Upd01;

	protected void initRcvAutoAppl_Upd01() {
		this.info = PDef.MS_MSBGB0090_RcvAutoAppl_Upd01_INFO;
		this.aRcvAutoAppl_Upd01 = ((MSBGB_RcvAutoAppl)this).new RcvAutoAppl_Upd01();
	}

	public static MSBGB_RcvAutoAppl.RcvAutoAppl_Upd01 crtRcvAutoAppl_Upd01() {
		MSBGB_RcvAutoAppl lgc = new MSBGB_RcvAutoAppl();
		lgc.initRcvAutoAppl_Upd01();
		return lgc.aRcvAutoAppl_Upd01;
	}

	protected void paramRcvAutoAppl_Upd01(MCParam p) {
		if (this.aRcvAutoAppl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doRcvAutoAppl_Upd01() {
		aRcvAutoAppl_Upd01.call();
	};
	protected MSBGB_RcvAutoAppl.RcvAutoAppl_Upd02 aRcvAutoAppl_Upd02;

	protected void initRcvAutoAppl_Upd02() {
		this.info = PDef.MS_MSBGB0090_RcvAutoAppl_Upd02_INFO;
		this.aRcvAutoAppl_Upd02 = ((MSBGB_RcvAutoAppl)this).new RcvAutoAppl_Upd02();
	}

	public static MSBGB_RcvAutoAppl.RcvAutoAppl_Upd02 crtRcvAutoAppl_Upd02() {
		MSBGB_RcvAutoAppl lgc = new MSBGB_RcvAutoAppl();
		lgc.initRcvAutoAppl_Upd02();
		return lgc.aRcvAutoAppl_Upd02;
	}

	protected void paramRcvAutoAppl_Upd02(MCParam p) {
		if (this.aRcvAutoAppl_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvAutoAppl_Upd02.up0());
		p.addDownBlock(aRcvAutoAppl_Upd02.down0());
	}

	protected void doRcvAutoAppl_Upd02() {
		aRcvAutoAppl_Upd02.call();
	};

	/**
	 * RcvAutoAppl_Upd02_Appl_BillDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR createRcvAutoAppl_Upd02_Appl_BillDR(){
		return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR.create();
	}

	/**
	 * RcvAutoAppl_Upd02_Appl_BillDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> createRcvAutoAppl_Upd02_Appl_BillDL(){
		return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR.class);
	}

	/**
	 * RcvAutoAppl_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR createRcvAutoAppl_Upd02_HdrR(){
		return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR.create();
	}

	/**
	 * RcvAutoAppl_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR createRcvAutoAppl_Upd02_DtlR(){
		return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR.create();
	}

	/**
	 * RcvAutoAppl_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> createRcvAutoAppl_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR.class);
	}

	/**
	 * RcvAutoAppl_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR createRcvAutoAppl_Upd02_CndR(){
		return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR.create();
	}

	/**
	 * RcvAutoAppl_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR> createRcvAutoAppl_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR.class);
	}

	/**
	 * RcvAutoAppl_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR createRcvAutoAppl_Upd02_RsltR(){
		return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR.create();
	}

	/**
	 * RcvAutoAppl_Upd02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR> createRcvAutoAppl_Upd02_RsltL(){
		return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcvAutoAppl_Upd01オペレーション.<p>
	 *
	 */
	abstract public class RcvAutoAppl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvAutoAppl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected RcvAutoAppl_Upd01() {
			
			// このオペレーションのコンテナ初期化

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGB_RcvAutoAppl)MSBGB_RcvAutoAppl_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGB_RcvAutoAppl)MSBGB_RcvAutoAppl_MC_A.this).info;
		}


	}
	/**
	 * RcvAutoAppl_Upd02オペレーション.<p>
	 *
	 */
	abstract public class RcvAutoAppl_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvAutoAppl_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR> down0;
		/** [RcvAutoAppl_Upd02_Appl_BillD]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> aRcvAutoAppl_Upd02_Appl_BillD;
		/** [RcvAutoAppl_Upd02_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> aRcvAutoAppl_Upd02_Dtl;
		/** [RcvAutoAppl_Upd02_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR aRcvAutoAppl_Upd02_Hdr;
		
		/**
		 * 連携情報 UPD02<p>
		 *
		 * 連携先 mcframe.serverMSBG.MSBGL5020.MSBGL_RcvActCmnService.RcvActCmn_Upd01 （{@link #c0}）<br>
		 */
		public final String UPD02 = "UPD02";

		/**
		 * 連携オペレーション c0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBG.MSBGL5020.MSBGL_RcvActCmnService.RcvActCmn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR&gt; （{@link #c0_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR&gt; （{@link #c0_up1}）<br>
		 */
		public final mcframe.serverMSBG.MSBGL5020.MSBGL_RcvActCmnService.RcvActCmn_Upd01 c0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> c0_up0;
		public final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> c0_up1;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RcvAutoAppl_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR.class);
			aRcvAutoAppl_Upd02_Appl_BillD = MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR.class);
			aRcvAutoAppl_Upd02_Dtl = MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR.class);
			aRcvAutoAppl_Upd02_Hdr = mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR.create();

			// 連携オペレーションの初期化
			c0 = mcframe.serverMSBG.MSBGL5020.MSBGL_RcvActCmnService.crtRcvActCmn_Upd01();
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR>)c0.up(2);
			c0_up1 = (MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR>)c0.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPD02, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPD02<br>
		 * aRcvAutoAppl_Upd02_Appl_BillD => MCList&lt;mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR&gt; （{@link #c0_up0}）<br>
		 * aRcvAutoAppl_Upd02_Dtl => MCList&lt;mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR&gt; （{@link #c0_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPD02)) {
				up_UPD02(c0_up0, c0_up1, aRcvAutoAppl_Upd02_Appl_BillD, aRcvAutoAppl_Upd02_Dtl);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPD02<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPD02)) {
				down_UPD02();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGB_RcvAutoAppl)MSBGB_RcvAutoAppl_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvAutoAppl_Upd02_Appl_BillDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR createRcvAutoAppl_Upd02_Appl_BillDR(){
			return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR.create();
		}

		/**
		 * RcvAutoAppl_Upd02_Appl_BillDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> createRcvAutoAppl_Upd02_Appl_BillDL(){
			return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR.class);
		}

		/**
		 * RcvAutoAppl_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR createRcvAutoAppl_Upd02_HdrR(){
			return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR.create();
		}

		/**
		 * RcvAutoAppl_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR createRcvAutoAppl_Upd02_DtlR(){
			return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR.create();
		}

		/**
		 * RcvAutoAppl_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> createRcvAutoAppl_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR.class);
		}

		/**
		 * RcvAutoAppl_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR createRcvAutoAppl_Upd02_CndR(){
			return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR.create();
		}

		/**
		 * RcvAutoAppl_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR> createRcvAutoAppl_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR.class);
		}

		/**
		 * RcvAutoAppl_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR createRcvAutoAppl_Upd02_RsltR(){
			return mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR.create();
		}

		/**
		 * RcvAutoAppl_Upd02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR> createRcvAutoAppl_Upd02_RsltL(){
			return MCList.create(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_cnt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_inc_comp_cnt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_over_cnt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_short_cnt</td></tr>
		 * 	<tr><td><br></td><td>not_appl_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_RsltR> down0() {
			return down0;
		}


		/**
		 * [RcvAutoAppl_Upd02_Appl_BillD]ブロックのコンテナaRcvAutoAppl_Upd02_Appl_BillDLを返します。
		 *
		 * @return RcvAutoAppl_Upd02_Appl_BillDL
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> RcvAutoAppl_Upd02_Appl_BillD() {
			return aRcvAutoAppl_Upd02_Appl_BillD;
		}

		/**
		 * [RcvAutoAppl_Upd02_Dtl]ブロックのコンテナaRcvAutoAppl_Upd02_DtlLを返します。
		 *
		 * @return RcvAutoAppl_Upd02_DtlL
		 */
		public MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> RcvAutoAppl_Upd02_Dtl() {
			return aRcvAutoAppl_Upd02_Dtl;
		}

		/**
		 * [RcvAutoAppl_Upd02_Hdr]ブロックのコンテナaRcvAutoAppl_Upd02_HdrRを返します。
		 *
		 * @return RcvAutoAppl_Upd02_HdrR
		 */
		public mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_HdrR RcvAutoAppl_Upd02_Hdr() {
			return aRcvAutoAppl_Upd02_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGB_RcvAutoAppl)MSBGB_RcvAutoAppl_MC_A.this).info;
		}

		//-----------------------UPD02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPD02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPD02(MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> dest0_0, MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> dest0_1, MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> src_RcvAutoAppl_Upd02_Appl_BillD, MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> src_RcvAutoAppl_Upd02_Dtl){
			up_UPD02_c0_0(dest0_0, src_RcvAutoAppl_Upd02_Appl_BillD);
			up_UPD02_c0_1(dest0_1, src_RcvAutoAppl_Upd02_Dtl);
		}
		
		/**
		 * 連携処理UPD02_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPD02_c0_0() {
			MCRowMapper map = new Map_up_UPD02_c0_0();
			return map;
		}

		/**
		 * 連携処理UPD02_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPD02_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("grp_seq", "grp_seq");
				addColumnPathMap("bill_d_no", "bill_d_no");
				addColumnPathMap("parent_bill_d_no", "parent_bill_d_no");
				addColumnPathMap("bill_mng_no", "bill_mng_no");
				addColumnPathMap("appl_amt", "appl_amt");
			}
		}

		/**
		 * 連携処理UPD02_c0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPD02_c0_0(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR r_dest, mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR r_src) {
		}

		/**
		 * 連携処理UPD02_c0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPD02_c0_0(MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> dest, MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR> src) {
			MCRowMapper _rm = createMap_up_UPD02_c0_0();
			for(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_Appl_BillDR r_src : src){
				mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPD02_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPD02_c0の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPD02_c0_1() {
			MCRowMapper map = new Map_up_UPD02_c0_1();
			return map;
		}

		/**
		 * 連携処理UPD02_c0の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPD02_c0_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("grp_seq", "grp_seq");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("bill_dpt_cd", "bill_dpt_cd");
				addColumnPathMap("ar_sttl_cd1", "ar_sttl_cd1");
				addColumnPathMap("ar_sttl_typ1", "ar_sttl_typ1");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("bill_mng_no", "bill_mng_no");
				addColumnPathMap("ar_typ", "ar_typ");
				addColumnPathMap("amt1", "amt1");
				addColumnPathMap("amt2", "amt2");
				addColumnPathMap("ar_appl_schd_no", "ar_appl_schd_no");
				addColumnPathMap("hdr_dtl_peg", "hdr_dtl_peg");
			}
		}

		/**
		 * 連携処理UPD02_c0の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPD02_c0_1(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR r_dest, mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR r_src) {
		}

		/**
		 * 連携処理UPD02_c0の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPD02_c0_1(MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> dest, MCList<mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPD02_c0_1();
			for(mcframe.serverMSBG.MSBGB0090.RcvAutoAppl_Upd02_DtlR r_src : src){
				mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPD02_c0_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPD02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPD02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPD02(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}