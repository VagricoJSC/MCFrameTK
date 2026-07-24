package mcframe.serverPFUD.PFUDL5030;

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
 * "PFUDL_SoapSendRecvLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_SoapSendRecvLogicBase_MC_A extends mcframe.serverPFUD.PFUDL5030.service.PFUDL_SoapSendBase {
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
	public static final String LOGIC_ID = "PFUDL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_SoapSendRecvLogicBase.ConvBase01 aConvBase01;

	protected void initConvBase01() {
		this.info = PDef.PF_PFUDL5030_ConvBase01_INFO;
		this.aConvBase01 = ((PFUDL_SoapSendRecvLogicBase)this).new ConvBase01();
	}

	public static PFUDL_SoapSendRecvLogicBase.ConvBase01 crtConvBase01() {
		PFUDL_SoapSendRecvLogicBase lgc = new PFUDL_SoapSendRecvLogicBase();
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

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ConvBase01オペレーション.<p>
	 *
	 */
	abstract public class ConvBase01 extends mcframe.serverPFUD.PFUDL5030.service.PFUDL_SoapSendBase.SoapSendBase implements mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv02 {
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
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> down0;
		
		
		// コンストラクタ
		protected ConvBase01() {
			
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
			invoke((PFUDL_SoapSendRecvLogicBase)PFUDL_SoapSendRecvLogicBase_MC_A.this);
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
			return ((PFUDL_SoapSendRecvLogicBase)PFUDL_SoapSendRecvLogicBase_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}