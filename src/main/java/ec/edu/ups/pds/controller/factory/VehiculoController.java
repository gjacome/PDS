package ec.edu.ups.pds.controller.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.service.factory.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/vehiculo")
public class VehiculoController {
    @Autowired
    private IVehiculoService vehiculoService;

    @PostMapping
    public ResponseEntity guardar(@RequestBody VehiculoDTO vehiculoDTO) {
        try {
            vehiculoService.guardar(vehiculoDTO);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @GetMapping
    public ResponseEntity obtenerTodos() {
        try {
            return ResponseEntity.ok().body(vehiculoService.obtenerTodos());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
