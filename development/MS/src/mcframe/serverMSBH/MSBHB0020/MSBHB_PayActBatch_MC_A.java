package mcframe.serverMSBH.MSBHB0020;

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
 * "MSBHB_PayActBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHB_PayActBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHB_PayActBatch.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHB0020_Ins01_INFO;
		this.aIns01 = ((MSBHB_PayActBatch)this).new Ins01();
	}

	public static MSBHB_PayActBatch.Ins01 crtIns01() {
		MSBHB_PayActBatch lgc = new MSBHB_PayActBatch();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0020.Ins01_CndR createIns01_CndR(){
		return mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();
	}
	protected MSBHB_PayActBatch.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MS_MSBHB0020_Ins02_INFO;
		this.aIns02 = ((MSBHB_PayActBatch)this).new Ins02();
	}

	public static MSBHB_PayActBatch.Ins02 crtIns02() {
		MSBHB_PayActBatch lgc = new MSBHB_PayActBatch();
		lgc.initIns02();
		return lgc.aIns02;
	}

	protected void paramIns02(MCParam p) {
		if (this.aIns02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns02.up0());
		p.addUpBlock(aIns02.up1());
		p.addDownBlock(aIns02.down0());
	}

	protected void doIns02() {
		aIns02.call();
	};

	/**
	 * Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0020.Ins01_CndR createIns02_CndR(){
		return mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();
	}

	/**
	 * Ins02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0020.Ins02_DtlR createIns02_DtlR(){
		return mcframe.serverMSBH.MSBHB0020.Ins02_DtlR.create();
	}

	/**
	 * Ins02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_DtlR> createIns02_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_DtlR.class);
	}

	/**
	 * Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0020.Ins02_RsltR createIns02_RsltR(){
		return mcframe.serverMSBH.MSBHB0020.Ins02_RsltR.create();
	}

	/**
	 * Ins02_PaySchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR createIns02_PaySchdR(){
		return mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR.create();
	}

	/**
	 * Ins02_PaySchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR> createIns02_PaySchdL(){
		return MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績計上バッチのメイン処理<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0020.Ins01_CndR up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHB_PayActBatch)MSBHB_PayActBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins01_CndR createIns01_CndR(){
			return mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_pay_schd_dt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHB0020.Ins01_CndR
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHB_PayActBatch)MSBHB_PayActBatch_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 支払予定に対して支払実績を登録する<br>
	 */
	abstract public class Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0020.Ins01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHB0020.Ins02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0020.Ins02_RsltR down0;
		/** [Ins02_PaySchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR> aIns02_PaySchd;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_DtlR.class);
			down0 = mcframe.serverMSBH.MSBHB0020.Ins02_RsltR.create();
			aIns02_PaySchd = MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR.class);

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
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHB_PayActBatch)MSBHB_PayActBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins01_CndR createIns02_CndR(){
			return mcframe.serverMSBH.MSBHB0020.Ins01_CndR.create();
		}

		/**
		 * Ins02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins02_DtlR createIns02_DtlR(){
			return mcframe.serverMSBH.MSBHB0020.Ins02_DtlR.create();
		}

		/**
		 * Ins02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_DtlR> createIns02_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_DtlR.class);
		}

		/**
		 * Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins02_RsltR createIns02_RsltR(){
			return mcframe.serverMSBH.MSBHB0020.Ins02_RsltR.create();
		}

		/**
		 * Ins02_PaySchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR createIns02_PaySchdR(){
			return mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR.create();
		}

		/**
		 * Ins02_PaySchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR> createIns02_PaySchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_pay_schd_dt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHB0020.Ins01_CndR
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHB0020.Ins02_RsltR
		 */
		public mcframe.serverMSBH.MSBHB0020.Ins02_RsltR down0() {
			return down0;
		}


		/**
		 * [Ins02_PaySchd]ブロックのコンテナaIns02_PaySchdLを返します。
		 *
		 * @return Ins02_PaySchdL
		 */
		public MCList<mcframe.serverMSBH.MSBHB0020.Ins02_PaySchdR> Ins02_PaySchd() {
			return aIns02_PaySchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHB_PayActBatch)MSBHB_PayActBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}