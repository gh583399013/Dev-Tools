package commons.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author mask
 * @date 2017/10/19 18:02
 * @desc
 */
public class IOServiceImpl implements IOService {
    @Override
    public void simpleRWString() throws IOException {
        System.out.println("读取文件行 start.....");
        List<String> list = FileUtils.readLines(new File("d://baimingdan.txt"));

        for (int i = 0; i < list.size(); i++) {
            String sku = list.get(i);
            System.out.println("读取:第" + i + "行内容为: " + sku);
        }
        System.out.println("读取文件行 end.....");
    }
}
