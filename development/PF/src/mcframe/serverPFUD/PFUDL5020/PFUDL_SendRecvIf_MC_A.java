package mcframe.serverPFUD.PFUDL5020;

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
 * "PFUDL_SendRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_SendRecvIf_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
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
	public static final String LOGIC_ID = "PFUDL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_SendRecvIf.Conv01 aConv01;

	protected void initConv01() {
		this.info = PDef.PF_PFUDL5020_Conv01_INFO;
		this.aConv01 = ((PFUDL_SendRecvIf)this).new Conv01();
	}

	public static PFUDL_SendRecvIf.Conv01 crtConv01() {
		PFUDL_SendRecvIf lgc = new PFUDL_SendRecvIf();
		lgc.initConv01();
		return lgc.aConv01;
	}

	protected void paramConv01(MCParam p) {
		if (this.aConv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConv01.up0());
		p.addDownBlock(aConv01.down0());
	}

	protected void doConv01() {
		aConv01.call();
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
	protected PFUDL_SendRecvIf.Conv02 aConv02;

	protected void initConv02() {
		this.info = PDef.PF_PFUDL5020_Conv02_INFO;
		this.aConv02 = ((PFUDL_SendRecvIf)this).new Conv02();
	}

	public static PFUDL_SendRecvIf.Conv02 crtConv02() {
		PFUDL_SendRecvIf lgc = new PFUDL_SendRecvIf();
		lgc.initConv02();
		return lgc.aConv02;
	}

	protected void paramConv02(MCParam p) {
		if (this.aConv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConv02.up0());
		p.addDownBlock(aConv02.down0());
	}

	protected void doConv02() {
		aConv02.call();
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
	protected PFUDL_SendRecvIf.Conv03 aConv03;

	protected void initConv03() {
		this.info = PDef.PF_PFUDL5020_Conv03_INFO;
		this.aConv03 = ((PFUDL_SendRecvIf)this).new Conv03();
	}

	public static PFUDL_SendRecvIf.Conv03 crtConv03() {
		PFUDL_SendRecvIf lgc = new PFUDL_SendRecvIf();
		lgc.initConv03();
		return lgc.aConv03;
	}

	protected void paramConv03(MCParam p) {
		if (this.aConv03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConv03.up0());
		p.addDownBlock(aConv03.down0());
	}

	protected void doConv03() {
		aConv03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Conv01オペレーション.<p>
	 *
	 */
	abstract public class Conv01 extends MCOperation implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> down0;
		
		
		// コンストラクタ
		protected Conv01() {
			
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
			invoke((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this);
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
			return ((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this).info;
		}


	}
	/**
	 * Conv02オペレーション.<p>
	 *
	 */
	abstract public class Conv02 extends MCOperation implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected Conv02() {
			
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
			invoke((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this);
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
			return ((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this).info;
		}


	}
	/**
	 * Conv03オペレーション.<p>
	 *
	 */
	abstract public class Conv03 extends MCOperation implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Conv03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected Conv03() {
			
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
			invoke((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this);
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
			return ((PFUDL_SendRecvIf)PFUDL_SendRecvIf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}