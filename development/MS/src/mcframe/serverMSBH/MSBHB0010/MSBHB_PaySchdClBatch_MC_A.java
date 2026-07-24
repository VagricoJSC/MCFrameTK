package mcframe.serverMSBH.MSBHB0010;

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
 * "MSBHB_PaySchdClBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHB_PaySchdClBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHB_PaySchdClBatch.PaySchdClBatch_Upd01 aPaySchdClBatch_Upd01;

	protected void initPaySchdClBatch_Upd01() {
		this.info = PDef.MS_MSBHB0010_PaySchdClBatch_Upd01_INFO;
		this.aPaySchdClBatch_Upd01 = ((MSBHB_PaySchdClBatch)this).new PaySchdClBatch_Upd01();
	}

	public static MSBHB_PaySchdClBatch.PaySchdClBatch_Upd01 crtPaySchdClBatch_Upd01() {
		MSBHB_PaySchdClBatch lgc = new MSBHB_PaySchdClBatch();
		lgc.initPaySchdClBatch_Upd01();
		return lgc.aPaySchdClBatch_Upd01;
	}

	protected void paramPaySchdClBatch_Upd01(MCParam p) {
		if (this.aPaySchdClBatch_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchdClBatch_Upd01.up0());
	}

	protected void doPaySchdClBatch_Upd01() {
		aPaySchdClBatch_Upd01.call();
	};

	/**
	 * PaySchdClBatch_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR createPaySchdClBatch_CndR(){
		return mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR.create();
	}
	protected MSBHB_PaySchdClBatch.PaySchdClBatch_Upd02 aPaySchdClBatch_Upd02;

	protected void initPaySchdClBatch_Upd02() {
		this.info = PDef.MS_MSBHB0010_PaySchdClBatch_Upd02_INFO;
		this.aPaySchdClBatch_Upd02 = ((MSBHB_PaySchdClBatch)this).new PaySchdClBatch_Upd02();
	}

	public static MSBHB_PaySchdClBatch.PaySchdClBatch_Upd02 crtPaySchdClBatch_Upd02() {
		MSBHB_PaySchdClBatch lgc = new MSBHB_PaySchdClBatch();
		lgc.initPaySchdClBatch_Upd02();
		return lgc.aPaySchdClBatch_Upd02;
	}

	protected void paramPaySchdClBatch_Upd02(MCParam p) {
		if (this.aPaySchdClBatch_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchdClBatch_Upd02.up0());
		p.addDownBlock(aPaySchdClBatch_Upd02.down0());
	}

	protected void doPaySchdClBatch_Upd02() {
		aPaySchdClBatch_Upd02.call();
	};

	/**
	 * PaySchdClBatch_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR createPaySchdClBatch_RsltR(){
		return mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PaySchdClBatch_Upd01オペレーション.<p>
	 *
	 */
	abstract public class PaySchdClBatch_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchdClBatch_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR up0;
		
		
		// コンストラクタ
		protected PaySchdClBatch_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR.create();

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
			invoke((MSBHB_PaySchdClBatch)MSBHB_PaySchdClBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PaySchdClBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR createPaySchdClBatch_CndR(){
			return mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHB_PaySchdClBatch)MSBHB_PaySchdClBatch_MC_A.this).info;
		}


	}
	/**
	 * PaySchdClBatch_Upd02オペレーション.<p>
	 *
	 */
	abstract public class PaySchdClBatch_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchdClBatch_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR down0;
		
		
		// コンストラクタ
		protected PaySchdClBatch_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR.create();
			down0 = mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR.create();

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHB_PaySchdClBatch)MSBHB_PaySchdClBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchdClBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR createPaySchdClBatch_CndR(){
			return mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR.create();
		}

		/**
		 * PaySchdClBatch_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR createPaySchdClBatch_RsltR(){
			return mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_CndR up0() {
			return up0;
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
		 * @see mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR
		 */
		public mcframe.serverMSBH.MSBHB0010.PaySchdClBatch_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHB_PaySchdClBatch)MSBHB_PaySchdClBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}