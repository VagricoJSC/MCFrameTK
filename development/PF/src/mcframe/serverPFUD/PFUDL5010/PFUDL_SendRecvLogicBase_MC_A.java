package mcframe.serverPFUD.PFUDL5010;

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
 * "PFUDL_SendRecvLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_SendRecvLogicBase_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFUDL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_SendRecvLogicBase.ConvBase01 aConvBase01;

	protected void initConvBase01() {
		this.info = PDef.PF_PFUDL5010_ConvBase01_INFO;
		this.aConvBase01 = ((PFUDL_SendRecvLogicBase)this).new ConvBase01();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase01 crtConvBase01() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase01();
		return lgc.aConvBase01;
	}

	protected void paramConvBase01(MCParam p) {
		if (this.aConvBase01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase01.up0());
		p.addDownBlock(aConvBase01.down0());
	}

	protected void doConvBase01() {
		aConvBase01.call();
	};

	/**
	 * ConvDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL5020.ConvDtlR createConvDtlR(){
		return mcframe.serverPFUD.PFUDL5020.ConvDtlR.create();
	}

	/**
	 * ConvDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> createConvDtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL5020.ConvDtlR.class);
	}
	protected PFUDL_SendRecvLogicBase.ConvBase02 aConvBase02;

	protected void initConvBase02() {
		this.info = PDef.PF_PFUDL5010_ConvBase02_INFO;
		this.aConvBase02 = ((PFUDL_SendRecvLogicBase)this).new ConvBase02();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase02 crtConvBase02() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase02();
		return lgc.aConvBase02;
	}

	protected void paramConvBase02(MCParam p) {
		if (this.aConvBase02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase02.up0());
		p.addDownBlock(aConvBase02.down0());
	}

	protected void doConvBase02() {
		aConvBase02.call();
	};

	/**
	 * SdrvDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
		return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
	}

	/**
	 * SdrvDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
	}
	protected PFUDL_SendRecvLogicBase.ConvBase03 aConvBase03;

	protected void initConvBase03() {
		this.info = PDef.PF_PFUDL5010_ConvBase03_INFO;
		this.aConvBase03 = ((PFUDL_SendRecvLogicBase)this).new ConvBase03();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase03 crtConvBase03() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase03();
		return lgc.aConvBase03;
	}

	protected void paramConvBase03(MCParam p) {
		if (this.aConvBase03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase03.up0());
		p.addDownBlock(aConvBase03.down0());
	}

	protected void doConvBase03() {
		aConvBase03.call();
	};
	protected PFUDL_SendRecvLogicBase.ConvBase04 aConvBase04;

	protected void initConvBase04() {
		this.info = PDef.PF_PFUDL5010_ConvBase04_INFO;
		this.aConvBase04 = ((PFUDL_SendRecvLogicBase)this).new ConvBase04();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase04 crtConvBase04() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase04();
		return lgc.aConvBase04;
	}

	protected void paramConvBase04(MCParam p) {
		if (this.aConvBase04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase04.up0());
		p.addDownBlock(aConvBase04.down0());
	}

	protected void doConvBase04() {
		aConvBase04.call();
	};
	protected PFUDL_SendRecvLogicBase.ConvBase05 aConvBase05;

	protected void initConvBase05() {
		this.info = PDef.PF_PFUDL5010_ConvBase05_INFO;
		this.aConvBase05 = ((PFUDL_SendRecvLogicBase)this).new ConvBase05();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase05 crtConvBase05() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase05();
		return lgc.aConvBase05;
	}

	protected void paramConvBase05(MCParam p) {
		if (this.aConvBase05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase05.up0());
		p.addDownBlock(aConvBase05.down0());
	}

	protected void doConvBase05() {
		aConvBase05.call();
	};
	protected PFUDL_SendRecvLogicBase.ConvBase06 aConvBase06;

	protected void initConvBase06() {
		this.info = PDef.PF_PFUDL5010_ConvBase06_INFO;
		this.aConvBase06 = ((PFUDL_SendRecvLogicBase)this).new ConvBase06();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase06 crtConvBase06() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase06();
		return lgc.aConvBase06;
	}

	protected void paramConvBase06(MCParam p) {
		if (this.aConvBase06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase06.up0());
		p.addDownBlock(aConvBase06.down0());
	}

	protected void doConvBase06() {
		aConvBase06.call();
	};
	protected PFUDL_SendRecvLogicBase.ConvBase07 aConvBase07;

	protected void initConvBase07() {
		this.info = PDef.PF_PFUDL5010_ConvBase07_INFO;
		this.aConvBase07 = ((PFUDL_SendRecvLogicBase)this).new ConvBase07();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase07 crtConvBase07() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase07();
		return lgc.aConvBase07;
	}

	protected void paramConvBase07(MCParam p) {
		if (this.aConvBase07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase07.up0());
		p.addDownBlock(aConvBase07.down0());
	}

	protected void doConvBase07() {
		aConvBase07.call();
	};
	protected PFUDL_SendRecvLogicBase.ConvBase08 aConvBase08;

	protected void initConvBase08() {
		this.info = PDef.PF_PFUDL5010_ConvBase08_INFO;
		this.aConvBase08 = ((PFUDL_SendRecvLogicBase)this).new ConvBase08();
	}

	public static PFUDL_SendRecvLogicBase.ConvBase08 crtConvBase08() {
		PFUDL_SendRecvLogicBase lgc = new PFUDL_SendRecvLogicBase();
		lgc.initConvBase08();
		return lgc.aConvBase08;
	}

	protected void paramConvBase08(MCParam p) {
		if (this.aConvBase08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvBase08.up0());
		p.addDownBlock(aConvBase08.down0());
	}

	protected void doConvBase08() {
		aConvBase08.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ConvBase01オペレーション.<p>
	 *
	 */
	abstract public class ConvBase01 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.ConvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.ConvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ConvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.ConvDtlR createConvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.ConvDtlR.create();
		}

		/**
		 * ConvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> createConvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.ConvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase02オペレーション.<p>
	 *
	 */
	abstract public class ConvBase02 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase03オペレーション.<p>
	 *
	 */
	abstract public class ConvBase03 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char6</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char7</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char8</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char9</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char10</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase04オペレーション.<p>
	 *
	 */
	abstract public class ConvBase04 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * 	<tr><td><br></td><td>not_coopr_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char6</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char7</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char8</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char9</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char10</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>if_ins_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase05オペレーション.<p>
	 *
	 */
	abstract public class ConvBase05 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase06オペレーション.<p>
	 *
	 */
	abstract public class ConvBase06 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * 	<tr><td><br></td><td>not_coopr_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char6</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char7</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char8</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char9</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char10</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>if_ins_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase07オペレーション.<p>
	 *
	 */
	abstract public class ConvBase07 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase07() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}
	/**
	 * ConvBase08オペレーション.<p>
	 *
	 */
	abstract public class ConvBase08 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvBase08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase08() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
			down0 = MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);

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
			invoke((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SdrvDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5020.SdrvDtlR createSdrvDtlR(){
			return mcframe.serverPFUD.PFUDL5020.SdrvDtlR.create();
		}

		/**
		 * SdrvDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> createSdrvDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL5020.SdrvDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_SendRecvLogicBase)PFUDL_SendRecvLogicBase_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}