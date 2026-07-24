package mcframe.serverMSBC.MSBCL6090;

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
 * "MSBCL_MfgRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgRptService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgRptService.MfgRpt_Prnt01 aMfgRpt_Prnt01;

	protected void initMfgRpt_Prnt01() {
		this.info = PDef.MS_MSBCL6090_MfgRpt_Prnt01_INFO;
		this.aMfgRpt_Prnt01 = ((MSBCL_MfgRptService)this).new MfgRpt_Prnt01();
	}

	public static MSBCL_MfgRptService.MfgRpt_Prnt01 crtMfgRpt_Prnt01() {
		MSBCL_MfgRptService lgc = new MSBCL_MfgRptService();
		lgc.initMfgRpt_Prnt01();
		return lgc.aMfgRpt_Prnt01;
	}

	protected void paramMfgRpt_Prnt01(MCParam p) {
		if (this.aMfgRpt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgRpt_Prnt01.up0());
		p.addDownBlock(aMfgRpt_Prnt01.down0());
	}

	protected void doMfgRpt_Prnt01() {
		aMfgRpt_Prnt01.call();
	};

	/**
	 * MfgRpt_Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR createMfgRpt_Prnt01_DtlR(){
		return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.create();
	}

	/**
	 * MfgRpt_Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> createMfgRpt_Prnt01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.class);
	}
	protected MSBCL_MfgRptService.MfgRpt_Prnt02 aMfgRpt_Prnt02;

	protected void initMfgRpt_Prnt02() {
		this.info = PDef.MS_MSBCL6090_MfgRpt_Prnt02_INFO;
		this.aMfgRpt_Prnt02 = ((MSBCL_MfgRptService)this).new MfgRpt_Prnt02();
	}

	public static MSBCL_MfgRptService.MfgRpt_Prnt02 crtMfgRpt_Prnt02() {
		MSBCL_MfgRptService lgc = new MSBCL_MfgRptService();
		lgc.initMfgRpt_Prnt02();
		return lgc.aMfgRpt_Prnt02;
	}

	protected void paramMfgRpt_Prnt02(MCParam p) {
		if (this.aMfgRpt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgRpt_Prnt02.up0());
		p.addDownBlock(aMfgRpt_Prnt02.down0());
	}

	protected void doMfgRpt_Prnt02() {
		aMfgRpt_Prnt02.call();
	};

	/**
	 * MfgRpt_Prnt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR createMfgRpt_Prnt02_DtlR(){
		return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.create();
	}

	/**
	 * MfgRpt_Prnt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> createMfgRpt_Prnt02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.class);
	}
	protected MSBCL_MfgRptService.MfgRpt_Prnt03 aMfgRpt_Prnt03;

	protected void initMfgRpt_Prnt03() {
		this.info = PDef.MS_MSBCL6090_MfgRpt_Prnt03_INFO;
		this.aMfgRpt_Prnt03 = ((MSBCL_MfgRptService)this).new MfgRpt_Prnt03();
	}

	public static MSBCL_MfgRptService.MfgRpt_Prnt03 crtMfgRpt_Prnt03() {
		MSBCL_MfgRptService lgc = new MSBCL_MfgRptService();
		lgc.initMfgRpt_Prnt03();
		return lgc.aMfgRpt_Prnt03;
	}

	protected void paramMfgRpt_Prnt03(MCParam p) {
		if (this.aMfgRpt_Prnt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgRpt_Prnt03.up0());
		p.addDownBlock(aMfgRpt_Prnt03.down0());
	}

	protected void doMfgRpt_Prnt03() {
		aMfgRpt_Prnt03.call();
	};

	/**
	 * MfgRpt_Prnt03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR createMfgRpt_Prnt03_DtlR(){
		return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.create();
	}

	/**
	 * MfgRpt_Prnt03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> createMfgRpt_Prnt03_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgRpt_Prnt01オペレーション.<p>
	 *
	 * 製造指図書を発行する。<br>
	 */
	abstract public class MfgRpt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgRpt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgRpt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.class);

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
			invoke((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgRpt_Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR createMfgRpt_Prnt01_DtlR(){
			return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.create();
		}

		/**
		 * MfgRpt_Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> createMfgRpt_Prnt01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this).info;
		}


	}
	/**
	 * MfgRpt_Prnt02オペレーション.<p>
	 *
	 * 製造記録書を発行する。<br>
	 */
	abstract public class MfgRpt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgRpt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgRpt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.class);

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
			invoke((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgRpt_Prnt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR createMfgRpt_Prnt02_DtlR(){
			return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.create();
		}

		/**
		 * MfgRpt_Prnt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> createMfgRpt_Prnt02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this).info;
		}


	}
	/**
	 * MfgRpt_Prnt03オペレーション.<p>
	 *
	 * 工程・ＢＯＭマスタ変更リストを発行する。<br>
	 */
	abstract public class MfgRpt_Prnt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgRpt_Prnt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgRpt_Prnt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.class);

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
			invoke((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgRpt_Prnt03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR createMfgRpt_Prnt03_DtlR(){
			return mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.create();
		}

		/**
		 * MfgRpt_Prnt03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> createMfgRpt_Prnt03_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6090.MfgRpt_Prnt03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgRptService)MSBCL_MfgRptService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}