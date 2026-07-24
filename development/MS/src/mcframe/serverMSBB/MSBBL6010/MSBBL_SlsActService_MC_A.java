package mcframe.serverMSBB.MSBBL6010;

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
 * "MSBBL_SlsActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsActService_MC_A extends mcframe.serverMSBB.MSBBL9010.MSBBL_QtnSlsBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL6010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsActService.SlsAct_Upd01 aSlsAct_Upd01;

	protected void initSlsAct_Upd01() {
		this.info = PDef.MS_MSBBL6010_SlsAct_Upd01_INFO;
		this.aSlsAct_Upd01 = ((MSBBL_SlsActService)this).new SlsAct_Upd01();
	}

	public static MSBBL_SlsActService.SlsAct_Upd01 crtSlsAct_Upd01() {
		MSBBL_SlsActService lgc = new MSBBL_SlsActService();
		lgc.initSlsAct_Upd01();
		return lgc.aSlsAct_Upd01;
	}

	protected void paramSlsAct_Upd01(MCParam p) {
		if (this.aSlsAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAct_Upd01.up0());
		p.addUpBlock(aSlsAct_Upd01.up1());
		p.addUpBlock(aSlsAct_Upd01.up2());
		p.addUpBlock(aSlsAct_Upd01.up3());
		p.addDownBlock(aSlsAct_Upd01.down0());
		p.addDownBlock(aSlsAct_Upd01.down1());
		p.addDownBlock(aSlsAct_Upd01.down2());
	}

	protected void doSlsAct_Upd01() {
		aSlsAct_Upd01.call();
	};

	/**
	 * SlsAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR createSlsAct_Upd01_HdrR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.create();
	}

	/**
	 * SlsAct_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> createSlsAct_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
	}

	/**
	 * SlsAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR createSlsAct_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR.create();
	}

	/**
	 * SlsAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR> createSlsAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR.class);
	}

	/**
	 * SlsAct_Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR createSlsAct_Upd01_IoR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.create();
	}

	/**
	 * SlsAct_Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> createSlsAct_Upd01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
	}

	/**
	 * SlsAct_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR createSlsAct_Upd01_RsltR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR.create();
	}

	/**
	 * SlsAct_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR> createSlsAct_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR.class);
	}

	/**
	 * SlsAct_Upd01_Rslt_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR createSlsAct_Upd01_Rslt_DtlR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR.create();
	}

	/**
	 * SlsAct_Upd01_Rslt_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR> createSlsAct_Upd01_Rslt_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR.class);
	}

	/**
	 * SlsAct_Upd01_Rslt_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR createSlsAct_Upd01_Rslt_IoR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR.create();
	}

	/**
	 * SlsAct_Upd01_Rslt_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR> createSlsAct_Upd01_Rslt_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR.class);
	}

	/**
	 * SlsAct_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR createSlsAct_Upd01_CndR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR.create();
	}
	protected MSBBL_SlsActService.SlsAct_Upd02 aSlsAct_Upd02;

	protected void initSlsAct_Upd02() {
		this.info = PDef.MS_MSBBL6010_SlsAct_Upd02_INFO;
		this.aSlsAct_Upd02 = ((MSBBL_SlsActService)this).new SlsAct_Upd02();
	}

	public static MSBBL_SlsActService.SlsAct_Upd02 crtSlsAct_Upd02() {
		MSBBL_SlsActService lgc = new MSBBL_SlsActService();
		lgc.initSlsAct_Upd02();
		return lgc.aSlsAct_Upd02;
	}

	protected void paramSlsAct_Upd02(MCParam p) {
		if (this.aSlsAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAct_Upd02.up0());
	}

	protected void doSlsAct_Upd02() {
		aSlsAct_Upd02.call();
	};

	/**
	 * SlsAct_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR createSlsAct_Upd02_CndR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR.create();
	}

	/**
	 * SlsAct_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR> createSlsAct_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR.class);
	}

	/**
	 * SlsAct_Upd02_IvLブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR createSlsAct_Upd02_IvLR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.create();
	}

	/**
	 * SlsAct_Upd02_IvLブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> createSlsAct_Upd02_IvLL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);
	}

	/**
	 * SlsAct_Upd02_IoLブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR createSlsAct_Upd02_IoLR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.create();
	}

	/**
	 * SlsAct_Upd02_IoLブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> createSlsAct_Upd02_IoLL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
	}
	protected MSBBL_SlsActService.SlsAct_Upd03 aSlsAct_Upd03;

	protected void initSlsAct_Upd03() {
		this.info = PDef.MS_MSBBL6010_SlsAct_Upd03_INFO;
		this.aSlsAct_Upd03 = ((MSBBL_SlsActService)this).new SlsAct_Upd03();
	}

	public static MSBBL_SlsActService.SlsAct_Upd03 crtSlsAct_Upd03() {
		MSBBL_SlsActService lgc = new MSBBL_SlsActService();
		lgc.initSlsAct_Upd03();
		return lgc.aSlsAct_Upd03;
	}

	protected void paramSlsAct_Upd03(MCParam p) {
		if (this.aSlsAct_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAct_Upd03.up0());
	}

	protected void doSlsAct_Upd03() {
		aSlsAct_Upd03.call();
	};

	/**
	 * SlsAct_Upd03_AprvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR createSlsAct_Upd03_AprvR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR.create();
	}

	/**
	 * SlsAct_Upd03_AprvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR> createSlsAct_Upd03_AprvL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR.class);
	}
	protected MSBBL_SlsActService.SlsAct_Upd04 aSlsAct_Upd04;

	protected void initSlsAct_Upd04() {
		this.info = PDef.MS_MSBBL6010_SlsAct_Upd04_INFO;
		this.aSlsAct_Upd04 = ((MSBBL_SlsActService)this).new SlsAct_Upd04();
	}

	public static MSBBL_SlsActService.SlsAct_Upd04 crtSlsAct_Upd04() {
		MSBBL_SlsActService lgc = new MSBBL_SlsActService();
		lgc.initSlsAct_Upd04();
		return lgc.aSlsAct_Upd04;
	}

	protected void paramSlsAct_Upd04(MCParam p) {
		if (this.aSlsAct_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAct_Upd04.up0());
	}

	protected void doSlsAct_Upd04() {
		aSlsAct_Upd04.call();
	};

	/**
	 * SlsAct_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR createSlsAct_Upd04_DtlR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR.create();
	}

	/**
	 * SlsAct_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR> createSlsAct_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsAct_Upd01オペレーション.<p>
	 *
	 * 売上実績を登録する<br>
	 */
	abstract public class SlsAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR> down2;
		
		
		// コンストラクタ
		protected SlsAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
			up3 = mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * SlsAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR createSlsAct_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.create();
		}

		/**
		 * SlsAct_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> createSlsAct_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
		}

		/**
		 * SlsAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR createSlsAct_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR.create();
		}

		/**
		 * SlsAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR> createSlsAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR.class);
		}

		/**
		 * SlsAct_Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR createSlsAct_Upd01_IoR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.create();
		}

		/**
		 * SlsAct_Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> createSlsAct_Upd01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
		}

		/**
		 * SlsAct_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR createSlsAct_Upd01_RsltR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR.create();
		}

		/**
		 * SlsAct_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR> createSlsAct_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR.class);
		}

		/**
		 * SlsAct_Upd01_Rslt_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR createSlsAct_Upd01_Rslt_DtlR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR.create();
		}

		/**
		 * SlsAct_Upd01_Rslt_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR> createSlsAct_Upd01_Rslt_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR.class);
		}

		/**
		 * SlsAct_Upd01_Rslt_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR createSlsAct_Upd01_Rslt_IoR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR.create();
		}

		/**
		 * SlsAct_Upd01_Rslt_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR> createSlsAct_Upd01_Rslt_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR.class);
		}

		/**
		 * SlsAct_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR createSlsAct_Upd01_CndR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>del_all_sls_d_flg</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>adjst_tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_adjst_typ</td></tr>
		 * 	<tr><td><br></td><td>adjst_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_via_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_split_non_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>no_cred_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sret_trd_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_CndR up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_Rslt_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this).info;
		}


	}
	/**
	 * SlsAct_Upd02オペレーション.<p>
	 *
	 * 売上実績を登録する（出荷実績サービスより呼び出す）<br>
	 */
	abstract public class SlsAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR> up0;
		/** [SlsAct_Upd02_IoL]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> aSlsAct_Upd02_IoL;
		/** [SlsAct_Upd02_IvL]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> aSlsAct_Upd02_IvL;
		
		
		// コンストラクタ
		protected SlsAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR.class);
			aSlsAct_Upd02_IoL = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
			aSlsAct_Upd02_IvL = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);

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
			invoke((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAct_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR createSlsAct_Upd02_CndR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR.create();
		}

		/**
		 * SlsAct_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR> createSlsAct_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR.class);
		}

		/**
		 * SlsAct_Upd02_IvLブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR createSlsAct_Upd02_IvLR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.create();
		}

		/**
		 * SlsAct_Upd02_IvLブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> createSlsAct_Upd02_IvLL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);
		}

		/**
		 * SlsAct_Upd02_IoLブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR createSlsAct_Upd02_IoLR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.create();
		}

		/**
		 * SlsAct_Upd02_IoLブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> createSlsAct_Upd02_IoLL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>use_iv_ship_act_map</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_CndR> up0() {
			return up0;
		}



		/**
		 * [SlsAct_Upd02_IoL]ブロックのコンテナaSlsAct_Upd02_IoLLを返します。
		 *
		 * @return SlsAct_Upd02_IoLL
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> SlsAct_Upd02_IoL() {
			return aSlsAct_Upd02_IoL;
		}

		/**
		 * [SlsAct_Upd02_IvL]ブロックのコンテナaSlsAct_Upd02_IvLLを返します。
		 *
		 * @return SlsAct_Upd02_IvLL
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> SlsAct_Upd02_IvL() {
			return aSlsAct_Upd02_IvL;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this).info;
		}


	}
	/**
	 * SlsAct_Upd03オペレーション.<p>
	 *
	 * 売上値引で承認/承認取消された場合に、売上実績を承認/承認取消として更新する<br>
	 */
	abstract public class SlsAct_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAct_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR> up0;
		
		
		// コンストラクタ
		protected SlsAct_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR.class);

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
			invoke((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAct_Upd03_AprvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR createSlsAct_Upd03_AprvR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR.create();
		}

		/**
		 * SlsAct_Upd03_AprvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR> createSlsAct_Upd03_AprvL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this).info;
		}


	}
	/**
	 * SlsAct_Upd04オペレーション.<p>
	 *
	 * 請求繰越回数を更新する<br>
	 */
	abstract public class SlsAct_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAct_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsAct_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR.class);

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
			invoke((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAct_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR createSlsAct_Upd04_DtlR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR.create();
		}

		/**
		 * SlsAct_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR> createSlsAct_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActService)MSBBL_SlsActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}